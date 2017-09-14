package jindent.customizer.gui.settings.e;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import javax.swing.text.JTextComponent;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.TextGUIObject;
import jindent.customizer.gui.settings.e.EnvironmentPopupMenu;

public class c extends MouseInputAdapter {
   private CustomizerData a;
   private TextGUIObject b;

   public c(CustomizerData var1, TextGUIObject var2) {
      this.a = var1;
      this.b = var2;
   }

   public void mouseReleased(MouseEvent var1) {
      JTextComponent var2 = this.b.getJTextComponent();
      if(var1.getModifiers() == 4 && var2.isEnabled()) {
         int var3 = var2.getSelectionStart();
         int var4 = var2.getSelectionEnd();
         int var5 = var2.getCaretPosition();
         (new EnvironmentPopupMenu(this.a, this.b, var5, var3, var4)).show(var1.getComponent(), var1.getX(), var1.getY());
      }

   }
}
