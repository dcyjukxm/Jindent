package jindent.cpp.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoJavaDocsFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE%\u00063tU,\u000b$fb\t\t!"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u0011kG\u0015\u0019\u0018fP\u0007.=dU"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6DJ\u0007\u0019!MG\u0010\u000b\u0016hE\u0015"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003)>fU\u0015 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE#\u0004\'jl\u0007\u001c3CI\u0005\u0019"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u0017iS\u000b 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6BH\u0013\u0007\u0018fP\u0007.=dU"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003/<rK,\u000b$fb\t\t!"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE\'\u0004<hR\u0007\u001e;hH2\u0013\"bl\u0007\u001c3CI\u0005\u0019"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u0013iH\t\u001e3sO\t\u0004\u0006~V\u0003 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6FH\b\u0005&fR\u000f\u0005<S_\u0016\u000f\u0018fP\u0007.=dU"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003+<iI\u0012\u000b&nI\b>+wC,\u000b$fb\t\t!"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE \u00037kB,\u000b$fb\t\t!"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u0014nC\n\u000e\u0018fP\u0007.=dU"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6AO\u0003\u00066MG\u0010\u000b\u0016hE\u0015"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003,;bJ\u0002 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE%\u0005<tR\u0014\u001f1sI\u0014 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u0011hH\u0015\u001e rE\u0012\u0005 MG\u0010\u000b\u0016hE\u0015"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6DI\b\u0019&uS\u0005\u001e=ul\u0007\u001c3CI\u0005\u0019"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003)=iU\u0012\u0018\'dR\t\u0018\u0018fP\u0007.=dU"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0013\b>nE+\u000f&oI\u0002 3qG\"\u00051t"), false);
      var1.setBoolean(a("dT\u0003\u000b&b`\u0014\u00037iB\n\u0013\u001fbR\u000e\u00056MG\u0010\u000b\u0016hE\u0015"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0005&bE\u0012\u000f6JC\u0012\u0002=cl\u0007\u001c3CI\u0005\u0019"), false);
      var1.setBoolean(a("dT\u0003\u000b&bv\u0014\u0003$fR\u0003\'7sN\t\u000e\u0018fP\u0007.=dU"), false);
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
            var10003 = 7;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 102;
            break;
         case 3:
            var10003 = 106;
            break;
         default:
            var10003 = 82;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
