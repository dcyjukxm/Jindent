package jindent.java.a;

public class o extends jindent.formatter.b.j {
   public o() {
      super(14);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return b(">O,\u0005;5M-\u0003\"WZbNgY\u0001?");
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 119;
            break;
         case 1:
            var10003 = 33;
            break;
         case 2:
            var10003 = 66;
            break;
         case 3:
            var10003 = 96;
            break;
         default:
            var10003 = 73;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
