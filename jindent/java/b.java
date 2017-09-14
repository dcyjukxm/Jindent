package jindent.java;

import java.util.StringTokenizer;
import jindent.formatter.Context;
import jindent.formatter.l;
import jindent.formatter.q;
import jindent.formatter.t;
import jindent.formatter.u;
import jindent.formatter.b.k;
import jindent.java.g;
import jindent.java.a.m;
import jindent.java.a.n;
import jindent.java.a.p;
import jindent.settings.BracesSetting;

public class b extends jindent.formatter.f {
   public b(Context var1) {
      super(var1);
   }

   private static String t(String var0) {
      int var1 = var0.lastIndexOf(46);
      return var1 != -1?var0.substring(0, var1):"";
   }

   private boolean a(String var1, String var2) {
      String var3 = t(var1);
      String var4 = t(var2);
      if(var3.equals("") && !var4.equals("") || !var3.equals("") && var4.equals("")) {
         return true;
      } else {
         StringTokenizer var5 = new StringTokenizer(var3, ".");
         StringTokenizer var6 = new StringTokenizer(var4, ".");
         boolean var7 = false;
         int var10 = 1;

         while(true) {
            if(var10 <= this.b.getNumber(u("OOMH0ReOH7VKS@\u0006CRIO")) && !var7) {
               if(var5.hasMoreTokens() && var6.hasMoreTokens()) {
                  String var8 = var5.nextToken();
                  String var9 = var6.nextToken();
                  var7 = !var8.equals(var9);
                  ++var10;
                  continue;
               }

               if(var5.hasMoreTokens() != var6.hasMoreTokens()) {
                  return true;
               }

               return var7;
            }

            return var7;
         }
      }
   }

   public void a(t var1) {
      q var2 = q.a();
      var2.f = t.emptyString;
      var2.a = 4000;
      var2.b = 0;
      var2.c = this.b.getNumber(u("@KOT6jGKB.oLYB,R"));
      var2.d = 0;
      var2.e = this.b.getNumber(u("@KOT6jGKB.oLYB,R"));
      var2.h = null;
      var2.g = this.y;
      this.y = var2;
      this.z = var2;
      k var4 = var1.p();
      this.a((jindent.formatter.b.h)null, (k)var4, (String)"");
   }

   public void a(jindent.formatter.b.h var1, k var2, String var3) {
      g var4 = new g(this.b);
      var4.a(var1, var2);
      int var5 = var2.a();
      jindent.formatter.b.h var6 = null;

      for(int var7 = 0; var7 < var5; ++var7) {
         jindent.formatter.b.h var8 = var6;
         var6 = var2.a(var7);
         this.a(var8, var6);
         this.b(var8, var6);
         this.c(var8, var6);
         this.a(var1, var8, var6);
         this.a(var6, var3 + u("\u0006\u0002\u001d"));
         if(var7 < var5 - 1) {
            ;
         }
      }

   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2) {
      if(var1 != null && var1.m() && !(var1 instanceof jindent.formatter.e.i) && !(var2 instanceof jindent.formatter.e.h)) {
         this.i(1);
      }

   }

