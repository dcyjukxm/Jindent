package jindent.customizer.gui.elements;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import jindent.JindentSystem;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.about.AboutTableModel;
import jindent.customizer.gui.elements.about.AboutTableRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;

public class AboutGUIObject extends GUIObject {
   private AboutTableModel f;
   private JTable g;
   private static final int h = 450;
   private static final int i = 200;
   private static final int j = 225;
   private static final int k = 90;
   private static final int l = 135;
   // $FF: synthetic field
   static Class m;

   public AboutGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String[] var5 = new String[]{a("\u0013\u0002\u0015RN;"), a("\b\b\u0003TK1\u0003"), a("\f\b\u001dBC-\bQCC*\b")};
      this.f = new AboutTableModel(var5, JindentSystem.getAboutInfoList());
      this.g = new JTable(this.f);
      AboutTableRenderer var6 = new AboutTableRenderer();
      this.g.setDefaultRenderer(m == null?(m = class$(a("4\f\u0007F\f2\f\u001f@\f\r\u0019\u0003NL9"))):m, var6);
      this.g.setShowGrid(false);
      this.g.setEnabled(false);
      this.g.getTableHeader().setReorderingAllowed(false);
      this.g.getColumn(var5[0]).setPreferredWidth(225);
      this.g.getColumn(var5[1]).setPreferredWidth(90);
      this.g.getColumn(var5[2]).setPreferredWidth(135);
      this.g.setSelectionMode(0);
      JScrollPane var7 = new JScrollPane(this.g, 20, 30);
      var7.setPreferredSize(new Dimension(450, 200));
      var7.getViewport().setBackground(this.g.getBackground());
      Component[] var4 = new Component[]{this.g, var7};
      var1.add(var7, a("\u0018!>p}\u001f#5xl\u001b:.um\t"));
      var1.add(new JavaHelpIcon(var3), a("\u0018!>p}\u001f#5xl\u001b:.um\t"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString(var4, var3);
      } else {
         System.err.println(a("\u0016\b\u001dWI;\u0014Q") + this.getName() + a("~\u0004\u0002\u0007L+\u0001\u001d"));
      }

      this.setAddedToJPanel(true);
   }

   public void updateJPanel() {
   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
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
            var10003 = 94;
            break;
         case 1:
            var10003 = 109;
            break;
         case 2:
            var10003 = 113;
            break;
         case 3:
            var10003 = 39;
            break;
         default:
            var10003 = 34;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
