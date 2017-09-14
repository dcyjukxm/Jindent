package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class s extends FileFilter {
   public boolean accept(File var1) {
      return var1.getName().toLowerCase().endsWith(a("\u0004\u0006k\u007f")) || var1.isDirectory();
   }

   public String getDescription() {
      return a("f\u0005c8\u0004C\u0006akb\u0002@*t-MC");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 42;
            break;
         case 1:
            var10003 = 106;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 24;
            break;
         default:
            var10003 = 66;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
