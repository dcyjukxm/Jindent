package jindent.util.swing;

import jindent.util.swing.SwingWorker;

class h implements Runnable {
   private final SwingWorker a;

   h(SwingWorker var1) {
      this.a = var1;
   }

   public void run() {
      this.a.finished();
   }
}
