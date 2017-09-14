package jindent.commander;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListModel;
import javax.swing.border.Border;
import jindent.commander.FileTree;
import jindent.commander.FileTreeModel;
import jindent.commander.bh;
import jindent.commander.bi;
import jindent.commander.c;
import jindent.commander.d;

public class FileTreeSelector extends JPanel implements KeyListener {
   private JSplitPane a = new JSplitPane();
   private JScrollPane b = new JScrollPane();
   private JScrollPane c = new JScrollPane();
   private JList d = new JList();
   private FileTree e;
   private JPanel f = new JPanel();
   String[] g = new String[]{a("^\u001aD")};
   JLabel h = new JLabel();
   JPanel i = new JPanel();
   JLabel j = new JLabel();
   BorderLayout k = new BorderLayout();
   Border l;

   public FileTreeSelector() {
      this.e = new FileTree();

      try {
         this.a();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public FileTreeSelector(File[] var1) {
      this.e = new FileTree(var1);

      try {
         this.a();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public FileTreeSelector(String[] var1) {
      this.e = new FileTree(var1);

      try {
         this.a();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   private void a() throws Exception {
      FileTreeModel var1 = (FileTreeModel)this.e.getModel();
      this.e.addMouseListener(new c(this));
      this.b.getViewport().add(this.e, (Object)null);
      this.j.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
      this.j.setText(a("2]\u0002\u0010&\'M\u001d\u0001c\u0019"));
      this.i.setLayout(new BorderLayout());
      this.i.add(this.j, a(":[\u001c\u0001n"));
      this.i.add(this.b, a("7Q\u0000\u0001c\u0006"));
      this.h.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
      this.h.setText(a("\'Q\u0002\u0010e\u0000Q\nU@\u001dX\u000b\u0006"));
      this.d.setModel((ListModel)this.e.getModel());
      this.d.setCellRenderer(new bh());
      this.d.setSelectionMode(2);
      this.d.addMouseListener(new d(this, (bi)null));
      this.d.addKeyListener(this);
      this.c.getViewport().add(this.d, (Object)null);
      this.f.setLayout(new BorderLayout());
      this.f.add(this.h, a(":[\u001c\u0001n"));
      this.f.add(this.c, a("7Q\u0000\u0001c\u0006"));
      this.a.setOrientation(1);
      this.a.add(this.f, a("\u0006]\t\u001dr"));
      this.a.add(this.i, a("\u0018Q\b\u0001"));
      this.setLayout(new BorderLayout());
      this.add(this.a, a("7Q\u0000\u0001c\u0006"));
   }

   public FileTree b() {
      return this.e;
   }

   public JList c() {
      return this.d;
   }

   public void keyTyped(KeyEvent var1) {
   }

   public void keyPressed(KeyEvent var1) {
      if(var1.getKeyCode() == 127) {
         FileTreeModel var2 = (FileTreeModel)this.e.getModel();
         int[] var3 = this.d.getSelectedIndices();
         String[] var4 = new String[var3.length];

         int var5;
         for(var5 = 0; var5 < var3.length; ++var5) {
            var4[var5] = (String)this.d.getModel().getElementAt(var3[var5]);
         }

         this.d.clearSelection();

         for(var5 = 0; var5 < var3.length; ++var5) {
            var2.a((String)var4[var5], 0);
         }

         this.e.repaint();
         this.d.repaint();
      }

   }

   public void keyReleased(KeyEvent var1) {
   }

   public JSplitPane d() {
      return this.a;
   }

   static JList a(FileTreeSelector var0) {
      return var0.d;
   }

   static FileTree b(FileTreeSelector var0) {
      return var0.e;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 116;
            break;
         case 1:
            var10003 = 52;
            break;
         case 2:
            var10003 = 110;
            break;
         case 3:
            var10003 = 117;
            break;
         default:
            var10003 = 6;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
