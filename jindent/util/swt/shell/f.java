package jindent.util.swt.shell;

import jindent.util.swt.shell.SWTInfoShell;
import org.eclipse.swt.widgets.Shell;

class f implements Runnable {
   private final Shell a;
   private final String b;
   private final String c;
   private final String d;
   private final String e;
   private final String f;

   f(Shell var1, String var2, String var3, String var4, String var5, String var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public void run() {
      new SWTInfoShell(this.a, this.b, this.c, this.d, this.e, this.f);
   }
}
