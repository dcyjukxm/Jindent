package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSetting;

public class BooleanSetting extends DefaultSetting {
   private static final long serialVersionUID = 3618417133495662391L;
   public static final boolean TRUE = true;
   public static final boolean FALSE = false;
   private boolean value = false;

   public BooleanSetting(String var1) {
      super(var1);
   }

   public void setValue(boolean var1) {
      this.value = var1;
   }

   public boolean getValue() {
      return this.value;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
