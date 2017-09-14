package jindent.customizer.preview;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JViewport;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$10 implements ActionListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$10(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      JViewport var2 = SourcePreviewPane.access$500(this.a).getViewport();
      Dimension var3 = var2.getExtentSize();
      int var4 = SourcePreviewPane.access$600(this.a).getMaxColumn() + 1;
      float var5 = (float)var3.getWidth() / (float)var4;
      int var6 = SourcePreviewPane.access$700(this.a, var5);
      SourcePreviewPane.access$400(this.a).setValue(var6);
   }
}
