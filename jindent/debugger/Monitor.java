package jindent.debugger;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import jindent.debugger.SourceTextArea;
import jindent.formatter.q;
import jindent.formatter.s;

public class Monitor extends JDialog implements s {
   private JScrollPane a;
   private JScrollPane b;
   private JSplitPane c;
   private SourceTextArea d;
   private JTextArea e;
   private Container f;
   private q g;

   public Monitor(String var1, q var2) {
      this((Frame)null, a("CYH\u0004\u001b7{L\u000f\u001ccYQ"), true, var1, var2);
   }

   public Monitor(Frame var1, String var2, boolean var3, String var4, q var5) {
      super(var1, var2, var3);
      this.g = var5;

      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var8) {
         System.out.println(a("RDQ\u000e\u00077EF\u0015\u0001~XDA\u001bvBJ\u0017\u00107zb\'O7") + var8);
      }

      this.setSize(800, 600);
      Dimension var6 = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension var7 = this.getSize();
      if(var7.height > var6.height) {
         var7.height = var6.height;
      }

      if(var7.width > var6.width) {
         var7.width = var6.width;
      }

      this.setLocation((var6.width - var7.width) / 2, (var6.height - var7.height) / 2);
      this.f = this.getContentPane();
      this.d = new SourceTextArea(this, var4);
      this.e = new JTextArea(a("~XE\u000e"));
      this.e.setFont(new Font(a("ZYM\u000e\u0006gW@\u0004\u0011"), 0, 10));
      this.a = new JScrollPane(this.d);
      this.b = new JScrollPane(this.e);
      this.c = new JSplitPane(0);
      this.c.setTopComponent(this.a);
      this.c.setBottomComponent(this.b);
      this.f.add(this.c, a("TSM\u0015\u0010e"));
      this.setVisible(true);
   }

   public void a(q var1, q var2) {
      StringBuffer var3 = new StringBuffer();

      for(q var4 = var1; var4 != var2.g; var4 = var4.g) {
         var3.append(var4.b());
         var3.append("\n");
      }

      this.e.setText(var3.toString());
   }

   public void a(int var1, int var2) {
      q var3 = this.a(var1);
      q var4 = this.a(var2);
      this.a(var3, var4);
   }

   public q a(int var1) {
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(q var8 = this.g; var8 != null; var8 = var8.g) {
         if(var8.a != -25) {
            var4 += var8.c - var6;
            var5 += var8.e - var7;
            var6 = var8.c;
            var7 = var8.e;
         } else {
            var6 = 0;
            var7 = 0;
            ++var4;
            ++var5;
         }

         if(var4 <= var1 && var1 <= var5) {
            return var8;
         }
      }

      return null;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 23;
            break;
         case 1:
            var10003 = 54;
            break;
         case 2:
            var10003 = 35;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 117;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
