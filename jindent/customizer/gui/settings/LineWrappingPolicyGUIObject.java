package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class LineWrappingPolicyGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();

   public LineWrappingPolicyGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{1};
   }

   static {
      j.add(c("\u007f#\u0003\u000bE\f2\t\u0017AX%\bW\u0000E.\u000f\tEM3\t[RI!\b\u001aBE,\u0005\u000fY\fh\u001e\u001eCC-\u0001\u001eNH%\bR"));
      j.add(c("\u007f)\u0001\u000bLIlL\bAZ%L\bPM#\t"));
   }

   private static String c(String var0) {
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
            var10003 = 64;
            break;
         case 2:
            var10003 = 108;
            break;
         case 3:
            var10003 = 123;
            break;
         default:
            var10003 = 32;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
