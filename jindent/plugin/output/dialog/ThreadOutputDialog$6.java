package jindent.plugin.output.dialog;

import jindent.plugin.output.dialog.ThreadOutputDialog;

class ThreadOutputDialog$6 implements Runnable {
   private final ThreadOutputDialog a;

   ThreadOutputDialog$6(ThreadOutputDialog var1) {
      this.a = var1;
   }

   public void run() {
      ThreadOutputDialog.access$000(this.a).setMessage(0, a("2YLv7=TK{5\u007f\u0016\f"));
      ThreadOutputDialog.access$000(this.a).setMessage(1, "");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 81;
            break;
         case 1:
            var10003 = 56;
            break;
         case 2:
            var10003 = 34;
            break;
         case 3:
            var10003 = 21;
            break;
         default:
            var10003 = 82;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
