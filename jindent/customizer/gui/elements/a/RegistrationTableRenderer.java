package jindent.customizer.gui.elements.a;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RegistrationTableRenderer extends DefaultTableCellRenderer {
   private static final Color a = new Color(230, 230, 230);

   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      jindent.customizer.gui.elements.a.a var7 = (jindent.customizer.gui.elements.a.a)var2;
      String var8 = null;
      switch(var6) {
      case 0:
         var8 = var7.a();
         break;
      case 1:
         var8 = var7.d();
         break;
      case 2:
         var8 = var7.f();
         break;
      default:
         var8 = a("K~sZ>\u0012uh\u0004");
      }

      JLabel var9 = new JLabel(var8);
      if(!var1.isEnabled()) {
         var9.setOpaque(true);
         var9.setForeground(var1.getForeground());
         var9.setBackground(var1.getBackground());
         var9.setEnabled(false);
      } else if(var3) {
         var9.setOpaque(true);
         var9.setForeground(var1.getSelectionForeground());
         var9.setBackground(var1.getSelectionBackground());
      } else {
         var9.setOpaque(false);
         var9.setForeground(var1.getForeground());
         var9.setBackground(var1.getBackground());
      }

      return var9;
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
            var10003 = 97;
            break;
         case 1:
            var10003 = 16;
            break;
         case 2:
            var10003 = 28;
            break;
         case 3:
            var10003 = 46;
            break;
         default:
            var10003 = 30;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
