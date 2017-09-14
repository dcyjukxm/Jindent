package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.b;
import jindent.customizer.a.d;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.NumberGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.util.swing.MultiLineLabel;

public class NZNumberGUIObject extends NumberGUIObject {
   public NZNumberGUIObject(String var1, String var2, int var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.h = new MultiLineLabel(this.getDesc(), 2);
      this.h.setToolTipText(var4);
      this.i = new JComboBox(this.k);
      this.i.setEditable(true);
      ComboBoxEditor var5 = this.i.getEditor();
      this.g = (JTextField)((JTextField)var5.getEditorComponent());
      this.g.setColumns(this.j);
      this.i.setBorder(BorderFactory.createLoweredBevelBorder());
      this.i.setToolTipText(var4);
      this.i.addActionListener(new b(this, var2, this.i));
      this.g.addActionListener(new d(this, var2, this.g));
      this.g.addFocusListener(new d(this, var2, this.g));
      var1.add(this.h, c("\u0007\\\u0017\u0006\u0017\nL\u001a\u001f\u0013\u0003]\u001e\u0017"));
      var1.add(this.i, c("\u0002_\u0014\u0004"));
      var1.add(new JavaHelpIcon(var3), c("\u0002_\u0014\u0004\u0005\u0005]\u001f\f\u0014\u0001D\u0004\u0001\u0015\u0013"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
      } else {
         System.err.println(c("\fv7#1!j{") + this.getName() + c("dz(s41\u007f7"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.h, this.i}));
      this.updateJPanel();
      this.setAddedToJPanel(true);
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 68;
            break;
         case 1:
            var10003 = 19;
            break;
         case 2:
            var10003 = 91;
            break;
         case 3:
            var10003 = 83;
            break;
         default:
            var10003 = 90;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
