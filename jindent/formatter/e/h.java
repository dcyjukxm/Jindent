package jindent.formatter.e;

public class h extends jindent.formatter.b.i {
   public h() {
      super(1);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a("\u0004\u0003\bL=\u0010");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 98;
            break;
         case 1:
            var10003 = 108;
            break;
         case 2:
            var10003 = 103;
            break;
         case 3:
            var10003 = 56;
            break;
         default:
            var10003 = 88;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
