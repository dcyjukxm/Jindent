package jindent.cpp.c;

public class r extends jindent.formatter.b.j {
   private static final String o = "$JXu*$";
   private String p;

   public r() {
      this(d("$JXu*$"));
   }

   public r(String var1) {
      super(67);
      this.p = var1;
   }

   public String toString() {
      return d("cazY\n|$s^\fbeeZ\u001bgkyHO&etX\n}wDK\nmmqR\n|$*\u001b") + this.p + ")";
   }

   public String a() {
      return this.p;
   }

   public void b(String var1) {
      this.p = var1;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 14;
            break;
         case 1:
            var10003 = 4;
            break;
         case 2:
            var10003 = 23;
            break;
         case 3:
            var10003 = 59;
            break;
         default:
            var10003 = 111;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
