package jindent.customizer.c;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTreeNode;
import jindent.customizer.c.SelectionTree;
import jindent.customizer.event.CustomizerEvent;

class a implements TreeSelectionListener {
   private final CustomizerData a;
   private final SelectionTree b;

   a(SelectionTree var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void valueChanged(TreeSelectionEvent var1) {
      try {
         CustomizerTreeNode var2 = (CustomizerTreeNode)this.b.getLastSelectedPathComponent();
         this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 1, var2.getKey()));
      } catch (Exception var3) {
         ;
      }

   }
}
