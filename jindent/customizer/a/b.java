package jindent.customizer.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.settings.DateFormatSetting;
import jindent.settings.DefaultSelectionSetting;
import jindent.settings.DocTypeSetting;
import jindent.settings.EncodingSetting;
import jindent.settings.NumberSetting;
import jindent.settings.Setting;
import jindent.util.swing.DialogUtils;

public class b implements ActionListener {
   private SettingGUIObject a;
   private CustomizerData b;
   private JComboBox c;
   private JTextField d;

   public b(SettingGUIObject var1, CustomizerData var2, JComboBox var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      ComboBoxEditor var4 = var3.getEditor();
      this.d = (JTextField)((JTextField)var4.getEditorComponent());
   }

   public void actionPerformed(ActionEvent var1) {
      Setting var2 = this.a.getSetting();
      int var3 = this.c.getSelectedIndex();
      String var5;
      if(var2 instanceof DateFormatSetting) {
         DateFormatSetting var4 = (DateFormatSetting)var2;
         var5 = (String)this.c.getItemAt(var3);
         if(var5 != null) {
            if(DateFormatSetting.validateDateString(var5)) {
               var4.setValue(var5);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
               this.a.updateJPanel();
            } else {
               this.d.setText(var4.getValue());
               DialogUtils.showErrorDialog(this.d, a("cq\u001eb\u0006V=\u001em\u0001Vo[bUE|\u0017j\u0011\u0013y\u001aw\u0010\u0013{\u0014q\u0018RiZ"));
            }
         }
      } else if(var2 instanceof EncodingSetting) {
         EncodingSetting var6 = (EncodingSetting)var2;
         var5 = (String)this.c.getItemAt(var3);
         if(var5 != null) {
            if(EncodingSetting.validateEncoding(var5)) {
               var6.setValue(var5);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
               this.a.updateJPanel();
            } else {
               this.d.setText(EncodingSetting.DEFAULT_SYSTEM_ENCODING);
               var6.setValue(EncodingSetting.DEFAULT_SYSTEM_ENCODING);
               DialogUtils.showErrorDialog(this.d, a("gu\u0012pUVs\u0018l\u0011Zs\u001c#\u001c@=\u0015l\u0001\u0013n\u000es\u0005\\o\u000ff\u0011\u0012"));
               this.a.updateJPanel();
            }
         }
      } else if(var2 instanceof DocTypeSetting) {
         DocTypeSetting var7 = (DocTypeSetting)var2;
         var5 = (String)this.c.getItemAt(var3);
         if(var5 != null && DocTypeSetting.validateDocType(var5)) {
            var7.setValue(var5);
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            this.a.updateJPanel();
         }
      } else if(var2 instanceof NumberSetting) {
         NumberSetting var8 = (NumberSetting)var2;
         var5 = (String)this.c.getItemAt(var3);
         if(var5 != null && NumberSetting.validateNumber(var5)) {
            var8.setValue(Integer.parseInt(var5));
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            this.a.updateJPanel();
         }
      } else {
         DefaultSelectionSetting var9 = (DefaultSelectionSetting)var2;
         var9.setIndex(var3);
         this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         this.a.updateJPanel();
      }

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 51;
            break;
         case 1:
            var10003 = 29;
            break;
         case 2:
            var10003 = 123;
            break;
         case 3:
            var10003 = 3;
            break;
         default:
            var10003 = 117;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
