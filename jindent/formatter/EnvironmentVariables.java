package jindent.formatter;

import java.util.HashMap;
import java.util.Iterator;
import jindent.settings.UserVariablesSetting;
import jindent.settings.uservariables.UserVariable;

public class EnvironmentVariables {
   public static final String CONVENTION_NAME = "conventionName";
   public static final String DATE = "date";
   public static final String FILE_FORMAT = "fileFormat";
   public static final String FILE_NAME = "fileName";
   public static final String FULL_FILE_NAME = "fullFileName";
   public static final String PACKAGE_NAME = "packageName";
   public static final String TAB_SIZE = "tabSize";
   public static final String TEXT_FORMAT = "textFormat";
   public static final String DECLARATION_NAME = "declarationName";
   public static final String DECLARATION_TYPE = "declarationType";
   public static final String PARAM_NAME = "paramName";
   public static final String PARAM_TYPE = "paramType";
   public static final String EXCEPTION_NAME = "exceptionName";
   public static final String EXCEPTION_TYPE = "exceptionType";
   public static final String RETURN_TYPE = "returnType";
   public static final String OBJECT_NAME = "objectName";
   public static final String OBJECT_TYPE = "objectType";
   public static final String[] LIST_OF_ENVIRONMENT_VARIABLES = new String[]{"conventionName", "date", "declarationName", "declarationType", "exceptionName", "fileFormat", "fileName", "fullFileName", "packageName", "paramName", "paramType", "returnType", "tabSize", "textFormat"};
   protected HashMap a = new HashMap();

   public String getVariable(String var1) {
      return (String)this.a.get(var1);
   }

   public void setVariable(String var1, String var2) {
      this.a.put(var1, var2);
   }

   public void setVariable(String var1, int var2) {
      this.setVariable(var1, "" + var2);
   }

   public void removeVariable(String var1) {
      this.a.remove(var1);
   }

   public void removeAllVariables() {
      this.a.clear();
   }

   public void setVariables(UserVariablesSetting var1) {
      Iterator var2 = var1.variableIterator();

      while(var2.hasNext()) {
         UserVariable var3 = (UserVariable)var2.next();
         this.setVariable(var3.getName(), var3.getValue());
      }

   }

   public Iterator keyIterator() {
      return this.a.keySet().iterator();
   }

   public Iterator settingsIterator() {
      return this.a.values().iterator();
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.keyIterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         String var4 = (String)this.a.get(var3);
         var1.append(var3);
         var1.append("=");
         var1.append(var4);
         var1.append("\n");
      }

      return var1.toString();
   }
}
