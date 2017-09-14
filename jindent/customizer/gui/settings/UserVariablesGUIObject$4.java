package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.UserVariablesGUIObject;

class UserVariablesGUIObject$4 implements ActionListener {
   private final CustomizerData a;
   private final UserVariablesGUIObject b;

   UserVariablesGUIObject$4(UserVariablesGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      UserVariablesGUIObject.access$200(this.b, this.a, var1);
   }
}
