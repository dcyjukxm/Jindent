package jindent.customizer.preview;

import jindent.customizer.preview.SourcePreviewPane$12;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;

class SourcePreviewPane$12$1 extends Report {
   private final SourcePreviewPane$12 g;

   SourcePreviewPane$12$1(SourcePreviewPane$12 var1, PluginSourceFile var2, PluginDestinationFile var3, HistoryData var4) {
      super(var2, var3, var4);
      this.g = var1;
   }

   public String getTitle() {
      return this.b.getFullFilename();
   }
}
