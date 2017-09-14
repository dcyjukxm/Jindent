package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.u;
import jindent.formatter.d.d;

public abstract class b implements d, s {
   public void a(Context var1) {
      int var2 = this.h().c;
      int var3 = this.d();
      if(this.g() == 1) {
         var3 = this.a(var1, var3);
      }

      int var4 = var3 - var2;
      if(var4 != 0) {
         q var5 = this.c();
         if(this.f() == 1) {
            var5 = u.a((q)this.c(), -25);
         }

         u.d(this.b(), var5, var4);
      }

   }

   protected q h() {
      q var1 = this.b();
      return u.l(var1);
   }

   protected int a(Context var1, int var2) {
      int var3 = var2 - this.b().r;
      int var5 = var1.getAbsoluteRelativeIndex(a("w>9s?}?9m\u0002"));
      boolean var6 = var5 == 0?var3 > var1.getNumber(a("w>9s?}?9m\u0002")):var2 > var1.getNumber(a("w>9s?}?9m\u0002"));
      if(var6) {
         var2 = this.b().r + var1.getNumber(a("r7(f\u0004}:(j\u0000v\u00122g\u0013}/"));
      }

      return var2;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 19;
            break;
         case 1:
            var10003 = 91;
            break;
         case 2:
            var10003 = 92;
            break;
         case 3:
            var10003 = 3;
            break;
         default:
            var10003 = 118;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
