package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bl implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bl(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.h();
   }
}
