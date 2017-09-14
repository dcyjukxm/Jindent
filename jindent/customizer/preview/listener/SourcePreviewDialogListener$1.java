package jindent.customizer.preview.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.preview.listener.SourcePreviewDialogListener;

class SourcePreviewDialogListener$1 implements ActionListener {
   private final SourcePreviewDialogListener a;

   SourcePreviewDialogListener$1(SourcePreviewDialogListener var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      if(SourcePreviewDialogListener.access$000(this.a) != null && SourcePreviewDialogListener.access$100(this.a)) {
         this.a.disposeDialog();
      }

      SourcePreviewDialogListener.access$200(this.a).stop();
   }
}
