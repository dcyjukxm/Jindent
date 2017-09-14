package jindent.formatter.e;

import jindent.formatter.Context;
import jindent.formatter.p;
import jindent.formatter.q;
import jindent.formatter.u;
import jindent.formatter.e.f;

public class g extends f {
   private q j = null;
   private q k = null;

   public g(Context var1) {
      super(var1.getNumber(b("@2=WjT\u00197WjE);Lau03Q{k26F")), var1.getString(b("@2=WjT\u00197WjE);Lao31OzB8\u0019FvU")), var1.getString(b("@2=WjT\u00197WjE);Lac%1OzB8\u0019FvU")));
      this.a(var1);
   }

   public boolean a(q var1) {
      if(var1 == null) {
         return false;
      } else {
         q var2 = u.H(var1);
         q var3 = u.d(var2, this.d);
         if(var3 != null) {
            var3 = var3.h;
         }

         q var4 = var1;
         int var5 = 0;
         byte var6 = 0;
         q var7 = null;
         q var8 = null;

         for(boolean var9 = false; var4 != var3 && !u.t(var4); var4 = var4.h) {
            boolean var10 = this.d.a.b(var4) || this.d.a.c(var4) || this.d.a.d(var4);
            if(var10) {
               if(this.k == null) {
                  this.k = var4;
                  var7 = var4;
               } else {
                  boolean var11 = var9 || var4.a != this.k.a;
                  if(var11) {
                     if(var6 != 0) {
                        if(this.d.a.g(this.k)) {
                           this.j = var8;
                           break;
                        }

                        if(this.d.a.g(this.k.g)) {
                           this.j = var8;
                           this.k = this.k.g;
                           break;
                        }
                     } else {
                        this.k = var4;
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
            this.k = var7;
         }

         if(var6 != 0 && this.j == null) {
            this.j = var8;
         }

         return var6 != 0;
      }
   }

   public q a() {
      return this.j;
   }

   public q b() {
      return this.k;
   }

   private static String b(String var0) {
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
            var10003 = 93;
            break;
         case 2:
            var10003 = 82;
            break;
         case 3:
            var10003 = 35;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
