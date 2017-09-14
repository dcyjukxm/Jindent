package jindent.customizer.preview;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$7 implements ChangeListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$7(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      float var3 = (float)var2.getValue();
      SourcePreviewPane.access$100(this.a).initFont(var3);
      if(SourcePreviewPane.access$200(this.a)) {
         SourcePreviewPane.access$300(this.a).initFont(var3);
      }

   }
}
