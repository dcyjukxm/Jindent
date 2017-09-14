package jindent.formatter.d;

import jindent.formatter.q;
import jindent.formatter.u;
import jindent.util.MyVector;

public class j {
   private MyVector a;
   private boolean b;

   public j(boolean var1) {
      this.a = new MyVector();
      this.b = var1;
   }

   public j(q var1, boolean var2) {
      this(var2);
      this.a(var1);
   }

   public void a(q var1) {
      this.a.d(var1);
   }

   public boolean a() {
      return this.b;
   }

   public int b() {
      int var1 = Integer.MAX_VALUE;
      int var2 = this.a.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         q var4 = (q)this.a.d(var3);
         int var5 = var4.g.c;
         if(var1 > var5) {
            var1 = var5;
         }
      }

      return var1;
   }

   public int c() {
      int var1 = -1;
      int var2 = this.a.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         q var4 = (q)this.a.d(var3);
         int var5 = this.b(var4);
         if(var1 < var5) {
            var1 = var5;
         }
      }

      return var1;
   }

   private int b(q var1) {
      if(this.b) {
         return var1.g.e;
      } else {
         q var2 = u.a((q)var1, -25);
         q var3 = var2.k;
         if(var3 == null) {
            System.out.println(a("wd\\6;Oq\u000fw7L`\u000fb:\u0000cFx1\u0000Zc_\u001beZiS\u0010d%NbuTmJ60Na\u000fy3\u0000d\u000fz<N`\u000f7"));
         }

         return var3.c;
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 32;
            break;
         case 1:
            var10003 = 5;
            break;
         case 2:
            var10003 = 47;
            break;
         case 3:
            var10003 = 22;
            break;
         default:
            var10003 = 85;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
