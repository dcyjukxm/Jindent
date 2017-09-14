package jindent.settings;

import java.io.Serializable;
import jindent.settings.StringSetting;
import jindent.util.d;

public class StringArraySetting extends StringSetting {
   private static final long serialVersionUID = 3258407344042816304L;

   public StringArraySetting(String var1) {
      super(var1);
   }

   public String[] toStringArray() {
      if(this.value == null) {
         return new String[]{""};
      } else {
         d var1 = new d(this.value);
         int var2 = var1.a();
         String[] var3 = new String[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.b();
         }

         return var3;
      }
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
