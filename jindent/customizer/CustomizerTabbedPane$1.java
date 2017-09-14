package jindent.customizer;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.event.CustomizerEvent;

class CustomizerTabbedPane$1 implements ChangeListener {
   private final CustomizerData a;
   private final CustomizerTabbedPane b;

   CustomizerTabbedPane$1(CustomizerTabbedPane var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void stateChanged(ChangeEvent var1) {
      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 2, this.b));
   }
}
