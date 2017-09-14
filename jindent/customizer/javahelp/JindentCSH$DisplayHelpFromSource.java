package jindent.customizer.javahelp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import jindent.customizer.javahelp.JindentCSH;

public class JindentCSH$DisplayHelpFromSource implements ActionListener {
   private HelpBroker a;
   private HelpSet b = null;
   private String c = null;
   private String d = null;

   public JindentCSH$DisplayHelpFromSource(HelpBroker var1) {
      if(var1 == null) {
         throw new NullPointerException(a("\tJ"));
      } else {
         this.a = var1;
      }
   }

   public JindentCSH$DisplayHelpFromSource(HelpSet var1, String var2, String var3) {
      if(var1 == null) {
         throw new NullPointerException(a("\t["));
      } else {
         try {
            ClassLoader var4 = var1.getLoader();
            if(var4 == null) {
               Class var5 = Class.forName(var2);
            } else {
               var4.loadClass(var2);
            }
         } catch (Exception var7) {
            throw new IllegalArgumentException(var2 + a("\u0011Z,\u00020\u000f\\(\u0005<\u000eFiQ<\u000f^(\u001d<\u0005"));
         }

         this.c = var2;
         this.d = var3;
         this.b = var1;
      }
   }

   public void actionPerformed(ActionEvent var1) {
      Object var2 = var1.getSource();
      JindentCSH.access$200(this.a, this.b, this.c, this.d, var2, var2, var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 97;
            break;
         case 1:
            var10003 = 40;
            break;
         case 2:
            var10003 = 73;
            break;
         case 3:
            var10003 = 113;
            break;
         default:
            var10003 = 85;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
