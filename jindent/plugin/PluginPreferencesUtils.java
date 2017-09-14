package jindent.plugin;

import java.awt.Container;
import java.awt.Window;
import javax.swing.JComponent;
import jindent.JindentSettings;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.plugin.PluginDataHolder;
import jindent.plugin.PluginUtils;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class PluginPreferencesUtils {
   private static boolean a = false;

   public static void initPreferences(PluginDataHolder var0) {
      if(!arePreferencesInitialized()) {
         CustomizerData var1 = var0.getCustomizerData();
         JindentSettings var2 = (JindentSettings)var0.getJindentSettings().clone();
         var1.getEventHandler().setBlockEvents(true);
         var1.connectSettings(var2);
         var1.updateGUI();
         var1.getEventHandler().setBlockEvents(false);
         a = true;
      }

   }

   public static boolean arePreferencesInitialized() {
      return a;
   }

   public static void applyPreferences(PluginDataHolder var0, JComponent var1) {
      if(arePreferencesInitialized()) {
         Window var2 = SwingUtils.findWindow((Container)var1);
         CustomizerData var3 = var0.getCustomizerData();
         var3.getEventHandler().fireEvent(new CustomizerEvent(var1, 4));
         JindentSettings var4 = var0.getCustomizerData().getConnectedJindentSettings();
         var0.setJindentSettings(var4);

         try {
            PluginUtils.saveSettings(var4);
            var3.setChanged(false);
         } catch (Exception var6) {
            DialogUtils.showErrorDialog(var2, var6.getMessage());
         }

         a = false;
      }

   }

   public static void cancelPreferences(PluginDataHolder var0, JComponent var1) {
      CustomizerData var2 = var0.getCustomizerData();
      var2.setChanged(false);
      a = false;
   }
}
