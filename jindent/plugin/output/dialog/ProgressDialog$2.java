package jindent.plugin.output.dialog;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import jindent.plugin.output.dialog.ProgressDialog;

class ProgressDialog$2 implements WindowListener {
   private final ProgressDialog a;

   ProgressDialog$2(ProgressDialog var1) {
      this.a = var1;
   }

   public void windowOpened(WindowEvent var1) {
   }

   public void windowClosing(WindowEvent var1) {
   }

   public void windowClosed(WindowEvent var1) {
      this.a.setStopMessage();
   }

   public void windowIconified(WindowEvent var1) {
   }

   public void windowDeiconified(WindowEvent var1) {
   }

   public void windowActivated(WindowEvent var1) {
   }

   public void windowDeactivated(WindowEvent var1) {
   }
}
