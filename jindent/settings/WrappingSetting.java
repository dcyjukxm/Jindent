package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class WrappingSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3256718498527982391L;
   public static final transient int ALWAYS = 0;
   public static final transient int ON_DEMAND = 1;
   public static final transient int IF_LINE_EXCEEDS = 2;
   public static final transient int NEVER = 3;

   public WrappingSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
