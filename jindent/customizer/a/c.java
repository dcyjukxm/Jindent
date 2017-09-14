package jindent.customizer.a;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextArea;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.StringArrayGUIObject;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.TextSetting;

public class c implements FocusListener {
   private StringArrayGUIObject a;
   private CustomizerData b;
   private JTextArea c;
   private String d;
   private PropertiesLayout e;

   public c(StringArrayGUIObject var1, CustomizerData var2, JTextArea var3, PropertiesLayout var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.d = null;
   }

   public void focusGained(FocusEvent var1) {
      if(!this.a.isTextLocked()) {
         this.d = this.c.getText();
      }

   }

   public void focusLost(FocusEvent var1) {
      if(!this.a.isTextLocked()) {
         String var2 = this.c.getText();
         if(this.a.containsSetting()) {
            TextSetting var3 = (TextSetting)this.a.getSetting();
            if(this.d != null && !this.d.equals(var2)) {
               var3.setValue(var2);
               this.e.invalidateLayout(this.c);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            }
         }

         this.a.updateJPanel();
      }

   }
}
