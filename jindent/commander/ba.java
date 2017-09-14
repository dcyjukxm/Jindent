package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.CommanderFrame;

class ba implements ActionListener {
   private final CommanderFrame a;

   ba(CommanderFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      CommanderFrame.b(this.a, var1);
   }
}
