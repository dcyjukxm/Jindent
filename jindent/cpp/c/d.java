package jindent.cpp.c;

import jindent.util.MyVector;

public class d extends jindent.formatter.b.i implements jindent.formatter.b.d, jindent.formatter.b.g {
   protected MyVector i = new MyVector();
   protected MyVector j = new MyVector();
   protected jindent.formatter.l k;

   public d(int var1) {
      super(var1);
   }

   public void a(String var1, String var2) {
      this.i.d(var1);
      this.j.d(var2);
   }

   public String a(int var1) {
      return (String)this.j.d(var1);
   }

   public String b(int var1) {
      return (String)this.i.d(var1);
   }

   public int c() {
      return this.j.c();
   }

   public boolean f() {
      return this.c() > 0;
   }

   public void a(jindent.formatter.l var1) {
      this.k = var1;
   }

   public jindent.formatter.l d() {
      return this.k;
   }
}
