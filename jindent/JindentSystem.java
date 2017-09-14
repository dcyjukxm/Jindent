package jindent;

import java.util.Vector;
import jindent.AboutInfo;
import jindent.ExtensionManager;
import jindent.JindentSettings;
import jindent.customizer.javahelp.HelpUtils;
import jindent.installation.InstallationContext;
import jindent.installation.JarFileInstallationContext;
import jindent.settings.ExtensionManagerSetting;

public class JindentSystem {
   public static final int EXIT_CODE_NORMAL = 0;
   public static final int EXIT_CODE_ERROR = 1;
   public static final int EXIT_CODE_WARNING = 2;
   public static final int DEFAULT_NODES = 0;
   public static final int IMPORT_EXPORT_NODE = 1;
   private static final String DEFAULT_JINDENT_SETTINGS_HOME = System.getProperty(a("\u00015\u001bW`\u001c)\u0013@")) + a("[h\u0014L \u0010#\u0010Q");
   private static final String DEFAULT_JINDENT_SETTINGS_LOCATION;
   private static final String DEFAULT_JINDENT_SETTINGS_FILENAME = "[,\u0017K*\u0011(\n\n=\u00112\nL \u00135QA+\u0012\'\u000bI:[\f\u0017K*\u0011(\nv+\u00002\u0017K)\u0007h\u0006O=";
   private static JindentSettings defaultSettings;
   private static InstallationContext context;
   private static Vector registeredAbout;
   private static boolean takeCareOfClassLoader;

   public static ExtensionManager getDefaultExtensionManager() {
      return ExtensionManagerSetting.getDefaultExtensionManager();
   }

   public static JindentSettings getDefaultJindentSettings() {
      if(defaultSettings == null) {
         try {
            defaultSettings = (JindentSettings)JindentSettings.createFromResource(a("[,\u0017K*\u0011(\n\n=\u00112\nL \u00135QA+\u0012\'\u000bI:[\f\u0017K*\u0011(\nv+\u00002\u0017K)\u0007h\u0006O="));
            if(defaultSettings == null) {
               jindent.debugger.a.b(a(">/\u0010A+\u001a2-@:\u0000/\u0010B=Z%\f@/\u0000#8W!\u0019\u0014\u001bV!\u00014\u001d@fVi\u0014L \u0010#\u0010Qa\u0007#\nQ\'\u001a!\r\n*\u0011 \u001fP\"\u0000i4L \u0010#\u0010Q\u001d\u00112\nL \u00135P]$\u0007dW\u0005-\u0006#\u001fQ+\u0007f\u0010P\"\u0018"));
            }
         } catch (Exception var1) {
            jindent.debugger.a.a(var1);
         }
      }

      return (JindentSettings)defaultSettings.clone();
   }

   public static String getJindentSettingsLocation() {
      return DEFAULT_JINDENT_SETTINGS_LOCATION;
   }

   public static String getJindentSettingsHome() {
      return DEFAULT_JINDENT_SETTINGS_HOME;
   }

   public static String getJindentInfoString() {
      AboutInfo var0 = (AboutInfo)registeredAbout.elementAt(0);
      return var0.getName() + " " + var0.getVersion() + a("Xf") + var0.getReleaseDate();
   }

   public static void registerAboutInfo(AboutInfo var0) {
      registeredAbout.add(var0);
   }

   public static AboutInfo[] getAboutInfoList() {
      int var0 = registeredAbout.size();
      AboutInfo[] var1 = new AboutInfo[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = (AboutInfo)registeredAbout.elementAt(var2);
      }

      return var1;
   }

   public static InstallationContext getInstallationContext() {
      return context;
   }

   public static void registerInstallationContext(InstallationContext var0) {
      context = var0;
   }

   public static void setTakeCareOfClassLoader(boolean var0) {
      takeCareOfClassLoader = var0;
   }

   public static boolean getTakeCareOfClassLoader() {
      return takeCareOfClassLoader;
   }

   /** @deprecated */
   public static boolean isUseJavaHelpOnClick() {
      return HelpUtils.isUseJavaHelpOnClick();
   }

   /** @deprecated */
   public static void setUseJavaHelpOnClick(boolean var0) {
      HelpUtils.setUseJavaHelpOnClick(var0);
   }

   static {
      DEFAULT_JINDENT_SETTINGS_LOCATION = DEFAULT_JINDENT_SETTINGS_HOME + a("[\f\u0017K*\u0011(\nv+\u00002\u0017K)\u0007h\u0006O=");
      defaultSettings = null;
      context = new JarFileInstallationContext();
      registeredAbout = new Vector();
      takeCareOfClassLoader = true;
      registerAboutInfo(new AboutInfo(a(">/\u0010A+\u001a2"), a("AhN\u000b\u007f"), a("FvO\u0013cDrS\u0015y")));
      registerAboutInfo(new AboutInfo(a(">/\u0010A+\u001a2^f;\u00072\u0011H\'\u000e#\f"), a("FhNz\u007fF"), a("FvO\u0013cDrS\u0015y")));
      registerAboutInfo(new AboutInfo(a("<#\u0012Un\'?\rQ+\u0019"), a("EhNz~F"), a("FvO\u0015cD\u007fS\u0017v")));
      registerAboutInfo(new AboutInfo(a(">\'\bDn2)\fH/\u00002\u001bW"), a("AhNz~E"), a("FvO\u0013cDrS\u0015y")));
      registerAboutInfo(new AboutInfo(a(">\'\bDa\'\u00172on2)\fH/\u00002\u001bW"), a("AhNz~E"), a("FvO\u0013cDrS\u0015y")));
      registerAboutInfo(new AboutInfo(a("7mU\u0005\b\u001b4\u0013D:\u0000#\f"), a("AhNz~E"), a("FvO\u0013cDtS\u0017{")));
      registerAboutInfo(new AboutInfo(a("7f8J<\u0019\'\nQ+\u0006"), a("AhNz~E"), a("FvO\u0013cDtS\u0017{")));
      registerAboutInfo(new AboutInfo(a("7i=\u000eeT\u000e\u001bD*\u00114^c!\u0006+\u001fQ:\u00114"), a("AhNz~E"), a("FvO\u0013cDtS\u0017{")));
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 116;
            break;
         case 1:
            var10003 = 70;
            break;
         case 2:
            var10003 = 126;
            break;
         case 3:
            var10003 = 37;
            break;
         default:
            var10003 = 78;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
