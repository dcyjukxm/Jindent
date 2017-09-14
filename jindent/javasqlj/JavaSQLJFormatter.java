package jindent.javasqlj;

import java.util.Collections;
import java.util.List;
import jindent.formatter.InternalFormatter;
import jindent.javasqlj.b;

public class JavaSQLJFormatter extends InternalFormatter {
   public static final String NAME = "Java/SQLJ Formatter";
   public static final List DEFAULT_EXTENSIONS = Collections.singletonList(b("\u000f*`e"));

   public JavaSQLJFormatter() {
      super(new b());
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 124;
            break;
         case 1:
            var10003 = 91;
            break;
         case 2:
            var10003 = 12;
            break;
         case 3:
            var10003 = 15;
            break;
         default:
            var10003 = 102;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
