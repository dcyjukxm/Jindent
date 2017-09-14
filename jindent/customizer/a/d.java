package jindent.customizer.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventObject;
import javax.swing.JTextField;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.settings.DateFormatSetting;
import jindent.settings.EncodingSetting;
import jindent.settings.INumberSetting;
import jindent.settings.LogFileSetting;
import jindent.settings.NZNumberSetting;
import jindent.settings.NumberSetting;
import jindent.settings.Setting;
import jindent.settings.StringSetting;
import jindent.util.swing.DialogUtils;

public class d implements FocusListener, ActionListener {
   private SettingGUIObject a;
   private CustomizerData b;
   private JTextField c;
   private String d;
   private int e;

   public d(SettingGUIObject var1, CustomizerData var2, JTextField var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = null;
      this.e = -1;
   }

   public void focusGained(FocusEvent var1) {
      this.d = this.c.getText();
   }

   public void focusLost(FocusEvent var1) {
      this.a((EventObject)var1);
   }

   public void actionPerformed(ActionEvent var1) {
      this.a((EventObject)var1);
   }

   private void a(EventObject var1) {
      if(this.a.containsSetting()) {
         Setting var2 = this.a.getSetting();
         int var4;
         if(var2 instanceof NZNumberSetting) {
            NZNumberSetting var3 = (NZNumberSetting)var2;

            try {
               var4 = Integer.parseInt(this.c.getText());
               if(var4 < 1) {
                  throw new NumberFormatException();
               }

               var3.setValue(var4);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            } catch (NumberFormatException var7) {
               this.c.setText("" + var3.getValue());
            }
         } else if(var2 instanceof INumberSetting) {
            INumberSetting var8 = (INumberSetting)var2;

            try {
               var4 = Integer.parseInt(this.c.getText());
               if(var4 < 0) {
                  throw new NumberFormatException();
               }

               var8.setValue(var4);
               var8.setInfinite(false);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            } catch (NumberFormatException var6) {
               this.c.setText("" + var8.getValue());
            }
         } else if(var2 instanceof NumberSetting) {
            NumberSetting var9 = (NumberSetting)var2;

            try {
               var4 = Integer.parseInt(this.c.getText());
               if(var4 < 0) {
                  throw new NumberFormatException();
               }

               var9.setValue(var4);
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            } catch (NumberFormatException var5) {
               this.c.setText("" + var9.getValue());
            }
         } else if(var2 instanceof DateFormatSetting) {
            DateFormatSetting var10 = (DateFormatSetting)var2;
            if(DateFormatSetting.validateDateString(this.c.getText())) {
               var10.setValue(this.c.getText());
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            } else {
               this.c.setText(var10.getValue());
               DialogUtils.showErrorDialog(this.c, a("<cgkA\t/gdF\t}\"k\u0012\u001anncVLkc~WLimx_\r{#"));
            }
         } else if(var2 instanceof LogFileSetting) {
            LogFileSetting var11 = (LogFileSetting)var2;
            var11.setFilename(this.c.getText());
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         } else if(var2 instanceof EncodingSetting) {
            EncodingSetting var12 = (EncodingSetting)var2;
            if(EncodingSetting.validateEncoding(this.c.getText())) {
               var12.setValue(this.c.getText());
               this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
            } else {
               var12.setValue(EncodingSetting.DEFAULT_SYSTEM_ENCODING);
               this.c.setText(EncodingSetting.DEFAULT_SYSTEM_ENCODING);
               DialogUtils.showErrorDialog(this.c, a("8gky\u0012\taaeV\u0005ae*[\u001f/leFL|wzB\u0003}voVM"));
            }
         } else if(var2 instanceof StringSetting) {
            StringSetting var13 = (StringSetting)var2;
            var13.setValue(this.c.getText());
            this.b.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.c));
         }

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
            var10003 = 108;
            break;
         case 1:
            var10003 = 15;
            break;
         case 2:
            var10003 = 2;
            break;
         case 3:
            var10003 = 10;
            break;
         default:
            var10003 = 50;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
