package jindent.plugin.report;

import java.util.Vector;
import jindent.plugin.report.Report;

public class ReportList {
   private Vector a = new Vector();

   public int countReports() {
      return this.a.size();
   }

   public Report getReportAt(int var1) {
      return (Report)this.a.elementAt(var1);
   }

   public void clear() {
      this.a.removeAllElements();
   }

   public void addReport(Report var1) {
      this.a.add(var1);
      var1.setParentReportList(this);
   }

   public boolean hasReport() {
      return this.countReports() > 0;
   }

   public boolean hasMessage() {
      int var1 = this.countReports();

      for(int var2 = 0; var2 < var1; ++var2) {
         Report var3 = this.getReportAt(var2);
         if(var3.getMessageList().countMessages() > 0) {
            return true;
         }
      }

      return false;
   }

   public boolean containsWarning() {
      int var1 = this.countReports();

      for(int var2 = 0; var2 < var1; ++var2) {
         Report var3 = this.getReportAt(var2);
         if(var3.getMessageList().containsWarningMessage()) {
            return true;
         }
      }

      return false;
   }

   public boolean containsError() {
      int var1 = this.countReports();

      for(int var2 = 0; var2 < var1; ++var2) {
         Report var3 = this.getReportAt(var2);
         if(var3.getMessageList().containsErrorMessage()) {
            return true;
         }
      }

      return false;
   }
}
