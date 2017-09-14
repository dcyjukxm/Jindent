package jindent.customizer.gui.settings;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import jindent.customizer.gui.settings.LogFileGUIObject;
import jindent.settings.LogFileSetting;
import jindent.util.swing.SwingUtils;

class LogFileGUIObject$1 implements ActionListener {
   private final JPanel a;
   private final LogFileGUIObject b;

   LogFileGUIObject$1(LogFileGUIObject var1, JPanel var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      JFileChooser var2 = SwingUtils.getLogFileChooser();
      if(var2.showOpenDialog(SwingUtils.findWindow((Container)this.a)) == 0) {
         String var3 = var2.getSelectedFile().getPath();
         LogFileGUIObject.access$000(this.b).setText(var3);
         if(this.b.containsSetting()) {
            ((LogFileSetting)this.b.f).setFilename(var3);
         }
      }

   }
}
