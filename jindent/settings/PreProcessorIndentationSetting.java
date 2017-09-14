package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSelectionSetting;

public class PreProcessorIndentationSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 3258135756064437815L;
   public static final int ALIGN_TO_FIRST_COLUMN = 0;
   public static final int INDENT_RELATIVE_TO_SOURCE_CODE = 1;

   public PreProcessorIndentationSetting(String var1) {
      super(var1);
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
