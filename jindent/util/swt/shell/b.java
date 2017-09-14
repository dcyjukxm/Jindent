package jindent.util.swt.shell;

import jindent.util.swt.shell.SWTInfoShell;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

class b implements Listener {
   private final SWTInfoShell a;

   b(SWTInfoShell var1) {
      this.a = var1;
   }

   public void handleEvent(Event var1) {
      if(var1.detail == 2) {
         var1.doit = false;
      }

   }
}
