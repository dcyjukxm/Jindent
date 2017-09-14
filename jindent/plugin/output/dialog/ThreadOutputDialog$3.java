package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$3 implements Runnable {
   private final int a;
   private final ThreadOutputDialog b;

   ThreadOutputDialog$3(ThreadOutputDialog var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.b).setCurrent(this.a);
   }
}
