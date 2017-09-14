package jindent.customizer.gui.settings;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject$1;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject$2;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject$3;
import jindent.customizer.gui.settings.PackageListOfRegExGUIObject$4;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.c.PackageListOfRegExTableModel;
import jindent.customizer.gui.settings.c.PackageListOfRegExTableRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.PackageListOfRegExSetting;
import jindent.settings.RegExPackage;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.a.TableSorter;
import jindent.util.swing.a.b;

public class PackageListOfRegExGUIObject extends SettingGUIObject {
   private PackageListOfRegExTableModel g;
   private TableSorter h;
   private TableCellRenderer i;
   private JTable j;
   private static final int k = 300;
   private static final int l = 200;
   private JButton m;
   private JButton n;
   private JButton o;
   private TableCellEditor p;
   static Class q;
   static Class r;

   public PackageListOfRegExGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.g = new PackageListOfRegExTableModel(new String[]{b("$?\u0000$\'\u00045"), b("10\u0002-*\u00064A\b*\f4"), b("34\u00063\'\u0000#A\u00033\u0011#\u000458\b>\u000f")}, this);
      this.h = new TableSorter(this.g);
      this.j = new JTable(this.h);
      this.i = new PackageListOfRegExTableRenderer(this, var2);
      this.j.setDefaultRenderer(q == null?(q = class$(b("\u000b0\u0017\'e\r0\u000f!e#>\u000e*.\u0000?"))):q, this.i);
      this.j.setDefaultRenderer(r == null?(r = class$(b("\u000b0\u0017\'e\r0\u000f!e2%\u0013/%\u0006"))):r, this.i);
      this.j.setDefaultEditor(q == null?(q = class$(b("\u000b0\u0017\'e\r0\u000f!e#>\u000e*.\u0000?"))):q, this.p);
      this.j.setDefaultEditor(r == null?(r = class$(b("\u000b0\u0017\'e\r0\u000f!e2%\u0013/%\u0006"))):r, this.p);
      this.h.a(this.j);
      this.j.setSelectionMode(0);
      if(this.g.getRowCount() > 0) {
         this.j.setRowSelectionInterval(0, 0);
      }

