package jindent.plugin;

import jindent.JindentSettings;
import jindent.formatter.InternalFormatter;
import jindent.plugin.FormatCommand;
import jindent.plugin.PresentationContext;
import jindent.plugin.report.ReportList;

class FormatCommand$1 implements Runnable {
   private final InternalFormatter a;
   private final JindentSettings b;
   private final ReportList c;
   private final PresentationContext d;
   private final FormatCommand e;

   FormatCommand$1(FormatCommand var1, InternalFormatter var2, JindentSettings var3, ReportList var4, PresentationContext var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void run() {
      this.e.format(this.a, this.b, this.c, this.d);
   }
}
