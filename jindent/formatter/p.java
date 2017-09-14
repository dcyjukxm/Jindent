package jindent.formatter;

import java.util.StringTokenizer;
import jindent.formatter.Context;
import jindent.formatter.t;
import jindent.util.MyStringBuffer;

public class p {
   public static final char space = ' ';
   public static final char tab = '\t';
   private static String a;
   private static String b;

   public static boolean a(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var1, c(";K|"));

      String var3;
      do {
         if(!var2.hasMoreTokens()) {
            return false;
         }

         var3 = var2.nextToken().trim();
      } while(var0.indexOf(var3) == -1);

      return true;
   }

   public static boolean b(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var1, c(";K|"));

      String var3;
      do {
         if(!var2.hasMoreTokens()) {
            return true;
         }

         var3 = var2.nextToken().trim();
      } while(var0.indexOf(var3) == -1);

      return false;
   }

   public static String a(String var0) {
      if(var0 == null) {
         return null;
      } else {
         for(int var1 = 0; var1 < var0.length(); ++var1) {
            char var2 = var0.charAt(var1);
            if(var2 != 32 && var2 != 9) {
               return var0.substring(var1);
            }
         }

         return "";
      }
   }

   public static boolean b(String var0) {
      if(var0 == null) {
         return true;
      } else if("".equals(var0)) {
         return true;
      } else {
         for(int var1 = 0; var1 < var0.length(); ++var1) {
            char var2 = var0.charAt(var1);
            if(var2 != 32 || var2 != 9 || var2 != 10 || var2 != 13) {
               return false;
            }
         }

         return true;
      }
   }

   public static String a(int var0, int var1) {
      return var0 >= var1?t.emptyString:a(var1 - var0);
   }

   public static String a(Context var0, int var1, int var2) {
      if(var1 >= var2) {
         return t.emptyString;
      } else {
         StringBuffer var4 = new StringBuffer("");
         int var5 = var2 / var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014"));
         int var6 = var1 / var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014"));
         int var3;
         if(var5 > var6) {
            int var7 = var5 * var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014"));
            int var8 = (var1 + var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014")) - 1) / var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014")) * var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014"));
            if(var8 != var1 && var8 <= var7) {
               var4.append('\t');
            }

            var4.append(b((var7 - var8) / var0.getNumber(c("c \u0013\u0015\u0002v5\u001e\u0012=~;\u0014"))));
            var3 = var2 - var7;
         } else {
            var3 = var2 - var1;
         }

         var4.append(a(var3));
         return var4.toString();
      }
   }

   public static String a(int var0) {
      return var0 <= 0?"":(var0 < a.length()?a.substring(0, var0):a);
   }

   protected static String b(int var0) {
      return var0 < b.length()?b.substring(0, var0):b;
   }

   static {
      MyStringBuffer var0 = new MyStringBuffer("");

      int var1;
      for(var1 = 0; var1 < 1000; ++var1) {
         var0.a(' ');
      }

      a = var0.toString();
      var0 = new MyStringBuffer("");

      for(var1 = 0; var1 < 400; ++var1) {
         var0.a('\t');
      }

      b = var0.toString();
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 23;
            break;
         case 1:
            var10003 = 65;
            break;
         case 2:
            var10003 = 113;
            break;
         case 3:
            var10003 = 96;
            break;
         default:
            var10003 = 110;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
