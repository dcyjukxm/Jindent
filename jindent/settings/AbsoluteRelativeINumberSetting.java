package jindent.settings;

import java.io.Serializable;
import jindent.settings.INumberSetting;

public class AbsoluteRelativeINumberSetting extends INumberSetting {
   private static final long serialVersionUID = 3256719602351486264L;
   public static final int RELATIVE = 0;
   public static final int ABSOLUTE = 1;
   private int index = 0;

   public AbsoluteRelativeINumberSetting(String var1) {
      super(var1);
   }

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
