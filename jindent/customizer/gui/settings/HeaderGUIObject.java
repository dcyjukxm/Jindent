package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class HeaderGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();

   public HeaderGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      j.add(c("Q\u0019}P6aV4P*p\u0004)\u001e7p\u0001}V<t\u00128L"));
      j.add(c("\\\u0018.[+aV3[.5\u001e8_=p\u0004}_7qV9[5p\u00028\u001e=p\u00028]-p\u0012}V<t\u00128L"));
      j.add(c("\\\u0018.[+aV2P5lV3[.5\u001e8_=p\u0004}W?5\u00182\u001e1p\u00179[+5\u001f.\u001e=p\u00028]-p\u0012"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 21;
            break;
         case 1:
            var10003 = 118;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 62;
            break;
         default:
            var10003 = 89;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
