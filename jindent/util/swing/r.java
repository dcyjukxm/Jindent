package jindent.util.swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import jindent.customizer.gui.elements.a.RegistrationTableModel;

class r extends FileFilter {
   public boolean accept(File var1) {
      return RegistrationTableModel.a(var1.getName()) || var1.isDirectory();
   }

   public String getDescription() {
      return a("#\u0003xU\u000f\u0007\u001e6\u0004D\u0011JzX\t\f\u0004eTJ\u0002\u000fo\u0011\f\u0000\u0006sBJA@8[\u0006\u0002C");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 105;
            break;
         case 1:
            var10003 = 106;
            break;
         case 2:
            var10003 = 22;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 106;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
