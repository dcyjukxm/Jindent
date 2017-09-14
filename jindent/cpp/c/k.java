package jindent.cpp.c;

public class k extends jindent.formatter.b.i implements jindent.formatter.b.e {
   protected String i;

   public k() {
      super(57);
   }

   public boolean h() {
      return false;
   }

   public String e() {
      return this.i;
   }

   public void b(String var1) {
      this.i = var1;
   }

   public String toString() {
      return a("\u0018y\u0001\u000fA\u0007h\u0001\f@\u0007y\u0002\n]\u000b\u007f\r\u0010]H") + this.i;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 104;
            break;
         case 1:
            var10003 = 11;
            break;
         case 2:
            var10003 = 100;
            break;
         case 3:
            var10003 = 127;
            break;
         default:
            var10003 = 51;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
