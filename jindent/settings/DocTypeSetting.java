package jindent.settings;

import java.io.Serializable;
import jindent.settings.StringSetting;

public class DocTypeSetting extends StringSetting {
   private static final long serialVersionUID = 3256722887883700533L;

   public DocTypeSetting(String var1) {
      super(var1);
      this.setValue(a("2\u001680"));
   }

   public static boolean validateDocType(String var0) {
      return true;
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
            var10003 = 83;
            break;
         case 1:
            var10003 = 99;
            break;
         case 2:
            var10003 = 76;
            break;
         case 3:
            var10003 = 95;
            break;
         default:
            var10003 = 25;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
