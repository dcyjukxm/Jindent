package jindent.java.previews.filter;

import jindent.customizer.preview.PreviewFilter;
import jindent.formatter.Context;

public class NoJavaDocsFilter implements PreviewFilter {
   public Context filter(Context var1) {
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u001f\u0006q;M0\tf;u7\u001ed\u001aP5\u001b"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011L0K3\u001ac?\\3\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u0017Q\"\rw8^5\rO?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3!k*Z$\u000ed=Z\u001c\ts?{9\u000bv"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u0015\u0004d-L\u001c\ts?{9\u000bv"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011F2^%\u001bO?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u001dS7\u001bv\u0014^ \tA1\\%"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3+i?L%\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u0013\u0006p3u7\u001ed\u001aP5\u001b"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011@0J;\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u001bQ#\u0005O?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3-k+R\u001c\ts?{9\u000bv"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u0017\u0006k1K7\u001cl1Q\u0002\u0011u;u7\u001ed\u001aP5\u001b"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011D0Q9\u001cd*V9\u0006Q\'O3\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u001fQ8\u0007q?K?\u0007k\nF&\rO?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3)k0P\"\tq7P8<|.Z\u001c\ts?{9\u000bv"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u0010\u0001`2[\u001c\ts?{9\u000bv"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011C7Z:\fO?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u0018V3\u0004a\u0014^ \tA1\\%"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3.l;S2\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u0015\u0007k-K$\u001df*P$\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011F1Q%\u001cw+\\\"\u0007w\u0014^ \tA1\\%"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u001dP8\u001bq,J5\u001cj,u7\u001ed\u001aP5\u001b"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3+j0L\"\u001ap=K9\u001aO?I7,j=L"), false);
      var1.setBoolean(a("=M3\tq;o#\ni7\\\u001b\rq6P2\"d(^\u0012\u0007f-"), false);
      var1.setBoolean(a("=M3\tq;y$\u0001`0[:\u0011H;K>\u0007a\u0014^ \tA1\\%"), false);
      var1.setBoolean(a("=M3\tq;o$\u0007q;\\\"\ra\u0013Z\"\u0000j:u7\u001ed\u001aP5\u001b"), false);
      var1.setBoolean(a("=M3\tq;o$\u0001s?K3%`*W9\fO?I7,j=L"), false);
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
            var10003 = 94;
            break;
         case 1:
            var10003 = 63;
            break;
         case 2:
            var10003 = 86;
            break;
         case 3:
            var10003 = 104;
            break;
         default:
            var10003 = 5;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
