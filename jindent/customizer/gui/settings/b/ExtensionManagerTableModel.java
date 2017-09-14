package jindent.customizer.gui.settings.b;

import java.util.Iterator;
import javax.swing.table.AbstractTableModel;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject;
import jindent.settings.ExtensionManagerSetting;
import jindent.settings.extensionmanager.ExtensionAssignment;
import jindent.util.IntHashtable;

public class ExtensionManagerTableModel extends AbstractTableModel {
   private String[] a;
   private ExtensionManagerGUIObject b;
   private IntHashtable c;

   public ExtensionManagerTableModel(String[] var1, ExtensionManagerGUIObject var2) {
      this.a = var1;
      this.a(var2);
   }

   public void a(ExtensionManagerGUIObject var1) {
      this.b = var1;
      this.a();
   }

   private void a() {
      this.c = new IntHashtable();
      if(this.b.containsSetting()) {
         ExtensionManagerSetting var1 = (ExtensionManagerSetting)this.b.getSetting();
         Iterator var2 = var1.assignmentIterator();

         for(int var3 = 0; var2.hasNext(); ++var3) {
            ExtensionAssignment var4 = (ExtensionAssignment)var2.next();
            this.c.a(var3, var4);
         }
      }

   }

   public int getColumnCount() {
      return this.a.length;
   }

   public int getRowCount() {
      return this.c.a();
   }

   public String getColumnName(int var1) {
      return this.a[var1];
   }

   public Object getValueAt(int var1, int var2) {
      ExtensionAssignment var3 = (ExtensionAssignment)this.c.a(var1);
      return var2 == 0?var3.getExtension():var3.getFormatterName();
   }

   public void setValueAt(Object var1, int var2, int var3) {
      ExtensionAssignment var4 = (ExtensionAssignment)this.c.a(var2);
      if(var3 == 0) {
         var4.setExtension((String)var1);
      } else {
         var4.setFormatterName((String)var1);
      }

   }

   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }

   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}
