package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.BracesGUIObject;

class BracesGUIObject$1 implements ActionListener {
   private final BracesGUIObject a;
   private final CustomizerData b;
   private final BracesGUIObject c;

   BracesGUIObject$1(BracesGUIObject var1, BracesGUIObject var2, CustomizerData var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void actionPerformed(ActionEvent var1) {
      int var2 = BracesGUIObject.access$000(this.c).getSelectedIndex();
      Object var3 = BracesGUIObject.access$000(this.c).getItemAt(var2);
      if(var3 instanceof jindent.customizer.gui.settings.f.a) {
         jindent.customizer.gui.settings.f.a var4 = (jindent.customizer.gui.settings.f.a)BracesGUIObject.access$000(this.c).getItemAt(var2);
         this.a.initFromPreset(var4);
      } else {
         this.c.updateJPanel();
      }

      this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.a));
   }
}
