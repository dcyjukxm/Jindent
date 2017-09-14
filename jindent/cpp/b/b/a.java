package jindent.cpp.b.b;

public class a {
   public static String a(String var0) {
      int var1 = var0.length();

      int var2;
      for(var2 = 0; var2 < var1 && (var0.charAt(var2) == 32 || var0.charAt(var2) == 9 || var0.charAt(var2) == 13 || var0.charAt(var2) == 10); ++var2) {
         ;
      }

      while(var2 < var1 && (var0.charAt(var1 - 1) == 32 || var0.charAt(var1 - 1) == 9 || var0.charAt(var1 - 1) == 13 || var0.charAt(var1 - 1) == 10)) {
         --var1;
      }

      return var2 <= 0 && var1 >= var0.length()?var0:var0.substring(var2, var1);
   }

   public static String b(String var0) {
      int var1 = var0.length();

      byte var2;
      for(var2 = 0; var2 < var1 && (var0.charAt(var1 - 1) == 32 || var0.charAt(var1 - 1) == 9 || var0.charAt(var1 - 1) == 13 || var0.charAt(var1 - 1) == 10); --var1) {
         ;
      }

      return var2 <= 0 && var1 >= var0.length()?var0:var0.substring(var2, var1);
   }

   public static int c(String var0) {
      int var1 = 0;
      int var2 = var0.length();
      char var3 = 32;
      boolean var4 = true;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var3;
         var3 = var0.charAt(var5);
         if(var3 == 10 && var6 != 13) {
            ++var1;
         } else if(var3 == 13) {
            ++var1;
         }
      }

      return var1;
   }
}
