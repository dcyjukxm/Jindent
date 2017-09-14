package jindent.customizer.layout;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTabbedPane;

public class PropertiesLayoutElement {
   public static final int COLUMN_ALIGNED = 1;
   public static final int FLOW = 2;
   public static final int NEW_ROW = 4;
   private Component a;
   private int b;

   public PropertiesLayoutElement(Component var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public int getWidth() {
      Dimension var1 = this.a.getPreferredSize();
      int var2 = (int)var1.getWidth();
      if(this.a instanceof JTabbedPane && var2 < 400) {
         var2 = 400;
      }

      return var2;
   }

   public int getHeight() {
      Dimension var1 = this.a.getPreferredSize();
      return (int)var1.getHeight();
   }

   public int getType() {
      return this.b;
   }

   public Rectangle getBounds() {
      return this.a.getBounds();
   }

   public void setBoundsWidth(int var1) {
      Rectangle var2 = this.getBounds();
      this.setBounds((int)var2.getX(), (int)var2.getY(), var1, (int)var2.getHeight());
   }

   public void setBoundsX(int var1) {
      Rectangle var2 = this.getBounds();
      this.setBounds(var1, (int)var2.getY(), (int)var2.getWidth(), (int)var2.getHeight());
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      this.a.setBounds(var1, var2, var3, var4);
   }

   public boolean isType(int var1) {
      return (this.b & var1) != 0;
   }

   public Component getComponent() {
      return this.a;
   }
}
