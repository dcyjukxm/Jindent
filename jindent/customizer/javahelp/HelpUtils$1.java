package jindent.customizer.javahelp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.javahelp.HelpUtils;

class HelpUtils$1 implements ActionListener {
   private final Component a;

   HelpUtils$1(Component var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      HelpUtils.showHelpID(this.a.getParent(), HelpUtils.DEFAULT_JAVAHELP_START_ID);
   }
}
