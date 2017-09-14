package jindent.customizer.gui.settings;

import java.awt.Component;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.b;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.constraint.SelectionActor;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.DefaultSelectionSetting;
import jindent.settings.Setting;

public abstract class SelectionGUIObject extends SettingGUIObject {
   protected static final int g = 0;
   protected JComboBox h;
   protected JLabel i;

   public SelectionGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public abstract Vector getSelectionValues();

   public abstract int[] getDisabledIndex();

   public void updateJPanel() {
      if(this.containsSetting()) {
         Setting var1 = this.getSetting();
         DefaultSelectionSetting var2 = (DefaultSelectionSetting)var1;
         this.h.setSelectedIndex(var2.getIndex());
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.i = new JLabel(this.getDesc(), 2);
      this.i.setToolTipText(var4);
      this.h = new JComboBox(this.getSelectionValues());
      this.updateJPanel();
      this.h.setToolTipText(var4);
      this.h.addActionListener(new b(this, var2, this.h));
      var1.add(this.i, b(",v;gS!f6~W(w2v"));
      var1.add(this.h, b(")u8e"));
      var1.add(new JavaHelpIcon(var3), b(")u8eA.w3mP*n(`Q8"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.i, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
      } else {
         System.err.println(b("\'\\\u001bBu\n@W") + this.getName() + b("OP\u0004\u0012p\u001aU\u001b"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.i, this.h}));
      var2.getConstraintsHandler().addActor(new SelectionActor(this.getName(), this.h, this.getDisabledIndex()));
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
            var10003 = 111;
            break;
         case 1:
            var10003 = 57;
            break;
         case 2:
            var10003 = 119;
            break;
         case 3:
            var10003 = 50;
            break;
         default:
            var10003 = 30;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
