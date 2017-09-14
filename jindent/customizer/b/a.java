package jindent.customizer.b;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class a extends FileFilter {
   protected String a;
   protected String b;

   public a(String var1, String var2) {
      this.a = a(var1);
      this.b = var2.toLowerCase();
   }

   private static String a(String var0) {
      return Character.toUpperCase(var0.charAt(0)) + var0.substring(1);
   }

   public boolean accept(File var1) {
      return var1.getName().toLowerCase().endsWith("." + this.b) || var1.isDirectory();
   }

   public String getDescription() {
      return this.a + b("3b3YCpT|jX\u007fT/\f\u00199\u001f") + this.b + ")";
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 19;
            break;
         case 1:
            var10003 = 49;
            break;
         case 2:
            var10003 = 92;
            break;
         case 3:
            var10003 = 44;
            break;
         default:
            var10003 = 49;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
