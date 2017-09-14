package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public class e extends jindent.customizer.gui.settings.f.a {
   public String a() {
      return a("44(\u007f]\u001a`\u00141z_A\n1u\u0016}\u000f#6,f\u0003<s_:)%x_A\u000e)z\u001a;");
   }

   public String toString() {
      return this.a();
   }

   public void a(BracesSetting var1) {
      var1.setBoolean(a("\u0013w\u001c$T\rs\u00195X\u001ae69x\u001a"), false);
      var1.setNumber(a("\u0016|\u001e5x\u000b^\u001f6b=`\u001b3s"), 1);
      var1.setBoolean(a("\u0011}8<w\u0011y69x\u001aa;6b\u001a`65p\u000bP\b1u\u001a"), false);
      var1.setBoolean(a("\r{\u001d8b=`\u001b3s1w\r\u001c\u007f\u0011w"), false);
      var1.setNumber(a("\u0016|\u001e5x\u000b@\u00137~\u000bP\b1u\u001a"), 0);
      var1.setNumber(a("\u0016|\u001e5x\u000bS\u001c$s\r@\u00137~\u000bP\b1u\u001a"), 1);
      var1.setBoolean(a("\u001cg\u001e4z\u001aW\u0017 b\u0006P\b1u\u001aa"), true);
      var1.setNumber(a("\u0016|\u001e5x\u000bQ\u000f4r\u0013w\u001e\u0012d\u001eq\u001f#"), 1);
      var1.setNumber(a("\u0012{\u0014\u001c\u007f\u0011w\t\u0004y6|\t5d\u000bP\u00161x\u0014^\u0013>s>t\u000e5d3w\u001c$T\rs\u00195"), 2);
      var1.setInfiniteINumber(a("\u0012{\u0014\u001c\u007f\u0011w\t\u0004y6|\t5d\u000bP\u00161x\u0014^\u0013>s>t\u000e5d3w\u001c$T\rs\u00195"), false);
      var1.setNumber(a("\u0012{\u0014\u001c\u007f\u0011w\t\u0004y6|\t5d\u000bP\u00161x\u0014^\u0013>s=w\u001c?d\u001a@\u00137~\u000bP\b1u\u001a"), 2);
      var1.setInfiniteINumber(a("\u0012{\u0014\u001c\u007f\u0011w\t\u0004y6|\t5d\u000bP\u00161x\u0014^\u0013>s=w\u001c?d\u001a@\u00137~\u000bP\b1u\u001a"), false);
      var1.setBoolean(a("\u001b}4?b6|\t5d\u000bP\u001f6y\rw)9x\u0018~\u001f\u0002\u007f\u0018z\u000e\u0012d\u001eq\u001f"), true);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 127;
            break;
         case 1:
            var10003 = 18;
            break;
         case 2:
            var10003 = 122;
            break;
         case 3:
            var10003 = 80;
            break;
         default:
            var10003 = 22;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
