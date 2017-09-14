package jindent.formatter;

public class i {
   private int a;
   private int b;

   public i() {
      this.e();
   }

   public i(String var1) {
      this.a(var1);
   }

   public int a() {
      return this.a;
   }

   public void b() {
      ++this.a;
   }

   public int c() {
      return this.b;
   }

   public void d() {
      ++this.b;
   }

   public void e() {
      this.a = 0;
      this.b = 0;
   }

   public void a(String var1) {
      this.e();
      int var2 = var1.length();

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var1.charAt(var3);
         if(var4 == 13) {
            ++this.a;
         } else if(var4 == 10) {
            ++this.b;
         }
      }

   }
}
