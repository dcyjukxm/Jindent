package jindent.plugin;

import jindent.plugin.report.Report;

public interface PresentationContext {
   Object getActivationWindow();

   boolean isWindowsMode();

   void setMessage(int var1, String var2);

   void showReport(Report var1);

   void setExitCode(int var1);
}
