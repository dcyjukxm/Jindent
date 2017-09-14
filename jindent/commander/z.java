package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.commander.CommanderFrame;

class z implements ActionListener {
   private final CommanderFrame a;

   z(CommanderFrame var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      CommanderFrame.a(this.a, var1);
   }
}
