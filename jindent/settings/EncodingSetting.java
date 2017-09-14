package jindent.settings;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import jindent.settings.StringSetting;

public class EncodingSetting extends StringSetting {
   private static final long serialVersionUID = 3256722887883700533L;
   private static final String NO_SELECTION = "\u0006u\"qb_w(2eSt#o";
   public static transient String DEFAULT_SYSTEM_ENCODING = System.getProperty(a("\\r!4?_u.>uSu*"));
   private boolean useDefaultEncoding = true;

   public EncodingSetting(String var1) {
      super(var1);
      this.setValue(a("\u0006u\"qb_w(2eSt#o"));
   }

   public String getEncoding() {
      return this.useDefaultEncoding?DEFAULT_SYSTEM_ENCODING:super.getValue();
   }

   public void setUseDefaultEncoding(boolean var1) {
      this.useDefaultEncoding = var1;
   }

   public void setValue(String var1) {
      super.setValue(var1);
   }

   public boolean isUseDefaultEncoding() {
      return this.useDefaultEncoding;
   }

   public static boolean validateEncoding(String var0) {
      try {
         new String(new byte[]{65}, var0);
         return true;
      } catch (UnsupportedEncodingException var2) {
         return false;
      }
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
            var10003 = 58;
            break;
         case 1:
            var10003 = 27;
            break;
         case 2:
            var10003 = 77;
            break;
         case 3:
            var10003 = 81;
            break;
         default:
            var10003 = 17;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
