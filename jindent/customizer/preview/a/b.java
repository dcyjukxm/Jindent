package jindent.customizer.preview.a;

import javax.swing.text.Element;
import javax.swing.text.ParagraphView;

public class b extends ParagraphView {
   public b(Element var1) {
      super(var1);
   }

   public void layout(int var1, int var2) {
      super.layout(32767, var2);
   }

   public float getMinimumSpan(int var1) {
      return super.getPreferredSpan(var1);
   }
}
