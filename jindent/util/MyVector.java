package jindent.util;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import jindent.util.f;

public class MyVector implements Cloneable, Serializable {
   protected Object[] a;
   protected int b;
   protected int c;
   private static final long serialVersionUID = -2767605614048989439L;

   public MyVector(int var1, int var2) {
      this.a = new Object[var1];
      this.c = var2;
   }

   public MyVector(int var1) {
      this(var1, 0);
   }

   public MyVector() {
      this(10);
   }

   public final void a(Object[] var1) {
      for(int var2 = this.b; var2-- > 0; var1[var2] = this.a[var2]) {
         ;
      }

   }

   public final void a() {
      int var1 = this.a.length;
      if(this.b < var1) {
         Object[] var2 = this.a;
         this.a = new Object[this.b];
         System.arraycopy(var2, 0, this.a, 0, this.b);
      }

   }

   public final void a(int var1) {
      if(var1 > this.a.length) {
         this.b(var1);
      }

   }

   private void b(int var1) {
      int var2 = this.a.length;
      Object[] var3 = this.a;
      int var4 = this.c > 0?var2 + this.c:var2 * 2;
      if(var4 < var1) {
         var4 = var1;
      }

      this.a = new Object[var4];
      System.arraycopy(var3, 0, this.a, 0, this.b);
   }

   public final void c(int var1) {
      if(var1 > this.b && var1 > this.a.length) {
         this.b(var1);
      } else {
         for(int var2 = var1; var2 < this.b; ++var2) {
            this.a[var2] = null;
         }
      }

      this.b = var1;
   }

   public final int b() {
      return this.a.length;
   }

   public final int c() {
      return this.b;
   }

   public final boolean d() {
      return this.b == 0;
   }

   public final Enumeration e() {
      return new f(this);
   }

   public final boolean a(Object var1) {
      return this.a(var1, 0) >= 0;
   }

   public final int b(Object var1) {
      return this.a(var1, 0);
   }

   public final int a(Object var1, int var2) {
      for(int var3 = var2; var3 < this.b; ++var3) {
         if(var1.equals(this.a[var3])) {
            return var3;
         }
      }

      return -1;
   }

   public final int c(Object var1) {
      return this.b(var1, this.b - 1);
   }

   public final int b(Object var1, int var2) {
      for(int var3 = var2; var3 >= 0; --var3) {
         if(var1.equals(this.a[var3])) {
            return var3;
         }
      }

      return -1;
   }

   public final Object d(int var1) {
      if(var1 >= this.b) {
         throw new ArrayIndexOutOfBoundsException(var1 + a("Gv2m") + this.b);
      } else {
         try {
            return this.a[var1];
         } catch (ArrayIndexOutOfBoundsException var3) {
            throw new ArrayIndexOutOfBoundsException(var1 + a("Gt/}"));
         }
      }
   }

   public final Object f() {
      if(this.b == 0) {
         throw new NoSuchElementException();
      } else {
         return this.a[0];
      }
   }

   public final Object g() {
      if(this.b == 0) {
         throw new NoSuchElementException();
      } else {
         return this.a[this.b - 1];
      }
   }

   public final void c(Object var1, int var2) {
      if(var2 >= this.b) {
         throw new ArrayIndexOutOfBoundsException(var2 + a("Gv2m") + this.b);
      } else {
         this.a[var2] = var1;
      }
   }

   public final void e(int var1) {
      if(var1 >= this.b) {
         throw new ArrayIndexOutOfBoundsException(var1 + a("Gv2m") + this.b);
      } else if(var1 < 0) {
         throw new ArrayIndexOutOfBoundsException(var1);
      } else {
         int var2 = this.b - var1 - 1;
         if(var2 > 0) {
            System.arraycopy(this.a, var1 + 1, this.a, var1, var2);
         }

         --this.b;
         this.a[this.b] = null;
      }
   }

   public final void d(Object var1, int var2) {
      int var3 = this.b + 1;
      if(var2 >= var3) {
         throw new ArrayIndexOutOfBoundsException(var2 + a("Gv/") + this.b);
      } else {
         if(var3 > this.a.length) {
            this.b(var3);
         }

         System.arraycopy(this.a, var2, this.a, var2 + 1, this.b - var2);
         this.a[var2] = var1;
         ++this.b;
      }
   }

   public final void d(Object var1) {
      int var2 = this.b + 1;
      if(var2 > this.a.length) {
         this.b(var2);
      }

      this.a[this.b++] = var1;
   }

   public final boolean e(Object var1) {
      int var2 = this.b(var1);
      if(var2 >= 0) {
         this.e(var2);
         return true;
      } else {
         return false;
      }
   }

   public final void h() {
      for(int var1 = 0; var1 < this.b; ++var1) {
         this.a[var1] = null;
      }

      this.b = 0;
   }

   public Object clone() {
      try {
         MyVector var1 = (MyVector)super.clone();
         var1.a = new Object[this.b];
         System.arraycopy(this.a, 0, var1.a, 0, this.b);
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final String toString() {
      int var1 = this.c() - 1;
      StringBuffer var2 = new StringBuffer();
      Enumeration var3 = this.e();
      var2.append("[");

      for(int var4 = 0; var4 <= var1; ++var4) {
         String var5 = var3.nextElement().toString();
         var2.append(var5);
         if(var4 < var1) {
            var2.append(a("Kh"));
         }
      }

      var2.append("]");
      return var2.toString();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 103;
            break;
         case 1:
            var10003 = 72;
            break;
         case 2:
            var10003 = 15;
            break;
         case 3:
            var10003 = 77;
            break;
         default:
            var10003 = 76;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
