package jindent.plugin.report;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.plugin.report.ReportListDialog;

class ReportListDialog$1 implements ActionListener {
   private final ReportListDialog a;

   ReportListDialog$1(ReportListDialog var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      this.a.ok();
   }
}
