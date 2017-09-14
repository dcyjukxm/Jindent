package jindent.settings.extensionmanager;

import java.io.Serializable;

public class ExtensionAssignment implements Serializable {
   private static final long serialVersionUID = 3256718498527982391L;
   private String extension;
   private String formatterName;

   public ExtensionAssignment(String var1, String var2) {
      this.extension = var1;
      this.formatterName = var2;
   }

   public String getFormatterName() {
      return this.formatterName;
   }

   public void setFormatterName(String var1) {
      this.formatterName = var1;
   }

   public String getExtension() {
      return this.extension;
   }

   public void setExtension(String var1) {
      this.extension = var1;
   }
}
