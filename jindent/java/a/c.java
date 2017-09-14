package jindent.java.a;

import jindent.java.a.b;

public class c extends b implements jindent.formatter.b.a {
   private c l;
   private boolean m;

   public c(boolean var1) {
      this.m = var1;
      this.l = null;
   }

   public String toString() {
      return e("k\u000bzx6c\tzv:fEue:n\u0001),") + this.e();
   }

   public void a(jindent.formatter.b.a var1) {
      this.l = (c)var1;
   }

   public jindent.formatter.b.a a() {
      return this.l;
   }

   public boolean b() {
      return this.l != null;
   }

   public boolean c() {
      return this.m;
   }

   private static String e(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 2;
            break;
         case 1:
            var10003 = 101;
            break;
         case 2:
            var10003 = 19;
            break;
         case 3:
            var10003 = 12;
            break;
         default:
            var10003 = 95;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
