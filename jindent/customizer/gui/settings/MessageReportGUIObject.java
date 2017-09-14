package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class MessageReportGUIObject extends SelectionGUIObject {
   private static transient Vector j = new Vector();

   public MessageReportGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      j.add(c("\u0014\u000b\b\u0004"));
      j.add(c("\u0017\u0001\u0015\u0012F\u001d\u0001\u0015A\u0001Z\u0013\u0007\u0013I\u0013\n\u0001\u0012"));
      j.add(c("\u0015\n\n\u0018\u0007\r\u0005\u0014\u000fN\u0014\u0003\u0015"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 122;
            break;
         case 1:
            var10003 = 100;
            break;
         case 2:
            var10003 = 102;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 39;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
