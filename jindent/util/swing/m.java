package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class m extends FileFilter {
   public boolean accept(File var1) {
      return var1.getName().toLowerCase().endsWith(a("@\u00141\u001e")) || var1.isDirectory();
   }

   public String getDescription() {
      return a("$\u00176\u0014G\u0000\nxC\f[\u0006x\u0003G\u001a\n1\u001eE\u001d^pZ\f\u0004\u00176Y");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 110;
            break;
         case 1:
            var10003 = 126;
            break;
         case 2:
            var10003 = 88;
            break;
         case 3:
            var10003 = 112;
            break;
         default:
            var10003 = 34;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
