package jindent.customizer.gui.settings;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.settings.SorterGUIObject;
import jindent.settings.sorter.SorterElement;
import jindent.util.swing.SwingUtils;

class SorterGUIObject$7 implements ActionListener {
   private final CustomizerData a;
   private final GUIObject b;
   private final SorterGUIObject c;

   SorterGUIObject$7(SorterGUIObject var1, CustomizerData var2, GUIObject var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void actionPerformed(ActionEvent var1) {
      DefaultMutableTreeNode var2 = SorterGUIObject.access$000(this.c).a();
      if(var2 != null) {
         SorterElement var3 = (SorterElement)var2;
         jindent.customizer.gui.settings.a.a var4 = new jindent.customizer.gui.settings.a.a(var3.getName());
         int var5 = var4.a((Component)SwingUtils.findWindow((Container)SorterGUIObject.access$000(this.c)));
         if(var5 == 0) {
            SorterElement var6 = (SorterElement)var3.getParent();
            var6.remove(var3);
            this.c.updateJPanel();
            this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this));
         }

         SorterGUIObject.access$100(this.c);
         this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.b));
      }
   }
}
