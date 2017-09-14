package jindent.cpp.c;

public class a extends jindent.formatter.b.i implements jindent.formatter.b.f {
   private boolean i = false;

   public a() {
      super(64);
   }

   public String toString() {
      return a("q7;[N053WXc+3YX0?7\\T~2&SR~");
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
            var10003 = 16;
            break;
         case 1:
            var10003 = 91;
            break;
         case 2:
            var10003 = 82;
            break;
         case 3:
            var10003 = 58;
            break;
         default:
            var10003 = 61;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
