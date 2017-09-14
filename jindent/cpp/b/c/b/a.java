package jindent.cpp.b.c.b;

import java.util.StringTokenizer;
import jindent.formatter.p;
import jindent.util.MyStringBuffer;

public class a {
   private static final String a = "Yq\u0004\u001ag8\u001ae\u001ezYq";
   private static final String b = "$";
   static final int c = 0;
   static final int d = 1;
   static final int e = 2;
   static final int f = 3;
   static final int g = 4;
   static final int h = 10;
   static final int i = 11;
   static final int j = 12;
   static final int k = 13;
   static final int l = 14;
   private int m;
   private int n;
   private int o;

   a(int var1, int var2, int var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
   }

   public int a() {
      return this.m;
   }

   public int b() {
      return this.n;
   }

   public int c() {
      return this.o;
   }

   public boolean a(jindent.cpp.b.c.b.a var1) {
      return this.a(var1.a(), var1.b());
   }

   public boolean a(int var1, int var2) {
      return this.a() == var1 && this.b() == var2;
   }

   public boolean b(jindent.cpp.b.c.b.a var1) {
      return this.a() == var1.a();
   }

   public boolean c(jindent.cpp.b.c.b.a var1) {
      if(var1 == null) {
         return false;
      } else {
         if(this.o == 1) {
            if(var1.c() == 3 && this.a(var1)) {
               return true;
            }

            if(var1.c() == 1 && this.a(var1.a(), var1.b() - 1)) {
               return true;
            }
         } else if(this.o == 10) {
            if(var1.c() == 12 && this.a(var1)) {
               return true;
            }

            if(var1.c() == 1 && this.a(var1.a(), var1.b() - 1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(String var0) {
      jindent.cpp.b.c.b.a var1 = b(var0);
      return var1 == null?false:var1.c() == 14;
   }

   public static jindent.cpp.b.c.b.a b(String var0) {
      if(d(var0)) {
         StringTokenizer var1 = new StringTokenizer(p.a(var0), g("Yp"), true);
         var1.nextToken();
         var1.nextToken();
         var1.nextToken();
         var1.nextToken();
         var1.nextToken();
         int var2 = Integer.parseInt(var1.nextToken());
         var1.nextToken();
         int var3 = Integer.parseInt(var1.nextToken());
         var1.nextToken();
         var1.nextToken();
         String var4 = var1.nextToken();
         boolean var5 = false;
         int var6;
         if(var4.equals("/")) {
            var6 = 14;
         } else {
            var6 = c(var4);
         }

         return new jindent.cpp.b.c.b.a(var2, var3, var6);
      } else {
         return null;
      }
   }

   public String d() {
      String var1 = a(this.o);
      return g("Yq\u0004\u001ag8\u001ae\u001ezYq") + this.m + "." + this.n + g("Yq") + var1 + g("Yq");
   }

   private static int c(String var0) {
      byte var1 = 0;
      if(var0.equals(g("\u0010<B"))) {
         var1 = 1;
      } else if(var0.equals(g("\u001f<B"))) {
         var1 = 2;
      } else if(var0.equals(g("\u001f;B"))) {
         var1 = 4;
      } else if(var0.equals(g("\u001a;B"))) {
         var1 = 3;
      } else if(var0.equals(g("\u0010<F"))) {
         var1 = 10;
      } else if(var0.equals(g("\u001f<F"))) {
         var1 = 11;
      } else if(var0.equals(g("\u001f;F"))) {
         var1 = 13;
      } else if(var0.equals(g("\u001a;F"))) {
         var1 = 12;
      }

      return var1;
   }

   public static String a(int var0) {
      switch(var0) {
      case 1:
         return g("\u0010<B");
      case 2:
         return g("\u001f<B");
      case 3:
         return g("\u001a;B");
      case 4:
         return g("\u001f;B");
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      default:
         return "";
      case 10:
         return g("\u0010<F");
      case 11:
         return g("\u001f<F");
      case 12:
         return g("\u001a;F");
      case 13:
         return g("\u001f;F");
      }
   }

   private static String a(String var0, String var1) {
      MyStringBuffer var2 = new MyStringBuffer();
      jindent.util.d var3 = new jindent.util.d(var1);

      while(var3.e()) {
         jindent.util.e var4 = var3.d();
         if(!a(var4)) {
            var2.a(var0);
            var2.a("$");
            var2.a(var4.a());
            var2.a(var4.b());
         }
      }

      return var2.toString();
   }

   public static String a(String var0, String var1, String var2) {
      MyStringBuffer var3 = new MyStringBuffer();
      jindent.util.d var4 = new jindent.util.d(var2);
      boolean var5 = false;

      while(var4.e()) {
         jindent.util.e var6 = var4.d();
         if(!a(var6)) {
            if(!var5) {
               var5 = true;
               var3.a(var0);
            } else {
               var3.a(var1);
            }
         }

         var3.a("$");
         var3.a(var6.a());
         var3.a(var6.b());
      }

      return var3.toString();
   }

   private static String b(String var0, String var1, String var2) {
      MyStringBuffer var3 = new MyStringBuffer();
      jindent.util.d var4 = new jindent.util.d(var2);

      while(var4.e()) {
         jindent.util.e var5 = var4.d();
         if(!a(var5)) {
            if(!var4.e()) {
               var3.a(var1);
            } else {
               var3.a(var0);
            }
         }

         var3.a("$");
         var3.a(var5.a());
         var3.a(var5.b());
      }

      return var3.toString();
   }

   public static String a(int var0, int var1, String var2) {
      String var3 = (new jindent.cpp.b.c.b.a(var0, var1, 1)).d();
      String var4 = (new jindent.cpp.b.c.b.a(var0, var1, 2)).d();
      return a(var3, var4, var2);
   }

   public static String b(int var0, int var1, String var2) {
      String var3 = (new jindent.cpp.b.c.b.a(var0, var1, 0)).d();
      return a(var3, var2);
   }

   public static String c(int var0, int var1, String var2) {
      String var3 = (new jindent.cpp.b.c.b.a(var0, var1, 4)).d();
      String var4 = (new jindent.cpp.b.c.b.a(var0, var1, 3)).d();
      return b(var3, var4, var2);
   }

   public static String d(int var0, int var1, String var2) {
      String var3 = (new jindent.cpp.b.c.b.a(var0, var1, 10)).d();
      String var4 = (new jindent.cpp.b.c.b.a(var0, var1, 11)).d();
      return a(var3, var4, var2);
   }

   public static String e(int var0, int var1, String var2) {
      String var3 = (new jindent.cpp.b.c.b.a(var0, var1, 13)).d();
      String var4 = (new jindent.cpp.b.c.b.a(var0, var1, 12)).d();
      return b(var3, var4, var2);
   }

   public static boolean d(String var0) {
      var0 = p.a(var0);
      return var0.startsWith(g("Yq\u0004\u001ag8\u001ae\u001ezYq"));
   }

   public static String e(String var0) {
      int var1 = var0.indexOf(g("Yq\u0004\u001ag8\u001ae\u001ezYq"));
      int var2 = var0.indexOf("$", var1 + g("Yq\u0004\u001ag8\u001ae\u001ezYq").length());
      if(var2 != -1) {
         var0 = var0.substring(0, var1) + var0.substring(var2 + 1);
      }

      return var0;
   }

   private static boolean a(jindent.util.e var0) {
      return f(var0.a()) && f(var0.b());
   }

   private static boolean f(String var0) {
      if(var0 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < var0.length(); ++var1) {
            char var2 = var0.charAt(var1);
            if(var2 != 32 && var2 != 9) {
               return false;
            }
         }

         return true;
      }
   }

   public String toString() {
      return g("4,A>M\u001e\u0013A\"E\u0013,\u0000\u000bG\u0012c") + this.m + g("Z~I>J\u0013&\u001d") + this.n + g("Z~T)^\u0013c") + this.o + "]";
   }

   public static void main(String[] var0) {
      System.out.println(e(g("V~\u0000\u007f\u0001R\u0014i\u001ej3\u0010t\u007f\u0001Dp\u0010\u007f\u0001\u0010<F\u007f\u0001R}I6")));
   }

   private static String g(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 118;
            break;
         case 1:
            var10003 = 94;
            break;
         case 2:
            var10003 = 32;
            break;
         case 3:
            var10003 = 80;
            break;
         default:
            var10003 = 46;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
