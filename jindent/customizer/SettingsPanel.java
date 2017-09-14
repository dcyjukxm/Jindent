package jindent.customizer;

import java.awt.Component;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.SettingsPanel$1;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.GUITab;
import jindent.customizer.layout.PropertiesLayout;

public class SettingsPanel extends JPanel {
   private CustomizerData a;
   private CustomizerTabbedPane b;

   public SettingsPanel(CustomizerData var1, GUITab var2) {
      this(var1, var2, 10, 20, 20, 5, 5);
   }

   public SettingsPanel(CustomizerData var1, GUITab var2, int var3, int var4, int var5, int var6, int var7) {
      this.a = var1;
      PropertiesLayout var8 = new PropertiesLayout(var3, var4, var5, var6, var7);
      this.setLayout(var8);
      this.b = null;
      int var9 = var2.countGUIObjects();

      for(int var10 = 0; var10 < var9; ++var10) {
         GUIObject var11 = var2.getGUIObject(var10);
         this.add(var11);
      }

      this.addMouseListener(new SettingsPanel$1(this));
   }

   private void add(GUIObject var1) {
      String var2 = var1.getName();
      if(var1 instanceof GUITab) {
         GUITab var3 = (GUITab)var1;
         if(this.b == null) {
            var3.addToJPanel(this, this.a, var2);
            this.b = var3.getTabbedPane();
         }

         SettingsPanel var4 = new SettingsPanel(this.a, var3, 10, 20, 0, 5, 5);
         this.b.addTab(var3.getDesc(), var3.getPreview(), var3.getPreviewFilterList(), var4);
      } else {
         this.b = null;
         var1.addToJPanel(this, this.a, var2);
      }

   }

   public Rectangle getBoxOf(String var1) {
      return this.getBoxOf(this, var1);
   }

   private Rectangle getBoxOf(Container var1, String var2) {
      Rectangle var3 = null;
      if(var1 instanceof JComponent) {
         String var4 = (String)((JComponent)var1).getClientProperty(a("Ng\rF\u0007B"));
         if(var4 != null && var2.equals(var4)) {
            Rectangle var5 = var1.getBounds();
            if(var5 != null) {
               if(var3 == null) {
                  return var5;
               }

               var3.add(var5);
               return var3;
            }
         }
      }

      Component[] var10 = var1.getComponents();
      int var11 = var10.length;

      for(int var6 = 0; var6 < var11; ++var6) {
         Component var7 = var10[var6];
         if(var7 instanceof Container) {
            Rectangle var8 = this.getBoxOf((Container)var7, var2);
            if(var8 != null) {
               if(var3 == null) {
                  var3 = var8;
               } else {
                  var3.add(var8);
               }
            }
         }

         if(var7 instanceof JComponent) {
            String var12 = (String)((JComponent)var7).getClientProperty(a("Ng\rF\u0007B"));
            if(var12 != null && var2.equals(var12)) {
               Rectangle var9 = var7.getBounds();
               System.out.println(var9);
               if(var9 != null) {
                  if(var3 == null) {
                     var3 = var9;
                  } else {
                     var3.add(var9);
                  }
               }
            }
         }
      }

      return var3;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 6;
            break;
         case 1:
            var10003 = 2;
            break;
         case 2:
            var10003 = 97;
            break;
         case 3:
            var10003 = 54;
            break;
         default:
            var10003 = 78;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
