package jindent.customizer.gui.elements;

import java.awt.Container;
import java.util.EventObject;
import java.util.logging.Level;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.elements.RegistrationGUIObject;
import jindent.debugger.JindentLogging;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

class RegistrationGUIObject$9 implements Runnable {
   private final CustomizerData a;
   private final EventObject b;
   private final RegistrationGUIObject c;

   RegistrationGUIObject$9(RegistrationGUIObject var1, CustomizerData var2, EventObject var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         RegistrationGUIObject.access$700(this.c, this.a, this.b);
      } catch (Exception var2) {
         JindentLogging.getLogger().log(Level.SEVERE, a("hGN{O\rBT}QH\u0015Nq\\I\\Rs\u001dA\\_qS^P\u001crTAP"), var2);
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)RegistrationGUIObject.access$400(this.c)), var2.getMessage());
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
            var10003 = 45;
            break;
         case 1:
            var10003 = 53;
            break;
         case 2:
            var10003 = 60;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 61;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
