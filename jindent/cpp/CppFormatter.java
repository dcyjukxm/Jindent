package jindent.cpp;

import java.util.ArrayList;
import java.util.List;
import jindent.cpp.o;
import jindent.formatter.InternalFormatter;

public class CppFormatter extends InternalFormatter {
   public static final String NAME = "C++ Formatter";
   public static final List DEFAULT_EXTENSIONS = new ArrayList();

   public CppFormatter() {
      super(new o());
   }

   static {
      DEFAULT_EXTENSIONS.add(b("O\nB"));
      DEFAULT_EXTENSIONS.add(b("D\nB"));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 44;
            break;
         case 1:
            var10003 = 122;
            break;
         case 2:
            var10003 = 50;
            break;
         case 3:
            var10003 = 75;
            break;
         default:
            var10003 = 90;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
