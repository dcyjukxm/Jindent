package jindent;

import java.beans.DefaultPersistenceDelegate;
import java.beans.XMLEncoder;
import jindent.JindentSettings;
import jindent.SettingsUtils$1;

public class SettingsUtils {
   public static final String JINDENT_SETTINGS_EXTENSION = "xjs";
   private static final String GENERAL = "/+HXL)\"";
   private static final String ENVIRONMENT = "- PTL\' KXP<";
   private static final String IDE = "!*C";
   static Class class$jindent$settings$AbsoluteRelativeINumberSetting;
   static Class class$jindent$settings$BAWrappingSetting;
   static Class class$jindent$settings$LineWrappingPolicySetting;
   static Class class$jindent$settings$BooleanSetting;
   static Class class$jindent$settings$BracesSetting;
   static Class class$jindent$settings$DefaultSetting;
   static Class class$jindent$settings$DefaultSettingSet;
   static Class class$jindent$settings$DateFormatSetting;
   static Class class$jindent$settings$EncodingSetting;
   static Class class$jindent$settings$EndOfLineFormatSetting;
   static Class class$jindent$settings$ExtensionManagerSetting;
   static Class class$jindent$settings$FloatSetting;
   static Class class$jindent$settings$FooterSetting;
   static Class class$jindent$settings$HeaderSetting;
   static Class class$jindent$settings$INumberSetting;
   static Class class$jindent$settings$IndentationSetting;
   static Class class$jindent$settings$DocTypeSetting;
   static Class class$jindent$settings$LogFileSetting;
   static Class class$jindent$settings$MessageReportSetting;
   static Class class$jindent$settings$NumberSetting;
   static Class class$jindent$settings$NZNumberSetting;
   static Class class$jindent$settings$PositionSetting;
   static Class class$jindent$settings$Setting;
   static Class class$jindent$settings$SorterSetting;
   static Class class$jindent$settings$StringArraySetting;
   static Class class$jindent$settings$StringSetting;
   static Class class$jindent$settings$SystemVariablesSetting;
   static Class class$jindent$settings$UserVariablesSetting;
   static Class class$jindent$settings$WrappingSetting;
   static Class class$jindent$settings$PackageListOfRegExSetting;
   static Class class$jindent$settings$RegExPackage;
   static Class class$jindent$settings$PreProcessorIndentationSetting;
   static Class class$jindent$settings$sorter$SorterElement;
   static Class class$jindent$settings$sorter$OptionalSorterElement;
   static Class class$jindent$settings$extensionmanager$ExtensionAssignment;
   static Class class$jindent$settings$uservariables$UserVariable;
   static Class class$jindent$Settings;
   static Class class$jindent$JindentSettings;

   public static String createSettingKey(String var0, String var1) {
      return var0 != null?var0 + "." + var1:var1;
   }

   public static String createEnvironmentKey(String var0) {
      return createSettingKey(a("- PTL\' KXP<"), var0);
   }

   public static String createIDEKey(String var0) {
      return createSettingKey(a("!*C"), var0);
   }

   public static String createGeneralKey(String var0) {
      return createSettingKey(a("/+HXL)\""), var0);
   }

   public static String createExtensionManagerKey() {
      return createGeneralKey(a("-6RXP;\'ISs) GZ[:"));
   }

   public static String extractFilename(String var0) {
      int var1 = var0.lastIndexOf("/");
      int var2 = var0.lastIndexOf("\\");
      int var3 = Math.max(var1, var2);
      return var3 == -1?var0:var0.substring(var3, var0.length());
   }

   public static String removeExtension(String var0) {
      int var1 = var0.lastIndexOf(".");
      return var1 == -1?var0:var0.substring(0, var1);
   }

   public static boolean isValidSettingsFilename(String var0) {
      return var0.toLowerCase().endsWith(a("f6LN"));
   }

   public static String createValidSettingsFilename(String var0) {
      return removeExtension(var0) + "." + "xjs";
   }

   public static String createFilenameFromSettings(JindentSettings var0) {
      String var1 = var0.getString(createEnvironmentKey(a("+!HK[&:ORP\u0006/KX")));
      return var1 != null && !var1.equals("")?createValidSettingsFilename(encodeToFilename(var1)):createValidSettingsFilename(a("\u0006!h\\S-"));
   }

