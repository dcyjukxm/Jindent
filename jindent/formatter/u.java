package jindent.formatter;

import jindent.cpp.b.c.d;
import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.r;
import jindent.formatter.s;
import jindent.util.MyStringBuffer;

public class u implements s {
   private static final String a = "IA^r";
   private static final String b = "IA^t";
   private static final String c = "IA^\u001db%C";
   private static final String d = "\u001d.}7E\u0003\u001c}-i\t\ri";
   private static final String e = "IAj";
   private static final String f = "IAj";
   private static final String g = "=---";
   private static final String h = "-";
   static final String i = String.valueOf("");

   public static int a(q var0) {
      q var1 = var0;

      int var2;
      for(var2 = 0; var1 != null; var1 = var1.g) {
         ++var2;
      }

      return var2;
   }

   public static int a(q var0, q var1) {
      q var2 = var0;

      int var3;
      for(var3 = 0; var2 != null && var2 != var1.g; var2 = var2.g) {
         ++var3;
      }

      return var3;
   }

   public static int a(q var0, q var1, int var2) {
      q var3 = var0;

      int var4;
      for(var4 = 0; var3 != null && var3 != var1.g; var3 = var3.g) {
         if(var3.a == var2) {
            ++var4;
         }
      }

      return var4;
   }

   public static int b(q var0, q var1) {
      return var1.q - var0.q;
   }

   public static boolean c(q var0, q var1) {
      for(q var2 = var0; var2 != var1.g; var2 = var2.g) {
         if(var2.a >= 0) {
            return true;
         }
      }

      return false;
   }

   public static boolean d(q var0, q var1) {
      for(q var2 = var0; var2 != var1.g; var2 = var2.g) {
         if(w(var2)) {
            return true;
         }
      }

      return false;
   }

   public static boolean e(q var0, q var1) {
      for(q var2 = var0; var2 != var1.g; var2 = var2.g) {
         if(var2.a >= 0 || var2.a == -28) {
            return true;
         }
      }

      return false;
   }

   public static void b(q var0) {
      q var1 = q.a();
      var1.a = -25;
      var1.f = i;
      var1.c = var0.k.c;
      var1.e = var0.k.e;
      var1.b = var0.k.b;
      var1.d = var0.k.d;
      var1.h = null;
      var1.q = var0.q;
      q var2 = var0.g;
      var0.g = var1;
      var1.k = var0;
      var1.g = var2;
      var2.k = var1;
   }

   public static q c(q var0) {
      q var1 = q.a();
      var1.a = -25;
      var1.f = i;
      var1.b = var0.b;
      var1.c = var0.c;
      var1.d = var0.b;
      var1.e = var0.c;
      var1.h = null;
      var1.q = var0.q;
      q var2 = var0.k;
      var2.g = var1;
      var1.k = var2;
      var1.g = var0;
      var0.k = var1;
      return var1;
   }

   public static r[] a(q var0, q var1, r[] var2, int var3) {
      if(var2 == null || var2.length < var3) {
         var2 = new r[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = new r();
         }
      }

      q var6 = var0;

      for(int var5 = 0; var6 != var1.g; ++var5) {
         var2[var5].a(var6);
         var6 = var6.g;
      }

      return var2;
   }

