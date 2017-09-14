package jindent.customizer.gui.settings.b;

import java.awt.Component;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.settings.ExtensionManagerSetting;
import jindent.util.swing.SwingUtils;

public class b {
   private JTextField a;
   private JComboBox b;
   private JOptionPane c;
   private String d;
   private String e;

   public b() {
      this("", "");
   }

   public b(String var1, String var2) {
      this.d = a("B|\u0013LR");
      this.e = a("@m\rCNo");
      this.a = new JTextField(10);
      this.a.setText(var1);
      this.b = new JComboBox(ExtensionManagerSetting.getFormatterNames());
      int var3 = this.b.getItemCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = (String)this.b.getItemAt(var4);
         if(var2.equals(var5)) {
            this.b.setSelectedIndex(var4);
            return;
         }
      }

   }

   public String a() {
      return this.a.getText().toLowerCase().trim();
   }

   public String b() {
      return (String)this.b.getSelectedItem();
   }

   public int a(Component var1) {
      String var2 = a("Ft\u0017EEpe\fN");
      String var3 = a("Ec\u0011MJwx\u0006R");
      Object[] var4 = new Object[]{var2, this.a, var3, this.b};
      Object[] var5 = new Object[]{this.d, this.e};
      Window var6 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var1, var4, a("B\u007f\u0010ILm,\u0006X_fb\u0010IDm,\u0017O\u000bb,)IEgi\rT\u000bec\u0011MJwx\u0006R"), 2, -1, (Icon)null, var5, var5[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 3;
            break;
         case 1:
            var10003 = 12;
            break;
         case 2:
            var10003 = 99;
            break;
         case 3:
            var10003 = 32;
            break;
         default:
            var10003 = 43;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
