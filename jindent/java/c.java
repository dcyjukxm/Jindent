package jindent.java;

import jindent.formatter.Context;
import jindent.formatter.m;
import jindent.java.b;
import jindent.java.e;
import jindent.java.j;

public class c extends Context {
   public c() {
      super(1, b("qY\u0013\u0002"), b("QY\u0013\u0002"), 10);
      this.e = new j(this);
      this.a = new e(this);
      this.b = 1;
   }

   public m newParser() {
      return new b(this);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 59;
            break;
         case 1:
            var10003 = 56;
            break;
         case 2:
            var10003 = 101;
            break;
         case 3:
            var10003 = 99;
            break;
         default:
            var10003 = 110;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
