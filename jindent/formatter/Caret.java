package jindent.formatter;

public class Caret {
   private int a;
   private int b;

   public Caret(int var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public int getColumn() {
      return this.a;
   }

   public int getLine() {
      return this.b;
   }

   public String toString() {
      return "[" + this.a + a("@\u0015") + this.b + "]";
   }

   public double distanceTo(Caret var1) {
      double var2 = (double)(var1.getColumn() - this.getColumn());
      double var4 = (double)(var1.getLine() - this.getLine());
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 108;
            break;
         case 1:
            var10003 = 53;
            break;
         case 2:
            var10003 = 94;
            break;
         case 3:
            var10003 = 115;
            break;
         default:
            var10003 = 120;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
