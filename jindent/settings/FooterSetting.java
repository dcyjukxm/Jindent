package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class FooterSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3258407313927844144L;
   public static final int DO_NOT_INSERT = 0;
   public static final int INSERT_AND_DELETE_DETECTED = 1;
   public static final int INSERT_BUT_KEEP_DETECTED = 2;

   public FooterSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
