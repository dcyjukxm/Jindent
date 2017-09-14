package jindent.customizer.gui.settings;

import java.awt.Component;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.b;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.SelectionGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;

public class BAWrappingGUIObject extends SelectionGUIObject {
   private static Vector j = new Vector();
   private JLabel k;
   private JLabel l;

   public BAWrappingGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return j;
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.k = new JLabel(c("`s&S]"), 2);
      this.l = new JLabel(this.getDesc(), 2);
      this.k.setToolTipText(var4);
      this.l.setToolTipText(var4);
      this.h = new JComboBox(j);
      this.updateJPanel();
      this.h.setToolTipText(var4);
      this.h.addActionListener(new b(this, var2, this.h));
      JPanel var5 = new JPanel();
      var5.add(this.k);
      var5.add(this.h);
      var5.add(this.l);
      var1.add(var5, c("qM\bt"));
      var1.add(new JavaHelpIcon(var3), c("qM\bt\"vO\u0003|3rV\u0018q2`"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.k, var3);
         HelpUtils.setHelpIDString((Component)this.l, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)var5, var3);
      } else {
         System.err.println(c("\u007fd+S\u0016Rxg") + this.getName() + c("\u0017h4\u0003\u0013Bm+"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.k, this.l, this.h}));
      this.setAddedToJPanel(true);
   }

   static {
      j.add(c("Ud!L\u000fR"));
      j.add(c("Vg3F\u000f"));
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 55;
            break;
         case 1:
            var10003 = 1;
            break;
         case 2:
            var10003 = 71;
            break;
         case 3:
            var10003 = 35;
            break;
         default:
            var10003 = 125;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
