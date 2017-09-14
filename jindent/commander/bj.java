package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bj implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bj(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      boolean var2 = !InstrumentedSourceTextPane.a(this.a).getShowTabStops();
      InstrumentedSourceTextPane.a(this.a).setShowTabStops(var2);
   }
}
