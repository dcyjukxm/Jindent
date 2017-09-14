package jindent.cpp.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class KeepNoBlankLinesFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setNumber(a("h\u000b<m\\o\u000f7vRj\u0000<n"), 0);
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
            var10003 = 3;
            break;
         case 1:
            var10003 = 110;
            break;
         case 2:
            var10003 = 89;
            break;
         case 3:
            var10003 = 29;
            break;
         default:
            var10003 = 30;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
