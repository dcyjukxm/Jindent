package jindent.settings.uservariables;

import java.io.Serializable;
import jindent.settings.Setting;

public class UserVariable implements Serializable {
   private static final long serialVersionUID = 3256718498527982391L;
   private String name;
   private String value;

   public UserVariable(String var1, String var2) {
      this.name = var1;
      this.value = var2;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public void update(Setting var1) {
      UserVariable var2 = (UserVariable)var1;
      this.setName(var2.getName());
      this.setValue(var2.getValue());
   }
}
