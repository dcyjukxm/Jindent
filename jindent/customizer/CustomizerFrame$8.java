package jindent.customizer;

import javax.swing.JDialog;
import jindent.customizer.CustomizerFrame;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingWorker;

class CustomizerFrame$8 extends SwingWorker {
   private final String c;
   private final CustomizerFrame d;

   CustomizerFrame$8(CustomizerFrame var1, String var2) {
      this.d = var1;
      this.c = var2;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(this.d, a("\u0004\u0001\nfO1M\u0018fU M\u0018oU8\bOuY5\t\u0006i[t\u001e\nsH=\u0003\bt\u0012zC"));
      var1.setVisible(true);
      CustomizerFrame.access$400(this.d, this.c);
      CustomizerFrame.access$500(this.d, this.c);
      var1.dispose();
      return null;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 84;
            break;
         case 1:
            var10003 = 109;
            break;
         case 2:
            var10003 = 111;
            break;
         case 3:
            var10003 = 7;
            break;
         default:
            var10003 = 60;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
