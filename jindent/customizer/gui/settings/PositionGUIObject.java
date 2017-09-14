package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class PositionGUIObject extends SelectionGUIObject {
   private static transient Vector j = new Vector();

   public PositionGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{2};
   }

   static {
      j.add(c("\"*j"));
      j.add(c("4*nD\u000e;"));
      j.add(c("8*tU"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 86;
            break;
         case 1:
            var10003 = 69;
            break;
         case 2:
            var10003 = 26;
            break;
         case 3:
            var10003 = 48;
            break;
         default:
            var10003 = 97;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
