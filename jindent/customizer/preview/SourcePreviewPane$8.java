package jindent.customizer.preview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$8 implements ActionListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$8(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      SourcePreviewPane.access$400(this.a).setValue(SourcePreviewPane.access$400(this.a).getValue() + 1);
   }
}
