package jindent.customizer.gui.settings;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.UserVariablesGUIObject;

class UserVariablesGUIObject$1 extends MouseAdapter {
   private final CustomizerData a;
   private final UserVariablesGUIObject b;

   UserVariablesGUIObject$1(UserVariablesGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         UserVariablesGUIObject.access$000(this.b, this.a, var1);
      }

   }
}
