package jindent.settings;

import java.io.Serializable;
import jindent.settings.NumberSetting;

public class INumberSetting extends NumberSetting {
   private static final long serialVersionUID = 3256999969159526710L;
   public static final int INFINITE = Integer.MAX_VALUE;
   protected boolean infinite = false;

   public INumberSetting(String var1) {
      super(var1);
   }

   public void setValue(int var1) {
      super.setValue(var1);
   }

   public void setInfinite(boolean var1) {
      this.infinite = var1;
   }

   public boolean isInfinite() {
      return this.infinite;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
