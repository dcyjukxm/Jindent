package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject;

class PackageListOfRegExGUIObject$2 implements ActionListener {
   private final CustomizerData a;
   private final PackageListOfRegExGUIObject b;

   PackageListOfRegExGUIObject$2(PackageListOfRegExGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      PackageListOfRegExGUIObject.access$100(this.b, this.a, var1);
   }
}
