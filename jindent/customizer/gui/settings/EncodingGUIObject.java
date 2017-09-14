package jindent.customizer.gui.settings;

import java.awt.Component;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.Vector;
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
import jindent.customizer.constraint.SelectionActor;
import jindent.customizer.gui.settings.EncodingGUIObject$1;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.settings.EncodingSetting;
import jindent.util.swing.MultiLineLabel;

public class EncodingGUIObject extends SettingGUIObject {
   public static String DEFAULT_SYSTEM_ENCODING = System.getProperty(b("u$A  v#N*jz#J"));
   private static Vector g = getAvailableEncodings();
   private JTextField h;
   private JCheckBox i;
   private MultiLineLabel j;
   private JComboBox k;

   public EncodingGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public List getSelectionValues() {
      return g;
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      this.i = new JCheckBox(b("F>He}j>Y c4>\r!ku,X)z3(C&aw$C\".;") + DEFAULT_SYSTEM_ENCODING + b("3\"Cez{$^ecr.E,`vd"), false);
      this.i.addItemListener(new jindent.customizer.a.a(this, var2, this.i));
      this.i.addChangeListener(new EncodingGUIObject$1(this, var2));
      this.i.setToolTipText(var4);
      this.j = new MultiLineLabel(this.getDesc(), 2);
      this.j.setToolTipText(var4);
      this.k = new JComboBox(g);
      this.k.setEditable(true);
      ComboBoxEditor var5 = this.k.getEditor();
      this.h = (JTextField)((JTextField)var5.getEditorComponent());
      this.k.setBorder(BorderFactory.createLoweredBevelBorder());
      this.updateJPanel();
      this.k.setToolTipText(var4);
      this.k.addActionListener(new b(this, var2, this.k));
      this.h.addActionListener(new d(this, var2, this.h));
      this.h.addFocusListener(new d(this, var2, this.h));
      var1.add(this.j, b("U\u0001b\u0012"));
      var1.add(this.k, b("U\u0001b\u0012"));
      var1.add(new JavaHelpIcon(var3), b("U\u0001b\u0012QR\u0003i\u001a@V\u001ar\u0017AD"));
      var1.add(this.i, b("U\u0001b\u0012QR\u0003i\u001a@V\u001ar\u0017AD"));
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.k, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
      } else {
         System.err.println(b("[(A5ev4\r") + this.getName() + b("3$^e`f!A"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{this.j, this.k}));
      var2.getConstraintsHandler().addActor(new SelectionActor(this.getName(), this.k, this.getDisabledIndex()));
      this.setAddedToJPanel(true);
   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   public static boolean validateEncoding(String var0) {
      try {
         new String(new byte[]{65}, var0);
         return true;
      } catch (UnsupportedEncodingException var2) {
         return false;
      }
   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         EncodingSetting var1 = (EncodingSetting)this.getSetting();
         this.i.setSelected(var1.isUseDefaultEncoding());
         this.h.setEnabled(!var1.isUseDefaultEncoding());
         this.k.setEnabled(!var1.isUseDefaultEncoding());
         String var2 = var1.getValue();
         this.h.setText(var2);
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

   public static Vector getAvailableEncodings() {
      Vector var0 = new Vector();
      var0.add(DEFAULT_SYSTEM_ENCODING);

      try {
         Class.forName(b("y,[$ }$Bkm{,_6kgcn-oa>H1"));
         SortedMap var1 = Charset.availableCharsets();
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            var0.add(var4);
         }
      } catch (ClassNotFoundException var5) {
         var0.add(b("F\u001e\u0000\u0004]P\u0004d"));
         var0.add(b("Z\u001ebh6+x\u0014h?"));
         var0.add(b("F\u0019kh6"));
         var0.add(b("F\u0019kh?%\u000fh"));
         var0.add(b("F\u0019kh?%\u0001h"));
         var0.add(b("F\u0019kh?%"));
      }

      return var0;
   }

   static JCheckBox access$000(EncodingGUIObject var0) {
      return var0.i;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 19;
            break;
         case 1:
            var10003 = 77;
            break;
         case 2:
            var10003 = 45;
            break;
         case 3:
            var10003 = 69;
            break;
         default:
            var10003 = 14;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
