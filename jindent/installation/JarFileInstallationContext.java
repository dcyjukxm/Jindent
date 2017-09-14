package jindent.installation;

import java.net.JarURLConnection;
import java.net.URL;
import jindent.installation.InstallationContext;

public class JarFileInstallationContext implements InstallationContext {
   private boolean isInstalled(Class var1) {
      try {
         URL var2 = this.getClassURL(var1);
         return a("a\u000b\u0001").equals(var2.getProtocol());
      } catch (Exception var3) {
         return false;
      }
   }

   public URL getLicenseKeyDirectory(Class var1) {
      if(this.isInstalled(var1)) {
         try {
            JarURLConnection var2 = (JarURLConnection)this.getClassURL(var1).openConnection();
            URL var3 = var2.getJarFileURL();
            String var4 = var3.toExternalForm();
            int var5 = var4.lastIndexOf("/");
            String var6 = var4;
            if(var5 != -1) {
               var6 = var4.substring(0, var5);
            }

            return new URL(var6);
         } catch (Exception var7) {
            ;
         }
      }

      return null;
   }

   private URL getClassURL(Class var1) {
      return var1.getResource("/" + var1.getName().replace('.', '/') + a("%\t\u001f#zx"));
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 11;
            break;
         case 1:
            var10003 = 106;
            break;
         case 2:
            var10003 = 115;
            break;
         case 3:
            var10003 = 66;
            break;
         default:
            var10003 = 9;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
