package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bp implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bp(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      InstrumentedSourceTextPane.b(this.a).setValue(InstrumentedSourceTextPane.b(this.a).getValue() + 1);
   }
}
