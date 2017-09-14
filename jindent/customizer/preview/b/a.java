package jindent.customizer.preview.b;

import jindent.SettingsUtils;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.PluginFile;
import jindent.plugin.file.PluginFileException;

public class a implements PluginFile {
   private String a;
   private jindent.customizer.preview.c.a b;

   public a(jindent.customizer.preview.c.a var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public String getFullFilename() {
      return this.a;
   }

   public String getShortFilename() {
      return SettingsUtils.extractFilename(this.a);
   }

   public void a(String var1) throws PluginFileException {
      this.b.a().setText(var1);
   }

   public String a() throws PluginFileException {
      return this.b.a().getText();
   }

   public boolean isWritable() {
      return true;
   }

   public PluginEditor getEditor() {
      return this.b;
   }
}
