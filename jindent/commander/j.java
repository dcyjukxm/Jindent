package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.CommanderFrame;

class j implements ActionListener {
   private final CommanderFrame a;

   j(CommanderFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      CommanderFrame.i(this.a, var1);
   }
}
