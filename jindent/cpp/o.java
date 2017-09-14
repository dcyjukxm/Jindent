package jindent.cpp;

import jindent.cpp.h;
import jindent.cpp.n;
import jindent.cpp.p;
import jindent.formatter.Context;

public class o extends Context {
   public o() {
      super(4, b("4N;"), b("\u0014\u0015`"), 14);
      this.e = new h(this);
      this.a = new p(this);
      this.b = 1;
      this.f = new jindent.cpp.a.a();
   }

   public jindent.formatter.m newParser() {
      return new n(this);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 119;
            break;
         case 1:
            var10003 = 101;
            break;
         case 2:
            var10003 = 16;
            break;
         case 3:
            var10003 = 12;
            break;
         default:
            var10003 = 81;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