   public static String encodeToFilename(String var0) {
      StringBuffer var1 = new StringBuffer();
      int var2 = var0.length();
      boolean var3 = false;

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = var1.length();
         char var6 = var5 == 0?32:var1.charAt(var5 - 1);
         char var7 = var0.charAt(var4);
         switch(var7) {
         case '&':
         case '/':
         case '<':
         case '>':
         case '\\':
            break;
         case ')':
            if(var4 == var2 - 1) {
               break;
            }
         case ' ':
         case '(':
            if(var6 != 45) {
               var1.append('-');
            }
            break;
         default:
            var1.append(var7);
         }
      }

      return var1.toString();
   }

   public static String extractExtensionFromFilename(String var0) {
      int var1 = var0.lastIndexOf(".");
      return var1 == -1?"":var0.substring(var1 + 1, var0.length()).toLowerCase();
   }

   public static void initXMLEncoder(XMLEncoder var0) {
      Class[] var1 = new Class[]{class$jindent$settings$AbsoluteRelativeINumberSetting == null?(class$jindent$settings$AbsoluteRelativeINumberSetting = class$(a("\"\'HY[&:\bN[<:OSY;`g_M\'\"SI[\u001a+J\\J!8Ctp=#DXL\u001b+RIW&)"))):class$jindent$settings$AbsoluteRelativeINumberSetting, class$jindent$settings$BAWrappingSetting == null?(class$jindent$settings$BAWrappingSetting = class$(a("\"\'HY[&:\bN[<:OSY;`d|i:/VMW&)uXJ<\'HZ"))):class$jindent$settings$BAWrappingSetting, class$jindent$settings$LineWrappingPolicySetting == null?(class$jindent$settings$LineWrappingPolicySetting = class$(a("\"\'HY[&:\bN[<:OSY;`jTP-\u0019T\\N8\'HZn\'\"O^G\u001b+RIW&)"))):class$jindent$settings$LineWrappingPolicySetting, class$jindent$settings$BooleanSetting == null?(class$jindent$settings$BooleanSetting = class$(a("\"\'HY[&:\bN[<:OSY;`dRQ$+GSm-:RTP/"))):class$jindent$settings$BooleanSetting, class$jindent$settings$BracesSetting == null?(class$jindent$settings$BracesSetting = class$(a("\"\'HY[&:\bN[<:OSY;`dO_++Un[<:OSY"))):class$jindent$settings$BracesSetting, class$jindent$settings$DefaultSetting == null?(class$jindent$settings$DefaultSetting = class$(a("\"\'HY[&:\bN[<:OSY;`bXX);JIm-:RTP/"))):class$jindent$settings$DefaultSetting, class$jindent$settings$DefaultSettingSet == null?(class$jindent$settings$DefaultSettingSet = class$(a("\"\'HY[&:\bN[<:OSY;`bXX);JIm-:RTP/\u001dCI"))):class$jindent$settings$DefaultSettingSet, class$jindent$settings$DateFormatSetting == null?(class$jindent$settings$DateFormatSetting = class$(a("\"\'HY[&:\bN[<:OSY;`b\\J-\bIOS):uXJ<\'HZ"))):class$jindent$settings$DateFormatSetting, class$jindent$settings$EncodingSetting == null?(class$jindent$settings$EncodingSetting = class$(a("\"\'HY[&:\bN[<:OSY;`cS]\'*OSY\u001b+RIW&)"))):class$jindent$settings$EncodingSetting, class$jindent$settings$EndOfLineFormatSetting == null?(class$jindent$settings$EndOfLineFormatSetting = class$(a("\"\'HY[&:\bN[<:OSY;`cSZ\u0007(jTP-\bIOS):uXJ<\'HZ"))):class$jindent$settings$EndOfLineFormatSetting, class$jindent$settings$ExtensionManagerSetting == null?(class$jindent$settings$ExtensionManagerSetting = class$(a("\"\'HY[&:\bN[<:OSY;`cEJ- UTQ&\u0003GS_/+Tn[<:OSY"))):class$jindent$settings$ExtensionManagerSetting, class$jindent$settings$FloatSetting == null?(class$jindent$settings$FloatSetting = class$(a("\"\'HY[&:\bN[<:OSY;``QQ):uXJ<\'HZ"))):class$jindent$settings$FloatSetting, class$jindent$settings$FooterSetting == null?(class$jindent$settings$FooterSetting = class$(a("\"\'HY[&:\bN[<:OSY;``RQ<+Tn[<:OSY"))):class$jindent$settings$FooterSetting, class$jindent$settings$HeaderSetting == null?(class$jindent$settings$HeaderSetting = class$(a("\"\'HY[&:\bN[<:OSY;`nX_,+Tn[<:OSY"))):class$jindent$settings$HeaderSetting, class$jindent$settings$INumberSetting == null?(class$jindent$settings$INumberSetting = class$(a("\"\'HY[&:\bN[<:OSY;`osK%,COm-:RTP/"))):class$jindent$settings$INumberSetting, class$jindent$settings$IndentationSetting == null?(class$jindent$settings$IndentationSetting = class$(a("\"\'HY[&:\bN[<:OSY;`oSZ- R\\J!!Hn[<:OSY"))):class$jindent$settings$IndentationSetting, class$jindent$settings$DocTypeSetting == null?(class$jindent$settings$DocTypeSetting = class$(a("\"\'HY[&:\bN[<:OSY;`bR]\u001c7VXm-:RTP/"))):class$jindent$settings$DocTypeSetting, class$jindent$settings$LogFileSetting == null?(class$jindent$settings$LogFileSetting = class$(a("\"\'HY[&:\bN[<:OSY;`jRY\u000e\'JXm-:RTP/"))):class$jindent$settings$LogFileSetting, class$jindent$settings$MessageReportSetting == null?(class$jindent$settings$MessageReportSetting = class$(a("\"\'HY[&:\bN[<:OSY;`kXM;/AXl->IOJ\u001b+RIW&)"))):class$jindent$settings$MessageReportSetting, class$jindent$settings$NumberSetting == null?(class$jindent$settings$NumberSetting = class$(a("\"\'HY[&:\bN[<:OSY;`hHS*+Tn[<:OSY"))):class$jindent$settings$NumberSetting, class$jindent$settings$NZNumberSetting == null?(class$jindent$settings$NZNumberSetting = class$(a("\"\'HY[&:\bN[<:OSY;`hgp=#DXL\u001b+RIW&)"))):class$jindent$settings$NZNumberSetting, class$jindent$settings$PositionSetting == null?(class$jindent$settings$PositionSetting = class$(a("\"\'HY[&:\bN[<:OSY;`vRM!:ORP\u001b+RIW&)"))):class$jindent$settings$PositionSetting, class$jindent$settings$Setting == null?(class$jindent$settings$Setting = class$(a("\"\'HY[&:\bN[<:OSY;`uXJ<\'HZ"))):class$jindent$settings$Setting, class$jindent$settings$SorterSetting == null?(class$jindent$settings$SorterSetting = class$(a("\"\'HY[&:\bN[<:OSY;`uRL<+Tn[<:OSY"))):class$jindent$settings$SorterSetting, class$jindent$settings$StringArraySetting == null?(class$jindent$settings$StringArraySetting = class$(a("\"\'HY[&:\bN[<:OSY;`uIL! A|L:/_n[<:OSY"))):class$jindent$settings$StringArraySetting, class$jindent$settings$StringSetting == null?(class$jindent$settings$StringSetting = class$(a("\"\'HY[&:\bN[<:OSY;`uIL! An[<:OSY"))):class$jindent$settings$StringSetting, class$jindent$settings$SystemVariablesSetting == null?(class$jindent$settings$SystemVariablesSetting = class$(a("\"\'HY[&:\bN[<:OSY;`uDM<+Kk_:\'G_R-=uXJ<\'HZ"))):class$jindent$settings$SystemVariablesSetting, class$jindent$settings$UserVariablesSetting == null?(class$jindent$settings$UserVariablesSetting = class$(a("\"\'HY[&:\bN[<:OSY;`sN[:\u0018GOW),JXM\u001b+RIW&)"))):class$jindent$settings$UserVariablesSetting, class$jindent$settings$WrappingSetting == null?(class$jindent$settings$WrappingSetting = class$(a("\"\'HY[&:\bN[<:OSY;`qO_8>OSY\u001b+RIW&)"))):class$jindent$settings$WrappingSetting, class$jindent$settings$PackageListOfRegExSetting == null?(class$jindent$settings$PackageListOfRegExSetting = class$(a("\"\'HY[&:\bN[<:OSY;`v\\]#/AXr!=RrX\u001a+AxF\u001b+RIW&)"))):class$jindent$settings$PackageListOfRegExSetting, class$jindent$settings$RegExPackage == null?(class$jindent$settings$RegExPackage = class$(a("\"\'HY[&:\bN[<:OSY;`tXY\r6v\\]#/AX"))):class$jindent$settings$RegExPackage, class$jindent$settings$PreProcessorIndentationSetting == null?(class$jindent$settings$PreProcessorIndentationSetting = class$(a("\"\'HY[&:\bN[<:OSY;`vO[\u0018<I^[;=IOw&*CSJ):ORP\u001b+RIW&)"))):class$jindent$settings$PreProcessorIndentationSetting};
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Class var4 = var1[var3];
         var0.setPersistenceDelegate(var4, new DefaultPersistenceDelegate(new String[]{a("&/KX")}));
      }

      var0.setPersistenceDelegate(class$jindent$settings$sorter$SorterElement == null?(class$jindent$settings$sorter$SorterElement = class$(a("\"\'HY[&:\bN[<:OSY;`URL<+T\u0013m\'<RXL\r\"CP[&:"))):class$jindent$settings$sorter$SorterElement, new DefaultPersistenceDelegate(new String[]{a("&/KX"), a("!*")}));
      var0.setPersistenceDelegate(class$jindent$settings$sorter$OptionalSorterElement == null?(class$jindent$settings$sorter$OptionalSorterElement = class$(a("\"\'HY[&:\bN[<:OSY;`URL<+T\u0013q8:ORP)\"uRL<+TxR-#CSJ"))):class$jindent$settings$sorter$OptionalSorterElement, new DefaultPersistenceDelegate(new String[]{a("&/KX"), a("!*"), a(";!TI")}));
      var0.setPersistenceDelegate(class$jindent$settings$extensionmanager$ExtensionAssignment == null?(class$jindent$settings$extensionmanager$ExtensionAssignment = class$(a("\"\'HY[&:\bN[<:OSY;`CEJ- UTQ&#GS_/+T\u0013{0:CSM!!H|M;\'ASS- R"))):class$jindent$settings$extensionmanager$ExtensionAssignment, new DefaultPersistenceDelegate(new String[]{a("-6RXP;\'IS"), a(".!TP_<:COp)#C")}));
      var0.setPersistenceDelegate(class$jindent$settings$uservariables$UserVariable == null?(class$jindent$settings$uservariables$UserVariable = class$(a("\"\'HY[&:\bN[<:OSY;`SN[:8GOW),JXMf\u001bUXL\u001e/TT_*\"C"))):class$jindent$settings$uservariables$UserVariable, new DefaultPersistenceDelegate(new String[]{a("&/KX"), a(">/JH[")}));
      var0.setPersistenceDelegate(class$jindent$Settings == null?(class$jindent$Settings = class$(a("\"\'HY[&:\bn[<:OSY;"))):class$jindent$Settings, new DefaultPersistenceDelegate(new String[]{a(";+RIW&)Up_8")}));
      var0.setPersistenceDelegate(class$jindent$JindentSettings == null?(class$jindent$JindentSettings = class$(a("\"\'HY[&:\bwW&*CSJ\u001b+RIW&)U"))):class$jindent$JindentSettings, new DefaultPersistenceDelegate(new String[]{a(";+RIW&)Up_8")}));
      var0.setExceptionListener(new SettingsUtils$1());
   }

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
            var10003 = 72;
            break;
         case 1:
            var10003 = 78;
            break;
         case 2:
            var10003 = 38;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 62;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
