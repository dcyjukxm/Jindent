package jindent.cpp.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoSortingFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setBoolean(a(" 2pR\\*-gbm01cTi\'4mH{"), false);
      var1.setBoolean(a(" 2pRK?<qUA=)gTn2>gcf&0FCk?<pG|:2lU"), false);
      var1.setBoolean(a(" 2pRA>-mT|\u00178aJi!<vOg=."), false);
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
            var10003 = 83;
            break;
         case 1:
            var10003 = 93;
            break;
         case 2:
            var10003 = 2;
            break;
         case 3:
            var10003 = 38;
            break;
         default:
            var10003 = 8;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
