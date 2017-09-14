package jindent.customizer.layout;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;
import jindent.customizer.layout.PropertiesLayoutElement;

public class PropertiesLayoutRow {
   private int a;
   private int b;
   private int c;
   private Vector d = new Vector();

   public PropertiesLayoutRow(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void addElement(PropertiesLayoutElement var1) {
      this.d.addElement(var1);
   }

   public int countElements() {
      return this.d.size();
   }

   public PropertiesLayoutElement getFirstElement() {
      return this.getElementAt(0);
   }

   public PropertiesLayoutElement getLastElement() {
      return this.getElementAt(this.countElements() - 1);
   }

   public PropertiesLayoutElement getElementAt(int var1) {
      return var1 < this.countElements() && var1 >= 0?(PropertiesLayoutElement)this.d.elementAt(var1):null;
   }

   public Point layout(Point var1) {
      int var2 = this.getMaxHeight();
      int var3 = (int)var1.getX() + this.a;
      int var4 = (int)var1.getY();
      int var5 = this.countElements();

      for(int var6 = 0; var6 < var5; ++var6) {
         PropertiesLayoutElement var7 = this.getElementAt(var6);
         int var8 = var7.getWidth();
         int var9 = var7.getHeight();
         int var11 = var4 + (var2 - var9) / 2;
         var7.setBounds(var3, var11, var8, var9);
         var3 = var3 + var8 + this.b;
      }

      var3 = (int)var1.getX();
      var4 = (int)var1.getY() + var2 + this.c;
      return new Point(var3, var4);
   }

   public void setNewColumnWidth(int var1, int var2) {
      int var3 = this.countElements();
      if(var1 < var3) {
         PropertiesLayoutElement var4 = this.getElementAt(var1);
         Rectangle var5 = var4.getBounds();
         var4.setBoundsWidth(var2);
         int var6 = var2 - (int)var5.getWidth();

         for(int var7 = var1 + 1; var7 < var3; ++var7) {
            PropertiesLayoutElement var8 = this.getElementAt(var7);
            Rectangle var9 = var8.getBounds();
            var8.setBoundsX((int)var9.getX() + var6);
         }

      }
   }

   private int getMaxHeight() {
      int var1 = 0;
      int var2 = this.countElements();

      for(int var3 = 0; var3 < var2; ++var3) {
         PropertiesLayoutElement var4 = this.getElementAt(var3);
         var1 = Math.max(var1, var4.getHeight());
      }

      return var1;
   }

   public Dimension getLayoutSize() {
      int var1 = 0;
      int var2 = 0;
      int var3 = this.countElements();

      for(int var4 = 0; var4 < var3; ++var4) {
         PropertiesLayoutElement var5 = this.getElementAt(var4);
         Rectangle var6 = var5.getBounds();
         int var7 = (int)var6.getX() + (int)var6.getWidth();
         int var8 = (int)var6.getY() + (int)var6.getHeight();
         var1 = Math.max(var1, var7);
         var2 = Math.max(var2, var8);
      }

      return new Dimension(var1, var2);
   }
}
