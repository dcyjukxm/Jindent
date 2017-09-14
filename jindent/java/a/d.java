package jindent.java.a;

public class d extends jindent.formatter.b.i implements jindent.formatter.b.b, jindent.formatter.b.e, jindent.formatter.b.d {
   protected String i;
   protected jindent.formatter.l j;
   protected boolean k = false;

   public d() {
      super(19);
   }

   public String e() {
      return this.i;
   }

   public void b(String var1) {
      this.i = var1;
      this.k = d(var1);
   }

   private static boolean d(String var0) {
      String[] var1 = new String[]{e("~\u0002L3\th\u0003\u000f"), e("w\fW|T"), e("w\fW|\u00023"), e("n\u0018OjT")};

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var0.startsWith(var1[var2])) {
            return true;
         }
      }

      return false;
   }

   public boolean a() {
      return this.k;
   }

   public void a(jindent.formatter.l var1) {
      this.j = var1;
   }

   public jindent.formatter.l d() {
      return this.j;
   }

   public String toString() {
      return e("t\u0000Qr\biM") + this.i;
   }

   public boolean a(String var1) {
      if(var1.endsWith("*")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      return this.i.startsWith(var1);
   }

   private static String e(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 29;
            break;
         case 1:
            var10003 = 109;
            break;
         case 2:
            var10003 = 33;
            break;
         case 3:
            var10003 = 29;
            break;
         default:
            var10003 = 122;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
