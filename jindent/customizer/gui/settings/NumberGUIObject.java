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
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.NumberSetting;
import jindent.util.swing.MultiLineLabel;

public class NumberGUIObject extends SettingGUIObject {
   protected JTextField g;
   protected MultiLineLabel h;
   protected JComboBox i;
   protected int j;
   protected String[] k;

   public NumberGUIObject(String var1, String var2, int var3, String[] var4) {
      super(var1, var2);
      this.j = var3;
      this.k = var4;
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         NumberSetting var1 = (NumberSetting)this.getSetting();
         String var2 = String.valueOf(var1.getValue());
         this.g.setText(var2);
         int var3 = this.i.getItemCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = (String)this.i.getItemAt(var4);
            if(var2.equals(var5)) {
               this.i.setSelectedIndex(var4);
               return;
            }
         }
      }

   }

   protected void setComboBoxSelection(String var1) {
      this.i.setSelectedItem(var1);
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
      var1.add(this.h, b("Q\b,M,\\\u0018!T(U\t%\\"));
      var1.add(this.i, b("T\u000b/O"));
      var1.add(new JavaHelpIcon(var3), b("T\u000b/O>S\t$G/W\u0010?J.E"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
      } else {
         System.err.println(b("Z\"\fh\nw>@") + this.getName() + b("2.\u00138\u000fg+\f"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.h, this.i}));
      this.updateJPanel();
      this.setAddedToJPanel(true);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 18;
            break;
         case 1:
            var10003 = 71;
            break;
         case 2:
            var10003 = 96;
            break;
         case 3:
            var10003 = 24;
            break;
         default:
            var10003 = 97;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
