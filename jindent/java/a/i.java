package jindent.java.a;

public class i extends jindent.formatter.b.i {
   public i() {
      super(16);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a("c\u001140\u000ev\u00114");
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
            var10003 = 42;
            break;
         case 2:
            var10003 = 15;
            break;
         case 3:
            var10003 = 30;
            break;
         default:
            var10003 = 32;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
