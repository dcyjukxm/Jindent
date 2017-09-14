package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$2 implements Runnable {
   private final int a;
   private final ThreadOutputDialog b;

   ThreadOutputDialog$2(ThreadOutputDialog var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.b).setMaximum(this.a);
   }
}
