package jindent.cpp.b.c.a;

import jindent.cpp.b.c.a.b;
import jindent.cpp.b.c.a.e;
import jindent.util.MyStringBuffer;

public class c extends b {
   private MyStringBuffer d;
   private String e;
   private String f;

   public c() {
      this((e)null);
   }

   public c(e var1) {
      super(var1);
      this.d = new MyStringBuffer();
      this.e = "";
      this.f = "";
   }

   public void a(String var1) {
      this.d.a(var1);
   }

   public String e() {
      return this.d.toString();
   }

   public String toString() {
      return this.e();
   }

   public void a(jindent.cpp.b.c.a.a.a var1) {
      var1.a(this);
      var1.b(this);
      e var2 = this.b();
      if(var2 != null) {
         var2.a(var1);
      }

   }

   public String f() {
      return this.e;
   }

   public void b(String var1) {
      this.e = var1;
   }

   public String g() {
      return this.f;
   }

   public void c(String var1) {
      this.f = var1;
   }

   public String h() {
      MyStringBuffer var1 = new MyStringBuffer();
      var1.a(this.e);
      var1.a((Object)this.d);
      var1.a(this.f);
      return var1.toString();
   }
}
