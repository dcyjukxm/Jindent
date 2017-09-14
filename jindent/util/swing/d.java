package jindent.util.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import jindent.util.swing.TristateCheckBox;
import jindent.util.swing.l;

class d extends MouseAdapter {
   private final TristateCheckBox a;

   d(TristateCheckBox var1) {
      this.a = var1;
   }

   public void mousePressed(MouseEvent var1) {
      this.a.grabFocus();
      l.a(TristateCheckBox.a(this.a));
   }
}
