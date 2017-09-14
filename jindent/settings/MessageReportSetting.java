package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class MessageReportSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3256440317808032055L;
   public static final int NONE = 0;
   public static final int MESSAGE_AND_WARNING = 1;
   public static final int WARNING = 2;

   public MessageReportSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
