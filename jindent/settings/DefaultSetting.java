package jindent.settings;

import jindent.settings.Setting;

public abstract class DefaultSetting implements Setting {
   protected String name;

   public DefaultSetting(String var1) {
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
