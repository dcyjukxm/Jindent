package jindent.customizer.javahelp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.help.HelpBroker;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.JindentCSH$DisplayHelpAfterTracking;

class HelpUtils$2 extends JindentCSH$DisplayHelpAfterTracking {
   private final Component f;

   HelpUtils$2(HelpBroker var1, Component var2) {
      super(var1);
      this.f = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      ClassLoader var2 = Thread.currentThread().getContextClassLoader();

      try {
         ClassLoader var3 = (HelpUtils.g == null?(HelpUtils.g = HelpUtils.class$(b("\u0013mIG\t\u0017p\t@\u0019\npHN\u0005\u0003aU\r\u0006\u0018rFK\t\u0015t\tk\t\u0015trW\u0005\u0015w"))):HelpUtils.g).getClassLoader();
         Thread.currentThread().setContextClassLoader(var3);
         Object var4 = this.f != null?this.f:var1.getSource();
         int var5 = var1.getID();
         var1 = new ActionEvent(var4, var5, var1.getActionCommand());
         super.actionPerformed(var1);
      } catch (Throwable var9) {
         HelpUtils.showHelpID(this.f.getParent(), HelpUtils.DEFAULT_JAVAHELP_START_ID);
      } finally {
         Thread.currentThread().setContextClassLoader(var2);
      }

   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 121;
            break;
         case 1:
            var10003 = 4;
            break;
         case 2:
            var10003 = 39;
            break;
         case 3:
            var10003 = 35;
            break;
         default:
            var10003 = 108;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
