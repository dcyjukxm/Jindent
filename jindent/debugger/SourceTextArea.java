package jindent.debugger;

import javax.swing.JTextArea;
import jindent.debugger.Monitor;
import jindent.debugger.b;

public class SourceTextArea extends JTextArea {
   JTextArea a = this;
   Monitor b;

   public SourceTextArea(Monitor var1, String var2) {
      super(var2);
      this.b = var1;
      b var3 = new b(this);
      this.addCaretListener(var3);
   }
}
