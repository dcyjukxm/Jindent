package jindent.formatter;

import java.io.IOException;
import java.io.Reader;
import java.util.Stack;
import jindent.formatter.Context;
import jindent.formatter.ParseException;
import jindent.formatter.j;
import jindent.formatter.m;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.u;
import jindent.formatter.a.c;
import jindent.formatter.d.d;
import jindent.message.Message;
import jindent.settings.BracesSetting;
import jindent.util.MyVector;

public abstract class t implements s, Cloneable {
   protected Context a = null;
   private int b;
   private q c;
   private MyVector d;
   private jindent.formatter.b.k e;
   private Stack f;
   private Stack g;

   protected t() {
   }

   protected t(Context var1) {
      this.a = var1;
   }

   protected void a() {
      if(this.a.c == null) {
         throw new RuntimeException(h("\"-9\u001db\u001a;lS`\u000fb/\\c\u0017b\u0018Rd\u001e,\u001cO`\u001f7/X}U+\"T{SklJf\u000f*#H{[!-Qc\u0012,+\u001d[\u0014))S_\t-(Hl\u001e0bTa\u00126d~`\u00156)E{Rb.Xi\u00140)\u001d."));
      } else {
         this.b = 0;
         this.c = null;
         this.d = new MyVector();
         this.e = new jindent.formatter.b.k();
         this.f = new Stack();
         this.g = new Stack();
      }
   }

   protected abstract void a(Reader var1, int var2, int var3, m var4) throws Exception;

   protected abstract void b() throws IOException;

   protected abstract void c();

   protected abstract c d();

   protected abstract void e();

   protected abstract q f();

   protected abstract void a(q var1);

   protected abstract q a(int var1);

   protected abstract boolean g() throws ParseException;

   protected abstract boolean h() throws ParseException;

   public abstract boolean b(q var1);

   public abstract boolean c(q var1);

   public abstract boolean d(q var1);

   public abstract boolean e(q var1);

   public boolean f(q var1) {
      return this.b(var1) || this.c(var1) || this.d(var1) || this.e(var1);
   }

   public abstract boolean g(q var1);

   public abstract boolean h(q var1);

   public abstract boolean i(q var1);

   protected abstract boolean j(q var1);

   protected abstract int k(q var1);

   protected abstract boolean l(q var1);

   protected abstract q i();

   protected jindent.formatter.d.i j() {
      jindent.formatter.d.i var1 = new jindent.formatter.d.i();
      this.f.push(var1);
      return var1;
   }

   protected jindent.formatter.d.i k() {
      jindent.formatter.d.i var1 = new jindent.formatter.d.i();
      if(!this.f.isEmpty()) {
         jindent.formatter.d.i var2 = (jindent.formatter.d.i)this.f.peek();
         var1.b(var2);
         var2.a(var1);
      }

      this.f.push(var1);
      return var1;
   }

   protected jindent.formatter.d.i l() {
      return this.f.isEmpty()?null:(jindent.formatter.d.i)this.f.peek();
   }

   protected jindent.formatter.d.i m() {
      if(this.f.isEmpty()) {
         throw new IllegalStateException(h("\u001f\'<Xa\u001f+\"ZN\u0017++Sb\u001e,8~`\u0017.)^{\u0012-\"\u001d2Fb\"Hc\u0017"));
      } else {
         return (jindent.formatter.d.i)this.f.pop();
      }
   }

   protected void m(q var1) {
      this.g.push(var1);
   }

   protected q n() {
      if(this.g.isEmpty()) {
         throw new IllegalStateException(h("\u001a.%Za\u0016\'\"I[\u0014))S\\\u000f#/V/F\u007flSz\u0017."));
      } else {
         return (q)this.g.peek();
      }
   }

   protected q o() {
      if(this.g.isEmpty()) {
         throw new IllegalStateException(h("\u001a.%Za\u0016\'\"I[\u0014))S\\\u000f#/V/F\u007flSz\u0017."));
      } else {
         return (q)this.g.pop();
      }
   }

   protected static void a(jindent.formatter.b.j var0, jindent.formatter.b.h var1) {
      var0.a(var1);
   }

   protected void a(jindent.formatter.b.h var1) {
      this.e.a(var1);
   }

   public jindent.formatter.b.k p() {
      return this.e;
   }

