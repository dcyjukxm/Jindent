package jindent.customizer.gui.elements.a;

import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;
import jindent.JindentException;
import jindent.formatter.k;
import jindent.util.IndexProperties;
import jindent.util.IntHashtable;

public class RegistrationTableModel extends AbstractTableModel {
   private String[] a;
   private IntHashtable b;
   public static final String JINDENT_LICENSE_EXTENSION = "jlk";

   public RegistrationTableModel(String[] var1) throws JindentException {
      this.a = var1;
      this.a();
   }

   public void a() {
      this.b = new IntHashtable();
      int var1 = 0;
      IndexProperties var2 = null;

      try {
         var2 = k.b();
      } catch (JindentException var10) {
         jindent.debugger.a.a((Exception)var10);
         return;
      }

      HashSet var3 = new HashSet();
      Iterator var4 = var2.values().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if(!var3.contains(var5)) {
            var3.add(var5);

            try {
               URL var6 = k.a(var5);
               String var7 = k.a(var6);
               if(var7 != null) {
                  jindent.customizer.gui.elements.a.a var8 = jindent.customizer.gui.elements.a.a.a(var7);
                  this.b.a(var1, var8);
                  ++var1;
               }
            } catch (Exception var9) {
               jindent.debugger.a.a(var9);
            }
         }
      }

   }

   public int getColumnCount() {
      return this.a.length;
   }

   public int getRowCount() {
      return this.b.a();
   }

   public String getColumnName(int var1) {
      return this.a[var1];
   }

   public Object getValueAt(int var1, int var2) {
      return (jindent.customizer.gui.elements.a.a)this.b.a(var1);
   }

   public void setValueAt(Object var1, int var2, int var3) {
      jindent.customizer.gui.elements.a.a var4 = (jindent.customizer.gui.elements.a.a)this.b.a(var2);
   }

   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }

   public boolean isCellEditable(int var1, int var2) {
      return false;
   }

   public static boolean a(String var0) {
      return var0.toLowerCase().endsWith(b("<$\u007fS"));
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 18;
            break;
         case 1:
            var10003 = 78;
            break;
         case 2:
            var10003 = 19;
            break;
         case 3:
            var10003 = 56;
            break;
         default:
            var10003 = 81;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
