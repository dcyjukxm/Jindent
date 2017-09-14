package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class o extends FileFilter {
   public boolean accept(File var1) {
      return var1.getName().endsWith(a("UsZ[")) || var1.isDirectory();
   }

   public String getDescription() {
      return a("1b^O{\u0015\u007f\u0010\u001f0\u0003$\u0005\u0005f[{BDt\u001ehD\u000b6Q%HAnR");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 123;
            break;
         case 1:
            var10003 = 11;
            break;
         case 2:
            var10003 = 48;
            break;
         case 3:
            var10003 = 43;
            break;
         default:
            var10003 = 30;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
