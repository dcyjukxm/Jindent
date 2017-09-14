package jindent.customizer.javahelp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.help.DefaultHelpBroker;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import jindent.customizer.javahelp.JindentCSH;

public class JindentCSH$DisplayHelpFromFocus implements ActionListener {
   private HelpBroker a = null;
   private HelpSet b = null;
   private String c = null;
   private String d = null;

   public JindentCSH$DisplayHelpFromFocus(HelpBroker var1) {
      if(var1 == null) {
         throw new NullPointerException(a("\u000e_"));
      } else {
         this.a = var1;
      }
   }

   public JindentCSH$DisplayHelpFromFocus(HelpSet var1, String var2, String var3) {
      if(var1 == null) {
         throw new NullPointerException(a("\u000eN"));
      } else {
         try {
            ClassLoader var4 = var1.getLoader();
            if(var4 == null) {
               Class var5 = Class.forName(var2);
            } else {
               var4.loadClass(var2);
            }
         } catch (Exception var7) {
            throw new IllegalArgumentException(var2 + a("\u0016O~e\u0017\bIzb\u001b\tS;6\u001b\bKzz\u001b\u0002"));
         }

         this.c = var2;
         this.d = var3;
         this.b = var1;
      }
   }

   public void actionPerformed(ActionEvent var1) {
      Component var2 = (Component)var1.getSource();
      if(this.a instanceof DefaultHelpBroker) {
         ((DefaultHelpBroker)this.a).setActivationObject(var2);
      }

      Component var3 = JindentCSH.access$000(var2);
      JindentCSH.access$100(a("\u0000Rxc\u0001)Jus\u0000\\") + var3);
      if(var3 == null) {
         var3 = var2;
      }

      JindentCSH.access$200(this.a, this.b, this.c, this.d, var3, var3, var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 102;
            break;
         case 1:
            var10003 = 61;
            break;
         case 2:
            var10003 = 27;
            break;
         case 3:
            var10003 = 22;
            break;
         default:
            var10003 = 114;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
