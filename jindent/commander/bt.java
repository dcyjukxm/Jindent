package jindent.commander;

import java.awt.Container;
import javax.swing.JDialog;
import jindent.JindentSettings;
import jindent.commander.CommanderFrame;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class bt extends SwingWorker {
   private final String c;
   private final JindentSettings d;
   private final CommanderFrame e;

   bt(CommanderFrame var1, String var2, JindentSettings var3) {
      this.e = var1;
      this.c = var2;
      this.d = var3;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(SwingUtils.findWindow((Container)this.e), a("\u0007M\u0006ea2\u0001\u0014e{#\u0001\u0014l{;DCs`>U\njuwR\u0006pf>O\u0004w<y\u000f"));
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
            var10003 = 87;
            break;
         case 1:
            var10003 = 33;
            break;
         case 2:
            var10003 = 99;
            break;
         case 3:
            var10003 = 4;
            break;
         default:
            var10003 = 18;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
