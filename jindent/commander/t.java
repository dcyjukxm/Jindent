package jindent.commander;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import jindent.commander.CommanderFrame;

class t implements ItemListener {
   private final CommanderFrame a;

   t(CommanderFrame var1) {
      this.a = var1;
   }

   public void itemStateChanged(ItemEvent var1) {
      CommanderFrame.a(this.a, var1);
   }
}
