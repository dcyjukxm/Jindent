package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSetting;
import jindent.settings.TextSetting;

public class StringSetting extends DefaultSetting implements TextSetting {
   private static final long serialVersionUID = 3257283630324594483L;
   protected String value = "";

   public StringSetting(String var1) {
      super(var1);
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getValue() {
      return this.value;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
