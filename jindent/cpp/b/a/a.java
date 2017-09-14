package jindent.cpp.b.a;

import java.io.FileInputStream;
import java.io.IOException;
import jindent.cpp.b.a.b;
import jindent.cpp.b.a.c;
import jindent.cpp.b.a.d;
import jindent.cpp.b.a.e;
import jindent.util.MyStringBuffer;

public class a {
   private int a;
   private int b;
   private int c;
   private String d;
   private int e;
   private int f;
   private d g;

   public a(String var1) {
      this(var1, 0, 0);
   }

   public a(e var1) {
      this(var1.e(), var1.a(), var1.b());
   }

   public a(String var1, int var2, int var3) {
      this.a = 8;
      this.g = new d(var1, a("H2U)sM9Ly~5!A/|U\"\u0014\"kRG7~,A5g\u000fq`"));
      this.c = var2;
      this.e = var3;
      this.f = 0;
      this.d = "";
      this.b = 0;
   }

   public boolean a() {
      return this.g.a();
   }

   public e b() {
      int var1 = this.d();
      int var2 = this.e();
      String var3 = this.g.b();
      String var4;
      if(this.f == 0) {
         var4 = this.g.a(0);
         if(var3.equals("/") && "/".equals(var4)) {
            this.f = 1;
         } else if(var3.equals("/") && "*".equals(var4)) {
            this.f = 2;
         } else if(var3.equals("\"") && this.b % 2 == 0) {
            this.f = 3;
         }
      }

      if(var3.equals("\\")) {
         ++this.b;
      } else {
         this.b = 0;
      }

      if(var3.equals("\r")) {
         var4 = this.g.a(0);
         if(var4 != null && var4.equals("\n")) {
            this.g.b();
            var3 = a("d\u0016");
            this.c();
         } else {
            this.c();
         }
      } else if(var3.equals("\n")) {
         this.c();
      } else if(var3.equals("\t")) {
         this.c += this.a - (this.c - 1) % this.a;
      } else {
         this.c += var3.length();
      }

      int var5 = this.f;
      if(this.f == 2 && this.d.equals("*") && var3.equals("/")) {
         this.f = 0;
      } else if(this.f != 1 || this.b % 2 != 0 || !var3.equals("\n") && !var3.equals("\r") && !var3.equals(a("d\u0016"))) {
         if(this.f == 3 && this.b % 2 == 0 && var3.equals("\"")) {
            this.f = 0;
         }
      } else {
         this.f = 0;
         var5 = 0;
      }

      this.d = var3;
      return new e(var5, var3, var3, var1, var2, this.c - 1, this.e);
   }

   public void c() {
      this.c = 1;
      ++this.e;
   }

   public void a(int var1) {
      this.c = 1;
      this.e += var1;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.e;
   }

   public e f() {
      int var1 = this.d();
      int var2 = this.e();
      int var3 = 0;
      MyStringBuffer var4 = new MyStringBuffer();
      MyStringBuffer var5 = new MyStringBuffer();
      String var6 = this.g.a(0);
      if(var6 != null && !var6.equals("(")) {
         return null;
      } else {
         do {
            e var7 = this.b();
            String var8 = var7.e();
            var4.a(var8);
            var5.a(var8);
            if(var8.equals("(")) {
               ++var3;
            } else if(var8.equals(")")) {
               --var3;
            }
         } while(var3 > 0);

         return new e(this.f, var5.toString(), var4.toString(), var1, var2, this.d(), this.e());
      }
   }

   /** @deprecated */
   public c g() {
      c var1 = new c();
      MyStringBuffer var2 = new MyStringBuffer();
      String var3 = this.g.a(0);
      if(var3 != null && (var3 == null || var3.equals("("))) {
         int var4 = 0;
         e var5 = null;
         b var6 = null;

         do {
            if(var6 == null) {
               var5 = this.b();
               var6 = new b();
               var6.a(var5.a());
               var6.b(var5.b());
            } else {
               var5 = this.b();
            }

            String var7 = var5.e();
            var2.a(var7);
            if((!var7.equals(",") || var4 != 1) && (!var7.equals(")") || var4 != 1)) {
               if(var4 > 0) {
                  var6.b(var7);
                  var6.c(var5.c());
                  var6.d(var5.d());
               }
            } else {
               var1.a(var6);
               var6 = null;
            }

            if(var7.equals("(")) {
               ++var4;
            } else if(var7.equals(")")) {
               --var4;
            }
         } while(var4 > 0);

         return var1;
      } else {
         return var1;
      }
   }

   public e h() {
      int var1 = this.d();
      int var2 = this.e();
      MyStringBuffer var3 = new MyStringBuffer();
      MyStringBuffer var4 = new MyStringBuffer();

      while(this.g.a()) {
         e var5 = this.b();
         var4.a(var5.f());
         var3.a(var5.e());
      }

      return new e(this.f, var4.toString(), var3.toString(), var1, var2, this.d(), this.e());
   }

   public String i() {
      return this.g.a()?this.g.a(2):null;
   }

   public e j() {
      int var1 = this.d();
      int var2 = this.e();
      int var3 = 0;
      int var4 = 1;
      MyStringBuffer var5 = new MyStringBuffer();
      MyStringBuffer var6 = new MyStringBuffer();

      while(this.g.a() && var4 > 0) {
         e var7 = this.b();
         int var8 = var7.g();
         String var9 = var7.e();
         if(var8 != 2 && var8 != 1) {
            var5.a(var9);
            var6.a(var9);
            if(var9.equals("\r") || var9.equals("\n") || var9.equals(a("d\u0016"))) {
               --var4;
            }

            if(var9.equals("\\")) {
               ++var3;
               if(var3 % 2 == 1) {
                  String var10 = this.g.a(0);
                  if(var10.equals("\r") || var10.equals("\n") || var10.equals(a("d\u0016"))) {
                     var5.c(var5.a() - 1);
                     var3 = 0;
                     var6.a(this.g.b());
                  }
               }
            }
         } else {
            var6.a(var9);
         }
      }

      String var11 = jindent.cpp.b.b.a.b(var5.toString());
      return new e(this.f, var6.toString(), var11, var1, var2, this.d(), this.e());
   }

   public static void main(String[] var0) throws IOException {
      FileInputStream var1 = new FileInputStream(a("*&6P\"\fn\u0019Y\u0005\u0006~\u0003d\"5X\u000fv:\u001ds\u001aY\u0015\u0006\u007f\u001fh4\u0007h\u0019Y%\fo\u001e+2\u0019l"));
      int var2 = var1.available();
      byte[] var3 = new byte[var2];
      var1.read(var3);
      var1.close();
      String var4 = new String(var3);
      jindent.cpp.b.a.a var5 = new jindent.cpp.b.a.a(var4);

      while(var5.a()) {
         e var6 = var5.j();
         System.out.println("\"" + var6.e() + "\"");
      }

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 105;
            break;
         case 1:
            var10003 = 28;
            break;
         case 2:
            var10003 = 106;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 81;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
