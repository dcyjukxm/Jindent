package jindent.customizer.gui.settings.d;

import java.util.Iterator;
import javax.swing.table.AbstractTableModel;
import jindent.customizer.gui.settings.UserVariablesGUIObject;
import jindent.settings.UserVariablesSetting;
import jindent.settings.uservariables.UserVariable;
import jindent.util.IntHashtable;

public class UserVariablesTableModel extends AbstractTableModel {
   private String[] a;
   private UserVariablesGUIObject b;
   private IntHashtable c;

   public UserVariablesTableModel(String[] var1, UserVariablesGUIObject var2) {
      this.a = var1;
      this.a(var2);
   }

   public void a(UserVariablesGUIObject var1) {
      this.b = var1;
      this.a();
   }

   private void a() {
      this.c = new IntHashtable();
      if(this.b.containsSetting()) {
         UserVariablesSetting var1 = (UserVariablesSetting)this.b.getSetting();
         Iterator var2 = var1.variableIterator();

         for(int var3 = 0; var2.hasNext(); ++var3) {
            UserVariable var4 = (UserVariable)var2.next();
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
      UserVariable var3 = (UserVariable)this.c.a(var1);
      return var2 == 0?var3.getName():var3.getValue();
   }

   public void setValueAt(Object var1, int var2, int var3) {
      UserVariable var4 = (UserVariable)this.c.a(var2);
      if(var3 == 0) {
         var4.setName((String)var1);
      } else {
         var4.setValue((String)var1);
      }

   }

   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }

   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}
