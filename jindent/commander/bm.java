package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.InstrumentedSourceTextPane;

class bm implements ActionListener {
   private final InstrumentedSourceTextPane a;

   bm(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      boolean var2 = !InstrumentedSourceTextPane.a(this.a).getShowLineBreaks();
      InstrumentedSourceTextPane.a(this.a).setShowLineBreaks(var2);
   }
}
