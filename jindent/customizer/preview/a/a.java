package jindent.customizer.preview.a;

import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import jindent.customizer.preview.a.b;

class a implements ViewFactory {
   public View create(Element var1) {
      String var2 = var1.getName();
      if(var2 != null) {
         if(var2.equals(a("n,^O`c7"))) {
            return new LabelView(var1);
         }

         if(var2.equals(a("}\"BZb\u007f\"@S"))) {
            return new b(var1);
         }

         if(var2.equals(a("~&SOlb-"))) {
            return new BoxView(var1, 1);
         }

         if(var2.equals(a("n,]Kjc&^O"))) {
            return new ComponentView(var1);
         }

         if(var2.equals(a("d _U"))) {
            return new IconView(var1);
         }
      }

      return new LabelView(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 13;
            break;
         case 1:
            var10003 = 67;
            break;
         case 2:
            var10003 = 48;
            break;
         case 3:
            var10003 = 59;
            break;
         default:
            var10003 = 5;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
