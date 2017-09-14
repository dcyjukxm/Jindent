package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class t extends FileFilter {
   public boolean accept(File var1) {
      return var1.isDirectory();
   }

   public String getDescription() {
      return a("\tk,\u001709m,\u000b");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 77;
            break;
         case 1:
            var10003 = 2;
            break;
         case 2:
            var10003 = 94;
            break;
         case 3:
            var10003 = 114;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
