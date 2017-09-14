package jindent.customizer.gui.settings.a;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class b {
   private JTextField a = new JTextField(10);
   private String b = a("1AS-\'");
   private String c = a("3PM\";\u001c");

   public b(String var1) {
      this.a.setText(var1);
   }

   public String a() {
      return this.a.getText().trim();
   }

   public int a(Component var1) {
      String var2 = a("5_W$,PP\u00031,\u0015WJ9~XT\r&pP\u0016L39^T@-7\u0000BFfwPELa3\u0011E@)~\u0011\u0011P1;\u0013XE(=PVQ.+\u0000\u0011L3~W\u001b\u0004a*\u001f\u0011N *\u0013Y\u0003 2\u001c\u0011J,.\u001fCW2p");
      Object[] var3 = new Object[]{var2, this.a};
      Object[] var4 = new Object[]{this.b, this.c};
      return JOptionPane.showOptionDialog(var1, var3, a("1UGa?P_F6~\u0019\\S.,\u0004\u0011D31\u0005A"), 2, -1, (Icon)null, var4, var4[0]);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 112;
            break;
         case 1:
            var10003 = 49;
            break;
         case 2:
            var10003 = 35;
            break;
         case 3:
            var10003 = 65;
            break;
         default:
            var10003 = 94;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
