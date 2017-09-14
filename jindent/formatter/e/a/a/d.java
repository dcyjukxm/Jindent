package jindent.formatter.e.a.a;

import java.util.StringTokenizer;

public class d {
   private StringTokenizer a;
   static final String b = ">reOl#}jo[";
   static final String c = ".";

   public d(String var1) {
      this.a = new StringTokenizer(var1, b(">reOl#}jo["));
   }

   public int a() {
      return this.a.countTokens();
   }

   public boolean b() {
      return this.a.hasMoreTokens();
   }

   public String c() {
      String var1 = this.a.nextToken();
      return this.a(var1);
   }

   String a(String var1) {
      int var2 = var1.length();
      int var3 = -1;
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var3 = var5;
         if(".".indexOf(var1.charAt(var5)) == -1) {
            break;
         }
      }

      for(var5 = var2 - 1; var5 >= 0; --var5) {
         var4 = var5 + 1;
         if(".".indexOf(var1.charAt(var5)) == -1) {
            break;
         }
      }

      return var4 <= var3?var1:var1.substring(var3, var4);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 30;
            break;
         case 1:
            var10003 = 94;
            break;
         case 2:
            var10003 = 72;
            break;
         case 3:
            var10003 = 101;
            break;
         default:
            var10003 = 86;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
