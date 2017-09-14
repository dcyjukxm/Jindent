package jindent.plugin;

import java.io.IOException;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.JindentSystem;
import jindent.SettingsVersionException;
import jindent.plugin.PluginSettingsPersistence;

public class DefaultSettingsPersistence implements PluginSettingsPersistence {
   public JindentSettings createDefaultSettings() throws JindentException {
      return JindentSystem.getDefaultJindentSettings();
   }

   public void saveSettings(JindentSettings var1) throws JindentException, IOException {
      var1.writeToFile(JindentSystem.getJindentSettingsLocation());
   }

   public JindentSettings loadSettings() throws JindentException, SettingsVersionException, IOException {
      return JindentSettings.createFromFileAndCheckVersion(JindentSystem.getJindentSettingsLocation());
   }
}
