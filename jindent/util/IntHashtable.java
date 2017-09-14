package jindent.util;

import java.io.Serializable;

public final class IntHashtable implements Serializable {
   private Object a = null;
   private int b;
   private static final float c = 0.4F;
   private int d;
   private static final float e = 0.0F;
   private int f;
   private int g;
   private Object[] h;
   private int[] i;
   private static final int j = Integer.MIN_VALUE;
   private static final int k = -2147483647;
   private static final int l = -2147483647;
   private static final int[] m = new int[]{17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, '考', 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, Integer.MAX_VALUE};

   public IntHashtable() {
      this.c(3);
   }

   public IntHashtable(int var1) {
      this.c(e((int)((float)var1 / 0.4F)));
   }

   public int a() {
      return this.g;
   }

   public boolean b() {
      return this.g == 0;
   }

   public void a(int var1, Object var2) {
      if(this.g > this.d) {
         this.f();
      }

      int var3 = this.d(var1);
      if(this.i[var3] <= -2147483647) {
         this.i[var3] = var1;
         ++this.g;
      }

      this.h[var3] = var2;
   }

   public Object a(int var1) {
      return this.h[this.d(var1)];
   }

   public void b(int var1) {
      int var2 = this.d(var1);
      if(this.i[var2] > -2147483647) {
         this.i[var2] = -2147483647;
         this.h[var2] = this.a;
         --this.g;
         if(this.g < this.f) {
            this.f();
         }
      }

   }

   public Object c() {
      return this.a;
   }

   public void a(Object var1) {
      this.a = var1;
      this.f();
   }

   public boolean equals(Object var1) {
      if(var1.getClass() != this.getClass()) {
         return false;
      } else {
         IntHashtable var2 = (IntHashtable)var1;
         if(var2.a() == this.g && var2.a.equals(this.a)) {
            for(int var3 = 0; var3 < this.i.length; ++var3) {
               int var4 = this.i[var3];
               if(var4 > -2147483647 && !var2.a(var4).equals(this.h[var3])) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public int d() {
      int var1 = this.i.length;
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         if(this.i[var3] != -2147483647) {
            ++var2;
         }
      }

      return var2;
   }

   public int[] e() {
      int var1 = this.d();
      int var2 = this.i.length;
      int[] var3 = new int[var1];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = this.i[var5];
         if(var6 != -2147483647) {
            var3[var4] = var6;
            ++var4;
         }
      }

      return var3;
   }

   public Object clone() throws CloneNotSupportedException {
      IntHashtable var1 = (IntHashtable)super.clone();
      this.h = (Object[])((Object[])this.h.clone());
      this.i = (int[])((int[])this.i.clone());
      return var1;
   }

   private void c(int var1) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= m.length) {
         System.out.println(a("$,xXV9$"));
         var1 = m.length - 1;
      }

      this.b = var1;
      int var2 = m[var1];
      this.h = new Object[var2];
      this.i = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.i[var3] = Integer.MIN_VALUE;
         this.h[var3] = this.a;
      }

      this.g = 0;
      this.f = (int)((float)var2 * 0.0F);
      this.d = (int)((float)var2 * 0.4F);
   }

   private void f() {
      Object[] var1 = this.h;
      int[] var2 = this.i;
      int var3 = this.b;
      if(this.g > this.d) {
         ++var3;
      } else if(this.g < this.f) {
         var3 -= 2;
      }

      this.c(var3);

      for(int var4 = var1.length - 1; var4 >= 0; --var4) {
         int var5 = var2[var4];
         if(var5 > -2147483647) {
            this.b(var5, var1[var4]);
         }
      }

   }

   public void b(int var1, Object var2) {
      int var3 = this.d(var1);
      if(this.i[var3] < -2147483647) {
         this.i[var3] = var1;
         ++this.g;
      }

      this.h[var3] = var2;
   }

   private int d(int var1) {
      if(var1 <= -2147483647) {
         throw new IllegalArgumentException(a("\u001b\u0006NXw\u0011\r\u0010\f4\u0012\u0006\u0017\u0014q\u0003\u0010\u0017\f|\u0011\r\u0017Hl6%q>R6%r"));
      } else {
         int var2 = -1;
         int var3 = (var1 ^ 67108864) % this.i.length;
         if(var3 < 0) {
            var3 = -var3;
         }

         int var4 = 0;

         while(true) {
            int var5 = this.i[var3];
            if(var5 == var1) {
               return var3;
            }

            if(var5 <= -2147483647) {
               if(var5 == Integer.MIN_VALUE) {
                  if(var2 >= 0) {
                     var3 = var2;
                  }

                  return var3;
               }

               if(var2 < 0) {
                  var2 = var3;
               }
            }

            if(var4 == 0) {
               var4 = var1 % (this.i.length - 1);
               if(var4 < 0) {
                  var4 = -var4;
               }

               ++var4;
            }

            var3 = (var3 + var4) % this.i.length;
         }
      }
   }

   private static int e(int var0) {
      int var1;
      for(var1 = 0; var1 < m.length && var0 >= m[var1]; ++var1) {
         ;
      }

      return var1 == 0?0:var1 - 1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 112;
            break;
         case 1:
            var10003 = 99;
            break;
         case 2:
            var10003 = 55;
            break;
         case 3:
            var10003 = 120;
            break;
         default:
            var10003 = 20;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
