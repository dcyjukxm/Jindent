package jindent.commander;

import java.awt.Container;
import javax.swing.JDialog;
import jindent.commander.CommanderFrame;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class bv extends SwingWorker {
   private final String c;
   private final CommanderFrame d;

   bv(CommanderFrame var1, String var2) {
      this.d = var1;
      this.c = var2;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(SwingUtils.findWindow((Container)this.d), a("Da|\u001f*q-n\u001f0`-n\u00160xh9\f<uip\u0010>4~|\n-}c~\rw:#"));
      var1.setVisible(true);
      CommanderFrame.b(this.d, this.c);
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
            var10003 = 20;
            break;
         case 1:
            var10003 = 13;
            break;
         case 2:
            var10003 = 25;
            break;
         case 3:
            var10003 = 126;
            break;
         default:
            var10003 = 89;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