      this.j.setAutoResizeMode(0);
      TableColumn var5 = this.j.getColumnModel().getColumn(0);
      var5.setPreferredWidth(50);
      this.j.getColumnModel().getColumn(1).setPreferredWidth(100);
      this.j.getColumnModel().getColumn(2).setPreferredWidth(150);
      JScrollPane var6 = new JScrollPane(this.j, 20, 30);
      var6.setPreferredSize(new Dimension(300, 200));
      var6.getViewport().setBackground(this.j.getBackground());
      JPanel var7 = new JPanel();
      var7.setLayout(new PropertiesLayout(0, 0, 0, 5, 0));
      this.j.addMouseListener(new PackageListOfRegExGUIObject$1(this, var2));
      JPanel var8 = new JPanel();
      var8.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
      this.m = new JButton(b(" 5\u0005"));
      this.m.setIcon(SwingUtils.readImageIcon(b("Pg\u0019w}N0\u0005\"yO!\u000f!")));
      this.m.addActionListener(new PackageListOfRegExGUIObject$2(this, var2));
      this.n = new JButton(b("$5\b2"));
      this.n.setIcon(SwingUtils.readImageIcon(b("Pg\u0019w}N5\u000e%>\f4\u000f2\u0014\u00045\b2e\u0011?\u0006")));
      this.n.addActionListener(new PackageListOfRegExGUIObject$3(this, var2));
      this.n.setEnabled(this.j.getSelectedRow() != -1);
      this.o = new JButton(b("34\f)=\u0004"));
      this.o.setIcon(SwingUtils.readImageIcon(b("Pg\u0019w}N5\u0004*.\u00154Sh;\u000f6")));
      this.o.addActionListener(new PackageListOfRegExGUIObject$4(this, var2));
      this.o.setEnabled(this.j.getSelectedRow() != -1);
      b var9 = new b(this.j, new Component[]{this.n, this.o});
      this.j.getSelectionModel().addListSelectionListener(var9);
      this.j.getColumnModel().getSelectionModel().addListSelectionListener(var9);
      var8.add(this.m, b("\"\u001e-\u0013\u0006/\u000e \n\u0002&\u001f$\u0002\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      var8.add(this.n, b("\"\u001e-\u0013\u0006/\u000e \n\u0002&\u001f$\u0002\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      var8.add(this.o, b("\"\u001e-\u0013\u0006/\u000e \n\u0002&\u001f$\u0002\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      var7.add(var6, b("\'\u001d.\u0011"));
      var7.add(var8, b("\'\u001d.\u0011\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      Component[] var4 = new Component[]{this.j, var6, var8, this.m, this.o, this.n};
      var1.add(var7, b("\'\u001d.\u0011\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      var1.add(new JavaHelpIcon(var3), b("\'\u001d.\u0011\u0014 \u001f%\u0019\u0005$\u0006>\u0014\u00046"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString(var4, var3);
         HelpUtils.setHelpIDString((Component)var7, var3);
      } else {
         System.err.println(b(")4\r6 \u0004(A") + this.getName() + b("A8\u0012f%\u0014=\r"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), var4));
      this.setAddedToJPanel(true);
   }

   private void addPackage(CustomizerData var1, EventObject var2) {
      jindent.customizer.gui.settings.c.b var3 = new jindent.customizer.gui.settings.c.b();
      int var4 = var3.a((Component)SwingUtils.findWindow((Container)this.j));
      if(var4 == 0) {
         String var5 = var3.b();
         if(this.validatePackageName(var5) && this.containsSetting()) {
            PackageListOfRegExSetting var6 = (PackageListOfRegExSetting)this.getSetting();
            var6.addQualifiersPackage(var3.a(), var3.b(), var3.c());
            this.updateJPanel();
            var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
         }
      }

   }

   private void editPackage(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         PackageListOfRegExSetting var4 = (PackageListOfRegExSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 1);
         RegExPackage var6 = var4.getQualifiersPackageByName(var5);
         jindent.customizer.gui.settings.c.b var7 = new jindent.customizer.gui.settings.c.b(var6.getEnabled(), var6.getName(), var6.getRegularExpression());
         int var8 = var7.a((Component)SwingUtils.findWindow((Container)this.j));
         if(var8 == 0) {
            String var9 = var7.b();
            if(this.validatePackageName(var9)) {
               var4.removeQualifiersPackage(var5);
               var4.addQualifiersPackage(var7.a(), var7.b(), var7.c());
               this.updateJPanel();
               var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
            }
         }
      }

   }

   private void removePackage(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         PackageListOfRegExSetting var4 = (PackageListOfRegExSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 1);
         RegExPackage var6 = var4.getQualifiersPackageByName(var5);
         jindent.customizer.gui.settings.c.a var7 = new jindent.customizer.gui.settings.c.a(var6.getEnabled(), var6.getName(), var6.getRegularExpression());
         int var8 = var7.a((Component)SwingUtils.findWindow((Container)this.j));
         if(var8 == 0) {
            var4.removeQualifiersPackage(var5);
            this.updateJPanel();
            var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
         }
      }

   }

   public void updateJPanel() {
      this.g.a(this);
      this.g.fireTableDataChanged();
      this.j.repaint();
   }

   private boolean validatePackageName(String var1) {
      Window var2 = SwingUtils.findWindow((Container)this.m);
      if(var1.equals("")) {
         DialogUtils.showErrorDialog(var2, b("10\u0002-*\u00064A(*\f4A+*\u0018q\u000f)?A3\u0004f.\f!\u0015?j"));
         return false;
      } else {
         return true;
      }
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static void access$000(PackageListOfRegExGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.editPackage(var1, var2);
   }

   static void access$100(PackageListOfRegExGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.addPackage(var1, var2);
   }

   static void access$200(PackageListOfRegExGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.removePackage(var1, var2);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 97;
            break;
         case 1:
            var10003 = 81;
            break;
         case 2:
            var10003 = 97;
            break;
         case 3:
            var10003 = 70;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
