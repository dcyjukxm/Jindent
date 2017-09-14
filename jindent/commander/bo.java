package jindent.commander;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jindent.commander.InstrumentedSourceTextPane;

class bo implements ChangeListener {
   private final InstrumentedSourceTextPane a;

   bo(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      float var3 = (float)var2.getValue();
      InstrumentedSourceTextPane.a(this.a).initFont(var3);
   }
}
