package jindent.util.b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import jindent.util.b.c;

public class a extends FilterInputStream {
   private boolean a;
   private int b;
   private byte[] c;
   private int d;
   private int e;
   private int f;
   private boolean g;

   public a(InputStream var1) {
      this(var1, 0);
   }

   public a(InputStream var1, int var2) {
      super(var1);
      this.g = (var2 & 8) != 8;
      this.a = (var2 & 1) == 1;
      this.d = this.a?4:3;
      this.c = new byte[this.d];
      this.b = -1;
      this.f = 0;
   }

   public int read() throws IOException {
      if(this.b < 0) {
         byte[] var1;
         int var2;
         int var3;
         if(!this.a) {
            var1 = new byte[4];
            boolean var7 = false;

            for(var2 = 0; var2 < 4; ++var2) {
               boolean var8 = false;

               do {
                  var3 = this.in.read();
               } while(var3 >= 0 && c.a()[var3 & 127] <= -5);

               if(var3 < 0) {
                  break;
               }

               var1[var2] = (byte)var3;
            }

            if(var2 != 4) {
               if(var2 == 0) {
                  return -1;
               }

               throw new IOException(a("E= HM|5\"V[, 1^Fi4pxC\u007f5f\u000e\u0002e> OV\""));
            }

            this.e = c.b(var1, 0, this.c, 0);
            this.b = 0;
         } else {
            var1 = new byte[3];
            var2 = 0;
            var3 = 0;

            while(true) {
               if(var3 >= 3) {
                  if(var2 <= 0) {
                     return -1;
                  }

                  c.b(var1, 0, var2, this.c, 0);
                  this.b = 0;
                  this.e = 4;
                  break;
               }

               try {
                  int var4 = this.in.read();
                  if(var4 >= 0) {
                     var1[var3] = (byte)var4;
                     ++var2;
                  }
               } catch (IOException var5) {
                  if(var3 == 0) {
                     throw var5;
                  }
               }

               ++var3;
            }
         }
      }

      if(this.b >= 0) {
         if(this.b >= this.e) {
            return -1;
         } else if(this.a && this.g && this.f >= 76) {
            this.f = 0;
            return 10;
         } else {
            ++this.f;
            byte var6 = this.c[this.b++];
            if(this.b >= this.d) {
               this.b = -1;
            }

            return var6 & 255;
         }
      } else {
         throw new IOException(a("I\"\"UP,9>\u001a`m#5\f\u0016,3?^G,\"5[Fe>7\u001aQx\"5[O\""));
      }
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         int var5 = this.read();
         if(var5 < 0) {
            if(var4 == 0) {
               return -1;
            }
            break;
         }

         var1[var2 + var4] = (byte)var5;
      }

      return var4;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 12;
            break;
         case 1:
            var10003 = 80;
            break;
         case 2:
            var10003 = 80;
            break;
         case 3:
            var10003 = 58;
            break;
         default:
            var10003 = 34;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
