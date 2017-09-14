package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public class c extends jindent.customizer.gui.settings.f.a {
   public String a() {
      return a("X\u000b\r%&k<4`");
   }

   public String toString() {
      return this.a();
   }

   public void a(BracesSetting var1) {
      var1.setBoolean(a("s >q7m$;`;z2\u0014l\u001bz"), true);
      var1.setNumber(a("v+<`\u001bk\t=c\u0001]79f\u0010"), 2);
      var1.setBoolean(a("q*\u001ai\u0014q.\u0014l\u001bz6\u0019c\u0001z7\u0014`\u0013k\u0007*d\u0016z"), true);
      var1.setBoolean(a("m,?m\u0001]79f\u0010Q /I\u001cq "), true);
      var1.setNumber(a("v+<`\u001bk\u00171b\u001dk\u0007*d\u0016z"), 2);
      var1.setNumber(a("v+<`\u001bk\u0004>q\u0010m\u00171b\u001dk\u0007*d\u0016z"), 1);
      var1.setBoolean(a("|0<a\u0019z\u00005u\u0001f\u0007*d\u0016z6"), false);
      var1.setNumber(a("v+<`\u001bk\u0006-a\u0011s <G\u0007~&=v"), 0);
      var1.setInfiniteINumber(a("r,6I\u001cq +Q\u001aV++`\u0007k\u00074d\u001bt\t1k\u0010^#,`\u0007S >q7m$;`"), true);
      var1.setInfiniteINumber(a("r,6I\u001cq +Q\u001aV++`\u0007k\u00074d\u001bt\t1k\u0010] >j\u0007z\u00171b\u001dk\u0007*d\u0016z"), true);
      var1.setBoolean(a("{*\u0016j\u0001V++`\u0007k\u0007=c\u001am \u000bl\u001bx)=W\u001cx-,G\u0007~&="), true);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 31;
            break;
         case 1:
            var10003 = 69;
            break;
         case 2:
            var10003 = 88;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 117;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
