package jindent.commander;

import java.awt.Container;
import javax.swing.JDialog;
import jindent.commander.CommanderFrame;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class bs extends SwingWorker {
   private final String c;
   private final CommanderFrame d;

   bs(CommanderFrame var1, String var2) {
      this.d = var1;
      this.c = var2;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(SwingUtils.findWindow((Container)this.d), a("M\nr\u000f\u0016xF`\u000f\fiF`\u0006\fq\u00037\u001c\u0000|\u0002~\u0000\u0002=\u0016e\u0001\u000fx\u0005c@K3"));
      var1.setVisible(true);
      CommanderFrame.a(this.d, this.c);
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
            var10003 = 29;
            break;
         case 1:
            var10003 = 102;
            break;
         case 2:
            var10003 = 23;
            break;
         case 3:
            var10003 = 110;
            break;
         default:
            var10003 = 101;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
