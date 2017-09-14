package jindent.b;

import jindent.b.b;
import jindent.formatter.Context;
import jindent.formatter.m;

public class c extends Context {
   public c() {
      super(4, b("\u0015%ehZvBC\"\u00153x"), b("5zV"), 14);
      this.e = null;
      this.a = null;
      this.b = 1;
      this.f = new jindent.cpp.a.a();
   }

   public m newParser() {
      return new b(this);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 86;
            break;
         case 1:
            var10003 = 10;
            break;
         case 2:
            var10003 = 38;
            break;
         case 3:
            var10003 = 67;
            break;
         default:
            var10003 = 113;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
