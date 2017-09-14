package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$4 implements Runnable {
   private final int a;
   private final String b;
   private final ThreadOutputDialog c;

   ThreadOutputDialog$4(ThreadOutputDialog var1, int var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.c).setMessage(this.a, this.b);
   }
}
