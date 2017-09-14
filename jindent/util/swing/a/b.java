package jindent.util.swing.a;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class b implements ListSelectionListener {
   private JTable a;
   private Component[] b;

   public b(JTable var1, Component[] var2) {
      this.a = var1;
      this.b = var2;
   }

   public void valueChanged(ListSelectionEvent var1) {
      int var2 = this.a.getSelectedRow();

      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3].setEnabled(var2 != -1);
      }

   }
}
