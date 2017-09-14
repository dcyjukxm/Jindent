package jindent.formatter.a;

import java.io.IOException;
import java.io.Reader;
import jindent.formatter.i;
import jindent.formatter.u;
import jindent.formatter.a.JindentCharStream$1;
import jindent.formatter.a.JindentCharStream$2;
import jindent.formatter.a.b;
import jindent.formatter.a.d;
import jindent.util.MyStringBuffer;

public final class c implements b {
   public static final boolean staticFlag = false;
   private char[] a;
   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e;
   private int f;
   private int g;
   private int[] h;
   private int[] i;
   private int j = 0;
   private int k = 1;
   private static int l = 1;
   private Reader m;
   private boolean n = false;
   private boolean o = false;
   private char[] p;
   private int q = 0;
   private int r = -1;
   private int s = 0;
   private int t = 8;
   private int u = 0;
   private boolean v = false;
   private i w = new i();
   private d x = new d();
   private boolean y = true;
   private int z = 10240;
   private char[] A;

   public i k() {
      return this.w;
   }

   public d l() {
      return this.x;
   }

   public void c(int var1) {
      this.t = var1;
   }

   public int m() {
      return this.t;
   }

   private char[] a(char[] var1, char[] var2) {
      if(var1 == null) {
         return var2;
      } else {
         char[] var3 = new char[var1.length + var2.length];
         System.arraycopy(var1, 0, var3, 0, var1.length);
         System.arraycopy(var2, 0, var3, var1.length, var2.length);
         return var3;
      }
   }

   private char[] a(char[] var1, int var2) {
      if(var2 <= var1.length) {
         return var1;
      } else {
         char[] var3 = new char[var2];
         System.arraycopy(var1, 0, var3, 0, var1.length);
         return var3;
      }
   }

   private int[] a(int[] var1, int var2) {
      if(var2 <= var1.length) {
         return var1;
      } else {
         int[] var3 = new int[var2];
         System.arraycopy(var1, 0, var3, 0, var1.length);
         return var3;
      }
   }

   private final void n() throws IOException {
      int var2;
      if((var2 = this.m.read(this.p)) == -1) {
         boolean var3 = true;
         this.q = this.f = this.e = -1;
      } else {
         int var1;
         while((var1 = this.m.read(this.A)) != -1) {
            this.p = this.a(this.p, this.A);
            var2 += var1;
         }

         if(this.p[var2 - 1] != 10 || this.p[var2 - 1] != 13) {
            if(var2 == this.p.length) {
               this.p = this.a(this.p, var2 + 1);
            }

            ++var2;
            this.p[var2 - 1] = 10;
         }

         this.a = this.a(this.a, var2);
         this.h = this.a(this.h, var2);
         this.i = this.a(this.i, var2);
         this.q = this.f = this.e = var2;
      }
   }

   private final char o() throws IOException {
      ++this.r;
      if(this.q == 0) {
         this.n();
      } else if(this.r >= this.q) {
         throw new IOException(a("c<rCcY&pSvGr`CqL7p\u0016dC(g\u0016xLr") + this.e / 1024 + a("\n\u0019@\u0016~YrvYx\n!oW{F|"));
      }

      return this.p[this.r];
   }

   private final char p() throws IOException {
      if(this.q == 0) {
         this.n();
      } else if(this.r >= this.q) {
         throw new IOException(a("c<rCcY&pSvGr`CqL7p\u0016dC(g\u0016xLr") + this.e / 1024 + a("\n\u0019@\u0016~YrvYx\n!oW{F|"));
      }

      int var1 = this.r + 1;
      return var1 < this.q?this.p[var1]:'\u0000';
   }

   public final char h() throws IOException {
      if(this.s > 0) {
         --this.s;
         return this.a[this.g = ++this.b];
      } else {
         this.g = this.b + 1;
         return this.a();
      }
   }

   private final void a(char var1) {
      ++this.j;
      if(this.o) {
         this.o = false;
         ++this.k;
         this.j = 1;
      } else if(this.n) {
         this.n = false;
         if(var1 == 10) {
            this.o = true;
         } else {
            ++this.k;
            this.j = 1;
         }
      }

      if(this.v) {
         this.u = this.t - (this.j - 1) % this.t - 1;
         this.v = false;
      }

      switch(var1) {
      case '\t':
      case '\u000b':
      case '\f':
      default:
         break;
      case '\n':
         this.o = true;
         break;
      case '\r':
         this.n = true;
      }

      this.h[this.b] = this.k;
      this.i[this.b] = this.j;
   }

