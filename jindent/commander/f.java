package jindent.commander;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import jindent.commander.CommanderFrame;
import jindent.commander.bs;

class f extends WindowAdapter {
   private final CommanderFrame a;

   private f(CommanderFrame var1) {
      this.a = var1;
   }

   public void windowClosed(WindowEvent var1) {
      CommanderFrame.a(this.a);
   }

   f(CommanderFrame var1, bs var2) {
      this(var1);
   }
}
