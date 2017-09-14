package jindent.customizer.gui.settings.d;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.util.swing.SwingUtils;

public class a {
   private JTextField a = new JTextField(10);
   private JTextField b;
   private JOptionPane c;
   private String d = a("\u0017,Y\u001b\u0019 ");
   private String e = a("\u0006(Z\u0017\n)");

   public a(String var1, String var2) {
      this.a.setText(var1);
      this.a.setEnabled(false);
      this.b = new JTextField(10);
      this.b.setText(var2);
      this.b.setEnabled(false);
   }

   public int a(Component var1) {
      String var2 = a("\u000b(Y\u0011");
      String var3 = a("\u0013(X\u0001\n");
      Object[] var4 = new Object[]{var2, this.a, var3, this.b};
      Object[] var5 = new Object[]{this.d, this.e};
      Window var6 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var6, var4, a("\u0017,U\u0018\u0003<iF\u0011\u0002*?QT\u0019$;]\u0015\r),\u0014K"), 2, -1, SwingUtils.readImageIcon(a("v{LG]j<Z\u001f\u0001*>ZZ\u001f+.")), var5, var5[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 69;
            break;
         case 1:
            var10003 = 73;
            break;
         case 2:
            var10003 = 52;
            break;
         case 3:
            var10003 = 116;
            break;
         default:
            var10003 = 111;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
