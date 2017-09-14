package jindent.customizer.preview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$2 implements ActionListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$2(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.addExternPreviewFile();
   }
}
