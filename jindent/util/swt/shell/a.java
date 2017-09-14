package jindent.util.swt.shell;

import jindent.util.swt.shell.SWTInfoShell;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

class a implements Listener {
   private final SWTInfoShell a;

   a(SWTInfoShell var1) {
      this.a = var1;
   }

   public void handleEvent(Event var1) {
      var1.doit = false;
   }
}
