package jindent.plugin.b;

import jindent.commander.CommanderFrame;
import jindent.plugin.PluginThread;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;

public class e extends PluginThread {
   private CommanderFrame t;

   public e(CommanderFrame var1) {
      super(true, false, var1.h());
      this.t = var1;
      this.setActivationWindow(var1);
      this.setWindowsMode(true);
   }

   public void showReportList(ReportList var1) {
      super.showReportList(var1);
      this.t.j().update(var1);
   }

   public void showReport(Report var1) {
      super.showReport(var1);
   }

   public void stop() {
      super.stop();
      this.t.a();
      this.t.b();
   }
}
