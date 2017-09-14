package jindent.util.swing.b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.b.b;
import jindent.util.swing.b.c;

public class SwingInfoDialog extends JDialog {
   public SwingInfoDialog(JFrame var1, String var2, String var3, String var4, String var5, String var6) {
      super(var1, true);
      this.a(var2, var3, var4, var5, var6);
   }

   public SwingInfoDialog(JDialog var1, String var2, String var3, String var4, String var5, String var6) {
      super(var1, true);
      this.a(var2, var3, var4, var5, var6);
   }

   private void a(String var1, String var2, String var3, String var4, String var5) {
      this.setTitle(var1);
      this.setResizable(false);
      Container var6 = this.getContentPane();
      JPanel var7 = new JPanel();
      var7.setLayout(new BoxLayout(var7, 1));
      var7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      Font var8 = new Font(a("}`\u001a=D\tG\u0012/\u0017{f\u001a9Y"), 1, 14);
      JPanel var9 = new JPanel();
      var9.setLayout(new BorderLayout());
      var9.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      ImageIcon var10 = SwingUtils.readImageIcon(var2);
      JLabel var11 = new JLabel(var3 + a("\u0013)"), var10, 2);
      var11.setFont(var8);
      JLabel var12 = new JLabel(var4);
      var12.setFont(var8);
      JLabel var13 = new JLabel(a("A}\u0003(\r\u0006&\u0000/@\u0007c\u001e6SLg\u0003vTFd"));
      Color var14 = var13.getForeground();
      new Color(255 - var14.getRed(), 255 - var14.getGreen(), 255 - var14.getBlue());
      var12.setFont(var8);
      var9.add(var11, a("~l\u0004,"));
      var9.add(var12, a("jl\u0019,R["));
      var9.add(var13, a("lh\u0004,"));
      var7.add(var9);
      JEditorPane.registerEditorKitForContentType(a("]l\u000f,\u0018A}\u001a4\u001aC`\u0019<RG}"), a("Ch\u00019O\u0007z\u00001YN\'\u0003=O]\'\u001f,ZE\'?\fzeL\u00131CF{<1C"));
      JEditorPane var16 = new JEditorPane();
      var16.setEditable(false);
      var16.setContentType(a("]l\u000f,\u0018A}\u001a4\u001aC`\u0019<RG}"));
      var16.setText(var5);
      var16.addHyperlinkListener(new jindent.util.swing.b.a(this));
      JScrollPane var17 = new JScrollPane(var16);
      var17.setPreferredSize(new Dimension(500, 310));
      var7.add(var17, a("jl\u0019,R["));
      JPanel var18 = new JPanel(new FlowLayout());
      var18.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
      JButton var19 = new JButton(a("je\u0018+R"));
      var18.add(var19);
      var19.addActionListener(new b(this));
      var7.add(var18);
      var6.add(var7);
      this.pack();
      SwingUtils.centerWindow(this);
      this.setVisible(true);
      SwingUtilities.invokeLater(new c(this, var17));
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 41;
            break;
         case 1:
            var10003 = 9;
            break;
         case 2:
            var10003 = 119;
            break;
         case 3:
            var10003 = 88;
            break;
         default:
            var10003 = 55;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
