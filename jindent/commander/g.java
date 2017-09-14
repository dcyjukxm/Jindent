package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.AboutDialog;

class g implements ActionListener {
   private final AboutDialog a;

   g(AboutDialog var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.a(var1);
   }
}
