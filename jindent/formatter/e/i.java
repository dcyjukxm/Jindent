package jindent.formatter.e;

public class i extends jindent.formatter.b.i {
   public i() {
      super(0);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a("b\u0004NM\u0006x");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 10;
            break;
         case 1:
            var10003 = 97;
            break;
         case 2:
            var10003 = 47;
            break;
         case 3:
            var10003 = 41;
            break;
         default:
            var10003 = 99;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
