package jindent.cpp.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoNotesFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setPositionIndex(a("\u0001\u001a=d6\f\u0001:}=,\u001a\'w\u0003\r\u0006:f:\r\u001b"), 2);
      var1.setPositionIndex(a("\b\u001c=v6\f\u0001\u001d}\'\u0007%<a:\u0016\u001c<|"), 2);
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
            var10003 = 98;
            break;
         case 1:
            var10003 = 117;
            break;
         case 2:
            var10003 = 83;
            break;
         case 3:
            var10003 = 18;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
