package jindent.util.swing.b;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import jindent.util.swing.b.SwingInfoDialog;

class c implements Runnable {
   private final JScrollPane a;
   private final SwingInfoDialog b;

   c(SwingInfoDialog var1, JScrollPane var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      JScrollBar var1 = this.a.getHorizontalScrollBar();
      var1.setValue(0);
      JScrollBar var2 = this.a.getVerticalScrollBar();
      var2.setValue(0);
   }
}
