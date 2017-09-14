package jindent.customizer.preview;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JFrame;
import jindent.customizer.CustomizerData;
import jindent.customizer.preview.SourcePreviewPane;

public class SourcePreviewDialog extends JDialog {
   private SourcePreviewPane a;
   private boolean b = false;
   private static final String c = "\u0011\f\u0010\u0004w$\t";

   public SourcePreviewDialog(Dialog var1, CustomizerData var2) {
      super(var1, a("\u0011\f\u0010\u0004w$\t"), false);
      this.init(var2);
   }

   public SourcePreviewDialog(JFrame var1, CustomizerData var2) {
      super(var1, a("\u0011\f\u0010\u0004w$\t"), false);
      this.init(var2);
   }

   private void init(CustomizerData var1) {
      this.setDefaultCloseOperation(0);
      this.a = new SourcePreviewPane(var1);
      this.getContentPane().add(this.a, a("\u0002\u001b\u001b\u0006{3"));
      this.b = false;
   }

   public boolean isDisposed() {
      return this.b;
   }

   public void dispose() {
      this.b = true;
      super.dispose();
      this.a.dispose();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 65;
            break;
         case 1:
            var10003 = 126;
            break;
         case 2:
            var10003 = 117;
            break;
         case 3:
            var10003 = 114;
            break;
         default:
            var10003 = 30;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
