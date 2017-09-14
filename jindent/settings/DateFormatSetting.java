package jindent.settings;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import jindent.settings.StringSetting;

public class DateFormatSetting extends StringSetting {
   private static final long serialVersionUID = 3544392491781665075L;
   private String value = "";

   public DateFormatSetting(String var1) {
      super(var1);
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getValue() {
      return this.value;
   }

   public static boolean validateDateString(String var0) {
      try {
         SimpleDateFormat var1 = new SimpleDateFormat(var0);
         Date var2 = new Date();
         var1.format(var2);
         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
