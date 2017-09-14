package jindent.customizer.xml;

import java.io.InputStream;
import java.util.StringTokenizer;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.SettingsUtils;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTreeNode;
import jindent.customizer.constraint.ConstraintRule;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.AboutGUIObject;
import jindent.customizer.gui.elements.GUIBlankLine;
import jindent.customizer.gui.elements.GUILabel;
import jindent.customizer.gui.elements.GUITab;
import jindent.customizer.gui.elements.GUIText;
import jindent.customizer.gui.elements.ImportExportGUIObject;
import jindent.customizer.gui.elements.JTidyInfoGUIObject;
import jindent.customizer.gui.elements.RegistrationGUIObject;
import jindent.customizer.gui.settings.AbsoluteRelativeINumberGUIObject;
import jindent.customizer.gui.settings.BAWrappingGUIObject;
import jindent.customizer.gui.settings.BooleanGUIObject;
import jindent.customizer.gui.settings.BracesGUIObject;
import jindent.customizer.gui.settings.DateFormatGUIObject;
import jindent.customizer.gui.settings.DocTypeGUIObject;
import jindent.customizer.gui.settings.EncodingGUIObject;
import jindent.customizer.gui.settings.EndOfLineFormatGUIObject;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject;
import jindent.customizer.gui.settings.FooterGUIObject;
import jindent.customizer.gui.settings.HeaderGUIObject;
import jindent.customizer.gui.settings.INumberGUIObject;
import jindent.customizer.gui.settings.IndentationGUIObject;
import jindent.customizer.gui.settings.LineWrappingPolicyGUIObject;
import jindent.customizer.gui.settings.LogFileGUIObject;
import jindent.customizer.gui.settings.MessageReportGUIObject;
import jindent.customizer.gui.settings.NZNumberGUIObject;
import jindent.customizer.gui.settings.NumberGUIObject;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject;
import jindent.customizer.gui.settings.PositionGUIObject;
import jindent.customizer.gui.settings.PreProcessorIndentationGUIObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.SorterGUIObject;
import jindent.customizer.gui.settings.StringArrayGUIObject;
import jindent.customizer.gui.settings.StringGUIObject;
import jindent.customizer.gui.settings.SystemVariablesGUIObject;
import jindent.customizer.gui.settings.UserVariablesGUIObject;
import jindent.customizer.gui.settings.WrappingGUIObject;
import jindent.customizer.preview.PreviewFilter;
import jindent.customizer.preview.PreviewFilterList;
import jindent.formatter.Context;
import jindent.settings.AbsoluteRelativeINumberSetting;
import jindent.settings.BAWrappingSetting;
import jindent.settings.BooleanSetting;
import jindent.settings.BracesSetting;
import jindent.settings.DateFormatSetting;
import jindent.settings.DocTypeSetting;
import jindent.settings.EncodingSetting;
import jindent.settings.EndOfLineFormatSetting;
import jindent.settings.ExtensionManagerSetting;
import jindent.settings.FooterSetting;
import jindent.settings.HeaderSetting;
import jindent.settings.INumberSetting;
import jindent.settings.IndentationSetting;
import jindent.settings.LineWrappingPolicySetting;
import jindent.settings.LogFileSetting;
import jindent.settings.MessageReportSetting;
import jindent.settings.NZNumberSetting;
import jindent.settings.NumberSetting;
import jindent.settings.PackageListOfRegExSetting;
import jindent.settings.PositionSetting;
import jindent.settings.PreProcessorIndentationSetting;
import jindent.settings.Setting;
import jindent.settings.SorterSetting;
import jindent.settings.StringArraySetting;
import jindent.settings.StringSetting;
import jindent.settings.SystemVariablesSetting;
import jindent.settings.UserVariablesSetting;
import jindent.settings.WrappingSetting;
import jindent.settings.sorter.SorterElement;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomizerDataFactory extends DefaultHandler {
   public static final int DEFAULT_NODES = 0;
   public static final int IMPORT_EXPORT_NODE = 1;
   public static final String SETTINGS_FILENAME = "settings.xml";
   public static CustomizerData customizerData = null;
   public static JindentSettings settings = null;
   private CustomizerTreeNode a = null;
   private GUITab b = null;
   private GUIObject c = null;
   private String d = null;
   private ConstraintRule e = null;
   private static final String f = "?[t\u0011%1G}\u000088Os\u0004";
   private static final String g = "2Ac\u0000";
   private static final String h = "(Aw\f)";
   private static final String i = ",\\b\u0003#$";
   private static final String j = "(Oe";
   private static final String k = "4Gc\u0001/2";
   private static final String l = "(\\r\u0000";
   private static final String m = "?Ai\u0016>.On\u000b>";
   private static final String n = "/Ks\u0011#2I";
   private static final String o = "9Bb\b/2Z";
   private static final String p = ">Bf\u000b!0Gi\u0000";
   private static final String q = "0Oe\u0000&";
   private static final String r = "2Oj\u0000";
   private static final String s = "(Ww\u0000";
   private static final String t = "5@w\u0010>(Ww\u0000";
   private static final String u = "8Kt\u0006";
   private static final String v = "params";
   private static final String w = ",\\b\u0013#9Y";
   private static final String x = ":Gk\u0011/.]";
   private static final String y = "*Ku\u0016#3@";
   private static final String z = "/\\d";
   private static final String A = "dest";
   private static final String B = ".[k\u0000";
   private static final String C = "?Ai\u0006+(Ki\u0004>5Ai";
   private static final String D = "9@f\u0007&9";
   private static final String E = "disable";
   private static final String F = "=@c";
   private static final String G = "or";
   private static final String H = ":Au\b+(Zn\u000b-";
   private static final String I = "\u0012aX+\u000f\u000bqU*\u001d";
   private static final String J = "/Zu\f$;";
   private static final String K = "(K\u007f\u0011";
   private static final String L = "4Kf\u0001/.";
   private static final String M = "8Ad\u00113,K";
   private static final String N = "5@c\u0000$(Os\f%2";
   private static final String O = ",\\b\u001583Mb\u001693\\N\u000b.9@s\u0004>5Ai";
   private static final String P = ":Ah\u0011/.";
   private static final String Q = ",At\f>5Ai";
   private static final String R = "8Os\u0000";
   private static final String S = "2Ti\u0010\'>Ku";
   private static final String T = "5@r\b(9\\";
   private static final String U = "=Lt\n&)Zb7/0Os\f<9gI\u0010\'>Ku";
   private static final String V = ">Ah\t/=@";
   private static final String W = "2[j\u0007/.";
   private static final String X = ">\\f\u0006//";
   private static final String Y = "0A`\u0003#0K";
   private static final String Z = "+\\f\u0015:5@`";
   private static final String ba = ">Op\u0017+,^n\u000b-";
   private static final String bb = "0Gi\u0000\u001d.Ow\u0015#2IW\n&5M~";
   private static final String bc = "/Au\u0011/.";
   private static final String bd = "/Wt\u0011/1xf\u0017#=Lk\u00009";
   private static final String be = ")]b\u0017\u001c=\\n\u0004(0Kt";
   private static final String bf = "9@c*,\u0010Gi\u0000\f3\\j\u0004>";
   private static final String bg = "9@d\n.5@`";
   private static final String bh = "9Vs\u0000$/Gh\u000b\u0007=@f\u0002/.";
   private static final String bi = "=Lh\u0010>";
   private static final String bj = "1Kt\u0016+;KU\u0000:3\\s";
   private static final String bk = ".K`\f9(\\f\u0011#3@";
   private static final String bl = "6Zn\u000135@a\n";
   private static final String bm = ",Od\u000e+;KK\f9(aa7/;[k\u00048\u0019Vw\u0017//]n\n$/";
   private StringBuffer bn = new StringBuffer();
   private int bo;
   // $FF: synthetic field
   static Class bp;

   private CustomizerDataFactory() {
      customizerData = new CustomizerData();
      settings = new JindentSettings();
      this.bo = 0;
   }

   public static CustomizerData newCustomizerDataInstance() {
      return newCustomizerDataInstance(0);
   }

   public static CustomizerData newCustomizerDataInstance(int var0) {
      CustomizerDataFactory var1 = new CustomizerDataFactory();
      SAXParserFactory var2 = SAXParserFactory.newInstance();

      try {
         SAXParser var3 = var2.newSAXParser();
         jindent.debugger.a.b(a("\u000eKf\u0001#2I\'\u0016/(Zn\u000b-/\u000ea\u0017%1\u000e\u007f\b&|Hn\t/f\u000et\u0000>(Gi\u00029rVj\t"));
         InputStream var4 = (bp == null?(bp = class$(a("6Gi\u0001/2Z)\u0006?/Zh\b#&KuK21B)&?/Zh\b#&Ku!+(OA\u0004)(Au\u001c"))):bp).getResourceAsStream("settings.xml");
         var3.parse(var4, var1);
      } catch (SAXParseException var5) {
         System.err.println(a("\u0007Bn\u000b/f\u000e") + var5.getLineNumber() + a("p\u000ed\n&f\u000e") + var5.getColumnNumber() + a("\u0001\u0014\'") + var5.getLocalizedMessage());
      } catch (Throwable var6) {
         var6.printStackTrace();
      }

      CustomizerTreeNode var7 = customizerData.getRoot();
      if((var0 & 1) != 0) {
         addImportExportNode(var7);
      }

      return customizerData;
   }

   private static void addImportExportNode(CustomizerTreeNode var0) {
      CustomizerTreeNode var1 = new CustomizerTreeNode(a("\u0015Cw\n8(\u0001B\u001d:3\\s"), a("5Cw\n8(k\u007f\u0015%.Z"));
      GUITab var2 = new GUITab(a("\u0015Cw\n8(\u0001B\u001d:3\\s"), (String)null, (PreviewFilterList)null, (GUIObject)null);
      GUILabel var3 = new GUILabel();
      var3.setDesc(a("\u0015Cw\n8(\u0001B\u001d:3\\sE\u00199Zs\f$;]"));
      ImportExportGUIObject var4 = new ImportExportGUIObject(a("5Cw\n8(k\u007f\u0015%.Z)\f\',Au\u0011\u000f$^h\u0017>\u000fKs\u0011#2It"), a("\u0015Cw\n8(\u0001B\u001d:3\\sE\u00199Zs\f$;]\'\u000383C(\u0011%|hn\t/"));
      var2.addGUIObject(var3);
      var2.addGUIObject(var4);
      var1.addTab(var2);
      var0.insert(var1, 1);
   }

   public static JindentSettings getDummySettings() {
      if(settings == null) {
         CustomizerDataFactory var0 = new CustomizerDataFactory();
         SAXParserFactory var1 = SAXParserFactory.newInstance();

         try {
            SAXParser var2 = var1.newSAXParser();
            jindent.debugger.a.b(a("\u000eKf\u0001#2I\'\u0016/(Zn\u000b-/\u000ea\u0017%1\u000e\u007f\b&|Hn\t/f\u000et\u0000>(Gi\u00029rVj\t"));
            InputStream var3 = (bp == null?(bp = class$(a("6Gi\u0001/2Z)\u0006?/Zh\b#&KuK21B)&?/Zh\b#&Ku!+(OA\u0004)(Au\u001c"))):bp).getResourceAsStream("settings.xml");
            var2.parse(var3, var0);
         } catch (Throwable var4) {
            var4.printStackTrace();
         }
      }

      return settings;
   }

   public void startDocument() throws SAXException {
   }

   public void endDocument() throws SAXException {
   }

   private String getAttributeValue(Attributes var1, String var2) {
      if(var1 != null) {
         for(int var3 = 0; var3 < var1.getLength(); ++var3) {
            String var4 = var1.getLocalName(var3);
            if("".equals(var4)) {
               var4 = var1.getQName(var3);
            }

            if(var4.equals(var2)) {
               return var1.getValue(var3);
            }
         }
      }

      return null;
   }

   public void startElement(String var1, String var2, String var3, Attributes var4) throws SAXException {
      try {
         String var5 = var2;
         if("".equals(var2)) {
            var5 = var3;
         }

         String var6;
         if(var5.equals(a("?[t\u0011%1G}\u000088Os\u0004"))) {
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            this.a = new CustomizerTreeNode(var6, SettingsUtils.createSettingKey(this.d, var6));
            customizerData.setRoot(this.a);
         }

         if(var5.equals(a("0Oe\u0000&"))) {
            if(this.b == null) {
               this.b = this.a.getLastTab();
            }

            if(this.b == null) {
               System.err.println(a("(OeEwa\u000ei\u0010&0"));
            }

            this.c = new GUILabel();
            this.b.addGUIObject(this.c);
         }

         if(var5.equals(a("(K\u007f\u0011"))) {
            if(this.b == null) {
               this.b = this.a.getLastTab();
            }

            if(this.b == null) {
               System.err.println(a("(OeEwa\u000ei\u0010&0"));
            }

            this.c = new GUIText();
            this.b.addGUIObject(this.c);
         }

         if(var5.equals(a(">Bf\u000b!0Gi\u0000"))) {
            this.c = new GUIBlankLine();
            this.b.addGUIObject(this.c);
         }

         String var7;
         String var8;
         String var9;
         byte var10;
         GUIObject var11;
         Setting var12;
         if(var5.equals(a("/Ks\u0011#2I"))) {
            ++this.bo;
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            var7 = this.getAttributeValue(var4, a("(Ww\u0000"));
            var8 = this.getAttributeValue(var4, a("8Kt\u0006"));
            var6 = SettingsUtils.createSettingKey(this.d, var6);
            var9 = this.getAttributeValue(var4, a(":Au\b+(Zn\u000b-"));
            var10 = 0;
            if(var9 != null && var9.equals(a("\u0012aX+\u000f\u000bqU*\u001d"))) {
               var10 = 1;
            }

            if(var8 == null) {
               var8 = var6;
            }

            if(this.b == null) {
               this.b = this.a.getLastTab();
            }

            var11 = this.createGUIObject(var7, var6, unescape(var8), var4);
            var11.setFormattingType(var10);
            this.b.addGUIObject(var11);
            if(var11 instanceof SettingGUIObject) {
               var12 = this.createSetting(var7, var6);
               settings.putSetting(var6, var12);
            }
         }

         if(var5.equals(a("9Bb\b/2Z"))) {
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            var7 = this.getAttributeValue(var4, a("(Ww\u0000"));
            var8 = this.getAttributeValue(var4, a("8Kt\u0006"));
            var6 = SettingsUtils.createSettingKey(this.d, var6);
            var9 = this.getAttributeValue(var4, a(":Au\b+(Zn\u000b-"));
            var10 = 0;
            if(var9 != null && var9.equals(a("\u0012aX+\u000f\u000bqU*\u001d"))) {
               var10 = 1;
            }

            if(var8 == null) {
               var8 = var6;
            }

            if(this.b == null) {
               this.b = this.a.getLastTab();
            }

            var11 = this.createGUIObject(var7, var6, unescape(var8), var4);
            var11.setFormattingType(var10);
            this.b.addGUIObject(var11);
            if(var11 instanceof SettingGUIObject) {
               var12 = this.createSetting(var7, var6);
               settings.putSetting(var6, var12);
            }
         }

         if(var5.equals(a("(Oe"))) {
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            if(var6 == null) {
               var6 = this.a.getName();
            }

            var7 = this.getAttributeValue(var4, a(",\\b\u0013#9Y"));
            var8 = this.getAttributeValue(var4, a("4Gc\u0001/2"));
            var9 = this.getAttributeValue(var4, a(":Gk\u0011/.]"));
            PreviewFilterList var18 = null;
            if(var9 != null) {
               var18 = new PreviewFilterList();
               StringTokenizer var17 = new StringTokenizer(var9, a("p\u000e"));

               while(var17.hasMoreTokens()) {
                  String var21 = var17.nextToken();
                  PreviewFilter var13 = this.createPreviewFilter(var21);
                  var18.addFilter(var13);
               }
            }

            if(this.a == null) {
               System.err.println(a(".Ah\u0011ja\u0013\'\u000b?0B"));
            }

            if(this.b != null) {
               GUITab var19 = new GUITab(var6, var7, var18, this.b);
               if(var8 != null && var8.equals(a("(\\r\u0000"))) {
                  var19.setHidden(true);
               }

               this.b.addGUIObject(var19);
               this.b = var19;
            } else {
               this.b = new GUITab(var6, var7, var18, (GUIObject)null);
               if(var8 != null && var8.equals(a("(\\r\u0000"))) {
                  this.b.setHidden(true);
               }

               this.a.addTab(this.b);
            }
         }

         if(var5.equals(a("(Aw\f)"))) {
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            CustomizerTreeNode var15 = this.a;
            this.a = new CustomizerTreeNode(var6, SettingsUtils.createSettingKey(this.d, var6));
            var15.add(this.a);
         }

         if(var5.equals(a("2Ac\u0000"))) {
            var6 = this.getAttributeValue(var4, a("2Oj\u0000"));
            this.getAttributeValue(var4, a("*Ku\u0016#3@"));
            var8 = this.getAttributeValue(var4, a(",\\b\u0003#$"));
            if(var8 != null) {
               this.d = var8;
            }

            var9 = this.getQualifiedRootNode(this.a);
            CustomizerTreeNode var22 = new CustomizerTreeNode(var6, SettingsUtils.createSettingKey(this.d, var9 + "/" + var6));
            this.a.add(var22);
            this.a = var22;
         }

         if(var5.equals(a("?Ai\u0016>.On\u000b>"))) {
            var6 = this.getAttributeValue(var4, a("/\\d"));
            var7 = this.getAttributeValue(var4, a(".[k\u0000"));
            var8 = this.getAttributeValue(var4, a("?Ai\u0006+(Ki\u0004>5Ai"));
            if(var7 == null) {
               System.err.println(a("\u0019\\u\n8f\u000eJ\f9/Gi\u0002j=Zs\u0017#>[s\u0000j~\\r\t/~\u000en\u000bj?Ai\u0016>.On\u000b>r"));
            }

            if(var6 == null) {
               System.err.println(a("\u0019\\u\n8f\u000eJ\f9/Gi\u0002j=Zs\u0017#>[s\u0000j~]u\u0006h|GiE)3@t\u00118=Gi\u0011d"));
            }

            if(var8 == null) {
               this.e = new ConstraintRule(var7.equals(a("9@f\u0007&9"))?1:2);
            } else {
               this.e = new ConstraintRule(var8.equals(a("=@c"))?2:1, var7.equals(a("9@f\u0007&9"))?1:2);
            }

            StringTokenizer var16 = new StringTokenizer(var6, a("p\u000e\u000eh@"));

            while(var16.hasMoreTokens()) {
               String var23 = var16.nextToken().trim();
               String var20 = SettingsUtils.createSettingKey(this.d, var23);
               this.e.addActorName(var20);
            }
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      }

   }

   public void endElement(String var1, String var2, String var3) throws SAXException {
      try {
         this.processCharacters();
         String var4 = var2;
         if("".equals(var2)) {
            var4 = var3;
         }

         if(var4.equals(a("?[t\u0011%1G}\u000088Os\u0004"))) {
            ;
         }

         if(var4.equals(a("2Ac\u0000"))) {
            this.a = (CustomizerTreeNode)this.a.getParent();
         }

         if(var4.equals(a("(Aw\f)"))) {
            this.a = (CustomizerTreeNode)this.a.getParent();
         }

         if(var4.equals(a("(Oe"))) {
            this.b = (GUITab)this.b.getParent();
         }

         if(var4.equals(a("/Ks\u0011#2I"))) {
            this.c = null;
         }

         if(var4.equals(a("9Bb\b/2Z"))) {
            this.c = null;
         }

         if(var4.equals(a("0Oe\u0000&"))) {
            this.c = null;
         }

         if(var4.equals(a("(K\u007f\u0011"))) {
            this.c = null;
         }

         if(var4.equals(a(">Bf\u000b!0Gi\u0000"))) {
            this.c = null;
         }

         if(var4.equals(a("?Ai\u0016>.On\u000b>"))) {
            this.e = null;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void characters(char[] var1, int var2, int var3) throws SAXException {
      if(this.e != null || this.c != null) {
         String var4 = new String(var1, var2, var3);
         this.bn.append(var4);
      }

   }

   public void processCharacters() {
      if(this.e != null) {
         StringTokenizer var1 = new StringTokenizer(this.bn.toString(), a("p\u000e\u000eh@"));

         while(var1.hasMoreTokens()) {
            String var2 = var1.nextToken().trim();
            String var3 = SettingsUtils.createSettingKey(this.d, var2);
            this.e.addDestName(var3);
         }

         customizerData.getConstraintsHandler().addRule(this.e);
      }

      if(this.c != null) {
         if(this.c instanceof GUILabel) {
            ((GUILabel)this.c).setDesc(unescape(this.bn.toString()));
         } else if(this.c instanceof GUIText) {
            ((GUIText)this.c).setDesc(unescape(this.bn.toString()));
         }
      }

      this.bn.setLength(0);
   }

   private static String unescape(String var0) {
      if(var0 == null) {
         return null;
      } else {
         StringBuffer var1 = new StringBuffer();
         StringTokenizer var2 = new StringTokenizer(var0, a("\u0000@"), true);

         while(true) {
            while(var2.hasMoreTokens()) {
               String var3 = var2.nextToken();
               if(var3.equals("\\") && var2.hasMoreTokens()) {
                  var3 = var2.nextToken();
                  if(var3.equals("n")) {
                     var1.append("\n");
                  } else {
                     var1.append("\\");
                     var1.append(var3);
                  }
               } else {
                  var1.append(var3);
               }
            }

            return var1.toString();
         }
      }
   }

   public PreviewFilter createPreviewFilter(String var1) {
      String var2 = (Context.pathOfResources(this.d) + a(",\\b\u0013#9YtJ,5Bs\u00008s") + var1).replace('/', '.');
      if(var2.startsWith(".")) {
         var2 = var2.substring(1);
      }

      try {
         Class var3 = Class.forName(var2);
         Object var4 = var3.newInstance();
         return (PreviewFilter)var4;
      } catch (Exception var5) {
         jindent.debugger.a.a(var5);
         return null;
      }
   }

   public GUIObject createGUIObject(String var1, String var2, String var3, Attributes var4) {
      Object var5 = null;
      if(var1.equals(a(">Ah\t/=@"))) {
         var5 = new BooleanGUIObject(var2, var3);
      }

      if(var1.equals(a("/Zu\f$;"))) {
         var5 = new StringGUIObject(var2, var3);
      }

      if(var1.equals(a("(K\u007f\u0011"))) {
         var5 = new StringArrayGUIObject(var2, var3);
      }

      String var6;
      String[] var7;
      int var8;
      if(var1.equals(a("2[j\u0007/."))) {
         var6 = this.getAttributeValue(var4, a("5@w\u0010>(Ww\u0000"));
         var7 = this.getListFromInputType(var6, false);
         var8 = this.getColumnFromInputType(var6);
         var5 = new NumberGUIObject(var2, var3, var8, var7);
      }

      if(var1.equals(a("2Ti\u0010\'>Ku"))) {
         var6 = this.getAttributeValue(var4, a("5@w\u0010>(Ww\u0000"));
         var7 = this.getListFromInputType(var6, true);
         var8 = this.getColumnFromInputType(var6);
         var5 = new NZNumberGUIObject(var2, var3, var8, var7);
      }

      if(var1.equals(a("5@r\b(9\\"))) {
         var6 = this.getAttributeValue(var4, a("5@w\u0010>(Ww\u0000"));
         var7 = this.getListFromInputType(var6, false);
         var8 = this.getColumnFromInputType(var6);
         var5 = new INumberGUIObject(var2, var3, var8, var7);
      }

      if(var1.equals(a("=Lt\n&)Zb7/0Os\f<9gI\u0010\'>Ku"))) {
         var5 = new AbsoluteRelativeINumberGUIObject(var2, var3);
      }

      if(var1.equals(a(",At\f>5Ai"))) {
         var5 = new PositionGUIObject(var2, var3);
      }

      if(var1.equals(a("8Os\u0000"))) {
         var5 = new DateFormatGUIObject(var2, var3);
      }

      if(var1.equals(a("4Kf\u0001/."))) {
         var5 = new HeaderGUIObject(var2, var3);
      }

      if(var1.equals(a("5@c\u0000$(Os\f%2"))) {
         var5 = new IndentationGUIObject(var2, var3);
      }

      if(var1.equals(a(",\\b\u001583Mb\u001693\\N\u000b.9@s\u0004>5Ai"))) {
         var5 = new PreProcessorIndentationGUIObject(var2, var3);
      }

      if(var1.equals(a("8Ad\u00113,K"))) {
         var5 = new DocTypeGUIObject(var2, var3);
      }

      if(var1.equals(a(":Ah\u0011/."))) {
         var5 = new FooterGUIObject(var2, var3);
      }

      if(var1.equals(a(">\\f\u0006//"))) {
         var5 = new BracesGUIObject(var2, var3);
      }

      if(var1.equals(a("+\\f\u0015:5@`"))) {
         var5 = new WrappingGUIObject(var2, var3);
      }

      if(var1.equals(a("0A`\u0003#0K"))) {
         var5 = new LogFileGUIObject(var2, var3);
      }

      if(var1.equals(a(">Op\u0017+,^n\u000b-"))) {
         var5 = new BAWrappingGUIObject(var2, var3);
      }

      if(var1.equals(a("0Gi\u0000\u001d.Ow\u0015#2IW\n&5M~"))) {
         var5 = new LineWrappingPolicyGUIObject(var2, var3);
      }

      if(var1.equals(a(",Od\u000e+;KK\f9(aa7/;[k\u00048\u0019Vw\u0017//]n\n$/"))) {
         var5 = new PackageListOfRegExGUIObject(var2, var3);
      }

      if(var1.equals(a(")]b\u0017\u001c=\\n\u0004(0Kt"))) {
         var5 = new UserVariablesGUIObject(var2, var3);
      }

      if(var1.equals(a("/Wt\u0011/1xf\u0017#=Lk\u00009"))) {
         var5 = new SystemVariablesGUIObject(var2, var3);
      }

      if(var1.equals(a("9Vs\u0000$/Gh\u000b\u0007=@f\u0002/."))) {
         var5 = new ExtensionManagerGUIObject(var2, var3);
      }

      if(var1.equals(a("9@c*,\u0010Gi\u0000\f3\\j\u0004>"))) {
         var5 = new EndOfLineFormatGUIObject(var2, var3);
      }

      if(var1.equals(a("9@d\n.5@`"))) {
         var5 = new EncodingGUIObject(var2, var3);
      }

      if(var1.equals(a("=Lh\u0010>"))) {
         var5 = new AboutGUIObject(var2, var3);
      }

      if(var1.equals(a(".K`\f9(\\f\u0011#3@"))) {
         var5 = new RegistrationGUIObject(var2, var3);
      }

      if(var1.equals(a("6Zn\u000135@a\n"))) {
         var5 = new JTidyInfoGUIObject(var2, var3);
      }

      if(var1.equals(a("1Kt\u0016+;KU\u0000:3\\s"))) {
         var5 = new MessageReportGUIObject(var2, var3);
      }

      if(var1.equals(a("/Au\u0011/."))) {
         var5 = new SorterGUIObject(var2, var3);
      }

      if(var5 == null) {
         jindent.debugger.a.b(a("\u001fOi\u000b%(\u000eu\u0000)3Ii\f09\u000es\u001c:9\u0014\'") + var1 + a("|Hu\n\'|vJ)j/Fb\u0000>"));
      }

      return (GUIObject)var5;
   }

   private String[] getListFromInputType(String var1, boolean var2) {
      return a("0Gi\u0000=.Ow\u0015#2I").equals(var1)?new String[]{a("k\u001e"), a("k\u0016"), a("d\u001e"), a("e\u001e"), a("m\u001e7"), a("m\u001f7"), a("m\u001c7"), a("m\u001d7"), a("m\u001a7"), a("m\u001b7")}:(var2?new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}:new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
   }

   private int getColumnFromInputType(String var1) {
      return a("0Gi\u0000=.Ow\u0015#2I").equals(var1)?3:1;
   }

   public Setting createSetting(String var1, String var2) {
      Object var3 = null;
      if(var1.equals(a(">Ah\t/=@"))) {
         var3 = new BooleanSetting(var2);
      }

      if(var1.equals(a("/Zu\f$;"))) {
         var3 = new StringSetting(var2);
      }

      if(var1.equals(a("(K\u007f\u0011"))) {
         var3 = new StringArraySetting(var2);
      }

      if(var1.equals(a("2[j\u0007/."))) {
         var3 = new NumberSetting(var2);
      }

      if(var1.equals(a("2Ti\u0010\'>Ku"))) {
         var3 = new NZNumberSetting(var2);
      }

      if(var1.equals(a("5@r\b(9\\"))) {
         var3 = new INumberSetting(var2);
      }

      if(var1.equals(a("=Lt\n&)Zb7/0Os\f<9gI\u0010\'>Ku"))) {
         var3 = new AbsoluteRelativeINumberSetting(var2);
      }

      if(var1.equals(a(",At\f>5Ai"))) {
         var3 = new PositionSetting(var2);
      }

      if(var1.equals(a("8Os\u0000"))) {
         var3 = new DateFormatSetting(var2);
      }

      if(var1.equals(a("0A`\u0003#0K"))) {
         var3 = new LogFileSetting(var2);
      }

      if(var1.equals(a("4Kf\u0001/."))) {
         var3 = new HeaderSetting(var2);
      }

      if(var1.equals(a("5@c\u0000$(Os\f%2"))) {
         var3 = new IndentationSetting(var2);
      }

      if(var1.equals(a(",\\b\u001583Mb\u001693\\N\u000b.9@s\u0004>5Ai"))) {
         var3 = new PreProcessorIndentationSetting(var2);
      }

      if(var1.equals(a("8Ad\u00113,K"))) {
         var3 = new DocTypeSetting(var2);
      }

      if(var1.equals(a(":Ah\u0011/."))) {
         var3 = new FooterSetting(var2);
      }

      if(var1.equals(a(">\\f\u0006//"))) {
         var3 = new BracesSetting(var2);
      }

      if(var1.equals(a("+\\f\u0015:5@`"))) {
         var3 = new WrappingSetting(var2);
      }

      if(var1.equals(a(">Op\u0017+,^n\u000b-"))) {
         var3 = new BAWrappingSetting(var2);
      }

      if(var1.equals(a(",Od\u000e+;KK\f9(aa7/;[k\u00048\u0019Vw\u0017//]n\n$/"))) {
         var3 = new PackageListOfRegExSetting(var2);
      }

      if(var1.equals(a("0Gi\u0000\u001d.Ow\u0015#2IW\n&5M~"))) {
         var3 = new LineWrappingPolicySetting(var2);
      }

      if(var1.equals(a(")]b\u0017\u001c=\\n\u0004(0Kt"))) {
         var3 = new UserVariablesSetting(var2);
      }

      if(var1.equals(a("/Wt\u0011/1xf\u0017#=Lk\u00009"))) {
         var3 = new SystemVariablesSetting(var2);
      }

      if(var1.equals(a("9Vs\u0000$/Gh\u000b\u0007=@f\u0002/."))) {
         var3 = new ExtensionManagerSetting(var2);
      }

      if(var1.equals(a("9@c*,\u0010Gi\u0000\f3\\j\u0004>"))) {
         var3 = new EndOfLineFormatSetting(var2);
      }

      if(var1.equals(a("9@d\n.5@`"))) {
         var3 = new EncodingSetting(var2);
      }

      if(var1.equals(a("1Kt\u0016+;KU\u0000:3\\s"))) {
         var3 = new MessageReportSetting(var2);
      }

      if(var1.equals(a("/Au\u0011/."))) {
         var3 = new SorterSetting(var2);

         try {
            SorterElement var4;
            if(var2.equals(SettingsUtils.createSettingKey(a("6Oq\u0004"), a("5Cw\n8(jb\u0006&=\\f\u0011#3@t6%.Zb\u0017")))) {
               var4 = SorterElement.createFromString(a("\u0016Oq\u0004fpgC:\u000e\u0019mK$\u0018\u001dzN*\u0004p\u0006N\b:3\\s\u0016fpgC:\u0003\u0011~H7\u001ep\u0006T\n8(\u000ee\u001cj\fOd\u000e+;K\'(/1Lb\u001794GwI>.[bI\u0003\u0018qN(\u001a\u0013|S:\u0007\u0019cE \u0018\u000ffN5ftdC.j\fOd\u000e+;KtIf\u0015jX\'\u000f\u0010aI\"\u0019\u0003zH:\u0000\u0018e+Lb\u0012AiH\u0000\u0018e\'5+?Ef\u0002//\u0002+,\u000e\u0003lB)\u0005\u0012iT:\u0004\u0013zX1\u0005\u0003dC.fu\u0007/\"83[wE(%\u000eW\u0004)7O`\u0000j\u0011Kj\u0007/.]o\f:pZu\u0010/pgC:\u0003\u0011~H7\u001e\u0003iU*\u001f\fgI\"ft]r\u000bd?AjIf\u0015jX,\u0007\faU1\u0015\u001b|H0\u001a\u0015`@Icu\u0006T\n8(\u000ee\u001cj\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX6\u001e\u001dzN&\u0015\u0011aC,\f\u0015kUIb\u0012AiH\u0019(Os\f)p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lb\u000fZf\u0011#?\u0002+,\u000e\u0003}S$\u001e\u0015m+Lct}h\u0017>|L~E\u0004=CbI>.[bI\u0003\u0018qI$\u0007\u0019\u0002.L"));
               ((SorterSetting)var3).setSorterRoot(var4);
            }

            if(var2.equals(SettingsUtils.createSettingKey(a("6Oq\u0004"), a("?Bf\u00169\u0015@s\u00008:Od\u0000\u000f2[j!/?Bf\u0017+(Gh\u000b9\u000fAu\u0011/.")))) {
               var4 = SorterElement.createFromString(a("\u0016Oq\u0004fpgC:\u000e\u0019mK$\u0018\u001dzN*\u0004p\u0006T\u0011+(GdE\f5Kk\u00019p\u0002N!\u0015\u000fzF1\u0003\u001fqA,\u000f\u0010j+M\u00193\\sE(%\u000eN\u000b#(Gf\t#&KcI>.[bI\u0003\u0018qN+\u0003\bgF)\u0003\u0006kUIb\u0015@n\u0011#=Bn\u001f/8\u0002+,\u000e\u0003gI,\u001e\u0015oK,\u0010\u0019j+Lb\u0012AiH\u00032Gs\f+0G}\u0000.p\u0002N!\u0015\u0012aI:\u0003\u0012gS,\u000b\u0010g] \u000ep\u0007.M\u00193\\sE(%\u000eF\u0006)9]tE\u00073Jn\u0003#9\\tI>.[bI\u0003\u0018qF&\t\u0019}T:\u0007\u0013jN#\u0003\u0019|+M\u001a)Lk\f)p\u0002N!\u0015\f{E)\u0003\u001f\u0002.M\f.Gb\u000b.0W+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0006W\u0017%(Kd\u0011/8\u0002+,\u000e\u0003~U*\u001e\u0019mS \u000ep\u0007/585Xf\u0011/p\u0002N!\u0015\f|N3\u000b\bk+Lct}h\u0017>|L~E\u000b2@h\u0011+(Gh\u000bj\u0011Ac\f,5KuI>.[bI\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`X(\u0005\u0018gA,\u000f\u000e\u0002/$$2As\u0004>9J+I\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`+Lb\u0012AiH\u000b2@h\u0011+(KcIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eA\f$=B\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001agI$\u0006\u0003cH!\u0003\u001agB7fthn\u000b+0\u0002+,\u000e\u0003hN+\u000b\u0010\u0002.M\u00043@*##2OkIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eS\u0017+2]n\u0000$(\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u001e\u000eoI6\u0003\u0019`S:\u0007\u0013jN#\u0003\u0019|+M\u001e.Oi\u0016#9@sIf\u0015jX1\u0018\u001d`T,\u000f\u0012z+Lb\u0012AiH\u001e.Oi\u0016#9@sIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eQ\n&=Zn\t/|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX3\u0005\u0010oS,\u0006\u0019qJ*\u000e\u0015hN \u0018p\u0006Q\n&=Zn\t/p\u0002N!\u0015\naK$\u001e\u0015bBIct`h\u000bg\nAk\u0004>5BbIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eI\u0004\'9\u0002s\u0017?9\u0002N!\u0015\u0012oJ fu\u0006T\n8(\u000ee\u001cj\bWw\u00009pZu\u0010/pgC:\u001e\u0005~BIcu\u0006T\u0011+(GdE\u00032Gs\f+0G}\u00008/\u0002+,\u000e\u0003}S$\u001e\u0015mX,\u0004\u0015zN$\u0006\u0015tB7fu\u0006A\f/0JtIf\u0015jX#\u0003\u0019bCIb\u000fAu\u0011j>W\',$5Zn\u0004&5Tb\u0001f(\\r\u0000f\u0015jX,\u0004\u0015zN$\u0006\u0015tB7ftgi\f>5Ok\f09J+I\u0003\u0018qN+\u0003\bgF)\u0003\u0006kCIct`h\u000bg\u0015@n\u0011#=Bn\u001f/8\u0002+,\u000e\u0003`H+\u0015\u0015`N1\u0003\u001dbN?\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'$)?Kt\u0016j\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX$\t\u001fkT6\u0015\u0011aC,\f\u0015kUIb\f[e\t#?\u0002+,\u000e\u0003~R\'\u0006\u0015m+Lb\u001a\\n\u0000$8B~If\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007/583Zb\u0006>9J+I\u0003\u0018qW7\u0005\bkD1\u000f\u0018\u0002.M\u001a.Gq\u0004>9\u0002+,\u000e\u0003~U,\u001c\u001dzBIcu\u0006T\n8(\u000ee\u001cj\u001d@i\n>=Zn\n$|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX$\u0004\u0012aS$\u001e\u0015aI:\u0007\u0013jN#\u0003\u0019|+M\u000b2@h\u0011+(KcIf\u0015jX$\u0004\u0012aS$\u001e\u0015aIIct`h\u000bg\u001d@i\n>=Zb\u0001fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'##2OkE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003hN+\u000b\u0010qJ*\u000e\u0015hN \u0018p\u0006A\f$=B+I\u0003\u0018qA,\u0004\u001db+Lb\u0012AiH\f5@f\tfpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'18=@t\f/2Z\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\b|F+\u0019\u0015kI1\u0015\u0011aC,\f\u0015kUIb\b\\f\u000b95Ki\u0011fpgC:\u001e\u000eoI6\u0003\u0019`SIct`h\u000bg\b\\f\u000b95Ki\u0011fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'3%0Os\f&9\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u001c\u0013bF1\u0003\u0010kX(\u0005\u0018gA,\u000f\u000e\u0002/3%0Os\f&9\u0002+,\u000e\u0003xH)\u000b\bgK fu\u0006I\n$qxh\t+(Gk\u0000fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'++1K+\u00118)K+,\u000e\u0003`F(\u000fp\u0007/6%.Z\'\u00073|z~\u0015//\u0002s\u0017?9\u0002N!\u0015\bwW fu\u0007/,$5Zn\u0004&5Tb\u00179p\u0002N!\u0015\u0015`N1\u0003\u001dbN?\u000f\u000e\u0002.M\u000f2[jE\t3@t\u0011+2ZtIf\u0015jX&\u0005\u0012}S$\u0004\bqB+\u001f\u0011\u0002/6%.Z\'\u00073|od\u0006//]\'(%8Ga\f/.]+\u00118)K+,\u000e\u0003oD&\u000f\u000f}X(\u0005\u0018gA,\u000f\u000e\u0002/5?>Bn\u0006fpgC:\u001a\tlK,\tp\u0007/#85Ki\u0001&%\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIct~u\n>9Ms\u0000.p\u0002N!\u0015\f|H1\u000f\u001fzB!fu\u0006W\u0017#*Os\u0000fpgC:\u001a\u000egQ$\u001e\u0019\u0002.Lb\u000fAu\u0011j>W\'$$2As\u0004>5AiE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003oI+\u0005\boS,\u0005\u0012qJ*\u000e\u0015hN \u0018p\u0006F\u000b$3Zf\u0011/8\u0002+,\u000e\u0003oI+\u0005\boS,\u0005\u0012\u0002.M\u00043@*$$2As\u0004>9J+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|hn\u000b+0\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\f\u0015`F)\u0015\u0011aC,\f\u0015kUIb\u001aGi\u0004&p\u0002N!\u0015\u001agI$\u0006p\u0007/+%2\u0003A\f$=B+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|oe\u0016>.Od\u0011j\u0011Ac\f,5KuI>.[bI\u0003\u0018qF\'\u0019\b|F&\u001e\u0003cH!\u0003\u001agB7ftoe\u0016>.Od\u0011fpgC:\u000b\u001e}S7\u000b\u001fz+Lb\u0012AiH\u000b>]s\u0017+?Z+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|}s\u0004>5M\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u000fzF1\u0003\u001fqJ*\u000e\u0015hN \u0018p\u0006T\u0011+(GdIf\u0015jX6\u001e\u001dzN&fu\u0006I\n$q}s\u0004>5M+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|}s\u0017#?ZA5j\u0011Ac\f,5KuI>.[bI\u0003\u0018qT1\u0018\u0015mS#\u001a\u0003cH!\u0003\u001agB7ft}s\u0017#?ZA5fpgC:\u0019\b|N&\u001e\u001a~+Lb\u0012AiH\u0019(\\n\u0006>\u001a~+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|`f\b/pZu\u0010/pgC:\u0004\u001dcBIcu\u0006B\u000b?1]+I\u0003\u0018qB+\u001f\u0011\u0002/6%.Z\'\u00073|od\u0006//]\'(%8Ga\f/.]+\u00118)K+,\u000e\u0003oD&\u000f\u000f}X(\u0005\u0018gA,\u000f\u000e\u0002/5?>Bn\u0006fpgC:\u001a\tlK,\tp\u0007/#85Ki\u0001&%\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIct~u\n>9Ms\u0000.p\u0002N!\u0015\f|H1\u000f\u001fzB!fu\u0006W\u0017#*Os\u0000fpgC:\u001a\u000egQ$\u001e\u0019\u0002.Lb\u000fAu\u0011j>W\'$$2As\u0004>5AiE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003oI+\u0005\boS,\u0005\u0012qJ*\u000e\u0015hN \u0018p\u0006F\u000b$3Zf\u0011/8\u0002+,\u000e\u0003oI+\u0005\boS,\u0005\u0012\u0002.M\u00043@*$$2As\u0004>9J+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|hn\u000b+0\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\f\u0015`F)\u0015\u0011aC,\f\u0015kUIb\u001aGi\u0004&p\u0002N!\u0015\u001agI$\u0006p\u0007/+%2\u0003A\f$=B+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|oe\u0016>.Od\u0011j\u0011Ac\f,5KuI>.[bI\u0003\u0018qF\'\u0019\b|F&\u001e\u0003cH!\u0003\u001agB7ftoe\u0016>.Od\u0011fpgC:\u000b\u001e}S7\u000b\u001fz+Lb\u0012AiH\u000b>]s\u0017+?Z+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|}s\u0004>5M\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u000fzF1\u0003\u001fqJ*\u000e\u0015hN \u0018p\u0006T\u0011+(GdIf\u0015jX6\u001e\u001dzN&fu\u0006I\n$q}s\u0004>5M+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|}s\u0017#?ZA5j\u0011Ac\f,5KuI>.[bI\u0003\u0018qT1\u0018\u0015mS#\u001a\u0003cH!\u0003\u001agB7ft}s\u0017#?ZA5fpgC:\u0019\b|N&\u001e\u001a~+Lb\u0012AiH\u0019(\\n\u0006>\u001a~+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|`f\b/pZu\u0010/pgC:\u0004\u001dcBIcu\u0006F\u000b$3Zf\u0011#3@\'13,KtIf\u0015jX$\u0004\u0012aS$\u001e\u0015aIIb\u000fAu\u0011j>W\'$)?Kt\u0016j\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX$\t\u001fkT6\u0015\u0011aC,\f\u0015kUIb\f[e\t#?\u0002+,\u000e\u0003~R\'\u0006\u0015m+Lb\u001a\\n\u0000$8B~If\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007/583Zb\u0006>9J+I\u0003\u0018qW7\u0005\bkD1\u000f\u0018\u0002.M\u001a.Gq\u0004>9\u0002+,\u000e\u0003~U,\u001c\u001dzBIcu\u0006T\n8(\u000ee\u001cj\u001aGi\u0004&|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX#\u0003\u0012oK:\u0007\u0013jN#\u0003\u0019|+M\f5@f\tfpgC:\f\u0015`F)fu\u0006I\n$qhn\u000b+0\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u001dLt\u00118=MsE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003oE6\u001e\u000eoD1\u0015\u0011aC,\f\u0015kUIb\u001dLt\u00118=MsIf\u0015jX$\b\u000fzU$\t\b\u0002.M\u00043@*$(/Zu\u0004)(\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u000fZf\u0011#?\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u0019\boS,\t\u0003cH!\u0003\u001agB7ft}s\u0004>5M+I\u0003\u0018qT1\u000b\bgDIct`h\u000bg\u000fZf\u0011#?\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u000fZu\f)(hWE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003}S7\u0003\u001fzA5\u0015\u0011aC,\f\u0015kUIb\u000fZu\f)(hWIf\u0015jX6\u001e\u000egD1\f\f\u0002.M\u00043@*6>.Gd\u0011\f\f\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u0012Oj\u0000f(\\r\u0000f\u0015jX+\u000b\u0011k+Lctmh\u000b9(\\r\u0006>3\\tIf\u0015jX&\u0005\u0012}S7\u001f\u001fzH7ft}h\u0017>|L~E\u000b?Mb\u00169|ch\u0001#:Gb\u00179pZu\u0010/pgC:\u000b\u001fmB6\u0019\u0003cH!\u0003\u001agB7ft~r\u0007&5M+I\u0003\u0018qW0\b\u0010gDIcthu\f/2Jk\u001cfpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.M\u001a.As\u0000)(KcIf\u0015jX5\u0018\u0013zB&\u001e\u0019j+Lb\f\\n\u0013+(K+I\u0003\u0018qW7\u0003\noS fu\u0007/6%.Z\'\u00073|oi\u000b%(Os\f%2\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u000b\u0012`H1\u000b\bgH+\u0015\u0011aC,\f\u0015kUIb\u001d@i\n>=Zb\u0001fpgC:\u000b\u0012`H1\u000b\bgH+fu\u0006I\n$qoi\u000b%(Os\u0000.p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u001a=\\f\b/(KuE\t3[i\u0011f(\\r\u0000f\u0015jX5\u000b\u000eoJ \u001e\u0019|X&\u0005\t`SIcu\u0006J\u0000>4Ac\u0016fpgC:\u0007\u0019zO*\u000ep\u0006T\n8(\u000ee\u001cj\u001dZs\u0017#>[s\u0000j\u001dMd\u00009/Au\u0016f(\\r\u0000f\u0015jX(\u000f\bfH!\u0015\f|H5\u000f\u000ez^:\u000b\u001fmB6\u0019\u0003`H!\u000fp\u0006F\u0011>.Ge\u0010>9\u000eF\u0006)9]t\n8/\u0002+,\u000e\u0003cB1\u0002\u0013jX*\u0018\u0018gI$\u0018\u0005\u0002.M\u0005.Jn\u000b+.W\'(/(Fh\u00019p\u0002N!\u0015\u0011kS-\u0005\u0018qW7\u0005\fkU1\u0013\u0003oD&\u000f\u000f}+Lct}h\u0017>|L~E\u00079Zo\n.|z~\u0015/pZu\u0010/pgC:\u0007\u0019zO*\u000e\u0003iU*\u001f\f}+M\r9Zs\u00008/\u0002+,\u000e\u0003cB1\u0002\u0013jX\"\u000f\bzB7fu\u0006O\u00049|ib\u0011>9\\tIf\u0015jX(\u000f\bfH!\u0015\u0014oT:\r\u0019zS \u0018p\u0007/,9|ib\u0011>9\\tIf\u0015jX(\u000f\bfH!\u0015\u0015}X\"\u000f\bzB7fu\u0006T\u0000>(Ku\u0016fpgC:\u0007\u0019zO*\u000e\u0003}B1\u001e\u0019|+Lb\u0013\\c\f$=\\~E\u00079Zo\n./\u0002+,\u000e\u0003cB1\u0002\u0013jX*\u0018\u0018gI$\u0018\u0005\u0002.Lb\u000fAu\u0011j>W\'$)?Kt\u0016j\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX$\t\u001fkT6\u0015\u0011aC,\f\u0015kUIb\f[e\t#?\u0002+,\u000e\u0003~R\'\u0006\u0015m+Lb\u001a\\n\u0000$8B~If\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007/583Zb\u0006>9J+I\u0003\u0018qW7\u0005\bkD1\u000f\u0018\u0002.M\u001a.Gq\u0004>9\u0002+,\u000e\u0003~U,\u001c\u001dzBIcu\u0006T\n8(\u000ee\u001cj\u001d@i\n>=Zn\n$|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX$\u0004\u0012aS$\u001e\u0015aI:\u0007\u0013jN#\u0003\u0019|+M\u000b2@h\u0011+(KcIf\u0015jX$\u0004\u0012aS$\u001e\u0015aIIct`h\u000bg\u001d@i\n>=Zb\u0001fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'##2OkE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003hN+\u000b\u0010qJ*\u000e\u0015hN \u0018p\u0006A\f$=B+I\u0003\u0018qA,\u0004\u001db+Lb\u0012AiH\f5@f\tfpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'$(/Zu\u0004)(\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u000b\u001e}S7\u000b\u001fzX(\u0005\u0018gA,\u000f\u000e\u0002/$(/Zu\u0004)(\u0002+,\u000e\u0003oE6\u001e\u000eoD1fu\u0006I\n$qoe\u0016>.Od\u0011fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'6>=Zn\u0006j\u0011Ac\f,5KuI>.[bI\u0003\u0018qT1\u000b\bgD:\u0007\u0013jN#\u0003\u0019|+M\u0019(Os\f)p\u0002N!\u0015\u000fzF1\u0003\u001f\u0002.M\u00043@*6>=Zn\u0006fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'632Mo\u0017%2G}\u0000.|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX6\u0013\u0012mO7\u0005\u0012g] \u000e\u0003cH!\u0003\u001agB7ft}~\u000b)4\\h\u000b#&KcIf\u0015jX6\u0013\u0012mO7\u0005\u0012g] \u000ep\u0007/+%2\u0003T\u001c$?Fu\n$5Tb\u0001fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'++(Gq\u0000j\u0011Ac\f,5KuI>.[bI\u0003\u0018qI$\u001e\u0015xB:\u0007\u0013jN#\u0003\u0019|+M\u0004=Zn\u0013/p\u0002N!\u0015\u0012oS,\u001c\u0019\u0002.M\u00043@*++(Gq\u0000fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'6>.Gd\u0011\f\f\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u0019\b|N&\u001e\u001a~X(\u0005\u0018gA,\u000f\u000e\u0002/6>.Gd\u0011\f\f\u0002+,\u000e\u0003}S7\u0003\u001fzA5fu\u0006I\n$q}s\u0017#?ZA5fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'++1K+\u00118)K+,\u000e\u0003`F(\u000fp\u0007/6%.Z\'\u00073|~f\u0017+1Ks\u00008|mh\u0010$(\u0002s\u0017?9\u0002N!\u0015\foU$\u0007\u0019zB7\u0015\u001faR+\u001ep\u0007.M\u00032@b\u0017j\u0015@s\u00008:Od\u00009p\u0002N!\u0015\u0015`S \u0018\u001aoD ft}h\u0017>|L~E\u000b?Mb\u00169|ch\u0001#:Gb\u00179pZu\u0010/pgC:\u000b\u001fmB6\u0019\u0003cH!\u0003\u001agB7ft~r\u0007&5M+I\u0003\u0018qW0\b\u0010gDIcthu\f/2Jk\u001cfpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.M\u001a.As\u0000)(KcIf\u0015jX5\u0018\u0013zB&\u001e\u0019j+Lb\f\\n\u0013+(K+I\u0003\u0018qW7\u0003\noS fu\u0007/6%.Z\'\u00073|oi\u000b%(Os\f%2\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u000b\u0012`H1\u000b\bgH+\u0015\u0011aC,\f\u0015kUIb\u001d@i\n>=Zb\u0001fpgC:\u000b\u0012`H1\u000b\bgH+fu\u0006I\n$qoi\u000b%(Os\u0000.p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\f5@f\tj\u0011Ac\f,5KuI>.[bI\u0003\u0018qA,\u0004\u001dbX(\u0005\u0018gA,\u000f\u000e\u0002/##2OkIf\u0015jX#\u0003\u0012oKIct`h\u000bg\u001aGi\u0004&p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u000b>]s\u0017+?Z\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001dlT1\u0018\u001dmS:\u0007\u0013jN#\u0003\u0019|+M\u000b>]s\u0017+?Z+I\u0003\u0018qF\'\u0019\b|F&\u001ep\u0007/+%2\u0003F\u00079(\\f\u0006>p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u0019(Os\f)|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX6\u001e\u001dzN&\u0015\u0011aC,\f\u0015kUIb\u000fZf\u0011#?\u0002+,\u000e\u0003}S$\u001e\u0015m+Lb\u0012AiH\u0019(Os\f)p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u0019(\\n\u0006>\u001a~\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u000fzU,\t\bhW:\u0007\u0013jN#\u0003\u0019|+M\u0019(\\n\u0006>\u001a~+I\u0003\u0018qT1\u0018\u0015mS#\u001ap\u0007/+%2\u0003T\u001185Ms#\u001ap\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u0004=CbI>.[bI\u0003\u0018qI$\u0007\u0019\u0002.Lb\u0015@i\u00008|mk\u00049/KtIf\u0015jX&\u0006\u001d}TIb\u000fAu\u0011j>W\'$)?Kt\u0016j\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX$\t\u001fkT6\u0015\u0011aC,\f\u0015kUIb\f[e\t#?\u0002+,\u000e\u0003~R\'\u0006\u0015m+Lb\u001a\\n\u0000$8B~If\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007/583Zb\u0006>9J+I\u0003\u0018qW7\u0005\bkD1\u000f\u0018\u0002.M\u001a.Gq\u0004>9\u0002+,\u000e\u0003~U,\u001c\u001dzBIcu\u0006T\n8(\u000ee\u001cj\u001d@i\n>=Zn\n$|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX$\u0004\u0012aS$\u001e\u0015aI:\u0007\u0013jN#\u0003\u0019|+M\u000b2@h\u0011+(KcIf\u0015jX$\u0004\u0012aS$\u001e\u0015aIIct`h\u000bg\u001d@i\n>=Zb\u0001fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'##2OkE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003hN+\u000b\u0010qJ*\u000e\u0015hN \u0018p\u0006A\f$=B+I\u0003\u0018qA,\u0004\u001db+Lb\u0012AiH\f5@f\tfpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'$(/Zu\u0004)(\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u000b\u001e}S7\u000b\u001fzX(\u0005\u0018gA,\u000f\u000e\u0002/$(/Zu\u0004)(\u0002+,\u000e\u0003oE6\u001e\u000eoD1fu\u0006I\n$qoe\u0016>.Od\u0011fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'6>=Zn\u0006j\u0011Ac\f,5KuI>.[bI\u0003\u0018qT1\u000b\bgD:\u0007\u0013jN#\u0003\u0019|+M\u0019(Os\f)p\u0002N!\u0015\u000fzF1\u0003\u001f\u0002.M\u00043@*6>=Zn\u0006fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'6>.Gd\u0011\f\f\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u0019\b|N&\u001e\u001a~X(\u0005\u0018gA,\u000f\u000e\u0002/6>.Gd\u0011\f\f\u0002+,\u000e\u0003}S7\u0003\u001fzA5fu\u0006I\n$q}s\u0017#?ZA5fpgC:\u0004\u0013`X(\u0005\u0018gA,\u000f\u0018\u0002.Lb\u000fAu\u0011j>W\'++1K+\u00118)K+,\u000e\u0003`F(\u000fp\u0007."));
               ((SorterSetting)var3).setSorterRoot(var4);
            }

            if(var2.equals(SettingsUtils.createSettingKey(a("6Oq\u0004"), a("(Ww\u0000\u000e9Mk\u00048=Zn\n$/}h\u0017>9\\")))) {
               var4 = SorterElement.createFromString(a("\u0016Oq\u0004fpgC:\u000e\u0019mK$\u0018\u001dzN*\u0004p\u0006F\u000b$3Zf\u0011#3@\'13,KtIf\u0015jX$\u0004\u0012aS$\u001e\u0015aI:\u001e\u0005~BIb\u000fAu\u0011j>W\'++1K+\u00118)K+,\u000e\u0003`F(\u000fp\u0007/6%.Z\'\u00073|od\u0006//]\'(%8Ga\f/.]+\u00118)K+,\u000e\u0003oD&\u000f\u000f}X(\u0005\u0018gA,\u000f\u000e\u0002/5?>Bn\u0006fpgC:\u001a\tlK,\tp\u0007/#85Ki\u0001&%\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u001dLt\u00118=MsE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003oE6\u001e\u000eoD1\u0015\u0011aC,\f\u0015kUIb\u001dLt\u00118=MsIf\u0015jX$\b\u000fzU$\t\b\u0002.M\u00043@*$(/Zu\u0004)(\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0007/ $)C\'&%2]s\u0004$(]+I\u0003\u0018qD*\u0004\u000fzF+\u001e\u0003kI0\u0007p\u0006T\n8(\u000ee\u001cj\u0012Oj\u0000f(\\r\u0000f\u0015jX+\u000b\u0011k+Lb\u000fAu\u0011j>W\'$)?Kt\u0016j\u0011Ac\f,5Ku\u0016f(\\r\u0000f\u0015jX$\t\u001fkT6\u0015\u0011aC,\f\u0015kUIb\f[e\t#?\u0002+,\u000e\u0003~R\'\u0006\u0015m+Lb\u001a\\n\u0000$8B~If\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eF\u000b$3Zf\u0011#3@\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001d`I*\u001e\u001dzN*\u0004\u0003cH!\u0003\u001agB7ftoi\u000b%(Os\u0000.p\u0002N!\u0015\u001d`I*\u001e\u001dzN*\u0004p\u0007/+%2\u0003F\u000b$3Zf\u0011/8\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u001dLt\u00118=MsE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003oE6\u001e\u000eoD1\u0015\u0011aC,\f\u0015kUIb\u001dLt\u00118=MsIf\u0015jX$\b\u000fzU$\t\b\u0002.M\u00043@*$(/Zu\u0004)(\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u001aGi\u0004&|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX#\u0003\u0012oK:\u0007\u0013jN#\u0003\u0019|+M\f5@f\tfpgC:\f\u0015`F)fu\u0006I\n$qhn\u000b+0\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0006T\n8(\u000ee\u001cj\u000fZu\f)(hWE\u00073Jn\u0003#9\\+\u00118)K+,\u000e\u0003}S7\u0003\u001fzA5\u0015\u0011aC,\f\u0015kUIb\u000fZu\f)(hWIf\u0015jX6\u001e\u000egD1\f\f\u0002.M\u00043@*6>.Gd\u0011\f\f\u0002+,\u000e\u0003`H+\u0015\u0011aC,\f\u0015kCIcu\u0007/ $)CtIf\u0015jX \u0004\tc+M\u00193\\sE(%\u000eI\u0004\'9\u0002s\u0017?9\u0002N!\u0015\u0012oJ fu\u0006T\n8(\u000ee\u001cj\u001dMd\u00009/\u000eJ\n.5Hn\u00008/\u0002s\u0017?9\u0002N!\u0015\u001dmD \u0019\u000fqJ*\u000e\u0015hN \u0018p\u0006W\u0010(0GdIf\u0015jX5\u001f\u001ebN&fu\u0006A\u0017#9@c\t3p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u000b2@h\u0011+(Gh\u000bj\u0011Ac\f,5KuI>.[bI\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`X(\u0005\u0018gA,\u000f\u000e\u0002/$$2As\u0004>9J+I\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`+Lb\u0012AiH\u000b2@h\u0011+(KcIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eF\u00079(\\f\u0006>|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX$\b\u000fzU$\t\bqJ*\u000e\u0015hN \u0018p\u0006F\u00079(\\f\u0006>p\u0002N!\u0015\u001dlT1\u0018\u001dmSIct`h\u000bg\u001dLt\u00118=MsIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eA\f$=B\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001agI$\u0006\u0003cH!\u0003\u001agB7fthn\u000b+0\u0002+,\u000e\u0003hN+\u000b\u0010\u0002.M\u00043@*##2OkIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eT\u001185Ms#\u001a|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX6\u001e\u000egD1\f\fqJ*\u000e\u0015hN \u0018p\u0006T\u001185Ms#\u001ap\u0002N!\u0015\u000fzU,\t\bhWIct`h\u000bg\u000fZu\f)(hWIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.Lb\u001fBf\u001699]+I\u0003\u0018qD)\u000b\u000f}+M\u00193\\sE(%\u000eI\u0004\'9\u0002s\u0017?9\u0002N!\u0015\u0012oJ fu\u0006T\n8(\u000ee\u001cj\u001dMd\u00009/\u000eJ\n.5Hn\u00008/\u0002s\u0017?9\u0002N!\u0015\u001dmD \u0019\u000fqJ*\u000e\u0015hN \u0018p\u0006W\u0010(0GdIf\u0015jX5\u001f\u001ebN&fu\u0006A\u0017#9@c\t3p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u000b2@h\u0011+(Gh\u000bj\u0011Ac\f,5KuI>.[bI\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`X(\u0005\u0018gA,\u000f\u000e\u0002/$$2As\u0004>9J+I\u0003\u0018qF+\u0004\u0013zF1\u0003\u0013`+Lb\u0012AiH\u000b2@h\u0011+(KcIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eF\u00079(\\f\u0006>|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX$\b\u000fzU$\t\bqJ*\u000e\u0015hN \u0018p\u0006F\u00079(\\f\u0006>p\u0002N!\u0015\u001dlT1\u0018\u001dmSIct`h\u000bg\u001dLt\u00118=MsIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eA\f$=B\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001agI$\u0006\u0003cH!\u0003\u001agB7fthn\u000b+0\u0002+,\u000e\u0003hN+\u000b\u0010\u0002.M\u00043@*##2OkIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.M\u00193\\sE(%\u000eT\u001185Ms#\u001a|ch\u0001#:Gb\u0017f(\\r\u0000f\u0015jX6\u001e\u000egD1\f\fqJ*\u000e\u0015hN \u0018p\u0006T\u001185Ms#\u001ap\u0002N!\u0015\u000fzU,\t\bhWIct`h\u000bg\u000fZu\f)(hWIf\u0015jX+\u0005\u0012qJ*\u000e\u0015hN \u000ep\u0007.Lb\u0015@s\u00008:Od\u00009p\u0002N!\u0015\u0015`S \u0018\u001aoD ft}h\u0017>|L~E\u0004=CbI>.[bI\u0003\u0018qI$\u0007\u0019\u0002.M\u00193\\sE(%\u000eF\u0006)9]tE\u00073Jn\u0003#9\\tI>.[bI\u0003\u0018qF&\t\u0019}T:\u0007\u0013jN#\u0003\u0019|+M\u001a)Lk\f)p\u0002N!\u0015\f{E)\u0003\u001f\u0002.M\f.Gb\u000b.0W+I\u0003\u0018qI*\u0004\u0003cH!\u0003\u001agB!fu\u0007/6%.Z\'\u00073|oi\u000b%(Os\f%2\u000eJ\n.5Hn\u00008pZu\u0010/pgC:\u000b\u0012`H1\u000b\bgH+\u0015\u0011aC,\f\u0015kUIb\u001d@i\n>=Zb\u0001fpgC:\u000b\u0012`H1\u000b\bgH+fu\u0006I\n$qoi\u000b%(Os\u0000.p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u000b>]s\u0017+?Z\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u001dlT1\u0018\u001dmS:\u0007\u0013jN#\u0003\u0019|+M\u000b>]s\u0017+?Z+I\u0003\u0018qF\'\u0019\b|F&\u001ep\u0007/+%2\u0003F\u00079(\\f\u0006>p\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lct}h\u0017>|L~E\u0019(\\n\u0006>\u001a~\'(%8Ga\f/.\u0002s\u0017?9\u0002N!\u0015\u000fzU,\t\bhW:\u0007\u0013jN#\u0003\u0019|+M\u0019(\\n\u0006>\u001a~+I\u0003\u0018qT1\u0018\u0015mS#\u001ap\u0007/+%2\u0003T\u001185Ms#\u001ap\u0002N!\u0015\u0012aI:\u0007\u0013jN#\u0003\u0019j+Lcu"));
               ((SorterSetting)var3).setSorterRoot(var4);
            }
         } catch (JindentException var5) {
            var5.printStackTrace();
         }
      }

      if(var3 == null) {
         jindent.debugger.a.b(a("\u001fOi\u000b%(\u000eu\u0000)3Ii\f09\u000es\u001c:9\u0014\'") + var1 + a("|Hu\n\'|vJ)j/Fb\u0000>"));
      }

      return (Setting)var3;
   }

   private String getQualifiedRootNode(CustomizerTreeNode var1) {
      return var1.getParent() != null?this.getQualifiedRootNode((CustomizerTreeNode)var1.getParent()) + "/" + var1.getName():var1.getName();
   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 92;
            break;
         case 1:
            var10003 = 46;
            break;
         case 2:
            var10003 = 7;
            break;
         case 3:
            var10003 = 101;
            break;
         default:
            var10003 = 74;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
