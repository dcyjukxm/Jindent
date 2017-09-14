package jindent.java.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoHeaderFooterFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setHeaderIndex(a("<F(z\\&j\'m\\&W qW\u0019L-{"), 0);
      var1.setInfiniteINumber(a("<F(z\\&g,j\\7W qW\u0007N(lM\u0019L-{"), true);
      var1.setString(a("<F(z\\&g,j\\7W qW\u001dM*rL0F\u0002{@\'"), "");
      var1.setString(a("<F(z\\&g,j\\7W qW\u0011[*rL0F\u0002{@\'"), "");
      var1.setNumber(a("6O(pR\u0018J\'{J\u0016F/qK1k,\u007f]1Q"), 0);
      var1.setNumber(a("6O(pR\u0018J\'{J\u0015E={K\u001cF(z\\&"), 0);
      var1.setFooterIndex(a("2L&j\\&j\'m\\&W qW\u0019L-{"), 0);
      var1.setInfiniteINumber(a("2L&j\\&g,j\\7W qW\u0007N(lM\u0019L-{"), true);
      var1.setString(a("2L&j\\&g,j\\7W qW\u001dM*rL0F\u0002{@\'"), "");
      var1.setString(a("2L&j\\&g,j\\7W qW\u0011[*rL0F\u0002{@\'"), "");
      var1.setNumber(a("6O(pR\u0018J\'{J\u0016F/qK1e&qM1Q"), 0);
      var1.setNumber(a("6O(pR\u0018J\'{J\u0015E={K\u0012L&j\\&"), 0);
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
            var10003 = 84;
            break;
         case 1:
            var10003 = 35;
            break;
         case 2:
            var10003 = 73;
            break;
         case 3:
            var10003 = 30;
            break;
         default:
            var10003 = 57;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
