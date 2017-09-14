package jindent.java;

import java.util.Collections;
import java.util.List;
import jindent.formatter.InternalFormatter;
import jindent.java.c;

public class JavaFormatter extends InternalFormatter {
   public static final String NAME = "Java Formatter";
   public static final List DEFAULT_EXTENSIONS = Collections.singletonList(b("r\u0017\\y"));

   public JavaFormatter() {
      super(new c());
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 24;
            break;
         case 1:
            var10003 = 118;
            break;
         case 2:
            var10003 = 42;
            break;
         case 3:
            var10003 = 24;
            break;
         default:
            var10003 = 87;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
