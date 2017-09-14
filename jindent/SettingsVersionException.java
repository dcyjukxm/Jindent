package jindent;

import jindent.settings.VersionInfo;

public class SettingsVersionException extends Exception {
   private float foundVersion;
   private float expectedVersion;
   private VersionInfo settingsObject;

   public SettingsVersionException(String var1, float var2, float var3, VersionInfo var4) {
      super(var1);
      this.foundVersion = var2;
      this.expectedVersion = var3;
      this.settingsObject = var4;
   }

   public float getExpectedVersion() {
      return this.expectedVersion;
   }

   public float getFoundVersion() {
      return this.foundVersion;
   }

   public VersionInfo getSettingsObject() {
      return this.settingsObject;
   }
}
