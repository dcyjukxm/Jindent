package jindent.util.swing;

import javax.swing.SwingUtilities;
import jindent.util.swing.SwingWorker;

class i implements Runnable {
   private final Runnable a;
   private final SwingWorker b;

   i(SwingWorker var1, Runnable var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         SwingWorker.access$000(this.b, this.b.construct());
      } finally {
         SwingWorker.access$100(this.b).b();
      }

      SwingUtilities.invokeLater(this.a);
   }
}
