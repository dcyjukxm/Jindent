package jindent.formatter.e;

import jindent.formatter.e.d;

public class e extends d {
   protected e() {
   }

   public e(String var1) {
      super(var1);
   }

   public e b() {
      return this;
   }

   public e b(int var1) {
      e var2 = new e();
      int var3 = this.d();
      int var4 = this.a();

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = this.a(var5);
         int var7 = d(var6);
         if(var7 != -1) {
            if(var1 > var3) {
               var6 = this.a(var6, var7, var1 - var3);
            }

            if(var3 > var1) {
               var6 = this.b(var6, var7, var3 - var1);
            }
         }

         var2.a(var6);
      }

      return var2;
   }

   public e c() {
      e var1 = new e();
      StringBuffer var2 = new StringBuffer();
      int var3 = this.a();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = this.a(var4);
         var5 = c(var5);
         if(var5.startsWith(e("M "))) {
            var5 = " " + var5.substring(2);
         } else if(var5.startsWith("/")) {
            var5 = var5.substring(1);
         }

         if(var5.endsWith(e("H%"))) {
            var5 = var5.substring(0, var5.length() - 2);
         } else if(var5.endsWith("/")) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         var2.setLength(0);
         var2.append(e("B "));
         if(var5.length() > 0 && var5.charAt(0) != 32) {
            var2.append(" ");
         }

         var5 = b(var5);
         var2.append(var5);
         if(var4 == 1) {
            var1.a(e("M "));
            var1.a(var2.toString());
         }

         if(var4 > 1 && var4 < var3 - 1) {
            var1.a(var2.toString());
         }

         if(var4 == var3 - 1) {
            if(var5.trim().length() == 0) {
               var1.a(e("B x"));
            } else {
               var1.a(var2.toString());
               var1.a(e("B x"));
            }
         }
      }

      return var1;
   }

   private static String c(String var0) {
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

   private String a(String var1, int var2, int var3) {
      StringBuffer var4 = new StringBuffer(var1);

      for(int var5 = 0; var5 < var3; ++var5) {
         var4 = var4.insert(var2, " ");
      }

      return var4.toString();
   }

   private String b(String var1, int var2, int var3) {
      StringBuffer var4 = new StringBuffer(var1);

      for(int var5 = 1; var5 <= var3; ++var5) {
         int var6 = var2 > var5?var2 - var5:0;
         if(var6 < var4.length()) {
            char var7 = var4.charAt(var6);
            if(var7 != 32 && var7 != 9) {
               break;
            }

            var4 = var4.deleteCharAt(var6);
         }
      }

      return var4.toString();
   }

   private int d() {
      int var1 = this.a();
      int var2 = Integer.MAX_VALUE;

      for(int var3 = 0; var3 < var1; ++var3) {
         String var4 = this.a(var3);
         int var5 = d(var4);
         if(var5 != -1) {
            var2 = Math.min(var2, var5);
         }
      }

      return var2;
   }

   private static int d(String var0) {
      int var1 = var0.length();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(!b(var0, var2) && !c(var0, var2) && !d(var0, var2) && !e(var0, var2)) {
            return var2;
         }
      }

      return -1;
   }

   private static boolean b(String var0, int var1) {
      return var0.charAt(var1) == 32;
   }

   private static boolean c(String var0, int var1) {
      return var0.charAt(var1) == 9;
   }

   private static boolean d(String var0, int var1) {
      int var2 = var0.length();
      char var3 = var0.charAt(var1);
      char var4;
      if(var3 == 47) {
         var4 = var1 + 1 < var2?var0.charAt(var1 + 1):32;
         return var4 == 42;
      } else if(var3 == 42) {
         var4 = var1 - 1 >= 0?var0.charAt(var1 - 1):32;
         return var4 == 47;
      } else {
         return false;
      }
   }

   private static boolean e(String var0, int var1) {
      int var2 = var0.length();
      char var3 = var0.charAt(var1);
      char var4;
      if(var3 == 42) {
         var4 = var1 + 1 < var2?var0.charAt(var1 + 1):32;
         return var4 == 47;
      } else if(var3 == 47) {
         var4 = var1 - 1 >= 0?var0.charAt(var1 - 1):32;
         return var4 == 42;
      } else {
         return false;
      }
   }

   private static String e(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 98;
            break;
         case 1:
            var10003 = 10;
            break;
         case 2:
            var10003 = 87;
            break;
         case 3:
            var10003 = 95;
            break;
         default:
            var10003 = 59;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
