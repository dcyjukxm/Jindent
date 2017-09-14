package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public class f extends jindent.customizer.gui.settings.f.a {
   public String a() {
      return a("\u001f,&\\2;)&\\?;d\u001c\\.$!");
   }

   public String toString() {
      return this.a();
   }

   public void a(BracesSetting var1) {
      var1.setBoolean(a("$!)\\\u0015:%,M\u0019-3\u0003A9-"), true);
      var1.setNumber(a("!*+M9<\b*N#\n6.K2"), 4);
      var1.setBoolean(a("&+\rD6&/\u0003A9-7\u000eN#-6\u0003M1<\u0006=I4-"), true);
      var1.setBoolean(a(":-(@#\n6.K2\u0006!8d>&!"), true);
      var1.setNumber(a("!*+M9<\u0016&O?<\u0006=I4-"), 4);
      var1.setNumber(a("!*+M9<\u0005)\\2:\u0016&O?<\u0006=I4-"), 1);
      var1.setBoolean(a("+1+L;-\u0001\"X#1\u0006=I4-7"), false);
      var1.setNumber(a("!*+M9<\u0007:L3$!+j%)\'*["), 0);
      var1.setInfiniteINumber(a("%-!d>&!<|8\u0001*<M%<\u0006#I9#\b&F2\t\";M%\u0004!)\\\u0015:%,M"), true);
      var1.setInfiniteINumber(a("%-!d>&!<|8\u0001*<M%<\u0006#I9#\b&F2\n!)G%-\u0016&O?<\u0006=I4-"), true);
      var1.setBoolean(a(",+\u0001G#\u0001*<M%<\u0006*N8:!\u001cA9/(*z>/,;j%)\'*"), true);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 72;
            break;
         case 1:
            var10003 = 68;
            break;
         case 2:
            var10003 = 79;
            break;
         case 3:
            var10003 = 40;
            break;
         default:
            var10003 = 87;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
