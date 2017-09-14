package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.d;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.TextGUIObject;
import jindent.customizer.gui.settings.e.c;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.StringSetting;
import jindent.util.swing.MultiLineLabel;

public class StringGUIObject extends SettingGUIObject implements TextGUIObject {
   public static final transient int COLUMNS_NUMBER = 25;
   private JTextField g;
   private MultiLineLabel h;
   private boolean i = false;

   public StringGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         StringSetting var1 = (StringSetting)this.getSetting();
         this.g.setText(var1.getValue());
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.h = new MultiLineLabel(this.getDesc(), 2);
      this.h.setToolTipText(var4);
      this.g = new JTextField("", 25);
      this.g.setToolTipText(var4);
      this.g.setBorder(BorderFactory.createLoweredBevelBorder());
      this.g.addActionListener(new d(this, var2, this.g));
      this.g.addFocusListener(new d(this, var2, this.g));
      this.g.addMouseListener(new c(var2, this));
      var1.add(this.h, b("+o5\u001a(&\u007f8\u0003,/n<\u000b"));
      var1.add(this.g, b(".l6\u0018"));
      var1.add(new JavaHelpIcon(var3), b(".l6\u0018:)n=\u0010+-w&\u001d*?"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.g, var3);
      } else {
         System.err.println(b(" E\u0015?\u000e\rYY") + this.getName() + b("HI\no\u000b\u001dL\u0015"));
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
            var10003 = 104;
            break;
         case 1:
            var10003 = 32;
            break;
         case 2:
            var10003 = 121;
            break;
         case 3:
            var10003 = 79;
            break;
         default:
            var10003 = 101;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
