package jindent.commander;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.tree.TreeCellRenderer;
import jindent.commander.FileTreeModel;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.TristateCheckBox;

public class FileNodeCellRenderer extends JPanel implements TreeCellRenderer {
   protected TristateCheckBox a = new TristateCheckBox();
   protected JLabel b;
   protected static final Icon c = SwingUtils.readImageIcon(a("z\u0006{ ;dTlrx&Ume#;^d"));
   protected static final Icon d = SwingUtils.readImageIcon(a("z\u0006{ ;dVl}i.B-ac,"));
   protected static final Icon e = SwingUtils.readImageIcon(a("z\u0006{ ;dVl}i.B\\ra$Cfu#;^d"));
   protected static final Icon f = SwingUtils.readImageIcon(a("z\u0006{ ;dTlrx&UmeR/Uoty.\u001es\u007fj"));
   protected Color g = UIManager.getColor(a("\u001fBft#8Uotn?Yl\u007fK$Bfv\u007f$Emu"));
   protected Color h = UIManager.getColor(a("\u001fBft#?U{eK$Bfv\u007f$Emu"));
   protected Color i = UIManager.getColor(a("\u001fBft#8Uotn?Yl\u007fO*Shv\u007f$Emu"));
   protected Color j = UIManager.getColor(a("\u001fBft#?U{eO*Shv\u007f$Emu"));
   private static Rectangle k;

   public FileNodeCellRenderer() {
      this.a.setOpaque(false);
      this.a.setBorder((Border)null);
      this.b = new JLabel();
      this.b.setOpaque(true);
      this.setOpaque(false);
      this.add(this.a);
      this.add(this.b);
      this.g = UIManager.getColor(a("\u001fBft#8Uotn?Yl\u007fK$Bfv\u007f$Emu"));
      this.h = UIManager.getColor(a("\u001fBft#?U{eK$Bfv\u007f$Emu"));
      this.i = UIManager.getColor(a("\u001fBft#8Uotn?Yl\u007fO*Shv\u007f$Emu"));
      this.j = UIManager.getColor(a("\u001fBft#?U{eO*Shv\u007f$Emu"));
      this.setBackground(this.j);
      this.doLayout();
      k = this.a.getBounds();
   }

   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      if(var2 instanceof Vector) {
         this.b.setText(a("\u0019_le"));
         return new JLabel("");
      } else {
         FileTreeModel var8 = (FileTreeModel)var1.getModel();
         String var9 = (String)var2;
         File var10 = new File(var9);
         File var11 = var10.getParentFile();
         this.a.setEnabled(true);
         this.a.a(TristateCheckBox.NOT_SELECTED);
         this.a.setBorderPaintedFlat(true);
         String var12 = a(">^gtk\"^fu");
         if(var10.isDirectory()) {
            if(var11 != null && var8.b(var11)) {
               this.a.a(TristateCheckBox.DONT_CARE);
            } else if(var8.b(var10)) {
               this.a.a(TristateCheckBox.DONT_CARE);
            } else if(var8.a(var10)) {
               this.a.setSelected(true);
               this.a.setEnabled(true);
            } else {
               this.a.setSelected(false);
               this.a.setEnabled(true);
            }
         } else if(var11 != null && var8.a(var11)) {
            this.a.setSelected(true);
            this.a.setEnabled(false);
         } else if(var8.a(var10)) {
            this.a.setSelected(true);
            this.a.setEnabled(true);
         } else {
            this.a.setSelected(false);
            this.a.setEnabled(true);
         }

         if(var11 == null) {
            var12 = (String)var2;
         } else {
            var12 = var10.getName();
         }

         this.b.setText(var12);
         if(!var10.exists() && var8.a(var10)) {
            File[] var13 = var8.a();
            if(var13 != null) {
               DialogUtils.removedFilesWarning(var13, var1);
               var1.repaint();
            }
         } else if(var5) {
            this.b.setIcon(c);
         } else if(var4) {
            this.b.setIcon(d);
         } else {
            this.b.setIcon(e);
         }

         if(var3) {
            this.b.setBackground(this.i);
            this.b.setForeground(this.g);
         } else {
            this.b.setBackground(this.j);
            this.b.setForeground(this.h);
         }

         return this;
      }
   }

   public Dimension getPreferredSize() {
      Dimension var1 = this.a.getPreferredSize();
      Dimension var2 = this.b.getPreferredSize();
      return new Dimension(var1.width + var2.width, var1.height < var2.height?var2.height:var1.height);
   }

   public void doLayout() {
      Dimension var1 = this.a.getPreferredSize();
      Dimension var2 = this.b.getPreferredSize();
      int var3 = 0;
      int var4 = 0;
      if(var1.height < var2.height) {
         var3 = (var2.height - var1.height) / 2;
      } else {
         var4 = (var1.height - var2.height) / 2;
      }

      this.a.setLocation(0, var3);
      this.a.setBounds(0, var3, var1.width, var1.height);
      this.b.setLocation(var1.width, var4);
      this.b.setBounds(var1.width, var4, var2.width, var2.height);
   }

   public static Rectangle a() {
      return k;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 75;
            break;
         case 1:
            var10003 = 48;
            break;
         case 2:
            var10003 = 3;
            break;
         case 3:
            var10003 = 17;
            break;
         default:
            var10003 = 13;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
