package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.u;
import jindent.formatter.d.c;
import jindent.formatter.d.d;
import jindent.formatter.d.g;
import jindent.formatter.d.h;
import jindent.formatter.d.i;

public class m extends q {
   public static final int DEFAULT = 0;
   public static final int EXCEEDING_TOKEN = 1;
   public static final int EXCEEDING_LINE = 2;
   public static final int ALWAYS = 3;
   public static final int NEVER = 4;
   protected q t;
   protected q u;
   protected q v;
   protected int w;
   protected i x;
   protected Context y;
   protected String z;
   protected boolean A;
   protected q B;
   protected q C;
   private boolean D;
   private boolean E;
   protected boolean F;
   public int G = 0;

   public m(Context var1) {
      this.f = emptyString;
      this.a = -94;
      this.y = var1;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.h = null;
      this.g = null;
      this.l = 0;
      this.m = null;
      this.t = null;
      this.v = null;
      this.w = 0;
      this.G = 0;
      this.x = null;
      this.F = false;
      this.A = false;
      this.B = null;
      this.C = null;
      this.D = false;
      this.E = false;
   }

   public boolean c() {
      return this.a != -94;
   }

   public void a(boolean var1) {
      this.F = var1;
   }

   public void b(q var1) {
      this.t = var1;
   }

   public q d() {
      return this.t;
   }

   public q e() {
      if(this.t == null) {
         if(this.G == 1) {
            System.err.println(d("KUYkjJDTi[AF_`/\u0013\u0010\u001a`zBA\u0016.m[Y\u001ac`JH\u001ag|\u000ehbMJkis@HqyuEJ`"));
         }

         this.t = this.a(this.y);
      }

      return this.t;
   }

   public void c(q var1) {
      this.u = var1;
   }

   public q f() {
      if(this.u == null) {
         this.u = this.e();
      }

      return this.u;
   }

   public void c(int var1) {
      this.G = var1;
   }

   public int g() {
      return this.G;
   }

   public void d(int var1) {
      this.w = var1;
   }

   public int h() {
      return this.w;
   }

   public void d(q var1) {
      if(var1 == null) {
         throw new IllegalStateException(d("}HNzf@J\u001ao/`xvB/\\H\\k}KCYk/ZBQka\u000f"));
      } else {
         this.v = var1;
      }
   }

   public g i() {
      if(this.F) {
         return this.j();
      } else if(this.v == null) {
         throw new IllegalStateException(d("\\H\\k}KCYk[AF_`/G^\u001a`zBA\u001b\u0004") + this.toString());
      } else {
         return new g(this, this.v, this.v.a);
      }
   }

   private g j() {
      q var1 = this.v;

      while(var1.k != null) {
         var1 = var1.k;
         if(var1.a == -60 || var1.a == -25 || var1.a == -97) {
            break;
         }
      }

      q var2 = u.j(var1);
      return var1 == null?new g(this, var2):new g(this, var2, var1.a);
   }

   public boolean k() {
      return this.n();
   }

   public void l() {
      if(this.r()) {
         this.x.a(this.y);
      } else if(this.k()) {
         this.m();
      }

   }

   void m() {
      if(this.G != 0 || this.u()) {
         if(this.G != 4) {
            h var1 = this.t();
            int var2 = var1.f() - this.e;
            q var3 = u.g(this);
            q var4 = u.j(this);
            if(!u.c(var3, this, -25) && !u.c(this, var4, -25)) {
               this.a = -25;
            } else {
               this.a = -100;
            }

            u.d(this.g, var2);
            this.y.a.a(this.y);
            this.y.a.a((d)(new c(this)));
         }
      }
   }

   private boolean a(q var1, int var2) {
      int var3 = var2 - var1.r;
      int var5 = this.y.getAbsoluteRelativeIndex(d("JH_~F@I_`{"));
      return var5 == 0?var3 > this.y.getNumber(d("JH_~F@I_`{")):var2 > this.y.getNumber(d("JH_~F@I_`{"));
   }

   public boolean n() {
      return !this.c()?(this.G == 3?true:this.o()):false;
   }

   public boolean o() {
      if(!this.c()) {
         h var1;
         switch(this.G) {
         case 0:
         case 4:
            return this.u();
         case 1:
            if(this.y.getBoolean(d("Y_[~MKN[{|Kb\\M`C@_`{]"))) {
               q var2 = e(this.t);
               if(var2 != null) {
                  this.t = var2;
               }
            }

            if(this.u == null) {
               this.u = this.t;
            }

            var1 = this.t();
            if(this.y.getBoolean(d("Y_[~CGC_}")) && this.t.e > this.y.getNumber(d("CLBBf@HvkaIYR")) && this.a(var1, this.e)) {
               return true;
            }

            if(u.b(this, this.t, -60) != null) {
               return true;
            }

            return this.u();
         case 2:
            this.t = this.a(this.y);
            if(this.u == null) {
               this.u = this.t;
            }

            var1 = this.t();
            if(this.y.getBoolean(d("Y_[~CGC_}")) && this.t.e > this.y.getNumber(d("CLBBf@HvkaIYR")) && this.a(var1, this.e)) {
               return true;
            }

            if(u.b(this, this.t, -60) != null) {
               return true;
            }

            return this.u();
         case 3:
         }
      }

      return false;
   }

