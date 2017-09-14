package jindent.customizer.preview.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.preview.d.ExternalFilesPopupMenu;

class b implements ActionListener {
   private final SourcePreviewPane a;
   private final ExternalFilesPopupMenu b;

   b(ExternalFilesPopupMenu var1, SourcePreviewPane var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.addExternPreviewFile();
   }
}
