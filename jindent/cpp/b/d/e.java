package jindent.cpp.b.d;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import jindent.cpp.b.g;
import jindent.cpp.b.d.b;
import jindent.cpp.b.d.c;
import jindent.util.MyStringBuffer;

public class e extends jindent.cpp.b.e {
   private static final String e = "(";
   private HashMap f;
   private c g;
   private MyStringBuffer h;

   public c c() {
      return this.g;
   }

   public void a(jindent.cpp.b.d.a var1) {
      this.f.put(var1.b(), var1);
   }

   public String b(String var1) {
      return this.b(var1, 1, 1);
   }

   public String b(String var1, int var2, int var3) {
      this.a(var1, var2, var3);
      return this.h.toString();
   }

   protected void a(g var1) {
      this.f = new HashMap();
      this.g = new c();
      this.h = new MyStringBuffer();
   }

   protected void c(g var1) {
   }

   protected void d(g var1) {
      if(var1.d()) {
         String var2 = this.b();
         if("(".equals(var2)) {
            this.h.a(var1.a());
         } else {
            this.h.a(this.a(var1.a(), this.d));
         }
      } else {
         this.h.a(var1.a());
      }

   }

   protected void e(g var1) {
   }

   protected void f(g var1) {
   }

   protected void g(g var1) {
      this.h.a(var1.a());
   }

   protected void h(g var1) {
   }

   protected void i(g var1) {
   }

   protected void j(g var1) {
      this.h.a(var1.a());
   }

   protected void k(g var1) {
   }

   protected void l(g var1) {
   }

   protected void m(g var1) {
      this.h.a(var1.a());
   }

   protected void n(g var1) {
   }

   protected void o(g var1) {
      jindent.cpp.b.d.a var2 = (jindent.cpp.b.d.a)this.f.get(var1.a());
      if(var2 != null && !var2.d()) {
         jindent.cpp.b.a.e var3 = var1.m();
         this.h.a(this.a(var3, var2));
      } else {
         this.h.a(var1.a());
      }

   }

   protected void b(g var1) {
   }

   private String a(String var1, jindent.cpp.b.a.a var2) {
      MyStringBuffer var3 = new MyStringBuffer();
      jindent.cpp.b.a.e var4 = var2.j();
      String var5 = var4.e();
      String var6 = var4.f();
      var3.a(var1);
      var3.a(var6);
      int var7 = jindent.cpp.b.b.a.c(var6) - 1;
      var2.a(var7);
      var5 = jindent.cpp.b.b.a.a(var5);
      jindent.cpp.b.a.a var8 = new jindent.cpp.b.a.a(var5);
      jindent.cpp.b.a.e var9 = var8.b();
      String var10 = var9.e();
      jindent.cpp.b.a.e var11 = var8.h();
      String var12 = jindent.cpp.b.b.a.a(var11.e());
      jindent.cpp.b.d.a var13 = new jindent.cpp.b.d.a(var10, var12);
      this.a(var13);
      return var3.toString();
   }

   private String a(jindent.cpp.b.a.e var1, jindent.cpp.b.d.a var2) {
      MyStringBuffer var3 = new MyStringBuffer();
      String var4 = var1.e();
      b var5 = new b();
      var5.b(var4);
      var5.a(var1.a());
      var5.b(var1.b());
      String var6 = var2.a();
      var5.c(var1.c());
      var5.d(var1.d());
      e var7 = new e();
      var6 = var7.b(var6);
      var5.a(var6);
      this.g.a(var5);
      if(var2.c()) {
         var3.a("\"");
         var3.a(var6);
         var3.a("\"");
      } else {
         var3.a(var6);
      }

      return var3.toString();
   }

   public static void main(String[] var0) throws IOException {
      FileInputStream var1 = new FileInputStream(c("k\u001d1\u0010FMU\u001e\u0019aGE\u0004$Ftc\b6^\\H\u001d\u0019qGD\u0018(PFS\u001e\u0019AMT\u0019kVXW"));
      int var2 = var1.available();
      byte[] var3 = new byte[var2];
      var1.read(var3);
      String var4 = new String(var3);
      e var5 = new e();
      System.out.println(var5.b(var4));
      System.out.println(var5.c());
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 40;
            break;
         case 1:
            var10003 = 39;
            break;
         case 2:
            var10003 = 109;
            break;
         case 3:
            var10003 = 69;
            break;
         default:
            var10003 = 53;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
