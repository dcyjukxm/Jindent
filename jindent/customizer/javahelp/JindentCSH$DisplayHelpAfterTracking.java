package jindent.customizer.javahelp;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.MenuComponent;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.UIManager;
import jindent.customizer.javahelp.JindentCSH;

public class JindentCSH$DisplayHelpAfterTracking implements ActionListener {
   private HelpBroker a = null;
   private HelpSet b = null;
   private String c = null;
   private String d = null;
   private Hashtable e;

   public JindentCSH$DisplayHelpAfterTracking(HelpBroker var1) {
      if(var1 == null) {
         throw new NullPointerException(a("\u001e\u0004"));
      } else {
         this.a = var1;
      }
   }

   public JindentCSH$DisplayHelpAfterTracking(HelpSet var1, String var2, String var3) {
      if(var1 == null) {
         throw new NullPointerException(a("\u001e\u0015"));
      } else {
         try {
            ClassLoader var4 = var1.getLoader();
            if(var4 == null) {
               Class var5 = Class.forName(var2);
            } else {
               var4.loadClass(var2);
            }
         } catch (Exception var7) {
            throw new IllegalArgumentException(var2 + a("\u0006\u0014\u0003\u0012\u0004\u0018\u0012\u0007\u0015\b\u0019\bFA\b\u0018\u0010\u0007\r\b\u0012"));
         }

         this.c = var2;
         this.d = var3;
         this.b = var1;
      }
   }

   public void actionPerformed(ActionEvent var1) {
      Cursor var2 = (Cursor)UIManager.get(a(">\u0003\n\u0011.\u0018/\u0012\u0004\f5\u0013\u0014\u0012\u000e\u0004"));
      if(var2 != null) {
         Vector var4 = null;
         this.e = null;
         if(var2 != null) {
            this.e = new Hashtable();
            var4 = getTopContainers(var1.getSource());
            Enumeration var5 = var4.elements();

            while(var5.hasMoreElements()) {
               this.setAndStoreCursors((Container)var5.nextElement(), var2);
            }
         }

         MouseEvent var7 = JindentCSH.access$300();
         JindentCSH.access$100(a("55.O\u0006\u0013\u0012+\u000e\u0014\u0005\u0003#\u0017\u0004\u0018\u0012NHAHXXA") + var7);
         if(var7 != null) {
            Object var6 = JindentCSH.access$400(var7.getSource(), var7.getX(), var7.getY());
            JindentCSH.access$100(a("55.O\u0006\u0013\u0012\"\u0004\u0004\u0006\u0003\u0015\u0015.\u0014\f\u0003\u0002\u00157\u0012NHAHXXA") + var6);
            if(var6 != null) {
               JindentCSH.access$200(this.a, this.b, this.c, this.d, var6, var1.getSource(), var7);
            }
         }

         if(var4 != null) {
            Enumeration var8 = var4.elements();

            while(var8.hasMoreElements()) {
               this.resetAndRestoreCursors((Container)var8.nextElement());
            }
         }

         this.e = null;
      }
   }

   private static Vector getTopContainers(Object var0) {
      Vector var1 = new Vector();
      Component var2 = null;
      var2 = getRoot(var0);
      if(var2 instanceof Applet) {
         try {
            Enumeration var3 = ((Applet)var2).getAppletContext().getApplets();

            while(var3.hasMoreElements()) {
               var1.add(var3.nextElement());
            }
         } catch (NullPointerException var7) {
            var1.add(var2);
         }
      }

      Frame[] var8 = Frame.getFrames();

      for(int var4 = 0; var4 < var8.length; ++var4) {
         Window[] var5 = var8[var4].getOwnedWindows();

         for(int var6 = 0; var6 < var5.length; ++var6) {
            var1.add(var5[var6]);
         }

         if(!var1.contains(var8[var4])) {
            var1.add(var8[var4]);
         }
      }

      return var1;
   }

   private static Component getRoot(Object var0) {
      Object var1 = var0;

      while(var1 != null) {
         var0 = var1;
         if(var1 instanceof MenuComponent) {
            var1 = ((MenuComponent)var1).getParent();
         } else {
            if(!(var1 instanceof Component) || var1 instanceof Window || var1 instanceof Applet) {
               break;
            }

            var1 = ((Component)var1).getParent();
         }
      }

      return var0 instanceof Component?(Component)var0:null;
   }

   private void setAndStoreCursors(Component var1, Cursor var2) {
      if(var1 != null) {
         Cursor var3 = var1.getCursor();
         if(var3 != var2) {
            this.e.put(var1, var3);
            JindentCSH.access$100(a("\u0005\u0003\u0012A\u0002\u0003\u0014\u0015\u000e\u0013V\t\bA") + var1);
            var1.setCursor(var2);
         }

         if(var1 instanceof Container) {
            Component[] var4 = ((Container)var1).getComponents();

            for(int var5 = 0; var5 < var4.length; ++var5) {
               this.setAndStoreCursors(var4[var5], var2);
            }
         }

      }
   }

   private void resetAndRestoreCursors(Component var1) {
      if(var1 != null) {
         Cursor var2 = (Cursor)this.e.get(var1);
         if(var2 != null) {
            JindentCSH.access$100(a("\u0004\u0003\u0015\u0015\u000e\u0004\u0003\u0002A\u0002\u0003\u0014\u0015\u000e\u0013V") + var2 + a("V\t\bA") + var1);
            var1.setCursor(var2);
         }

         if(var1 instanceof Container) {
            Component[] var3 = ((Container)var1).getComponents();

            for(int var4 = 0; var4 < var3.length; ++var4) {
               this.resetAndRestoreCursors(var3[var4]);
            }
         }

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
            var10003 = 118;
            break;
         case 1:
            var10003 = 102;
            break;
         case 2:
            var10003 = 102;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 97;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
