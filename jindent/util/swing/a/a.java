package jindent.util.swing.a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import jindent.util.swing.a.TableSorter;

class a extends MouseAdapter {
   private final JTable a;
   private final TableSorter b;
   private final TableSorter c;

   a(TableSorter var1, JTable var2, TableSorter var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void mouseClicked(MouseEvent var1) {
      TableColumnModel var2 = this.a.getColumnModel();
      int var3 = var2.getColumnIndexAtX(var1.getX());
      int var4 = this.a.convertColumnIndexToModel(var3);
      boolean var5;
      if(var1.getClickCount() == 1 && var4 != -1) {
         var5 = false;
         this.b.a(var4, var5);
      }

      if(var1.getClickCount() == 2 && var4 != -1) {
         var5 = true;
         this.b.a(var4, var5);
      }

   }
}
