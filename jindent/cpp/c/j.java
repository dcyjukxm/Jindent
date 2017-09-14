package jindent.cpp.c;

public class j extends jindent.formatter.b.i implements jindent.formatter.b.d {
   protected jindent.formatter.l i;

   public j() {
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
      return a("\u007f7PD\"W5PJ.Dy") + (this.i.d()?a("E-XD\"Uy"):"") + a("My\u0017\u001ee\u0016$\u0019");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 54;
            break;
         case 1:
            var10003 = 89;
            break;
         case 2:
            var10003 = 57;
            break;
         case 3:
            var10003 = 48;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
