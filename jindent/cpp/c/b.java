package jindent.cpp.c;

public class b extends jindent.formatter.b.i {
   public b() {
      super(18);
   }

   public boolean h() {
      return false;
   }

   public String toString() {
      return a(";\u000bt\u001fW");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 94;
            break;
         case 1:
            var10003 = 102;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 107;
            break;
         default:
            var10003 = 46;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
