package jindent.java.a;

public class a extends jindent.formatter.b.i {
   protected String i;

   public a() {
      super(18);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a("\u001f>j\u001b(");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 122;
            break;
         case 1:
            var10003 = 83;
            break;
         case 2:
            var10003 = 26;
            break;
         case 3:
            var10003 = 111;
            break;
         default:
            var10003 = 81;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
