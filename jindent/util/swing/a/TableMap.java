package jindent.util.swing.a;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TableMap extends AbstractTableModel implements TableModelListener {
   protected TableModel a;

   public TableModel a() {
      return this.a;
   }

   public void a(TableModel var1) {
      this.a = var1;
      var1.addTableModelListener(this);
   }

   public Object getValueAt(int var1, int var2) {
      return this.a.getValueAt(var1, var2);
   }

   public void setValueAt(Object var1, int var2, int var3) {
      this.a.setValueAt(var1, var2, var3);
   }

   public int getRowCount() {
      return this.a == null?0:this.a.getRowCount();
   }

   public int getColumnCount() {
      return this.a == null?0:this.a.getColumnCount();
   }

   public String getColumnName(int var1) {
      return this.a.getColumnName(var1);
   }

   public Class getColumnClass(int var1) {
      return this.a.getColumnClass(var1);
   }

   public boolean isCellEditable(int var1, int var2) {
      return this.a.isCellEditable(var1, var2);
   }

   public void tableChanged(TableModelEvent var1) {
      this.fireTableChanged(var1);
   }
}
