package jindent.java.a;

import jindent.java.a.f;

public class h extends f implements jindent.formatter.b.e, jindent.formatter.b.c {
   protected String l;
   protected String m;

   public h() {
      super(5);
   }

   public String e() {
      return this.l;
   }

   public void b(String var1) {
      this.l = var1;
   }

   public int a() {
      return d(this.l);
   }

   public void a(String var1) {
      this.m = var1;
   }

   public String o() {
      return this.m;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      int var2 = this.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.append(this.b(var3));
         var1.append(" ");
         var1.append(this.a(var3));
         if(var3 < var2 - 1) {
            var1.append(i("\u001f\u0001"));
         }
      }

      return i("^Do9hW\u0001") + this.l + "(" + var1.toString() + ")" + (this.j()?"":i("\u0013\t}>u^@o%n]FV>cV\u0001&qhUG2"));
   }

   public static int d(String var0) {
      return e(var0)?25:(f(var0)?26:(g(var0)?27:(h(var0)?28:29)));
   }

   public static boolean e(String var0) {
      return var0.equals(i("TDo")) || var0.startsWith(i("TDo")) && a(var0.charAt(3));
   }

   public static boolean f(String var0) {
      return var0.equals(i("@Do")) || var0.startsWith(i("@Do")) && a(var0.charAt(3));
   }

   public static boolean g(String var0) {
      return var0.equals(i("[@h")) || var0.startsWith(i("[@h")) && a(var0.charAt(3));
   }

   public static boolean h(String var0) {
      return var0.equals(i("ZR")) || var0.startsWith(i("ZR")) && a(var0.charAt(2));
   }

   private static boolean a(char var0) {
      return Character.getType(var0) == 1;
   }

   private String a(int var1, String var2) {
      int var3 = var2.length();
      return var1 >= var3?var2:Character.toLowerCase(var2.charAt(var1)) + var2.substring(var1 + 1);
   }

   public String b() {
      return !e(this.l) && !g(this.l) && !f(this.l)?(h(this.l)?this.a(2, this.l):null):this.a(3, this.l);
   }

   private static String i(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 51;
            break;
         case 1:
            var10003 = 33;
            break;
         case 2:
            var10003 = 27;
            break;
         case 3:
            var10003 = 81;
            break;
         default:
            var10003 = 7;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
