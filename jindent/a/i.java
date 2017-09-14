package jindent.a;

import java.util.ArrayList;
import java.util.List;
import jindent.a.k;
import jindent.formatter.InternalFormatter;

public class i extends InternalFormatter {
   public static final String NAME = "C Formatter";
   public static final List DEFAULT_EXTENSIONS = new ArrayList();

   public i() {
      super(new k());
   }

   static {
      DEFAULT_EXTENSIONS.add("c");
      DEFAULT_EXTENSIONS.add(b("\rd"));
      DEFAULT_EXTENSIONS.add("h");
      DEFAULT_EXTENSIONS.add(b("\u0006o"));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 110;
            break;
         case 1:
            var10003 = 7;
            break;
         case 2:
            var10003 = 50;
            break;
         case 3:
            var10003 = 79;
            break;
         default:
            var10003 = 5;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
