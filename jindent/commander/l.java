package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.CommanderFrame;

class l implements ActionListener {
   private final CommanderFrame a;

   l(CommanderFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      CommanderFrame.k(this.a, var1);
   }
}