   public final char a() throws IOException {
      if(this.s > 0) {
         --this.s;
         return this.a[++this.b];
      } else {
         int var2;
         if(++this.b == this.f) {
            var2 = this.b + this.z;
            this.a = this.a(this.a, var2);
            this.h = this.a(this.h, var2);
            this.i = this.a(this.i, var2);
            this.f = this.e = var2;
         }

         char var1;
         if(this.u > 0) {
            --this.u;
            var1 = 32;
         } else {
            var1 = this.o();
            if(var1 == 9) {
               this.v = true;
               var1 = 32;
            }

            if(var1 == 10) {
               this.w.d();
               if(this.w.c() > l) {
                  throw new JindentCharStream$1(this, a("~:kE7C!\"W7X7qBeC1vSs\n&p_vFrtSeY;mX9\n\u000bmC7I3lXx^rdYeG3v\u0016qC>gE7I=lBvC<kXp\n?mDr\n&jWy\n") + l + a("\n>kXrYrmP7I=fS9"));
               }

               this.d = this.r;
            }

            if(var1 == 13) {
               this.w.b();
               if(this.w.a() > l) {
                  throw new JindentCharStream$2(this, a("~:kE7C!\"W7X7qBeC1vSs\n&p_vFrtSeY;mX9\n\u000bmC7I3lXx^rdYeG3v\u0016qC>gE7I=lBvC<kXp\n?mDr\n&jWy\n") + l + a("\n>kXrYrmP7I=fS9"));
               }

               this.d = this.r;
            }
         }

         this.a[this.b] = var1;
         if(var1 != 92) {
            this.a(var1);
            return var1;
         } else {
            this.a(var1);
            var2 = 1;

            while(true) {
               if(++this.b == this.f) {
                  int var3 = this.b + this.z;
                  this.a = this.a(this.a, var3);
                  this.h = this.a(this.h, var3);
                  this.i = this.a(this.i, var3);
                  this.f = this.e = var3;
               }

               try {
                  if((this.a[this.b] = var1 = this.o()) != 92) {
                     this.a(var1);
                     this.a(var2);
                     return '\\';
                  }
               } catch (IOException var4) {
                  if(var2 > 1) {
                     this.a(var2);
                  }

                  return '\\';
               }

               this.a(var1);
               ++var2;
            }
         }
      }
   }

   /** @deprecated */
   public final int b() {
      return this.i[this.b];
   }

   /** @deprecated */
   public final int c() {
      return this.h[this.b];
   }

   public final int d() {
      return this.i[this.b];
   }

   public final int e() {
      return this.h[this.b];
   }

   public final int f() {
      return this.i[this.g];
   }

   public final int g() {
      return this.h[this.g];
   }

   public final void a(int var1) {
      this.s += var1;
      if((this.b -= var1) < -1) {
         throw new RuntimeException(a("H3a]bZroScB=f\u0016tK>nSs\n%kB\u007f\n\"cDvG7vSe\n") + var1 + a("\u0006r`Cc\n0wPqO RYd\n;q\u0016") + (this.b += var1));
      }
   }

   public c(Reader var1, int var2, int var3, int var4, int var5) {
      this.A = new char[this.z];
      this.m = var1;
      l = Integer.MAX_VALUE;
      this.k = var2;
      this.j = var3 - 1;
      this.f = this.e = var4;
      this.a = new char[var4];
      this.h = new int[var4];
      this.i = new int[var4];
      this.p = new char[var4];
      this.t = var5;
      this.u = 0;
      this.v = false;
      this.y = true;
      this.w.e();
      this.x.a();
   }

