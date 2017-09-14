package jindent.cpp.b;

import jindent.cpp.b.f;
import jindent.cpp.b.g;

public class e {
   protected static final String a = "#define";
   protected static final int b = 1;
   protected static final int c = 1;
   protected jindent.cpp.b.a.a d;

   public e() {
      this.a();
   }

   public void a() {
   }

   protected void a(String var1) {
      this.a(var1, 1, 1);
   }

   protected void a(String var1, int var2, int var3) {
      g var4 = new g(this, (f)null);
      this.a(var4);
      this.d = new jindent.cpp.b.a.a(var1, var2, var3);

      while(this.d.a()) {
         jindent.cpp.b.a.e var5 = this.d.b();
         var4.a(var5);
         if(var4.l() == 0) {
            if(var4.j()) {
               var4.b(1);
               this.l(var4);
            } else if(var4.h()) {
               var4.b(2);
               this.i(var4);
            } else if(var4.f()) {
               var4.b(3);
               this.f(var4);
            } else if(var4.e()) {
               var4.b(4);
               this.c(var4);
            }
         }

         switch(var4.l()) {
         case 0:
            this.o(var4);
            break;
         case 1:
            this.m(var4);
            break;
         case 2:
            this.j(var4);
            break;
         case 3:
            this.g(var4);
            break;
         case 4:
            this.d(var4);
         }

         switch(var4.l()) {
         case 1:
            if(var4.k()) {
               this.n(var4);
               var4.b(0);
            }
            break;
         case 2:
            if(var4.i()) {
               this.k(var4);
               var4.b(0);
            }
            break;
         case 3:
            if(var4.g()) {
               this.h(var4);
               var4.b(0);
            }
            break;
         case 4:
            if(var4.c()) {
               this.e(var4);
               var4.b(0);
            }
         }
      }

      switch(var4.l()) {
      case 1:
         this.n(var4);
         var4.b(0);
         break;
      case 2:
         this.k(var4);
         var4.b(0);
      case 3:
      default:
         break;
      case 4:
         this.e(var4);
         var4.b(0);
      }

      this.b(var4);
   }

   public String b() {
      return this.d.i();
   }

   protected void a(g var1) {
   }

   protected void b(g var1) {
   }

   protected void c(g var1) {
   }

   protected void d(g var1) {
   }

   protected void e(g var1) {
   }

   protected void f(g var1) {
   }

   protected void g(g var1) {
   }

   protected void h(g var1) {
   }

   protected void i(g var1) {
   }

   protected void j(g var1) {
   }

   protected void k(g var1) {
   }

   protected void l(g var1) {
   }

   protected void m(g var1) {
   }

   protected void n(g var1) {
   }

   protected void o(g var1) {
   }
}
