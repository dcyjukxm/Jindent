package jindent.cpp.c;

public class l extends jindent.formatter.b.i implements jindent.formatter.b.f {
   private boolean i = false;

   public l() {
      super(65);
   }

   public String toString() {
      return a("{\"B\u0015\u0007w3W");
   }

   public boolean a() {
      return this.i;
   }

   public void a(boolean var1) {
      this.i = var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 22;
            break;
         case 1:
            var10003 = 71;
            break;
         case 2:
            var10003 = 54;
            break;
         case 3:
            var10003 = 116;
            break;
         default:
            var10003 = 99;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
