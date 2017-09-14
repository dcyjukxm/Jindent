package jindent.customizer;

import javax.swing.JDialog;
import jindent.customizer.CustomizerFrame;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingWorker;

class CustomizerFrame$9 extends SwingWorker {
   private final String c;
   private final CustomizerFrame d;

   CustomizerFrame$9(CustomizerFrame var1, String var2) {
      this.d = var1;
      this.c = var2;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(this.d, a("\u000bK!#`>\u00073#z/\u00073*z7Bd5a2S-,t{T!6g2I#1=u\t"));
      var1.setVisible(true);
      CustomizerFrame.access$600(this.d, this.c);
      CustomizerFrame.access$700(this.d, this.c);
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
            var10003 = 91;
            break;
         case 1:
            var10003 = 39;
            break;
         case 2:
            var10003 = 68;
            break;
         case 3:
            var10003 = 66;
            break;
         default:
            var10003 = 19;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
