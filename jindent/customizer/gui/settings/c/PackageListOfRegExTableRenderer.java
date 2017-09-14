package jindent.customizer.gui.settings.c;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.SettingGUIObject;

public class PackageListOfRegExTableRenderer extends DefaultTableCellRenderer {
   private SettingGUIObject a;
   private CustomizerData b;

   public PackageListOfRegExTableRenderer(SettingGUIObject var1, CustomizerData var2) {
      this.a = var1;
      this.b = var2;
   }

   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Object var7 = null;
      if(var2 instanceof Boolean) {
         Boolean var8 = (Boolean)var2;
         var7 = new JCheckBox((Icon)null, var8.booleanValue());
      } else {
         String var9 = (String)var2;
         var7 = new JLabel(var9);
      }

      if(var7 != null) {
         if(!var1.isEnabled()) {
            ((JComponent)var7).setOpaque(true);
            ((JComponent)var7).setForeground(var1.getForeground());
            ((JComponent)var7).setBackground(var1.getBackground());
            ((JComponent)var7).setEnabled(false);
         } else if(var3) {
            ((JComponent)var7).setOpaque(true);
            ((JComponent)var7).setForeground(var1.getSelectionForeground());
            ((JComponent)var7).setBackground(var1.getSelectionBackground());
         } else {
            ((JComponent)var7).setOpaque(false);
            ((JComponent)var7).setForeground(var1.getForeground());
            ((JComponent)var7).setBackground(var1.getBackground());
         }
      }

      return (Component)var7;
   }

   public Dimension getPreferredSize() {
      FontMetrics var1 = this.getFontMetrics(this.getFont());
      return new Dimension(var1.stringWidth(this.getText()), var1.getAscent() + var1.getDescent());
   }
}
