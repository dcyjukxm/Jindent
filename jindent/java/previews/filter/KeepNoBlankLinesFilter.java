package jindent.java.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class KeepNoBlankLinesFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setNumber(a("T@\u0017odSD\u001ctjVK\u0017l"), 0);
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
            var10003 = 63;
            break;
         case 1:
            var10003 = 37;
            break;
         case 2:
            var10003 = 114;
            break;
         case 3:
            var10003 = 31;
            break;
         default:
            var10003 = 38;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
