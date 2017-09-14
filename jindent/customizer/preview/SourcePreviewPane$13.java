package jindent.customizer.preview;

import java.awt.Container;
import javax.swing.JDialog;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.SwingWorker;

class SourcePreviewPane$13 extends SwingWorker {
   private final String c;
   private final String d;
   private final SourcePreviewPane e;

   SourcePreviewPane$13(SourcePreviewPane var1, String var2, String var3) {
      this.e = var1;
      this.c = var2;
      this.d = var3;
   }

   public Object construct() {
      JDialog var1 = DialogUtils.createWaitDialog(SwingUtils.findWindow((Container)this.e), a("7JaF6\u0002\u0006sF,\u0013\u0006sO,\u000bC$U \u0006BmI\"GUkR7\u0004C$A,\u000bC*\tk"));
      var1.setVisible(true);
      String var2 = SourcePreviewPane.access$2100(this.e, this.c, this.d);
      SourcePreviewPane.access$2200(this.e).put(this.d, var2);
      this.e.updateExternalPreview(this.d);
      var1.dispose();
      return null;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 103;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 4;
            break;
         case 3:
            var10003 = 39;
            break;
         default:
            var10003 = 69;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
