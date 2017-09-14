package jindent.customizer.javahelp.a;

import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import jindent.customizer.javahelp.a.HelpPopupMenu;

public class a extends MouseInputAdapter {
   private Component a;

   public a(Component var1) {
      this.a = var1;
   }

   public void mouseReleased(MouseEvent var1) {
      if(var1.getModifiers() == 4) {
         HelpPopupMenu var2 = new HelpPopupMenu(this.a);
         var2.show(this.a, var1.getX(), var1.getY());
      }

   }
}
