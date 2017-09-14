package jindent.customizer.c;

import javax.swing.JTree;
import javax.swing.text.Position.Bias;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import jindent.customizer.CustomizerData;
import jindent.customizer.c.SelectionTreeRenderer;

public class SelectionTree extends JTree {
   public SelectionTree(CustomizerData var1, TreeModel var2) {
      super(var2);
      this.setRootVisible(false);
      this.setCellRenderer(new SelectionTreeRenderer());
      this.getSelectionModel().setSelectionMode(1);
      this.addTreeSelectionListener(new jindent.customizer.c.a(this, var1));
   }

   public TreePath getNextMatch(String var1, int var2, Bias var3) {
      TreePath var4 = this.getSelectionPath();
      if(var4 == null) {
         var4 = this.getPathForRow(0);
      }

      return var4;
   }
}
