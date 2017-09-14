package jindent.customizer.c;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import jindent.customizer.CustomizerData;
import jindent.customizer.c.SelectionTree;

public class SelectionTreePanel extends JPanel {
   private SelectionTree a;
   private DefaultTreeModel b;
   private DefaultMutableTreeNode c;

   public SelectionTreePanel(CustomizerData var1) {
      this.c = var1.getRoot();
      this.setLayout(new BorderLayout());
      this.b = new DefaultTreeModel(this.c);
      this.a = new SelectionTree(var1, this.b);
      this.a.setShowsRootHandles(true);
      this.add(a("N\u0010BM"), this.a);
      this.a.setSelectionRow(0);
      this.setBackground(this.a.getBackground());
   }

   public void a(DefaultMutableTreeNode var1) {
      this.b.setRoot(var1);
   }

   public SelectionTree a() {
      return this.a;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 25;
            break;
         case 1:
            var10003 = 117;
            break;
         case 2:
            var10003 = 49;
            break;
         case 3:
            var10003 = 57;
            break;
         default:
            var10003 = 40;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
