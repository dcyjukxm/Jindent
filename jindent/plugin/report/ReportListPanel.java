package jindent.plugin.report;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import jindent.MessageList;
import jindent.message.Message;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.plugin.report.ReportListPanel$1;
import jindent.plugin.report.ReportListTreeRenderer;

public class ReportListPanel extends JPanel {
   private static final DefaultMutableTreeNode a = new DefaultMutableTreeNode(a("\t^kI"));
   protected ReportList b;
   protected JTree c;

   public ReportListPanel() {
      this.setLayout(new BorderLayout());
      this.c = new JTree();
      this.c.setModel(new DefaultTreeModel(new DefaultMutableTreeNode()));
      this.c.setRowHeight(0);
      this.c.setSelectionRow(0);
      this.c.setRootVisible(false);
      this.c.setCellRenderer(new ReportListTreeRenderer());
      this.c.getSelectionModel().setSelectionMode(1);
      this.c.addMouseListener(new ReportListPanel$1(this));
      this.add(a(",TwI"), this.c);
      this.setBackground(this.c.getBackground());
   }

   private DefaultMutableTreeNode messageToTreeNode(Message var1) {
      DefaultMutableTreeNode var2 = new DefaultMutableTreeNode(var1);
      return var2;
   }

   private DefaultMutableTreeNode reportToTreeNode(Report var1) {
      DefaultMutableTreeNode var2 = new DefaultMutableTreeNode(var1);
      MessageList var3 = var1.getMessageList();
      int var4 = var3.countMessages();

      for(int var5 = 0; var5 < var4; ++var5) {
         Message var6 = var3.getMessageAt(var5);
         var2.add(this.messageToTreeNode(var6));
      }

      return var2;
   }

   private DefaultMutableTreeNode reportListToTreeNode(ReportList var1) {
      DefaultMutableTreeNode var2 = new DefaultMutableTreeNode(var1);
      int var3 = var1.countReports();

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.add(this.reportToTreeNode(var1.getReportAt(var4)));
      }

      return var2;
   }

   public void update(ReportList var1) {
      if(var1.hasReport()) {
         DefaultMutableTreeNode var2 = this.reportListToTreeNode(var1);
         DefaultTreeModel var3 = (DefaultTreeModel)this.c.getModel();
         var3.setRoot(var2);
         var3.reload();
         this.c.setShowsRootHandles(true);
         if(var1.countReports() == 1) {
            this.expandRow(0);
         }
      } else {
         this.clear();
      }

   }

   public void expandRow(int var1) {
      this.c.expandRow(var1);
   }

   public void clear() {
      DefaultTreeModel var1 = (DefaultTreeModel)this.c.getModel();
      var1.setRoot(a);
      var1.reload();
      this.c.setShowsRootHandles(false);
   }

   static {
      a.add(new DefaultMutableTreeNode(a("[_k\u001dL\u001eBw\\F\u001eB")));
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 123;
            break;
         case 1:
            var10003 = 49;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 33;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
