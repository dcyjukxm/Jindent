package jindent.customizer.preview.a;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.ViewFactory;

public class NoWrapEditorKit extends StyledEditorKit {
   ViewFactory a = new jindent.customizer.preview.a.a();

   public ViewFactory getViewFactory() {
      return this.a;
   }
}
