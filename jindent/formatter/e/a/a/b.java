package jindent.formatter.e.a.a;

import java.util.ArrayList;
import java.util.List;
import jindent.formatter.e.a.a.c;
import jindent.formatter.e.a.a.d;
import jindent.formatter.e.a.a.e;

public class b {
   public static final int NONE = 0;
   public static final int RETURN = 1;
   public static final int PARAM = 2;
   public static final int THROWS = 4;
   public static final int BLANKLINE = 8;
   public static final int OTHERS = 16;
   public static final int EQUAL = 0;
   public static final int NEED_DELETION = 1;
   public static final int NEED_INSERTION = 2;
   List a = new ArrayList();
   List b = new ArrayList();
   List c = new ArrayList();
   List d = new ArrayList();
   List e = new ArrayList();
   List f = new ArrayList();
   List g = new ArrayList();
   List h = new ArrayList();
   List i = new ArrayList();
   String j = new String("");
   String k = new String("");
   String l = new String(j("n\u001d\u0019,"));

   List a(String[] var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2.add(var1[var3]);
      }

      return var2;
   }

   public void a(String var1) {
      this.k = var1;
   }

   public String a() {
      return this.k;
   }

   public void b(String var1) {
      this.j = var1;
   }

   public String b() {
      return this.j;
   }

   public void c(String var1) {
      this.l = var1;
   }

   public String c() {
      return this.l;
   }

   public boolean d() {
      return !this.l.equals(j("n\u001d\u0019,"));
   }

   public void a(c var1) {
      int var2 = this.h.size();
      c var3;
      int var4;
      if(var1 instanceof jindent.formatter.e.a.a.a) {
         var3 = null;

         for(var4 = var2 - 1; var4 >= 0; --var4) {
            var3 = this.a(var4);
            if(var3 instanceof jindent.formatter.e.a.a.a) {
               break;
            }
         }

         this.h.add(var4 + 1, var1);
      } else {
         var3 = null;

         for(var4 = 0; var4 < var2; ++var4) {
            var3 = this.a(var4);
            if(var3 instanceof jindent.formatter.e.a.a.a) {
               break;
            }
         }

         this.h.add(var4, var1);
      }

   }

   public int e() {
      return this.h.size();
   }

   public c a(int var1) {
      return (c)this.h.get(var1);
   }

   public int d(String var1) {
      int var2 = this.e();

      for(int var3 = 0; var3 < var2; ++var3) {
         c var4 = this.a(var3);
         if(var4.a().equals(var1)) {
            return var3;
         }
      }

      return -1;
   }

   public void e(String var1) {
      this.i.add(var1);
   }

   public void b(String[] var1) {
      this.i = this.a(var1);
   }

   public int f() {
      return this.i.size();
   }

   public String b(int var1) {
      return (String)this.i.get(var1);
   }

   public void g() {
      ArrayList var1 = new ArrayList();
      int var4 = this.i.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = 0;

         for(int var7 = 0; var7 < var4 - var5; ++var7) {
            String var2 = (String)this.i.get(var6);
            String var3 = (String)this.i.get(var7);
            if(var2.compareTo(var3) > 0) {
               var6 = var7;
            }
         }

         var1.add(this.i.get(var6));
         this.i.remove(var6);
      }

      this.i = var1;
   }

   public List h() {
      return this.i;
   }

   public int f(String var1) {
      return this.i.indexOf(var1);
   }

   public void c(String[] var1) {
      this.a = this.a(var1);
   }

   public int i() {
      return this.a.size();
   }

   public String c(int var1) {
      return (String)this.a.get(var1);
   }

   public void d(String[] var1) {
      this.e = this.a(var1);
   }

   public int j() {
      return this.e.size();
   }

   public String d(int var1) {
      return (String)this.e.get(var1);
   }

   public void e(String[] var1) {
      this.f = this.a(var1);
   }

   public int k() {
      return this.f.size();
   }

   public String e(int var1) {
      return (String)this.f.get(var1);
   }

   public void f(String[] var1) {
      this.d = this.a(var1);
   }

   public int l() {
      return this.d.size();
   }

   public String f(int var1) {
      return (String)this.d.get(var1);
   }

   public void g(String[] var1) {
      this.b = this.a(var1);
   }

   public int m() {
      return this.b.size();
   }

   public String g(int var1) {
      return (String)this.b.get(var1);
   }

   public void h(String[] var1) {
      this.c = this.a(var1);
   }

   public int n() {
      return this.c.size();
   }

   public String h(int var1) {
      return (String)this.c.get(var1);
   }

   public void i(String[] var1) {
      this.g = this.a(var1);
   }

   public int o() {
      return this.g.size();
   }

   public String i(int var1) {
      return (String)this.g.get(var1);
   }

   public void g(String var1) {
      d var2 = new d(var1);
      if(var2.b()) {
         String var3 = var2.c();

         while(true) {
            do {
               if(!var2.b()) {
                  return;
               }
            } while(!var2.b());

            String var4 = var2.c();
            if(var3.equals(j("X\u0002\u0011:\fu"))) {
               if(var4.startsWith("<")) {
                  this.a((c)(new jindent.formatter.e.a.a.a(var4)));
               } else {
                  this.a((c)(new e(var4, "")));
               }
            }

            if(var3.equals(j("X\u0017\b+\bh\u0006\u0019\'\u0003")) || var3.equals(j("X\u0006\u0018:\u0002o\u0001"))) {
               this.e(var4);
            }

            if(var3.equals(j("X\u0000\u0015<\u0018j\u001c"))) {
               this.c(j("y\u001c\t<\u0005q\u001c\u0017"));
            }

            var3 = var4;
         }
      }
   }

   public boolean a(b var1) {
      if(!this.k.equals(j("{\u001e\u0011;\u001e")) && !this.k.equals(j("q\u001c\u0004-\u001f~\u0013\u0013-")) && !this.k.equals(j("~\u001b\u0015$\t"))) {
         int var2 = this.e();
         if(var2 != var1.e()) {
            return false;
         } else {
            int var3;
            for(var3 = 0; var3 < var2; ++var3) {
               c var4 = this.a(var3);
               String var5 = var4.a();
               if(var1.d(var5) == -1) {
                  return false;
               }
            }

            var2 = this.f();
            if(var2 != var1.f()) {
               return false;
            } else {
               for(var3 = 0; var3 < var2; ++var3) {
                  String var6 = this.b(var3);
                  if(var1.f(var6) == -1) {
                     return false;
                  }
               }

               if(this.k.equals(j("{\u001d\u001e;\u0019j\u0007\u0013<\u0002j"))) {
                  return true;
               } else {
                  return this.d() == var1.d();
               }
            }
         }
      } else {
         return true;
      }
   }

   public int b(b var1) {
      int var2 = 0;
      if(!this.k.equals(j("{\u001e\u0011;\u001e")) && !this.k.equals(j("q\u001c\u0004-\u001f~\u0013\u0013-")) && !this.k.equals(j("~\u001b\u0015$\t"))) {
         int var3 = this.e();

         int var4;
         c var5;
         String var6;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = this.a(var4);
            var6 = var5.a();
            if(var1.d(var6) == -1) {
               var2 |= 1;
            }
         }

         var3 = var1.e();

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.a(var4);
            var6 = var5.a();
            if(this.d(var6) == -1) {
               var2 |= 2;
            }
         }

         var3 = this.f();

         String var7;
         for(var4 = 0; var4 < var3; ++var4) {
            var7 = this.b(var4);
            if(var1.f(var7) == -1) {
               var2 |= 1;
            }
         }

         var3 = var1.f();

         for(var4 = 0; var4 < var3; ++var4) {
            var7 = var1.b(var4);
            if(this.f(var7) == -1) {
               var2 |= 2;
            }
         }

         if(this.k.equals(j("{\u001d\u001e;\u0019j\u0007\u0013<\u0002j"))) {
            return var2;
         } else {
            if(this.d() && !var1.d()) {
               var2 |= 1;
            } else if(!this.d() && var1.d()) {
               var2 |= 2;
            }

            return var2;
         }
      } else {
         return var2;
      }
   }

   public static boolean h(String var0) {
      boolean var1 = true;

      for(int var2 = 0; var1 && var2 < var0.length(); ++var2) {
         var1 = var0.charAt(var2) == 42 || var0.charAt(var2) == 32 || var0.charAt(var2) == 13 || var0.charAt(var2) == 10;
      }

      return var1;
   }

   public static int i(String var0) {
      return var0.indexOf(j("X\u0002\u0011:\fu")) >= 0?2:(var0.indexOf(j("X\u0000\u0015<\u0018j\u001c")) >= 0?1:(var0.indexOf(j("X\u0017\b+\bh\u0006\u0019\'\u0003")) >= 0?4:(var0.indexOf(j("X\u0006\u0018:\u0002o\u0001")) >= 0?4:(h(var0)?8:(var0.indexOf("@") >= 0?16:0)))));
   }

   private static String j(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 24;
            break;
         case 1:
            var10003 = 114;
            break;
         case 2:
            var10003 = 112;
            break;
         case 3:
            var10003 = 72;
            break;
         default:
            var10003 = 109;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
