package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$1 implements Runnable {
   private final ThreadOutputDialog a;

   ThreadOutputDialog$1(ThreadOutputDialog var1) {
      this.a = var1;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.a).init();
   }
}
