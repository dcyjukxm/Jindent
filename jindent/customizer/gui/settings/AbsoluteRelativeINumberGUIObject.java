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
import jindent.customizer.gui.settings.AbsoluteRelativeINumberGUIObject$1;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.AbsoluteRelativeINumberSetting;
import jindent.util.swing.MultiLineLabel;

public class AbsoluteRelativeINumberGUIObject extends SettingGUIObject {
   private JComboBox g;
   private static String[] h = new String[]{b("9;0u\u0013\u0002(94\u0013\u0004~?a\u0015\u0019;2`G\t23w\fK72p\u0002\u0005*=`\u000e\u00040"), b("*</{\u000b\u001e*94\u0004\u00042)y\tK.3g\u000e\u001f73z")};
   private static String[] i = new String[]{b("Zn"), b("Zk"), b("Yn"), b("Yk"), b("Xn"), b("Xk"), b("_n"), b("_k"), b("^n"), b("^k"), b("]n"), b("]k"), b("\\n"), b("\\k"), b("Sn"), b("Sk"), b("Rn"), b("Rk"), b("Znl")};
   private MultiLineLabel j;
   private JComboBox k;
   private JTextField l;
   private JCheckBox m;

   public AbsoluteRelativeINumberGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         AbsoluteRelativeINumberSetting var1 = (AbsoluteRelativeINumberSetting)this.getSetting();
         this.m.setSelected(var1.isInfinite());
         this.g.setSelectedIndex(var1.getIndex());
         String var2 = String.valueOf(var1.getValue());
         this.l.setText(var2);
         this.l.setEnabled(this.j.isEnabled() && !var1.isInfinite());
         this.k.setEnabled(this.j.isEnabled() && !var1.isInfinite());
         int var3 = this.k.getItemCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = (String)this.k.getItemAt(var4);
            if(var2.equals(var5)) {
               this.k.setSelectedIndex(var4);
               return;
            }
         }
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.j = new MultiLineLabel(this.getDesc(), 2);
      this.j.setToolTipText(var4);
      var1.add(this.j, b("-\u0012\u0013C8*\u0010\u0018K).\t\u0003F(<"));
      this.g = new JComboBox(h);
      this.g.setToolTipText(var4);
      var1.add(this.g, b("(\u0011\u0010A*%\u0001\u001dX.,\u0010\u0019P"));
      this.k = new JComboBox(i);
      this.k.setEditable(true);
      this.k.setBorder(BorderFactory.createLoweredBevelBorder());
      this.k.setToolTipText(var4);
      ComboBoxEditor var5 = this.k.getEditor();
      this.l = (JTextField)((JTextField)var5.getEditorComponent());
      this.l.setColumns(3);
      this.l.addActionListener(new d(this, var2, this.l));
      this.l.addFocusListener(new d(this, var2, this.l));
      this.k.addActionListener(new b(this, var2, this.k));
      this.m = new JCheckBox(b("\u00020:}\t\u0002*9"), false);
      var1.add(this.k, b("-\u0012\u0013C"));
      this.m.setToolTipText(var4);
      this.m.addItemListener(new jindent.customizer.a.a(this, var2, this.m));
      var1.add(this.m, b("-\u0012\u0013C"));
      var1.add(new JavaHelpIcon(var3), b("-\u0012\u0013C8*\u0010\u0018K).\t\u0003F(<"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.k, var3);
         HelpUtils.setHelpIDString((Component)this.l, var3);
         HelpUtils.setHelpIDString((Component)this.m, var3);
         HelpUtils.setHelpIDString((Component)this.g, var3);
      } else {
         System.err.println(b("#;0d\f\u000e\'|") + this.getName() + b("K7/4\t\u001e20"));
      }

      var2.getConstraintsHandler().addActor(new INumberActor(this.getName(), this.m));
      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.j, this.g, this.m, this.k, this.l}));
      this.updateJPanel();
      this.g.addActionListener(new AbsoluteRelativeINumberGUIObject$1(this, var2));
      this.setAddedToJPanel(true);
   }

   static JComboBox access$000(AbsoluteRelativeINumberGUIObject var0) {
      return var0.g;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 107;
            break;
         case 1:
            var10003 = 94;
            break;
         case 2:
            var10003 = 92;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 103;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
