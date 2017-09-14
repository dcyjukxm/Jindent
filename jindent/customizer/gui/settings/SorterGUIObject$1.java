package jindent.customizer.gui.settings;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import jindent.customizer.gui.settings.SorterGUIObject;

class SorterGUIObject$1 implements TreeSelectionListener {
   private final SorterGUIObject a;

   SorterGUIObject$1(SorterGUIObject var1) {
      this.a = var1;
   }

   public void valueChanged(TreeSelectionEvent var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)SorterGUIObject.access$000(this.a).getLastSelectedPathComponent();
      if(var2 == null) {
         SorterGUIObject.access$000(this.a).setSelectionPath((TreePath)null);
         SorterGUIObject.access$000(this.a).a((DefaultMutableTreeNode)null);
      } else {
         SorterGUIObject.access$000(this.a).a((DefaultMutableTreeNode)SorterGUIObject.access$000(this.a).getLastSelectedPathComponent());
      }

      SorterGUIObject.access$100(this.a);
   }
}
