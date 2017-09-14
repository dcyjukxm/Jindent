package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.u;
import jindent.formatter.d.d;

public class f implements d, s {
   private q a;
   private q b;
   private q c;
   private int d;
   private int e;
   private int f;

   public f(int var1, q var2, q var3, q var4, int var5, int var6) {
      this.f = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
      this.d = var5;
      this.e = var6;
      if(this.a == null) {
         System.out.println(a("\u0017G4\u000fE\u0002D6\rE\u0019I7\rH\"\u0005/\rMv\u0016`HE#G1"));
      }

      if(this.b == null) {
         System.out.println(a("\u0017G4\u000fE\u0002D6\rE\u0019I7\rH\"\u0005.\u001cJ$_}U\u0016vE(\u0004G"));
      }

   }

   public void a(Context var1) {
      int var2 = this.b().c;
      int var3 = this.d();
      int var4;
      if(this.g() == 1) {
         var4 = var3 - this.b().r;
         int var6 = var1.getAbsoluteRelativeIndex(a("2N8\u0018b8O8\u0006_"));
         boolean var7 = var6 == 0?var4 > var1.getNumber(a("2N8\u0018b8O8\u0006_")):var3 > var1.getNumber(a("2N8\u0018b8O8\u0006_"));
         if(var7) {
            var3 = this.b().r + var1.getNumber(a("7G)\rY8J)\u0001]3b3\fN8_"));
         }
      }

      var4 = var3 - var2;
      if(var4 != 0) {
         q var5 = this.c();
         if(this.f() == 1) {
            var5 = u.a((q)this.c(), -25);
         }

         u.d(this.b(), var5, var4);
      }

   }

   public int d() {
      return this.a().c + this.e();
   }

   public q a() {
      return this.a;
   }

   public q b() {
      return this.b;
   }

   public q c() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public int g() {
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
            var10003 = 86;
            break;
         case 1:
            var10003 = 43;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 104;
            break;
         default:
            var10003 = 43;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
