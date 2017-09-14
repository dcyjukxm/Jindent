package jindent.customizer.gui.settings.b;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ExtensionManagerTableRenderer extends DefaultTableCellRenderer {
   private static final Color a = new Color(230, 230, 230);

   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var7 = (String)var2;
      JLabel var8 = new JLabel(var7);
      if(!var1.isEnabled()) {
         var8.setOpaque(true);
         var8.setForeground(var1.getForeground());
         var8.setBackground(var1.getBackground());
         var8.setEnabled(false);
      } else if(var3) {
         var8.setOpaque(true);
         var8.setForeground(var1.getSelectionForeground());
         var8.setBackground(var1.getSelectionBackground());
      } else {
         var8.setOpaque(false);
         var8.setForeground(var1.getForeground());
         var8.setBackground(var1.getBackground());
      }

      return var8;
   }

   public Dimension getPreferredSize() {
      FontMetrics var1 = this.getFontMetrics(this.getFont());
      return new Dimension(var1.stringWidth(this.getText()), var1.getAscent() + var1.getDescent());
   }
}
