package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.b;
import jindent.customizer.a.d;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.constraint.INumberActor;
import jindent.customizer.gui.settings.NumberGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.INumberSetting;
import jindent.util.swing.MultiLineLabel;

public class INumberGUIObject extends NumberGUIObject {
   protected JCheckBox l;

   public INumberGUIObject(String var1, String var2, int var3, String[] var4) {
      super(var1, var2, var3, var4);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         super.updateJPanel();
         INumberSetting var1 = (INumberSetting)this.getSetting();
         this.i.setEnabled(this.h.isEnabled() && !var1.isInfinite());
         this.l.setSelected(var1.isInfinite());
      }

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
      this.l = new JCheckBox(c("+p(Xc+j+"), false);
      this.l.setToolTipText(var4);
      this.l.addItemListener(new jindent.customizer.a.a(this, var2, this.l));
      var1.add(this.h, c("\u0001Q\u0002d@\fA\u000f}D\u0005P\u000bu"));
      var1.add(this.i, c("\u0004R\u0001f"));
      var1.add(this.l, c("\u0004R\u0001f"));
      var1.add(new JavaHelpIcon(var3), c("\u0004R\u0001fR\u0003P\nnC\u0007I\u0011cB\u0015"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
         HelpUtils.setHelpIDString((Component)this.l, var3);
      } else {
         System.err.println(c("\n{\"Af\'gn") + this.getName() + c("bw=\u0011c7r\""));
      }

      var2.getConstraintsHandler().addActor(new INumberActor(this.getName(), this.l));
      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.h, this.l, this.i}));
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
            var10003 = 66;
            break;
         case 1:
            var10003 = 30;
            break;
         case 2:
            var10003 = 78;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 13;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
