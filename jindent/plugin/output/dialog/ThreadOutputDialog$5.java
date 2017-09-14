package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$5 implements Runnable {
   private final boolean a;
   private final ThreadOutputDialog b;

   ThreadOutputDialog$5(ThreadOutputDialog var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.b).setOutputVisible(this.a);
   }
}
