package jindent.java.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoSortingFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setBoolean(a("2d\u0016\f\n8{\u0001<;\"g\u0005\n?5b\u000b\u0016-"), false);
      var1.setBoolean(a("2d\u0016\f\u001d-j\u0017\u000b\u0017/\u007f\u0001\n8 h\u0001=04f \u001d=-j\u0016\u0019*(d\n\u000b"), false);
      var1.setBoolean(a("2d\u0016\f\u0017,{\u000b\n*\u0005n\u0007\u0014?3j\u0010\u00111/x"), false);
      return var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 65;
            break;
         case 1:
            var10003 = 11;
            break;
         case 2:
            var10003 = 100;
            break;
         case 3:
            var10003 = 120;
            break;
         default:
            var10003 = 94;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
