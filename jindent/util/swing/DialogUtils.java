package jindent.util.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Window;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import jindent.SettingsVersionException;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.g;

public class DialogUtils {
   public static JDialog createWaitDialog(Component var0, String var1) {
      Window var2 = SwingUtils.findWindow(var0);
      JDialog var3 = null;
      if(var2 instanceof JFrame) {
         var3 = new JDialog((JFrame)var2);
      } else if(var2 instanceof JDialog) {
         var3 = new JDialog((JDialog)var2);
      } else {
         var3 = new JDialog((JFrame)null);
      }

      var3.setTitle(a("6\u0004{3\n\u0012\u0019"));
      var3.setUndecorated(true);
      var3.setResizable(false);
      Container var4 = var3.getContentPane();
      var4.setLayout(new BorderLayout());
      Border var5 = BorderFactory.createEtchedBorder(0);
      JPanel var6 = new JPanel(new BorderLayout());
      var6.setBorder(var5);
      ImageIcon var7 = SwingUtils.readImageIcon(a("O_md]S\np6\u001d#\u0019|:\nR\u001d{0"));
      JLabel var8 = new JLabel(var1, var7, 2);
      var8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      var6.add(var8, a("?\b{#\n\u000e"));
      var4.add(var6, a("?\b{#\n\u000e"));
      var3.pack();
      SwingUtils.centerWindowTo(var3, var2);
      var3.setCursor(Cursor.getPredefinedCursor(3));
      return var3;
   }

   public static int showErrorDialog(Component var0, String var1) {
      Object[] var2 = new Object[]{var1};
      Object[] var3 = new Object[]{a("3&")};
      return JOptionPane.showOptionDialog(var0, var2, a("6\u0004{3\n\u0012\u00195\u0012\u001d\u000e\u0002gw\"\u0019\u001ef6\b\u0019"), 0, 0, SwingUtils.readImageIcon(a("O_md]S\bg%\u0000\u000eCe9\b")), var3, var3[0]);
   }

   public static int showInfoDialog(Component var0, String var1) {
      Object[] var2 = new Object[]{var1};
      Object[] var3 = new Object[]{a("3&")};
      return JOptionPane.showOptionDialog(var0, var2, a("6\u0004{3\n\u0012\u00195\u001a\n\u000f\u001et0\n"), 0, 1, SwingUtils.readImageIcon(a("O_md]S\u0004{1\u0000\u000e\u0000t#\u0006\u0013\u0003;\'\u0001\u001b")), var3, var3[0]);
   }

   public static int showQuestionDialog(Component var0, String var1) {
      Object[] var2 = new Object[]{var1};
      Object[] var3 = new Object[]{a("3&"), a("?\f{4\n\u0010")};
      int var4 = JOptionPane.showOptionDialog(var0, var2, a("6\u0004{3\n\u0012\u00195\u0006\u001a\u0019\u001ea>\u0000\u0012"), 2, -1, SwingUtils.readImageIcon(a("O_md]S\u0018{<\u0001\u0013\u001a{y\u001f\u0012\n")), var3, var3[0]);
      return var4 == 0?0:2;
   }

   public static int showInfoDialog(Component var0, String var1, String var2, String var3) {
      Object[] var4 = new Object[]{var1};
      Object[] var5 = new Object[]{var2, var3};
      return JOptionPane.showOptionDialog(var0, var4, a("6\u0004{3\n\u0012\u00195\u001a\n\u000f\u001et0\n"), 2, -1, SwingUtils.readImageIcon(a("O_md]S\u0004{1\u0000\u000e\u0000t#\u0006\u0013\u0003;\'\u0001\u001b")), var5, var5[0]);
   }

   public static int showImportDialog(Component var0, SettingsVersionException var1) {
      Object[] var2 = new Object[]{var1.getMessage() + a("v)zw\u0016\u0013\u00185 \u000e\u0012\u00195#\u0000\\\u0004x\'\u0000\u000e\u00195#\u0007\u0019\u001epw\u001c\u0019\u0019a>\u0001\u001b\u001e*")};
      Object[] var3 = new Object[]{a("5\u0000e8\u001d\b"), a("?\f{4\n\u0010")};
      return JOptionPane.showOptionDialog(var0, var2, a("6\u0004{3\n\u0012\u00195\u001a\n\u000f\u001et0\n"), 2, -1, SwingUtils.readImageIcon(a("O_md]S\u0004x\'\u0000\u000e\u0019$y\u001f\u0012\n")), var3, var3[0]);
   }

   public static void removedFilesWarning(File[] var0, Component var1) {
      g var2 = new g(var0, var1);
      var2.start();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 124;
            break;
         case 1:
            var10003 = 109;
            break;
         case 2:
            var10003 = 21;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 111;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
