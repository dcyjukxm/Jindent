package jindent.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class MyStringBuffer implements Serializable {
   private char[] a;
   private int b;
   private boolean c;
   static final long serialVersionUID = 3388685877147921107L;

   public MyStringBuffer() {
      this(16);
   }

   public MyStringBuffer(int var1) {
      this.a = new char[var1];
      this.c = false;
   }

   public MyStringBuffer(String var1) {
      this(var1.length() + 16);
      this.a(var1);
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.a.length;
   }

   private final void c() {
      char[] var1 = new char[this.a.length];
      System.arraycopy(this.a, 0, var1, 0, this.b);
      this.a = var1;
      this.c = false;
   }

   public void a(int var1) {
      if(var1 > this.a.length) {
         this.b(var1);
      }

   }

   private void b(int var1) {
      int var2 = (this.a.length + 1) * 2;
      if(var1 > var2) {
         var2 = var1;
      }

      char[] var3 = new char[var2];
      System.arraycopy(this.a, 0, var3, 0, this.b);
      this.a = var3;
      this.c = false;
   }

   public void c(int var1) {
      if(var1 < 0) {
         throw new StringIndexOutOfBoundsException(var1);
      } else {
         if(var1 > this.a.length) {
            this.b(var1);
         }

         if(this.b < var1) {
            if(this.c) {
               this.c();
            }

            while(this.b < var1) {
               this.a[this.b] = 0;
               ++this.b;
            }
         } else {
            this.b = var1;
            if(this.c) {
               this.c();
            }
         }

      }
   }

   public char d(int var1) {
      if(var1 >= 0 && var1 < this.b) {
         return this.a[var1];
      } else {
         throw new StringIndexOutOfBoundsException(var1);
      }
   }

   public void a(int var1, int var2, char[] var3, int var4) {
      if(var1 >= 0 && var1 < this.b) {
         if(var2 >= 0 && var2 <= this.b) {
            if(var1 < var2) {
               System.arraycopy(this.a, var1, var3, var4, var2 - var1);
            } else if(var1 > var2) {
               throw new StringIndexOutOfBoundsException(b("]h&\u0012_i^!\u001dWknz\u001cTz_<\u001aC}4}A\u0011ly3\u0012_.\"t\u001e_j"));
            }

         } else {
            throw new StringIndexOutOfBoundsException(var2);
         }
      } else {
         throw new StringIndexOutOfBoundsException(var1);
      }
   }

   public void a(int var1, char var2) {
      if(var1 >= 0 && var1 < this.b) {
         if(this.c) {
            this.c();
         }

         this.a[var1] = var2;
      } else {
         throw new StringIndexOutOfBoundsException(var1);
      }
   }

   public MyStringBuffer a(Object var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(String var1) {
      if(var1 == null) {
         var1 = String.valueOf(var1);
      }

      int var2 = var1.length();
      int var3 = this.b + var2;
      if(var3 > this.a.length) {
         this.b(var3);
      }

      var1.getChars(0, var2, this.a, this.b);
      this.b = var3;
      return this;
   }

   public MyStringBuffer a(char[] var1) {
      int var2 = var1.length;
      int var3 = this.b + var2;
      if(var3 > this.a.length) {
         this.b(var3);
      }

      System.arraycopy(var1, 0, this.a, this.b, var2);
      this.b = var3;
      return this;
   }

   public MyStringBuffer a(char[] var1, int var2, int var3) {
      int var4 = this.b + var3;
      if(var4 > this.a.length) {
         this.b(var4);
      }

      System.arraycopy(var1, var2, this.a, this.b, var3);
      this.b = var4;
      return this;
   }

   public MyStringBuffer a(boolean var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(char var1) {
      int var2 = this.b + 1;
      if(var2 > this.a.length) {
         this.b(var2);
      }

      this.a[this.b++] = var1;
      return this;
   }

   public MyStringBuffer e(int var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(long var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(float var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(double var1) {
      return this.a(String.valueOf(var1));
   }

   public MyStringBuffer a(int var1, int var2) {
      if(var1 < 0) {
         throw new StringIndexOutOfBoundsException(var1);
      } else {
         if(var2 > this.b) {
            var2 = this.b;
         }

         if(var1 > var2) {
            throw new StringIndexOutOfBoundsException();
         } else {
            int var3 = var2 - var1;
            if(var3 > 0) {
               if(this.c) {
                  this.c();
               }

               System.arraycopy(this.a, var1 + var3, this.a, var1, this.b - var2);
               this.b -= var3;
            }

            return this;
         }
      }
   }

   public MyStringBuffer f(int var1) {
      if(var1 >= 0 && var1 < this.b) {
         if(this.c) {
            this.c();
         }

         System.arraycopy(this.a, var1 + 1, this.a, var1, this.b - var1 - 1);
         --this.b;
         return this;
      } else {
         throw new StringIndexOutOfBoundsException();
      }
   }

   public MyStringBuffer a(int var1, int var2, String var3) {
      if(var1 < 0) {
         throw new StringIndexOutOfBoundsException(var1);
      } else {
         if(var2 > this.b) {
            var2 = this.b;
         }

         if(var1 > var2) {
            throw new StringIndexOutOfBoundsException();
         } else {
            int var4 = var3.length();
            int var5 = this.b + var4 - (var2 - var1);
            if(var5 > this.a.length) {
               this.b(var5);
            } else if(this.c) {
               this.c();
            }

            System.arraycopy(this.a, var2, this.a, var1 + var4, this.b - var2);
            var3.getChars(0, var4, this.a, var1);
            this.b = var5;
            return this;
         }
      }
   }

   public String g(int var1) {
      return this.b(var1, this.b);
   }

   public String b(int var1, int var2) {
      if(var1 < 0) {
         throw new StringIndexOutOfBoundsException(var1);
      } else if(var2 > this.b) {
         throw new StringIndexOutOfBoundsException(var2);
      } else if(var1 > var2) {
         throw new StringIndexOutOfBoundsException(var2 - var1);
      } else {
         return new String(this.a, var1, var2 - var1);
      }
   }

   public MyStringBuffer a(int var1, char[] var2, int var3, int var4) {
      if(var1 >= 0 && var1 <= this.b) {
         if(var3 >= 0 && var3 + var4 <= var2.length) {
            if(var4 < 0) {
               throw new StringIndexOutOfBoundsException(var4);
            } else {
               int var5 = this.b + var4;
               if(var5 > this.a.length) {
                  this.b(var5);
               } else if(this.c) {
                  this.c();
               }

               System.arraycopy(this.a, var1, this.a, var1 + var4, this.b - var1);
               System.arraycopy(var2, var3, this.a, var1, var4);
               this.b = var5;
               return this;
            }
         } else {
            throw new StringIndexOutOfBoundsException(var3);
         }
      } else {
         throw new StringIndexOutOfBoundsException();
      }
   }

   public MyStringBuffer a(int var1, Object var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer a(int var1, String var2) {
      if(var1 >= 0 && var1 <= this.b) {
         if(var2 == null) {
            var2 = String.valueOf(var2);
         }

         int var3 = var2.length();
         int var4 = this.b + var3;
         if(var4 > this.a.length) {
            this.b(var4);
         } else if(this.c) {
            this.c();
         }

         System.arraycopy(this.a, var1, this.a, var1 + var3, this.b - var1);
         var2.getChars(0, var3, this.a, var1);
         this.b = var4;
         return this;
      } else {
         throw new StringIndexOutOfBoundsException();
      }
   }

   public MyStringBuffer a(int var1, char[] var2) {
      if(var1 >= 0 && var1 <= this.b) {
         int var3 = var2.length;
         int var4 = this.b + var3;
         if(var4 > this.a.length) {
            this.b(var4);
         } else if(this.c) {
            this.c();
         }

         System.arraycopy(this.a, var1, this.a, var1 + var3, this.b - var1);
         System.arraycopy(var2, 0, this.a, var1, var3);
         this.b = var4;
         return this;
      } else {
         throw new StringIndexOutOfBoundsException();
      }
   }

   public MyStringBuffer a(int var1, boolean var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer b(int var1, char var2) {
      int var3 = this.b + 1;
      if(var3 > this.a.length) {
         this.b(var3);
      } else if(this.c) {
         this.c();
      }

      System.arraycopy(this.a, var1, this.a, var1 + 1, this.b - var1);
      this.a[var1] = var2;
      this.b = var3;
      return this;
   }

   public MyStringBuffer c(int var1, int var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer a(int var1, long var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer a(int var1, float var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer a(int var1, double var2) {
      return this.a(var1, String.valueOf(var2));
   }

   public MyStringBuffer d() {
      if(this.c) {
         this.c();
      }

      int var1 = this.b - 1;

      for(int var2 = var1 - 1 >> 1; var2 >= 0; --var2) {
         char var3 = this.a[var2];
         this.a[var2] = this.a[var1 - var2];
         this.a[var1 - var2] = var3;
      }

      return this;
   }

   public String toString() {
      return new String(this.a, 0, this.b);
   }

   final void e() {
      this.c = true;
   }

   final char[] f() {
      return this.a;
   }

   private void readObject(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      var1.defaultReadObject();
      this.a = (char[])((char[])this.a.clone());
      this.c = false;
   }

   public int d(int var1, int var2) {
      int var3 = this.b;
      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= this.b) {
         return -1;
      }

      for(int var4 = var2; var4 < var3; ++var4) {
         if(this.a[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public int h(int var1) {
      return this.d(var1, 0);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 14;
            break;
         case 1:
            var10003 = 28;
            break;
         case 2:
            var10003 = 84;
            break;
         case 3:
            var10003 = 123;
            break;
         default:
            var10003 = 49;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
