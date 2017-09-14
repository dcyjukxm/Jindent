package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class LineWrappingPolicySetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3617577102384312624L;
   public static final transient int SCOPE_RELATED_LINE_WRAPPING = 0;
   public static final transient int SPACE_SAVING_LINE_WRAPPING = 1;

   public LineWrappingPolicySetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
