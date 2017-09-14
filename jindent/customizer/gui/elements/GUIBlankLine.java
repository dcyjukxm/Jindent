package jindent.customizer.gui.elements;

import javax.swing.JLabel;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.GUIObject;

public class GUIBlankLine extends GUIObject {
   public GUIBlankLine() {
      super(a("\b\u0017\\G|.,~Iy!\'"), "");
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      var1.add(new JLabel(" "), a("\r\u000eTK[\u0003\u000b[@"));
      this.setAddedToJPanel(true);
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
            var10003 = 79;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 21;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 16;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
