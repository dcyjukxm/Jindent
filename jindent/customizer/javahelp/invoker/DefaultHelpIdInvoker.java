package jindent.customizer.javahelp.invoker;

import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.invoker.HelpIdInvoker;
import jindent.util.swing.SwingUtils;

public class DefaultHelpIdInvoker implements HelpIdInvoker {
   // $FF: synthetic field
   static Class a;

   public void showHelpID(Container var1, String var2) {
      ClassLoader var3 = Thread.currentThread().getContextClassLoader();

      try {
         ClassLoader var4 = (a == null?(a = class$(a("H\u0015yRgL\b9UwQ\bx[kX\u0019e\u0018hC\nv^gN\f9~gN\fBBkN\u000f"))):a).getClassLoader();
         Thread.currentThread().setContextClassLoader(var4);
         Window var5 = SwingUtils.findWindow(var1);
         HelpUtils.mainHB.setActivationWindow(var5);
         HelpUtils.mainHB.setCurrentID(var2);
         HelpUtils.mainHB.setDisplayed(true);

         try {
            GraphicsConfiguration var6 = var5.getGraphicsConfiguration();
            GraphicsDevice var7 = var6.getDevice();
            int var8 = this.findGraphicsDevice(var7);
            HelpUtils.mainHB.setScreen(var8);
         } catch (Exception var12) {
            ;
         }
      } finally {
         Thread.currentThread().setContextClassLoader(var3);
      }

   }

   private int findGraphicsDevice(GraphicsDevice var1) {
      GraphicsEnvironment var2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice[] var3 = var2.getScreenDevices();
      String var4 = var1.getIDstring();

      for(int var5 = 0; var5 < var3.length; ++var5) {
         GraphicsDevice var6 = var3[var5];
         String var7 = var6.getIDstring();
         if(var4.equals(var7)) {
            return var5;
         }
      }

      return 0;
   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
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
            var10003 = 34;
            break;
         case 1:
            var10003 = 124;
            break;
         case 2:
            var10003 = 23;
            break;
         case 3:
            var10003 = 54;
            break;
         default:
            var10003 = 2;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
