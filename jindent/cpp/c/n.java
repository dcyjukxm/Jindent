package jindent.cpp.c;

public class n extends jindent.formatter.b.i {
   public n() {
      super(60);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a("NAq\u0000[HFy\u001aQ~\\lU");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 27;
            break;
         case 1:
            var10003 = 50;
            break;
         case 2:
            var10003 = 24;
            break;
         case 3:
            var10003 = 110;
            break;
         default:
            var10003 = 60;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
