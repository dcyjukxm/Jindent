package jindent.util;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import jindent.util.MyVector;

final class f implements Enumeration {
   MyVector a;
   int b;

   f(MyVector var1) {
      this.a = var1;
      this.b = 0;
   }

   public boolean hasMoreElements() {
      return this.b < this.a.b;
   }

   public Object nextElement() {
      if(this.b < this.a.b) {
         return this.a.a[this.b++];
      } else {
         throw new NoSuchElementException(a("\u0006\u0017\u0006#4?\u0001\"\u00039>\u0003546?\u0001\""));
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
            var10003 = 75;
            break;
         case 1:
            var10003 = 110;
            break;
         case 2:
            var10003 = 80;
            break;
         case 3:
            var10003 = 70;
            break;
         default:
            var10003 = 87;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
