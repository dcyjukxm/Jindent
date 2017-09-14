package jindent;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import jindent.ExtensionManager;
import jindent.JindentException;
import jindent.JindentSystem;
import jindent.Settings;
import jindent.SettingsUtils;
import jindent.SettingsVersionException;
import jindent.imports.a.b;
import jindent.settings.BracesSetting;
import jindent.settings.FloatSetting;
import jindent.settings.Setting;
import jindent.settings.VersionInfo;
import jindent.settings.sorter.OptionalSorterElement;
import jindent.settings.sorter.SorterElement;

public class JindentSettings extends Settings implements VersionInfo {
   private static final float VERSION = 5.98F;
   private static final String VERSION_NAME = "C~b\u0018-Zu";
   private static final long serialVersionUID = 3256718498527982391L;

   public JindentSettings() {
      this(new HashMap());
   }

   public JindentSettings(HashMap var1) {
      super(var1);
      Setting var2 = this.getSetting(b("C~b\u0018-Zu"));
      if(var2 == null || !(var2 instanceof FloatSetting)) {
         FloatSetting var3 = new FloatSetting(b("C~b\u0018-Zu"));
         var3.setValue(5.98F);
         this.putSetting(b("C~b\u0018-Zu"), var3);
      }

   }

   public float getVersion() {
      return this.getFloat(b("C~b\u0018-Zu"));
   }

   public void writeToFile(String var1) throws JindentException {
      super.writeToFile(var1);
   }

