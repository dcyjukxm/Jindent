package jindent.util.swing;

class j {
   private Thread a;

   j(Thread var1) {
      this.a = var1;
   }

   synchronized Thread a() {
      return this.a;
   }

   synchronized void b() {
      this.a = null;
   }
}
