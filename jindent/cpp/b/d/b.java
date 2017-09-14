package jindent.cpp.b.d;

public class b {
   private String a;
   private String b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public int a() {
      return this.c;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public int b() {
      return this.e;
   }

   public void b(int var1) {
      this.e = var1;
   }

   public int c() {
      return this.d;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public int d() {
      return this.f;
   }

   public void d(int var1) {
      this.f = var1;
   }

   public int e() {
      return this.g;
   }

   public int f() {
      return this.h;
   }

   public String g() {
      return this.b;
   }

   public void a(String var1) {
      this.b = jindent.cpp.b.b.a.a(var1);
      this.h();
   }

   private void h() {
      if(this.c != -1 && this.e != -1) {
         this.g = this.c - 1;
         this.h = this.e;
         int var1 = this.b.length();
         char var2 = 32;

         for(int var3 = 0; var3 < var1; ++var3) {
            char var4 = var2;
            var2 = this.b.charAt(var3);
            if(var2 == 13) {
               this.g = 1;
               ++this.h;
            } else if(var2 == 10) {
               if(var4 != 13) {
                  this.g = 1;
                  ++this.h;
               }
            } else {
               ++this.g;
            }
         }

      }
   }

   public String i() {
      return this.a;
   }

   public void b(String var1) {
      this.a = var1;
   }

   public void c(String var1) {
      this.a = this.a + var1;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("[");
      var1.append(d("zeJsa{vO9{aeJzo/7\u0001"));
      var1.append(this.a);
      var1.append(d("77x"));
      var1.append(this.c);
      var1.append(d("97"));
      var1.append(this.e);
      var1.append(d("5:\u0003"));
      var1.append(this.d);
      var1.append(d("97"));
      var1.append(this.f);
      var1.append(d("H7"));
      var1.append(d("5:\u001d4fp`\u000eg|g~Ms255"));
      var1.append(this.b);
      var1.append(d("77x"));
      var1.append(this.c);
      var1.append(d("97"));
      var1.append(this.e);
      var1.append(d("5:\u0003"));
      var1.append(this.g);
      var1.append(d("97"));
      var1.append(this.h);
      var1.append(d("H7"));
      return var1.toString();
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 21;
            break;
         case 1:
            var10003 = 23;
            break;
         case 2:
            var10003 = 35;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 8;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
