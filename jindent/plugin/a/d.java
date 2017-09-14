package jindent.plugin.a;

import jindent.plugin.PluginThread;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;

public class d extends PluginThread {
   private jindent.plugin.a.a.a t;

   public d(boolean var1, jindent.plugin.a.a.a var2) {
      super(false, var1, var2);
      this.t = var2;
      this.setActivationWindow((Object)null);
      this.setWindowsMode(false);
      this.setCreateExitCode(true);
   }

   public void showReportList(ReportList var1) {
   }

   public void showReport(Report var1) {
      super.showReport(var1);
      this.t.a(var1.toString());
   }
}
