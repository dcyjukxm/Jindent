package jindent.util.swing.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.util.swing.b.SwingInfoDialog;

class b implements ActionListener {
   private final SwingInfoDialog a;

   b(SwingInfoDialog var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.dispose();
   }
}
