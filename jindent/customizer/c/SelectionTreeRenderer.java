package jindent.customizer.c;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import jindent.customizer.CustomizerTreeNode;

public class SelectionTreeRenderer extends DefaultTreeCellRenderer {
   private static final Color a = new Color(255, 255, 200);

   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      CustomizerTreeNode var8 = (CustomizerTreeNode)var2;
      boolean var9 = var1.isEnabled();
      JLabel var10 = new JLabel(var8.getName());
      Color var11 = this.getBackgroundNonSelectionColor();
      Color var12 = this.getBackgroundSelectionColor();
      Color var13 = this.getTextNonSelectionColor();
      Color var14 = this.getTextSelectionColor();
      var10.setEnabled(var9);
      var10.setOpaque(true);
      if(var3 && var9) {
         var10.setForeground(var14);
         var10.setBackground(var12);
      } else {
         var10.setForeground(var13);
         var10.setBackground(var11);
      }

      return var10;
   }

   public Dimension getPreferredSize() {
      FontMetrics var1 = this.getFontMetrics(this.getFont());
      return new Dimension(var1.stringWidth(this.getText()), var1.getAscent() + var1.getDescent());
   }
}
