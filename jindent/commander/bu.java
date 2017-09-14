package jindent.commander;

import java.awt.Container;
import javax.swing.JDialog;
import jindent.commander.CommanderFrame;
import jindent.commander.JindentProject;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class bu extends SwingWorker {
   private final String c;
   private final JindentProject d;
   private final CommanderFrame e;

   bu(CommanderFrame var1, String var2, JindentProject var3) {
      this.e = var1;
      this.c = var2;
      this.d = var3;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(SwingUtils.findWindow((Container)this.e), a("jO\u0001Q\u0000_\u0003\u0013Q\u001aN\u0003\u0013X\u001aVFDG\u0001SW\r^\u0014\u001aS\u0016_\u0019_@\u0010\u001e]\u0014"));
      var1.setVisible(true);
      CommanderFrame.a(this.e, this.c, this.d);
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
            var10003 = 58;
            break;
         case 1:
            var10003 = 35;
            break;
         case 2:
            var10003 = 100;
            break;
         case 3:
            var10003 = 48;
            break;
         default:
            var10003 = 115;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
