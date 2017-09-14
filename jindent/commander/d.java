package jindent.commander;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.TreePath;
import jindent.commander.FileTreeModel;
import jindent.commander.FileTreeSelector;
import jindent.commander.bi;

class d extends MouseAdapter {
   private final FileTreeSelector a;

   private d(FileTreeSelector var1) {
      this.a = var1;
   }

   public void mouseClicked(MouseEvent var1) {
      int var2 = FileTreeSelector.a(this.a).locationToIndex(var1.getPoint());
      String var3 = (String)FileTreeSelector.a(this.a).getModel().getElementAt(var2);
      FileTreeModel var4 = (FileTreeModel)FileTreeSelector.b(this.a).getModel();
      TreePath var5 = var4.a(var3);
      if(var5 != null) {
         FileTreeSelector.b(this.a).setSelectionPath(var5);
         FileTreeSelector.b(this.a).scrollPathToVisible(var5);
      }

   }

   d(FileTreeSelector var1, bi var2) {
      this(var1);
   }
}
