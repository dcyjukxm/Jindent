package jindent.imports;

import jindent.JindentException;
import jindent.JindentSettings;
import jindent.SettingsVersionException;
import jindent.imports.a.b;
import jindent.settings.VersionInfo;

public class SettingsImportFactory {
   public static JindentSettings importFrom(SettingsVersionException var0) throws JindentException {
      float var1 = var0.getFoundVersion();
      float var2 = var0.getExpectedVersion();

      VersionInfo var3;
      for(var3 = var0.getSettingsObject(); var3.getVersion() < var2; var3 = convert(var3)) {
         ;
      }

      return (JindentSettings)var3;
   }

   private static VersionInfo convert(VersionInfo var0) throws JindentException {
      float var1 = var0.getVersion();
      if(3.5F <= var1 && var1 < 4.0F) {
         JindentSettings var2 = ((b)var0).eb();
         return var2.convertToCurrentSettings();
      } else if(4.0F <= var1) {
         return ((JindentSettings)var0).convertToCurrentSettings();
      } else {
         throw new JindentException(a("B\u0005\u0016\u0002EuD\u0011\u0001Zn\u0016\fL`h\n\u001c\tDuD\u000b\t^u\r\u0016\u000bY!\u0002\n\u0003G!\u0012\u001d\u001eYh\u000b\u0016L") + var1 + "!");
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 1;
            break;
         case 1:
            var10003 = 100;
            break;
         case 2:
            var10003 = 120;
            break;
         case 3:
            var10003 = 108;
            break;
         default:
            var10003 = 42;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
