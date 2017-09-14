package jindent.cpp.b.c.b;

import jindent.MessageList;
import jindent.cpp.b.c.b.c;
import jindent.util.MyStringBuffer;

public class e implements jindent.cpp.b.c.a.a.a {
   private jindent.cpp.b.c.c a = new jindent.cpp.b.c.c();
   private MyStringBuffer b = new MyStringBuffer();
   private jindent.cpp.b.c.a.d c = null;
   private jindent.cpp.b.c.a.d d = null;
   private boolean e = false;

   public void a(jindent.cpp.b.c.a.d var1) {
      if(!this.e) {
         if(this.c == null) {
            this.c = var1;
         }

         this.d = var1;
         int var2 = var1.g();
         int var3 = var1.f();
         this.a.a(var2, var3);
      }

   }

   public void b(jindent.cpp.b.c.a.d var1) {
   }

   public void a(jindent.cpp.b.c.a.c var1) {
      jindent.cpp.b.c.a.d var2 = var1.c();
      int var3 = var2 == null?1:var2.e();
      int var4 = var2 == null?0:var2.d(var1);
      int var5 = var2 == null?0:var2.g();
      String var6;
      String var7;
      String var8;
      if(this.a()) {
         var6 = var1.f();
         var7 = var1.g();
         var8 = var1.e();
         this.b.a(jindent.cpp.b.c.b.a.a(var5, var4, var6));
         this.b.a(jindent.cpp.b.c.b.a.b(var5, var4, var8));
         if(var4 == var3 - 1) {
            this.b.a(jindent.cpp.b.c.b.a.c(var5, var4, var7));
         }
      } else {
         var6 = var1.f();
         var7 = var1.g();
         var8 = var1.e();
         this.b.a(jindent.cpp.b.c.b.a.d(var5, var4, var6));
         this.b.a(var8);
         if(var4 == var3 - 1) {
            this.b.a(jindent.cpp.b.c.b.a.e(var5, var4, var7));
         }
      }

   }

   public void b(jindent.cpp.b.c.a.c var1) {
   }

   public jindent.cpp.b.c.a.d b() {
      return this.c;
   }

   public jindent.cpp.b.c.a.d c() {
      return this.d;
   }

   public boolean a() {
      return this.e;
   }

   public void a(boolean var1) {
      this.e = var1;
   }

   public c d() {
      return new c(this.b.toString(), new MessageList(), this.a);
   }
}
