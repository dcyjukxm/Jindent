package jindent.commander;

import java.awt.Component;
import java.io.File;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import jindent.commander.FileEntry;
import jindent.commander.FileTreeModel;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class bh implements ListCellRenderer {
   protected JLabel a = new JLabel();
   protected static final Icon b = SwingUtils.readImageIcon(a("[ Zf+ErM4h\u0007sL#3\u001axE"));
   protected static final Icon c = SwingUtils.readImageIcon(a("[ Zf+EpM;y\u000fd}3r\tcO2s\u001e8R9z"));
   protected static final Icon d = SwingUtils.readImageIcon(a("[ Zf+EpM;y\u000fdQym\u0004q"));
   protected static final Icon e = SwingUtils.readImageIcon(a("[ Zf+ErM4h\u0007sL#B\u000esN2i\u000f8R9z"));

   public bh() {
      this.a.setOpaque(true);
   }

   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      if(var2 instanceof Vector) {
         this.a.setText(a("8yM#"));
         return new JLabel("");
      } else {
         FileTreeModel var6 = (FileTreeModel)var1.getModel();
         String var7 = (String)var2;
         FileEntry var8 = (FileEntry)var6.i().get(var7);
         this.a.setFont(var1.getFont());
         String var9 = var7;
         if(!var8.getFile().exists()) {
            File[] var10 = var6.a();
            if(var10 != null) {
               DialogUtils.removedFilesWarning(var10, var1);
               var1.repaint();
            }
         } else if(var8.getFile().isDirectory()) {
            var9 = var7 + a("J>") + var8.getFileCountString() + ")";
            if(var8.isRecursive()) {
               this.a.setIcon(d);
            } else {
               this.a.setIcon(c);
            }
         } else {
            this.a.setIcon(b);
         }

         this.a.setText(var9);
         if(var4) {
            this.a.setBackground(var1.getSelectionBackground());
            this.a.setForeground(var1.getSelectionForeground());
         } else {
            this.a.setBackground(var1.getBackground());
            this.a.setForeground(var1.getForeground());
         }

         return this.a;
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
            var10003 = 106;
            break;
         case 1:
            var10003 = 22;
            break;
         case 2:
            var10003 = 34;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
