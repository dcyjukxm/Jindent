package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.TextGUIObject;
import jindent.customizer.gui.settings.e.c;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.StringArraySetting;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.SwingUtils;

public class StringArrayGUIObject extends SettingGUIObject implements TextGUIObject {
   private JTextArea g;
   private MultiLineLabel h;
   private boolean i = false;

   public StringArrayGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         StringArraySetting var1 = (StringArraySetting)this.getSetting();
         this.g.setText(var1.getValue());
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.h = new MultiLineLabel(this.getDesc(), 2);
      this.h.setToolTipText(var4);
      this.g = new JTextArea("", 1, 40);
      this.g.setFont(SwingUtils.MONO_FONT);
      this.g.setWrapStyleWord(true);
      this.g.setToolTipText(var4);
      this.g.addMouseListener(new c(var2, this));
      this.g.setBorder(BorderFactory.createLoweredBevelBorder());
      PropertiesLayout var5 = (PropertiesLayout)var1.getLayout();
      this.g.addFocusListener(new jindent.customizer.a.c(this, var2, this.g, var5));
      var1.add(this.h, b("=e\u0004w"));
      var1.add(new JavaHelpIcon(var3), b("=e\u0004w5:g\u000f\u007f$>~\u0014r%,"));
      var1.add(this.g, b("=e\u0004w5:g\u000f\u007f$>~\u0014r%,"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.g, var3);
      } else {
         System.err.println(b("3L\'P\u0001\u001ePk") + this.getName() + b("[@8\u0000\u0004\u000eE\'"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.h, this.g}));
      this.setAddedToJPanel(true);
   }

   public JTextComponent getJTextComponent() {
      return this.g;
   }

   public void setTextLocked(boolean var1) {
      this.i = var1;
   }

   public boolean isTextLocked() {
      return this.i;
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
            var10003 = 41;
            break;
         case 2:
            var10003 = 75;
            break;
         case 3:
            var10003 = 32;
            break;
         default:
            var10003 = 106;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
