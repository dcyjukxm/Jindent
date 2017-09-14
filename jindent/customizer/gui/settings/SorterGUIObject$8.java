package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.settings.SorterGUIObject;

class SorterGUIObject$8 implements ActionListener {
   private final CustomizerData a;
   private final GUIObject b;
   private final SorterGUIObject c;

   SorterGUIObject$8(SorterGUIObject var1, CustomizerData var2, GUIObject var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void actionPerformed(ActionEvent var1) {
      SorterGUIObject.access$000(this.c).c();
      SorterGUIObject.access$100(this.c);
      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.b));
   }
}
