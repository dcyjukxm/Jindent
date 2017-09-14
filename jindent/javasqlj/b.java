package jindent.javasqlj;

import jindent.formatter.Context;
import jindent.formatter.m;
import jindent.java.e;
import jindent.java.j;

public class b extends Context {
   public b() {
      super(2, b("d\u001a\u0011\u0019(}*+2"), b("D\u001a\u0011\u0019"), 10);
      this.e = new j(this);
      this.a = new e(this);
      this.f = new jindent.javasqlj.a.a();
      this.b = 1;
   }

   public m newParser() {
      return new jindent.java.b(this);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 46;
            break;
         case 1:
            var10003 = 123;
            break;
         case 2:
            var10003 = 103;
            break;
         case 3:
            var10003 = 120;
            break;
         default:
            var10003 = 7;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
