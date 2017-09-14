package jindent.java.a;

public class k extends jindent.formatter.b.j implements jindent.formatter.b.d, jindent.formatter.b.e {
   protected String o;
   protected jindent.formatter.l p;

   public k() {
      super(13);
   }

   public String e() {
      return this.o;
   }

   public void b(String var1) {
      this.o = var1;
   }

   public void a(jindent.formatter.l var1) {
      this.p = var1;
   }

   public jindent.formatter.l d() {
      return this.p;
   }

   public String toString() {
      return d("_\t)x\u0005_\u0013.x\u001f\u001e") + this.o;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 62;
            break;
         case 1:
            var10003 = 103;
            break;
         case 2:
            var10003 = 71;
            break;
         case 3:
            var10003 = 23;
            break;
         default:
            var10003 = 113;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
