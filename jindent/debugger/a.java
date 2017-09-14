package jindent.debugger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a {
   private static final boolean a = false;
   private static final boolean b = System.getProperty(d("E)\u000f$9A4O$9M5\u0006")) != null;

   private static void a(String var0) {
      try {
         FileWriter var1 = new FileWriter(d("e)\u000f$9A4O,3H"), true);

         try {
            SimpleDateFormat var2 = new SimpleDateFormat(d("V9\u00189qb\rL$8\u000f(\tz1Bz\u00123"));
            Date var3 = new Date();
            var1.write("[" + var2.format(var3) + d("r`"));
         } catch (Exception var4) {
            ;
         }

         var1.write(var0);
         var1.write("\n");
         var1.close();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public static void b(String var0) {
      if(b) {
         System.out.println(var0);
      }

   }

   public static void a() {
      b("");
   }

   public static void c(String var0) {
      if(b) {
         System.out.print(var0);
      }

   }

   public static void a(Exception var0) {
      if(b) {
         System.out.print(a((Throwable)var0));
      }

   }

   public static void a(Error var0) {
      if(b) {
         System.out.print(a((Throwable)var0));
      }

   }

   public static String a(Throwable var0) {
      try {
         StringWriter var1 = new StringWriter();
         PrintWriter var2 = new PrintWriter(var1);
         var0.printStackTrace(var2);
         var2.close();
         var1.close();
         return var1.toString();
      } catch (IOException var3) {
         return d("j2\u0013/.\u000f7\t)0J`\u0002/2Y%\u001345A\'A3(N#\n`(]!\u0002%r");
      }
   }

   public static boolean b() {
      return b;
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 47;
            break;
         case 1:
            var10003 = 64;
            break;
         case 2:
            var10003 = 97;
            break;
         case 3:
            var10003 = 64;
            break;
         default:
            var10003 = 92;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
