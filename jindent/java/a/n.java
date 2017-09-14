package jindent.java.a;

public class n extends jindent.formatter.b.j implements jindent.formatter.b.f, jindent.formatter.b.d, jindent.formatter.b.e {
   protected String o;
   protected jindent.formatter.l p;
   protected boolean q = true;
   protected boolean r = false;

   public n() {
      super(11);
   }

   public int g() {
      return this.q?12:11;
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

   public void e(boolean var1) {
      this.q = var1;
   }

   public boolean s() {
      return this.q;
   }

   public boolean a() {
      return this.r;
   }

   public void a(boolean var1) {
      this.r = var1;
   }

   public String toString() {
      return d("|,ys&") + this.o;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 25;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 12;
            break;
         case 3:
            var10003 = 30;
            break;
         default:
            var10003 = 6;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
