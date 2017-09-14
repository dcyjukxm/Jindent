package jindent.util.swing;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import jindent.util.swing.TristateCheckBox;
import jindent.util.swing.l;

class TristateCheckBox$2 extends AbstractAction {
   private final TristateCheckBox a;

   TristateCheckBox$2(TristateCheckBox var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.grabFocus();
      l.a(TristateCheckBox.a(this.a));
   }
}
