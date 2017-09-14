package jindent.java.a;

public class l extends jindent.formatter.b.j {
   public l() {
      super(15);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return b("m#\u0005P!|;\u000bG\'J!\u001e\b");
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 47;
            break;
         case 1:
            var10003 = 79;
            break;
         case 2:
            var10003 = 106;
            break;
         case 3:
            var10003 = 51;
            break;
         default:
            var10003 = 74;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
