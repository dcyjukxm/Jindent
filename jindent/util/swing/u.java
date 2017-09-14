package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

class u extends FileFilter {
   public boolean accept(File var1) {
      return var1.getName().endsWith(a("T!jx")) || var1.isDirectory();
   }

   public String getDescription() {
      return a("0\"go7\u0014?)H=\u0017&he6\u001f9)x7\u000e?`e5\tk!!|\u0010(z\"");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 122;
            break;
         case 1:
            var10003 = 75;
            break;
         case 2:
            var10003 = 9;
            break;
         case 3:
            var10003 = 11;
            break;
         default:
            var10003 = 82;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
