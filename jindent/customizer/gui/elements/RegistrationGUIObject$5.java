package jindent.customizer.gui.elements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.elements.RegistrationGUIObject;

class RegistrationGUIObject$5 implements ActionListener {
   private final CustomizerData a;
   private final RegistrationGUIObject b;

   RegistrationGUIObject$5(RegistrationGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      RegistrationGUIObject.access$300(this.b, this.a, var1);
   }
}
