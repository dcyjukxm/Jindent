package jindent.cpp.b.c.a;

import java.util.ArrayList;
import java.util.List;
import jindent.cpp.b.c.a.b;
import jindent.cpp.b.c.a.e;

public class d extends b {
   private int d;
   private int e;
   private List f;

   public d(e var1, int var2) {
      super(var1);
      this.d = var2;
      this.f = new ArrayList();
      this.e = 0;
   }

   public void c(e var1) {
      this.f.add(var1);
      var1.a((e)this);
   }

   public int e() {
      return this.f.size();
   }

   public void a(int var1) {
      this.e = var1;
   }

   public int f() {
      return this.e;
   }

   public int d(e var1) {
      int var2 = this.f.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         e var4 = this.b(var3);
         if(this.a(var4, var1)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean a(e var1, e var2) {
      e var3;
      for(var3 = var1; var3 != null && var3 != var2; var3 = var3.b()) {
         ;
      }

      return var3 == var2;
   }

   private d e(e var1) {
      e var2;
      for(var2 = var1; var2 != null && !(var2 instanceof d); var2 = var2.b()) {
         ;
      }

      return (d)var2;
   }

   public e b(int var1) {
      return (e)this.f.get(var1);
   }

   public void a(jindent.cpp.b.c.a.a.a var1) {
      var1.a(this);
      int var2 = this.f.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         e var4 = (e)this.f.get(var3);
         if(var3 == this.e) {
            var4.a(var1);
         } else {
            boolean var5 = var1.a();
            var1.a(true);
            var4.a(var1);
            var1.a(var5);
         }
      }

      var1.b(this);
      e var6 = this.b();
      if(var6 != null) {
         var6.a(var1);
      }

   }

   public int g() {
      return this.d;
   }

   public int hashCode() {
      return this.g();
   }

   public boolean equals(Object var1) {
      if(var1 instanceof d) {
         d var2 = (d)var1;
         return var2.g() == this.g();
      } else {
         return false;
      }
   }
}
