package jindent.java.a;

public class e extends jindent.formatter.b.i implements jindent.formatter.b.d {
   protected jindent.formatter.l i;

   public e() {
      super(9);
   }

   public int g() {
      return this.i.d()?10:9;
   }

   public void a(jindent.formatter.l var1) {
      this.i = var1;
   }

   public jindent.formatter.l d() {
      return this.i;
   }

   public String toString() {
      return a("|K~\u0017HTI~\u0019DG\u0005") + (this.i.d()?a("FQv\u0017HV\u0005"):"") + a("N\u00059M\u000f\u0015X7");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 53;
            break;
         case 1:
            var10003 = 37;
            break;
         case 2:
            var10003 = 23;
            break;
         case 3:
            var10003 = 99;
            break;
         default:
            var10003 = 33;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
