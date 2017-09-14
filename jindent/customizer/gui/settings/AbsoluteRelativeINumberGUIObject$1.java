package jindent.customizer.gui.settings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.AbsoluteRelativeINumberGUIObject;
import jindent.settings.AbsoluteRelativeINumberSetting;

class AbsoluteRelativeINumberGUIObject$1 implements ActionListener {
   private final CustomizerData a;
   private final AbsoluteRelativeINumberGUIObject b;

   AbsoluteRelativeINumberGUIObject$1(AbsoluteRelativeINumberGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      int var2 = AbsoluteRelativeINumberGUIObject.access$000(this.b).getSelectedIndex();
      if(this.b.containsSetting()) {
         ((AbsoluteRelativeINumberSetting)this.b.getSetting()).setIndex(var2);
      }

      this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.b.getSetting()));
   }
}
