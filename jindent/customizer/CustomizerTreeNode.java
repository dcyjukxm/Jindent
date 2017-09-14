package jindent.customizer;

import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import jindent.customizer.gui.elements.GUITab;

public class CustomizerTreeNode extends DefaultMutableTreeNode {
   private String a;
   private String b;
   private Vector c;

   public CustomizerTreeNode(String var1, String var2) {
      this.a = var1;
      this.b = var2;
      this.c = new Vector();
   }

   public void addTab(GUITab var1) {
      this.c.add(var1);
   }

   public GUITab getTab(int var1) {
      return (GUITab)this.c.elementAt(var1);
   }

   public int countTabs() {
      return this.c.size();
   }

   public GUITab getLastTab() {
      return this.countTabs() > 0?(GUITab)this.c.elementAt(this.countTabs() - 1):null;
   }

   public String getName() {
      return this.a;
   }

   public String getKey() {
      return this.b;
   }

   public CustomizerTreeNode findChildByName(String var1) {
      int var2 = this.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         CustomizerTreeNode var4 = (CustomizerTreeNode)this.getChildAt(var3);
         if(var4.getName().equals(var1)) {
            return var4;
         }
      }

      return null;
   }
}
