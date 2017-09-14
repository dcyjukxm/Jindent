package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject;

class ExtensionManagerGUIObject$2 implements ActionListener {
   private final CustomizerData a;
   private final ExtensionManagerGUIObject b;

   ExtensionManagerGUIObject$2(ExtensionManagerGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      ExtensionManagerGUIObject.access$100(this.b, this.a, var1);
   }
}
