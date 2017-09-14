package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.gui.settings.LogFileGUIObject;
import jindent.settings.LogFileSetting;

class LogFileGUIObject$2 implements ActionListener {
   private final LogFileGUIObject a;

   LogFileGUIObject$2(LogFileGUIObject var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      boolean var2 = LogFileGUIObject.access$100(this.a).isSelected();
      LogFileGUIObject.access$000(this.a).setEnabled(var2);
      LogFileGUIObject.access$200(this.a).setEnabled(var2);
      LogFileGUIObject.access$300(this.a).setEnabled(var2);
      if(this.a.containsSetting()) {
         ((LogFileSetting)this.a.f).setUseLogFile(var2);
      }

   }
}
