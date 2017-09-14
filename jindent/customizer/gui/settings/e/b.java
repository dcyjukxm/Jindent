package jindent.customizer.gui.settings.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.JTextComponent;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.e.EnvironmentPopupMenu;
import jindent.settings.TextSetting;

class b implements ActionListener {
   private final String a;
   private final EnvironmentPopupMenu b;

   b(EnvironmentPopupMenu var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      EnvironmentPopupMenu.a(this.b).setTextLocked(true);
      JTextComponent var2 = EnvironmentPopupMenu.a(this.b).getJTextComponent();
      var2.requestFocus();
      var2.setCaretPosition(EnvironmentPopupMenu.b(this.b));
      var2.setSelectionStart(EnvironmentPopupMenu.c(this.b));
      var2.setSelectionEnd(EnvironmentPopupMenu.d(this.b));
      var2.replaceSelection(this.a);
      SettingGUIObject var3 = (SettingGUIObject)EnvironmentPopupMenu.a(this.b);
      if(var3.containsSetting()) {
         TextSetting var4 = (TextSetting)var3.getSetting();
         var4.setValue(var2.getText());
         EnvironmentPopupMenu.e(this.b).getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, EnvironmentPopupMenu.a(this.b)));
         var2.setCaretPosition(EnvironmentPopupMenu.b(this.b));
      }

      EnvironmentPopupMenu.a(this.b).setTextLocked(false);
   }
}
