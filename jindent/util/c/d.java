package jindent.util.c;

import jindent.util.c.c;

public class d extends c {
   public d() {
      super(a("\u0019N<\u0000/=L4\u00034|h8\u001e33\\})\",Q/\t>"), a("o\n%_hsO4\u0002>3O\u0002\u001831]s\u001c4;"), a("\bJ4\r6|q3\n5"), a("\u000e].\u0018(5[)\u000552K"), a("`P)\u00016b\u0004?\u0003>%\u0006a\u000ed\u0005W(\u001ez9N<\u0000/=L4\u00034|H8\u001e33\\}\u0004;/\u00188\u0014*5J8\b{`Z/Rf>JcPu>\u0006W85|[2\u0002.5V(\tz)K4\u0002=|L5\u0005)|H/\u0003=.Y0L#3M}\r(9\u0018/\t+)Q/\t>|L2L*)J>\u0004;/]}\rz0Q>\t4/]sP8.\u0006a\u000e(b2\u001b\u0003(|\\8\u0018;5T.L52\u00185\u0003-|L2L*)J>\u0004;/]}\rz\u0016Q3\b?2L}\u00003?]3\u001f?|H1\t;/]}\u001a3/Q)L5)J}\u001b?>K4\u0018?|Y)Vf>JcP8.\u0006WP8b\u0004>\t4(]/Rf=\u00185\u001e?:\u0005\u007f\u0004.(HgCu+O*B05V9\t4(\u0016>\u00037~\u00065\u0018.,\u0002rC-+Os\u000632\\8\u0002.r[2\u0001fsZcPu=\u0006aC99V)\t(b\u0004?\u001ed`Z/RP\bP<\u00021|A2\u0019z:W/L?*Y1\u0019;(Q3\u000bz\u0016Q3\b?2L|P8.\u0006aC83\\$RfsP)\u00016b2"), a("q\u0015pAwq\u0015pAwq\u0015pAwq\u0015pAwV\u0018\t\u001e3=T}>?/L/\u00059(Q2\u0002)f2pAwq\u0015pAwq\u0015pAwq\u0015pAwq\u0015Wf\u00033M/L?*Y1\u0019;(Q2\u0002z,]/\u000558\u00185\r)|]%\u001c3.]9MPVl2L93V)\u00054)]}\u0019)5V:L.4Q.L*.W:\u001e;1\u0018$\u0003/|Y/\tz.],\u00193.]9L.3\u0018-\u0019(?P<\u001f?|Y}\u00003?]3\u001f?r2W*5.\u00189\t.=Q1\u001fz3V}\u00045+\u0018)\u0003z,M/\u000f2=K8L;|r4\u0002>9V)L65[8\u0002)9\u0018-\u0000?=K8L,5K4\u0018z3M/L-9Z.\u0005.9\u0018<\u0018`V2}Lz|P)\u0018*f\u0017r\u001b-+\u00167\u000548]3\u0018t?W0fPVl5\r47\u0018$\u0003/|^2\u001ez9N<\u0000/=L4\u0002=|r4\u0002>9V)MPV"), false);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 92;
            break;
         case 1:
            var10003 = 56;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 108;
            break;
         default:
            var10003 = 90;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
