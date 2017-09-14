package jindent.commander;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import jindent.commander.FileNodeCellRenderer;
import jindent.commander.FileTreeModel;
import jindent.commander.FileTreeSelector;

class c extends MouseAdapter {
   JTree a;
   JList b;
   Cursor c;
   Cursor d;

   c(FileTreeSelector var1) {
      this.a = var1.b();
      this.b = var1.c();
      this.c = Cursor.getPredefinedCursor(3);
   }

   public void mouseClicked(MouseEvent var1) {
      if(var1.getClickCount() < 2) {
         int var2 = var1.getX();
         int var3 = var1.getY();
         int var4 = this.a.getRowForLocation(var2, var3);
         Rectangle var5 = FileNodeCellRenderer.a();
         TreePath var6 = this.a.getPathForRow(var4);
         FileTreeModel var7 = (FileTreeModel)this.a.getModel();
         if(var6 != null) {
            Rectangle var8 = this.a.getPathBounds(var6);
            Point var9 = var1.getPoint();
            var9.x -= var8.x;
            var9.y -= var8.y;
            if(!var5.contains(var9)) {
               return;
            }

            String var10 = (String)var6.getLastPathComponent();
            File var11 = new File(var10);
            if(var7.a(var11.getParentFile()) && !var11.isDirectory()) {
               return;
            }

            if(var7.b(var11.getParentFile()) && var11.isDirectory()) {
               return;
            }

            this.a.setCursor(this.c);
            if(var7.a(var11)) {
               if(var11.isDirectory()) {
                  if(var7.b(var11)) {
                     var7.a((File)var11, 0);
                  }

                  if(var7.a(var11)) {
                     var7.a((File)var11, 2);
                  }
               } else {
                  var7.a((File)var11, 0);
               }
            } else {
               var7.a((File)var11, 1);
            }

            this.a.setCursor(Cursor.getDefaultCursor());
            this.a.repaint();
            this.b.repaint();
         }

      }
   }
}
