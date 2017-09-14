package jindent.plugin.command;

import javax.swing.SwingUtilities;
import jindent.JindentSettings;
import jindent.formatter.Caret;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.plugin.PresentationContext;
import jindent.plugin.command.AbstractFormatFile;
import jindent.plugin.command.FormatEditorFile$1;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.PluginFile;
import jindent.plugin.report.ReportList;

public class FormatEditorFile extends AbstractFormatFile {
   private Caret c = null;

   public FormatEditorFile(PluginFile var1) {
      super(var1);
   }

   protected void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3) {
   }

   public void beforeFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
      var1.setCreateCaretHistory(true);
   }

   public void afterFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void startCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
      PluginEditor var5 = this.getSourceFile().getEditor();
      this.c = null;
      if(var5 != null) {
         int var6 = var5.getCaretLine();
         int var7 = var5.getCaretColumn();
         this.c = new Caret(var6, var7);
      }

   }

   public void endCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
      PluginEditor var5 = this.getSourceFile().getEditor();
      if(var5 != null) {
         Context var6 = var1.getContext();
         if(var6.getCaretHistoryMapper() != null) {
            Caret var7 = var6.getCaretHistoryMapper().getNewPositionCaret(this.c);
            if(var7 == null) {
               var7 = this.c;
            }

            Caret var8 = var7;

            try {
               SwingUtilities.invokeLater(new FormatEditorFile$1(this, var5, var8));
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }
      }

   }
}
