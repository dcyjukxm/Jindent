package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import jindent.SettingsUtils;

class p extends FileFilter {
   public boolean accept(File var1) {
      return SettingsUtils.isValidSettingsFilename(var1.getName()) || var1.isDirectory();
   }

   public String getDescription() {
      return a("n\u0016\u000b\u0017HJ\u000bEG\u0003\\PP]U\u0004\f\u0000\u0007YM\u0011\u0002\u0000\r\fUK\u000bGWV");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 36;
            break;
         case 1:
            var10003 = 127;
            break;
         case 2:
            var10003 = 101;
            break;
         case 3:
            var10003 = 115;
            break;
         default:
            var10003 = 45;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
