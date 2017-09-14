package jindent.settings;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Properties;
import jindent.settings.UserVariablesSetting;

public class SystemVariablesSetting extends UserVariablesSetting {
   private static final long serialVersionUID = 3257291322627864368L;

   public SystemVariablesSetting(String var1) {
      super(var1);
      this.removeAllVariables();
      Properties var2 = System.getProperties();
      Iterator var3 = var2.keySet().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         Object var5 = var2.get(var4);
         this.setVariable(var4, String.valueOf(var5));
      }

   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
