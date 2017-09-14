package jindent.util.c;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import jindent.util.c.c;

public class b {
   public static final jindent.util.c.a CONSOLE_OUTPUT = new jindent.util.c.a();
   // $FF: synthetic field
   static Class a;

   public static void a(Object var0, c var1) {
      Class var2 = null;
      Class var3 = null;

      try {
         var2 = Class.forName(b("\\+\u0014ks\u00189\u0015ceQd(LyW\'\u0007"));
         var3 = Class.forName(b("\\+\u0014ks\u00189\u0015ceQd(NbW&\rm"));
      } catch (ClassNotFoundException var11) {
         a(var1.f(), var1.g());
         return;
      }

      Class var4;
      Constructor var5;
      if(var0 != null && !var2.isInstance(var0)) {
         if(var0.getClass().isInstance(var3)) {
            try {
               var4 = Class.forName(b("\\#\fnnX>L\u007f\u007f_&Ly|_$\u0005$i\u0018\u0019\u0015ceQ\u0003\fldr#\u0003fdQ"));
               var5 = var4.getConstructor(new Class[]{var3, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a});
               var5.newInstance(new Object[]{var0, var1.e(), var1.b(), var1.d(), var1.c(), var1.a()});
            } catch (Throwable var9) {
               var9.printStackTrace();
               System.err.println();
               System.err.println(b("s8\u0010ey\u0016=\ncgSj\u0001xnW>\u000bdl\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
               System.err.println(b("o%\u0017*eS/\u0006*\u007fYj\u0010\u007fe\u0016+\f*S\u0007{BynD<\u0007x+B%BynSj\u0016bn\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
            }
         } else if(var0 == CONSOLE_OUTPUT) {
            a(var1.f(), var1.g());
         } else if(var0.getClass().getName().equals(b("Y8\u0005$nU&\u000bzxSd\u0011}\u007f\u0018=\u000bnlS>\u0011$X^/\u000ef"))) {
            try {
               var4 = var0.getClass();
               Class var12 = Class.forName(b("Y8\u0005$nU&\u000bzxSd\u0011}\u007f\u0018=\u000bnlS>\u0011$X^/\u000ef"));
               Class var6 = Class.forName(b("\\#\fnnX>L\u007f\u007f_&Ly|Bd\u0011bnZ&LY\\b\u0003\flde\"\u0007fg"));
               Method var7 = var6.getMethod(b("_$\u0014e`S"), new Class[]{var12, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a});
               var7.invoke((Object)null, new Object[]{var0, var1.e(), var1.b(), var1.d(), var1.c(), var1.f()});
            } catch (Throwable var8) {
               var8.printStackTrace();
               System.err.println();
               System.err.println(b("s8\u0010ey\u0016=\ncgSj\u0001xnW>\u000bdl\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
               System.err.println(b("o%\u0017*eS/\u0006*\u007fYj\u000bdxB+\u000ef+e\u001d6*dDj\u0010\u007fe\u0016+\f*S\u0007{BynD<\u0007x+B%BynSj\u0016bn\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
            }
         }
      } else {
         try {
            var4 = Class.forName(b("\\#\fnnX>L\u007f\u007f_&Ly|_$\u0005$i\u0018\u0019\u0015ceQ\u0003\fldr#\u0003fdQ"));
            var5 = var4.getConstructor(new Class[]{var2, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a, a == null?(a = a(b("\\+\u0014k%Z+\fm%e>\u0010ceQ"))):a});
            var5.newInstance(new Object[]{var0, var1.e(), var1.b(), var1.d(), var1.c(), var1.a()});
         } catch (Throwable var10) {
            var10.printStackTrace();
            System.err.println();
            System.err.println(b("s8\u0010ey\u0016=\ncgSj\u0001xnW>\u000bdl\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
            System.err.println(b("o%\u0017*eS/\u0006*\u007fYj\u0010\u007fe\u0016+\f*S\u0007{BynD<\u0007x+B%BynSj\u0016bn\u0016>\u0010cjZj\u0011zgW9\n*xU8\u0007oe\u0018"));
         }
      }

   }

   private static void a(String var0, boolean var1) {
      System.out.println(var0);
      if(var1) {
         System.out.println();
         System.out.print(b("\bj;e~\u0016\"\u0003|n\u0016>\r*|W#\u0016*8\u00169\u0007idX.\u0011*\u007fYj\u0001eeB#\f\u007fn"));

         try {
            for(int var2 = 0; var2 < 3; ++var2) {
               System.out.print(".");
               Thread.sleep(1000L);
            }
         } catch (InterruptedException var3) {
            ;
         }

         System.out.println();
         System.out.println();
      }

   }

   // $FF: synthetic method
   static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 54;
            break;
         case 1:
            var10003 = 74;
            break;
         case 2:
            var10003 = 98;
            break;
         case 3:
            var10003 = 10;
            break;
         default:
            var10003 = 11;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
