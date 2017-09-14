package jindent.java.a;

public class m extends jindent.formatter.b.j implements jindent.formatter.b.f, jindent.formatter.b.d, jindent.formatter.b.e {
   protected String o;
   protected jindent.formatter.l p;
   protected boolean q = false;

   public m() {
      super(3);
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
      return d("\u0013/_N\u0007P") + this.o + (this.j()?"":d("PkXR\u0006\u001d\"JI\u001d\u001e$sR\u0010\u0015c\u0003\u001d\u001b\u0016%\u0017"));
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 112;
            break;
         case 1:
            var10003 = 67;
            break;
         case 2:
            var10003 = 62;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 116;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
