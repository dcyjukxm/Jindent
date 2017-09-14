package jindent.customizer.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream.PutField;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.layout.MyCardLayout$Card;

public class MyCardLayout implements LayoutManager2, Serializable {
   private static final long serialVersionUID = -4328196481005934313L;
   Vector a;
   boolean b;
   int c;
   int d;
   int e;
   private static final ObjectStreamField[] serialPersistentFields;
   private CustomizerData f;
   static Class g;
   static Class h;

   public MyCardLayout(CustomizerData var1) {
      this(var1, 0, 0);
   }

   public MyCardLayout(CustomizerData var1, int var2, int var3) {
      this.a = new Vector();
      this.c = 0;
      this.setHgap(var2);
      this.setVgap(var3);
      this.f = var1;
      this.b = true;
   }

   public int getHgap() {
      return this.d;
   }

   public void setHgap(int var1) {
      this.d = var1;
   }

   public int getVgap() {
      return this.e;
   }

   public void setVgap(int var1) {
      this.e = var1;
   }

   public void addLayoutComponent(Component var1, Object var2) {
      synchronized(var1.getTreeLock()) {
         if(var2 instanceof String) {
            this.addLayoutComponent((String)var2, var1);
         } else {
            throw new IllegalArgumentException(a("qrwX\u007ff3xRt2gv\u0016|sjvCd(3zY~agkWy|g9[eag9Tu2r9Ed`zwQ"));
         }
      }
   }

   /** @deprecated */
   public void addLayoutComponent(String var1, Component var2) {
      synchronized(var2.getTreeLock()) {
         if(!this.a.isEmpty()) {
            var2.setVisible(false);
         }

         for(int var4 = 0; var4 < this.a.size(); ++var4) {
            if(((MyCardLayout$Card)this.a.get(var4)).a.equals(var1)) {
               ((MyCardLayout$Card)this.a.get(var4)).b = var2;
               return;
            }
         }

         this.a.add(new MyCardLayout$Card(this, var1, var2));
         this.b = true;
      }
   }

   public void removeLayoutComponent(Component var1) {
      synchronized(var1.getTreeLock()) {
         for(int var3 = 0; var3 < this.a.size(); ++var3) {
            if(((MyCardLayout$Card)this.a.get(var3)).b == var1) {
               if(var1.isVisible() && var1.getParent() != null) {
                  this.next(var1.getParent());
               }

               this.a.remove(var3);
               this.b = true;
               if(this.c > var3) {
                  --this.c;
               }
               break;
            }
         }

      }
   }

