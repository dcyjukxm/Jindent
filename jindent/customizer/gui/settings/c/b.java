package jindent.customizer.gui.settings.c;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class b {
   private JCheckBox a;
   private JTextField b;
   private JTextField c;
   private String d;
   private String e;

   public b() {
      this(Boolean.TRUE, "", "");
   }

   public b(Boolean var1, String var2, String var3) {
      this.d = a("!v\u001f~t");
      this.e = a("#g\u0001qh\f");
      this.a = new JCheckBox(a("%h\u000epa\u0005b"), var1.booleanValue());
      this.b = new JTextField(10);
      this.b.setText(var2);
      this.c = new JTextField(10);
      this.c.setText(var3);
   }

   public Boolean a() {
      return this.a.isSelected()?Boolean.TRUE:Boolean.FALSE;
   }

   public String b() {
      return this.b.getText().trim();
   }

   public String c() {
      return this.c.getText().trim();
   }

   public int a(Component var1) {
      String var2 = a("0g\fyl\u0007cO\\l\rc");
      String var3 = a("2c\bga\u0001tOWu\u0010t\na~\ti\u0001");
      Object[] var4 = new Object[]{this.a, var2, this.b, var3, this.c};
      Object[] var5 = new Object[]{this.d, this.e};
      return JOptionPane.showOptionDialog(var1, var4, a("!u\u001c{j\u000e&\u001fsn\u000bg\bw-\u000eg\u0002w-\u0017o\u001bz-\u0001&\u001dwj\u0015j\u000e`-\u0005~\u001f`h\u0013u\u0006}c"), 2, -1, (Icon)null, var5, var5[0]);
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
            var10003 = 6;
            break;
         case 2:
            var10003 = 111;
            break;
         case 3:
            var10003 = 18;
            break;
         default:
            var10003 = 13;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
