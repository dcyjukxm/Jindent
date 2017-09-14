package jindent.customizer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import jindent.customizer.CustomizerFrame;

class CustomizerFrame$5 extends WindowAdapter {
   private final CustomizerFrame a;

   CustomizerFrame$5(CustomizerFrame var1) {
      this.a = var1;
   }

   public void windowClosing(WindowEvent var1) {
      CustomizerFrame.access$300(this.a);
   }
}
