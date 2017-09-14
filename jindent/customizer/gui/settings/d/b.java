package jindent.customizer.gui.settings.d;

import java.awt.Component;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jindent.util.swing.SwingUtils;

public class b {
   private JTextField a;
   private JTextField b;
   private JOptionPane c;
   private String d;
   private String e;

   public b() {
      this("", "");
   }

   public b(String var1, String var2) {
      this.d = a("?tSP>");
      this.e = a("=eM_\"\u0012");
      this.a = new JTextField(10);
      this.a.setText(var1);
      this.b = new JTextField(10);
      this.b.setText(var2);
   }

   public String a() {
      return this.a.getText().trim();
   }

   public String b() {
      return this.b.getText().trim();
   }

   public int a(Component var1) {
      String var2 = a("0eNY");
      String var3 = a("(eOI\"");
      Object[] var4 = new Object[]{var2, this.a, var3, this.b};
      Object[] var5 = new Object[]{this.d, this.e};
      Window var6 = SwingUtils.findWindow(var1);
      return JOptionPane.showOptionDialog(var6, var4, a("-aW\u001c1\u001fvJ]%\u0012a"), 2, -1, (Icon)null, var5, var5[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 126;
            break;
         case 1:
            var10003 = 4;
            break;
         case 2:
            var10003 = 35;
            break;
         case 3:
            var10003 = 60;
            break;
         default:
            var10003 = 71;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
