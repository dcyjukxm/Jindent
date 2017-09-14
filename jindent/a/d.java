package jindent.a;

import jindent.formatter.q;

public class d {
   private boolean a;
   private q b;

   public d() {
      this(false, (q)null);
   }

   public d(boolean var1, q var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a() {
      return this.a;
   }

   public q b() {
      return this.b;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public void b(boolean var1) {
      this.a |= var1;
   }

   public void a(q var1) {
      this.b = var1;
   }
}
