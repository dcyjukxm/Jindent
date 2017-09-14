package jindent.plugin.report;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import jindent.MessageList;
import jindent.message.ErrorMessage;
import jindent.message.Message;
import jindent.message.WarningMessage;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.SwingUtils;

public class ReportListTreeRenderer extends DefaultTreeCellRenderer {
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var2;
      Object var9 = var8.getUserObject();
      Object var10 = null;
      Color var11 = this.getBackgroundSelectionColor();
      Color var12 = this.getTextSelectionColor();
      Color var13 = this.getBackgroundNonSelectionColor();
      if(var9 instanceof ReportList) {
         var10 = this.createReportListPanel((ReportList)var9);
      } else if(var9 instanceof Report) {
         var10 = this.createReportPanel((Report)var9);
      } else if(var9 instanceof Message) {
         var10 = this.createMessagePanel((Message)var9);
      } else {
         if(var9 instanceof String) {
            return new JLabel((String)var9);
         }

         var10 = new JLabel();
      }

      if(var3) {
         this.setJLabelProperties((Component)var10, var12, var11, true);
      } else {
         this.setJLabelProperties((Component)var10, (Color)null, var13, true);
      }

      return (Component)var10;
   }

   private void setJLabelProperties(Component var1, Color var2, Color var3, boolean var4) {
      if(var1 instanceof JLabel) {
         ((JLabel)var1).setOpaque(var4);
      }

      if(var2 != null) {
         var1.setForeground(var2);
      }

      if(var3 != null) {
         var1.setBackground(var3);
      }

      if(var1 instanceof Container) {
         Container var5 = (Container)var1;
         Component[] var6 = var5.getComponents();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            this.setJLabelProperties(var6[var8], var2, var3, var4);
         }
      }

   }

   public static String createMessage(Message var0) {
      if(var0.hasColumnAndLineNumber()) {
         int var1 = var0.getColumn();
         return a("%C1:m") + var0.getLine() + (var1 == 0?"":a("e\n<0!<G1\u007f") + var1) + a("s\n") + var0.getMessage();
      } else {
         return var0.getMessage();
      }
   }

   private Color getReportColor(Report var1) {
      return this.getTextNonSelectionColor();
   }

   private ImageIcon getReportIcon(Report var1) {
      MessageList var2 = var1.getMessageList();
      String var3 = null;
      boolean var4 = var1.getHistoryData() != null;
      if(var2.containsErrorMessage()) {
         var3 = var4?a("x\u001c\'n{fN0<8$O1+\u0012,X-0?gZ18"):a("x\u001c\'n{fN0<8$O1+\u0012.O>-\u0012,X-0?gZ18");
      } else if(var2.containsWarningMessage()) {
         var3 = a("x\u001c\'n{fN0<8$O1+\u0012>K-1$\'Mq/#.");
      } else if(var2.containsMessage()) {
         var3 = a("x\u001c\'n{fN0<8$O1+\u0012 D90c9D8");
      } else {
         var3 = var4?a("x\u001c\'n{fN0<8$O1+c9D8"):a("x\u001c\'n{fN0<8$O1+\u0012.O>-c9D8");
      }

      return SwingUtils.readImageIcon(var3);
   }

   private JPanel createMessagePanel(Message var1) {
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 0));
      Color var3 = this.getTextNonSelectionColor();
      ImageIcon var4 = null;
      if(var1 instanceof ErrorMessage) {
         var4 = SwingUtils.readImageIcon(a("x\u001c\'n{fO--\";\u0004/1*"));
      } else if(var1 instanceof WarningMessage) {
         var4 = SwingUtils.readImageIcon(a("x\u001c\'n{f]>-# D8q=\'M"));
      } else if(var1 instanceof Message) {
         var4 = SwingUtils.readImageIcon(a("x\u001c\'n{fC19\";G>+$&Dq/#."));
      }

      Object var5 = null;
      int var6 = var1.getMessageId();
      switch(var6) {
      case 4:
      default:
         JLabel var7 = new JLabel(var4);
         var7.setBorder(BorderFactory.createEmptyBorder());
         String var8 = var1.getLanguage() + " " + Message.idToString(var6) + a("s\n") + createMessage(var1);
         MultiLineLabel var9 = new MultiLineLabel(var8);
         var9.setForeground(var3);
         var2.add(var7);
         if(var5 != null) {
            JLabel var10 = new JLabel((Icon)var5);
            var10.setBorder(BorderFactory.createEmptyBorder());
            var2.add(var10);
         }

         var2.add(var9);
         return var2;
      }
   }

   private JPanel createReportPanel(Report var1) {
      JPanel var2 = new JPanel();
      var2.setLayout(new BoxLayout(var2, 0));
      String var3 = var1.getTitle();
      int var4 = var3.indexOf(a("d\u0014"));
      JLabel var5 = null;
      JLabel var6 = null;
      ImageIcon var7 = this.getReportIcon(var1);
      if(var4 > -1) {
         var5 = new JLabel(var3.substring(0, var4), var7, 2);
         ImageIcon var8 = SwingUtils.readImageIcon(a("x\u001c\'n{fk--\">\u000486+"));
         var6 = new JLabel(var3.substring(var4 + 2), var8, 2);
      } else {
         var5 = new JLabel(var3, var7, 2);
         var6 = new JLabel("");
      }

      Color var9 = this.getReportColor(var1);
      var5.setForeground(var9);
      var6.setForeground(var9);
      var2.add(var5);
      var2.add(var6);
      return var2;
   }

   private JLabel createReportListPanel(ReportList var1) {
      JLabel var2 = new JLabel(a("\u000fC3:>"), SwingUtils.readImageIcon(a("x\u001c\'n{fN0<8$O1+>gZ18")), 2);
      Color var3 = this.getTextNonSelectionColor();
      var2.setForeground(var3);
      return var2;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 73;
            break;
         case 1:
            var10003 = 42;
            break;
         case 2:
            var10003 = 95;
            break;
         case 3:
            var10003 = 95;
            break;
         default:
            var10003 = 77;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
