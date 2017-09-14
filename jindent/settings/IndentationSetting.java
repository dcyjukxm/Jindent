package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class IndentationSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3258135756064437815L;
   public static final int DO_NOT_INDENT = 0;
   public static final int INDENT = 1;
   public static final int AUTO_INDENT = 2;

   public IndentationSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
