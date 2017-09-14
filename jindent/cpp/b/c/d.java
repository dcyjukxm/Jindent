package jindent.cpp.b.c;

import jindent.formatter.p;

public class d {
   public static boolean a(String var0) {
      return jindent.cpp.b.c.b.a.d(var0);
   }

   public static boolean b(String var0) {
      if(jindent.cpp.b.c.b.a.d(var0)) {
         var0 = jindent.cpp.b.c.b.a.e(var0);
      }

      return a(var0, l("#\u001a")) || a(var0, l("#\u001a*Fz")) || a(var0, l("#\u001a Gy,"));
   }

   public static boolean c(String var0) {
      if(jindent.cpp.b.c.b.a.d(var0)) {
         var0 = jindent.cpp.b.c.b.a.e(var0);
      }

      return a(var0, l("/\u0010=F")) || a(var0, l("/\u0010\'E"));
   }

   public static boolean d(String var0) {
      if(jindent.cpp.b.c.b.a.d(var0)) {
         var0 = jindent.cpp.b.c.b.a.e(var0);
      }

      return a(var0, l("/\u0012*Jz"));
   }

   public static boolean e(String var0) {
      return a(var0, l("#\u0012-Oi.\u0019"));
   }

   public static boolean f(String var0) {
      return a(var0, l(":\u000e/Dq+"));
   }

   public static boolean g(String var0) {
      return a(var0, l("=\u001d<Mu$\u001b")) || a(var0, l("/\u000e<Ln"));
   }

   public static boolean h(String var0) {
      return a(var0, l(".\u0019(Jr/")) || a(var0, l("?\u0012*Fz"));
   }

   public static boolean i(String var0) {
      return a(var0, l("&\u0015 F"));
   }

   public static boolean j(String var0) {
      return var0 != null && var0.length() > 0 && var0.charAt(0) == 35;
   }

   public static boolean a(String var0, String var1) {
      if(var0 != null && var0.length() != 0 && var0.charAt(0) == 35) {
         int var2 = var0.indexOf(var1);
         if(var2 == -1) {
            return false;
         } else {
            for(int var3 = 1; var3 < var2; ++var3) {
               char var4 = var0.charAt(var3);
               if(var4 != 32 && var4 != 9) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean k(String var0) {
      if(jindent.cpp.b.c.b.a.d(var0)) {
         var0 = jindent.cpp.b.c.b.a.e(var0);
      }

      var0 = p.a(var0);
      return var0 != null && var0.length() != 0 && var0.charAt(0) == 35;
   }

   private static String l(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 74;
            break;
         case 1:
            var10003 = 124;
            break;
         case 2:
            var10003 = 78;
            break;
         case 3:
            var10003 = 35;
            break;
         default:
            var10003 = 28;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
