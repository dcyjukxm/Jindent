package jindent.settings;

import jindent.settings.DefaultSetting;

public abstract class DefaultSelectionSetting extends DefaultSetting {
   protected int index = 0;

   public DefaultSelectionSetting(String var1) {
      super(var1);
   }

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }
}
