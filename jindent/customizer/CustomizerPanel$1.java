package jindent.customizer;

import jindent.customizer.CustomizerPanel;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;

class CustomizerPanel$1 implements CustomizerEventListener {
   private final CustomizerPanel a;

   CustomizerPanel$1(CustomizerPanel var1) {
      this.a = var1;
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(var1.getID() == 1) {
         String var2 = (String)var1.getParam();
         CustomizerPanel.access$100(this.a).show(CustomizerPanel.access$000(this.a), var2);
         this.a.initScrollBars();
      }

   }
}
