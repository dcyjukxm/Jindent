package jindent.customizer.layout;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Vector;
import jindent.customizer.layout.PropertiesLayoutElement;
import jindent.customizer.layout.PropertiesLayoutRow;

public class PropertiesLayoutBlock {
   private int a;
   private int b;
   private int c;
   private boolean d;
   private Vector e = new Vector();

   public PropertiesLayoutBlock(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = true;
   }

   public void addElement(PropertiesLayoutElement var1) {
      if(this.d) {
         this.addNewEmptyRow();
         this.d = false;
      }

      PropertiesLayoutRow var2 = this.getCurrentRow();
      var2.addElement(var1);
      if(var1.isType(4)) {
         this.d = true;
      }

   }

   public Point layout(Point var1) {
      int var2 = this.countRows();

      for(int var3 = 0; var3 < var2; ++var3) {
         PropertiesLayoutRow var4 = this.getRowAt(var3);
         var1 = var4.layout(var1);
      }

      this.alignColumns();
      return var1;
   }

   public int countRows() {
      return this.e.size();
   }

   private void addNewEmptyRow() {
      this.addRow(new PropertiesLayoutRow(this.a, this.b, this.c));
   }

   public void addRow(PropertiesLayoutRow var1) {
      this.e.add(var1);
   }

   public PropertiesLayoutRow getRowAt(int var1) {
      return var1 < this.countRows() && var1 >= 0?(PropertiesLayoutRow)this.e.elementAt(var1):null;
   }

   public PropertiesLayoutRow getCurrentRow() {
      return (PropertiesLayoutRow)this.e.elementAt(this.e.size() - 1);
   }

   private void alignColumns() {
      int var1 = this.countRows();

      for(int var2 = 0; var2 < var1; ++var2) {
         PropertiesLayoutRow var3 = this.getRowAt(var2);
         this.alignRow(var3);
      }

   }

   private void alignRow(PropertiesLayoutRow var1) {
      int var2 = var1.countElements();

      for(int var3 = 0; var3 < var2; ++var3) {
         PropertiesLayoutElement var4 = var1.getElementAt(var3);
         if(var4.isType(1)) {
            int var5 = this.getMaxColumnWidth(var3);
            var5 = var5 + 10 - var5 % 10;
            this.setNewColumnWidth(var3, var5);
         }
      }

   }

   private void setNewColumnWidth(int var1, int var2) {
      int var3 = this.countRows();

      for(int var4 = 0; var4 < var3; ++var4) {
         PropertiesLayoutRow var5 = this.getRowAt(var4);
         if(var5 != null) {
            PropertiesLayoutElement var6 = var5.getElementAt(var1);
            if(var6 != null && var6.isType(1)) {
               var5.setNewColumnWidth(var1, var2);
            }
         }
      }

   }

   private int getMaxColumnWidth(int var1) {
      int var2 = 0;
      int var3 = this.countRows();

      for(int var4 = 0; var4 < var3; ++var4) {
         PropertiesLayoutRow var5 = this.getRowAt(var4);
         PropertiesLayoutElement var6 = var5.getElementAt(var1);
         if(var6 != null && var6.isType(1)) {
            var2 = Math.max(var2, var6.getWidth());
         }
      }

      return var2;
   }

   public PropertiesLayoutRow getTopRow() {
      return this.getRowAt(0);
   }

   public PropertiesLayoutRow getBottomRow() {
      return this.getRowAt(this.countRows() - 1);
   }

   public Dimension getLayoutSize() {
      int var1 = 0;
      int var2 = 0;
      int var3 = this.countRows();

      for(int var4 = 0; var4 < var3; ++var4) {
         PropertiesLayoutRow var5 = this.getRowAt(var4);
         Dimension var6 = var5.getLayoutSize();
         var1 = Math.max(var1, (int)var6.getWidth());
         var2 = Math.max(var2, (int)var6.getHeight());
      }

      return new Dimension(var1, var2);
   }
}
