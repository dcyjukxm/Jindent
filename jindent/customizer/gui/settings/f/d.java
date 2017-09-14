package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public class d extends jindent.customizer.gui.settings.f.a {
   public String a() {
      return a("[\f\u001chAuX &f0y:>fu\nf\u0014\u007f~\n\u001d3s|Og");
   }

   public String toString() {
      return this.a();
   }

   public void a(BracesSetting var1) {
      var1.setBoolean(a("|O(3HbK-\"Du]\u0002.du"), false);
      var1.setNumber(a("yD*\"ddf+!~RX/$o"), 1);
      var1.setBoolean(a("~E\f+k~A\u0002.duY\u000f!~uX\u0002\"ldh<&iu"), false);
      var1.setBoolean(a("bC)/~RX/$o^O9\u000bc~O"), false);
      var1.setNumber(a("yD*\"ddx\' bdh<&iu"), 0);
      var1.setNumber(a("yD*\"ddk(3obx\' bdh<&iu"), 1);
      var1.setBoolean(a("s_*#fuo#7~ih<&iuY"), true);
      var1.setNumber(a("yD*\"ddi;#n|O*\u0005xqI+4"), 1);
      var1.setInfiniteINumber(a("}C \u000bc~O=\u0013eYD=\"xdh\"&d{f\')oQL:\"x\\O(3HbK-\""), true);
      var1.setInfiniteINumber(a("}C \u000bc~O=\u0013eYD=\"xdh\"&d{f\')oRO((xux\' bdh<&iu"), true);
      var1.setBoolean(a("tE\u0000(~YD=\"xdh+!ebO\u001d.dwF+\u0015cwB:\u0005xqI+"), true);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 16;
            break;
         case 1:
            var10003 = 42;
            break;
         case 2:
            var10003 = 78;
            break;
         case 3:
            var10003 = 71;
            break;
         default:
            var10003 = 10;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
