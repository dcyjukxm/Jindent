package jindent.customizer.preview.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.SourcePreviewPane;

class a implements ActionListener {
   private String a;
   private SourcePreviewPane b;

   public a(String var1, SourcePreviewPane var2) {
      this.a = var1;
      this.b = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      this.b.updateExternalPreview(this.a);
   }
}
