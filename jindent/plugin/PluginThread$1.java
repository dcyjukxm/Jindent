package jindent.plugin;

import jindent.plugin.PluginThread;
import jindent.plugin.report.ReportList;

class PluginThread$1 implements Runnable {
   private final ReportList a;
   private final PluginThread b;

   PluginThread$1(PluginThread var1, ReportList var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      this.b.showReportList(this.a);
   }
}
