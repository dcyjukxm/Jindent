package jindent.customizer.gui.elements;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.elements.RegistrationGUIObject;

class RegistrationGUIObject$1 extends MouseAdapter {
   private final CustomizerData a;
   private final RegistrationGUIObject b;

   RegistrationGUIObject$1(RegistrationGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         RegistrationGUIObject.access$000(this.b, this.a, var1);
      }

   }
}
