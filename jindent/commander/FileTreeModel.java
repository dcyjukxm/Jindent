package jindent.commander;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import jindent.commander.FileEntry;
import jindent.commander.bf;
import jindent.commander.bg;
import jindent.util.Utils;

public class FileTreeModel extends DefaultListModel implements TreeModel, ListModel {
   public static final int UNSELECTED = 0;
   public static final int SELECTED = 1;
   public static final int RECURSIVE = 2;
   protected Vector a;
   protected Vector b = new Vector();
   protected Vector c = new Vector();
   private TreeMap d = new TreeMap();
   private bg e = new bg();
   private boolean f = false;

   public FileTreeModel(String[] var1) {
      this.a(var1);
   }

   public void a(String[] var1) {
      boolean var2 = Utils.isWindows();
      this.a = new Vector(var1.length);

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         if(!var2 || !var4.startsWith(c("_\u0005%")) && !var4.startsWith(c("\\\u0005%"))) {
            this.a.add(var4);
         }
      }

   }

   public boolean a(File var1) {
      return var1 == null?false:(var1.isDirectory()?this.d.containsKey(var1.getAbsolutePath()) || this.b(var1.getParentFile()):this.d.containsKey(var1.getAbsolutePath()) || this.a(var1.getParentFile()));
   }

   public File[] a() {
      Vector var1 = new Vector();
      boolean var2 = false;
      TreeMap var3 = this.d;
      synchronized(this.d) {
         Iterator var4 = this.d.values().iterator();

         while(true) {
            if(!var4.hasNext()) {
               break;
            }

            FileEntry var5 = (FileEntry)var4.next();
            File var6 = var5.getFile();
            if(!var6.exists()) {
               var1.add(var6);
               var2 = true;
            }
         }
      }

      if(var2) {
         File[] var9 = (File[])((File[])var1.toArray(new File[0]));

         for(int var10 = 0; var10 < var9.length; ++var10) {
            if(var9[var10] != null) {
               this.d.remove(var9[var10].getAbsolutePath());
            }
         }

         this.b(true);
         this.b();
         this.f();
         this.fireContentsChanged(this, 0, this.d.size());
         return var9;
      } else {
         return null;
      }
   }

   public boolean b(File var1) {
      if(var1 == null) {
         return false;
      } else {
         if(var1.isDirectory()) {
            if(!this.d.containsKey(var1.getAbsolutePath())) {
               return this.b(var1.getParentFile());
            }

            FileEntry var2 = (FileEntry)this.d.get(var1.getAbsolutePath());
            if(var2.isRecursive()) {
               return true;
            }
         }

         return false;
      }
   }

   public void a(String var1, int var2) {
      File var3 = new File(var1);
      this.a(var3, var2);
   }

   public void a(File var1, int var2) {
      boolean var3 = false;
      String var4 = var1.getAbsolutePath();
      if(var2 == 0) {
         this.d.remove(var4);
      } else {
         FileEntry var5;
         if(this.d.containsKey(var4)) {
            var5 = (FileEntry)this.d.get(var1.getAbsolutePath());
            var5.setRecursive(var2 == 2);
            var5.setFileCount(this.a(var5.getFile(), var5.isRecursive()));
         } else {
            var5 = new FileEntry(var1, var2 == 2);
            this.d.put(var4, var5);
            var5.setFileCount(this.a(var5.getFile(), var5.isRecursive()));
         }
      }

      this.b(true);
      this.fireContentsChanged(this, 0, this.d.size());
      this.f();
   }

   private int a(File var1, boolean var2) {
      if(!var1.isDirectory()) {
         return 1;
      } else {
         int var3 = 0;
         File[] var4 = var1.listFiles(this.e);

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if(!var4[var5].isDirectory() || var2) {
               var3 += this.a(var4[var5], var2);
               if(var3 > 500) {
                  break;
               }
            }
         }

         return var3;
      }
   }

   private void b() {
      int var1 = this.getSize();

      for(int var2 = 0; var2 < var1; ++var2) {
         try {
            FileEntry var3 = (FileEntry)this.d.get(this.getElementAt(var2));
            var3.setFileCount(this.a(var3.getFile(), var3.isRecursive()));
         } catch (ArrayIndexOutOfBoundsException var4) {
            ;
         }
      }

   }

   public TreePath a(String var1) {
      if(this.d.containsKey(var1)) {
         FileEntry var2 = (FileEntry)((FileEntry)this.d.get(var1));
         return this.c(var2.getFile());
      } else {
         return null;
      }
   }

   public Object getRoot() {
      return this.a;
   }

   public boolean isLeaf(Object var1) {
      if(var1 instanceof Vector) {
         return false;
      } else {
         File var2 = new File((String)var1);
         return var2.isFile();
      }
   }

   public int getChildCount(Object var1) {
      if(var1 instanceof Vector) {
         return ((Vector)var1).size();
      } else {
         File var2 = new File((String)var1);
         if(var2.isDirectory()) {
            File[] var3 = var2.listFiles(this.e);
            return var3 == null?0:var3.length;
         } else {
            return 0;
         }
      }
   }

   public Object getChild(Object var1, int var2) {
      if(var1 instanceof Vector) {
         return (String)((Vector)var1).get(var2);
      } else {
         File var3 = new File((String)var1);
         File[] var4 = var3.listFiles(this.e);
         if(var4 != null && var2 < var4.length) {
            Arrays.sort(var4, new bf());
            return var4[var2].getAbsolutePath();
         } else {
            return null;
         }
      }
   }

   public int getIndexOfChild(Object var1, Object var2) {
      if(var1 instanceof Vector) {
         return ((Vector)var1).indexOf(var2);
      } else {
         File var3 = new File((String)var1);
         File[] var4 = var3.listFiles(this.e);
         if(var4 == null) {
            return -1;
         } else {
            Arrays.sort(var4, new bf());

            for(int var5 = 0; var5 < var4.length; ++var5) {
               if(var2.equals(var4[var5])) {
                  return var5;
               }
            }

            return -1;
         }
      }
   }

   public void valueForPathChanged(TreePath var1, Object var2) {
   }

   public void addTreeModelListener(TreeModelListener var1) {
      this.b.add(var1);
   }

   public void removeTreeModelListener(TreeModelListener var1) {
      this.b.remove(var1);
   }

   public int getSize() {
      int var1 = 0;
      Iterator var2 = this.d.keySet().iterator();

      while(var2.hasNext()) {
         FileEntry var3 = (FileEntry)this.d.get(var2.next());
         if(var3.getFile().exists() && this.e.accept(var3.getFile())) {
            ++var1;
         }
      }

      return var1;
   }

   public Object getElementAt(int var1) {
      Vector var2 = new Vector();
      Iterator var3 = this.d.keySet().iterator();

      while(var3.hasNext()) {
         try {
            FileEntry var4 = (FileEntry)this.d.get(var3.next());
            if(this.e.accept(var4.getFile())) {
               var2.add(var4.getFile().getAbsolutePath());
            }
         } catch (ArrayIndexOutOfBoundsException var5) {
            ;
         }
      }

      return var2.get(var1);
   }

   public void c() {
      Object[] var1 = this.d.keySet().toArray();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         FileEntry var3 = (FileEntry)this.d.get(this.d.get(var1[var2]));
      }

   }

   public String d() {
      return this.e.a();
   }

   public void b(String var1) {
      this.e.a(var1);
      this.b(true);
      if(this.e.b()) {
         this.b();
         this.f();
         this.fireContentsChanged(this, 0, this.d.size());
      }

   }

   public void e() {
      this.b(true);
      this.b();
      this.f();
      this.fireContentsChanged(this, 0, this.d.size());
   }

   private void f() {
      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         TreeModelListener var2 = (TreeModelListener)this.b.get(var1);
         TreePath var3 = new TreePath(this.getRoot());
         TreeModelEvent var4 = new TreeModelEvent(this, var3);
         var2.treeStructureChanged(var4);
      }

   }

   public boolean g() {
      return this.e.b();
   }

   public void a(boolean var1) {
      this.e.a(var1);
      this.b(true);
      this.b();
      this.f();
      this.fireContentsChanged(this, 0, this.d.size());
   }

   public FileEntry[] h() {
      Object[] var1 = this.d.keySet().toArray();
      FileEntry[] var2 = new FileEntry[var1.length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         Object var4 = this.d.get(var1[var3]);
         if(var4 instanceof FileEntry) {
            var2[var3] = (FileEntry)var4;
         } else {
            var2[var3] = (FileEntry)null;
         }
      }

      return var2;
   }

   public void a(FileEntry[] var1) {
      this.d.clear();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] != null) {
            File var3 = var1[var2].getFile();
            if(var3 != null) {
               this.d.put(var3.getAbsolutePath(), var1[var2]);
            }
         }
      }

      this.b(true);
      this.f();
      this.fireContentsChanged(this, 0, this.d.size());
   }

   private TreePath c(File var1) {
      TreePath var2 = new TreePath(this.getRoot());
      Stack var3 = new Stack();
      var3.push(var1);

      while(var1.getParentFile() != null) {
         var1 = var1.getParentFile();
         var3.push(var1);
      }

      while(!var3.empty()) {
         var1 = (File)var3.pop();
         var2 = var2.pathByAddingChild(var1.getAbsolutePath());
      }

      return var2;
   }

   public TreeMap i() {
      return this.d;
   }

   public boolean j() {
      return this.f;
   }

   public void b(boolean var1) {
      this.f = var1;

      for(int var2 = 0; var2 < this.c.size(); ++var2) {
         ChangeListener var3 = (ChangeListener)this.c.get(var2);
         if(var3 != null) {
            var3.stateChanged(new ChangeEvent(this));
         }
      }

   }

   public void a(ChangeListener var1) {
      this.c.addElement(var1);
   }

   public void b(ChangeListener var1) {
      this.c.removeElement(var1);
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 30;
            break;
         case 1:
            var10003 = 63;
            break;
         case 2:
            var10003 = 121;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 97;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