   private boolean a(h var1, int var2) {
      int var3 = var1.f() - var2;
      return var3 < -3;
   }

   public q a(Context var1) {
      Object var2 = this;

      while(((q)var2).g.a != -25 && ((q)var2).g.a != -60) {
         var2 = ((q)var2).g;
         if(var2 == null) {
            break;
         }
      }

      return a(this, (q)var2, var1);
   }

   protected static q a(q var0, q var1, Context var2) {
      q var3 = var1;
      if(var2.getBoolean(d("Y_[~MKN[{|Kb\\M`C@_`{]"))) {
         while(var3 != var0 && var3.a < 0 && var3.a != -28) {
            var3 = var3.k;
         }
      } else {
         while(var3 != var0 && var3.a < 0) {
            var3 = var3.k;
         }
      }

      return var3;
   }

   protected static q e(q var0) {
      q var1 = var0.g;

      q var2;
      for(var2 = null; var1 != null; var1 = var1.g) {
         if(var1.a >= 0 || var1.a == -25) {
            return var2;
         }

         if(var1.a == -28) {
            var2 = var1;
         }
      }

      return var2;
   }

   public boolean p() {
      q var1 = this.f();
      Object var2 = this;

      while(((q)var2).g.a != -25) {
         if(((q)var2).g.a == -60) {
            return true;
         }

         var2 = ((q)var2).g;
         if(var2 == var1) {
            return false;
         }
      }

      return false;
   }

   public void a(i var1) {
      this.x = var1;
   }

   public i q() {
      return this.x;
   }

   public boolean r() {
      return this.x != null;
   }

   public void b(String var1) {
      this.z = var1;
   }

   private String s() {
      switch(this.G) {
      case 0:
         return d("jh|OZby");
      case 1:
         return d("ku\u007fKKgc}Q[af\u007f@");
      case 2:
         return d("kuyKJjdtIPbdtK");
      case 3:
         return d("oamOV}");
      case 4:
         return d("`hlK]");
      default:
         return d("{cq@@yc");
      }
   }

   public void b(boolean var1) {
      this.A = var1;
   }

   public h t() {
      g var1 = this.i();
      int var2 = this.h();
      g var3 = this.j();
      int var4 = var1.c().c + var2;
      if(!var3.a() && this.a(var3.c(), var4)) {
         var1 = var3;
         var2 = this.y.getNumber(d("OANk}@LNgyKdTjj@Y"));
      }

      var4 = var1.c().c + var2;
      if(this.A && this.y.getBoolean(d("O[UgkmBThz]DTiF@I_`{OYSaa]")) && this.b(var3.c(), var4)) {
         var2 = this.y.getNumber(d("OANk}@LNgyKdTjj@Y"));
         var1 = var3;
      }

      return new h(this, var1, var2);
   }

   private boolean b(q var1, int var2) {
      int var3 = var2 - var1.r;
      int var4 = this.y.getNumber(d("GC^kaZ~Stj"));
      return this.y.getNumber(d("GC^kaZ~Stj")) - var4 < var3 && var3 < this.y.getNumber(d("GC^kaZ~Stj")) + var4;
   }

   private boolean u() {
      if(this.B != null && this.C != null) {
         if(this.D) {
            return this.E;
         } else {
            this.E = a(this.B, this.C);
            this.D = true;
            return this.E;
         }
      } else {
         return false;
      }
   }

   public void f(q var1) {
      this.B = var1;
      this.D = false;
   }

   public void g(q var1) {
      this.C = var1;
      this.D = false;
   }

   private static boolean a(q var0, q var1) {
      if(var0 == var1) {
         return false;
      } else {
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         q var6 = var0;

         do {
            var6 = var6.g;
            if(var6 == null) {
               break;
            }

            if("{".equals(var6.f)) {
               ++var5;
               var3 = true;
            } else if("}".equals(var6.f)) {
               --var5;
               var4 = true;
               if(var5 == 0) {
                  break;
               }
            }

            if(var3 && (var6.a == -10 || var6.a == -25 || var6.a == -60)) {
               var2 = true;
            }
         } while(var6 != null && var6 != var1);

         return var5 == 0 && var3 && var4 && var2;
      }
   }

   public String toString() {
      return this.c("");
   }

   public String c(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var1);
      var2.append(var1);
      var2.append(d("jl\u0000.-"));
      var2.append(this.z);
      var2.append(d("\f\u0001\u001ac`JH\u0000."));
      var2.append(this.s());
      var2.append(d("\u0002\rNadKCI4/"));
      var2.append(u.h(this, this.f()));
      var2.append(d("\u0002\r_vlKH^gaI\rNadKC\u0000."));
      var2.append(this.d().f);
      var2.append("\n");
      return var2.toString();
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 46;
            break;
         case 1:
            var10003 = 45;
            break;
         case 2:
            var10003 = 58;
            break;
         case 3:
            var10003 = 14;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
