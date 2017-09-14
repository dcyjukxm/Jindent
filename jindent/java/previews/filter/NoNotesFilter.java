package jindent.java.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoNotesFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setPositionIndex(a("z\u0007R kw\u001cU9`W\u0007H3^v\u001bU\"gv\u0006"), 2);
      var1.setPositionIndex(a("s\u0001R2kw\u001cr9z|8S%gm\u0001S8"), 2);
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
            var10003 = 25;
            break;
         case 1:
            var10003 = 104;
            break;
         case 2:
            var10003 = 60;
            break;
         case 3:
            var10003 = 86;
            break;
         default:
            var10003 = 14;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
