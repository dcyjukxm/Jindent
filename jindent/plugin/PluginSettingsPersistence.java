package jindent.plugin;

import java.io.IOException;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.SettingsVersionException;

public interface PluginSettingsPersistence {
   JindentSettings createDefaultSettings() throws JindentException, IOException;

   void saveSettings(JindentSettings var1) throws JindentException, IOException;

   JindentSettings loadSettings() throws JindentException, SettingsVersionException, IOException;
}
