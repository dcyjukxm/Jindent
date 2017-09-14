package jindent.plugin.b.c;

import java.io.File;
import java.io.IOException;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.ByteArraySourceFile;
import jindent.plugin.file.PluginFileException;
import jindent.plugin.file.PluginSourceFile;
import jindent.util.Utils;

public class c implements PluginSourceFile, ByteArraySourceFile {
   private File a;
   private PluginEditor b;

   public c(File var1, PluginEditor var2) {
      this.a = var1;
      this.b = var2;
   }

   public String getFullFilename() {
      return this.a.getAbsolutePath();
   }

   public String getShortFilename() {
      return this.a.getName();
   }

   public byte[] getContent() throws PluginFileException {
      try {
         return Utils.getBytesFromFile(this.a);
      } catch (IOException var2) {
         throw new PluginFileException(var2.getLocalizedMessage());
      }
   }

   public PluginEditor getEditor() {
      return this.b;
   }

   public File a() {
      return this.a;
   }
}
