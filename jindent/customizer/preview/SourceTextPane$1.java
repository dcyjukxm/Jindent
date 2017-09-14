package jindent.customizer.preview;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import jindent.customizer.preview.SourceTextPane;

class SourceTextPane$1 implements MouseListener {
   private final SourceTextPane a;

   SourceTextPane$1(SourceTextPane var1) {
      this.a = var1;
   }

   public void mouseClicked(MouseEvent var1) {
      int var2 = this.a.viewToModel(var1.getPoint());
      int var3 = SourceTextPane.access$000(this.a, var2);
      this.a.setShowLine(var3);
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
