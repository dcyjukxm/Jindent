package jindent.customizer.gui.elements;

import java.awt.Container;
import java.util.logging.Level;
import jindent.customizer.gui.elements.RegistrationGUIObject;
import jindent.debugger.JindentLogging;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

class RegistrationGUIObject$7 implements Runnable {
   private final String a;
   private final RegistrationGUIObject b;

   RegistrationGUIObject$7(RegistrationGUIObject var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      try {
         RegistrationGUIObject.access$500(this.b, this.a);
      } catch (Exception var2) {
         JindentLogging.getLogger().log(Level.SEVERE, a("n\u001bZ\u001ao\u000b\u001e@\u001cqNIA\u001bn_\bD\u0019tE\u000e\b\u0019tH\fF\u0006x\u000b\u000fA\u0019x"), var2);
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)RegistrationGUIObject.access$400(this.b)), var2.getMessage());
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
            var10003 = 43;
            break;
         case 1:
            var10003 = 105;
            break;
         case 2:
            var10003 = 40;
            break;
         case 3:
            var10003 = 117;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
