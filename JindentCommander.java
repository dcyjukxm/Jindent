import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.UIManager;
import jindent.commander.AboutDialog;
import jindent.commander.CommanderFrame;
import jindent.formatter.k;
import jindent.util.c.b;
import jindent.util.c.e;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class JindentCommander {
   private static final int a = 1024;
   private static final int b = 600;
   boolean c;

   public JindentCommander() {
      this("");
   }

   public JindentCommander(String var1) {
      this.c = false;
      AboutDialog var2 = new AboutDialog();
      if(CommanderFrame.SHOW_WELCOME_SCREEN) {
         var2.b().setVisible(false);
         var2.setVisible(true);
         var2.setUndecorated(true);
      }

      var2.pack();
      SwingUtils.centerWindow(var2);
      CommanderFrame var3 = new CommanderFrame();
      if(this.c) {
         var3.pack();
      } else {
         var3.validate();
      }

      Dimension var4 = Toolkit.getDefaultToolkit().getScreenSize();
      var3.setSize(1024, 600);
      Dimension var5 = var3.getSize();
      if(var5.height > var4.height) {
         var5.height = var4.height;
      }

      if(var5.width > var4.width) {
         var5.width = var4.width;
      }

      var3.setLocation((var4.width - var5.width) / 2, (var4.height - var5.height) / 2);
      var3.a(var2);
      var3.setVisible(true);
      if(!var1.equals("")) {
         File var6 = new File(var1);
         if(!var6.exists()) {
            DialogUtils.showErrorDialog(var3, a("\bM(*F") + var1 + a("nJ+;F(K1!\u0002`"));
         } else if(!var6.isFile()) {
            DialogUtils.showErrorDialog(var3, a("\bM(*F") + var1 + a("nM7o\b!Pd.F(M(*H"));
         } else if(!var6.canRead()) {
            DialogUtils.showErrorDialog(var3, a("\rE*h\u0012nK4*\bnB-#\u0003n") + var1 + ".");
         } else {
            var3.a(var1);
         }
      }

      if(CommanderFrame.SHOW_WELCOME_SCREEN) {
         var2.dispose();
         var2.b().setVisible(true);
      }

      if(!k.a()) {
         b.a(var3, new e());
      }

   }

   public static void main(String[] var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      if(var0.length > 1) {
         System.err.println(a("\u000bv\u0016\u00004t\u0004\u0010 \tnI%!\u001fnE6(\u0013#A*;\u0015`\u0004\r(\b!V-!\u0001nW1=\u0016\"Q7o\u0007<C1\"\u0003 P7a"));
      }

      if(var0.length == 1) {
         new JindentCommander(var0[0]);
      } else {
         new JindentCommander();
      }

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 78;
            break;
         case 1:
            var10003 = 36;
            break;
         case 2:
            var10003 = 68;
            break;
         case 3:
            var10003 = 79;
            break;
         default:
            var10003 = 102;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
