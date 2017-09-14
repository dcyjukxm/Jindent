package jindent.util.swing.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class a implements TreeExpansionListener, TreeSelectionListener, Runnable {
   private JTree a = null;
   private Map b = new HashMap();
   private TreePath[] c = new TreePath[0];

   public a(JTree var1) {
      this.a = var1;
      var1.addTreeExpansionListener(this);
      var1.addTreeSelectionListener(this);
   }

   public synchronized void a() {
      SwingUtilities.invokeLater(this);
   }

   public synchronized void run() {
      ((DefaultTreeModel)this.a.getModel()).reload();
      Iterator var1 = this.b.keySet().iterator();
      ArrayList var2 = new ArrayList();

      while(var1.hasNext()) {
         TreePath var3 = (TreePath)var1.next();
         if(((Boolean)this.b.get(var3)).booleanValue()) {
            var2.add(var3);
         }
      }

      for(int var4 = 0; var4 < var2.size(); ++var4) {
         this.a.expandPath((TreePath)var2.get(var4));
      }

      this.a.getSelectionModel().setSelectionPaths(this.c);
   }

   public void treeExpanded(TreeExpansionEvent var1) {
      TreePath var2 = var1.getPath();
      Iterator var3 = this.b.keySet().iterator();
      ArrayList var4 = new ArrayList();

      while(var3.hasNext()) {
         TreePath var5 = (TreePath)var3.next();
         if(var2.isDescendant(var5)) {
            var4.add(var5);
         }
      }

      for(int var6 = 0; var6 < var4.size(); ++var6) {
         this.b.put((TreePath)var4.get(var6), new Boolean(true));
         this.a.expandPath((TreePath)var4.get(var6));
      }

      this.b.put(var2, new Boolean(true));
   }

   public void treeCollapsed(TreeExpansionEvent var1) {
      TreePath var2 = var1.getPath();
      Iterator var3 = this.b.keySet().iterator();

      while(var3.hasNext()) {
         TreePath var4 = (TreePath)var3.next();
         if(var2.isDescendant(var4)) {
            this.b.put(var4, new Boolean(false));
         }
      }

      this.b.remove(var2);
   }

   public void valueChanged(TreeSelectionEvent var1) {
      if(this.a.getSelectionPaths() != null && this.a.getSelectionPaths().length > 0) {
         this.c = this.a.getSelectionModel().getSelectionPaths();
      }

   }
}
