package jindent.java;

import jindent.java.e;
import jindent.java.a.o;

class d extends o {
   private final e o;

   d(e var1) {
      this.o = var1;
   }

   public String toString() {
      return d("_\u0016GmZS\u0015Y|QX\u0017XzH:\u0000\u00177\r4[J");
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 26;
            break;
         case 1:
            var10003 = 123;
            break;
         case 2:
            var10003 = 55;
            break;
         case 3:
            var10003 = 25;
            break;
         default:
            var10003 = 35;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
