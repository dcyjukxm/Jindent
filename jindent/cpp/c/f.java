package jindent.cpp.c;

import jindent.cpp.c.d;

public class f extends d {
   public f() {
      super(59);
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      int var2 = this.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.append(this.b(var3));
         var1.append(" ");
         var1.append(this.a(var3));
         if(var3 < var2 - 1) {
            var1.append(a("0\f"));
         }
      }

      return a("\u007fC ]\u0004nY-Z\u001fn\ff") + var1.toString() + ")";
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 28;
            break;
         case 1:
            var10003 = 44;
            break;
         case 2:
            var10003 = 78;
            break;
         case 3:
            var10003 = 46;
            break;
         default:
            var10003 = 112;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
