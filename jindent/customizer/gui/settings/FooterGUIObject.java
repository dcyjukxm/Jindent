package jindent.customizer.gui.settings;

import java.util.Vector;
import jindent.customizer.gui.settings.SelectionGUIObject;

public class FooterGUIObject extends SelectionGUIObject {
   private static transient Vector j = new Vector();

   public FooterGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      j.add(c("-lRt[\u001d#\u001btG\fq\u0006:Z\ftR|[\u0006w\u0017h"));
      j.add(c(" m\u0001\u007fF\u001d#\u001c\u007fCIe\u001du@\fqR{Z\r#\u0016\u007fX\fw\u0017:P\fw\u0017y@\fgR|[\u0006w\u0017h"));
      j.add(c(" m\u0001\u007fF\u001d#\u001dtX\u0010#\u001c\u007fCIe\u001du@\fqRsRIm\u001d:R\u0006l\u0006\u007fFIj\u0001:P\fw\u0017y@\fg"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 105;
            break;
         case 1:
            var10003 = 3;
            break;
         case 2:
            var10003 = 114;
            break;
         case 3:
            var10003 = 26;
            break;
         default:
            var10003 = 52;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
