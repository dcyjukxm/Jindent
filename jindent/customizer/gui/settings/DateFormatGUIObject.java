package jindent.customizer.gui.settings;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import jindent.customizer.CustomizerData;
import jindent.customizer.a.b;
import jindent.customizer.a.d;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.constraint.SelectionActor;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.DateFormatSetting;
import jindent.util.swing.MultiLineLabel;

public class DateFormatGUIObject extends SettingGUIObject {
   private static Vector g = new Vector();
   private JComboBox h;
   private JTextField i;
   private MultiLineLabel j;

   public DateFormatGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return g;
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         DateFormatSetting var1 = (DateFormatSetting)this.getSetting();
         String var2 = var1.getValue();
         this.i.setText(var2);
         int var3 = this.h.getItemCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = (String)this.h.getItemAt(var4);
            if(var2.equals(var5)) {
               this.h.setSelectedIndex(var4);
               return;
            }
         }
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.j = new MultiLineLabel(this.getDesc(), 2);
      this.j.setToolTipText(var4);
      this.h = new JComboBox(g);
      this.h.setEditable(true);
      ComboBoxEditor var5 = this.h.getEditor();
      this.i = (JTextField)((JTextField)var5.getEditorComponent());
      this.i.setColumns(25);
      this.h.setBorder(BorderFactory.createLoweredBevelBorder());
      this.updateJPanel();
      this.h.setToolTipText(var4);
      this.h.addActionListener(new b(this, var2, this.h));
      this.i.addActionListener(new d(this, var2, this.i));
      this.i.addFocusListener(new d(this, var2, this.i));
      var1.add(this.j, b(".[\u0001\u0014j#K\f\rn*Z\b\u0005"));
      var1.add(this.h, b("+X\u0002\u0016"));
      var1.add(new JavaHelpIcon(var3), b("+X\u0002\u0016x,Z\t\u001ei(C\u0012\u0013h:"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
      } else {
         System.err.println(b("%q!1L\bmm") + this.getName() + b("M}>aI\u0018x!"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.j, this.h, this.i}));
      var2.getConstraintsHandler().addActor(new SelectionActor(this.getName(), this.h, this.getDisabledIndex()));
      this.setAddedToJPanel(true);
   }

   public static boolean validateDateString(String var0) {
      try {
         SimpleDateFormat var1 = new SimpleDateFormat(var0);
         Date var2 = new Date();
         var1.format(var2);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static {
      g.add(b("\tpc\fj Y\u0000a^\u0014m4"));
      g.add(b("\tpc\fj 448^\u0014"));
      g.add(b("\tpc\fjCm4"));
      g.add(b(" Yb%CBm4"));
      g.add(b("\u0014mb\fjBp)"));
      g.add(b("\u0014m48\n Y`%C"));
      g.add(b("(Q\bm\u0007 Y\u0000aCA4jf^\u0014"));
      g.add(b("\u0014m48\t Yc%CM3,5\u0000M|%{J\u0000.>2\u0007\u0017"));
      g.add(b("\u0014m48\t Y\u0000\fjCp)aO\u0005. ,\u0007\fu,"));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 109;
            break;
         case 1:
            var10003 = 20;
            break;
         case 2:
            var10003 = 77;
            break;
         case 3:
            var10003 = 65;
            break;
         default:
            var10003 = 39;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
