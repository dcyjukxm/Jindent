package jindent.cpp.a;

import jindent.util.MyStringBuffer;

public class c {
   public void a(String var1, String var2) {
      int var3 = 0;
      int var4 = 0;

      char var5;
      while(var3 < var1.length() && var4 < var2.length()) {
         var5 = var1.charAt(var3);
         char var6 = var2.charAt(var4);
         if(var5 == var6) {
            ++var3;
            ++var4;
         } else if(this.b(var5)) {
            var2 = var2.substring(0, var4) + " " + var2.substring(var4);
            ++var3;
            ++var4;
         } else {
            if(!this.a(var6)) {
               MyStringBuffer var7 = new MyStringBuffer();
               var7.a(a("yVI\rO^\u0019M\u000e\u0001DWR\u001dU\rXL\f\u0001BLV\u0018TY\u0019Q\u0007T_ZGHBB]GHEB\u0019L\u0007U\rTC\u001cBE\u0018("));
               var7.a(a("dWR\u001dU\rMM\u0003DCJ\u0018H\u0001") + var1 + "\n");
               var7.a(a("bLV\u0018TY\u0019V\u0007JHWQR\u0001") + var2 + "\n");

               for(int var8 = 0; var8 < var4 + 20; ++var8) {
                  var7.a(" ");
               }

               var7.a(a("s3"));
               throw new RuntimeException(var7.toString());
            }

            var1 = var1.substring(0, var3) + " " + var1.substring(var3);
            ++var3;
            ++var4;
         }
      }

      while(var4 < var2.length()) {
         var5 = var2.charAt(var4);
         if(!this.a(var5)) {
            MyStringBuffer var10 = new MyStringBuffer();
            var10.a(a("yVI\rO^\u0019M\u000e\u0001DWR\u001dU\rXL\f\u0001BLV\u0018TY\u0019Q\u0007T_ZGHBB]GHEB\u0019L\u0007U\rQC\u001eD\rJC\u0005D\r\\L\f\u0000\'"));
            var10.a(a("dWR\u001dU\rMM\u0003DCJ\u0018H\u0001\u000f") + var1 + a("\u000f3"));
            var10.a(a("bLV\u0018TY\u0019V\u0007JHWQR\u0001\u000f") + var2 + a("\u000f3"));
            throw new RuntimeException(var10.toString());
         }

         ++var4;
      }

      if(var3 != var1.length() || var4 != var2.length()) {
         MyStringBuffer var9 = new MyStringBuffer();
         var9.a(a("yVI\rO^\u0019M\u000e\u0001DWR\u001dU\rXL\f\u0001BLV\u0018TY\u0019Q\u0007T_ZGHBB]GHEB\u0019L\u0007U\rQC\u001eD\rJC\u0005D\r\\L\f\u0000\'"));
         var9.a(a("dWR\u001dU\rMM\u0003DCJ\u0018H\u0001\u000f") + var1 + a("\u000f3"));
         var9.a(a("bLV\u0018TY\u0019V\u0007JHWQR\u0001\u000f") + var2 + a("\u000f3"));
         throw new RuntimeException(var9.toString());
      }
   }

   private boolean a(char var1) {
      return var1 == 123 || var1 == 125 || var1 == 40 || var1 == 41;
   }

   private boolean b(char var1) {
      return var1 == 92;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 45;
            break;
         case 1:
            var10003 = 57;
            break;
         case 2:
            var10003 = 34;
            break;
         case 3:
            var10003 = 104;
            break;
         default:
            var10003 = 33;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