   protected void b(jindent.formatter.b.h var1, jindent.formatter.b.h var2) {
      if(var1 instanceof jindent.java.a.d && var2 instanceof jindent.java.a.d) {
         boolean var3 = ((jindent.java.a.d)var1).d().d();
         boolean var4 = ((jindent.java.a.d)var2).d().d();
         if(var3 && !var4 || !var3 && var4) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1rMnB2GP\\S\'uV\\S+EkPW-TVzU-SRN")));
         }

         String var5 = ((jindent.java.a.d)var1).e();
         String var6 = ((jindent.java.a.d)var2).e();
         if(this.a(var5, var6)) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1rMnB2GP\\S\'oOMH0ReOH7VQ")));
         }
      }

   }

   protected void c(jindent.formatter.b.h var1, jindent.formatter.b.h var2) {
      if(var1 != null && !(var2 instanceof jindent.formatter.e.h)) {
         if(var1 instanceof jindent.java.a.h) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0kGIO-BQ")));
         }

         if(var1 instanceof jindent.java.a.g) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0eMST6TW^S-TQ")));
         }

         if(var1 instanceof n) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0cLHJ\'TCIN-HQ")));
         }

         if(var1 instanceof jindent.java.a.e) {
            jindent.java.a.e var3 = (jindent.java.a.e)var1;
            l var4 = var3.d();
            if(var4 != null && var4.d()) {
               this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0uV\\S+EkSN6OCQN8CPN")));
            } else {
               this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0oLNS#HAXn,OVTF.OXXU1")));
            }
         }

         if(var1 instanceof m) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0eN\\T1CQ")));
         }

         if(var1 instanceof jindent.java.a.k) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0gLSH6GVTH,r[MB1")));
         }

         if(var1 instanceof p) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0oLIB0@C^B1")));
         }

         if(var1 instanceof jindent.java.a.b && !(var2 instanceof jindent.java.a.b)) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0`KXK&U")));
         }

         if(var1 instanceof jindent.java.a.j) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0vC^L#AG")));
         }

         if(var1 instanceof jindent.java.a.d && !(var2 instanceof jindent.java.a.d)) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0jCNS\u000bKRRU6")));
         }

      }
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, jindent.formatter.b.h var3) {
      boolean var4 = false;
      if(var1 == null) {
         if(var3 instanceof jindent.java.a.d) {
            var4 = this.b.getBoolean(u("UMOS\u000bKRRU6bG^K#TCIN-HQ")) && this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNn,oOMH0RfXD.GP\\S+ILN"));
            if(this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNh,J[\u007fB6QGXI\u000bKRRU6bG^K#TCIN-HQ")) && !(var2 instanceof jindent.java.a.d)) {
               return;
            }
         } else {
            var4 = this.b.getBoolean(u("UMOS\u0016_RXc\'EN\\U#RKRI1")) && this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNn,r[MB\u0006CAQF0GVTH,U"));
            if(this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNh,J[\u007fB6QGXI\u0016_RXc\'EN\\U#RKRI1")) && a(var2)) {
               return;
            }
         }
      } else {
         if(!(var1 instanceof m) && !(var1 instanceof p) && !(var1 instanceof n)) {
            return;
         }

         var4 = this.b.getBoolean(u("UMOS\u0001JCNT\u000bHVXU$GAXb,SOyB!JCOF6OMST")) && this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNn,eN\\T1oLIB0@C^B\u0007HWPc\'EN\\U#RKRI1"));
         if(this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNh,J[\u007fB6QGXI\u0001JCNT\u000bHVXU$GAXb,SOyB!JCOF6OMST")) && a(var2)) {
            return;
         }
      }

      if(var4) {
         if(var3 instanceof jindent.java.a.d) {
            ;
         }

         boolean var5;
         int var8;
         if(var2 != null) {
            if(var2 instanceof jindent.formatter.b.c && var3 instanceof jindent.formatter.b.c) {
               var5 = this.b.getBoolean(u("OLNB0ReXS\u000fCVUH&UqXW#TCIH0")) || this.b.getBoolean(u("OLNB0RqXS\u000fCVUH&UqXW#TCIH0"));
               if(!var5) {
                  return;
               }

               var8 = j(((jindent.formatter.b.c)var2).a());
               int var7 = j(((jindent.formatter.b.c)var3).a());
               if(var8 == var7) {
                  return;
               }
            } else if(var2 instanceof jindent.java.a.d && var3 instanceof jindent.java.a.d) {
               var5 = ((jindent.java.a.d)var2).a();
               boolean var6 = ((jindent.java.a.d)var3).a();
               if(var5 == var6) {
                  return;
               }
            } else if(var2.g() == var3.g()) {
               return;
            }
         }

         if(var1 == null || !(var1 instanceof jindent.formatter.b.f) || !((jindent.formatter.b.f)var1).a() || this.b.getBoolean(u("OLNB0RqXW#TCIH0eMPJ\'HVNn,hGNS\'BaQF1UkSS\'TD\\D\'cLHJ\u0006CAQF0GVTH,U"))) {
            if(!(var3 instanceof jindent.java.a.a) && !(var3 instanceof jindent.java.a.i)) {
               if(var3 instanceof jindent.java.a.k) {
                  this.a(var2, var3, this.b.getString(u("GLSH6GVTH,UqXW#TCIH0")), this.b.getBoolean(u("OLNB0RcSI-RCIN-HQnB2GP\\S-T")));
               }

               if(var3 instanceof jindent.java.a.e) {
                  if(((jindent.java.a.e)var3).d().d()) {
                     this.a(var2, var3, this.b.getString(u("UV\\S+EkSN6OCQN8CPNt\'VCOF6IP")), this.b.getBoolean(u("OLNB0RqIF6OAtI+RK\\K+\\GOT\u0011CR\\U#RMO")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("OLTS+GNT]\'TQnB2GP\\S-T")), this.b.getBoolean(u("OLNB0RkSN6OCQN8CPNt\'VCOF6IP")));
                  }
               }

               if(var3 instanceof m) {
                  if(((jindent.formatter.b.f)var3).a()) {
                     this.a(var2, var3, this.b.getString(u("HGNS\'BaQF1UGNt\'VCOF6IP")), this.b.getBoolean(u("OLNB0RlXT6CF~K#UQXT\u0011CR\\U#RMO")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("EN\\T1CQnB2GP\\S-T")), this.b.getBoolean(u("OLNB0RaQF1UGNt\'VCOF6IP")));
                  }
               }

               if(var3 instanceof jindent.java.a.g) {
                  this.a(var2, var3, this.b.getString(u("EMST6TW^S-TQnB2GP\\S-T")), this.b.getBoolean(u("OLNB0RaRI1RPHD6IPNt\'VCOF6IP")));
               }

               if(var3 instanceof n) {
                  if(((n)var3).s()) {
                     this.a(var2, var3, this.b.getString(u("CLHJ\u0001ILNS#HVNt\'VCOF6IP")), this.b.getBoolean(u("OLNB0RgSR/eMST6GLIT\u0011CR\\U#RMO")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("CLHJ1uGMF0GVRU")), this.b.getBoolean(u("OLNB0RgSR/UqXW#TCIH0")));
                  }
               }

               if(var3 instanceof jindent.java.a.b) {
                  if(((jindent.java.a.b)var3).d().d()) {
                     this.a(var2, var3, this.b.getString(u("UV\\S+EdTB.BQnB2GP\\S-T")), this.b.getBoolean(u("OLNB0RqIF6OA{N\'JFNt\'VCOF6IP")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("@KXK&UqXW#TCIH0")), this.b.getBoolean(u("OLNB0RdTB.BQnB2GP\\S-T")));
                  }
               }

               if(var3 instanceof p) {
                  if(((jindent.formatter.b.f)var3).a()) {
                     this.a(var2, var3, this.b.getString(u("HGNS\'BkSS\'TD\\D\'UqXW#TCIH0")), this.b.getBoolean(u("OLNB0RlXT6CFtI6CP[F!CQnB2GP\\S-T")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("OLIB0@C^B1uGMF0GVRU")), this.b.getBoolean(u("OLNB0RkSS\'TD\\D\'UqXW#TCIH0")));
                  }
               }

               if(var3 instanceof jindent.java.a.d) {
                  var5 = ((jindent.java.a.d)var3).a();
                  if(var5) {
                     this.a(var2, var3, this.b.getString(u("OOMH0Rhyl\u0011CR\\U#RMO")), this.b.getBoolean(u("OLNB0RkPW-TVwc\tuGMF0GVRU")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("OOMH0RlRI\bbinB2GP\\S-T")), this.b.getBoolean(u("OLNB0RkPW-TVsH,lfvt\'VCOF6IP")));
                  }
               }

               if(var3 instanceof jindent.java.a.h) {
                  var5 = this.b.getBoolean(u("OLNB0ReXS\u000fCVUH&UqXW#TCIH0")) || this.b.getBoolean(u("OLNB0RqXS\u000fCVUH&UqXW#TCIH0"));
                  var8 = ((jindent.java.a.h)var3).a();
                  var8 = j(var8);
                  if(var8 == 25 && var5) {
                     this.a(var2, var3, this.b.getString(u("AGIj\'RJRC1uGMF0GVRU")), this.b.getBoolean(u("OLNB0ReXS\u000fCVUH&UqXW#TCIH0")));
                  } else if(var8 == 26 && var5) {
                     this.a(var2, var3, this.b.getString(u("UGIj\'RJRC1uGMF0GVRU")), this.b.getBoolean(u("OLNB0RqXS\u000fCVUH&UqXW#TCIH0")));
                  } else {
                     this.a(var2, var3, this.b.getString(u("KGIO-BQnB2GP\\S-T")), this.b.getBoolean(u("OLNB0RoXS*IFNt\'VCOF6IP")));
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
      return var0 == null || var0 instanceof jindent.java.a.j || var0 instanceof jindent.formatter.e.i;
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, String var3) {
      this.a(var1, var2, var3, true);
   }

   protected void a(jindent.formatter.b.h var1, jindent.formatter.b.h var2, String var3, boolean var4) {
      if(var1 != null && !(var1 instanceof jindent.formatter.e.i)) {
         this.i(1);
      }

      if(!var3.equals("") && var4) {
         String var5 = u.a(this.V, this.b.getNumber(u("UGMF0GVRU\u0001IOPB,RnTI\'jGS@6N")), this.b.getString(u("UGMF0GVRU\u0001IOPB,RdTK.eJ\\U#EVXU1")), var3);
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
               k var4 = var5.q();
               this.a(var1, var4, var2 + u("\u0006\u0002\u001d"));
            }

            this.a(var5.f(), var5.o(), var5.i());
         }

      }
   }

   protected void a(q var1, q var2, boolean var3) {
      if(var1 != null || var2 != null) {
         if(var1 == null) {
            throw new RuntimeException(u("lCKF\u0012GPNB0\bARI4CPIs-MGST\u0004TMPs-MGSw0IFHD\'T\niH)CL\u0011\u0007\u0016IIXIk\u001c\u0002NS#TViH)CL\u001d\u001a\u007f\u0006LHK."));
         } else if(var2 == null) {
            throw new RuntimeException(u("lCKF\u0012GPNB0\bARI4CPIs-MGST\u0004TMPs-MGSw0IFHD\'T\niH)CL\u0011\u0007\u0016IIXIk\u001c\u0002XI&rMVB,\u0006\u001f\u0000\u0007,SNQ"));
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
      int var6;
      int var7;
      q var10;
      q var11;
      boolean var12;
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
            var10 = u.k(this.z)?this.z:u.g(this.z);
            if(!var10.f.equals("(") && !var10.f.equals("[") && !var10.f.equals("{")) {
               if(!this.b.getBoolean(u("EMPE+HGmF&BKS@\u0012GPXI6NGNB1"))) {
                  this.q();
               } else {
                  var11 = this.z;

                  for(var12 = false; var11 != null; var11 = var11.k) {
                     if(var11.a == -201 && var11.l == 1) {
                        var10 = u.g(var11);
                        if(var10 != null && !var10.f.equals(")")) {
                           int var13 = this.d - var10.e;
                           if(var13 > 1) {
                              var12 = true;
                              break;
                           }
                        }
                     }

                     if(u.k(var11) && !var11.f.equals(")")) {
                        var12 = false;
                        break;
                     }
                  }

                  if(!var12) {
                     this.q();
                  }
               }
            }
         }

         this.m(var2);
         break;
      case -200:
         if(var2.l == 1) {
            var10 = u.j(var2);
            if(var10.f.equals(")")) {
               if(!this.b.getBoolean(u("HMmF&BKS@\r@gPW6_r\\U\'HVUB1CQ"))) {
                  this.q();
               }
            } else if(var10.f.equals("]")) {
               if(!this.b.getBoolean(u("HMmF&BKS@\r@gPW6_`OF!MGIT"))) {
                  this.q();
               }
            } else if(var10.f.equals("}")) {
               if(!this.b.getBoolean(u("HMmF&BKS@\r@gPW6_`OF!CQtI\u000bHKIN#JKGB0U"))) {
                  this.q();
               }
            } else if(!this.b.getBoolean(u("EMPE+HGmF&BKS@\u0012GPXI6NGNB1"))) {
               this.q();
            } else {
               var11 = var2;
               var12 = false;

               while(var11 != null) {
                  var11 = var11.g;
                  if(var11.a == -200 && var11.l == 1) {
                     var10 = u.j(var11);
                     if(var10 != null && !var10.f.equals("(")) {
                        var12 = true;
                        break;
                     }
                  }

                  if(u.k(var11) && !var11.f.equals("(")) {
                     var12 = false;
                     break;
                  }
               }

               if(!var12) {
                  this.q();
               }
            }
         }

         this.m(var2);
         break;
      case -111:
         var6 = var2.l;
         if(this.V >= var6) {
            this.V -= var6;
         } else {
            this.V = 0;
         }

         var4 = (BracesSetting)var2.m;
         if(var4.getBoolean(u("HM\u007fK#HIqN,CQ|A6CPqB$R`OF!C"))) {
            this.T = Integer.MAX_VALUE;
         }

         var2 = null;
         break;
      case -104:
         if(this.V >= this.b.getNumber(u("OLYB,RqT]\'"))) {
            this.V -= this.b.getNumber(u("OLYB,RqT]\'"));
         } else {
            this.V = 0;
         }

         ++this.M;
         var2 = null;
         break;
      case -103:
         var10 = (q)var2.m;
         var7 = this.d - this.V;
         int var8 = this.b.getAbsoluteRelativeIndex(u("BGXW\u000bHFXI6`MOj7JVTW.CfXD.GP\\S+ILN"));
         boolean var9 = var8 == 0?var7 > this.b.getNumber(u("BGXW\u000bHFXI6`MOj7JVTW.CfXD.GP\\S+ILN")):this.d > this.b.getNumber(u("BGXW\u000bHFXI6`MOj7JVTW.CfXD.GP\\S+ILN"));
         if(var9) {
            this.r();
            this.V += this.b.getNumber(u("OLYB,RqT]\'"));
            var10.a = -104;
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
         this.d = this.b.getNumber(u("@KOT6jGKB.oLYB,R"));
         this.S = true;
         var2 = null;
         break;
      case -68:
         var10 = (q)var2.m;
         this.d = var10.c + var2.l;
         this.S = true;
         var2 = null;
         break;
      case -66:
         ++this.N;
         var2 = null;
         break;
      case -60:
         jindent.debugger.a.b(u("yarj\u000fclix\u000eolxx\u0004cgy\u001dbrJTTbECSI-R\u0002_BbTG\\D*CF\u001dN,\u0006GES0GAIs-MGSTj\u000f\u0002\u001c"));
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
         this.g(var4.getNumber(u("OLYB,Rc[S\'TpT@*R`OF!C")));
         var2 = null;
         break;
      case -40:
         var4 = (BracesSetting)var2.m;
         this.g(var4.getNumber(u("OLYB,RaHC&JGYe0GAXT")));
         var2 = null;
         break;
      case -39:
         var4 = (BracesSetting)var2.m;
         this.a(var4.getNumber(u("OLYB,RpT@*R`OF!C")), var4.getBoolean(u("TKZO6dP\\D\'hGJk+HG")));
         var2 = null;
         break;
      case -38:
         var4 = (BracesSetting)var2.m;
         if(!this.R) {
            this.g(var4.getNumber(u("OLYB,RnXA6dP\\D\'")));
         } else if(this.R && var4.getBoolean(u("JG[S\u0000TC^B\fCUqN,C"))) {
            this.V += var4.getNumber(u("OLYB,RnXA6dP\\D\'"));
            if(var2.g.g.a == -111) {
               var2.g.g.l = var4.getNumber(u("OLYB,RnXA6dP\\D\'"));
            } else {
               jindent.debugger.a.b(u("rMVB,\u0006}tk\u0000j`\u001dS0OGY\u00076I\u0002OB$CPXI!C\u0002IHbG\u0002IH)CL\u001dP*OAU\u0007+U\u0002SH6\u0006M[\u0007)OLY\u0007\u001don\u007fk\u0000y`|d\t\u0006\u0003"));
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
         var6 = var2.l;
         if(var6 == 1) {
            this.a(this.z, var6, this.M, new jindent.formatter.d.j(this.z, this.b.getBoolean(u("GNT@,bG^K#TCIN-HQ")) && this.b.getBoolean(u("GNT@,cZ^B\'BKS@\u0006CAQF0GVTH,U"))));
         }

         if(var6 == 2) {
            this.a(this.z, var6, this.N, new jindent.formatter.d.j(this.z, this.b.getBoolean(u("GNT@,gQNN%HOXI6U")) && this.b.getBoolean(u("GNT@,cZ^B\'BKS@\u0003UQT@,KGSS1"))));
         }

         if(var6 == 3) {
            this.a(this.z, var6, this.P, new jindent.formatter.d.j(this.z, this.b.getBoolean(u("GNT@,gLSH6GVTH,bG[F7JVN")) && this.b.getBoolean(u("GNT@,cZ^B\'BKS@\u0003HLRS#RKRI\u0006CD\\R.RQ"))));
         }

         if(var6 == 4) {
            this.a(this.z, var6, this.M, new jindent.formatter.d.j(this.z, this.b.getBoolean(u("GNT@,vCOF/CVXU\u0006CAQF0GVTH,U")) && this.b.getBoolean(u("GNT@,cZ^B\'BKS@\u0012GP\\J\'RGOc\'EN\\U#RKRI1"))));
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
      case -8:
         this.m = (jindent.formatter.e.a.a.b)var2.m;
         if(this.b.getBoolean(u("UMOS\u0007^AXW6OMST\u000bHvXJ2JCIB1"))) {
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
         if(var4.getBoolean(u("TKZO6dP\\D\'hGJk+HG"))) {
            this.r();
         }

         var2 = null;
         break;
      case -3:
         var4 = (BracesSetting)var2.m;
         if(var4.getBoolean(u("JG[S\u0000TC^B\fCUqN,C"))) {
            this.r();
         }

         var2 = null;
         break;
      case -1:
         this.r();
         var2 = null;
         break;
      case 0:
         if(!this.b.a.n(var2)) {
            if(this.b.getFooterIndex(u("@MRS\'TkST\'TVTH,kMYB")) != 0) {
               this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CdRH6CP")));
               this.g();
               this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0`MRS\'T")));
            }
         } else {
            this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CdRH6CP")));
            this.m(var2, true);
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0`MRS\'T")));
         }

         var2 = null;
         break;
      case 4001:
         if(var2.h == null) {
            if(this.b.getHeaderIndex(u("NG\\C\'TkST\'TVTH,kMYB")) != 0) {
               this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CjXF&CP")));
               this.f();
               this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0nG\\C\'T")));
            }
         } else {
            this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CjXF&CP")));
            this.m(var2, true);
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0nG\\C\'T")));
         }

         var2 = null;
         break;
      default:
         var10 = u.j(var2);
         var7 = this.F == null?0:this.F.a();
         if(this.b.a.p(var2) && (var7 == 1 || var7 == 2 || var7 == 6 || var7 == 7 || var7 == 8 || var7 == 37 || u.b(var7) || var7 == 13 || var7 == 36 || var7 == 21 || var7 == 22 || var7 == 23 || var7 == 24 || var7 == 0)) {
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

         if(var10 != null) {
            this.g(var10.h);
         }
      }

   }

   protected void l() {
      this.c(this.y, (q)null);
   }

   protected void c(q var1, q var2) {
      this.v = true;
      q var3 = var1;

      do {
         switch(var3.a) {
         case -55:
            var3 = this.n(var3);
            break;
         default:
            var3 = var3.g;
         }
      } while(var3 != var2 && var3 != null);

   }

   protected q n(q var1) {
      q var2 = u.a((q)var1, -56, var1.l);
      this.c(var1.g, var2.k);
      q var3 = u.j(var1);
      int var4 = u.a(var1, var2, -25) - 1;
      int var5 = u.a(var1, var3, -25) - 1;
      BracesSetting var6 = (BracesSetting)var1.m;
      if(var4 >= var6.getNumber(u("KKSk+HGNs-oLNB0R`QF,MnTI\'gDIB0jG[S\u0000TC^B")) && !var6.getBoolean(u("HM\u007fK#HIqN,CQ|A6CPqB$R`OF!C")) && var5 < 1) {
         u.b(var1);
      }

      q var7 = u.j(var2);
      q var8 = u.g(var2);
      q var9 = u.j(var7);
      var5 = u.a(var8, var7, -25) - 1;
      if(var9 != null && var9.f.equals(",")) {
         var9 = u.j(var9);
      }

      if(var4 >= var6.getNumber(u("KKSk+HGNs-oLNB0R`QF,MnTI\'dG[H0CpT@*R`OF!C")) && var5 < 1) {
         boolean var10 = var9 == null || var9 != null && (u.c(var7, var9, -25) || var9.f.equals(";"));
         if(var10) {
            if(!var6.getBoolean(u("BMsH6oLNB0R`XA-TGnN,ANXu+AJIe0GAX"))) {
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
         this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CqIF6COXI6UaRI6GKSN,A`QH!MQ")));
      }

      if(var3 != 0 && var4 == 9) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0C`OB#MqIF6COXI6U")));
      }

      if(var3 != 0 && var4 == 10) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CaRI6OLHB\u0011RCIB/CLIT")));
      }

      if(var3 != 0 && var4 == 12) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CvUU-QqIF6COXI6U")));
      }

      if(var3 != 0 && var4 == 11) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CpXS7TLnS#RGPB,RQ")));
      }

      if(var3 != 0 && var4 == 35) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1dGIP\'CLxI7KgQB/CLIT\u0003HF~K#UQ\u007fH&_")));
      }

      if(var3 != 0 && u.c(var3) && this.G.b()) {
         this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0uV\\S\'KGSS1eMSS#OLTI%dNRD)U")));
      }

      if(var4 != var3 || var4 != 1 && var4 != 2 && !u.b(var4) && var4 != 13 && var4 != 36 && var4 != 21 && var4 != 22 && var4 != 23 && var4 != 24) {
         ++this.M;
         ++this.N;
         ++this.P;
         if(var4 != var3 && u.c(var3) && !u.b(var3) && u.c(var4) && !u.b(var4) && !var1.b() && !this.G.b()) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1dGIP\'CLyN$@GOB,RqIF6COXI6U")));
         }

         if(var3 != 0 && var4 == 13) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1dG[H0CnRD#Jt\\U+G@QB1")));
         }

         if(var3 == 13) {
            this.i(this.b.getNumber(u("DN\\I)jKSB1gDIB0jM^F.pCON#DNXT")));
         }
      }

      if(!this.o.k()) {
         this.G = (jindent.formatter.j)this.o.j();
      } else {
         this.G = null;
      }

      this.o.f(var1);
   }

   private static int c(int var0, int var1) {
      return var0 > var1?var0:var1;
   }

   protected void x() {
      try {
         this.G = (jindent.formatter.j)this.o.i();
      } catch (Exception var2) {
         jindent.debugger.a.b(u("aP\\J/GP\u001dt6GAV\u00077HFXU0SL\u001d\u0006"));
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
      this.a(1, this.b.getBoolean(u("GNT@,bG^K#TCIN-HQ")), this.b.getBoolean(u("OLYB,RfXD.GP\\S+ILNe;rC_T")));
      this.b.a.a(this.b);
      this.a(2, this.b.getBoolean(u("GNT@,gQNN%HOXI6U")), this.b.getBoolean(u("OLYB,RcNT+ALPB,RQ\u007f^\u0016G@N")));
      this.b.a.a(this.b);
      this.a(3, this.b.getBoolean(u("GNT@,gLSH6GVTH,bG[F7JVN")), this.b.getBoolean(u("OLYB,RcSI-RCIN-HfXA#SNIT\u0000_v\\E1")));
      this.b.a.a(this.b);
   }

   protected void i() {
      this.b.a.a(this.b);
      this.a(4, this.b.getBoolean(u("GNT@,vCOF/CVXU\u0006CAQF0GVTH,U")), this.b.getBoolean(u("OLYB,Rr\\U#KGIB0bG^K#TCIN-HQ\u007f^\u0016G@N")));
      this.b.a.a(this.b);
      this.a(0, this.b.getBoolean(u("GNT@,eMPJ\'HVN")), this.b.getBoolean(u("OLYB,RaRJ/CLIT\u0000_v\\E1")));
      this.b.a.a(this.b);
   }

   protected boolean a(int var1, q var2) {
      return var2.a == -28 && this.b.getBoolean(u("OLYB,RaRJ/CLIT\u0000_v\\E1")) && var1 > 0 || var2.a == 5000 && this.b.getBoolean(u("OLYB,RfXD.GP\\S+ILNe;rC_T")) || var2.a == 5001 && this.b.getBoolean(u("OLYB,RcNT+ALPB,RQ\u007f^\u0016G@N")) || var2.a == 5005 && this.b.getBoolean(u("OLYB,RcSI-RCIN-HfXA#SNIT\u0000_v\\E1")) || var2.a == 5006 && this.b.getBoolean(u("OLYB,Rr\\U#KGIB0bG^K#TCIN-HQ\u007f^\u0016G@N"));
   }

   protected String[] j() {
      return new String[]{u("\t\b\u0017"), u("\t\r"), u("\t\b")};
   }

   private static String u(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 38;
            break;
         case 1:
            var10003 = 34;
            break;
         case 2:
            var10003 = 61;
            break;
         case 3:
            var10003 = 39;
            break;
         default:
            var10003 = 66;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
