package jindent.commander;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import jindent.commander.CommanderFrame;

class e extends WindowAdapter {
   private final CommanderFrame a;

   e(CommanderFrame var1) {
      this.a = var1;
   }

   public void windowClosing(WindowEvent var1) {
      CommanderFrame.j(this.a, (ActionEvent)null);
   }
}
