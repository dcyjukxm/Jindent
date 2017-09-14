package jindent.cpp;

import jindent.cpp.d;
import jindent.cpp.c.b;
import jindent.cpp.c.c;
import jindent.cpp.c.r;
import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.t;
import jindent.formatter.u;
import jindent.settings.BracesSetting;

public class m extends jindent.formatter.f {
   private static final boolean Y = false;
   private static final boolean Z = false;

   public m(Context var1) {
      super(var1);
   }

   public void a(t var1) {
      q var2 = q.a();
      var2.f = t.emptyString;
      var2.a = 4000;
      var2.b = 0;
      var2.c = this.b.getNumber(t("k$\u0015\u001efA(\u0011\b~D#\u0003\b|y"));
      var2.d = 0;
      var2.e = this.b.getNumber(t("k$\u0015\u001efA(\u0011\b~D#\u0003\b|y"));
      var2.h = null;
      var2.g = this.y;
      this.y = var2;
      this.z = var2;
      jindent.formatter.b.k var3 = var1.p();
      this.a((jindent.formatter.b.h)null, (jindent.formatter.b.k)var3, (String)"");
   }

   public void a(jindent.formatter.b.h var1, jindent.formatter.b.k var2, String var3) {
      if(var1 != null) {
         ;
      }

      d var4 = new d(this.b);
      var4.a(var1, var2);
      int var5 = var2.a();
      jindent.formatter.b.h var6 = null;

      for(int var7 = 0; var7 < var5; ++var7) {
         jindent.formatter.b.h var8 = var6;
         var6 = var2.a(var7);
         this.a(var8, var6);
         this.b(var8, var6);
         this.a(var6, var3 + t("-mG"));
      }

   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2) {
      if(var1 != null && var1.m() && !(var1 instanceof jindent.formatter.e.i) && !(var2 instanceof jindent.formatter.e.h)) {
         this.i(1);
      }

   }

