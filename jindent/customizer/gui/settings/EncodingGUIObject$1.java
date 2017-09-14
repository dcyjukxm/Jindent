package jindent.customizer.gui.settings;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.EncodingGUIObject;
import jindent.settings.EncodingSetting;

class EncodingGUIObject$1 implements ChangeListener {
   private final CustomizerData a;
   private final EncodingGUIObject b;

   EncodingGUIObject$1(EncodingGUIObject var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void stateChanged(ChangeEvent var1) {
      boolean var2 = this.a.getEventHandler().isBlockEvents();
      if(EncodingGUIObject.access$000(this.b).isSelected() && !var2) {
         EncodingSetting var3 = (EncodingSetting)this.b.getSetting();
         var3.setValue(EncodingGUIObject.DEFAULT_SYSTEM_ENCODING);
      }

   }
}
