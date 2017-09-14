package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class PositionSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 4048794558974538037L;
   public static final int TOP = 0;
   public static final int BOTTOM = 1;
   public static final int NONE = 2;

   public PositionSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
