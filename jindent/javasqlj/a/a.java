package jindent.javasqlj.a;

import java.util.StringTokenizer;
import jindent.formatter.c.b;
import jindent.formatter.c.c;

public class a implements b, c {
   public String a() {
      return c("#!HTY\u0016\u0019hj\u0011\u0002Pr.ZA\u0012");
   }

   public String a(String var1) {
      StringTokenizer var2 = new StringTokenizer(var1, c("PK+4W\u000b\r&\u0017~}|"), true);
      StringBuffer var3 = new StringBuffer();
      String var5 = new String("");
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;

      while(var2.hasMoreTokens()) {
         String var4 = var5;
         var5 = var2.nextToken();
         if(var5.equals("*") && var4.equals("/")) {
            var8 = true;
         } else if(var5.equals("/") && var4.equals("*")) {
            var8 = false;
         } else if(var5.equals("/") && var4.equals("/")) {
            var9 = true;
         } else if(!var5.equals("\n") && !var5.equals("\r")) {
            if(var5.equals("\"") && !var4.equals("\\") && !var8 && !var9) {
               var7 = !var7;
            } else if(var5.equals("#") && !var7 && !var8 && !var9) {
               var5 = var2.nextToken();
               if(!var5.equals(c("\u0003\u0001h"))) {
                  var3.append("#");
                  break;
               }

               var6 = true;
               var3.append(c("_ZF[39>[X=<$AL+3?IS1>$"));
               var3.append("#");
            }
         } else {
            var9 = false;
            var7 = false;
         }

         var3.append(var5);
         if(var6 && !var7 && !var8 && !var9 && var5.equals(";")) {
            var6 = false;
            var3.append(c("5>@A29<P[&/3KS95>P4["));
         }
      }

      return var3.toString();
   }

   public String b(String var1) {
      StringTokenizer var2 = new StringTokenizer(var1, "/", true);
      StringBuffer var3 = new StringBuffer();
      String var4 = c("_ZF[39>[X=<$AL+3?IS1>$").substring(1);

      String var6;
      for(String var5 = c("5>@A29<P[&/3KS95>P4[").substring(0, c("5>@A29<P[&/3KS95>P4[").length() - 1); var2.hasMoreTokens(); var3.append(var6)) {
         var6 = var2.nextToken();
         if(var6.equals("/")) {
            var6 = var2.nextToken();
            if(var6.startsWith(var4)) {
               var6 = var6.substring(var4.length());
            } else {
               var3.append("/");
            }
         }

         if(var6.endsWith(var5)) {
            var6 = var6.substring(0, var6.length() - var5.length());
            var2.nextToken();
         }
      }

      return var3.toString();
   }

   public static void main(String[] var0) {
      jindent.javasqlj.a.a var1 = new jindent.javasqlj.a.a();
      byte[] var2;
      if(var0.length == 0) {
         try {
            var2 = new byte[System.in.available()];
            System.in.read(var2);
            System.out.print(var1.a(new String(var2)));
         } catch (Exception var4) {
            System.err.println(var4);
         }
      } else {
         try {
            var2 = new byte[System.in.available()];
            System.in.read(var2);
            System.out.print(var1.b(new String(var2)));
         } catch (Exception var3) {
            System.err.println(var3);
         }
      }

   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 112;
            break;
         case 1:
            var10003 = 112;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 30;
            break;
         default:
            var10003 = 116;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
