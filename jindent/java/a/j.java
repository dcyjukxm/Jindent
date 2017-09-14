package jindent.java.a;

public class j extends jindent.formatter.b.i implements jindent.formatter.b.e {
   protected String i;

   public j() {
      super(17);
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
      return a("~`kU\u001eid(") + this.i;
   }

   private static String a(String var0) {
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
            var10003 = 1;
            break;
         case 2:
            var10003 = 8;
            break;
         case 3:
            var10003 = 62;
            break;
         default:
            var10003 = 127;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
