package jindent.settings;

import java.io.Serializable;
import jindent.JindentError;
import jindent.formatter.i;
import jindent.settings.DefaultSelectionSetting;

public class EndOfLineFormatSetting extends DefaultSelectionSetting {
   private static final long serialVersionUID = 4121132524316406069L;
   public static final int AUTO = 0;
   public static final int DOS = 1;
   public static final int UNIX = 2;
   public static final int MAC = 3;

   public static String formatToString(int var0) {
      switch(var0) {
      case 0:
         return a("H\ru\u0014");
      case 1:
         return a("M\u0017r");
      case 2:
         return a("\\\u0016h\u0003");
      case 3:
         return a("D\u0019b");
      default:
         return a("#\ro\u0010mf\u000foQ");
      }
   }

   public static String formatToEndOfLine(int var0) {
      switch(var0) {
      case 1:
         return a("\u0004r");
      case 2:
         return "\n";
      case 3:
         return "\r";
      default:
         throw new JindentError(a("^\nn\u0015d)\u000bd\u000fw`\u0016f[loXm\u0012mlXg\u001efmXg\u0014qd\u0019uA#") + var0);
      }
   }

   public static String statsToEndOfLine(i var0) {
      int var1 = statsToEndOfLineFormat(var0);
      return formatToEndOfLine(var1);
   }

   public static int statsToEndOfLineFormat(i var0) {
      return var0.a() > 0 && var0.c() == 0?3:(var0.a() == 0 && var0.c() > 0?2:1);
   }

   public EndOfLineFormatSetting(String var1) {
      super(var1);
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
            var10003 = 9;
            break;
         case 1:
            var10003 = 120;
            break;
         case 2:
            var10003 = 1;
            break;
         case 3:
            var10003 = 123;
            break;
         default:
            var10003 = 3;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
