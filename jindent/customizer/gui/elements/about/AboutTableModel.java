package jindent.customizer.gui.elements.about;

import javax.swing.table.AbstractTableModel;
import jindent.AboutInfo;

public class AboutTableModel extends AbstractTableModel {
   private String[] a;
   private AboutInfo[] b;

   public AboutTableModel(String[] var1, AboutInfo[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public int getColumnCount() {
      return this.a.length;
   }

   public int getRowCount() {
      return this.b.length;
   }

   public String getColumnName(int var1) {
      return this.a[var1];
   }

   public Object getValueAt(int var1, int var2) {
      AboutInfo var3 = this.b[var1];

      try {
         return var2 == 0?var3.getName():(var2 == 1?var3.getVersion():var3.getReleaseDate());
      } catch (Exception var5) {
         jindent.debugger.a.a(var5);
         return null;
      }
   }

   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }

   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}
