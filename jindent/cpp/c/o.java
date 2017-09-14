package jindent.cpp.c;

public class o extends jindent.formatter.b.j implements jindent.formatter.b.f, jindent.formatter.b.d, jindent.formatter.b.e {
   protected String o;
   protected jindent.formatter.l p;
   protected boolean q = false;
   protected boolean r = false;

   public o() {
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

   public boolean s() {
      return this.r;
   }

   public void e(boolean var1) {
      this.r = var1;
   }

   public String toString() {
      return (this.r?d("\'$vsx6;&"):"") + d("01geos") + this.o + (this.j()?"":d("su`yn><rbu=:Kyx6};6s5;/"));
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 83;
            break;
         case 1:
            var10003 = 93;
            break;
         case 2:
            var10003 = 6;
            break;
         case 3:
            var10003 = 22;
            break;
         default:
            var10003 = 28;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
