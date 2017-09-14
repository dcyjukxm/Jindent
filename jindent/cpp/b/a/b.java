package jindent.cpp.b.a;

import jindent.util.MyStringBuffer;

public class b {
   private MyStringBuffer a = new MyStringBuffer();
   private int b;
   private int c;
   private int d;
   private int e;

   public int a() {
      return this.b;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public int b() {
      return this.c;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int c() {
      return this.d;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public int d() {
      return this.e;
   }

   public void d(int var1) {
      this.e = var1;
   }

   public void a(String var1) {
      this.a = new MyStringBuffer(var1);
   }

   public void b(String var1) {
      this.a.a(var1);
   }

   public String e() {
      return this.a.toString();
   }

   public String f() {
      return jindent.cpp.b.b.a.a(this.e());
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("\"");
      var1.append(this.f());
      var1.append(c("\tWD"));
      var1.append(this.b);
      var1.append(c("\u0007W"));
      var1.append(this.c);
      var1.append(c("\u000bZ?"));
      var1.append(this.d);
      var1.append(c("\u0007W"));
      var1.append(this.e);
      var1.append("]");
      return var1.toString();
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 43;
            break;
         case 1:
            var10003 = 119;
            break;
         case 2:
            var10003 = 31;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 62;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
