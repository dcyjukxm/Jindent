package jindent.java.a;

public class p extends jindent.formatter.b.j implements jindent.formatter.b.f, jindent.formatter.b.d, jindent.formatter.b.e {
   protected String o;
   protected jindent.formatter.l p;
   protected boolean q = false;

   public p() {
      super(4);
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

   public boolean a() {
      return this.q;
   }

   public void a(boolean var1) {
      this.q = var1;
   }

   public String toString() {
      return d("\u0017W:,\u007f\u0018X-,-") + this.o;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 126;
            break;
         case 1:
            var10003 = 57;
            break;
         case 2:
            var10003 = 78;
            break;
         case 3:
            var10003 = 73;
            break;
         default:
            var10003 = 13;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
