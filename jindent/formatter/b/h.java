package jindent.formatter.b;

import jindent.formatter.q;
import jindent.formatter.u;

public class h {
   protected q a = null;
   protected boolean b = true;
   protected q c = null;
   protected boolean d = true;
   protected boolean e = false;
   protected boolean f = false;
   protected boolean g = false;
   protected int h;

   public h(int var1) {
      this.h = var1;
   }

   public int g() {
      return this.h;
   }

   public void c(int var1) {
      this.h = var1;
   }

   public boolean h() {
      return true;
   }

   public boolean i() {
      return this.g;
   }

   public void b(boolean var1) {
      this.g = var1;
   }

   public boolean j() {
      q var1 = u.l(this.a);
      q var2 = u.l(this.c);
      return var1.s && var2.s;
   }

   public void a(q var1, boolean var2) {
      if(var1 == null) {
         throw new RuntimeException(c("rF\u001eP$Dl\u0007G*DG\u001f\f4UH\u0019V\u0013NB\u000eLg\u001c\u0014KL2ME"));
      } else {
         this.a = var1;
         this.b = var2;
      }
   }

   public q k() {
      return this.a;
   }

   public void b(q var1, boolean var2) {
      if(var1 == null) {
         throw new RuntimeException(c("rF\u001eP$Dl\u0007G*DG\u001f\f\"OM?M,DGK\u001fz\u0001G\u001eN+"));
      } else {
         this.c = var1;
         this.d = var2;
      }
   }

   public q l() {
      return this.c;
   }

   public boolean m() {
      return this.f;
   }

   public void c(boolean var1) {
      this.f = var1;
   }

   public boolean n() {
      return this.e;
   }

   public void d(boolean var1) {
      this.e = var1;
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 33;
            break;
         case 1:
            var10003 = 41;
            break;
         case 2:
            var10003 = 107;
            break;
         case 3:
            var10003 = 34;
            break;
         default:
            var10003 = 71;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
