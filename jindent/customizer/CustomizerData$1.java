package jindent.customizer;

import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;

class CustomizerData$1 implements CustomizerEventListener {
   private final CustomizerData a;

   CustomizerData$1(CustomizerData var1) {
      this.a = var1;
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(var1.getID() == 0) {
         this.a.setChanged(true);
         this.a.b.update();
      }

      if(var1.getID() == 3) {
         this.a.b.update();
      }

   }
}