   public static void a(r[] var0, int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         var0[var2].a();
      }

   }

   public static q f(q var0, q var1) {
      q var2 = q.a();
      q var3 = var0;
      var2.a(var0);
      var2.k = null;
      var2.g = null;

      q var5;
      for(q var4 = var2; var3 != var1; var4 = var5) {
         var3 = var3.g;
         var5 = new q();
         var5.a(var3);
         var5.k = var4;
         var4.g = var5;
         var5.g = null;
      }

      return var2;
   }

   public static q d(q var0) {
      q var1;
      for(var1 = var0; var1.g != null; var1 = var1.g) {
         ;
      }

      return var1;
   }

   public static void e(q var0) {
      while(var0 != null) {
         var0 = var0.g;
         Object var1 = null;
      }

   }

   public static void a(q var0, q var1, q var2) {
      q var3 = var0;

      for(q var4 = var2; var3 != null && var3 != var1.g; var3 = var3.g) {
         if(var4 != null) {
            var3.a(var4);
            var4 = var4.g;
         }
      }

   }

   public static void f(q var0) {
      while(var0 != null) {
         System.out.print(var0.f);
         var0 = var0.g;
      }

      System.out.println();
   }

   public static void g(q var0, q var1) {
      System.out.println(h(var0, var1));
   }

   public static String h(q var0, q var1) {
      MyStringBuffer var2 = new MyStringBuffer();
      q var3 = var0;

      while(var3 != var1 && var3 != null) {
         int var4 = 0;

         MyStringBuffer var5;
         for(var5 = new MyStringBuffer(); var3 != var1 && var3 != null && var3.a != -25; var3 = var3.g) {
            if(var3.f != null && var3.f.length() > 0) {
               var5.a(a(var3.c - var4));
               var5.a(var3.f);
               var4 = var3.e;
            }
         }

         if(var3 != null && var3 != var1) {
            var3 = var3.g;
         }

         var2.a(var5.toString());
         var2.a("\n");
      }

      return var2.toString();
   }

   private static String a(int var0) {
      MyStringBuffer var1 = new MyStringBuffer();

      for(int var2 = 0; var2 < var0; ++var2) {
         var1.a(' ');
      }

      return var1.toString();
   }

   public static q g(q var0) {
      if(var0 == null) {
         return null;
      } else {
         q var1 = var0;

         do {
            var1 = var1.k;
         } while(var1 != null && var1.a < 0 && var1.a != -28);

         return var1;
      }
   }

   public static q h(q var0) {
      if(var0 == null) {
         return null;
      } else {
         q var1;
         for(var1 = var0.g; var1 != null && var1.a == -11; var1 = var1.g) {
            ;
         }

         return var1;
      }
   }

   public static q i(q var0) {
      if(var0 == null) {
         return null;
      } else {
         q var1;
         for(var1 = var0.h; var1 != null && var1.a == -11; var1 = var1.h) {
            ;
         }

         return var1;
      }
   }

   public static q j(q var0) {
      if(var0 == null) {
         return null;
      } else {
         q var1 = var0;

         do {
            var1 = var1.g;
         } while(var1 != null && var1.a <= 0 && var1.a != -28);

         return var1;
      }
   }

   public static boolean k(q var0) {
      return var0.a >= 0 || var0.a == -28;
   }

   public static q l(q var0) {
      return i(var0, (q)null);
   }

   public static q i(q var0, q var1) {
      q var2 = var0;

      for(q var3 = var1 == null?null:(var1.g == null?null:var1.g); var2 != var3 && var2.a < 0 && var2.a != -28; var2 = var2.g) {
         ;
      }

      return var2;
   }

   public static q m(q var0) {
      q var1;
      for(var1 = var0; var1 != null && var1.a < 0; var1 = var1.g) {
         ;
      }

      return var1;
   }

   public static q a(q var0, int var1) {
      q var2 = var0;

      do {
         var2 = var2.g;
      } while(var2 != null && var2.a != var1);

      return var2;
   }

   public static q b(q var0, int var1) {
      q var2 = var0;

      do {
         var2 = var2.k;
      } while(var2 != null && var2.a != var1);

      return var2;
   }

   public static q c(q var0, int var1) {
      q var2 = var0;

      do {
         var2 = var2.k;
      } while(var2 != null && var2.a != var1 && var2.a < 0 && var2.a != -28);

      return var2;
   }

   public static q b(q var0, q var1, int var2) {
      if(var0 == var1) {
         return null;
      } else {
         q var3 = var0;

         do {
            var3 = var3.g;
         } while(var3 != null && var3 != var1 && var3.a != var2);

         if(var3 == var1) {
            var3 = null;
         }

         return var3;
      }
   }

   public static q a(q var0, q var1, String var2) {
      if(var0 == var1) {
         return null;
      } else {
         q var3 = var0;

         do {
            var3 = var3.g;
         } while(var3 != null && var3 != var1 && !var2.equals(var3.f));

         return var3 != null && var2.equals(var3.f)?var3:null;
      }
   }

   public static q a(q var0, int var1, int var2) {
      q var3 = var0;

      do {
         var3 = var3.g;
      } while(var3 != null && (var3.a != var1 || var3.l != var2));

      return var3;
   }

   public static q b(q var0, int var1, int var2) {
      q var3 = var0;

      do {
         var3 = var3.g;
      } while(var3 != null && var3.a != var1 && var3.a != var2);

      return var3;
   }

   public static boolean c(q var0, q var1, int var2) {
      q var3 = var0;

      boolean var4;
      for(var4 = false; var3 != var1 && !var4; var3 = var3.g) {
         var4 = var3.a == var2;
      }

      return var4;
   }

   public static void d(q var0, int var1) {
      if(var1 != 0) {
         for(q var2 = var0; var2 != null; var2 = var2.g) {
            var2.c += var1;
            if(var2.a == -25) {
               break;
            }

            var2.e += var1;
         }

      }
   }

   public static void d(q var0, q var1, int var2) {
      if(var2 != 0) {
         for(q var3 = var0; var3 != null && var3 != var1.g; var3 = var3.g) {
            var3.c += var2;
            var3.e += var2;
         }

      }
   }

   public static void e(q var0, int var1) {
      if(var1 != 0) {
         for(q var2 = var0; var2 != null; var2 = var2.g) {
            var2.b += var1;
            var2.d += var1;
         }

      }
   }

   public static boolean n(q var0) {
      return var0.f != null && var0.f.startsWith(f("IDV\u001cj/ K\u001fd*:Q\u000br%!Y\u0014h(:"));
   }

   public static String o(q var0) {
      String var1 = var0.f;
      if(var1 != null) {
         if(var1.startsWith(f("IDV\u001cj/ K\u001fd*:Q\u000br%!Y\u0014h(:"))) {
            var1 = var1.substring(f("IDV\u001cj/ K\u001fd*:Q\u000br%!Y\u0014h(:").length(), var1.length());
         }

         if(var1.endsWith(f("# P\u0006k/\"@\u001c\u007f9-[\u0014`# @s\u0002"))) {
            var1 = var1.substring(0, f("# P\u0006k/\"@\u001c\u007f9-[\u0014`# @s\u0002").length());
         }

         return var1;
      } else {
         return null;
      }
   }

   public static boolean a(String var0) {
      return var0 != null && var0.startsWith(f("IAS\u001ccK,Q\u001ed("));
   }

   public static boolean b(String var0) {
      return var0 != null && var0.startsWith(f("IAS\u001ccK+Z\u001d"));
   }

   public static boolean p(q var0) {
      return c(var0.f);
   }

   public static boolean c(String var0) {
      return var0 != null && var0.startsWith(f("IA^t"));
   }

   public static boolean q(q var0) {
      return d(var0.f);
   }

   public static boolean d(String var0) {
      return var0 != null && var0.startsWith(f("IA^r"));
   }

   public static boolean r(q var0) {
      return var0.f != null && (var0.f.startsWith(f("IA^\u001db%C")) || var0.f.indexOf(f("\u001d.}7E\u0003\u001c}-i\t\ri")) != -1);
   }

   private static boolean s(q var0) {
      return var0.f.startsWith(f("ID9t\u0000")) && var0.f.endsWith(f("KC9s\u0002")) && var0.f.indexOf("\n") == -1;
   }

   public static boolean a(q var0, Context var1) {
      return var1.a.b(var0) && var0.f.startsWith(f("IAj"));
   }

   public static String e(String var0) {
      return f("IAj") + var0;
   }

   public static boolean t(q var0) {
      return x(var0) || y(var0) || z(var0) || A(var0) || B(var0) || C(var0) || D(var0) || E(var0) || F(var0) || v(var0);
   }

   public static boolean u(q var0) {
      q var1 = var0;

      while(var1 != null && var1.h != null) {
         var1 = var1.h;
         if(A(var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean v(q var0) {
      return d.a(var0.f);
   }

   public static boolean w(q var0) {
      return jindent.cpp.b.c.b.a.a(var0.f);
   }

   public static boolean x(q var0) {
      return d.b(var0.f);
   }

   public static boolean y(q var0) {
      return d.c(var0.f);
   }

   public static boolean z(q var0) {
      return d.d(var0.f);
   }

   public static boolean A(q var0) {
      return d.e(var0.f);
   }

   public static boolean B(q var0) {
      return d.f(var0.f);
   }

   public static boolean C(q var0) {
      return d.g(var0.f);
   }

   public static boolean D(q var0) {
      return d.h(var0.f);
   }

   public static boolean E(q var0) {
      return d.i(var0.f);
   }

   public static boolean F(q var0) {
      return d.j(var0.f);
   }

   public static String a(int var0, int var1, String var2, String var3) {
      String var4 = e(var3);
      StringBuffer var5 = new StringBuffer(var4);
      int var6 = var1 - var0;
      if(var2.equals("")) {
         return var4;
      } else {
         for(int var7 = 0; var5.length() < var6; ++var7) {
            var5.append(var2);
         }

         return var6 > var4.length() && var5.length() > var6?var5.toString().substring(0, var6):var5.toString();
      }
   }

   public static boolean a(int var0, int var1) {
      return (var0 & var1) == var1;
   }

   public static q G(q var0) {
      return j(var0, (q)null);
   }

   public static q j(q var0, q var1) {
      if(var0 == null) {
         return null;
      } else {
         q var2 = var0;
         q var3 = null;

         q var4;
         for(var4 = null; var2 != null && var2 != var1.g; var2 = var2.g) {
            q var5 = var3;
            var3 = (q)var2.clone();
            var3.h = null;
            var3.g = null;
            if(var5 != null) {
               var5.g = var3;
               var3.h = var5;
            } else {
               var4 = var3;
            }
         }

         return var4;
      }
   }

   public static void k(q var0, q var1) {
      if(var0 != null) {
         for(q var2 = var0; var2 != null && var2 != var1.g; var2 = var2.g) {
            var2.a = -11;
         }

      }
   }

   public static void b(q var0, Context var1) {
      if(var0 != null) {
         q var2 = var0;
         q var3 = var0.h;

         for(boolean var4 = var3 != null?var1.a.g(var3):false; var2 != null; var2 = var2.g) {
            boolean var5 = var4;
            var4 = var1.a.g(var2);
            if(!var1.a.h(var2)) {
               return;
            }

            if(var5) {
               var2.a = -11;
            }
         }

      }
   }

   public static void c(q var0, Context var1) {
      for(q var2 = var0; var2 != null; var2 = var2.h) {
         q var3 = var2.h;
         boolean var4 = var3 != null?var1.a.g(var3):false;
         if(!var4 || !var1.a.h(var2)) {
            return;
         }

         var2.a = -11;
      }

   }

   public static void l(q var0, q var1) {
      q var2 = var0;
      if(var0 == null) {
         var1.g = null;
      } else {
         while(true) {
            if(var2.h == null) {
               var2.h = var1;
               var1.g = var2;
               break;
            }

            var2 = var2.h;
         }
      }

   }

   public static q H(q var0) {
      if(var0 == null) {
         return var0;
      } else {
         q var1;
         for(var1 = var0; var1.h != null; var1 = var1.h) {
            ;
         }

         return var1;
      }
   }

   public static q d(q var0, Context var1) {
      q var2;
      for(var2 = var0; var2 != null && !var1.a.g(var2); var2 = var2.g) {
         ;
      }

      if(var2 != null) {
         var2 = var2.g;
      }

      return var2;
   }

   public static boolean b(int var0) {
      return var0 == 9 || var0 == 10 || var0 == 12 || var0 == 11 || var0 == 53;
   }

   public static boolean c(int var0) {
      return var0 == 8 || b(var0) || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17 || var0 == 18 || var0 == 19 || var0 == 20 || var0 == 21 || var0 == 22 || var0 == 23 || var0 == 24 || var0 == 25 || var0 == 29 || var0 == 30 || var0 == 41 || var0 == 42 || var0 == 43 || var0 == 46 || var0 == 54 || var0 == 49 || var0 == 47;
   }

   public static void e(q var0, Context var1) {
      q var2 = g(var0);

      for(boolean var3 = false; var2 != null; var2 = var2.g) {
         if(var2.a == -25) {
            if(var3) {
               var2.a = -24;
            } else {
               var3 = true;
            }
         }

         if(var2 == var0) {
            break;
         }
      }

   }

   public static boolean a(Context var0, int var1, int var2) {
      if(var2 != 6 && var2 != 8 && var2 != 33 && var2 != 14 && var2 != 15 && var2 != 16 && var2 != 44 && var2 != 18 && var2 != 19) {
         return false;
      } else {
         boolean var3 = (var2 == 6 || var2 == 8) && var0.getBoolean(f("\u0007\u0018{0I%\u0001z?X\u0015\u0007z>d\b\nq7Y\u0007\u001a}6C\u0015({+`\u0003\u001a|6I%\u0001z*Y\u0014\u001bw-B\u0014*q:A\u0007\u001cu-D\t\u0000g")) || var2 == 44 && var0.getBoolean(f("\u0007\u0018{0I%\u0001z?X\u0015\u0007z>d\b\nq7Y\u0007\u001a}6C\u0015({+n\u0007\u001aw1o\n\u0001w2i\u0003\rx8_\u0007\u001a}6C\u0015")) || var2 != 6 && var2 != 8 && var2 != 44 && var0.getBoolean(f("\u0007\u0018{0I%\u0001z?X\u0015\u0007z>d\b\nq7Y\u0007\u001a}6C\u0015"));
         int var4 = var3?var0.getNumber(f("\u000f\u0000p<C\u0012=}#H")):0;
         return var0.getNumber(f("\u000f\u0000p<C\u0012=}#H")) - var4 < var1 && var1 < var0.getNumber(f("\u000f\u0000p<C\u0012=}#H")) + var4;
      }
   }

   public static q m(q var0, q var1) {
      q var2 = null;
      q var3 = var0;

      do {
         if(var3.a == -1) {
            var2 = var3;
         }

         var3 = var3.g;
      } while(var3 != null && var3 != var1.g);

      if(var2 == null) {
         return var0;
      } else {
         q var4 = j(var2);
         return var4 == null?var1:var4;
      }
   }

   private static String f(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 102;
            break;
         case 1:
            var10003 = 110;
            break;
         case 2:
            var10003 = 20;
            break;
         case 3:
            var10003 = 89;
            break;
         default:
            var10003 = 45;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
