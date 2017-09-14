package jindent.formatter;

import jindent.formatter.Caret;
import jindent.formatter.q;

public class g {
   private q a;
   private int b;
   private int c;
   private int d;
   private int e;

   public g(q var1, int var2, int var3, int var4, int var5) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
      this.e = var4;
      this.d = var5;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public q e() {
      return this.a;
   }

   public boolean a(Caret var1) {
      return this.b <= var1.getColumn() && this.c <= var1.getLine() && var1.getColumn() <= this.d && var1.getLine() <= this.e;
   }

   public String toString() {
      return "[" + this.b + a("t\"") + this.c + a("\u0005Y") + this.d + a("t\"") + this.e + "]";
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 88;
            break;
         case 1:
            var10003 = 2;
            break;
         case 2:
            var10003 = 67;
            break;
         case 3:
            var10003 = 77;
            break;
         default:
            var10003 = 11;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
