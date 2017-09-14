package jindent.customizer.gui.settings;

import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.gui.settings.BracesGUIObject;

class BracesGUIObject$2 implements CustomizerEventListener {
   private final CustomizerData a;
   private final BracesGUIObject b;

   BracesGUIObject$2(BracesGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void eventOccurred(CustomizerEvent var1) {
      this.a.getEventHandler().setBlockEvents(true);
      BracesGUIObject.access$100(this.b);
      this.a.getEventHandler().setBlockEvents(false);
   }
}
