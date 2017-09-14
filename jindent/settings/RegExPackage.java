package jindent.settings;

import java.io.Serializable;

public class RegExPackage implements Serializable {
   private static final long serialVersionUID = -6567872176446417084L;
   private String name;
   private Boolean enabled;
   private String regularExpression;

   public RegExPackage() {
      this(Boolean.TRUE, (String)null, (String)null);
   }

   public RegExPackage(String var1) {
      this(Boolean.TRUE, var1, (String)null);
   }

   public RegExPackage(Boolean var1, String var2, String var3) {
      this.enabled = var1;
      this.name = var2;
      this.regularExpression = var3;
   }

   public Boolean getEnabled() {
      return this.enabled;
   }

   public void setEnabled(Boolean var1) {
      this.enabled = var1;
   }

   public String getRegularExpression() {
      return this.regularExpression;
   }

   public void setRegularExpression(String var1) {
      this.regularExpression = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }
}
