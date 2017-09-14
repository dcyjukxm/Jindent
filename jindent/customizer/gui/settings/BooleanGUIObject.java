package jindent.customizer.gui.settings;

import java.awt.Component;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.BooleanActor;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.BooleanSetting;
import jindent.util.swing.MultiLineCheckBox;

public class BooleanGUIObject extends SettingGUIObject {
   private MultiLineCheckBox g;

   public BooleanGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         BooleanSetting var1 = (BooleanSetting)this.getSetting();
         this.g.a(var1.getValue());
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.g = new MultiLineCheckBox(this.getDesc(), false);
      this.g.setToolTipText(var4);
      this.g.a((ItemListener)(new jindent.customizer.a.a(this, var2, this.g)));
      if(this.getFormattingType() == 1) {
         var1.add(this.g, b("8Wcdc5Gn}g<Vju"));
         var1.add(new JavaHelpIcon(var3), b("=T`f"));
      } else if(this.getFormattingType() == 0) {
         var1.add(this.g, b("=T`f"));
         var1.add(new JavaHelpIcon(var3), b("=T`fq:Vkn`>Opca,"));
      }

      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.g, var3);
      } else {
         System.err.println(b("3}CAE\u001ea\u000f") + this.getName() + b("[q\\\u0011@\u000etC"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.g}));
      var2.getConstraintsHandler().addActor(new BooleanActor(this.getName(), this.g));
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
            var10003 = 123;
            break;
         case 1:
            var10003 = 24;
            break;
         case 2:
            var10003 = 47;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 46;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
