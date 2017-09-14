package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public class b extends jindent.customizer.gui.settings.f.a {
   public String a() {
      return a("\u0002^\u0014\u0001O,a=O``^$Wb%-xm.\u0013y)Bki");
   }

   public String toString() {
      return this.a();
   }

   public void a(BracesSetting var1) {
      var1.setBoolean(a(",h6ZL2l3K@%z\u001cG`%"), true);
      var1.setNumber(a(")c4K`4A5Hz\u0002\u007f1Mk"), 0);
      var1.setBoolean(a(".b\u0012Bo.f\u001cG`%~\u0011Hz%\u007f\u001cKh4O\"Om%"), true);
      var1.setBoolean(a("2d7Fz\u0002\u007f1Mk\u000eh\'bg.h"), true);
      var1.setNumber(a(")c4K`4_9If4O\"Om%"), 0);
      var1.setNumber(a(")c4K`4L6Zk2_9If4O\"Om%"), 1);
      var1.setBoolean(a("#x4Jb%H=^z9O\"Om%~"), false);
      var1.setNumber(a(")c4K`4N%Jj,h4l|!n5]"), 0);
      var1.setInfiniteINumber(a("-d>bg.h#za\tc#K|4O<O`+A9@k\u0001k$K|\fh6ZL2l3K"), true);
      var1.setInfiniteINumber(a("-d>bg.h#za\tc#K|4O<O`+A9@k\u0002h6A|%_9If4O\"Om%"), true);
      var1.setBoolean(a("$b\u001eAz\tc#K|4O5Ha2h\u0003G`\'a5|g\'e$l|!n5"), true);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 64;
            break;
         case 1:
            var10003 = 13;
            break;
         case 2:
            var10003 = 80;
            break;
         case 3:
            var10003 = 46;
            break;
         default:
            var10003 = 14;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
