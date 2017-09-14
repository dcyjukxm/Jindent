package jindent.customizer.gui.settings.b;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.util.swing.SwingUtils;

public class a {
   private JTextField a = new JTextField(10);
   private JTextField b;
   private JOptionPane c;
   private String d = a("\u001a(9\u0013s-");
   private String e = a("\u000b,:\u001f`$");

   public a(String var1, String var2) {
      this.a.setText(var1);
      this.a.setEnabled(false);
      this.b = new JTextField(10);
      this.b.setText(var2);
      this.b.setEnabled(false);
   }

   public int a(Component var1) {
      String var2 = a("\r5 \u0019k;$;\u0012");
      String var3 = a("\u000e\"&\u0011d<91\u000e");
      Object[] var4 = new Object[]{var2, this.a, var3, this.b};
      Object[] var5 = new Object[]{this.d, this.e};
      Window var6 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var6, var4, a("\u001a(5\u0010i1m&\u0019h\';1\\`091\u0012v!\":\\d;>=\u001bk%(:\b:"), 2, -1, SwingUtils.readImageIcon(a("{\u007f,O7g8:\u0017k\'::Ru&*")), var5, var5[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 72;
            break;
         case 1:
            var10003 = 77;
            break;
         case 2:
            var10003 = 84;
            break;
         case 3:
            var10003 = 124;
            break;
         default:
            var10003 = 5;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
