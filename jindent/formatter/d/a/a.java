package jindent.formatter.d.a;

import jindent.formatter.q;
import jindent.formatter.u;

public class a {
   private static final q a = new q();
   private static final int b = 0;
   private int c;
   private int d;
   private q e;
   private q f;
   private q g;

   public a(int var1, q var2, q var3) {
      this.c = var1;
      this.d = -1;
      this.e = var2;
      this.f = var3;
      this.g = a;
   }

   public boolean a() {
      return this.e != null && this.f != null;
   }

   public q b() {
      return this.e;
   }

   public q c() {
      return this.f;
   }

   public int d() {
      if(this.d == -1) {
         q var1 = u.m(this.f);
         this.d = var1 == null?0:var1.r;
      }

      return this.d;
   }

   public int e() {
      return this.c;
   }

   public q f() {
      if(this.g == a) {
         this.g = u.l(this.e);
      }

      return this.g;
   }

   public String toString() {
      return this.f().f;
   }
}
