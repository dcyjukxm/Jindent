package jindent.plugin.report;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import jindent.plugin.report.ReportList;
import jindent.plugin.report.ReportListDialog$1;
import jindent.plugin.report.ReportListDialog$2;
import jindent.plugin.report.ReportListPanel;
import jindent.util.swing.SwingUtils;

public class ReportListDialog extends JDialog {
   public static final int WIDTH = 600;
   public static final int HEIGHT = 400;

   public ReportListDialog(ReportList var1) {
      super((Frame)null, true);
      this.setTitle(a("\"H\'\\)\u0006Uiu)\u001bR(_)\u001b"));
      this.setResizable(true);
      Container var2 = this.getContentPane();
      var2.setLayout(new BoxLayout(this.getContentPane(), 1));
      ReportListPanel var3 = new ReportListPanel();
      var2.add(new JScrollPane(var3));
      var3.update(var1);
      JButton var4 = new JButton(a("\u000bM&K)"));
      var2.add(createFlowLayoutPanel(var4, 1));
      var4.addActionListener(new ReportListDialog$1(this));
      this.addWindowListener(new ReportListDialog$2(this));
      this.setSize(600, 400);
      this.setVisible(true);
      SwingUtils.centerWindow(this);
   }

   private static JPanel createFlowLayoutPanel(JComponent var0, int var1) {
      JPanel var2 = new JPanel(new FlowLayout(var1));
      var2.add(var0);
      return var2;
   }

   public void ok() {
      this.dispose();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 104;
            break;
         case 1:
            var10003 = 33;
            break;
         case 2:
            var10003 = 73;
            break;
         case 3:
            var10003 = 56;
            break;
         default:
            var10003 = 76;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
