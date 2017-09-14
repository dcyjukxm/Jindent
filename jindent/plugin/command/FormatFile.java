package jindent.plugin.command;

import jindent.JindentSettings;
import jindent.formatter.InternalFormatter;
import jindent.plugin.PresentationContext;
import jindent.plugin.command.AbstractFormatFile;
import jindent.plugin.file.PluginFile;
import jindent.plugin.report.ReportList;

public class FormatFile extends AbstractFormatFile {
   public FormatFile(PluginFile var1) {
      super(var1);
   }

   protected void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3) {
   }

   public void beforeFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void afterFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void startCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void endCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }
}
