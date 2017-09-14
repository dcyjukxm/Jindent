package jindent.customizer.gui.elements;

import java.awt.Font;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.GUIObject;
import jindent.util.swing.MultiLineLabel;

public class GUIText extends GUIObject {
   public GUIText() {
      super(a("\'o\u001e\u001bG\u0018N"), "");
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      var1.add(createSubtitleLabel(this.getDesc()), a("4s\u0003\u0003g"));
      this.setAddedToJPanel(true);
   }

   public static MultiLineLabel createSubtitleLabel(String var0) {
      MultiLineLabel var1 = new MultiLineLabel(var0, 2);
      String var2 = var1.getFont().getName();
      int var3 = var1.getFont().getSize();
      byte var4 = 0;
      var1.setFont(new Font(var2, var4, var3));
      return var1;
   }

   public void updateJPanel() {
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 96;
            break;
         case 1:
            var10003 = 58;
            break;
         case 2:
            var10003 = 87;
            break;
         case 3:
            var10003 = 79;
            break;
         default:
            var10003 = 34;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
