package jindent.formatter;

import java.math.BigInteger;
import jindent.formatter.RSAException;

class o {
   private BigInteger a;
   private int b;
   private int c;
   private BigInteger d;
   private BigInteger e;
   private byte[] f;
   private int g;
   private boolean h;

   o(byte[] var1, int var2, int var3, BigInteger var4, BigInteger var5, BigInteger var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   o(byte[] var1, int var2, int var3, BigInteger var4, BigInteger var5, BigInteger var6, boolean var7) {
      this.a = null;
      this.b = 1;
      this.c = 1;
      this.d = null;
      this.e = null;
      this.f = null;
      this.g = 0;
      this.h = false;
      this.f = var1;
      this.g = 0;
      this.d = var4;
      this.e = var5;
      this.b = var2;
      this.c = var3;
      this.a = var6;
      this.h = var7;
   }

   void a(boolean var1) {
      this.h = var1;
   }

   boolean a() {
      return this.g >= this.f.length;
   }

   byte[] a(byte[] var1, int var2) throws RSAException {
      byte[] var3 = new byte[var2];
      if(var1.length > var2) {
         throw new RSAException(a("vqW\ttA0_\u000ewY0") + var2 + a("\u0015r@\u0013~F0N\u000eo]0") + var1.length + a("\u0015r@\u0013~F0\u0018"));
      } else {
         for(int var4 = 0; var4 < var2 - var1.length; ++var4) {
            var3[var4] = 0;
         }

         System.arraycopy(var1, 0, var3, var2 - var1.length, var1.length);
         return var3;
      }
   }

   byte[] b() throws RSAException {
      int var2 = this.g + this.b < this.f.length?this.b:this.f.length - this.g;
      byte[] var1 = new byte[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3] = this.f[this.g++];
      }

      BigInteger var6 = new BigInteger(var1);
      BigInteger var4 = var6.modPow(this.d, this.e);
      var4 = var4.xor(this.a);
      this.a = new BigInteger(var6.toByteArray());
      byte[] var5 = var4.toByteArray();
      return this.a(var5, this.c);
   }

   byte[] c() throws RSAException {
      if(this.f.length % this.c != 0) {
         throw new RSAException(a("bbV\t|\u0015yW\u0017nA0J\u000eaP0V\u0001;VyI\u000f~G0M\u0002cA0\u0018"));
      } else {
         byte[] var1 = new byte[this.c];
         System.arraycopy(this.f, this.g, var1, 0, this.c);
         if(this.h) {
            System.out.println(a("VyI\u000f~G*\u0019G;\u00150\u0019G") + new BigInteger(var1));
         }

         this.g += this.c;
         BigInteger var2 = (new BigInteger(var1)).xor(this.a).modPow(this.d, this.e);
         this.a = var2;
         byte[] var3 = var2.toByteArray();
         if(this.h) {
            System.out.println(a("E|X\u000eu\u000f0\u0019G;\u00150\u0019G") + var2);
            System.out.print(a("E|X\u000eu\u0018cM\u0015r[w\u0003G"));
            a(var3);
         }

         if(var3.length == this.b + 1 && var3[0] == 0) {
            byte[] var4 = new byte[this.b];
            System.arraycopy(var3, 1, var4, 0, this.b);
            return var4;
         } else if(var3.length > this.b && !this.h) {
            throw new RSAException(a("bbV\t|\u0015sU\u0012hAuKGh\\j\\GtS0]\u0002xGiI\u0013~Q0Z\u000ek]uKGoPhMG:"));
         } else {
            return var3;
         }
      }
   }

   byte[] d() throws RSAException {
      byte[] var1 = new byte[2048];
      int var2 = 0;

      byte[] var3;
      try {
         while(!this.a()) {
            var3 = this.c();
            int var4 = var3.length;
            if(var2 + var4 >= var1.length) {
               throw new RSAException(a("e|X\u000eu\u0018RL\u0001}Pb\u0019\bmPbK\u0012u\u00151"));
            }

            System.arraycopy(var3, 0, var1, var2, var4);
            var2 += var4;
         }
      } catch (RSAException var5) {
         throw var5;
      }

      var3 = new byte[var2];
      System.arraycopy(var1, 0, var3, 0, var2);
      return var3;
   }

   private static void a(byte[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print((char)var0[var1] + a("\u00158") + var0[var1] + a("\u001c<\u0019"));
      }

      System.out.println();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 53;
            break;
         case 1:
            var10003 = 16;
            break;
         case 2:
            var10003 = 57;
            break;
         case 3:
            var10003 = 103;
            break;
         default:
            var10003 = 27;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
