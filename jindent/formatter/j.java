package jindent.formatter;

public class j {
   private int a;
   private boolean b;

   public j(int var1) {
      this.a = var1;
      this.b = false;
   }

   public j() {
      this(0);
   }

   public int a() {
      return this.a;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   public boolean b() {
      return this.b;
   }
}
