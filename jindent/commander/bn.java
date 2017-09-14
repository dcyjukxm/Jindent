package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bn implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bn(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      float var2 = (float)InstrumentedSourceTextPane.b(this.a).getValue();
      InstrumentedSourceTextPane.b(this.a).setValue(InstrumentedSourceTextPane.b(this.a).getValue() - 1);
   }
}
