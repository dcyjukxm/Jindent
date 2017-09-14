package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSetting;

public class NumberSetting extends DefaultSetting {
   private static final long serialVersionUID = 3761691190898078009L;
   protected int value = 0;

   public NumberSetting(String var1) {
      super(var1);
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public int getValue() {
      return this.value;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public static boolean validateNumber(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (NumberFormatException var2) {
         return false;
      }
   }
}
