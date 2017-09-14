package jindent.util.swing;

import java.io.File;
import javax.swing.JFileChooser;
import jindent.SettingsUtils;

class SwingUtils$3 extends JFileChooser {
   public void setSelectedFile(File var1) {
      super.setSelectedFile(this.a(var1));
   }

   public File getSelectedFile() {
      File var1 = super.getSelectedFile();
      if(var1 != null) {
         var1 = this.a(var1);
      }

      return var1;
   }

   private File a(File var1) {
      String var2 = var1.getAbsolutePath();
      if(!SettingsUtils.isValidSettingsFilename(var2)) {
         var1 = new File(SettingsUtils.createValidSettingsFilename(var2));
      }

      return var1;
   }
}
