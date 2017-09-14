package jindent.customizer.preview;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$11 implements ComponentListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$11(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void componentHidden(ComponentEvent var1) {
   }

   public void componentMoved(ComponentEvent var1) {
   }

   public void componentResized(ComponentEvent var1) {
      if(!SourcePreviewPane.access$800(this.a)) {
         SourcePreviewPane.access$900(this.a).setDividerLocation(0.6666666666666666D);
         SourcePreviewPane.access$802(this.a, true);
      }

   }

   public void componentShown(ComponentEvent var1) {
   }
}
