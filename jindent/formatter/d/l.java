package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.d.j;
import jindent.formatter.d.k;
import jindent.util.MyVector;

public class l implements s {
   public static final int GROUP_COMMENTS = 0;
   public static final int GROUP_DECLARATIONS = 1;
   public static final int GROUP_ASSIGNMENTS = 2;
   public static final int GROUP_METADATA_DEFAULTS = 3;
   public static final int GROUP_PARAMETER_DECLARATIONS = 4;
   public static final int GROUP_BIT_FIELDS = 5;
   private int a;
   private int b;
   private MyVector c = new MyVector();

   public l(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public static String a(int var0, int var1) {
      return Long.toHexString((long)var0 << 32 | (long)var1);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int a(Context var1, boolean var2, boolean[] var3) {
      int var4 = -1;

      for(int var5 = 0; var5 < this.c.c(); ++var5) {
         if(!var3[var5]) {
            k var6 = (k)this.c.d(var5);
            j var7 = var6.a();
            if(var4 < var7.b()) {
               var4 = var7.b();
            }
         }
      }

      return var4;
   }

   private static boolean[] a(int var0) {
      boolean[] var1 = new boolean[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = false;
      }

      return var1;
   }

   public void a(Context var1, boolean var2, boolean var3) {
      int var4 = this.c.c();
      boolean[] var5 = a(var4);

      int var6;
      do {
         var6 = this.b(var1, var2, var3, var5);
         if(var6 != -1) {
            var5[var6] = true;
         }
      } while(var6 != -1);

      boolean var7 = true;

      for(int var8 = 0; var8 < this.c.c(); ++var8) {
         if(!var5[var8]) {
            k var9 = (k)this.c.d(var8);
            j var10 = var9.a();
            System.out.println(a("~\u000er&=<\bz#&q\u0005/o") + var10.b());
         }
      }

   }

   public void b(Context var1, boolean var2, boolean var3) {
      int var4 = this.c.c();
      boolean[] var5 = a(var4);

      int var6;
      do {
         var6 = this.b(var1, var2, var3, var5);
         if(var6 != -1) {
            var5[var6] = true;
         }
      } while(var6 != -1);

      this.a(var1, var2, var3, var5);
   }

   private void a(Context var1, boolean var2, boolean var3, boolean[] var4) {
      int var5 = this.a(var1, var3, var4);
      int var6 = this.c.c();

      for(int var7 = 0; var7 < var6; ++var7) {
         k var8 = (k)this.c.d(var7);
         j var9 = var8.a();
         q var10 = var8.b().g;
         int var12 = var9.b();
         int var11;
         if(!var2) {
            var11 = var12;
         } else {
            var11 = var5 != -1 && var12 <= var5?var5:var12;
            if(var4[var7]) {
               var11 = var12;
            }
         }

         var8.a(var1, this.a, var12, var11, var3);
      }

   }

   private int b(Context var1, boolean var2, boolean var3, boolean[] var4) {
      int var5 = this.c.c();
      int var6 = this.a(var1, var3, var4);

      for(int var7 = 0; var7 < var5; ++var7) {
         if(!var4[var7]) {
            k var8 = (k)this.c.d(var7);
            j var9 = var8.a();
            q var10 = var8.b().g;
            int var12 = var9.b();
            if(var2) {
               int var11 = var6 != -1 && var12 <= var6?var6:var12;
               boolean var13 = var9.a();
               int var14 = var9.c() + a(var1, this.a, var12, var11, var3);
               if(var14 > var1.getNumber(a("q\nm\u0003:r\u000eY*={\u001f}")) && var1.getBoolean(a("k\u0019t?\u001fu\u0005p<")) && !var13) {
                  return var7;
               }
            }
         }
      }

      return -1;
   }

   public void a(q var1, j var2) {
      k var3 = new k(var1, var2);
      this.c.d(var3);
   }

   public static int a(Context var0, int var1, int var2, int var3, boolean var4) {
      int var5 = 0;
      switch(var1) {
      case 0:
         var5 = var3 + var0.getNumber(a("q\u0002{&>i\u0006V >q\u000e{;\u001ar\u000fp!\'"));
         break;
      case 1:
         var5 = var3;
         break;
      case 2:
         var5 = var3;
         break;
      case 3:
         var5 = var3;
         break;
      case 4:
         var5 = var3;
         break;
      case 5:
         var5 = var3;
      }

      if(var4) {
         int var6 = var0.getNumber(a("h\nw:?}\u001fz=\u0000u\u0011p"));
         var5 = (var5 + var6 - 1) / var6 * var6;
      }

      return var5 - var2;
   }

   public int c() {
      return this.c.c();
   }

   public k b(int var1) {
      return (k)this.c.d(var1);
   }

   public void a(k var1) {
      this.c.d(var1);
   }

   public void c(int var1) {
      this.c.e(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 28;
            break;
         case 1:
            var10003 = 107;
            break;
         case 2:
            var10003 = 21;
            break;
         case 3:
            var10003 = 79;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
