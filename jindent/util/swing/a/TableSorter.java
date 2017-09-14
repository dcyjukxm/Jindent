package jindent.util.swing.a;

import java.util.Date;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import jindent.util.swing.a.TableMap;

public class TableSorter extends TableMap {
   int[] b;
   Vector c = new Vector();
   boolean d = true;
   int e;
   static Class f;
   static Class g;
   static Class h;
   static Class i;

   public TableSorter() {
      this.b = new int[0];
   }

   public TableSorter(TableModel var1) {
      this.a(var1);
   }

   public void a(TableModel var1) {
      super.a(var1);
      this.b();
   }

   public int a(int var1, int var2, int var3) {
      Class var4 = this.a.getColumnClass(var3);
      TableModel var5 = this.a;
      Object var6 = var5.getValueAt(var1, var3);
      Object var7 = var5.getValueAt(var2, var3);
      if(var6 == null && var7 == null) {
         return 0;
      } else if(var6 == null) {
         return -1;
      } else if(var7 == null) {
         return 1;
      } else if(var4.getSuperclass() == (f == null?(f = a(b("ro\u0007=mto\u001f;mV{\u001c>&j"))):f)) {
         Number var17 = (Number)var5.getValueAt(var1, var3);
         double var20 = var17.doubleValue();
         Number var25 = (Number)var5.getValueAt(var2, var3);
         double var27 = var25.doubleValue();
         return var20 < var27?-1:(var20 > var27?1:0);
      } else if(var4 == (g == null?(g = a(b("ro\u0007=mmz\u00180m\\o\u00059"))):g)) {
         Date var16 = (Date)var5.getValueAt(var1, var3);
         long var19 = var16.getTime();
         Date var24 = (Date)var5.getValueAt(var2, var3);
         long var26 = var24.getTime();
         return var19 < var26?-1:(var19 > var26?1:0);
      } else {
         String var9;
         if(var4 == (h == null?(h = a(b("ro\u0007=mto\u001f;mKz\u00035-\u007f"))):h)) {
            String var15 = (String)var5.getValueAt(var1, var3);
            var9 = (String)var5.getValueAt(var2, var3);
            int var22 = var15.compareTo(var9);
            return var22 < 0?-1:(var22 > 0?1:0);
         } else if(var4 == (i == null?(i = a(b("ro\u0007=mto\u001f;mZa\u001e0&y`"))):i)) {
            Boolean var14 = (Boolean)var5.getValueAt(var1, var3);
            boolean var18 = var14.booleanValue();
            Boolean var21 = (Boolean)var5.getValueAt(var2, var3);
            boolean var23 = var21.booleanValue();
            return var18 == var23?0:(var18?1:-1);
         } else {
            Object var8 = var5.getValueAt(var1, var3);
            var9 = var8.toString();
            Object var10 = var5.getValueAt(var2, var3);
            String var11 = var10.toString();
            int var12 = var9.compareTo(var11);
            return var12 < 0?-1:(var12 > 0?1:0);
         }
      }
   }

   public int a(int var1, int var2) {
      ++this.e;

      for(int var3 = 0; var3 < this.c.size(); ++var3) {
         Integer var4 = (Integer)this.c.elementAt(var3);
         int var5 = this.a(var1, var2, var4.intValue());
         if(var5 != 0) {
            return this.d?-var5:var5;
         }
      }

      return 0;
   }

   public void b() {
      int var1 = this.a.getRowCount();
      this.b = new int[var1];

      for(int var2 = 0; var2 < var1; this.b[var2] = var2++) {
         ;
      }

   }

   public void tableChanged(TableModelEvent var1) {
      this.b();
      super.tableChanged(var1);
   }

   public void c() {
      if(this.b.length != this.a.getRowCount()) {
         System.err.println(b("Ka\u0003(&j.\u001f378g\u001f:,jc\u00148cwhQ=c{f\u00102$}.\u00182cua\u00159/6"));
      }

   }

   public void a(Object var1) {
      this.c();
      this.e = 0;
      this.a((int[])((int[])this.b.clone()), this.b, 0, this.b.length);
   }

   public void d() {
      for(int var1 = 0; var1 < this.getRowCount(); ++var1) {
         for(int var2 = var1 + 1; var2 < this.getRowCount(); ++var2) {
            if(this.a(this.b[var1], this.b[var2]) == -1) {
               this.b(var1, var2);
            }
         }
      }

   }

   public void a(int[] var1, int[] var2, int var3, int var4) {
      if(var4 - var3 >= 2) {
         int var5 = (var3 + var4) / 2;
         this.a(var2, var1, var3, var5);
         this.a(var2, var1, var5, var4);
         int var6 = var3;
         int var7 = var5;
         int var8;
         if(var4 - var3 >= 4 && this.a(var1[var5 - 1], var1[var5]) <= 0) {
            for(var8 = var3; var8 < var4; ++var8) {
               var2[var8] = var1[var8];
            }

         } else {
            for(var8 = var3; var8 < var4; ++var8) {
               if(var7 < var4 && (var6 >= var5 || this.a(var1[var6], var1[var7]) > 0)) {
                  var2[var8] = var1[var7++];
               } else {
                  var2[var8] = var1[var6++];
               }
            }

         }
      }
   }

   public void b(int var1, int var2) {
      int var3 = this.b[var1];
      this.b[var1] = this.b[var2];
      this.b[var2] = var3;
   }

   public Object getValueAt(int var1, int var2) {
      this.c();
      return this.a.getValueAt(this.b[var1], var2);
   }

   public void setValueAt(Object var1, int var2, int var3) {
      this.c();
      this.a.setValueAt(var1, this.b[var2], var3);
   }

   public void a(int var1) {
      this.a(var1, true);
   }

   public void a(int var1, boolean var2) {
      this.d = var2;
      this.c.removeAllElements();
      this.c.addElement(new Integer(var1));
      this.a((Object)this);
      super.tableChanged(new TableModelEvent(this));
   }

   public void a(JTable var1) {
      var1.setColumnSelectionAllowed(false);
      jindent.util.swing.a.a var4 = new jindent.util.swing.a.a(this, var1, this);
      JTableHeader var5 = var1.getTableHeader();
      var5.addMouseListener(var4);
   }

   static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 24;
            break;
         case 1:
            var10003 = 14;
            break;
         case 2:
            var10003 = 113;
            break;
         case 3:
            var10003 = 92;
            break;
         default:
            var10003 = 67;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
