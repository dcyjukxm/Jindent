package jindent.customizer.preview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$5 implements ActionListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$5(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      boolean var2 = !SourcePreviewPane.access$100(this.a).getShowSpaces();
      SourcePreviewPane.access$100(this.a).setShowSpaces(var2);
      if(SourcePreviewPane.access$200(this.a)) {
         SourcePreviewPane.access$300(this.a).setShowSpaces(var2);
      }

   }
}