   public void a(Reader var1, int var2, int var3, int var4, int var5) {
      this.m = var1;
      this.k = var2;
      this.j = var3 - 1;
      this.t = var5;
      this.u = 0;
      this.v = false;
      this.y = true;
      this.w.e();
      this.x.a();
      if(this.a == null) {
         this.f = this.e = var4;
         this.a = new char[var4];
         this.h = new int[var4];
         this.i = new int[var4];
         this.p = new char[var4];
      }

      this.o = this.n = false;
      this.g = this.s = this.q = 0;
      this.r = this.b = -1;
      this.c = -1;
      this.d = -1;
   }

   private boolean q() {
      int var1;
      for(var1 = this.g; var1 < this.q; ++var1) {
         char var2 = this.a[var1];
         if(var2 == 13 || var2 == 10) {
            break;
         }
      }

      String var3 = new String(this.a, this.g, var1);
      return var3.contains(a("\u0005}EsY\u0007\u0010Gq^d")) || var3.contains(a("\u0005}EsY\u0007\u0017Lr"));
   }

   public final String i() {
      String var1;
      if(this.b >= this.g) {
         var1 = new String(this.a, this.g, this.b - this.g + 1);
      } else {
         var1 = (new MyStringBuffer(new String(this.a, this.g, this.e - this.g))).a(new String(this.a, 0, this.b + 1)).toString();
      }

      int var2;
      char[] var3;
      int var4;
      if(u.c(var1)) {
         if(this.c == -1) {
            this.c = this.r - var1.length() + 1;
            var2 = this.q - this.c;
            var3 = new char[var2];
            System.arraycopy(this.p, this.c, var3, 0, var2);
            var4 = this.x.d();
            this.x.a(var4, new String(var3));
            var1 = d.a(var1, var4);
            this.y = false;
         }
      } else if(u.d(var1)) {
         if(this.c != -1) {
            var2 = this.d - this.c;
            var3 = new char[var2];
            System.arraycopy(this.p, this.c, var3, 0, var2);
            var4 = this.x.b();
            this.x.a(var4, new String(var3));
            this.y = true;
         }

         this.c = -1;
      } else if(!u.a(var1) && u.b(var1)) {
         ;
      }

      return var1;
   }

   public final char[] b(int var1) {
      char[] var2 = new char[var1];
      if(this.b + 1 >= var1) {
         System.arraycopy(this.a, this.b - var1 + 1, var2, 0, var1);
      } else {
         System.arraycopy(this.a, this.e - (var1 - this.b - 1), var2, 0, var1 - this.b - 1);
         System.arraycopy(this.a, 0, var2, var1 - this.b - 1, this.b + 1);
      }

      return var2;
   }

   public void j() {
      this.p = null;
      this.a = null;
      this.h = null;
      this.i = null;
   }

   public void a(int var1, int var2) {
      int var3 = this.g;
      int var4;
      if(this.b >= this.g) {
         var4 = this.b - this.g + this.s + 1;
      } else {
         var4 = this.e - this.g + this.b + 1 + this.s;
      }

      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      boolean var8 = false;

      int var9;
      int var10000;
      for(var9 = 0; var5 < var4; ++var5) {
         var10000 = this.h[var6 = var3 % this.e];
         ++var3;
         int var10;
         if(var10000 != this.h[var10 = var3 % this.e]) {
            break;
         }

         this.h[var6] = var1;
         int var11 = var9 + this.i[var10] - this.i[var6];
         this.i[var6] = var2 + var9;
         var9 = var11;
      }

      if(var5 < var4) {
         this.h[var6] = var1++;
         this.i[var6] = var2 + var9;

         while(var5++ < var4) {
            var10000 = this.h[var6 = var3 % this.e];
            ++var3;
            if(var10000 != this.h[var3 % this.e]) {
               this.h[var6] = var1++;
            } else {
               this.h[var6] = var1;
            }
         }
      }

      this.k = this.h[var6];
      this.j = this.i[var6];
   }

   public void d(int var1) {
      this.a(this.b - (var1 - 1));
   }

   public int r() {
      return this.g;
   }

   public int s() {
      return this.b;
   }

   public void t() throws IOException {
      this.n();
   }

   public static void e(int var0) {
      l = var0 * 50;
   }

   public boolean u() {
      return this.y;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 42;
            break;
         case 1:
            var10003 = 82;
            break;
         case 2:
            var10003 = 2;
            break;
         case 3:
            var10003 = 54;
            break;
         default:
            var10003 = 23;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
