package jindent.customizer.gui.elements.about;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import jindent.util.swing.SwingUtils;

public class AboutTableRenderer extends DefaultTableCellRenderer {
   private static final Color a = new Color(230, 230, 230);

   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var7 = (String)var2;
      JLabel var8 = var6 > 0?new JLabel(var7, 0):new JLabel(var7, 2);
      if(var5 == 0) {
         Font var9 = var8.getFont().deriveFont(1);
         var8.setFont(var9);
      } else if(var6 == 0) {
         if(var5 < var1.getRowCount() - 1) {
            var8.setIcon(SwingUtils.readImageIcon(a("W\np$cIhzp0(Slp{\u0001Un")));
         } else {
            var8.setIcon(SwingUtils.readImageIcon(a("W\np$cIhzp0*]{a\u001b\tXm;2\u000fZ")));
         }
      }

      this.initComponentFromTable(var8, var1);
      return var8;
   }

   private void initComponentFromTable(JComponent var1, JTable var2) {
      var1.setOpaque(false);
      var1.setForeground(var2.getForeground());
      var1.setBackground(var2.getBackground());
   }

   public Dimension getPreferredSize() {
      FontMetrics var1 = this.getFontMetrics(this.getFont());
      return new Dimension(var1.stringWidth(this.getText()), var1.getAscent() + var1.getDescent());
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 102;
            break;
         case 1:
            var10003 = 60;
            break;
         case 2:
            var10003 = 8;
            break;
         case 3:
            var10003 = 21;
            break;
         default:
            var10003 = 85;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
