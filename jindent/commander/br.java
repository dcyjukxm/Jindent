package jindent.commander;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JViewport;
import jindent.commander.InstrumentedSourceTextPane;

class br implements ActionListener {
   private final InstrumentedSourceTextPane a;

   br(InstrumentedSourceTextPane var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      JViewport var2 = InstrumentedSourceTextPane.c(this.a).getViewport();
      Dimension var3 = var2.getExtentSize();
      int var4 = InstrumentedSourceTextPane.a(this.a).getMaxColumn() + 1;
      float var5 = (float)var3.getWidth() / (float)var4;
      int var6 = InstrumentedSourceTextPane.a(this.a, var5);
      InstrumentedSourceTextPane.b(this.a).setValue(var6);
   }
}
