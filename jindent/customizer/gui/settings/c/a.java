package jindent.customizer.gui.settings.c;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.util.swing.SwingUtils;

public class a {
   private JCheckBox a;
   private JTextField b;
   private JTextField c;
   private String d = a("\u0019\u0015\u000e\\).");
   private String e = a("\b\u0011\rP:\'");

   public a(Boolean var1, String var2, String var3) {
      this.a = new JCheckBox(a("\u000e\u001e\u0002Q3.\u0014"), var1.booleanValue());
      this.a.setEnabled(false);
      this.b = new JTextField(10);
      this.b.setText(var2);
      this.b.setEnabled(false);
      this.c = new JTextField(10);
      this.c.setText(var3);
      this.c.setEnabled(false);
   }

   public int a(Component var1) {
      String var2 = a("\u001b\u0011\u0000X>,\u0015C}>&\u0015");
      String var3 = a("\u0019\u0015\u0004F3*\u0002Cv\';\u0002\u0006@,\"\u001f\r");
      Object[] var4 = new Object[]{this.a, var2, this.b, var3, this.c};
      Object[] var5 = new Object[]{this.d, this.e};
      Window var6 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var6, var4, a("\u0019\u0015\u0002_32P\u0011V2$\u0006\u0006\u0013/*\u0013\bR8.O"), 2, -1, SwingUtils.readImageIcon(a("xB\u001b\u0000md\u0005\rX1$\u0007\r\u001d/%\u0017")), var5, var5[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 75;
            break;
         case 1:
            var10003 = 112;
            break;
         case 2:
            var10003 = 99;
            break;
         case 3:
            var10003 = 51;
            break;
         default:
            var10003 = 95;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
