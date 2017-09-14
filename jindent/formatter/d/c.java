package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.d.b;
import jindent.formatter.d.h;
import jindent.formatter.d.m;

public class c extends b {
   private m a;

   public c(m var1) {
      this.a = var1;
   }

   public q a() {
      h var1 = this.a.t();
      return var1.c();
   }

   public q b() {
      return this.a.g;
   }

   public q c() {
      return this.a.f();
   }

   public int e() {
      h var1 = this.a.t();
      return var1.e();
   }

   public int f() {
      return 1;
   }

   public int g() {
      return 1;
   }

   public int d() {
      h var1 = this.a.t();
      return var1.f();
   }

   protected int a(Context var1, int var2) {
      return var2;
   }
}
