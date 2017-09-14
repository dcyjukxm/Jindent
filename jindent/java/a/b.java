package jindent.java.a;

public class b extends jindent.formatter.b.i implements jindent.formatter.b.l, jindent.formatter.b.d, jindent.formatter.b.e {
   protected String i;
   protected String j;
   protected jindent.formatter.l k;

   public b() {
      super(7);
   }

   public int g() {
      return this.k.d()?8:7;
   }

   public String e() {
      return this.i;
   }

   public void b(String var1) {
      this.i = var1;
   }

   public String f() {
      return this.j;
   }

   public void a(String var1) {
      this.j = var1;
   }

   public void a(jindent.formatter.l var1) {
      this.k = var1;
   }

   public jindent.formatter.l d() {
      return this.k;
   }

   public String toString() {
      return (this.k.d()?d("=w\u0004!\u001c-#"):"") + d("(j\u00009\u0011");
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 78;
            break;
         case 1:
            var10003 = 3;
            break;
         case 2:
            var10003 = 101;
            break;
         case 3:
            var10003 = 85;
            break;
         default:
            var10003 = 117;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
