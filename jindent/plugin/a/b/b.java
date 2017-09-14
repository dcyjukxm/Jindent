package jindent.plugin.a.b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.ByteArrayDestinationFile;
import jindent.plugin.file.ByteArraySourceFile;
import jindent.plugin.file.PluginFile;
import jindent.plugin.file.PluginFileException;
import jindent.util.Utils;

public class b implements PluginFile, ByteArraySourceFile, ByteArrayDestinationFile {
   private File a;

   public b(File var1) {
      this.a = var1;
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
         throw new PluginFileException(a("/\u001feD%") + this.getFullFilename() + a("I\u0018fU%\u000f\u0019|OaG"));
      }
   }

   public PluginEditor getEditor() {
      return null;
   }

   public void setContent(byte[] var1) throws PluginFileException {
      try {
         FileOutputStream var2 = new FileOutputStream(this.a);
         var2.write(var1);
         var2.close();
      } catch (IOException var3) {
         throw new PluginFileException(var3.getLocalizedMessage());
      }
   }

   public boolean isWritable() {
      return this.a.canWrite();
   }

   public File a() {
      return this.a;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 105;
            break;
         case 1:
            var10003 = 118;
            break;
         case 2:
            var10003 = 9;
            break;
         case 3:
            var10003 = 33;
            break;
         default:
            var10003 = 5;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
