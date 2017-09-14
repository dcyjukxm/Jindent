package jindent.debugger;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import jindent.JindentSystem;

public class JindentLogging {
   private static HashMap a = new HashMap();

   public static Logger getLogger() {
      return getLogger(JindentSystem.getJindentSettingsHome());
   }

   private static Logger getLogger(String var0) {
      try {
         Logger var1 = (Logger)a.get(var0);
         if(var1 == null) {
            File var2 = new File(var0);
            if(!var2.exists()) {
               var2.mkdirs();
            }

            String var3 = var0 + a("\u0015\u001d?_7_9\"t!H8$\u001f?U0");
            int var4 = 1000000;
            byte var5 = 1;
            FileHandler var6 = new FileHandler(var3, var4, var5, true);
            var6.setFormatter(new SimpleFormatter());
            var1 = Logger.getLogger(a("P>8U6T#"));
            var1.setUseParentHandlers(false);
            var1.addHandler(var6);
            a.put(var0, var1);
         }

         return var1;
      } catch (IOException var7) {
         jindent.debugger.a.a((Exception)var7);
         return null;
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
            var10003 = 58;
            break;
         case 1:
            var10003 = 87;
            break;
         case 2:
            var10003 = 86;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
