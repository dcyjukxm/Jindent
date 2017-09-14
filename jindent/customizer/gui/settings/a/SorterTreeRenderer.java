package jindent.customizer.gui.settings.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.sorter.OptionalSorterElement;
import jindent.settings.sorter.SorterElement;
import jindent.util.swing.SwingUtils;

public class SorterTreeRenderer extends DefaultTreeCellRenderer {
   public static final int NODE_WIDTH = 12;
   public static final int LABEL_WIDTH = 210;
   public static final int CHECKBOX_WIDTH = 40;
   public static final int TREE_INDENT = 20;
   public static final int TREE_WIDTH = 282;
   public static final int CELL_HEIGHT = 15;
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 4;
   public static final ImageIcon ROOT_ELEMENT_ICON = SwingUtils.readImageIcon(a("{`\u001bfce2\f4 \'3\r#{:8\u0004"));
   public static final ImageIcon FIRST_LEVEL_ELEMENT_ICON = null;
   public static final ImageIcon FILTER_ELEMENT_ICON = SwingUtils.readImageIcon(a("{`\u001bfce0\n;!/$M0<,"));
   public static final ImageIcon FILTER_ATTRIBUTE_ICON = SwingUtils.readImageIcon(a("{`\u001bfce4\u0016;9/\"M0<,"));

   public static boolean a(SorterElement var0, int var1) {
      int var2 = a((DefaultMutableTreeNode)var0);
      int var3 = 210;
      if(var2 == 3) {
         var3 -= 20;
      }

      return var1 > var3;
   }

   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      Color var8 = this.getBackgroundNonSelectionColor();
      Color var9 = this.getBackgroundSelectionColor();
      Color var10 = this.getTextNonSelectionColor();
      Color var11 = this.getTextSelectionColor();
      DefaultMutableTreeNode var12 = (DefaultMutableTreeNode)var2;
      if(!(var12 instanceof SorterElement)) {
         return new JLabel("");
      } else {
         SorterElement var13 = (SorterElement)var12;
         int var14 = a(var12);
         ImageIcon var15 = a(var14);
         String var16 = var14 == 1?"":var13.getName();
         boolean var17 = var1.isEnabled() && var13.isParentSortChecked();
         JPanel var18 = new JPanel();
         var18.setLayout(new PropertiesLayout(0, 0, 0, 0, 0));
         var18.setOpaque(true);
         if(var14 == 3) {
            var16 = this.a((DefaultMutableTreeNode)var12.getParent(), var12) + 1 + a("dv") + var16;
         }

         JLabel var19 = new JLabel(var16, var15, 2);
         var19.setEnabled(var17);
         var19.setOpaque(true);
         if(var3 && var17) {
            var19.setForeground(var11);
            var19.setBackground(var9);
            var18.setBackground(var9);
         } else {
            var19.setForeground(var10);
            var19.setBackground(var8);
            var18.setBackground(var8);
         }

         var19.setPreferredSize(new Dimension(210, 15));
         if(var12 instanceof OptionalSorterElement) {
            OptionalSorterElement var20 = (OptionalSorterElement)var12;
            JCheckBox var21 = new JCheckBox("");
            var21.setBorderPaintedFlat(true);
            var21.setSelected(var20.isSort());
            if(var14 == 3) {
               var19.setEnabled(var17 && var21.isSelected());
               var19.setPreferredSize(new Dimension(190, 15));
            }

            var21.setPreferredSize(new Dimension(40, 15));
            var21.setEnabled(var17);
            if(var3 && var17) {
               var21.setOpaque(true);
               var21.setForeground(var11);
               var21.setBackground(var9);
               var18.setBackground(var9);
            } else {
               var21.setOpaque(true);
               var21.setForeground(var10);
               var21.setBackground(var8);
               var18.setBackground(var8);
            }

            var18.add(var19, a("\f\u001a,\u0000"));
            var18.add(var21, a("\f\u001a,\u0000\n\u000b\u0018\'\b\u001b\u000f\u0001<\u0005\u001a\u001d"));
         } else {
            var18.add(var19, a("\f\u001a,\u0000\n\u000b\u0018\'\b\u001b\u000f\u0001<\u0005\u001a\u001d"));
         }

         var18.setToolTipText(var13.getToolTipText());
         return var18;
      }
   }

   private int a(DefaultMutableTreeNode var1, DefaultMutableTreeNode var2) {
      int var3 = var1.getChildCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         if(var1.getChildAt(var4) == var2) {
            return var4;
         }
      }

      return -1;
   }

   private static int a(DefaultMutableTreeNode var0) {
      if(var0.isRoot()) {
         return 1;
      } else {
         DefaultMutableTreeNode var1 = (DefaultMutableTreeNode)var0.getParent();
         if(var1.isRoot()) {
            return 2;
         } else {
            DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1.getParent();
            return var2.isRoot()?3:4;
         }
      }
   }

   public static ImageIcon a(int var0) {
      switch(var0) {
      case 1:
         return ROOT_ELEMENT_ICON;
      case 2:
         return FIRST_LEVEL_ELEMENT_ICON;
      case 3:
         return FILTER_ELEMENT_ICON;
      case 4:
         return FILTER_ATTRIBUTE_ICON;
      default:
         return null;
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 74;
            break;
         case 1:
            var10003 = 86;
            break;
         case 2:
            var10003 = 99;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 85;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
