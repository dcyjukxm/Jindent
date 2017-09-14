package jindent.formatter.d.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.u;
import jindent.formatter.d.a.b;
import jindent.formatter.d.a.c;
import jindent.formatter.d.a.d;

public class e {
   private List a = new ArrayList();

   public void a(jindent.formatter.d.a.a var1) {
      this.a.add(var1);
   }

   public void a() {
      this.a.clear();
   }

   public int b() {
      return this.a.size();
   }

   public jindent.formatter.d.a.a a(int var1) {
      return (jindent.formatter.d.a.a)this.a.get(var1);
   }

   public void c() {
      jindent.formatter.d.a.a var1 = null;
      d var2 = null;
      int var3 = 0;

      for(int var4 = 0; var4 < this.a.size(); ++var4) {
         var1 = (jindent.formatter.d.a.a)this.a.get(var4);
         if(var1 instanceof d) {
            d var5 = (d)var1;
            if(var2 != null) {
               q var6 = var2.c();
               q var7 = var5.b();
               boolean var8 = u.c(var6, var7) || var2.h();
               if(var8) {
                  ++var3;
               }
            }

            var5.a(var3);
            var2 = var5;
         }
      }

   }

   public void a(Context var1) {
      jindent.formatter.d.a.a var3;
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         var3 = (jindent.formatter.d.a.a)this.a.get(var2);
         if(var3 instanceof d) {
            d var4 = (d)var3;
            int var5 = var4.d();
            int var6 = var5 - var1.getNumber(a("A5yHF\\\btWM"));
            if(var6 > 0) {
               u.d(var3.b(), var3.c(), var6);
            }
         }
      }

      d var8 = null;
      var3 = null;

      for(int var10 = this.a.size() - 1; var10 >= 0; --var10) {
         jindent.formatter.d.a.a var11 = (jindent.formatter.d.a.a)this.a.get(var10);
         if(var11 instanceof d) {
            d var9 = var8;
            var8 = (d)var11;
            boolean var12 = var9 != null && var9.g() == var8.g();
            if(var12) {
               int var7 = var9.f().c - var1.getNumber(a("A5yHF\\\btWM")) - var8.f().c;
               if(var7 != 0) {
                  u.d(var8.b(), var8.c(), var7);
               }
            }
         }
      }

   }

   public void d() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         jindent.formatter.d.a.a var2 = (jindent.formatter.d.a.a)this.a.get(var1);
         if(!(var2 instanceof d) && !(var2 instanceof c) && !(var2 instanceof b)) {
            int var3 = var2.d();
            if(var3 > 0) {
               u.d(var2.b(), var2.c(), var3);
            }
         }
      }

   }

   public void b(Context var1) {
      HashMap var2 = new HashMap();

      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         jindent.formatter.d.a.a var4 = (jindent.formatter.d.a.a)this.a.get(var3);
         int var5;
         if(var4 instanceof d) {
            var5 = var4.e();
            var2.put(Integer.valueOf(var5), var4);
         } else if(var4 instanceof c || var4 instanceof b) {
            var5 = var4.e();
            jindent.formatter.d.a.a var6 = (jindent.formatter.d.a.a)var2.get(Integer.valueOf(var5));
            if(var6 == null) {
               throw new IllegalStateException(a("k:sCG\\{{DFL{oHNM)xCKM{{BZ\b9qBKC{qH^M7\'\r") + var5);
            }

            q var7 = u.j(var4.b());
            q var8 = u.j(var6.b());
            int var9 = var8.c - var7.c;
            if(var9 > 0) {
               u.d(var4.b(), var4.c(), var9);
            }
         }
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
            var10003 = 40;
            break;
         case 1:
            var10003 = 91;
            break;
         case 2:
            var10003 = 29;
            break;
         case 3:
            var10003 = 45;
            break;
         default:
            var10003 = 40;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
