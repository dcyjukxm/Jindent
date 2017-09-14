package jindent.plugin.output.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.plugin.output.dialog.ProgressDialog;

class ProgressDialog$1 implements ActionListener {
   private final ProgressDialog a;

   ProgressDialog$1(ProgressDialog var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.setStopMessage();
   }
}
