package jindent.customizer.gui.settings.c;

import java.util.Iterator;
import javax.swing.table.AbstractTableModel;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject;
import jindent.settings.PackageListOfRegExSetting;
import jindent.settings.RegExPackage;
import jindent.util.IntHashtable;

public class PackageListOfRegExTableModel extends AbstractTableModel {
   private String[] a;
   private PackageListOfRegExGUIObject b;
   private IntHashtable c;

   public PackageListOfRegExTableModel(String[] var1, PackageListOfRegExGUIObject var2) {
      this.a = var1;
      this.a(var2);
   }

   public void a(PackageListOfRegExGUIObject var1) {
      this.b = var1;
      this.a();
   }

   private void a() {
      this.c = new IntHashtable();
      if(this.b.containsSetting()) {
         PackageListOfRegExSetting var1 = (PackageListOfRegExSetting)this.b.getSetting();
         Iterator var2 = var1.packageIterator();

         for(int var3 = 0; var2.hasNext(); ++var3) {
            RegExPackage var4 = (RegExPackage)var2.next();
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

   public Object a(int var1) {
      return this.c.a(var1);
   }

   public Object getValueAt(int var1, int var2) {
      RegExPackage var3 = (RegExPackage)this.c.a(var1);
      return var2 == 0?var3.getEnabled():(var2 == 1?var3.getName():var3.getRegularExpression());
   }

   public void setValueAt(Object var1, int var2, int var3) {
      RegExPackage var4 = (RegExPackage)this.c.a(var2);
      if(var3 == 0) {
         var4.setEnabled((Boolean)var1);
      } else if(var3 == 1) {
         var4.setName((String)var1);
      } else {
         var4.setRegularExpression((String)var1);
      }

   }

   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }

   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}
