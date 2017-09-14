package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.d;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.LogFileGUIObject$1;
import jindent.customizer.gui.settings.LogFileGUIObject$2;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.TextGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.LogFileSetting;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.SwingUtils;

public class LogFileGUIObject extends SettingGUIObject implements TextGUIObject {
   public static final transient int COLUMNS_NUMBER = 25;
   private JCheckBox g;
   private JButton h;
   private JTextField i;
   private MultiLineLabel j;
   private boolean k = false;

   public LogFileGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         LogFileSetting var1 = (LogFileSetting)this.getSetting();
         this.g.setSelected(var1.getUseLogFile());
         this.i.setText(var1.getFilename());
         boolean var2 = this.g.isSelected();
         this.i.setEnabled(var2);
         this.j.setEnabled(var2);
         this.h.setEnabled(var2);
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.j = new MultiLineLabel(b("|}fg>Y~d}"), 2);
      this.j.setToolTipText(var4);
      this.i = new JTextField("", 25);
      this.i.setToolTipText(var4);
      this.i.setBorder(BorderFactory.createLoweredBevelBorder());
      this.i.addActionListener(new d(this, var2, this.i));
      this.i.addFocusListener(new d(this, var2, this.i));
      this.h = new JButton(b("Cwm\"\u001bD2g.\u0014U"));
      this.h.setIcon(SwingUtils.readImageIcon(b("\u0001$yvN\u001ftn+\u001cU`/7\u0016W")));
      this.h.addActionListener(new LogFileGUIObject$1(this, var1));
      this.g = new JCheckBox(b("|}fg\u0015Uar&\u001fUa!3\u0017\u0010th+\u001d"));
      this.g.setSelected(false);
      this.g.addActionListener(new LogFileGUIObject$2(this));
      var1.add(this.g, b("v^N\u0010"));
      var1.add(new JavaHelpIcon(var3), b("v^N\u0010\'q\\E\u00186uE^\u00157g"));
      var1.add(this.j, b("s]M\u00125~M@\u000b1w\\D\u0003"));
      var1.add(this.i, b("v^N\u0010"));
      var1.add(this.h, b("v^N\u0010"));
      var1.add(new JavaHelpIcon(var3), b("v^N\u0010\'q\\E\u00186uE^\u00157g"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.g, var3);
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
      } else {
         System.err.println(b("xwm7\u0013Uk!") + this.getName() + b("\u0010{rg\u0016E~m"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.j, this.i}));
      this.setAddedToJPanel(true);
      this.updateJPanel();
   }

   public JTextComponent getJTextComponent() {
      return this.i;
   }

   public void setTextLocked(boolean var1) {
      this.k = var1;
   }

   public boolean isTextLocked() {
      return this.k;
   }

   static JTextField access$000(LogFileGUIObject var0) {
      return var0.i;
   }

   static JCheckBox access$100(LogFileGUIObject var0) {
      return var0.g;
   }

   static MultiLineLabel access$200(LogFileGUIObject var0) {
      return var0.j;
   }

   static JButton access$300(LogFileGUIObject var0) {
      return var0.h;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 48;
            break;
         case 1:
            var10003 = 18;
            break;
         case 2:
            var10003 = 1;
            break;
         case 3:
            var10003 = 71;
            break;
         default:
            var10003 = 120;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
