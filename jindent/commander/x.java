package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.CommanderFrame;

class x implements ActionListener {
   private final CommanderFrame a;

   x(CommanderFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      CommanderFrame.v(this.a, var1);
   }
}
