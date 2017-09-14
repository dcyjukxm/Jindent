package jindent.b;

import java.util.ArrayList;
import java.util.List;
import jindent.b.c;
import jindent.formatter.InternalFormatter;

public class a extends InternalFormatter {
   public static final String NAME = "C/C++ Header Formatter";
   public static final List DEFAULT_EXTENSIONS = new ArrayList();

   public a() {
      super(new c());
   }

   static {
      DEFAULT_EXTENSIONS.add("h");
      DEFAULT_EXTENSIONS.add(b("/ "));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 71;
            break;
         case 1:
            var10003 = 72;
            break;
         case 2:
            var10003 = 59;
            break;
         case 3:
            var10003 = 27;
            break;
         default:
            var10003 = 40;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
