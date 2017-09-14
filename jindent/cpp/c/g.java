package jindent.cpp.c;

import javax.help.UnsupportedOperationException;
import jindent.cpp.c.d;

public class g extends d implements jindent.formatter.b.e, jindent.formatter.b.c {
   protected String l;
   protected String m;

   public g() {
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
            var1.append(i(".5"));
         }
      }

      return i("op\u0010\u000bff5") + this.l + "(" + var1.toString() + ")" + (this.j()?"":i("\"=\u0002\f{ot\u0010\u0017`lr)\fmg5YCfdsM"));
   }

   public static int d(String var0) {
      return e(var0)?25:(f(var0)?26:(g(var0)?27:(h(var0)?28:29)));
   }

   public static boolean e(String var0) {
      return var0.equals(i("ep\u0010")) || var0.startsWith(i("ep\u0010")) && a(var0.charAt(3));
   }

   public static boolean f(String var0) {
      return var0.equals(i("qp\u0010")) || var0.startsWith(i("qp\u0010")) && a(var0.charAt(3));
   }

   public static boolean g(String var0) {
      return var0.equals(i("jt\u0017")) || var0.startsWith(i("jt\u0017")) && a(var0.charAt(3));
   }

   public static boolean h(String var0) {
      return var0.equals(i("kf")) || var0.startsWith(i("kf")) && a(var0.charAt(2));
   }

   private static boolean a(char var0) {
      return Character.getType(var0) == 1;
   }

   public String b() {
      throw new UnsupportedOperationException();
   }

   private static String i(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 2;
            break;
         case 1:
            var10003 = 21;
            break;
         case 2:
            var10003 = 100;
            break;
         case 3:
            var10003 = 99;
            break;
         default:
            var10003 = 9;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
