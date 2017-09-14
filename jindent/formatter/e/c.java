package jindent.formatter.e;

import jindent.formatter.e.b;

public class c extends b {
   protected c() {
   }

   public c(String var1) {
      super(var1);
   }

   public c b() {
      return this;
   }

   public static c a(String var0, int var1) {
      int var2 = c(var0);
      return a(var0, var1, var2);
   }

   public static c a(String var0, int var1, int var2) {
      new c();
      String var4 = var0;
      if(var2 != -1) {
         if(var1 > var2) {
            var4 = b(var0, var2, var1 - var2);
         }

         if(var2 > var1) {
            var4 = c(var4, var2, var2 - var1);
         }
      }

      return new c(var4);
   }

   public c c() {
      String var1 = this.a;
      StringBuffer var2 = new StringBuffer();
      if(var1.startsWith(d("RX"))) {
         var1 = var1.substring(2);
      }

      var1 = var1.trim();
      var2.append(d("RX"));
      if(!var1.equals("")) {
         var2.append(" ");
         var2.append(var1);
      }

      return new c(var2.toString());
   }

   private static String b(String var0) {
      String var2 = "";
      boolean var4 = true;
      boolean var5 = true;

      int var1;
      for(var1 = var0.length() - 1; var1 >= 0; --var1) {
         if(var0.charAt(var1) != 32) {
            var4 = false;
         }

         if(var0.charAt(var1) != 42 && !var4) {
            var5 = false;
         }

         if((var0.charAt(var1) != 32 || !var4) && (var0.charAt(var1) != 42 || !var5)) {
            var2 = var0.charAt(var1) + var2;
         }
      }

      String var3 = "";
      var4 = true;
      var5 = true;

      for(var1 = 0; var1 < var2.length(); ++var1) {
         if(var2.charAt(var1) != 32) {
            var4 = false;
         }

         if(var2.charAt(var1) != 42 && !var4) {
            var5 = false;
         }

         if(var2.charAt(var1) != 42 || !var5) {
            var3 = var3 + var2.charAt(var1);
         }
      }

      return var3;
   }

   private static String b(String var0, int var1, int var2) {
      StringBuffer var3 = new StringBuffer(var0);
      if(var1 < var0.length()) {
         for(int var4 = 0; var4 < var2; ++var4) {
            var3 = var3.insert(var1, " ");
         }
      }

      return var3.toString();
   }

   private static String c(String var0, int var1, int var2) {
      StringBuffer var3 = new StringBuffer(var0);

      for(int var4 = 1; var4 <= var2; ++var4) {
         int var5 = var1 > var4?var1 - var4:0;
         if(var5 < var3.length()) {
            char var6 = var3.charAt(var5);
            if(var6 != 32 && var6 != 9) {
               break;
            }

            var3 = var3.deleteCharAt(var5);
         }
      }

      return var3.toString();
   }

   public static int c(String var0) {
      int var1 = var0.length();

      for(int var2 = 0; var2 < var1; ++var2) {
         char var3 = var0.charAt(var2);
         if(var3 == 13 || var3 == 10) {
            return -1;
         }

         if(!c(var0, var2) && !d(var0, var2) && !b(var0, var2)) {
            return var2;
         }
      }

      return -1;
   }

   private static boolean b(String var0, int var1) {
      return var1 < 2;
   }

   private static boolean c(String var0, int var1) {
      return var0.charAt(var1) == 32;
   }

   private static boolean d(String var0, int var1) {
      return var0.charAt(var1) == 9;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 125;
            break;
         case 1:
            var10003 = 119;
            break;
         case 2:
            var10003 = 3;
            break;
         case 3:
            var10003 = 6;
            break;
         default:
            var10003 = 110;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
