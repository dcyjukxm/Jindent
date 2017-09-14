package jindent.customizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.AboutDialog;
import jindent.customizer.CustomizerFrame;
import jindent.util.swing.SwingUtils;

class CustomizerFrame$7 implements ActionListener {
   private final CustomizerFrame a;

   CustomizerFrame$7(CustomizerFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      AboutDialog var2 = new AboutDialog();
      var2.b().setVisible(true);
      var2.setUndecorated(false);
      var2.pack();
      SwingUtils.centerWindow(var2);
      var2.setVisible(true);
   }
}
