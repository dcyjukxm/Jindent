package jindent.commander;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import jindent.commander.CommanderFrame;
import jindent.commander.FileTreeModel;
import jindent.commander.bs;

class b extends MouseAdapter {
   private final CommanderFrame a;

   private b(CommanderFrame var1) {
      this.a = var1;
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         JTree var2 = (JTree)var1.getSource();
         int var3 = var1.getX();
         int var4 = var1.getY();
         int var5 = var2.getRowForLocation(var3, var4);
         TreePath var6 = var2.getPathForRow(var5);
         FileTreeModel var7 = (FileTreeModel)var2.getModel();
         if(var6 != null) {
            String var8 = (String)var6.getLastPathComponent();
            File var9 = new File(var8);
            CommanderFrame.b(this.a).a(var9);
            this.a.e().show(this.a.f(), a(":w`\u00047$ds\n2/"));
         }
      }

   }

   b(CommanderFrame var1, bs var2) {
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
            var10003 = 106;
            break;
         case 1:
            var10003 = 59;
            break;
         case 2:
            var10003 = 53;
            break;
         case 3:
            var10003 = 67;
            break;
         default:
            var10003 = 126;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
