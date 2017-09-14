package jindent.settings;

import jindent.Settings;
import jindent.settings.Setting;

public abstract class DefaultSettingSet extends Settings implements Setting {
   protected String name;

   public DefaultSettingSet(String var1) {
      this.name = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public abstract Object clone();
}
