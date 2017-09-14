package jindent.customizer.gui.settings;

import java.awt.Component;
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
import jindent.settings.DocTypeSetting;
import jindent.util.swing.MultiLineLabel;

public class DocTypeGUIObject extends SettingGUIObject {
   public static String DEFAULT_SYSTEM_ENCODING;
   private static Vector g = new Vector();
   private JTextField h;
   private MultiLineLabel i;
   private JComboBox j;

   public DocTypeGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public Vector getSelectionValues() {
      return g;
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.i = new MultiLineLabel(this.getDesc(), 2);
      this.i.setToolTipText(var4);
      this.j = new JComboBox(g);
      this.j.setEditable(true);
      ComboBoxEditor var5 = this.j.getEditor();
      this.h = (JTextField)((JTextField)var5.getEditorComponent());
      this.j.setBorder(BorderFactory.createLoweredBevelBorder());
      this.updateJPanel();
      this.j.setToolTipText(var4);
      this.j.addActionListener(new b(this, var2, this.j));
      this.h.addActionListener(new d(this, var2, this.h));
      this.h.addFocusListener(new d(this, var2, this.h));
      var1.add(this.i, b("fAc\u0000"));
      var1.add(this.j, b("fAc\u0000WaCh\bFeZs\u0005Gw"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.i, var3);
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
      } else {
         System.err.println(b("hh@\'cEt\f") + this.getName() + b("\u0000d_wfUa@"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.i, this.j}));
      var2.getConstraintsHandler().addActor(new SelectionActor(this.getName(), this.j, this.getDisabledIndex()));
      this.setAddedToJPanel(true);
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   public static boolean validateDocType(String var0) {
      return true;
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         DocTypeSetting var1 = (DocTypeSetting)this.getSetting();
         String var2 = var1.getValue();
         this.h.setText(var2);
         int var3 = this.j.getItemCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = (String)this.j.getItemAt(var4);
            if(var2.equals(var5)) {
               this.j.setSelectedIndex(var4);
               return;
            }
         }
      }

   }

   static {
      g.add(b("AxX8"));
      g.add(b("O`E#"));
      g.add(b("Sy^>kT"));
      g.add(b("LbC$m"));
      g.add(b("T\u007fM9{IyE8fAa"));
      g.add(b("\u0002 \u0003xIc@ix\'dYhw@t@`w;\u000e<\u0018f=\u0019\"\u0003\u0012F\u0002"));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 32;
            break;
         case 1:
            var10003 = 13;
            break;
         case 2:
            var10003 = 44;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 8;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
