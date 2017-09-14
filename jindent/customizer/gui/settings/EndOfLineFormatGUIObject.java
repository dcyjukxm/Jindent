package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class EndOfLineFormatGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();

   public EndOfLineFormatGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      j.add(c("~a\u000e6\u0015\u0017\u007f\u001f<E\u001f{\b0RVz\u001b5\u0015Yf\u00154\u0015Vz\n,A\u0016"));
      j.add(c("{{\ty\u001dcW(yisRS"));
      j.add(c("jz\u0013!\u0015\u0017H6\u001f\u001c"));
      j.add(c("ru\u0019y\u001dcW(p"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 63;
            break;
         case 1:
            var10003 = 20;
            break;
         case 2:
            var10003 = 122;
            break;
         case 3:
            var10003 = 89;
            break;
         default:
            var10003 = 53;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
