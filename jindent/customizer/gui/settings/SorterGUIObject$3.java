package jindent.customizer.gui.settings;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.ExpandVetoException;
import jindent.customizer.gui.settings.SorterGUIObject;
import jindent.settings.sorter.SorterElement;

class SorterGUIObject$3 implements TreeWillExpandListener {
   private final SorterGUIObject a;

   SorterGUIObject$3(SorterGUIObject var1) throws ExpandVetoException {
      this.a = var1;
   }

   public void treeWillExpand(TreeExpansionEvent var1) throws ExpandVetoException {
      SorterElement var2 = (SorterElement)var1.getPath().getLastPathComponent();
      if(!var2.isParentSortChecked()) {
         throw new ExpandVetoException(var1);
      }
   }

   public void treeWillCollapse(TreeExpansionEvent var1) throws ExpandVetoException {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1.getPath().getLastPathComponent();
      if(var2.isRoot()) {
         throw new ExpandVetoException(var1);
      }
   }
}
