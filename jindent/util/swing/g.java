package jindent.util.swing;

import java.awt.Component;
import java.io.File;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class g extends SwingWorker {
   private final File[] c;
   private final Component d;

   g(File[] var1, Component var2) {
      this.c = var1;
      this.d = var2;
   }

   public Object construct() {
      if(this.c == null) {
         return null;
      } else {
         String var1 = "";

         for(int var2 = 0; var2 < this.c.length; ++var2) {
            var1 = var1 + this.c[var2].getAbsolutePath() + "\n";
         }

         DialogUtils.showErrorDialog(SwingUtils.findWindow(this.d), a("\u0001\u001c8$T:\u00181kE<\u001a:$T<\u00188w\u001d1\u001d/aQ!\u001b/mW&T9k\u0012;\u001b)$W-\u001d.pA{T\tlW,T5eD0T?aW;T/a_:\u00028`\u00123\u00062i\u0012!\u001c8$B\'\u001b7aQ!NW") + var1);
         return null;
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 85;
            break;
         case 1:
            var10003 = 116;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 4;
            break;
         default:
            var10003 = 50;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
