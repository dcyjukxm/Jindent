package jindent.util.b;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import jindent.util.b.c;

public class b extends FilterOutputStream {
   private boolean a;
   private int b;
   private byte[] c;
   private int d;
   private int e;
   private boolean f;
   private byte[] g;
   private boolean h;

   public b(OutputStream var1) {
      this(var1, 1);
   }

   public b(OutputStream var1, int var2) {
      super(var1);
      this.f = (var2 & 8) != 8;
      this.a = (var2 & 1) == 1;
      this.d = this.a?3:4;
      this.c = new byte[this.d];
      this.b = 0;
      this.e = 0;
      this.h = false;
      this.g = new byte[4];
   }

   public void write(int var1) throws IOException {
      if(this.h) {
         super.out.write(var1);
      } else {
         if(this.a) {
            this.c[this.b++] = (byte)var1;
            if(this.b >= this.d) {
               this.out.write(c.b(this.g, this.c, this.d));
               this.e += 4;
               if(this.f && this.e >= 76) {
                  this.out.write(10);
                  this.e = 0;
               }

               this.b = 0;
            }
         } else if(c.a()[var1 & 127] > -5) {
            this.c[this.b++] = (byte)var1;
            if(this.b >= this.d) {
               int var2 = c.b(this.c, 0, this.g, 0);
               this.out.write(this.g, 0, var2);
               this.b = 0;
            }
         } else if(c.a()[var1 & 127] != -5) {
            throw new IOException(a("]\u00115\u0004G}\u001bc\u0006Cu\r\"\u0006_q\rc\fE4=\"\u0016N\"Kc\u0001J`\u001em"));
         }

      }
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      if(this.h) {
         super.out.write(var1, var2, var3);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.write(var1[var2 + var4]);
         }

      }
   }

   public void a() throws IOException {
      if(this.b > 0) {
         if(!this.a) {
            throw new IOException(a("V\u001e0\u0000\u001d _*\u000b[a\u000bc\u000bD`_3\u0017Dd\u001a1\tR4\u000f\"\u0001Oq\u001bm"));
         }

         this.out.write(c.b(this.g, this.c, this.b));
         this.b = 0;
      }

   }

   public void close() throws IOException {
      this.a();
      super.close();
      this.c = null;
      this.out = null;
   }

   public void b() throws IOException {
      this.a();
      this.h = true;
   }

   public void c() {
      this.h = false;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 20;
            break;
         case 1:
            var10003 = 127;
            break;
         case 2:
            var10003 = 67;
            break;
         case 3:
            var10003 = 101;
            break;
         default:
            var10003 = 43;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
