package jindent.customizer;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.event.CustomizerEvent;

class CustomizerTabbedPane$2 implements AncestorListener {
   private final CustomizerData a;
   private final CustomizerTabbedPane b;

   CustomizerTabbedPane$2(CustomizerTabbedPane var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void ancestorAdded(AncestorEvent var1) {
      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 2, this.b));
   }

   public void ancestorRemoved(AncestorEvent var1) {
      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 4, this.b));
   }

   public void ancestorMoved(AncestorEvent var1) {
      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 2, this.b));
   }
}
