package jindent.cpp.c;

public class q extends jindent.formatter.b.j implements jindent.formatter.b.f {
   private boolean o = false;

   public q() {
      super(63);
   }

   public String toString() {
      return b("\u0002+ev.\t\'+n?\u000b!b{&\r#\u007ft \u0000");
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
            var10003 = 110;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 11;
            break;
         case 3:
            var10003 = 29;
            break;
         default:
            var10003 = 79;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
