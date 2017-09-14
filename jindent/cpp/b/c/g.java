package jindent.cpp.b.c;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jindent.JindentException;
import jindent.cpp.b.c.d;
import jindent.cpp.b.c.e;
import jindent.cpp.b.c.f;
import jindent.cpp.b.c.b.PreProcessorException;
import jindent.cpp.b.c.b.b;
import jindent.formatter.m;
import jindent.util.MyStringBuffer;

public class g extends jindent.cpp.b.e {
   private Map e;
   private MyStringBuffer f;
   private jindent.cpp.b.c.a.e g;
   private f h;
   private int i;

   protected void a(jindent.cpp.b.g var1) {
      this.h = new f();
      this.f = new MyStringBuffer();
      this.g = new jindent.cpp.b.c.a.c();
      this.e = new HashMap();
      this.i = 0;
   }

   protected void c(jindent.cpp.b.g var1) {
      this.f.c(0);
   }

   protected void d(jindent.cpp.b.g var1) {
      String var2 = var1.a();
      this.f.a(var2);
   }

   protected void e(jindent.cpp.b.g var1) throws PreProcessorException {
      if(d.b(this.f.toString())) {
         ++this.i;
         this.c();
      } else if(d.c(this.f.toString())) {
         if(this.i < 1) {
            throw new PreProcessorException(d("$3A.\"B\u007fQ,5\u0007|C)2\n3A4f\u000f=@#.\u000b2S`e\u000b:\u0014$/\u00109W4/\u00149\u001a"), var1.m().b());
         }

         this.d();
      } else if(d.d(this.f.toString())) {
         --this.i;
         if(this.i < 0) {
            throw new PreProcessorException(d("$3A.\"B\u007fQ.\"\u000b:\u00147/\u00164[52B1U4%\n5Z\'fA5R`\"\u000b.Q#2\u000b*Qn"), var1.m().b());
         }

         this.e();
      } else {
         String var2 = this.f.toString();
         this.c(var2);
      }

   }

   private void c() {
      String var1 = this.f.toString();
      int var2 = this.h.a();
      jindent.cpp.b.c.a.d var3 = new jindent.cpp.b.c.a.d(this.g, var2);
      this.e.put(Integer.valueOf(var2), var3);
      jindent.cpp.b.c.a.d var4 = this.g.c();
      var3.a(var4);
      this.g.b(var3);
      jindent.cpp.b.c.a.c var5 = new jindent.cpp.b.c.a.c(var3);
      var5.a((jindent.cpp.b.c.a.d)var3);
      var5.b(var1);
      var3.c(var5);
      this.g = var5;
   }

   private void d() {
      String var1 = this.f.toString();
      if(this.g instanceof jindent.cpp.b.c.a.c) {
         jindent.cpp.b.c.a.c var2 = (jindent.cpp.b.c.a.c)this.g;
         var2.c(var1);
      }

      jindent.cpp.b.c.a.d var4 = this.g.c();
      jindent.cpp.b.c.a.c var3 = new jindent.cpp.b.c.a.c(var4);
      var3.a((jindent.cpp.b.c.a.d)var4);
      var3.b(var1);
      var4.c(var3);
      this.g = var3;
   }

   private void e() {
      String var1 = this.f.toString();
      jindent.cpp.b.c.a.d var2 = this.g.c();
      jindent.cpp.b.c.a.c var3;
      if(this.g instanceof jindent.cpp.b.c.a.c) {
         var3 = (jindent.cpp.b.c.a.c)this.g;
         var3.c(var1);
      }

      var3 = new jindent.cpp.b.c.a.c(var2);
      jindent.cpp.b.c.a.c var4 = jindent.cpp.b.c.a.f.b(var2);
      jindent.cpp.b.c.a.d var5 = var4.c();
      var3.a((jindent.cpp.b.c.a.d)var5);
      var2.b(var3);
      this.g = var3;
   }

   protected void f(jindent.cpp.b.g var1) {
   }

   protected void g(jindent.cpp.b.g var1) {
      this.c(var1.a());
   }

   protected void h(jindent.cpp.b.g var1) {
   }

   protected void i(jindent.cpp.b.g var1) {
   }

   protected void j(jindent.cpp.b.g var1) {
      this.c(var1.a());
   }

   protected void k(jindent.cpp.b.g var1) {
   }

   protected void l(jindent.cpp.b.g var1) {
   }

   protected void m(jindent.cpp.b.g var1) {
      this.c(var1.a());
   }

   protected void n(jindent.cpp.b.g var1) {
   }

   protected void o(jindent.cpp.b.g var1) {
      this.c(var1.a());
   }

   protected void b(jindent.cpp.b.g var1) {
      if(this.i > 0) {
         throw new PreProcessorException(d("/5G3/\f;\u0014c#\f8]&f\u00065F%%\u00165B%h"), var1.m().d());
      }
   }

   public jindent.cpp.b.c.b.d b(String var1) {
      this.a(var1);
      jindent.cpp.b.c.a.e var2 = jindent.cpp.b.c.a.f.c(this.g);
      return new jindent.cpp.b.c.b.d(var1, var2, this.e, this.h.b());
   }

   private void c(String var1) {
      if(this.g instanceof jindent.cpp.b.c.a.c) {
         jindent.cpp.b.c.a.c var2 = (jindent.cpp.b.c.a.c)this.g;
         var2.a(var1);
      } else {
         System.err.println(d("\u0001)F2#\f(q,#\u000f9Z4f\f3@`)\u0004|W,\'\u0011/\u0014\u0013/\u000f,X%\u0005\r8Q\u0005*\u00071Q.2"));
      }

   }

   public static void main(String[] var0) throws IOException, JindentException {
      FileInputStream var1 = new FileInputStream(d("!fh\u00155\u0007.G\u001c\u0012\r>]!5>\u0018Q3-\u00163D\u001c\u0002\r?A-#\f(G\u001c2\u0007/@n%"));
      int var2 = var1.available();
      byte[] var3 = new byte[var2];
      var1.read(var3);
      String var4 = new String(var3);
      g var5 = new g();
      jindent.cpp.b.c.b.d var6 = var5.b(var4);
      var6.a((m)(new e()));
      b var7 = new b(var6);
      jindent.cpp.b.c.b.c var8 = var7.a();
      System.out.println(d("Oq\u0019`(\u0007+\u0014/3\u0016,A4fOq\u0019mkOq"));
      System.out.println(var8);
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 98;
            break;
         case 1:
            var10003 = 92;
            break;
         case 2:
            var10003 = 52;
            break;
         case 3:
            var10003 = 64;
            break;
         default:
            var10003 = 70;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
