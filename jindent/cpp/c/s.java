package jindent.cpp.c;

public class s extends jindent.formatter.b.j implements jindent.formatter.b.f {
   private boolean o = false;

   public s() {
      super(66);
   }

   public String toString() {
      return b("4BA\u0000%*BO\u0000");
   }

   public boolean a() {
      return this.o;
   }

   public void a(boolean var1) {
      this.o = var1;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 90;
            break;
         case 1:
            var10003 = 35;
            break;
         case 2:
            var10003 = 44;
            break;
         case 3:
            var10003 = 101;
            break;
         default:
            var10003 = 86;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
