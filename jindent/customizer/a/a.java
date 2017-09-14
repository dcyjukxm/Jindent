package jindent.customizer.a;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComponent;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.settings.BooleanSetting;
import jindent.settings.EncodingSetting;
import jindent.settings.INumberSetting;
import jindent.settings.Setting;

public class a implements ItemListener {
   private SettingGUIObject a;
   private CustomizerData b;
   private JComponent c;

   public a(SettingGUIObject var1, CustomizerData var2, JComponent var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void itemStateChanged(ItemEvent var1) {
      Setting var2 = this.a.getSetting();
      if(var2 instanceof BooleanSetting) {
         if(var1.getStateChange() == 1) {
            ((BooleanSetting)var2).setValue(true);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }

         if(var1.getStateChange() == 2) {
            ((BooleanSetting)var2).setValue(false);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }
      }

      if(var2 instanceof INumberSetting) {
         if(var1.getStateChange() == 1) {
            ((INumberSetting)var2).setInfinite(true);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }

         if(var1.getStateChange() == 2) {
            ((INumberSetting)var2).setInfinite(false);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }
      }

      if(var2 instanceof EncodingSetting) {
         if(var1.getStateChange() == 1) {
            ((EncodingSetting)var2).setUseDefaultEncoding(true);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }

         if(var1.getStateChange() == 2) {
            ((EncodingSetting)var2).setUseDefaultEncoding(false);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }
      }

      this.a.updateJPanel();
   }
}
