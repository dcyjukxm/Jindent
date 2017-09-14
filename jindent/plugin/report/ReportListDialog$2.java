package jindent.plugin.report;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import jindent.plugin.report.ReportListDialog;

class ReportListDialog$2 implements WindowListener {
   private final ReportListDialog a;

   ReportListDialog$2(ReportListDialog var1) {
      this.a = var1;
   }

   public void windowOpened(WindowEvent var1) {
   }

   public void windowClosing(WindowEvent var1) {
   }

   public void windowClosed(WindowEvent var1) {
      this.a.ok();
   }

   public void windowIconified(WindowEvent var1) {
   }

   public void windowDeiconified(WindowEvent var1) {
   }

   public void windowActivated(WindowEvent var1) {
   }

   public void windowDeactivated(WindowEvent var1) {
   }
}
