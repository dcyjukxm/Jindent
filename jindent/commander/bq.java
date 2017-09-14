package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bq implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bq(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      InstrumentedSourceTextPane.b(this.a).setValue(12);
   }
}
