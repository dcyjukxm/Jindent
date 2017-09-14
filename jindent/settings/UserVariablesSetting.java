package jindent.settings;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import jindent.settings.DefaultSetting;
import jindent.settings.uservariables.UserVariable;

public class UserVariablesSetting extends DefaultSetting {
   private static final long serialVersionUID = 3618137861887440944L;
   private HashMap variablesMap = new HashMap();

   public UserVariablesSetting(String var1) {
      super(var1);
   }

   public void setVariable(String var1, String var2) {
      this.setVariable(var1, new UserVariable(var1, var2));
   }

   public void setVariable(String var1, UserVariable var2) {
      this.variablesMap.put(var1, var2);
   }

   public void removeAllVariables() {
      this.variablesMap.clear();
   }

   public void removeVariable(String var1) {
      this.variablesMap.remove(var1);
   }

   public UserVariable getVariable(String var1) {
      return (UserVariable)this.variablesMap.get(var1);
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.variablesMap.entrySet().iterator();

      while(var2.hasNext()) {
         UserVariable var3 = (UserVariable)var2.next();
         var1.append(var3.getName());
         var1.append(a("-\u0015;"));
         var1.append(var3.getValue());
         var1.append("\n");
      }

      return var1.toString();
   }

   public Iterator variableIterator() {
      return this.variablesMap.values().iterator();
   }

   public Iterator keyIterator() {
      return this.variablesMap.keySet().iterator();
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public HashMap getVariablesMap() {
      return this.variablesMap;
   }

   public void setVariablesMap(HashMap var1) {
      this.variablesMap = var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 13;
            break;
         case 1:
            var10003 = 40;
            break;
         case 2:
            var10003 = 27;
            break;
         case 3:
            var10003 = 19;
            break;
         default:
            var10003 = 77;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
