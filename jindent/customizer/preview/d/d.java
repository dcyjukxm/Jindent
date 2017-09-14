package jindent.customizer.preview.d;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.preview.d.ExternalFilesPopupMenu;

public class d extends MouseInputAdapter {
   private SourcePreviewPane a;

   public d(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void mouseReleased(MouseEvent var1) {
      if(var1.getModifiers() == 4 && this.a.isEnabled()) {
         (new ExternalFilesPopupMenu(this.a)).show(var1.getComponent(), var1.getX(), var1.getY());
      }

   }
}
