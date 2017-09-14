package jindent.formatter;

import jindent.formatter.Caret;
import jindent.formatter.s;

public class q implements s, Cloneable {
   public static final String emptyString = new String("");
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public String f;
   public q g;
   public q h;
   public int i;
   public int j;
   public q k;
   public int l;
   public Object m;
   public int n = -1;
   public int o = -1;
   public int p = -1;
   public int q = -1;
   public int r = -1;
   public boolean s = true;

   public String toString() {
      return this.f;
   }

   public static final q a(int var0) {
      q var1 = new q();
      var1.a = var0;
      return var1;
   }

   public static final q a(int var0, String var1) {
      q var2 = new q();
      var2.a = var0;
      var2.f = var1;
      return var2;
   }

   public static final q a() {
      return new q();
   }

   public void a(q var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.i = var1.i;
      this.j = var1.j;
      this.k = var1.k;
      this.h = var1.h;
      this.l = var1.l;
      this.m = var1.m;
      this.p = var1.p;
      this.n = var1.n;
      this.o = var1.o;
      this.q = var1.q;
      this.r = var1.r;
      this.s = var1.s;
   }

   public Object clone() {
      q var1 = a();
      var1.a(this);
      return var1;
   }

   public static String b(int var0) {
      switch(var0) {
      case -97:
         return a("\u00115uE\u0000\u00110bB");
      case -25:
         return a("\u0011.nJ\u0015\u0011$bA\u0014");
      case -19:
         return a("\u00115uE\u0000\u00112hM\u001e\u001a");
      case -18:
         return a("\u0011 uA\u0011\u0005=wK\u0019\u00006");
      case -17:
         return a("\u00110bB\u0015\u001c\'iG\u0015\u00112hM\u001e\u001a");
      default:
         return "" + var0;
      }
   }

   public String b() {
      StringBuffer var1 = new StringBuffer();
      var1.append(a("\'\u000fFc5nB\u0007$pnB\u0007$pnB\u001a$r") + this.f + a("lh"));
      var1.append(a("%\u000bI`pnB\u0007$pnB\u0007$pnB\u001a$") + b(this.a) + "\n");
      var1.append(a(",\u0007@m>\r\rKq= B\u0007$pnB\u001a$") + this.c + "\n");
      var1.append(a(",\u0007@m>\u0002\u000bIapnB\u0007$pnB\u001a$") + this.b + "\n");
      var1.append(a("+\fCG?\"\u0017JjpnB\u0007$pnB\u001a$") + this.e + "\n");
      var1.append(a("+\fCH9 \u0007\u0007$pnB\u0007$pnB\u001a$") + this.d + "\n");
      var1.append(a("\'\fS@1:\u0003\u0007$pnB\u0007$pnB\u001a$") + this.l + "\n");
      var1.append(a("!\u0000Ma3:&Fp1nB\u0007$pnB\u001a$") + this.m + "\n");
      var1.append(a("<\u0007Dq\"=\u000bQa\u001c+\u0014BhpnB\u001a$") + this.p + "\n");
      var1.append(a(")\u0010Fi=/\u0010s} +B\u0007$pnB\u001a$") + this.n + "\n");
      var1.append(a("\'\fCa>:\u0003Sm? 5N`$&B\u001a$") + this.r + "\n");
      var1.append(a("(\rUi1:\u0016Nj7\u0003\rCapnB\u001a$") + this.s + "\n");
      return var1.toString();
   }

   public boolean a(Caret var1) {
      return this.c <= var1.getColumn() && this.b <= var1.getLine() && var1.getColumn() <= this.e && var1.getLine() <= this.d;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 78;
            break;
         case 1:
            var10003 = 98;
            break;
         case 2:
            var10003 = 39;
            break;
         case 3:
            var10003 = 4;
            break;
         default:
            var10003 = 80;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
