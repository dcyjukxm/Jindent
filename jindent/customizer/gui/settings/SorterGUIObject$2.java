package jindent.customizer.gui.settings;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.TreePath;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.settings.SorterGUIObject;
import jindent.customizer.gui.settings.a.SorterTreeRenderer;
import jindent.settings.sorter.OptionalSorterElement;
import jindent.settings.sorter.SorterElement;

class SorterGUIObject$2 extends MouseAdapter {
   private final CustomizerData a;
   private final GUIObject b;
   private final SorterGUIObject c;

   SorterGUIObject$2(SorterGUIObject var1, CustomizerData var2, GUIObject var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void mousePressed(MouseEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = SorterGUIObject.access$000(this.c).getRowForLocation(var2, var3);
      TreePath var5 = SorterGUIObject.access$000(this.c).getPathForRow(var4);
      if(var5 != null) {
         Rectangle var6 = SorterGUIObject.access$000(this.c).getRowBounds(var4);
         int var7 = var2 - (int)var6.getX();
         SorterElement var8 = (SorterElement)var5.getLastPathComponent();
         if(var8.isParentSortChecked() && SorterTreeRenderer.a(var8, var7) && var8 instanceof OptionalSorterElement) {
            OptionalSorterElement var9 = (OptionalSorterElement)var8;
            if(var1.getClickCount() >= 1) {
               boolean var10 = !var9.isSort();
               var9.setSort(var10);
               this.a.getEventHandler().fireEvent(new CustomizerEvent(var1.getSource(), 0, this.b));
            }

            SorterGUIObject.access$000(this.c).d().a();
         }
      }

   }
}
