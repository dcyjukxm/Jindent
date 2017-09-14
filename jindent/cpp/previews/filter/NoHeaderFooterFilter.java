package jindent.cpp.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoHeaderFooterFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setHeaderIndex(a("MW79[W{8.[WF?2Ph]28"), 0);
      var1.setInfiniteINumber(a("MW79[Wv3)[FF?2Pv_7/Jh]28"), true);
      var1.setString(a("MW79[Wv3)[FF?2Pl\\51KAW\u001d8GV"), "");
      var1.setString(a("MW79[Wv3)[FF?2P`J51KAW\u001d8GV"), "");
      var1.setNumber(a("G^73Ui[88MgW02L@z3<Z@@"), 0);
      var1.setNumber(a("G^73Ui[88MdT\"8LmW79[W"), 0);
      var1.setFooterIndex(a("C]9)[W{8.[WF?2Ph]28"), 0);
      var1.setInfiniteINumber(a("C]9)[Wv3)[FF?2Pv_7/Jh]28"), true);
      var1.setString(a("C]9)[Wv3)[FF?2Pl\\51KAW\u001d8GV"), "");
      var1.setString(a("C]9)[Wv3)[FF?2P`J51KAW\u001d8GV"), "");
      var1.setNumber(a("G^73Ui[88MgW02L@t92J@@"), 0);
      var1.setNumber(a("G^73Ui[88MdT\"8Lc]9)[W"), 0);
      return var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 37;
            break;
         case 1:
            var10003 = 50;
            break;
         case 2:
            var10003 = 86;
            break;
         case 3:
            var10003 = 93;
            break;
         default:
            var10003 = 62;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
