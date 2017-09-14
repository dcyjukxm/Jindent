package jindent.plugin.b.a;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class CommanderProgressDialog extends JPanel {
   private GridLayout a = new GridLayout();
   private JLabel b = new JLabel();
   private JLabel c = new JLabel();
   private JProgressBar d = new JProgressBar();
   private Border e;
   private boolean f = false;
   private int g = 0;
   private int h = 100;

   public CommanderProgressDialog() {
      try {
         this.a();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a() throws Exception {
      this.a.setColumns(1);
      this.a.setRows(3);
      this.setLayout(this.a);
      this.b.setText(a("Bje85D\u0017"));
      this.c.setText(a("Bje85D\u0014"));
      this.e = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(1, Color.white, Color.white, new Color(115, 114, 105), new Color(165, 163, 151)), BorderFactory.createEmptyBorder(5, 5, 5, 5));
      this.setBorder(this.e);
      this.d.setStringPainted(true);
      this.add(this.b, (Object)null);
      this.add(this.c, (Object)null);
      this.add(this.d, (Object)null);
   }

   public void a(int var1) {
      this.d.setMaximum(var1);
      this.h = var1;
   }

   public void b(int var1) {
      if(this.g != var1) {
         this.g = var1;
         this.d.setValue(var1);
         if(this.g == 0) {
            this.d.setString(a("aHm.9IJm 9FA$t~\u0006"));
         } else {
            this.d.setString(a("nIv71\\Rm47\b@m65\b") + var1 + a("\bIbz") + this.h + a("\b\b*t"));
         }
      }

   }

   public void a(int var1, String var2) {
      if(var1 == 0) {
         this.b.setText(var2);
      }

      if(var1 == 1) {
         this.c.setText(var2);
      }

   }

   public void b() {
      this.f = false;
      this.b.setText("");
      this.c.setText("");
      this.d.setString("");
   }

   public void c() {
      this.setVisible(false);
   }

   public boolean d() {
      return this.f;
   }

   public void a(boolean var1) {
      this.setVisible(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 40;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 90;
            break;
         default:
            var10003 = 80;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