   protected void q() {
      this.f().g = null;
   }

   public void a(int var1, q var2, q var3, q var4, int var5, int var6) {
      jindent.formatter.d.f var7 = new jindent.formatter.d.f(var1, var2, var3, var4, var5, var6);
      this.a((d)var7);
   }

   public void a(d var1) {
      if(this.F()) {
         this.d.d(var1);
      }
   }

   public void a(Context var1) {
      int var2 = this.d.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         d var4 = (d)this.d.d(var3);
         var4.a(var1);
      }

   }

   public boolean a(q var1, boolean var2) {
      return this.a(var1, var2, false);
   }

   public boolean b(int var1) {
      q var2 = this.a(var1);
      return this.b(var2, false);
   }

   public boolean n(q var1) {
      return this.a(var1, false, true);
   }

   public boolean b(q var1, boolean var2) {
      return this.a(var1, var2, true);
   }

   private boolean a(q var1, boolean var2, boolean var3) {
      q var4 = var1.h;
      if(var4 == null) {
         return false;
      } else {
         var4 = u.H(var4);
         if(var2) {
            var4 = u.d(var4, this.a);
         }

         while(var4 != null) {
            if(u.q(var4) || u.p(var4) || u.r(var4)) {
               return true;
            }

            if(u.n(var4)) {
               return true;
            }

            int var5 = this.k(var4);
            boolean var6 = u.a(var4, this.a);
            if(var5 == -1 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0000 Rl\u0010\u0001#Pb\u001e,8N"))) {
               return true;
            }

            if(var5 == -2 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0011%Sh\u0017\'\u0000Ta\u001e\u0001#Pb\u001e,8N"))) {
               return true;
            }

            if(var5 == -3 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0011%Sh\u0017\'\u0000Ta\u001e\u0001#Pb\u001e,8N"))) {
               return true;
            }

            if(var5 == -4 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0016>\\f\u0017+\"ZL\u0014/!Xa\u000f1"))) {
               return true;
            }

            if(var5 == -7 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0016>\\f\u0017+\"ZL\u0014/!Xa\u000f1"))) {
               return true;
            }

            if(var5 == -6 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0007\"Y@\u001d\u000e%Sj8-!Pj\u00156?"))) {
               return true;
            }

            if(var3 && var5 == -8 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\b-Kn?-/~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -12 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -13 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -14 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -15 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -18 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var5 == -17 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            if(var3 && var5 == -19 && !var6 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
               return true;
            }

            var4 = var4.g;
         }

         return false;
      }
   }

   public boolean c(int var1) {
      q var2 = this.a(var1);
      return this.c(var2, false);
   }

   public boolean o(q var1) {
      return this.c(var1, false);
   }

   public boolean a(q var1, q var2) {
      q var3 = var1;

      do {
         if(this.o(var3)) {
            return true;
         }

         var3 = var3.g;
      } while(var3 != null && var3.g != null && var3.g != var2);

      return false;
   }

   private boolean c(q var1, boolean var2) {
      if(var1 == null) {
         return false;
      } else {
         q var3 = var1.h;
         if(var3 == null) {
            return false;
         } else {
            var3 = u.H(var3);
            if(var2) {
               var3 = u.d(var3, this.a);
            }

            while(var3 != null) {
               int var4 = this.k(var3);
               if(var4 == -20 || var4 == -21 || var4 == -22 || var4 == -23 || var4 == -24 || var4 == -25 || var4 == -26 || var4 == -27 || var4 == -28 || var4 == -29 || var4 == -30 || var4 == -31) {
                  return true;
               }

               var3 = var3.g;
            }

            return false;
         }
      }
   }

   public boolean p(q var1) {
      q var2 = var1.h;
      if(var2 == null) {
         return false;
      } else {
         while(var2.h != null) {
            var2 = var2.h;
         }

         for(; var2 != null; var2 = var2.g) {
            int var3 = this.a.a.k(var2);
            boolean var4 = u.a(var2, this.a);
            if(this.a.getBoolean(h("\b\'<\\}\u001a6)~g\u000e,\'NM\u0002\u0001#Pb\u001e,8N"))) {
               if(var3 == -1 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0000 Rl\u0010\u0001#Pb\u001e,8N"))) {
                  return true;
               }

               if(var3 == -2 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0011%Sh\u0017\'\u0000Ta\u001e\u0001#Pb\u001e,8N"))) {
                  return true;
               }

               if(var3 == -6 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0007\"Y@\u001d\u000e%Sj8-!Pj\u00156?"))) {
                  return true;
               }

               if(var3 == -8 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\b-Kn?-/~`\u0016/)S{\b"))) {
                  return true;
               }

               if(var3 == -12 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
                  return true;
               }

               if(var3 == -13 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
                  return true;
               }

               if(var3 == -17 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
                  return true;
               }

               if(var3 == -19 && !var4 && !this.a.getBoolean(h("\u001f\' X{\u001e\u0006#Ev\u001c\'\"~`\u0016/)S{\b"))) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean q(q var1) {
      q var2 = var1.h;
      if(var2 == null) {
         return false;
      } else {
         for(var2 = u.H(var2); var2 != null; var2 = var2.g) {
            if(this.h(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   protected q r() {
      q var1 = this.f();
      return var1.a >= 0 && var1.a != 4000?var1:this.c;
   }

   protected void s() {
      q var1 = this.f();
      if(var1.a >= 0) {
         this.c = var1;
      }

   }

   protected void d(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -13;
      var2.l = var1;
      var2.m = null;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void t() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -14;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void u() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -15;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected j e(int var1) {
      return this.a(new j(var1));
   }

   protected j a(j var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -10;
      var2.l = 0;
      var2.m = var1;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
      return var1;
   }

   protected void a(q var1, int var2) {
      this.s();
      var1.f = emptyString;
      var1.a = -10;
      var1.l = var2;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
   }

   protected void v() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -12;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void w() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -11;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void x() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -26;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void y() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -27;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void f(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -16;
      var2.l = var1;
      var2.m = null;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void b(q var1, int var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = -16;
      var3.l = var2;
      var3.m = null;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      b(var1, var3);
   }

   protected void g(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -117;
      var2.l = var1;
      var2.m = null;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void z() {
      this.s();
      q var1 = q.a();
      var1.f = emptyString;
      var1.a = -118;
      var1.l = 0;
      var1.m = null;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   protected void c(q var1, int var2) {
      var1.f = emptyString;
      var1.a = var2;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.l = 0;
      var1.m = null;
   }

   protected void a(q var1, int var2, int var3, Object var4) {
      var1.f = emptyString;
      var1.a = var2;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.l = var3;
      var1.m = var4;
   }

   protected void a(q var1, String var2) {
      var1.f = var2;
      var1.a = 4000;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.l = 0;
      var1.m = null;
   }

   protected void h(int var1) {
      q var2 = this.f();
      var2.f = emptyString;
      var2.a = var1;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
   }

   protected void r(q var1) {
      this.s();
      var1.g = this.a(1);
      this.f().g = var1;
      this.a(var1);
   }

   public static void b(q var0, q var1) {
      var1.g = var0.g;
      var0.g = var1;
   }

   protected void d(q var1, int var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = var2;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.l = 0;
      var3.m = null;
      var3.g = var1.g;
      var1.g = var3;
   }

   protected void i(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = var1;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void a(int var1, int var2, Object var3) {
      this.s();
      q var4 = q.a();
      var4.f = emptyString;
      var4.a = var1;
      var4.b = 0;
      var4.c = 0;
      var4.d = 0;
      var4.e = 0;
      var4.h = null;
      var4.l = var2;
      var4.m = var3;
      var4.g = this.a(1);
      this.f().g = var4;
      this.a(var4);
   }

   protected void a(String var1) {
      this.s();
      q var2 = this.b(var1);
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   public q b(String var1) {
      q var2 = q.a();
      var2.f = var1;
      var2.a = 4000;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
      return var2;
   }

   protected void s(q var1) {
      this.s();
      q var2 = u.d(var1);
      var2.g = this.a(1);
      this.f().g = var1;
      this.a(var2);
   }

   protected void c(String var1) {
      this.s();
      q var2 = this.b(var1);
      q var3 = this.a(1).h;
      q var4 = null;
      if(var3 != null) {
         while(var3.h != null) {
            var3 = var3.h;
         }

         while(true) {
            if(var3 == null || this.g(var3)) {
               if(var3 == null) {
                  q var5 = this.i();
                  var4.g = var5;
                  var5.h = var4;
               }
               break;
            }

            var4 = var3;
            var3 = var3.g;
         }
      }

      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void d(String var1) {
      this.s();
      q var2 = this.b(var1);
      q var3 = this.a(1);
      var2.h = var3.h;
      var3.h = null;
      var2.g = var3;
      this.f().g = var2;
      this.a(var2);
   }

   protected void j(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = var1;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
      q var3 = this.a(1);
      var2.h = var3.h;
      var3.h = null;
      var2.g = var3;
      this.f().g = var2;
      this.a(var2);
   }

   protected void e(String var1) {
      this.s();
      q var2 = this.b(var1);
      q var3 = this.a(1).h;
      q var4 = null;
      if(var3 != null) {
         while(var3.h != null) {
            var3 = var3.h;
         }

         while(true) {
            if(var3 == null || this.g(var3)) {
               q var5;
               if(var3 == null) {
                  var5 = this.i();
                  var4.g = var5;
                  var5.h = var4;
                  var3 = var5;
               }

               var5 = var3.g;
               q var6 = this.i();
               var6.g = var5;
               if(var5 == null) {
                  this.a(1).h = var6;
               } else {
                  var5.h = var6;
               }

               var3.g = null;
               var2.h = var3;
               break;
            }

            var4 = var3;
            var3 = var3.g;
         }
      }

      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void a(String var1, jindent.formatter.b.h var2) {
      q var3 = this.f(var1);
      q var4 = u.j(var2.k());
      boolean var5 = this.a(var4, true);
      var2.d(var5);
      boolean var6 = this.b(var3, true);
      var2.c(var6);
   }

   public void t(q var1) {
      for(q var2 = var1.h; var2 != null; var2 = var2.h) {
         if(u.a(var2, this.a)) {
            u.c(var2.h, this.a);
            var2.a = -11;
         }
      }

   }

   protected q f(String var1) {
      this.s();
      q var2 = q.a();
      var2.f = "";
      var2.a = 4000;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
      q var3 = this.a(1);
      boolean var4 = this.j(var3);
      q var5;
      if(var4) {
         var5 = this.A();
         if(var5 != null) {
            return var5;
         }
      }

      var5 = var3.h;
      byte var11 = 0;
      if(var5 != null) {
         while(var5.h != null) {
            var5 = var5.h;
         }

         q var12 = null;
         q var13 = null;
         Object var14 = null;
         Object var15 = null;
         q var16 = null;
         q var17 = null;
         boolean var18 = false;

         for(boolean var19 = false; var5 != null; var5 = var5.g) {
            var19 = var18;
            var18 = this.g(var5);
            if(var12 == null && var18) {
               var12 = var5;
            }

            if(var19 && this.h(var5)) {
               var13 = var5;
               if(var17 == null) {
                  var17 = var12;
                  var11 = 2;
               } else if(var11 == 0) {
                  var11 = 2;
               }
            }

            if(var16 == null && this.d(var5)) {
               var16 = var5.h;
               if(var11 == 0) {
                  var17 = var5.h;
                  var11 = 1;
               } else if(var11 == 0) {
                  var11 = 1;
               }
            } else if(this.f(var5) && !this.d(var5) && !u.t(var5)) {
               if(var13 == null) {
                  var17 = var5;
                  var11 = 0;
                  if(!var18) {
                     var17 = var5.g;
                     var11 = 0;
                  }
               } else if(var11 == 0) {
                  var11 = 2;
               }
            }

            if(u.t(var5)) {
               if(u.x(var5)) {
                  break;
               }

               var17 = var5;
               var11 = 5;
            } else if(u.q(var5)) {
               var17 = var5;
               var11 = 3;
            }
         }

         if(var17 == null) {
            var17 = var12;
         }

         if(var11 == 0) {
            var17 = var12;
         }

         q var20 = var17 == null?null:var17.g;
         q var21 = this.i();
         var21.g = var20;
         if(var20 != null) {
            var20.h = var21;
         }

         if(var17 != null) {
            var17.g = null;
         }

         if(var17 == var3.h) {
            var3.h = null;
         }

         var2.h = var17;
      }

      var2.g = var3;
      this.f().g = var2;
      this.a(var2);
      return var2;
   }

   protected q k(int var1) {
      this.s();
      q var2 = q.a();
      var2.f = "";
      var2.a = var1;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = 0;
      var2.m = null;
      q var3 = this.a(1);
      q var4 = var3.h;
      this.t(var3);
      u.l(var4, this.i());
      if(var4 != null) {
         jindent.formatter.e.f var5 = new jindent.formatter.e.f(this.a);
         boolean var6 = var5.a(var4);
         q var7 = var5.a();
         q var8 = var5.b();
         if(var6 && var7 != null) {
            q var9 = u.j(var7, var8);
            u.l(var9, this.i());
            u.k(var7, var8);
            u.c(var7.h, this.a);
            u.b(var8.g, this.a);
            if(this.a.getHeaderIndex(h("\u0013\'-Yj\t\u000b\"Nj\t6%Ra6-(X")) == 1) {
               var2.h = null;
               this.a.addMessage(new Message(this.a.getLanguage(), h("?\'8Xl\u000f\'(\u001d\u007f\t\':T`\u000e1lUj\u001a&)O![\u0006)Qj\u000f\'(\u001di\t-!\u001d{\u00142b"), 3));
            } else if(this.a.getHeaderIndex(h("\u0013\'-Yj\t\u000b\"Nj\t6%Ra6-(X")) == 2) {
               var2.h = var9;
            } else {
               var2.h = var9;
            }
         }
      }

      var2.g = var3;
      this.f().g = var2;
      this.a(var2);
      return var2;
   }

   protected q A() {
      this.s();
      q var1 = q.a();
      var1.f = "";
      var1.a = 4000;
      var1.b = 0;
      var1.c = 0;
      var1.d = 0;
      var1.e = 0;
      var1.h = null;
      var1.l = 0;
      var1.m = null;
      q var2 = this.a(1);
      q var3 = var2.h;
      this.t(var2);
      if(var3 != null) {
         jindent.formatter.e.g var4 = new jindent.formatter.e.g(this.a);
         boolean var5 = var4.a(var3);
         q var6 = var4.a();
         q var7 = var4.b();
         if(var5 && var6 != null && var7 != null) {
            q var8 = u.j(var6, var7);
            u.l(var8, this.i());
            u.k(var6, var7);
            u.c(var6.h, this.a);
            u.b(var7.g, this.a);
            var1.h = var3;
            var2.h = null;
            if(this.a.getFooterIndex(h("\u001d-#Ij\t\u000b\"Nj\t6%Ra6-(X")) == 1) {
               var2.h = null;
               this.a.addMessage(new Message(this.a.getLanguage(), h("?\'8Xl\u000f\'(\u001d\u007f\t\':T`\u000e1l[`\u00146)O![\u0006)Qj\u000f\'(\u001di\t-!\u001dm\u001468RbU"), 3));
            } else if(this.a.getFooterIndex(h("\u001d-#Ij\t\u000b\"Nj\t6%Ra6-(X")) == 2) {
               var2.h = var8;
            } else {
               var2.h = var8;
            }

            var1.g = var2;
            this.f().g = var1;
            this.a(var1);
            return var1;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   protected void B() {
      this.d("");
      this.i(-69);
   }

   protected void C() {
      this.d("");
      this.i(-70);
   }

   protected void e(q var1, int var2) {
      this.s();
      this.d("");
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = -68;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.g = null;
      var3.l = var2;
      var3.m = var1;
      var3.g = this.a(1);
      this.f().g = var3;
      this.a(var3);
   }

   protected void c(q var1, q var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = -102;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.l = 0;
      var3.m = var2;
      var3.g = var1.g;
      var1.g = var3;
   }

   protected void d(q var1, q var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = -103;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.l = 0;
      var3.m = var2;
      var3.g = var1.g;
      var1.g = var3;
   }

   public q l(int var1) {
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -18;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = this.a.e.a(var1);
      var2.m = null;
      var2.g = null;
      return var2;
   }

   protected void m(int var1) {
      if(this.F()) {
         this.s();
         q var2 = this.o(var1);
         var2.g = this.a(1);
         this.f().g = var2;
         this.a(var2);
      }
   }

   protected void D() {
      if(this.F()) {
         this.s();
         q var1 = q.a();
         var1.f = emptyString;
         var1.a = -97;
         var1.b = 0;
         var1.c = 0;
         var1.d = 0;
         var1.e = 0;
         var1.h = null;
         var1.g = null;
         var1.l = 0;
         var1.m = null;
         var1.g = this.a(1);
         this.f().g = var1;
         this.a(var1);
      }
   }

   protected void n(int var1) {
      if(this.F()) {
         this.s();
         q var2 = this.l(var1);
         var2.g = this.a(1);
         this.f().g = var2;
         this.a(var2);
      }
   }

   protected void a(int var1, int var2, q var3) {
      if(this.F()) {
         this.s();
         q var4 = q.a();
         var4.f = emptyString;
         var4.a = -19;
         var4.b = 0;
         var4.c = 0;
         var4.d = 0;
         var4.e = 0;
         var4.h = var3;
         var4.g = null;
         var4.l = this.a.e.a(var1);
         var4.m = new Integer(var2);
         var4.g = this.a(1);
         this.f().g = var4;
         this.a(var4);
      }
   }

   protected void a(int var1, int var2) {
      this.a(var1, var2, (q)null);
   }

   public q o(int var1) {
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -17;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.l = this.a.e.a(var1);
      var2.m = null;
      var2.g = null;
      return var2;
   }

   protected void p(int var1) {
      if(this.f().a == -20) {
         q var10000 = this.f();
         var10000.l += var1;
      } else {
         this.s();
         q var2 = this.q(var1);
         var2.g = this.a(1);
         this.f().g = var2;
         this.a(var2);
      }

   }

   public q q(int var1) {
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -20;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = null;
      var2.l = var1;
      var2.m = null;
      return var2;
   }

   protected void g(String var1) {
      this.s();
      q var2 = this.b(var1);
      var2.h = this.a(1).h;
      this.a(1).h = null;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void a(BracesSetting var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -55;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = null;
      ++this.b;
      var2.l = this.b;
      var2.m = var1;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void b(BracesSetting var1) {
      this.s();
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -56;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = null;
      var2.l = this.b;
      var2.m = var1;
      --this.b;
      var2.g = this.a(1);
      this.f().g = var2;
      this.a(var2);
   }

   protected void E() {
      this.a(true);
   }

   protected void a(boolean var1) {
      this.s();
      q var2 = this.d(this.f(), var1);
      this.a(var2);
   }

   protected q d(q var1, boolean var2) {
      q var3 = this.b(var2);
      var3.g = var1.g;
      var1.g = var3;
      return var3;
   }

   public q b(boolean var1) {
      q var2 = q.a();
      var2.f = emptyString;
      var2.a = -202;
      var2.b = 0;
      var2.c = 0;
      var2.d = 0;
      var2.e = 0;
      var2.h = null;
      var2.g = null;
      var2.l = var1?1:0;
      var2.m = null;
      return var2;
   }

   protected void r(int var1) {
      this.s();
      q var2 = this.f(this.f(), var1);
      this.a(var2);
   }

   protected q f(q var1, int var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = -203;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.g = null;
      var3.l = var2;
      var3.m = null;
      var3.g = var1.g;
      var1.g = var3;
      return var3;
   }

   private void a(int var1, boolean var2) {
      this.s();
      q var3 = this.a(this.f(), var1, var2);
      this.a(var3);
   }

   private q a(q var1, int var2, boolean var3) {
      q var4 = this.b(var2, var3);
      var4.g = var1.g;
      var1.g = var4;
      return var4;
   }

   public q b(int var1, boolean var2) {
      q var3 = q.a();
      var3.f = emptyString;
      var3.a = var1;
      var3.b = 0;
      var3.c = 0;
      var3.d = 0;
      var3.e = 0;
      var3.h = null;
      var3.g = null;
      var3.l = var2?1:0;
      var3.m = null;
      return var3;
   }

   public q c(boolean var1) {
      return this.b(-200, var1);
   }

   public q d(boolean var1) {
      return this.b(-201, var1);
   }

   protected void e(q var1, boolean var2) {
      this.a(var1, -200, var2);
   }

   protected void f(q var1, boolean var2) {
      this.a(var1, -201, var2);
   }

   protected void e(boolean var1) {
      this.a(-200, var1);
   }

   protected void f(boolean var1) {
      this.a(-201, var1);
   }

   public Object clone() {
      try {
         t var1 = (t)super.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2.toString());
      }
   }

   protected boolean F() {
      q var1 = this.r();
      return var1 != null?var1.s:true;
   }

   private static String h(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 123;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 76;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
