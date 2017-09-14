package jindent.customizer.gui.settings.a;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTree;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultMutableTreeNode;
import jindent.customizer.gui.settings.a.SorterTreeRenderer;

public class SorterTree extends JTree {
   private DefaultMutableTreeNode a;
   private jindent.util.swing.c.a b;

   public SorterTree() {
      ToolTipManager.sharedInstance().registerComponent(this);
      this.setCellRenderer(new SorterTreeRenderer());
      this.getSelectionModel().setSelectionMode(1);
      this.setBorder(BorderFactory.createLineBorder(Color.gray));
      this.b = new jindent.util.swing.c.a(this);
      this.a = null;
   }

   public DefaultMutableTreeNode a() {
      return this.a;
   }

   public void a(DefaultMutableTreeNode var1) {
      this.a = var1;
   }

   public void b() {
      this.a(-1);
   }

   public void c() {
      this.a(1);
   }

   private void a(int var1) {
      if(this.a != null) {
         DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)this.a.getParent();
         int var3 = var2.getIndex(this.a);
         int var4 = var3 + var1;
         if(var4 >= 0) {
            if(var4 < var2.getChildCount()) {
               DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var2.getChildAt(var3);
               var2.remove(var3);
               var2.insert(var5, var4);
               this.d().a();
            }
         }
      }
   }

   public jindent.util.swing.c.a d() {
      return this.b;
   }
}
