package jindent.plugin.b.c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.ByteArrayDestinationFile;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginFileException;

public class a implements PluginDestinationFile, ByteArrayDestinationFile {
   private File a;
   private PluginEditor b;

   public a(File var1, PluginEditor var2) {
      this.a = var1;
      this.b = var2;
   }

   public String getFullFilename() {
      return this.a.getAbsolutePath();
   }

   public String getShortFilename() {
      return this.a.getName();
   }

   public void setContent(byte[] var1) throws PluginFileException {
      try {
         File var2 = this.a.getParentFile();
         if(!var2.exists()) {
            var2.mkdirs();
         }

         FileOutputStream var3 = new FileOutputStream(this.a);
         var3.write(var1);
         var3.close();
      } catch (IOException var4) {
         throw new PluginFileException(var4.getLocalizedMessage());
      }
   }

   public boolean isWritable() {
      return this.a.exists()?this.a.canWrite():true;
   }

   public File a() {
      return this.a;
   }

   public PluginEditor getEditor() {
      return this.b;
   }
}
