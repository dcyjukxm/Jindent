package jindent.customizer;

import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerFrame;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;

class CustomizerFrame$6 implements CustomizerEventListener {
   private final CustomizerData a;
   private final CustomizerFrame b;

   CustomizerFrame$6(CustomizerFrame var1, CustomizerData var2) {
      this.b = var1;
      this.a = var2;
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(var1.getID() == 0 && this.a.isChanged()) {
         String var2 = this.b.getTitle();
         if(!var2.endsWith(a("\u001eP"))) {
            this.b.setTitle(var2.substring(0, var2.length() - 1) + a("\u001eP"));
         }
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
            var10003 = 52;
            break;
         case 1:
            var10003 = 13;
            break;
         case 2:
            var10003 = 53;
            break;
         case 3:
            var10003 = 112;
            break;
         default:
            var10003 = 126;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
