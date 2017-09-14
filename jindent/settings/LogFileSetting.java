package jindent.settings;

import java.io.Serializable;
import jindent.JindentSystem;
import jindent.settings.DefaultSetting;

public class LogFileSetting extends DefaultSetting {
   private static final long serialVersionUID = 3257283630324594483L;
   protected String filename = JindentSystem.getJindentSettingsHome() + a("kpF-S!T[\fB0JZ7\u0019(UH");
   protected boolean useLogFile = false;

   public LogFileSetting(String var1) {
      super(var1);
   }

   public void setFilename(String var1) {
      this.filename = var1;
   }

   public String getFilename() {
      return this.filename;
   }

   public boolean getUseLogFile() {
      return this.useLogFile;
   }

   public void setUseLogFile(boolean var1) {
      this.useLogFile = var1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 68;
            break;
         case 1:
            var10003 = 58;
            break;
         case 2:
            var10003 = 47;
            break;
         case 3:
            var10003 = 67;
            break;
         default:
            var10003 = 55;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
