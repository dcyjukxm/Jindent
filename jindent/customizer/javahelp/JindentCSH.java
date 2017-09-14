package jindent.customizer.javahelp;

import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import java.util.WeakHashMap;
import javax.help.DefaultHelpBroker;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.Popup;
import javax.help.Presentation;
import javax.help.WindowPresentation;
import javax.help.CSH.Manager;
import javax.help.Map.ID;
import javax.swing.CellRendererPane;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.tree.TreePath;
import jindent.customizer.javahelp.JindentCSH$1;

public class JindentCSH {
   private static Map a;
   private static Map b;
   private static Vector c = new Vector();
   private static final boolean d = false;
   static Class e;
   static Class f;

   public static void addManager(Manager var0) {
      c.add(var0);
   }

   public static void addManager(int var0, Manager var1) {
      c.add(var0, var1);
   }

   public static boolean removeManager(Manager var0) {
      return c.remove(var0);
   }

   public static void removeManager(int var0) {
      c.remove(var0);
   }

   public static void removeAllManagers() {
      c.clear();
   }

   public static Manager getManager(int var0) {
      return (Manager)c.get(var0);
   }

   public static Manager[] getManagers() {
      return (Manager[])((Manager[])c.toArray(new Manager[0]));
   }

   public static int getManagerCount() {
      return c.size();
   }

   private static void _setHelpIDString(Object var0, String var1) {
      if(var0 instanceof JComponent) {
         ((JComponent)var0).putClientProperty(a(",\'o\b\u0011 "), var1);
      } else {
         if(!(var0 instanceof Component) && !(var0 instanceof MenuItem)) {
            throw new IllegalArgumentException(a("-,u\u00194\r&#;7\t2l\u0016=\n6"));
         }

         if(a == null) {
            a = new WeakHashMap(5);
         }

         Hashtable var2 = (Hashtable)a.get(var0);
         if(var2 != null) {
            if(var1 != null) {
               var2.put(a(",\'o\b\u0011 "), var1);
            } else {
               var2.remove(a(",\'o\b\u0011 "));
               if(var2.isEmpty()) {
                  a.remove(var0);
               }
            }
         } else if(var1 != null) {
            var2 = new Hashtable(2);
            var2.put(a(",\'o\b\u0011 "), var1);
            a.put(var0, var2);
         }
      }

   }

   private static String _getHelpIDString(Object var0) {
      String var1 = null;
      if(var0 != null) {
         if(var0 instanceof JComponent) {
            var1 = (String)((JComponent)var0).getClientProperty(a(",\'o\b\u0011 "));
         } else {
            if(!(var0 instanceof Component) && !(var0 instanceof MenuItem)) {
               throw new IllegalArgumentException(a("-,u\u00194\r&#;7\t2l\u0016=\n6"));
            }

            if(a != null) {
               Hashtable var2 = (Hashtable)a.get(var0);
               if(var2 != null) {
                  var1 = (String)var2.get(a(",\'o\b\u0011 "));
               }
            }
         }
      }

      return var1;
   }

   private static String _getHelpIDString(Object var0, AWTEvent var1) {
      String var2 = null;
      if(var0 != null) {
         Manager[] var3 = getManagers();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var2 = var3[var4].getHelpIDString(var0, var1);
            if(var2 != null) {
               return var2;
            }
         }
      }

