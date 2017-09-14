package jindent.commander;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jindent.commander.AboutDialog$2;
import jindent.commander.g;
import jindent.util.swing.SwingUtils;

public class AboutDialog extends JFrame {
   private static final String a = "Kkba3ov_u:`qd+&oe";
   private static final Image b = SwingUtils.readImageIcon(a("Kkba3ov_u:`qd+&oe")).getImage();
   private JPanel c;
   private JLabel d = new JLabel();
   private JButton e = new JButton();
   private GridBagLayout f = new GridBagLayout();
   private JLabel g = new JLabel();

   public AboutDialog() {
      try {
         this.a();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   void a() throws Exception {
      this.d.setOpaque(false);
      this.d.setHorizontalAlignment(0);
      this.d.setText(a("=jxh:?>#m\"ln2"));
      this.d.setVerticalAlignment(1);
      this.e.setText(a("Ni"));
      this.e.addActionListener(new g(this));
      this.c = new AboutDialog$2(this);
      this.c.setOpaque(false);
      this.c.setPreferredSize(new Dimension(420, 224));
      this.c.setLayout(new BoxLayout(this.c, 1));
      this.c.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
      JPanel var1 = new JPanel();
      var1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      var1.setOpaque(false);
      var1.setPreferredSize(new Dimension(420, 210));
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 0));
      var2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      var2.setOpaque(false);
      var2.add(this.d);
      JPanel var3 = new JPanel(new FlowLayout());
      var3.setBorder(BorderFactory.createEmptyBorder(10, 0, 28, 0));
      var3.setOpaque(false);
      var3.add(this.e);
      this.c.add(var2);
      this.c.add(var1);
      this.c.add(var3);
      this.setTitle(a("@`cp\""));
      this.setIconImage(SwingUtils.readImageIcon(a("04t4`.cnj#u,|k1")).getImage());
      this.setResizable(false);
      this.getContentPane().setLayout(new BorderLayout());
      setDefaultLookAndFeelDecorated(false);
      this.getContentPane().add(this.c, a("Bgbq3s"));
   }

   public static void main(String[] var0) {
      AboutDialog var1 = new AboutDialog();
      var1.pack();
      var1.setVisible(true);
   }

   void a(ActionEvent var1) {
      this.dispose();
   }

   public JButton b() {
      return this.e;
   }

   static Image c() {
      return b;
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
            var10003 = 2;
            break;
         case 2:
            var10003 = 12;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 86;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
