package jindent.commander;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import jindent.commander.FileNodeCellRenderer;
import jindent.commander.FileSystemRoot;
import jindent.commander.FileTreeModel;
import jindent.util.Utils;

public class FileTree extends JTree implements TreeModelListener, TreeExpansionListener {
   private HashSet a;
   private File[] b;

   public FileTree() {
      this(a());
   }

   public FileTree(File[] var1) {
      this.a = new HashSet(10);
      this.setRowHeight(0);
      this.a(var1);
   }

   public FileTree(String[] var1) {
      this.a = new HashSet(10);
      this.setRowHeight(0);
      this.a(var1);
   }

   public static File[] a() {
      File[] var0 = null;
      SecurityManager var1 = System.getSecurityManager();
      if(Utils.isWindows()) {
         var0 = b();
      } else {
         try {
            System.setSecurityManager((SecurityManager)null);
            var0 = File.listRoots();
         } finally {
            System.setSecurityManager(var1);
         }
      }

      return var0;
   }

   public static File[] b() {
      Vector var0 = new Vector();
      FileSystemRoot var1 = new FileSystemRoot(a("Z\u0017]"));
      var0.addElement(var1);

      for(char var2 = 67; var2 <= 90; ++var2) {
         char[] var3 = new char[]{var2, ':', '\\'};
         String var4 = new String(var3);
         FileSystemRoot var5 = new FileSystemRoot(var4);
         if(var5 != null && var5.exists()) {
            var0.addElement(var5);
         }
      }

      File[] var6 = new File[var0.size()];
      var0.copyInto(var6);
      return var6;
   }

   public void a(File[] var1) {
      if(var1 == null) {
         var1 = a();
      }

      String[] var2 = new String[var1.length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3].getAbsolutePath();
         var2[var3] = var4;
      }

      this.a(var2);
   }

   private void a(String[] var1) {
      this.setShowsRootHandles(false);
      TreeModel var2 = this.getModel();
      if(var2 != null && var2 instanceof FileTreeModel) {
         ((FileTreeModel)var2).a(var1);
      } else {
         FileTreeModel var3 = new FileTreeModel(var1);
         this.setModel(var3);
         var3.addTreeModelListener(this);
         this.addTreeExpansionListener(this);
         this.setCellRenderer(new FileNodeCellRenderer());
         this.getSelectionModel().setSelectionMode(1);
      }

   }

   public void treeNodesChanged(TreeModelEvent var1) {
   }

   public void treeNodesInserted(TreeModelEvent var1) {
   }

   public void treeNodesRemoved(TreeModelEvent var1) {
   }

   public void treeStructureChanged(TreeModelEvent var1) {
      this.setModel(this.getModel());
      synchronized(this) {
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            TreePath var4 = (TreePath)var3.next();
            this.expandPath(var4);
         }

      }
   }

   public void treeExpanded(TreeExpansionEvent var1) {
      this.a.add(var1.getPath());
   }

   public void treeCollapsed(TreeExpansionEvent var1) {
      this.a.remove(var1.getPath());
   }

   public void c() {
      this.a(a());
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 27;
            break;
         case 1:
            var10003 = 45;
            break;
         case 2:
            var10003 = 1;
            break;
         case 3:
            var10003 = 6;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
