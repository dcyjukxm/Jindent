package jindent.formatter.e;

import jindent.formatter.Context;
import jindent.formatter.p;
import jindent.formatter.q;
import jindent.formatter.u;

public class f {
   protected static final int a = 0;
   protected static final int b = 1;
   protected static final int c = 2;
   protected Context d;
   private q e;
   private q f;
   protected int g;
   protected String h;
   protected String i;

   protected f(int var1, String var2, String var3) {
      this.e = null;
      this.f = null;
      this.g = var1;
      this.h = var2;
      this.i = var3;
   }

   public f(Context var1) {
      this(var1.getNumber(a("\u0011\u000bq1f\u000b*u!f\u001a\u001ay:m*\u0003q\'w4\u0001t0")), var1.getString(a("\u0011\u000bq1f\u000b*u!f\u001a\u001ay:m0\u0000s9v\u001d\u000b[0z\n")), var1.getString(a("\u0011\u000bq1f\u000b*u!f\u001a\u001ay:m<\u0016s9v\u001d\u000b[0z\n")));
      this.a(var1);
   }

   public boolean a(q var1) {
      q var2 = u.H(var1);
      q var3 = u.d(var2, this.d);
      q var4 = var3;
      int var5 = 0;
      byte var6 = 0;
      q var7 = null;
      q var8 = null;

      for(boolean var9 = false; var4 != null && !u.t(var4); var4 = var4.g) {
         boolean var10 = this.d.a.b(var4) || this.d.a.c(var4) || this.d.a.d(var4);
         if(var10) {
            if(this.e == null) {
               this.e = var4;
               var7 = var4;
            } else {
               boolean var11 = var9 || var4.a != this.e.a;
               if(var11) {
                  if(var6 != 0) {
                     if(this.d.a.g(var8)) {
                        this.f = var8;
                        break;
                     }

                     if(this.d.a.g(var8.g)) {
                        this.f = var8.g;
                        break;
                     }
                  } else {
                     this.e = var4;
                  }
               }
            }

            var9 = false;
            jindent.util.d var12 = new jindent.util.d(var4.f);
            var5 += var12.a();
            if(var5 >= this.g) {
               var6 = 1;
            }

            if(p.a(var4.f, this.h) && p.b(var4.f, this.i)) {
               var6 = 2;
            }

            var8 = var4;
         } else if(this.d.a.g(var4.h) && this.d.a.h(var4)) {
            var9 = true;
         }
      }

      if(var6 == 1) {
         this.e = var7;
      }

      if(var6 != 0 && this.f == null) {
         this.f = var8;
      }

      if(var6 != 0) {
         this.e = var7;
      }

      return var6 != 0;
   }

   public void a(Context var1) {
      this.d = var1;
   }

   public q a() {
      return this.e;
   }

   public q b() {
      return this.f;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 121;
            break;
         case 1:
            var10003 = 110;
            break;
         case 2:
            var10003 = 16;
            break;
         case 3:
            var10003 = 85;
            break;
         default:
            var10003 = 3;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
