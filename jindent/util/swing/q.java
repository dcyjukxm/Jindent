package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import jindent.SettingsUtils;

class q extends FileFilter {
   public boolean accept(File var1) {
      return SettingsUtils.isValidSettingsFilename(var1.getName()) || var1.isDirectory();
   }

   public String getDescription() {
      return a("R\u0013_pgv\u000e\u0011 ,`U\u0004:z8\tT`vq\u0014Vg\"0P\u001flhkS");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 24;
            break;
         case 1:
            var10003 = 122;
            break;
         case 2:
            var10003 = 49;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 2;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
