package jindent.util.swt.shell;

import jindent.util.swt.shell.SWTInfoShell;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

class e implements Listener {
   private final SWTInfoShell a;

   e(SWTInfoShell var1) {
      this.a = var1;
   }

   public void handleEvent(Event var1) {
      SWTInfoShell.access$000(this.a).dispose();
   }
}