   public Dimension preferredLayoutSize(Container var1) {
      synchronized(var1.getTreeLock()) {
         Insets var3 = var1.getInsets();
         int var4 = var1.getComponentCount();
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            Component var8 = var1.getComponent(var7);
            Dimension var9 = var8.getPreferredSize();
            if(var9.width > var5) {
               var5 = var9.width;
            }

            if(var9.height > var6) {
               var6 = var9.height;
            }
         }

         return new Dimension(var3.left + var3.right + var5 + this.d * 2, var3.top + var3.bottom + var6 + this.e * 2);
      }
   }

   public Dimension minimumLayoutSize(Container var1) {
      synchronized(var1.getTreeLock()) {
         Insets var3 = var1.getInsets();
         int var4 = var1.getComponentCount();
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            Component var8 = var1.getComponent(var7);
            Dimension var9 = var8.getMinimumSize();
            if(var9.width > var5) {
               var5 = var9.width;
            }

            if(var9.height > var6) {
               var6 = var9.height;
            }
         }

         return new Dimension(var3.left + var3.right + var5 + this.d * 2, var3.top + var3.bottom + var6 + this.e * 2);
      }
   }

   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   public void invalidateLayout(Container var1) {
   }

   public void layoutContainer(Container var1) {
      synchronized(var1.getTreeLock()) {
         Insets var3 = var1.getInsets();
         int var4 = var1.getComponentCount();
         Component var5 = null;
         boolean var6 = false;

         for(int var7 = 0; var7 < var4; ++var7) {
            var5 = var1.getComponent(var7);
            var5.setBounds(this.d + var3.left, this.e + var3.top, var1.getWidth() - (this.d * 2 + var3.left + var3.right), var1.getHeight() - (this.e * 2 + var3.top + var3.bottom));
            if(var5.isVisible()) {
               var6 = true;
               this.checkForTabbedEvent(var5);
            }
         }

         if(!var6 && var4 > 0) {
            var1.getComponent(0).setVisible(true);
            this.checkForTabbedEvent(var1.getComponent(0));
         }

      }
   }

   void checkLayout(Container var1) {
      if(var1.getLayout() != this) {
         throw new IllegalArgumentException(a("eavXw2cxDu|g9P\u007f`3ZWbv_xO\u007fgg"));
      }
   }

   public void first(Container var1) {
      synchronized(var1.getTreeLock()) {
         this.checkLayout(var1);
         int var3 = var1.getComponentCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            Component var5 = var1.getComponent(var4);
            if(var5.isVisible()) {
               var5.setVisible(false);
               break;
            }
         }

         if(var3 > 0) {
            this.c = 0;
            var1.getComponent(0).setVisible(true);
            var1.validate();
            this.checkForTabbedEvent(var1.getComponent(0));
         }

      }
   }

   public void next(Container var1) {
      synchronized(var1.getTreeLock()) {
         this.checkLayout(var1);
         int var3 = var1.getComponentCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            Component var5 = var1.getComponent(var4);
            if(var5.isVisible()) {
               var5.setVisible(false);
               this.c = (var4 + 1) % var3;
               var5 = var1.getComponent(this.c);
               var5.setVisible(true);
               var1.validate();
               this.checkForTabbedEvent(var5);
               return;
            }
         }

         this.showDefaultComponent(var1);
      }
   }

   public void previous(Container var1) {
      synchronized(var1.getTreeLock()) {
         this.checkLayout(var1);
         int var3 = var1.getComponentCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            Component var5 = var1.getComponent(var4);
            if(var5.isVisible()) {
               var5.setVisible(false);
               this.c = var4 > 0?var4 - 1:var3 - 1;
               var5 = var1.getComponent(this.c);
               var5.setVisible(true);
               var1.validate();
               this.checkForTabbedEvent(var5);
               return;
            }
         }

         this.showDefaultComponent(var1);
      }
   }

   void showDefaultComponent(Container var1) {
      if(var1.getComponentCount() > 0) {
         this.c = 0;
         var1.getComponent(0).setVisible(true);
         var1.validate();
         this.checkForTabbedEvent(var1.getComponent(0));
      }

   }

   public void last(Container var1) {
      synchronized(var1.getTreeLock()) {
         this.checkLayout(var1);
         int var3 = var1.getComponentCount();

         for(int var4 = 0; var4 < var3; ++var4) {
            Component var5 = var1.getComponent(var4);
            if(var5.isVisible()) {
               var5.setVisible(false);
               break;
            }
         }

         if(var3 > 0) {
            this.c = var3 - 1;
            var1.getComponent(this.c).setVisible(true);
            var1.validate();
            this.checkForTabbedEvent(var1.getComponent(this.c));
         }

      }
   }

   public void show(Container var1, String var2) {
      synchronized(var1.getTreeLock()) {
         this.checkLayout(var1);
         Component var4 = null;
         int var5 = this.a.size();

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            MyCardLayout$Card var7 = (MyCardLayout$Card)this.a.get(var6);
            if(var7.a.equals(var2)) {
               var4 = var7.b;
               this.c = var6;
               break;
            }
         }

         if(var4 != null && !var4.isVisible()) {
            var5 = var1.getComponentCount();

            for(var6 = 0; var6 < var5; ++var6) {
               Component var10 = var1.getComponent(var6);
               if(var10.isVisible()) {
                  var10.setVisible(false);
                  break;
               }
            }

            var4.setVisible(true);
            var1.validate();
         }

         if(var4 != null) {
            this.checkForTabbedEvent(var4);
         }

      }
   }

   private void checkForTabbedEvent(Component var1) {
      if(var1 instanceof CustomizerTabbedPane) {
         CustomizerTabbedPane var2 = (CustomizerTabbedPane)var1;
         this.f.getEventHandler().fireEvent(new CustomizerEvent(var2, 2, var2));
      }

   }

   public String toString() {
      return this.getClass().getName() + a("I{~W`/") + this.d + a(">e~W`/") + this.e + "]";
   }

   private void readObject(ObjectInputStream var1) throws ClassNotFoundException, IOException {
      GetField var2 = var1.readFields();
      this.d = var2.get(a("ztxF"), 0);
      this.e = var2.get(a("dtxF"), 0);
      if(var2.defaulted(a("dvzB\u007f`"))) {
         Hashtable var3 = (Hashtable)var2.get(a("fr{"), (Object)null);
         this.a = new Vector();
         if(var3 != null && !var3.isEmpty()) {
            Enumeration var4 = var3.keys();

            while(var4.hasMoreElements()) {
               String var5 = (String)var4.nextElement();
               Component var6 = (Component)var3.get(var5);
               this.a.add(new MyCardLayout$Card(this, var5, var6));
               if(var6.isVisible()) {
                  this.c = this.a.size() - 1;
               }
            }
         }
      } else {
         this.a = (Vector)var2.get(a("dvzB\u007f`"), (Object)null);
         this.c = var2.get(a("qfkDu|gZWbv"), 0);
      }

   }

   private void writeObject(ObjectOutputStream var1) throws IOException {
      Hashtable var2 = new Hashtable();
      int var3 = this.a.size();

      for(int var4 = 0; var4 < var3; ++var4) {
         MyCardLayout$Card var5 = (MyCardLayout$Card)this.a.get(var4);
         var2.put(var5.a, var5.b);
      }

      PutField var6 = var1.putFields();
      var6.put(a("ztxF"), this.d);
      var6.put(a("dtxF"), this.e);
      var6.put(a("dvzB\u007f`"), this.a);
      var6.put(a("qfkDu|gZWbv"), this.c);
      var6.put(a("fr{"), var2);
      var1.writeFields();
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static {
      serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField(a("fr{"), g == null?(g = class$(a("xroW>ggpZ>Zrj^dsquS"))):g), new ObjectStreamField(a("ztxF"), Integer.TYPE), new ObjectStreamField(a("dtxF"), Integer.TYPE), new ObjectStreamField(a("dvzB\u007f`"), h == null?(h = class$(a("xroW>ggpZ>DvzB\u007f`"))):h), new ObjectStreamField(a("qfkDu|gZWbv"), Integer.TYPE)};
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 18;
            break;
         case 1:
            var10003 = 19;
            break;
         case 2:
            var10003 = 25;
            break;
         case 3:
            var10003 = 54;
            break;
         default:
            var10003 = 16;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