   public String toXml(String var1) throws IOException, JindentException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      this.writeToXML(var2);
      byte[] var3 = var2.toByteArray();
      var2.close();
      return new String(var3, var1);
   }

   public static JindentSettings createFromXmlAndCheckVersion(String var0, String var1) throws JindentException, SettingsVersionException, IOException {
      byte[] var2 = var1.getBytes(var0);
      ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
      return readFromXMLAndCheckVersion(var3);
   }

   public static Settings createFromResource(String var0) throws JindentException, FileNotFoundException {
      Settings var1 = Settings.createFromResource(var0);
      HashMap var2 = var1.getSettingsMap();
      return new JindentSettings(var2);
   }

   public static Settings createFromFile(String var0) throws JindentException, FileNotFoundException {
      return new JindentSettings(Settings.createFromFile(var0).getSettingsMap());
   }

   public static JindentSettings createFromFileAndCheckVersion(String var0) throws JindentException, FileNotFoundException, SettingsVersionException {
      try {
         if(var0.toLowerCase().endsWith(b("\u001bqy\u0005"))) {
            b var6 = new b();
            var6.o(var0);
            float var7 = var6.getVersion();
            if(var7 == -1.0F) {
               throw new JindentException(b("pib\u00046\u0015lx\u0002(P;b\u000e%Qr~\fdF~d\u001f-[|cK\"\\wuEN|o0\u0018!PvcK0Z;r\u000edTu0\u0004(Q;Z\u0002*Q~~\u001fdF~d\u001f-[|cK\"\\wuGdWndK2Pic\u0002+[;~\u001e)W~bK\'Tu~\u00040\u0015yuK6Px\u007f\f*\\au\u000fe"));
            } else if(var7 < 5.98F) {
               throw new SettingsVersionException(b("ste\u0005 \u0015hu\u001f0\\uw\u0018dSi\u007f\u0006dT;`\u0019!Cr\u007f\u001e7\u0015Qy\u0005 PudK2Pic\u0002+[5"), var7, 5.98F, var6);
            } else {
               throw new SettingsVersionException(b("ste\u0005 \u0015hu\u001f0\\uw\u0018dSi\u007f\u0006dT;v\u001e0@iuK\u000e\\ut\u000e*A;f\u000e6Fr\u007f\u0005j"), var7, 5.98F, var6);
            }
         } else {
            try {
               FileInputStream var1 = new FileInputStream(var0);
               JindentSettings var2 = readFromXMLAndCheckVersion(var1);
               var1.close();
               return var2;
            } catch (ClassCastException var3) {
               throw new JindentException(b("pib\u00046\u0015lx\u0002(P;b\u000e%Qr~\fdF~d\u001f-[|cK\"\\wuEN|o0\u0018!PvcK7Pod\u0002*R;v\u0002(P;y\u0018d[tdK%\u0015Qy\u0005 PudK7Pod\u0002*R;v\u0002(P:"));
            }
         }
      } catch (FileNotFoundException var4) {
         throw new FileNotFoundException(b("vz~\u0005+A;v\u0002*Q;Z\u0002*Q~~\u001fdF~d\u001f-[|cK\"\\wuKf") + var0 + b("\u00175"));
      } catch (IOException var5) {
         throw new JindentException(var5.getMessage());
      }
   }

   protected static JindentSettings readFromXMLAndCheckVersion(InputStream var0) throws IOException, FileNotFoundException, JindentException, SettingsVersionException {
      JindentSettings var1 = null;

      try {
         var1 = (JindentSettings)Settings.readFromXML(var0);
      } catch (Exception var4) {
         throw new JindentException(b("pib\u00046\u0015lx\u0002(P;b\u000e%Qr~\fdF~d\u001f-[|cK\"\\wuENxzi\t!\u0015ox\u00027\u0015}y\u0007!\u0015rcK*Zo0\nd\u007fr~\u000f![o0\u0018!Aoy\u0005#F;v\u0002(P$"));
      }

      Setting var2 = var1.getSetting(b("C~b\u0018-Zu"));
      if(var2 == null) {
         throw new JindentException(b("vz~\u0005+A;v\u0002*Q;f\u000e6Fr\u007f\u0005d\\u0\u0018!Aoy\u0005#\u0015}y\u0007!\u0014"));
      } else if(var2 instanceof FloatSetting) {
         float var3 = ((FloatSetting)var2).getValue();
         if(var3 < 5.98F) {
            throw new SettingsVersionException(b("ste\u0005 \u0015hu\u001f0\\uw\u0018dSi\u007f\u0006dT;`\u0019!Cr\u007f\u001e7\u0015Qy\u0005 PudK2Pic\u0002+[5"), var3, 5.98F, var1);
         } else if(var3 > 5.98F) {
            throw new SettingsVersionException(b("ste\u0005 \u0015hu\u001f0\\uw\u0018dSi\u007f\u0006dT;v\u001e0@iuK\u000e\\ut\u000e*A;f\u000e6Fr\u007f\u0005j"), var3, 5.98F, var1);
         } else {
            return var1;
         }
      } else {
         throw new JindentException(b("c~b\u0018-Zu0\u0002*\u0015hu\u001f0\\uwK\"\\wuK-F;g\u0019+[|0\u001f=E~1"));
      }
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public ExtensionManager getExtensionManager() {
      return super.getExtensionManager(SettingsUtils.createExtensionManagerKey());
   }

   public VersionInfo convertToCurrentSettings() {
      JindentSettings var1 = JindentSystem.getDefaultJindentSettings();
      Iterator var2 = this.getSettingsMap().keySet().iterator();

      while(true) {
         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            boolean var11;
            if(var3.equals(b("_zf\njBiq\u001b\u0007]zy\u0005!QVu\u001f,Z\u007fS\u0004*Fob\u001e\'Atb(%Ywc")) && this.getVersion() < 5.94F) {
               var11 = this.getBoolean(b("_zf\njBiq\u001b\u0007]zy\u0005!QVu\u001f,Z\u007fS\u0004*Fob\u001e\'Atb(%Ywc"));
               if(var11) {
                  var1.setWrappingIndex(b("_zf\njBiq\u001b\u0007]zy\u0005!QVu\u001f,Z\u007fS\u0004*Fob\u001e\'Atb(%Ywc"), 1);
               } else {
                  var1.setWrappingIndex(b("_zf\njBiq\u001b\u0007]zy\u0005!QVu\u001f,Z\u007fS\u0004*Fob\u001e\'Atb(%Ywc"), 3);
               }
            } else if(var3.equals(b("_zf\njTw|\u00043biq\u001b4\\uw$\"srb\u00180tiw\u001e)Pud$\"{~c\u001f!QVu\u001f,Z\u007fS\n(Yh")) && this.getVersion() < 5.94F) {
               var11 = this.getBoolean(b("_zf\njTw|\u00043biq\u001b4\\uw$\"srb\u00180tiw\u001e)Pud$\"{~c\u001f!QVu\u001f,Z\u007fS\n(Yh"));
               if(var11) {
                  var1.setWrappingIndex(b("_zf\njBiq\u001b\u0002\\ic\u001f\u0005G|e\u0006![o_\r\nPhd\u000e x~d\u0003+QX\u007f\u00057Aie\b0ZiS\n(Yh"), 1);
               } else {
                  var1.setWrappingIndex(b("_zf\njBiq\u001b\u0002\\ic\u001f\u0005G|e\u0006![o_\r\nPhd\u000e x~d\u0003+QX\u007f\u00057Aie\b0ZiS\n(Yh"), 3);
               }
            } else if(var3.equals(b("Vk`E%Yw\u007f\u001c\u0013Gz`\u001b-[|_\r\u0002\\ic\u001f\u0005G|e\u0006![o_\r\nPhd\u000e x~d\u0003+QXq\u0007(F")) && this.getVersion() < 5.94F) {
               var11 = this.getBoolean(b("Vk`E%Yw\u007f\u001c\u0013Gz`\u001b-[|_\r\u0002\\ic\u001f\u0005G|e\u0006![o_\r\nPhd\u000e x~d\u0003+QXq\u0007(F"));
               if(var11) {
                  var1.setWrappingIndex(b("Vk`E3Gz`--Ghd*6Rn}\u000e*ATv%!Fou\u000f\tPox\u0004 vt~\u00180Gns\u001f+GXq\u0007(F"), 1);
               } else {
                  var1.setWrappingIndex(b("Vk`E3Gz`--Ghd*6Rn}\u000e*ATv%!Fou\u000f\tPox\u0004 vt~\u00180Gns\u001f+GXq\u0007(F"), 3);
               }
            } else {
               SorterElement var5;
               SorterElement var6;
               SorterElement var7;
               SorterElement var8;
               Enumeration var9;
               SorterElement var10;
               SorterElement var13;
               if(var3.equals(b("_zf\nj\\v`\u00046A_u\b(Tiq\u001f-Zuc8+Gou\u0019")) && this.getVersion() < 5.93F) {
                  var13 = this.getSorterElement(b("_zf\nj\\v`\u00046A_u\b(Tiq\u001f-Zuc8+Gou\u0019"));
                  var5 = var13.getFirstChildById(19);
                  var6 = var1.getSorterElement(b("_zf\nj\\v`\u00046A_u\b(Tiq\u001f-Zuc8+Gou\u0019"));
                  var7 = var6.getFirstChildById(19);
                  var8 = var7.getFirstChildById(69);
                  if(var8 instanceof OptionalSorterElement) {
                     ((OptionalSorterElement)var8).setSort(false);
                  }

                  var7.removeAllChildren();
                  var9 = var5.children();

                  while(var9.hasMoreElements()) {
                     var10 = (SorterElement)var9.nextElement();
                     var7.add((SorterElement)var10.clone());
                  }

                  var7.add(var8);
               } else if(var3.equals(b("_zf\njVwq\u00187|ud\u000e6Szs\u000e\u0001[n}/!Vwq\u0019%Ar\u007f\u00057ftb\u001f!G")) && this.getVersion() < 5.93F) {
                  var13 = this.getSorterElement(b("_zf\njVwq\u00187|ud\u000e6Szs\u000e\u0001[n}/!Vwq\u0019%Ar\u007f\u00057ftb\u001f!G"));
                  var5 = var13.getFirstChildById(5);
                  var6 = var1.getSorterElement(b("_zf\njVwq\u00187|ud\u000e6Szs\u000e\u0001[n}/!Vwq\u0019%Ar\u007f\u00057ftb\u001f!G"));
                  var7 = var6.getFirstChildById(5);
                  var8 = var7.getFirstChildById(71);
                  if(var8 instanceof OptionalSorterElement) {
                     ((OptionalSorterElement)var8).setSort(false);
                  }

                  var7.removeAllChildren();
                  var9 = var5.children();

                  while(var9.hasMoreElements()) {
                     var10 = (SorterElement)var9.nextElement();
                     var7.add((SorterElement)var10.clone());
                  }

                  var7.add(var8);
               } else {
                  BracesSetting var12;
                  if(var3.equals(b("_zf\njR~~\u000e6TwR\u0019%V~C\u001f=Y~")) && this.getVersion() < 5.91F) {
                     var12 = this.getBracesSetting(b("_zf\njR~~\u000e6TwR\u0019%V~C\u001f=Y~"));
                     var1.setBracesSetting(b("_zf\njYt\u007f\u001b\u0006Gzs\u000e\u0017Ab|\u000e"), var12);
                     var1.setBracesSetting(b("_zf\njFly\u001f\']Xq\u0018!wiq\b!foi\u0007!"), var12);
                     var1.setBracesSetting(b("_zf\nj\\}U\u00077PYb\n\'PHd\u0012(P"), var12);
                     var1.setBracesSetting(b("_zf\njWw\u007f\b/wiq\b!foi\u0007!"), var12);
                     var1.setBracesSetting(b("_zf\nj\\}U\u00077PYb\n\'PHd\u0012(P"), var12);
                  } else if(var3.equals(b("Vk`E#Puu\u0019%YYb\n\'PHd\u0012(P")) && this.getVersion() < 5.91F) {
                     var12 = this.getBracesSetting(b("Vk`E#Puu\u0019%YYb\n\'PHd\u0012(P"));
                     var1.setBracesSetting(b("Vk`E(Zt`)6Txu80Lwu"), var12);
                     var1.setBracesSetting(b("Vk`E7Brd\b,vzc\u000e\u0006Gzs\u000e\u0017Ab|\u000e"), var12);
                     var1.setBracesSetting(b("Vk`E-S^|\u0018!wiq\b!foi\u0007!"), var12);
                     var1.setBracesSetting(b("Vk`E&Yts\u0000\u0006Gzs\u000e\u0017Ab|\u000e"), var12);
                     var1.setBracesSetting(b("Vk`E-S^|\u0018!wiq\b!foi\u0007!"), var12);
                  } else if(var3.equals(b("_zf\njTw|\u00043biq\u001b4\\uw*\"A~b\'!So@\n6Pud\u0003!F~c")) && this.getVersion() < 5.9F) {
                     var11 = this.getBoolean(var3);
                     var1.setBoolean(b("_zf\njTw|\u00043biq\u001b4\\uw*\"A~b\'!So@\n6Pud\u0003!F~c$\"foq\u001f!X~~\u001f7"), var11);
                     var1.setBoolean(b("_zf\njTw|\u00043biq\u001b4\\uw*\"A~b\'!So@\n6Pud\u0003!F~c$\"tu~\u00040Toy\u0004*F"), var11);
                     var1.setBoolean(b("_zf\njTw|\u00043biq\u001b4\\uw*\"A~b\'!So@\n6Pud\u0003!F~c$\"pue\u00067"), var11);
                  } else if(var3.equals(b("Vk`E%Yw\u007f\u001c\u0013Gz`\u001b-[|Q\r0Pi\\\u000e\"AKq\u0019![ox\u000e7Ph")) && this.getVersion() < 5.9F) {
                     var11 = this.getBoolean(var3);
                     var1.setBoolean(b("Vk`E%Yw\u007f\u001c\u0013Gz`\u001b-[|Q\r0Pi\\\u000e\"AKq\u0019![ox\u000e7Ph_\r\u0017Azd\u000e)Pud\u0018"), var11);
                  } else if(var3.equals(b("Vk`E-[\u007fu\u00050eiu\u001b6Zxu\u00187ZiT\u00026Pxd\u00022Ph")) && this.getVersion() < 5.9F) {
                     var11 = this.getBoolean(var3);
                     var1.setPreProcessorIndentationIndex(var3, var11?0:1);
                  } else if((!var3.equals(b("R~~\u000e6Tw>\u000e<A~~\u0018-Zu]\n*T|u\u0019")) || this.getVersion() >= 5.8F) && !var3.equals(b("C~b\u0018-Zu"))) {
                     Setting var4 = (Setting)this.getSetting(var3).clone();
                     var1.putSetting(var3, var4);
                  }
               }
            }
         }

         return var1;
      }
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 53;
            break;
         case 1:
            var10003 = 27;
            break;
         case 2:
            var10003 = 16;
            break;
         case 3:
            var10003 = 107;
            break;
         default:
            var10003 = 68;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
