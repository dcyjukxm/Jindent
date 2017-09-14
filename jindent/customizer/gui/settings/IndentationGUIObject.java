package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class IndentationGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();

   public IndentationGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      j.add(c("/\u000e;S\u0013\u001fArS\u0018\u000e\u000fo"));
      j.add(c("\"\u000f\u007fX\u0012\u001f"));
      j.add(c("*\u0014oR\u0011\n\u0015r^\\\u0002\u000f\u007fX\u0012\u001fA3N\u0011\n\u0013o\u001d\u0015\u0005\u0005~S\bB"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 107;
            break;
         case 1:
            var10003 = 97;
            break;
         case 2:
            var10003 = 27;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 124;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
