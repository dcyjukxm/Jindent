package jindent.settings;

import java.io.Serializable;
import jindent.settings.NumberSetting;

public class NZNumberSetting extends NumberSetting {
   private static final long serialVersionUID = 3257002151103378743L;

   public NZNumberSetting(String var1) {
      super(var1);
      this.value = 1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
