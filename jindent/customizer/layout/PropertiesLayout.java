package jindent.customizer.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import jindent.customizer.layout.PropertiesLayoutBlock;
import jindent.customizer.layout.PropertiesLayoutElement;

public class PropertiesLayout implements LayoutManager2 {
   public static final int GRID_X = 10;
   public static final int TAB_MIN_WIDTH = 400;
   public static final int DEFAULT_HGAP = 5;
   public static final int DEFAULT_VGAP = 5;
   public static final int DEFAULT_INDENT = 20;
   public static final int NO_INDENT = 0;
   public static final String BLANKLINE = "BLANKLINE";
   public static final String TITLE = "TITLE";
   public static final String FLOW = "FLOW";
   public static final String FLOW_AND_NEW_ROW = "FLOW_AND_NEW_ROW";
   public static final String COLUMN_ALIGNED = "COLUMN_ALIGNED";
   public static final String COLUMN_ALIGNED_AND_NEW_ROW = "COLUMN_ALIGNED_AND_NEW_ROW";
   private Point a;
   private int b;
   private int c;
   private int d;
   private List e;
   private boolean f;
   private boolean g;
   private Dimension h;

   public PropertiesLayout(int var1, int var2, int var3, int var4, int var5) {
      this.a = new Point(var1, var2);
      this.d = var3;
      this.b = var4;
      this.c = var5;
      this.e = new ArrayList();
      this.f = false;
      this.h = new Dimension(0, 0);
      this.g = true;
   }

   private void addBlock(PropertiesLayoutBlock var1) {
      this.e.add(var1);
   }

   private int countBlocks() {
      return this.e.size();
   }

   private void addNewEmptyBlock() {
      this.addBlock(new PropertiesLayoutBlock(this.d, this.b, this.c));
   }

   private PropertiesLayoutBlock getCurrentBlock() {
      return this.getBlockAt(this.countBlocks() - 1);
   }

   private PropertiesLayoutBlock getBlockAt(int var1) {
      return var1 < this.countBlocks() && var1 >= 0?(PropertiesLayoutBlock)this.e.get(var1):null;
   }

   public float getLayoutAlignmentX(Container var1) {
      return 0.5F;
   }

   public float getLayoutAlignmentY(Container var1) {
      return 0.5F;
   }

   public void invalidateLayout(Container var1) {
      this.f = true;
   }

   public Dimension maximumLayoutSize(Container var1) {
      return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public void addLayoutComponent(Component var1, Object var2) {
      String var3 = (String)var2;
      if(var3.equals("TITLE")) {
         this.addNewEmptyBlock();
         this.addLayoutComponent(var1, 6);
         this.g = true;
      }

      if(var3.equals("BLANKLINE")) {
         this.addNewEmptyBlock();
         this.addLayoutComponent(var1, 6);
         this.g = true;
      }

      if(var3.equals("COLUMN_ALIGNED")) {
         this.addLayoutComponent(var1, 1);
      }

      if(var3.equals("COLUMN_ALIGNED_AND_NEW_ROW")) {
         this.addLayoutComponent(var1, 5);
      }

      if(var3.equals("FLOW")) {
         this.addLayoutComponent(var1, 2);
      }

      if(var3.equals("FLOW_AND_NEW_ROW")) {
         this.addLayoutComponent(var1, 6);
      }

   }

   private void addLayoutComponent(Component var1, int var2) {
      if(this.g) {
         this.addNewEmptyBlock();
         this.g = false;
      }

      this.getCurrentBlock().addElement(new PropertiesLayoutElement(var1, var2));
      this.f = true;
   }

   public void addLayoutComponent(String var1, Component var2) {
   }

   public void removeLayoutComponent(Component var1) {
   }

   public PropertiesLayoutBlock getTopBlock() {
      return this.getBlockAt(0);
   }

   public PropertiesLayoutBlock getBottomBlock() {
      return this.getBlockAt(this.countBlocks() - 1);
   }

   private Point layout(Point var1) {
      Point var2 = var1.getLocation();
      int var3 = this.countBlocks();

      for(int var4 = 0; var4 < var3; ++var4) {
         PropertiesLayoutBlock var5 = this.getBlockAt(var4);
         var2 = var5.layout(var2);
      }

      this.f = false;
      return var2;
   }

   public void layoutContainer(Container var1) {
      if(this.f) {
         this.layout(this.a);
      }

   }

   public Dimension minimumLayoutSize(Container var1) {
      return this.getLayoutSize(var1);
   }

   public Dimension preferredLayoutSize(Container var1) {
      return this.getLayoutSize(var1);
   }

   private Dimension getLayoutSize(Container var1) {
      if(this.f) {
         this.layout(this.a);
         int var2 = 0;
         int var3 = 0;
         int var4 = this.countBlocks();

         for(int var5 = 0; var5 < var4; ++var5) {
            PropertiesLayoutBlock var6 = this.getBlockAt(var5);
            Dimension var7 = var6.getLayoutSize();
            var2 = Math.max(var2, (int)var7.getWidth());
            var3 = Math.max(var3, (int)var7.getHeight());
         }

         this.h = new Dimension(var2 + this.b, var3 + this.c);
      }

      return this.h;
   }
}
