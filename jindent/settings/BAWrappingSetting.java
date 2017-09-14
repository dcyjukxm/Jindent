package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class BAWrappingSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3617577102384312624L;
   public static final transient int BEFORE = 0;
   public static final transient int AFTER = 1;

   public BAWrappingSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
