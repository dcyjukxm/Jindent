package jindent.customizer.javahelp.a;

import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import jindent.customizer.javahelp.HelpUtils;
import jindent.util.swing.SwingUtils;

public class HelpPopupMenu extends JPopupMenu {
   public HelpPopupMenu(Component var1) {
      JMenuItem var2 = new JMenuItem(a("I\nX_bN\u0001\u0014l.h\f_\u0001l/"), SwingUtils.readImageIcon(a("0YL\u001et.\u0007QC2/\u001fZH")));
      HelpUtils.addHelpOnClick(var2, var1);
      this.add(var2);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 1;
            break;
         case 1:
            var10003 = 111;
            break;
         case 2:
            var10003 = 52;
            break;
         case 3:
            var10003 = 47;
            break;
         default:
            var10003 = 66;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
