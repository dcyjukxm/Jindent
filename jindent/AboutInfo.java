package jindent;

public class AboutInfo {
   private String name;
   private String releaseDate;
   private String version;

   public AboutInfo(String var1, String var2, String var3) {
      this.name = var1;
      this.version = var2;
      this.releaseDate = var3;
   }

   public String getName() {
      return this.name;
   }

   public String getReleaseDate() {
      return this.releaseDate;
   }

   public String getVersion() {
      return this.version;
   }
}
