package jindent.customizer;

import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Enumeration;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerPanel$1;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.CustomizerTreeNode;
import jindent.customizer.c.SelectionTreePanel;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.layout.MyCardLayout;

public class CustomizerPanel extends JSplitPane implements ComponentListener {
   private static final int a = 640;
   private static final int b = 500;
   private SelectionTreePanel c;
   private JScrollPane d;
   private JScrollPane e;
   private MyCardLayout f;
   private JPanel g;
   private CustomizerEventListener h;
   protected CustomizerData i;

   public CustomizerPanel(CustomizerData var1) {
      this.i = var1;
      this.setOneTouchExpandable(true);
      this.f = new MyCardLayout(var1);
      this.g = this.createSettingsPanels(var1, this.f);
      this.e = new JScrollPane(this.g);
      this.c = new SelectionTreePanel(var1);
      this.d = new JScrollPane(this.c);
      this.add(this.d, a("z\u0002,`"));
      this.add(this.e, a("d\u000e-|G"));
      var1.getConstraintsHandler().update();
      this.h = new CustomizerPanel$1(this);
      var1.getEventHandler().addEventListener(this.h);
      this.addComponentListener(this);
      this.initDividerLocations();
   }

   public void initDividerLocations() {
      this.setDividerLocation(0.25D);
      this.setResizeWeight(0.25D);
   }

   public void initScrollBars() {
      JScrollBar var1 = this.e.getHorizontalScrollBar();
      var1.setValue(0);
      JScrollBar var2 = this.e.getVerticalScrollBar();
      var2.setValue(0);
   }

   public void setWaitCursor() {
      this.setCursor(new Cursor(3));
   }

   public void setDefaultCursor() {
      this.setCursor(new Cursor(0));
   }

   public void componentResized(ComponentEvent var1) {
   }

   public void componentHidden(ComponentEvent var1) {
   }

   public void componentMoved(ComponentEvent var1) {
   }

   public void componentShown(ComponentEvent var1) {
   }

   private JPanel createSettingsPanels(CustomizerData var1, MyCardLayout var2) {
      var1.getEventHandler().setBlockEvents(true);
      CustomizerTreeNode var3 = var1.getRoot();
      JPanel var4 = new JPanel(var2);
      Enumeration var5 = var3.depthFirstEnumeration();
      String var6 = null;

      while(var5.hasMoreElements()) {
         DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var5.nextElement();
         if(var7 instanceof CustomizerTreeNode) {
            CustomizerTreeNode var8 = (CustomizerTreeNode)var7;
            CustomizerTabbedPane var9 = new CustomizerTabbedPane(var1, var8);
            String var10 = var8.getKey();
            var4.add(var9, var10);
            if(var6 == null) {
               var6 = var10;
            }
         }
      }

      var2.show(var4, var6);
      var1.getEventHandler().setBlockEvents(false);
      return var4;
   }

   public void dispose() {
      this.i.getEventHandler().removeEventListener(this.h);
   }

   static JPanel access$000(CustomizerPanel var0) {
      return var0.g;
   }

   static MyCardLayout access$100(CustomizerPanel var0) {
      return var0.f;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 22;
            break;
         case 1:
            var10003 = 103;
            break;
         case 2:
            var10003 = 74;
            break;
         case 3:
            var10003 = 20;
            break;
         default:
            var10003 = 51;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
