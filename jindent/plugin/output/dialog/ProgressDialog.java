package jindent.plugin.output.dialog;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.output.dialog.ProgressDialog$1;
import jindent.plugin.output.dialog.ProgressDialog$2;
import jindent.util.swing.SwingUtils;

public class ProgressDialog extends JDialog {
   public static final int WIDTH = 500;
   public static final int HEIGHT = 150;
   protected JButton a;
   protected JProgressBar b;
   protected JLabel[] c;
   protected JLabel d;
   private int e;
   private int f;
   private boolean g;

   public ProgressDialog(JFrame var1) {
      super(var1);
      this.createDialog();
   }

   public ProgressDialog(JDialog var1) {
      super(var1);
      this.createDialog();
   }

   private void createDialog() {
      this.setTitle(a("H\u001e\u0001\'*l\u0003O\u0005 p\u001a\u000e7;k\u0019\b"));
      this.setResizable(false);
      Container var1 = this.getContentPane();
      var1.setLayout(new BoxLayout(this.getContentPane(), 1));
      this.c = new JLabel[2];
      this.d = new JLabel("");
      var1.add(createFlowLayoutPanel(this.d, 0));
      this.c[0] = new JLabel("");
      var1.add(createFlowLayoutPanel(this.c[0], 0));
      this.c[0].setPreferredSize(new Dimension(490, 20));
      this.c[1] = new JLabel("");
      var1.add(createFlowLayoutPanel(this.c[1], 0));
      this.c[1].setPreferredSize(new Dimension(490, 20));
      this.b = new JProgressBar(0);
      this.b.setPreferredSize(new Dimension(450, 20));
      var1.add(createFlowLayoutPanel(this.b, 1));
      JButton var2 = new JButton(a("A\u0016\u0001 *n"));
      var1.add(createFlowLayoutPanel(var2, 1));
      var2.addActionListener(new ProgressDialog$1(this));
      this.addWindowListener(new ProgressDialog$2(this));
      this.setSize(500, 150);
      this.setOutputVisible(false);
      SwingUtils.centerWindow(this);
      this.init();
   }

   private static JPanel createFlowLayoutPanel(JComponent var0, int var1) {
      JPanel var2 = new JPanel(new FlowLayout(var1));
      var2.add(var0);
      return var2;
   }

   public void setMaximum(int var1) {
      this.b.setMaximum(var1);
      this.e = var1;
   }

   public void setCurrent(int var1) {
      this.b.setValue(var1);
      this.f = var1;
   }

   private void updateFileNumberLabel() {
      String var1 = this.f <= 0?a("K\u0019\u00067&c\u001b\u00069&l\u0010Oma,"):a("D\u0018\u001d..v\u0003\u0006-(\"\u0011\u0006/*\"") + this.f + a("\"\u0018\tc") + this.e + a("\"YAm");
      this.d.setText(var1);
   }

   public void setFiles(PluginSourceFile var1, PluginDestinationFile var2) {
      String var3 = var1.getFullFilename();
      String var4 = var2.getFullFilename();
      if(var3.equals(var4)) {
         this.setMessage(0, var3);
      } else {
         this.setMessage(0, var3);
         this.setMessage(1, var4);
      }

   }

   public void setMessage(int var1, String var2) {
      int var3 = this.c.length;
      this.updateFileNumberLabel();
      if(var1 < var3) {
         this.c[var1].setText(var2);
      }

   }

   public void init() {
      this.setMessage(0, "");
      this.setMessage(1, "");
      this.setCurrent(0);
      this.setMaximum(100);
   }

   public void setStopMessage() {
      this.setMessage(0, a("a\u0016\u0001 *n\u001b\u0006-(,YA"));
      this.setMessage(1, "");
   }

   public void setOutputVisible(boolean var1) {
      this.g = var1;
      this.setVisible(this.g);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 2;
            break;
         case 1:
            var10003 = 119;
            break;
         case 2:
            var10003 = 111;
            break;
         case 3:
            var10003 = 67;
            break;
         default:
            var10003 = 79;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