   protected void b(jindent.formatter.b.h var1, jindent.formatter.b.h var2) {
      if(var1 != null && !(var2 instanceof jindent.formatter.e.h)) {
         if(var1 instanceof jindent.cpp.c.i) {
            if(this.b.getBoolean(t("j?\b\u0018bH \u0017\u0019k@(\u0013\u0005}i>!\u0002`O!\u0006\u0003yA$\t\ba"))) {
               if(!(var2 instanceof jindent.cpp.c.i)) {
                  this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\u0013\u0005}i>")));
               }
            } else {
               this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\u0013\u0005}i>")));
            }
         } else if(var1 instanceof jindent.cpp.c.g) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\u0013\u0005}i>")));
         }

         if(var1 instanceof jindent.cpp.c.e) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`N\"\t\u001ef\u007f8\u0004\u0019}\u007f>#\bay?\u0012\u000efb?\u0014")));
         }

         if(var1 instanceof jindent.cpp.c.f) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`N\"\t\u001ef\u007f8\u0004\u0019}\u007f>#\bay?\u0012\u000efb?\u0014")));
         }

         if(var1 instanceof jindent.cpp.c.p) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`H#\u0012\u0000w\u007f,\u0013\u0004}c>")));
         }

         if(var1 instanceof jindent.cpp.c.o) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`N!\u0006\u001eah>")));
         }

         if(var1 instanceof c && !(var2 instanceof c)) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`K$\u0002\u0001v~")));
         }

         if(var1 instanceof r) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\n\u000fw\u007f\t\u0002\u000e~l?\u0006\u0019{b# \u001f}x=\u0014")));
         }

      }
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, jindent.formatter.b.h var3) {
      boolean var4 = false;
      if(var1 == null) {
         var4 = false;
         if(this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u001ds\u007f,\u0013\u0002`N\"\n\u0000wc9\u0014\"|a4%\bfz(\u0002\u0003Ft=\u0002)wn!\u0006\u001fsy$\b\u0003a")) && a(var2)) {
            return;
         }
      } else {
         if(!(var1 instanceof jindent.cpp.c.o) && !(var1 instanceof jindent.cpp.c.p)) {
            return;
         }

         var4 = this.b.getBoolean(t("~\"\u0015\u0019Qa,\u0014\u001e[c9\u0002\u001ftl.\u0002(|x #\bqa,\u0015\ffd\"\t\u001e")) && this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u001ds\u007f,\u0013\u0002`N\"\n\u0000wc9\u0014$|N!\u0006\u001eaD#\u0013\b`k,\u0004\bWc8\n)wn!\u0006\u001fsy$\b\u0003a"));
         if(this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u001ds\u007f,\u0013\u0002`N\"\n\u0000wc9\u0014\"|a4%\bfz(\u0002\u0003Qa,\u0014\u001e[c9\u0002\u001ftl.\u0002(|x #\bqa,\u0015\ffd\"\t\u001e")) && a(var2)) {
            return;
         }
      }

      if(var4) {
         boolean var5;
         int var6;
         if(var2 != null) {
            if(var2 instanceof jindent.formatter.b.c && var3 instanceof jindent.formatter.b.c) {
               var5 = this.b.getBoolean(t("d#\u0014\b`y\n\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`")) || this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`"));
               if(!var5) {
                  return;
               }

               var6 = j(((jindent.formatter.b.c)var2).a());
               int var7 = j(((jindent.formatter.b.c)var3).a());
               if(var6 == var7) {
                  return;
               }
            } else if(var2.g() == var3.g()) {
               return;
            }
         }

         if(var1 == null || !(var1 instanceof jindent.formatter.b.f) || !((jindent.formatter.b.f)var1).a() || this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u001ds\u007f,\u0013\u0002`N\"\n\u0000wc9\u0014$|C(\u0014\u0019wi\u000e\u000b\fa~\u0004\t\u0019w\u007f+\u0006\u000ewH#\u0012\u0000Vh.\u000b\f`l9\u000e\u0002|~"))) {
            if(!(var3 instanceof b) && !(var3 instanceof jindent.cpp.c.m)) {
               if(var3 instanceof jindent.cpp.c.j) {
                  if(((jindent.cpp.c.j)var3).d().d()) {
                     this.a(var2, var3, this.b.getString(t("~9\u0006\u0019{n\u0004\t\u0004fd,\u000b\u0004hh?\u0014>w},\u0015\ffb?")), this.b.getBoolean(t("d#\u0014\b`y\u001e\u0013\ffd..\u0003{y$\u0006\u0001{w(\u0015\u001eAh=\u0006\u001fsy\"\u0015")));
                  } else {
                     this.a(var2, var3, this.b.getString(t("d#\u000e\u0019{l!\u000e\u0017w\u007f>4\bbl?\u0006\u0019}\u007f")), this.b.getBoolean(t("d#\u0014\b`y\u0004\t\u0004fd,\u000b\u0004hh?\u0014>w},\u0015\ffb?")));
                  }
               }

               if(var3 instanceof jindent.cpp.c.o) {
                  if(((jindent.formatter.b.f)var3).a()) {
                     this.a(var2, var3, this.b.getString(t("c(\u0014\u0019wi\u000e\u000b\fa~(\u0014>w},\u0015\ffb?")), this.b.getBoolean(t("d#\u0014\b`y\u0003\u0002\u001efh)$\u0001s~>\u0002\u001eAh=\u0006\u001fsy\"\u0015")));
                  } else {
                     this.a(var2, var3, this.b.getString(t("n!\u0006\u001eah>4\bbl?\u0006\u0019}\u007f")), this.b.getBoolean(t("d#\u0014\b`y\u000e\u000b\fa~(\u0014>w},\u0015\ffb?")));
                  }
               }

               if(var3 instanceof jindent.cpp.c.e) {
                  this.a(var2, var3, this.b.getString(t("n\"\t\u001ef\u007f8\u0004\u0019}\u007f>4\bbl?\u0006\u0019}\u007f")), this.b.getBoolean(t("d#\u0014\b`y\u000e\b\u0003ay?\u0012\u000efb?\u0014>w},\u0015\ffb?")));
               }

               if(var3 instanceof jindent.cpp.c.p) {
                  if(((jindent.cpp.c.p)var3).s()) {
                     this.a(var2, var3, this.b.getString(t("h#\u0012\u0000Qb#\u0014\u0019sc9\u0014>w},\u0015\ffb?")), this.b.getBoolean(t("d#\u0014\b`y\b\t\u0018\u007fN\"\t\u001efl#\u0013\u001eAh=\u0006\u001fsy\"\u0015")));
                  } else {
                     this.a(var2, var3, this.b.getString(t("h#\u0012\u0000a^(\u0017\f`l9\b\u001f")), this.b.getBoolean(t("d#\u0014\b`y\b\t\u0018\u007f~\u001e\u0002\u001ds\u007f,\u0013\u0002`")));
                  }
               }

               if(var3 instanceof c) {
                  if(((c)var3).d().d()) {
                     this.a(var2, var3, this.b.getString(t("~9\u0006\u0019{n\u000b\u000e\b~i>4\bbl?\u0006\u0019}\u007f")), this.b.getBoolean(t("d#\u0014\b`y\u001e\u0013\ffd.!\u0004wa)\u0014>w},\u0015\ffb?")));
                  } else {
                     this.a(var2, var3, this.b.getString(t("k$\u0002\u0001v~\u001e\u0002\u001ds\u007f,\u0013\u0002`")), this.b.getBoolean(t("d#\u0014\b`y\u000b\u000e\b~i>4\bbl?\u0006\u0019}\u007f")));
                  }
               }

               if(var3 instanceof jindent.cpp.c.g) {
                  var5 = this.b.getBoolean(t("d#\u0014\b`y\n\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`")) || this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`"));
                  var6 = ((jindent.cpp.c.g)var3).a();
                  var6 = j(var6);
                  if(var6 == 25 && var5) {
                     this.a(var2, var3, this.b.getString(t("j(\u0013 wy%\b\ta^(\u0017\f`l9\b\u001f")), this.b.getBoolean(t("d#\u0014\b`y\n\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`")));
                  } else if(var6 == 26 && var5) {
                     this.a(var2, var3, this.b.getString(t("~(\u0013 wy%\b\ta^(\u0017\f`l9\b\u001f")), this.b.getBoolean(t("d#\u0014\b`y\u001e\u0002\u0019_h9\u000f\u0002v~\u001e\u0002\u001ds\u007f,\u0013\u0002`")));
                  } else {
                     this.a(var2, var3, this.b.getString(t("`(\u0013\u0005}i>4\bbl?\u0006\u0019}\u007f")), this.b.getBoolean(t("d#\u0014\b`y\u0000\u0002\u0019zb)\u0014>w},\u0015\ffb?")));
                  }
               }

            }
         }
      }
   }

   private static int j(int var0) {
      switch(var0) {
      case 25:
      case 27:
      case 28:
         return 25;
      case 26:
         return 26;
      case 29:
      default:
         return 29;
      }
   }

   protected static boolean a(jindent.formatter.b.h var0) {
      return var0 == null || var0 instanceof jindent.formatter.e.i;
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, String var3) {
      this.a(var1, var2, var3, true);
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, String var3, boolean var4) {
      if(var1 != null && !(var1 instanceof jindent.formatter.e.i)) {
         this.i(1);
      }

      if(!var3.equals("") && var4) {
         String var5 = u.a(this.V, this.b.getNumber(t("~(\u0017\f`l9\b\u001fQb \n\b|y\u0001\u000e\u0003wA(\t\nfe")), this.b.getString(t("~(\u0017\f`l9\b\u001fQb \n\b|y\u000b\u000e\u0001~N%\u0006\u001fsn9\u0002\u001fa")), var3);
         this.e(var5);
         this.i(1);
         this.p();
      }
   }

   protected void a(jindent.formatter.b.h var1, String var2) {
      if(var1 != null) {
         if(var1 instanceof jindent.formatter.b.i) {
            jindent.formatter.b.i var3 = (jindent.formatter.b.i)var1;
            this.a(var3.k(), var3.l(), var3.i());
         }

         if(var1 instanceof jindent.formatter.b.j) {
            jindent.formatter.b.j var5 = (jindent.formatter.b.j)var1;
            this.a(var5.b(), var5.c(), var5.i());
            if(var5.r()) {
               jindent.formatter.b.k var4 = var5.q();
               this.a(var1, var4, var2 + t("-mG"));
            }

            this.a(var5.f(), var5.o(), var5.i());
         }

      }
   }

   protected void a(q var1, q var2, boolean var3) {
      if(var1 != null || var2 != null) {
         if(var1 == null) {
            throw new RuntimeException(t("N=\u0017=s\u007f>\u0002\u001f<n\"\t\u001bw\u007f93\u0002yh#\u0014+`b 3\u0002yh#7\u001f}i8\u0004\b`%\u0019\b\u0006wcaG9}f(\tD(->\u0013\f`y\u0019\b\u0006wcmZP2c8\u000b\u0001"));
         } else if(var2 == null) {
            throw new RuntimeException(t("N=\u0017=s\u007f>\u0002\u001f<n\"\t\u001bw\u007f93\u0002yh#\u0014+`b 3\u0002yh#7\u001f}i8\u0004\b`%\u0019\b\u0006wcaG9}f(\tD(-(\t\tFb&\u0002\u000320pG\u0003ga!"));
         } else {
            q var4 = var1;
            q var5 = u.l(var1);

            q var7;
            for(q var6 = var2.g; var4 != var6; var4 = var7) {
               var7 = var4.g;
               this.b(var5, var4, var3);
            }

         }
      }
   }

   public void b(q var1, q var2, boolean var3) {
      if(!this.o.k()) {
         this.F = (jindent.formatter.j)this.o.j();
      } else {
         this.F = null;
      }

      BracesSetting var4;
      int var5;
      int var6;
      q var9;
      q var10;
      boolean var11;
      switch(var2.a) {
      case -203:
         this.i(var2.l);
         var2 = null;
         break;
      case -202:
         if(var2.l == 1) {
            this.q();
         }

         var2 = null;
         break;
      case -201:
         if(var2.l == 1) {
            var9 = u.k(this.z)?this.z:u.g(this.z);
            if(!var9.f.equals("(") && !var9.f.equals("[") && !var9.f.equals("{")) {
               if(!this.b.getBoolean(t("n\"\n\u000f{c(7\fvi$\t\nBl?\u0002\u0003fe(\u0014\ba"))) {
                  this.q();
               } else {
                  var10 = this.z;

                  for(var11 = false; var10 != null; var10 = var10.k) {
                     if(var10.a == -201 && var10.l == 1) {
                        var9 = u.g(var10);
                        if(var9 != null && !var9.f.equals(")")) {
                           int var12 = this.d - var9.e;
                           if(var12 > 1) {
                              var11 = true;
                              break;
                           }
                        }
                     }

                     if(u.k(var10) && !var10.f.equals(")")) {
                        var11 = false;
                        break;
                     }
                  }

                  if(!var11) {
                     this.q();
                  }
               }
            }
         }

         this.m(var2);
         break;
      case -200:
         if(var2.l == 1) {
            var9 = u.j(var2);
            if(var9.f.equals(")")) {
               if(!this.b.getBoolean(t("c\"7\fvi$\t\n]k\b\n\u001dft\u001d\u0006\u001fwc9\u000f\bah>"))) {
                  this.q();
               }
            } else if(var9.f.equals("]")) {
               if(!this.b.getBoolean(t("c\"7\fvi$\t\n]k\b\n\u001dft\u000f\u0015\fqf(\u0013\u001e"))) {
                  this.q();
               }
            } else if(var9.f.equals("}")) {
               if(!this.b.getBoolean(t("c\"7\fvi$\t\n]k\b\n\u001dft\u000f\u0015\fqh>.\u0003[c$\u0013\u0004sa$\u001d\b`~"))) {
                  this.q();
               }
            } else if(!this.b.getBoolean(t("n\"\n\u000f{c(7\fvi$\t\nBl?\u0002\u0003fe(\u0014\ba"))) {
               this.q();
            } else {
               var10 = var2;
               var11 = false;

               while(var10 != null) {
                  var10 = var10.g;
                  if(var10.a == -200 && var10.l == 1) {
                     var9 = u.j(var10);
                     if(var9 != null && !var9.f.equals("(")) {
                        var11 = true;
                        break;
                     }
                  }

                  if(u.k(var10) && !var10.f.equals("(")) {
                     var11 = false;
                     break;
                  }
               }

               if(!var11) {
                  this.q();
               }
            }
         }

         this.m(var2);
         break;
      case -118:
         this.L = this.b.getNumber(t("l!\u0013\b`c,\u0013\u0004dh\u0004\t\twc9"));
         var2 = null;
         break;
      case -117:
         this.L = var2.l;
         var2 = null;
         break;
      case -111:
         var5 = var2.l;
         if(this.V >= var5) {
            this.V -= var5;
         } else {
            this.V = 0;
         }

         var4 = (BracesSetting)var2.m;
         if(var4.getBoolean(t("c\"%\u0001sc&+\u0004|h>&\u000bfh?+\bty\u000f\u0015\fqh"))) {
            this.T = Integer.MAX_VALUE;
         }

         var2 = null;
         break;
      case -104:
         if(this.V >= this.b.getNumber(t("d#\u0003\b|y\u001e\u000e\u0017w"))) {
            this.V -= this.b.getNumber(t("d#\u0003\b|y\u001e\u000e\u0017w"));
         } else {
            this.V = 0;
         }

         ++this.M;
         var2 = null;
         break;
      case -103:
         var9 = (q)var2.m;
         var6 = this.d - this.V;
         int var7 = this.b.getAbsoluteRelativeIndex(t("i(\u0002\u001d[c)\u0002\u0003fK\"\u0015 ga9\u000e\u001d~h\t\u0002\u000e~l?\u0006\u0019{b#\u0014"));
         boolean var8 = var7 == 0?var6 > this.b.getNumber(t("i(\u0002\u001d[c)\u0002\u0003fK\"\u0015 ga9\u000e\u001d~h\t\u0002\u000e~l?\u0006\u0019{b#\u0014")):this.d > this.b.getNumber(t("i(\u0002\u001d[c)\u0002\u0003fK\"\u0015 ga9\u000e\u001d~h\t\u0002\u000e~l?\u0006\u0019{b#\u0014"));
         if(var8) {
            this.r();
            this.V += this.b.getNumber(t("d#\u0003\b|y\u001e\u000e\u0017w"));
            var9.a = -104;
            ++this.M;
         }

         var2 = null;
         break;
      case -102:
      case -101:
      case -97:
      case -94:
      case -56:
      case -55:
      case -19:
      case -18:
      case -17:
         if(!this.C) {
            this.m(var2);
         }
         break;
      case -100:
         this.l(var2);
         break;
      case -70:
         if(this.d < this.V) {
            this.d = this.V;
            this.S = true;
         }

         var2 = null;
         break;
      case -69:
         this.d = this.b.getNumber(t("k$\u0015\u001efA(\u0011\b~D#\u0003\b|y"));
         this.S = true;
         var2 = null;
         break;
      case -68:
         var9 = (q)var2.m;
         this.d = var9.c + var2.l;
         this.S = true;
         var2 = null;
         break;
      case -67:
         ++this.O;
         var2 = null;
         break;
      case -66:
         ++this.N;
         var2 = null;
         break;
      case -60:
         jindent.debugger.a.b(t("R\u000e( _H\u000332^D\u0003\"2TH\b#W2Y%\u000e\u001e2n,\t\u0003}ym\u0005\b2\u007f(\u0006\u000ezh)G\u0004|-(\u001f\u0019`l.\u00139}f(\t\u001e:$mF"));
         this.s();
         break;
      case -51:
         this.l(var2);
         this.f(var2);
         break;
      case -49:
         this.l(var2);
         this.e(var2);
         break;
      case -41:
         var4 = (BracesSetting)var2.m;
         this.g(var4.getNumber(t("d#\u0003\b|y\f\u0001\u0019w\u007f\u001f\u000e\nzy\u000f\u0015\fqh")));
         var2 = null;
         break;
      case -40:
         var4 = (BracesSetting)var2.m;
         this.g(var4.getNumber(t("d#\u0003\b|y\u000e\u0012\tva(\u0003/`l.\u0002\u001e")));
         var2 = null;
         break;
      case -39:
         var4 = (BracesSetting)var2.m;
         this.a(var4.getNumber(t("d#\u0003\b|y\u001f\u000e\nzy\u000f\u0015\fqh")), var4.getBoolean(t("\u007f$\u0000\u0005fO?\u0006\u000ewC(\u0010!{c(")));
         var2 = null;
         break;
      case -38:
         var4 = (BracesSetting)var2.m;
         if(!this.R) {
            this.g(var4.getNumber(t("d#\u0003\b|y\u0001\u0002\u000bfO?\u0006\u000ew")));
         } else if(this.R && var4.getBoolean(t("a(\u0001\u0019P\u007f,\u0004\b\\h:+\u0004|h"))) {
            this.V += var4.getNumber(t("d#\u0003\b|y\u0001\u0002\u000bfO?\u0006\u000ew"));
            if(var2.g.g.a == -111) {
               var2.g.g.l = var4.getNumber(t("d#\u0003\b|y\u0001\u0002\u000bfO?\u0006\u000ew"));
            } else {
               jindent.debugger.a.b(t("Y\"\f\b|-\u0012.!PA\u000fG\u0019`d(\u0003Mfbm\u0015\bth?\u0002\u0003qhm\u0013\u00022lm\u0013\u0002yh#G\u001azd.\u000fM{~m\t\u0002f-\"\u0001Myd#\u0003MMD\u0001%!PR\u000f&.Y-l"));
            }
         }

         var2 = null;
         break;
      case -27:
         if(this.C && this.D == this.E) {
            this.C = false;
         }

         var2 = null;
         break;
      case -26:
         if(!this.C) {
            this.C = true;
            this.D = this.E;
         }

         var2 = null;
      case -24:
         break;
      case -20:
         this.E += var2.l;
         var2 = null;
         break;
      case -16:
         var5 = var2.l;
         if(var5 == 1) {
            this.a(this.z, var5, this.M, new jindent.formatter.d.j(this.z, this.b.getBoolean(t("l!\u000e\n|I(\u0004\u0001s\u007f,\u0013\u0004}c>")) && this.b.getBoolean(t("l!\u000e\n|H5\u0004\bwi$\t\nVh.\u000b\f`l9\u000e\u0002|~"))));
         }

         if(var5 == 2) {
            this.a(this.z, var5, this.N, new jindent.formatter.d.j(this.z, this.b.getBoolean(t("l!\u000e\n|L>\u0014\u0004uc \u0002\u0003f~")) && this.b.getBoolean(t("l!\u000e\n|H5\u0004\bwi$\t\nS~>\u000e\n|`(\t\u0019a"))));
         }

         if(var5 == 5) {
            this.a(this.z, var5, this.O, new jindent.formatter.d.j(this.z, this.b.getBoolean(t("l!\u000e\n|O$\u0013+{h!\u0003\u001e")) && this.b.getBoolean(t("l!\u000e\n|H5\u0004\bwi$\t\nPd9!\u0004wa)\u0014"))));
         }

         if(var5 == 3) {
            this.a(this.z, var5, this.P, new jindent.formatter.d.j(this.z, this.b.getBoolean(t("l!\u000e\n|L#\t\u0002fl9\u000e\u0002|I(\u0001\fga9\u0014")) && this.b.getBoolean(t("l!\u000e\n|H5\u0004\bwi$\t\nSc#\b\u0019sy$\b\u0003Vh+\u0006\u0018~y>"))));
         }

         if(var5 == 4) {
            this.a(this.z, var5, this.M, new jindent.formatter.d.j(this.z, this.b.getBoolean(t("l!\u000e\n|],\u0015\f\u007fh9\u0002\u001fVh.\u000b\f`l9\u000e\u0002|~")) && this.b.getBoolean(t("l!\u000e\n|H5\u0004\bwi$\t\nBl?\u0006\u0000wy(\u0015)wn!\u0006\u001fsy$\b\u0003a"))));
         }

         var2 = null;
         break;
      case -15:
         this.y();
         var2 = null;
         break;
      case -14:
         this.z();
         var2 = null;
         break;
      case -13:
         this.k(var2.l);
         var2 = null;
         break;
      case -12:
         this.x();
         var2 = null;
         break;
      case -11:
         this.G = null;
         var2 = null;
         break;
      case -10:
         this.a((jindent.formatter.j)var2.m, var2);
         var2 = null;
         break;
      case -9:
         this.n = (jindent.formatter.e.a.a.b)var2.m;
         this.B = true;
         var2 = null;
         break;
      case -8:
         this.m = (jindent.formatter.e.a.a.b)var2.m;
         if(this.b.getBoolean(t("~\"\u0015\u0019Wu.\u0002\u001dfd\"\t\u001e[c\u0019\u0002\u0000ba,\u0013\ba"))) {
            this.m.g();
         }

         this.A = true;
         var2 = null;
         break;
      case -7:
         if(this.V >= var2.l) {
            this.V -= var2.l;
         } else {
            this.V = 0;
         }

         var2 = null;
         break;
      case -6:
         this.V += var2.l;
         var2 = null;
         break;
      case -4:
         var4 = (BracesSetting)var2.m;
         if(var4.getBoolean(t("\u007f$\u0000\u0005fO?\u0006\u000ewC(\u0010!{c("))) {
            this.r();
         }

         var2 = null;
         break;
      case -3:
         var4 = (BracesSetting)var2.m;
         if(var4.getBoolean(t("a(\u0001\u0019P\u007f,\u0004\b\\h:+\u0004|h"))) {
            this.r();
         }

         var2 = null;
         break;
      case -1:
         this.r();
         var2 = null;
         break;
      case 0:
         if(this.b.a.n(var2)) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u000b\b\u0002fh?")));
            this.m(var2, true);
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`K\"\b\u0019w\u007f")));
         } else if(this.b.a.o(var2)) {
            this.b.a.t(var2);
            this.m(var2, false);
         } else if(this.b.getFooterIndex(t("k\"\b\u0019w\u007f\u0004\t\u001ew\u007f9\u000e\u0002|@\"\u0003\b")) != 0) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u000b\b\u0002fh?")));
            this.g();
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`K\"\b\u0019w\u007f")));
         }

         var2 = null;
         break;
      case 4001:
         if(var2.h == null) {
            if(this.b.getHeaderIndex(t("e(\u0006\tw\u007f\u0004\t\u001ew\u007f9\u000e\u0002|@\"\u0003\b")) != 0) {
               this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u0005\u0002\fvh?")));
               this.f();
               this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`E(\u0006\tw\u007f")));
            }
         } else {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u0005\u0002\fvh?")));
            this.m(var2, true);
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`E(\u0006\tw\u007f")));
         }

         var2 = null;
         break;
      default:
         var9 = u.j(var2);
         var6 = this.F == null?0:this.F.a();
         if(this.b.a.p(var2) && (var6 == 1 || var6 == 2 || var6 == 6 || var6 == 7 || var6 == 8 || var6 == 37 || u.b(var6) || var6 == 13 || var6 == 36 || var6 == 45 || var6 == 21 || var6 == 22 || var6 == 23 || var6 == 24 || var6 == 0)) {
            this.p();
         }

         if(var3 && var2 == var1) {
            this.b.a.t(var2);
            this.m(var2, true);
         } else {
            this.b.a.t(var2);
            this.m(var2, false);
         }

         if(!var2.f.equals("")) {
            this.l(var2);
         }

         if(var9 != null) {
            this.g(var9.h);
         }
      }

   }

   protected void l() {
      this.c(this.y, (q)null);
   }

   protected void c(q var1, q var2) {
      q var3 = var1;
      if(var1 == null) {
         throw new RuntimeException(t("n8\u0015\u001fwc93\u0002yh#G\u0002t-=\b\u001ef@\"\u0003\u0004tt\u0019\b\u0006wc>G\u0004a-#\u0012\u0001~!m\n\fko(G\u0014}xm\u0012\u001ewim\u0006\u00032h \u0017\u0019k-/\u000b\u0002qfm\u001c\u00102d#G\u0014}x?G\u001e}x?\u0004\b2n\"\u0003\b2h5\u0006\u0000ba(X"));
      } else {
         do {
            switch(var3.a) {
            case -55:
               var3 = this.n(var3);
               break;
            default:
               var3 = var3.g;
            }
         } while(var3 != var2);

      }
   }

   protected q n(q var1) {
      q var2 = u.a((q)var1, -56, var1.l);
      this.c(var1.g, var2.k);
      q var3 = u.j(var1);
      int var4 = u.a(var1, var2, -25) - 1;
      int var5 = u.a(var1, var3, -25) - 1;
      BracesSetting var6 = (BracesSetting)var1.m;
      if(var4 >= var6.getNumber(t("`$\t!{c(\u00149}D#\u0014\b`y\u000f\u000b\f|f\u0001\u000e\u0003wL+\u0013\b`A(\u0001\u0019P\u007f,\u0004\b")) && !var6.getBoolean(t("c\"%\u0001sc&+\u0004|h>&\u000bfh?+\bty\u000f\u0015\fqh")) && var5 < 1) {
         u.b(var1);
      }

      q var7 = u.j(var2);
      q var8 = u.j(var7);
      if(var8 != null && var8.f.equals(",")) {
         var8 = u.j(var8);
      }

      if(var4 >= var6.getNumber(t("`$\t!{c(\u00149}D#\u0014\b`y\u000f\u000b\f|f\u0001\u000e\u0003wO(\u0001\u0002`h\u001f\u000e\nzy\u000f\u0015\fqh")) && var5 < 1) {
         boolean var9 = var8 == null || var8 != null && (u.c(var7, var8, -25) || var8.f.equals(";"));
         if(var9) {
            if(!var6.getBoolean(t("i\")\u0002fD#\u0014\b`y\u000f\u0002\u000b}\u007f(4\u0004|j!\u0002?{j%\u0013/`l.\u0002"))) {
               u.b(var2);
            }
         } else {
            u.b(var2);
         }
      }

      return var2.g;
   }

   protected void a(jindent.formatter.j var1, q var2) {
      if(var1.a() == 26) {
         var1.a(this.i(var2));
      }

      int var3 = this.G == null?0:this.G.a();
      int var4 = var1 == null?0:var1.a();
      if(var3 != 0 && u.c(var3) && var1.b()) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u001e\u0013\ffh \u0002\u0003f~\u000e\b\u0003fl$\t\u0004|j\u000f\u000b\u0002qf>")));
      }

      if(var3 != 0 && var4 == 9) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u000f\u0015\bsf\u001e\u0013\ffh \u0002\u0003f~")));
      }

      if(var3 != 0 && var4 == 10) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u000e\b\u0003fd#\u0012\bAy,\u0013\b\u007fh#\u0013\u001e")));
      }

      if(var3 != 0 && var4 == 12) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u0019\u000f\u001f}z\u001e\u0013\ffh \u0002\u0003f~")));
      }

      if(var3 != 0 && var4 == 11) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u001f\u0002\u0019g\u007f#4\u0019sy(\n\b|y>")));
      }

      if(var3 != 0 && var4 == 53) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\n\b\u0019}^9\u0006\u0019w`(\t\u0019a")));
      }

      if(var3 != 0 && var4 == 35) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0013\u001awh#\"\u0003g`\b\u000b\b\u007fh#\u0013\u001eSc)$\u0001s~>%\u0002vt")));
      }

      if(var3 != 0 && u.c(var3) && this.G.b()) {
         this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`^9\u0006\u0019w`(\t\u0019aN\"\t\u0019sd#\u000e\u0003uO!\b\u000ey~")));
      }

      if(var4 != var3 || !u.b(var4) && var4 != 13 && var4 != 36 && var4 != 21 && var4 != 22 && var4 != 49 && var4 != 51 && var4 != 39 && var4 != 40 && var4 != 54 && var4 != 23 && var4 != 24) {
         ++this.M;
         ++this.N;
         ++this.P;
         ++this.O;
         if(var4 != var3 && u.c(var3) && !u.b(var3) && u.c(var4) && !u.b(var4) && !var1.b() && !this.G.b()) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0013\u001awh##\u0004tk(\u0015\b|y\u001e\u0013\ffh \u0002\u0003f~")));
         }

         if(var3 != 0 && var4 == 13) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u0001\b\u000esa\u001b\u0006\u001f{l/\u000b\ba")));
         }

         if(var3 == 13) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`A\"\u0004\f~[,\u0015\u0004so!\u0002\u001e")));
         }

         if(var3 != 0 && var4 == 51) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baO(\u0001\u0002`h\u0000\u0002\u0019si,\u0013\fVh+\u000e\u0003{y$\b\u0003a")));
         }

         if(var3 == 51) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\u0013\fvl9\u0006)wk$\t\u0004fd\"\t\u001e")));
         }

         if(var3 == 49) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@,\u0004\u001f}K8\t\u000efd\"\t\u001e")));
         }

         if(var3 == 39) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`X>\u000e\u0003uI(\u0004\u0001s\u007f,\u0013\u0004}c>")));
         }

         if(var3 == 41) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`O!\b\u000ey~\u0002\u0001!{c&\u0006\nw^=\u0002\u000e{k$\u0004\ffd\"\t\u001e")));
         }

         if(var3 == 40) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`X>\u000e\u0003uI$\u0015\bqy$\u0011\ba")));
         }

         if(var3 == 36) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`K$\u0002\u0001v~")));
         }

         if(var3 == 33) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`H#\u0012\u0000w\u007f,\u0013\u0004}c>")));
         }

         if(var3 == 3) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`N!\u0006\u001eah>")));
         }

         if(var3 == 45) {
            this.i(this.b.getNumber(t("o!\u0006\u0003yA$\t\baL+\u0013\b`@(\n\u000fw\u007f\t\u0002\u000e~l?\u0006\u0019{b# \u001f}x=\u0014")));
         }
      }

      if(!this.o.k()) {
         this.G = (jindent.formatter.j)this.o.j();
      } else {
         this.G = null;
      }

      this.o.f(var1);
   }

   protected void x() {
      try {
         this.G = (jindent.formatter.j)this.o.i();
      } catch (Exception var2) {
         ;
      }

   }

   protected void k(int var1) {
      ++this.J;
      if(this.H == 0) {
         this.H = var1;
         this.I = this.J;
         if(this.H != this.K || this.H != 1 && this.H != 2 && this.H != 6 && this.H != 7 && this.H != 37 && !u.b(this.H) && this.H != 13 && this.H != 36 && this.H != 21 && this.H != 22 && this.H != 23 && this.H != 24) {
            ++this.Q;
         }
      }

   }

   protected void y() {
      if(this.J == this.I && this.H != 0) {
         this.K = this.H;
         this.H = 0;
         this.I = 0;
      }

      --this.J;
   }

   protected void z() {
      this.K = 0;
   }

   protected void h() {
      this.b.a.a(this.b);
      this.a(1, this.b.getBoolean(t("l!\u000e\n|I(\u0004\u0001s\u007f,\u0013\u0004}c>")), this.b.getBoolean(t("d#\u0003\b|y\t\u0002\u000e~l?\u0006\u0019{b#\u0014/kY,\u0005\u001e")));
      this.b.a.a(this.b);
      this.a(2, this.b.getBoolean(t("l!\u000e\n|L>\u0014\u0004uc \u0002\u0003f~")), this.b.getBoolean(t("d#\u0003\b|y\f\u0014\u001e{j#\n\b|y>%\u0014Fl/\u0014")));
      this.b.a.a(this.b);
      this.a(5, this.b.getBoolean(t("l!\u000e\n|O$\u0013+{h!\u0003\u001e")), this.b.getBoolean(t("d#\u0003\b|y\u000f\u000e\u0019Td(\u000b\taO43\fp~")));
      this.b.a.a(this.b);
      this.a(3, this.b.getBoolean(t("l!\u000e\n|L#\t\u0002fl9\u000e\u0002|I(\u0001\fga9\u0014")), this.b.getBoolean(t("d#\u0003\b|y\f\t\u0003}y,\u0013\u0004}c\t\u0002\u000bsx!\u0013\u001ePt\u0019\u0006\u000fa")));
      this.b.a.a(this.b);
   }

   protected void i() {
      this.b.a.a(this.b);
      this.a(4, this.b.getBoolean(t("l!\u000e\n|],\u0015\f\u007fh9\u0002\u001fVh.\u000b\f`l9\u000e\u0002|~")), this.b.getBoolean(t("d#\u0003\b|y\u001d\u0006\u001fs`(\u0013\b`I(\u0004\u0001s\u007f,\u0013\u0004}c>%\u0014Fl/\u0014")));
      this.b.a.a(this.b);
      this.a(0, this.b.getBoolean(t("l!\u000e\n|N\"\n\u0000wc9\u0014")), this.b.getBoolean(t("d#\u0003\b|y\u000e\b\u0000\u007fh#\u0013\u001ePt\u0019\u0006\u000fa")));
      this.b.a.a(this.b);
      this.w();
   }

   protected boolean a(int var1, q var2) {
      return var2.a == -28 && this.b.getBoolean(t("d#\u0003\b|y\u000e\b\u0000\u007fh#\u0013\u001ePt\u0019\u0006\u000fa")) && var1 > 0 || var2.a == 5000 && this.b.getBoolean(t("d#\u0003\b|y\t\u0002\u000e~l?\u0006\u0019{b#\u0014/kY,\u0005\u001e")) || var2.a == 5001 && this.b.getBoolean(t("d#\u0003\b|y\f\u0014\u001e{j#\n\b|y>%\u0014Fl/\u0014")) || var2.a == 5002 && this.b.getBoolean(t("d#\u0003\b|y\u000f\u000e\u0019Td(\u000b\taO43\fp~")) || var2.a == 5005 && this.b.getBoolean(t("d#\u0003\b|y\f\t\u0003}y,\u0013\u0004}c\t\u0002\u000bsx!\u0013\u001ePt\u0019\u0006\u000fa")) || var2.a == 5006 && this.b.getBoolean(t("d#\u0003\b|y\u001d\u0006\u001fs`(\u0013\b`I(\u0004\u0001s\u007f,\u0013\u0004}c>%\u0014Fl/\u0014"));
   }

   protected String[] j() {
      return new String[]{t("\"gMQ"), t("\"gM"), t("\"bHQ"), t("\"bH"), t("\"bFQ"), t("\"bF"), t("\"b["), t("\"b"), t("\"gFQ"), t("\"gF"), t("\"g["), t("\"g")};
   }

   private static String t(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 13;
            break;
         case 1:
            var10003 = 77;
            break;
         case 2:
            var10003 = 103;
            break;
         case 3:
            var10003 = 109;
            break;
         default:
            var10003 = 18;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