      return null;
   }

   private static Object getParent(Object var0) {
      if(var0 == null) {
         return null;
      } else {
         Object var1 = null;
         if(var0 instanceof MenuComponent) {
            var1 = ((MenuComponent)var0).getParent();
         } else if(var0 instanceof JPopupMenu) {
            var1 = ((JPopupMenu)var0).getInvoker();
         } else {
            if(!(var0 instanceof Component)) {
               throw new IllegalArgumentException(a("-,u\u00194\r&#;7\t2l\u0016=\n6"));
            }

            var1 = ((Component)var0).getParent();
         }

         if(var1 == null && b != null) {
            var1 = b.get(var0);
         }

         return var1;
      }
   }

   public static void setHelpIDString(Component var0, String var1) {
      _setHelpIDString(var0, var1);
   }

   public static void setHelpIDString(MenuItem var0, String var1) {
      _setHelpIDString(var0, var1);
   }

   public static String getHelpIDString(Object var0, AWTEvent var1) {
      if(var0 == null) {
         return null;
      } else {
         String var2 = _getHelpIDString(var0, var1);
         if(var2 == null) {
            var2 = _getHelpIDString(var0);
         }

         if(var2 == null) {
            var2 = getHelpIDString(getParent(var0), var1);
         }

         return var2;
      }
   }

   public static String getHelpIDString(Component var0) {
      return getHelpIDString(var0, (AWTEvent)null);
   }

   public static String getHelpIDString(MenuItem var0) {
      return getHelpIDString(var0, (AWTEvent)null);
   }

   private static void _setHelpSet(Object var0, HelpSet var1) {
      if(var0 instanceof JComponent) {
         ((JComponent)var0).putClientProperty(a(",\'o\b\u000b\u00016"), var1);
      } else {
         if(!(var0 instanceof Component) && !(var0 instanceof MenuItem)) {
            throw new IllegalArgumentException(a("-,u\u00194\r&#;7\t2l\u0016=\n6"));
         }

         if(a == null) {
            a = new WeakHashMap(5);
         }

         Hashtable var2 = (Hashtable)a.get(var0);
         if(var2 != null) {
            if(var1 != null) {
               var2.put(a(",\'o\b\u000b\u00016"), var1);
            } else {
               var2.remove(a(",\'o\b\u000b\u00016"));
               if(var2.isEmpty()) {
                  a.remove(var0);
               }
            }
         } else if(var1 != null) {
            var2 = new Hashtable(2);
            var2.put(a(",\'o\b\u000b\u00016"), var1);
            a.put(var0, var2);
         }
      }

   }

   private static HelpSet _getHelpSet(Object var0) {
      HelpSet var1 = null;
      if(var0 != null) {
         if(var0 instanceof JComponent) {
            var1 = (HelpSet)((JComponent)var0).getClientProperty(a(",\'o\b\u000b\u00016"));
         } else {
            if(!(var0 instanceof Component) && !(var0 instanceof MenuItem)) {
               throw new IllegalArgumentException(a("-,u\u00194\r&#;7\t2l\u0016=\n6"));
            }

            if(a != null) {
               Hashtable var2 = (Hashtable)a.get(var0);
               if(var2 != null) {
                  var1 = (HelpSet)var2.get(a(",\'o\b\u000b\u00016"));
               }
            }
         }
      }

      return var1;
   }

   private static HelpSet _getHelpSet(Object var0, AWTEvent var1) {
      HelpSet var2 = null;
      if(var0 != null) {
         Manager[] var3 = getManagers();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var2 = var3[var4].getHelpSet(var0, var1);
            if(var2 != null) {
               return var2;
            }
         }
      }

      return var2;
   }

   public static void setHelpSet(Component var0, HelpSet var1) {
      _setHelpSet(var0, var1);
   }

   public static void setHelpSet(MenuItem var0, HelpSet var1) {
      _setHelpSet(var0, var1);
   }

   public static HelpSet getHelpSet(Object var0, AWTEvent var1) {
      if(var0 == null) {
         return null;
      } else {
         String var2 = _getHelpIDString(var0, var1);
         if(var2 == null) {
            var2 = _getHelpIDString(var0);
         }

         if(var2 != null) {
            HelpSet var3 = _getHelpSet(var0, var1);
            if(var3 == null) {
               var3 = _getHelpSet(var0);
            }

            return var3;
         } else {
            return getHelpSet(getParent(var0), var1);
         }
      }
   }

   public static HelpSet getHelpSet(Component var0) {
      return getHelpSet(var0, (AWTEvent)null);
   }

   public static HelpSet getHelpSet(MenuItem var0) {
      return getHelpSet(var0, (AWTEvent)null);
   }

   public static Object trackCSEvents() {
      MouseEvent var0 = getMouseEvent();
      return var0 != null?getDeepestObjectAt(var0.getSource(), var0.getX(), var0.getY()):null;
   }

   private static void displayHelp(HelpBroker var0, HelpSet var1, String var2, String var3, Object var4, Object var5, AWTEvent var6) {
      Presentation var7 = null;
      ClassLoader var8;
      Class var9;
      if(var0 != null) {
         if(var0 instanceof DefaultHelpBroker) {
            ((DefaultHelpBroker)var0).setActivationObject(var5);
         }
      } else {
         Class[] var10 = new Class[]{e == null?(e = class$(a("\u000e#u\u0019 J*f\u0014(J\nf\u0014(7\'w"))):e, f == null?(f = class$(a("\u000e#u\u0019v\b#m\u001fv76q\u00116\u0003"))):f};
         Object[] var11 = new Object[]{var1, var3};

         try {
            var8 = var1.getLoader();
            if(var8 == null) {
               var9 = Class.forName(var2);
            } else {
               var9 = var8.loadClass(var2);
            }

            Method var12 = var9.getMethod(a("\u0003\'w(*\u00011f\u0016,\u00056j\u00176"), var10);
            var7 = (Presentation)var12.invoke((Object)null, var11);
         } catch (Exception var14) {
            throw new RuntimeException(a("\u00010q\u0017*D+m\u000e7\u000f+m\u001fx\u00140f\u000b=\n6b\f1\u000b,"));
         }

         if(var7 == null) {
            return;
         }

         if(var7 instanceof WindowPresentation) {
            ((WindowPresentation)var7).setActivationObject(var5);
         }

         if(var7 instanceof Popup && var4 instanceof Component) {
            ((Popup)var7).setInvoker((Component)var4);
         }
      }

      var8 = null;
      var9 = null;
      String var15 = getHelpIDString(var4, var6);
      HelpSet var16 = getHelpSet(var4, var6);
      if(var16 == null) {
         if(var0 != null) {
            var16 = var0.getHelpSet();
         } else {
            var16 = var1;
         }
      }

      try {
         ID var17 = ID.create(var15, var16);
         if(var17 == null) {
            var17 = var16.getHomeID();
         }

         if(var0 != null) {
            var0.setCurrentID(var17);
            var0.setDisplayed(true);
         } else {
            var7.setCurrentID(var17);
            var7.setDisplayed(true);
         }
      } catch (Exception var13) {
         var13.printStackTrace();
      }

   }

   private static MouseEvent getMouseEvent() {
      try {
         if(EventQueue.isDispatchThread()) {
            EventQueue var0 = null;

            try {
               var0 = Toolkit.getDefaultToolkit().getSystemEventQueue();
            } catch (Exception var6) {
               debug(var6);
            }

            if(var0 == null) {
               return null;
            }

            int var1 = -1;

            while(true) {
               while(true) {
                  while(true) {
                     ++var1;
                     AWTEvent var2 = var0.getNextEvent();
                     Object var3 = var2.getSource();
                     if(!(var2 instanceof ActiveEvent)) {
                        if(var3 instanceof Component) {
                           if(var2 instanceof KeyEvent) {
                              KeyEvent var8 = (KeyEvent)var2;
                              if(var8.getKeyCode() == 3 || var8.getKeyCode() == 27) {
                                 var8.consume();
                                 return null;
                              }

                              var8.consume();
                           } else if(!(var2 instanceof MouseEvent)) {
                              dispatchEvent(var2);
                           } else {
                              MouseEvent var4 = (MouseEvent)var2;
                              int var5 = var4.getID();
                              if((var5 == 500 || var5 == 501 || var5 == 502) && SwingUtilities.isLeftMouseButton(var4)) {
                                 if(var5 != 500 || var1 != 0) {
                                    var4.consume();
                                    return var4;
                                 }

                                 dispatchEvent(var2);
                              } else {
                                 var4.consume();
                              }
                           }
                        } else if(var3 instanceof MenuComponent) {
                           if(var2 instanceof InputEvent) {
                              ((InputEvent)var2).consume();
                           }
                        } else {
                           System.err.println(a("\u0011,b\u001a4\u0001bw\u0017x\u0000+p\b9\u0010!kX=\u0012\'m\fbD") + var2);
                        }
                     } else {
                        ((ActiveEvent)var2).dispatch();
                     }
                  }
               }
            }
         }
      } catch (InterruptedException var7) {
         debug(var7);
      }

      debug(a("\"#o\u0014x0*q\u0017-\u0003*#\u001b7\u0000\'"));
      return null;
   }

   private static void dispatchEvent(AWTEvent var0) {
      Object var1 = var0.getSource();
      if(var0 instanceof ActiveEvent) {
         ((ActiveEvent)var0).dispatch();
      } else if(var1 instanceof Component) {
         ((Component)var1).dispatchEvent(var0);
      } else if(var1 instanceof MenuComponent) {
         ((MenuComponent)var1).dispatchEvent(var0);
      } else {
         System.err.println(a("\u0011,b\u001a4\u0001bw\u0017x\u0000+p\b9\u0010!kX=\u0012\'m\fbD") + var0);
      }

   }

   private static Object getDeepestObjectAt(Object var0, int var1, int var2) {
      if(var0 instanceof Container) {
         Container var3 = (Container)var0;
         Component var4 = findComponentAt(var3, var3.getWidth(), var3.getHeight(), var1, var2);
         if(var4 != null && var4 != var3) {
            if(var4 instanceof JRootPane) {
               JLayeredPane var5 = ((JRootPane)var4).getLayeredPane();
               Rectangle var6 = var5.getBounds();
               var4 = (Component)getDeepestObjectAt(var5, var1 - var6.x, var2 - var6.y);
            }

            if(var4 != null) {
               return var4;
            }
         }
      }

      return var0;
   }

   private static Component findComponentAt(Container var0, int var1, int var2, int var3, int var4) {
      synchronized(var0.getTreeLock()) {
         if(var3 >= 0 && var3 < var1 && var4 >= 0 && var4 < var2 && var0.isVisible() && var0.isEnabled()) {
            Component[] var6 = var0.getComponents();
            int var7 = var0.getComponentCount();

            int var8;
            Component var9;
            Rectangle var10;
            Component var11;
            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var6[var8];
               var10 = null;
               if(var9 instanceof CellRendererPane) {
                  var11 = getComponentAt((CellRendererPane)var9, var3, var4);
                  if(var11 != null) {
                     var10 = getRectangleAt((CellRendererPane)var9, var3, var4);
                     var9 = var11;
                  }
               }

               if(var9 != null && !var9.isLightweight()) {
                  if(var10 == null || var10.width == 0 || var10.height == 0) {
                     var10 = var9.getBounds();
                  }

                  if(var9 instanceof Container) {
                     var9 = findComponentAt((Container)var9, var10.width, var10.height, var3 - var10.x, var4 - var10.y);
                  } else {
                     var9 = var9.getComponentAt(var3 - var10.x, var4 - var10.y);
                  }

                  if(var9 != null && var9.isVisible() && var9.isEnabled()) {
                     return var9;
                  }
               }
            }

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var6[var8];
               var10 = null;
               if(var9 instanceof CellRendererPane) {
                  var11 = getComponentAt((CellRendererPane)var9, var3, var4);
                  if(var11 != null) {
                     var10 = getRectangleAt((CellRendererPane)var9, var3, var4);
                     var9 = var11;
                  }
               }

               if(var9 != null && var9.isLightweight()) {
                  if(var10 == null || var10.width == 0 || var10.height == 0) {
                     var10 = var9.getBounds();
                  }

                  if(var9 instanceof Container) {
                     var9 = findComponentAt((Container)var9, var10.width, var10.height, var3 - var10.x, var4 - var10.y);
                  } else {
                     var9 = var9.getComponentAt(var3 - var10.x, var4 - var10.y);
                  }

                  if(var9 != null && var9.isVisible() && var9.isEnabled()) {
                     return var9;
                  }
               }
            }

            return var0;
         } else {
            return null;
         }
      }
   }

   private static Rectangle getRectangleAt(CellRendererPane var0, int var1, int var2) {
      Rectangle var3 = null;
      Container var4 = var0.getParent();
      if(var4 instanceof JTable) {
         var3 = getRectangleAt((JTable)var4, var1, var2);
      } else if(var4 instanceof JTableHeader) {
         var3 = getRectangleAt((JTableHeader)var4, var1, var2);
      } else if(var4 instanceof JTree) {
         var3 = getRectangleAt((JTree)var4, var1, var2);
      } else if(var4 instanceof JList) {
         var3 = getRectangleAt((JList)var4, var1, var2);
      }

      return var3;
   }

   private static Component getComponentAt(CellRendererPane var0, int var1, int var2) {
      Component var3 = null;
      Container var4 = var0.getParent();
      if(var4 instanceof JTable) {
         var3 = getComponentAt((JTable)var4, var1, var2);
      } else if(var4 instanceof JTableHeader) {
         var3 = getComponentAt((JTableHeader)var4, var1, var2);
      } else if(var4 instanceof JTree) {
         var3 = getComponentAt((JTree)var4, var1, var2);
      } else if(var4 instanceof JList) {
         var3 = getComponentAt((JList)var4, var1, var2);
      }

      if(var3 != null) {
         if(b == null) {
            b = new JindentCSH$1(4);
         }

         b.put(var3, var0);
      }

      return var3;
   }

   private static Rectangle getRectangleAt(JTableHeader var0, int var1, int var2) {
      Rectangle var3 = null;

      try {
         int var4 = var0.columnAtPoint(new Point(var1, var2));
         var3 = var0.getHeaderRect(var4);
      } catch (Exception var5) {
         ;
      }

      return var3;
   }

   private static Component getComponentAt(JTableHeader var0, int var1, int var2) {
      try {
         if(var0.contains(var1, var2) && var0.isVisible() && var0.isEnabled()) {
            TableColumnModel var3 = var0.getColumnModel();
            int var4 = var3.getColumnIndexAtX(var1);
            TableColumn var5 = var3.getColumn(var4);
            TableCellRenderer var6 = var5.getHeaderRenderer();
            if(var6 == null) {
               var6 = var0.getDefaultRenderer();
            }

            return var6.getTableCellRendererComponent(var0.getTable(), var5.getHeaderValue(), false, false, -1, var4);
         } else {
            return null;
         }
      } catch (Exception var7) {
         return null;
      }
   }

   private static Rectangle getRectangleAt(JTable var0, int var1, int var2) {
      Rectangle var3 = null;

      try {
         Point var4 = new Point(var1, var2);
         int var5 = var0.rowAtPoint(var4);
         int var6 = var0.columnAtPoint(var4);
         var3 = var0.getCellRect(var5, var6, true);
      } catch (Exception var7) {
         ;
      }

      return var3;
   }

   private static Component getComponentAt(JTable var0, int var1, int var2) {
      try {
         if(var0.contains(var1, var2) && var0.isVisible() && var0.isEnabled()) {
            Point var3 = new Point(var1, var2);
            int var4 = var0.rowAtPoint(var3);
            int var5 = var0.columnAtPoint(var3);
            if(var0.isEditing() && var0.getEditingRow() == var4 && var0.getEditingColumn() == var5) {
               return null;
            } else {
               TableCellRenderer var6 = var0.getCellRenderer(var4, var5);
               return var0.prepareRenderer(var6, var4, var5);
            }
         } else {
            return null;
         }
      } catch (Exception var7) {
         return null;
      }
   }

   private static Rectangle getRectangleAt(JTree var0, int var1, int var2) {
      Rectangle var3 = null;

      try {
         TreePath var4 = var0.getPathForLocation(var1, var2);
         var3 = var0.getPathBounds(var4);
      } catch (Exception var5) {
         ;
      }

      return var3;
   }

   private static Component getComponentAt(JTree var0, int var1, int var2) {
      try {
         TreePath var3 = var0.getPathForLocation(var1, var2);
         if(var0.isEditing() && var0.getSelectionPath() == var3) {
            return null;
         } else {
            int var4 = var0.getRowForPath(var3);
            Object var5 = var3.getLastPathComponent();
            boolean var6 = var0.isRowSelected(var4);
            boolean var7 = var0.isExpanded(var3);
            boolean var8 = var0.getModel().isLeaf(var5);
            boolean var9 = var0.hasFocus() && var0.getLeadSelectionRow() == var4;
            return var0.getCellRenderer().getTreeCellRendererComponent(var0, var5, var6, var7, var8, var4, var9);
         }
      } catch (Exception var10) {
         return null;
      }
   }

   private static Rectangle getRectangleAt(JList var0, int var1, int var2) {
      Rectangle var3 = null;

      try {
         int var4 = var0.locationToIndex(new Point(var1, var2));
         var3 = var0.getCellBounds(var4, var4);
      } catch (Exception var5) {
         ;
      }

      return var3;
   }

   private static Component getComponentAt(JList var0, int var1, int var2) {
      try {
         int var3 = var0.locationToIndex(new Point(var1, var2));
         Object var4 = var0.getModel().getElementAt(var3);
         boolean var5 = var0.isSelectedIndex(var3);
         boolean var6 = var0.hasFocus() && var0.getLeadSelectionIndex() == var3;
         return var0.getCellRenderer().getListCellRendererComponent(var0, var4, var3, var5, var6);
      } catch (Exception var7) {
         return null;
      }
   }

   private static JPopupMenu getRootPopupMenu(JPopupMenu var0) {
      while(var0 != null && var0.getInvoker() instanceof JMenu && var0.getInvoker().getParent() instanceof JPopupMenu) {
         var0 = (JPopupMenu)var0.getInvoker().getParent();
      }

      return var0;
   }

   private static Component findFocusOwner(JPopupMenu var0) {
      if(var0 == null) {
         return null;
      } else {
         synchronized(var0.getTreeLock()) {
            if(!var0.isVisible()) {
               return null;
            } else {
               Component var2 = null;
               int var3 = 0;

               for(int var4 = var0.getComponentCount(); var3 < var4; ++var3) {
                  Component var5 = var0.getComponent(var3);
                  if(var5.hasFocus()) {
                     var2 = var5;
                     break;
                  }

                  if(var5 instanceof JMenu && ((JMenu)var5).isPopupMenuVisible()) {
                     var2 = var5;
                  }

                  if(var5 instanceof JMenuItem && ((JMenuItem)var5).isArmed()) {
                     var2 = var5;
                  }
               }

               if(var2 instanceof JMenu) {
                  var2 = findFocusOwner(((JMenu)var2).getPopupMenu());
               }

               return (Component)(var2 != null?var2:var0);
            }
         }
      }
   }

   private static Component findFocusOwner(Component var0) {
      synchronized(var0.getTreeLock()) {
         if(var0 instanceof JPopupMenu) {
            return findFocusOwner(getRootPopupMenu((JPopupMenu)var0));
         } else if(var0.hasFocus()) {
            return var0;
         } else {
            if(var0 instanceof Container) {
               int var2 = 0;

               for(int var3 = ((Container)var0).getComponentCount(); var2 < var3; ++var2) {
                  Component var4 = findFocusOwner(((Container)var0).getComponent(var2));
                  if(var4 != null) {
                     return var4;
                  }
               }
            }

            return null;
         }
      }
   }

   private static void debug(Object var0) {
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static Component access$000(Component var0) {
      return findFocusOwner(var0);
   }

   static void access$100(Object var0) {
      debug(var0);
   }

   static void access$200(HelpBroker var0, HelpSet var1, String var2, String var3, Object var4, Object var5, AWTEvent var6) {
      displayHelp(var0, var1, var2, var3, var4, var5, var6);
   }

   static MouseEvent access$300() {
      return getMouseEvent();
   }

   static Object access$400(Object var0, int var1, int var2) {
      return getDeepestObjectAt(var0, var1, var2);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 100;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 3;
            break;
         case 3:
            var10003 = 120;
            break;
         default:
            var10003 = 88;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
