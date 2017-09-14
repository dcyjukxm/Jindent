import javax.swing.UIManager;
import jindent.JindentSettings;
import jindent.customizer.CustomizerFrame;
import jindent.customizer.xml.CustomizerDataFactory;

public class JindentCustomizer {
   JindentSettings a;

   public JindentCustomizer() {
      new CustomizerFrame(CustomizerDataFactory.newCustomizerDataInstance(), 1);
   }

   public JindentCustomizer(String var1) {
      new CustomizerFrame(CustomizerDataFactory.newCustomizerDataInstance(), var1, 1);
   }

   public static void main(String[] var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      if(var0.length > 1) {
         System.err.println(a("\u001f.%[d`\\#{Yz\u0011\u0016zOz\u001d\u0005sC7\u0019\u0019`Et\\>sX5\u000e\u001ezQz\u000f\u0002fF6\t\u00044W(\u001b\u0002yS4\b\u0004:"));
      }

      if(var0.length == 1) {
         new JindentCustomizer(var0[0]);
      } else {
         new JindentCustomizer();
      }

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 90;
            break;
         case 1:
            var10003 = 124;
            break;
         case 2:
            var10003 = 119;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 54;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
