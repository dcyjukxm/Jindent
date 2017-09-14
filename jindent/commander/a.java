package jindent.commander;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JList;
import jindent.commander.CommanderFrame;
import jindent.commander.bs;

class a extends MouseAdapter {
   private final CommanderFrame a;

   private a(CommanderFrame var1) {
      this.a = var1;
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         JList var2 = (JList)var1.getSource();
         int var3 = var2.locationToIndex(var1.getPoint());
         String var4 = (String)var2.getModel().getElementAt(var3);
         File var5 = new File(var4);
         CommanderFrame.b(this.a).a(var5);
         this.a.e().show(this.a.f(), a("J\u0015}^`T\u0006nPe_"));
      }

   }

   a(CommanderFrame var1, bs var2) {
      this(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 26;
            break;
         case 1:
            var10003 = 89;
            break;
         case 2:
            var10003 = 40;
            break;
         case 3:
            var10003 = 25;
            break;
         default:
            var10003 = 41;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
