package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class PreProcessorIndentationGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();

   public PreProcessorIndentationGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[0];
   }

   static {
      j.add(c("<\u0012E\u0004\u0011]\nCC\u0019\u0014\f_\u0017_\u001e\u0011@\u0016\u0012\u0013"));
      j.add(c("4\u0010H\u0006\u0011\t^^\u0006\u0013\u001c\nE\u0015\u001a]\nCC\f\u0012\u000b^\u0000\u001a]\u001dC\u0007\u001a"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 125;
            break;
         case 1:
            var10003 = 126;
            break;
         case 2:
            var10003 = 44;
            break;
         case 3:
            var10003 = 99;
            break;
         default:
            var10003 = 127;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
