package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bk implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bk(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      boolean var2 = !InstrumentedSourceTextPane.a(this.a).getShowSpaces();
      InstrumentedSourceTextPane.a(this.a).setShowSpaces(var2);
   }
}
