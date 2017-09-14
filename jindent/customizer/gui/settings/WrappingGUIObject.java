package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class WrappingGUIObject extends SelectionGUIObject {
   private static transient Vector j = new Vector();

   public WrappingGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{3, 2, 1};
   }

   static {
      j.add(c(",c\b\u000bj>"));
      j.add(c("\"a_\u000ev n\u0011\u000e"));
      j.add(c("$i_\u0006z#j_\u000fk.j\u001a\u000e`"));
      j.add(c("#j\t\u000fa"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 77;
            break;
         case 1:
            var10003 = 15;
            break;
         case 2:
            var10003 = 127;
            break;
         case 3:
            var10003 = 106;
            break;
         default:
            var10003 = 19;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
