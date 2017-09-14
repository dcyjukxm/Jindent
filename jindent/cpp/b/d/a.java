package jindent.cpp.b.d;

public class a {
   private String a;
   private String b;
   private boolean c;

   public a(String var1, String var2) {
      this(var1, var2, false);
   }

   public a(String var1, String var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public String a() {
      return this.b;
   }

   public void a(String var1) {
      this.b = var1;
   }

   public String b() {
      return this.a;
   }

   public void b(String var1) {
      this.a = var1;
   }

   public String toString() {
      return this.a + c("IL") + this.b;
   }

   public boolean c() {
      return this.c;
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public boolean d() {
      return this.b == null || "".equals(this.b.trim());
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 101;
            break;
         case 1:
            var10003 = 108;
            break;
         case 2:
            var10003 = 113;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 26;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
