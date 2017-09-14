package jindent.customizer.gui.settings.a;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.util.swing.SwingUtils;

public class a {
   private JTextField a = new JTextField(10);
   private String b = a("2=8[+\u0005");
   private String c = a("#9;W8\f");

   public a(String var1) {
      this.a.setText(var1);
      this.a.setEnabled(false);
   }

   public int a(Component var1) {
      String var2 = a("2=8[+\u0005x<Y-\u000f*!\u0014:\u00127 Db");
      Object[] var3 = new Object[]{var2, this.a};
      Object[] var4 = new Object[]{this.b, this.c};
      Window var5 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var5, var3, a("2=4X1\u0019x\'Q0\u000f.0\u0014:\u00127 Db"), 2, -1, SwingUtils.readImageIcon(a("Sj-\u0007oO-;_3\u000f/;\u001a-\u000e?")), var4, var4[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 96;
            break;
         case 1:
            var10003 = 88;
            break;
         case 2:
            var10003 = 85;
            break;
         case 3:
            var10003 = 52;
            break;
         default:
            var10003 = 93;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
