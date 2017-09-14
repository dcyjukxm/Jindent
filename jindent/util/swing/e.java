package jindent.util.swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import jindent.util.swing.MultiLineCheckBox;

class e implements MouseListener {
   private final MultiLineCheckBox a;

   e(MultiLineCheckBox var1) {
      this.a = var1;
   }

   public void mouseClicked(MouseEvent var1) {
      if(MultiLineCheckBox.a(this.a).isEnabled()) {
         MultiLineCheckBox.a(this.a).setSelected(!MultiLineCheckBox.a(this.a).isSelected());
      }

   }

   public void mousePressed(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }
}
