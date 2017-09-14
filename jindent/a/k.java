package jindent.a;

import jindent.a.h;
import jindent.a.j;
import jindent.a.l;
import jindent.formatter.Context;
import jindent.formatter.m;

public class k extends Context {
   public k() {
      super(4, "C", b("\u001f\u000b "), 14);
      this.e = new h(this);
      this.a = new l(this);
      this.b = 1;
      this.f = new jindent.cpp.a.a();
   }

   public m newParser() {
      return new j(this);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 124;
            break;
         case 1:
            var10003 = 123;
            break;
         case 2:
            var10003 = 80;
            break;
         case 3:
            var10003 = 37;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
