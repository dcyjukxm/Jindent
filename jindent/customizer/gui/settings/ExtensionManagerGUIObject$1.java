package jindent.customizer.gui.settings;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject;

class ExtensionManagerGUIObject$1 extends MouseAdapter {
   private final CustomizerData a;
   private final ExtensionManagerGUIObject b;

   ExtensionManagerGUIObject$1(ExtensionManagerGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         ExtensionManagerGUIObject.access$000(this.b, this.a, var1);
      }

   }
}
