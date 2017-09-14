package jindent.cpp.b;

import jindent.cpp.b.e;
import jindent.cpp.b.f;

public class g {
   static final int a = 0;
   static final int b = 1;
   static final int c = 2;
   static final int d = 3;
   static final int e = 4;
   private int f;
   private jindent.cpp.b.a.e g;
   private jindent.cpp.b.a.e h;
   private boolean i;
   private int j;
   private boolean k;
   private boolean l;
   private final e m;

   private g(e var1) {
      this.m = var1;
      this.f = 0;
      this.g = null;
      this.h = null;
      this.i = true;
      this.k = true;
      this.j = 0;
      this.l = false;
   }

   public String a() {
      return this.g == null?"":this.g.e();
   }

   public String b() {
      return this.h == null?"":this.h.e();
   }

   public boolean c() {
      return this.l;
   }

   public boolean d() {
      return this.a(this.a());
   }

   public boolean e() {
      return this.k && this.a().startsWith("#");
   }

   public boolean f() {
      return this.a(this.j) && this.a().equals("\"");
   }

   public boolean g() {
      return this.f();
   }

   public boolean h() {
      return this.b().equals("/") && this.a().equals("*");
   }

   public boolean i() {
      return this.b().equals("*") && this.a().equals("/");
   }

   public boolean j() {
      return this.b().equals("/") && this.a().equals("/");
   }

   public boolean k() {
      return this.c(this.a());
   }

   private boolean a(int var1) {
      return var1 % 2 == 0;
   }

   private boolean a(String var1) {
      return var1.equals(d("D4\u0005VD\t5"));
   }

   private boolean b(String var1) {
      return var1.equals("\t") || var1.equals(" ");
   }

   private boolean c(String var1) {
      return var1.equals("\n") || var1.equals("\r") || var1.equals(d("jZ"));
   }

   public void a(jindent.cpp.b.a.e var1) {
      String var2 = var1.e();
      this.k = this.i;
      if(this.i) {
         this.i = this.b(var2);
      }

      if(this.a(this.j) && this.c(var2)) {
         this.l = true;
         this.i = true;
      } else {
         this.l = false;
      }

      if(var2.equals("\\")) {
         ++this.j;
      } else {
         this.j = 0;
      }

      this.h = this.g;
      this.g = var1;
   }

   public void b(int var1) {
      this.f = var1;
   }

   public int l() {
      return this.f;
   }

   public jindent.cpp.b.a.e m() {
      return this.g;
   }

   public jindent.cpp.b.a.e n() {
      return this.h;
   }

   public String toString() {
      return d("71\u0012CH\u0015\u0003\u0014QY\u0002p;RL\u0004;3\\L\u00148#_X\t$\u0005B\u0010") + this.j + d("Kp\u0003E_\u00155\u000eD~\u00131\u0014U\u0010") + this.f + d("Kp\u0003E_\u00155\u000eDy\b;\u0005^\u0010") + this.g + d("Kp\tCa\u00021\u0004YC\u0000\u0004\u000f[H\tm") + this.i + d("Kp\tCc\u0002\',YC\u0002m") + this.l + d("Kp\fQ^\u0013\u0004\u000f[H\tm") + this.h + d("Kp\u0017Q^+5\u0001TD\t74_F\u0002>]") + this.k + "]";
   }

   g(e var1, f var2) {
      this(var1);
   }

   private static String d(String var0) {
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
            var10003 = 80;
            break;
         case 2:
            var10003 = 96;
            break;
         case 3:
            var10003 = 48;
            break;
         default:
            var10003 = 45;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
