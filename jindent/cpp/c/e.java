package jindent.cpp.c;

import jindent.cpp.c.d;

public class e extends d {
   public e() {
      super(6);
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      int var2 = this.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.append(this.b(var3));
         var1.append(" ");
         var1.append(this.a(var3));
         if(var3 < var2 - 1) {
            var1.append(a("\u0004\u0002"));
         }
      }

      return a("KM\u0019I\bZW\u0014N\u0013Z\u0002_") + var1.toString() + ")";
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 40;
            break;
         case 1:
            var10003 = 34;
            break;
         case 2:
            var10003 = 119;
            break;
         case 3:
            var10003 = 58;
            break;
         default:
            var10003 = 124;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
