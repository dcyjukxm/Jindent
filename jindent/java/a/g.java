package jindent.java.a;

import jindent.java.a.f;

public class g extends f {
   public g() {
      super(6);
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      int var2 = this.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.append(this.b(var3));
         var1.append(" ");
         var1.append(this.a(var3));
         if(var3 < var2 - 1) {
            var1.append(a("e0"));
         }
      }

      return a("*\u007fE;\u000b;eH<\u0010;0\u0003") + var1.toString() + ")";
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 73;
            break;
         case 1:
            var10003 = 16;
            break;
         case 2:
            var10003 = 43;
            break;
         case 3:
            var10003 = 72;
            break;
         default:
            var10003 = 127;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
