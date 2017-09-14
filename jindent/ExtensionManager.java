package jindent;

import java.util.Set;
import jindent.Formatter;

public interface ExtensionManager {
   int ID_JAVA_FORMATTER = 1;
   int ID_JAVA_SQLJ_FORMATTER = 2;
   int ID_C_FORMATTER = 4;
   int ID_CPP_FORMATTER = 4;
   int ID_H_FORMATTER = 4;
   int ID_JS_FORMATTER = 8;

   void setAssignment(String var1, String var2);

   Set getAssignedExtensions();

   void removeAllAssignments();

   void removeAssignment(String var1);

   String getFormatterNameByExtension(String var1);

   Formatter getFormatterByExtension(String var1);

   boolean containsExtension(String var1);

   Formatter getFormatterById(int var1);
}
