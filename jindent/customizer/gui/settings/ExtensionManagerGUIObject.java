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
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject$1;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject$2;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject$3;
import jindent.customizer.gui.settings.ExtensionManagerGUIObject$4;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.b.ExtensionManagerTableModel;
import jindent.customizer.gui.settings.b.ExtensionManagerTableRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.ExtensionManagerSetting;
import jindent.settings.extensionmanager.ExtensionAssignment;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.a.TableSorter;
import jindent.util.swing.a.b;

public class ExtensionManagerGUIObject extends SettingGUIObject {
   private ExtensionManagerTableModel g;
   private TableSorter h;
   private ExtensionManagerTableRenderer i;
   private JTable j;
   private static final int k = 300;
   private static final int l = 200;
   private JButton m;
   private JButton n;
   private JButton o;
   static Class p;

   public ExtensionManagerGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.g = new ExtensionManagerTableModel(new String[]{b("\u0017\n\u0000[\u000f!\u001b\u001bP"), b("\u0014\u001d\u0006S\u0000&\u0006\u0011L")}, this);
      this.h = new TableSorter(this.g);
      this.j = new JTable(this.h);
      this.i = new ExtensionManagerTableRenderer();
      this.j.setDefaultRenderer(p == null?(p = class$(b("8\u001b\u001aZ\u0004<\u0006ZM\u0004&\u0006\u001dP\u0006!\\\u0011F\u00157\u001c\u0007W\u000e<\u001f\u0015P\u00005\u0017\u0006\u0010$*\u0006\u0011P\u0012;\u001d\u001a\u007f\u0012!\u001b\u0013P\f7\u001c\u0000"))):p, this.i);
      this.h.a(this.j);
      this.j.setSelectionMode(0);
      if(this.g.getRowCount() > 0) {
         this.j.setRowSelectionInterval(0, 0);
      }

      JScrollPane var5 = new JScrollPane(this.j, 20, 30);
      var5.setPreferredSize(new Dimension(300, 200));
      var5.getViewport().setBackground(this.j.getBackground());
      JPanel var6 = new JPanel();
      var6.setLayout(new PropertiesLayout(0, 0, 0, 5, 0));
      this.j.addMouseListener(new ExtensionManagerGUIObject$1(this, var2));
      JPanel var7 = new JPanel();
      var7.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
      this.m = new JButton(b("\u0013\u0016\u0010"));
      this.m.setIcon(SwingUtils.readImageIcon(b("cD\f\u000fW}\u0013\u0010ZS|\u0002\u001aY")));
      this.m.addActionListener(new ExtensionManagerGUIObject$2(this, var2));
      this.n = new JButton(b("\u0017\u0016\u001dJ"));
      this.n.setIcon(SwingUtils.readImageIcon(b("cD\f\u000fW}\u0016\u001b]\u0014?\u0017\u001aJ>7\u0016\u001dJO\"\u001c\u0013")));
      this.n.addActionListener(new ExtensionManagerGUIObject$3(this, var2));
      this.n.setEnabled(this.j.getSelectedRow() != -1);
      this.o = new JButton(b("\u0000\u0017\u0019Q\u00177"));
      this.o.setIcon(SwingUtils.readImageIcon(b("cD\f\u000fW}\u0016\u0011R\u0004&\u0017F\u0010\u0011<\u0015")));
      this.o.addActionListener(new ExtensionManagerGUIObject$4(this, var2));
      this.o.setEnabled(this.j.getSelectedRow() != -1);
      b var8 = new b(this.j, new Component[]{this.n, this.o});
      this.j.getSelectionModel().addListSelectionListener(var8);
      this.j.getColumnModel().getSelectionModel().addListSelectionListener(var8);
      var7.add(this.m, b("\u0011=8k,\u001c-5r(\u0015<1z>\u0013<0a/\u0017%+l.\u0005"));
      var7.add(this.n, b("\u0011=8k,\u001c-5r(\u0015<1z>\u0013<0a/\u0017%+l.\u0005"));
      var7.add(this.o, b("\u0011=8k,\u001c-5r(\u0015<1z>\u0013<0a/\u0017%+l.\u0005"));
      var6.add(var5, b("\u0014>;i"));
      var6.add(var7, b("\u0014>;i>\u0013<0a/\u0017%+l.\u0005"));
      Component[] var4 = new Component[]{this.j, var5, var7, this.m, this.o, this.n};
      var1.add(var6, b("\u0014>;i>\u0013<0a/\u0017%+l.\u0005"));
      var1.add(new JavaHelpIcon(var3), b("\u0014>;i>\u0013<0a/\u0017%+l.\u0005"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString(var4, var3);
         HelpUtils.setHelpIDString((Component)var6, var3);
      } else {
         System.err.println(b("\u001a\u0017\u0018N\n7\u000bT") + this.getName() + b("r\u001b\u0007\u001e\u000f\'\u001e\u0018"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), var4));
      this.setAddedToJPanel(true);
   }

   private void addAssignment(CustomizerData var1, EventObject var2) {
      jindent.customizer.gui.settings.b.b var3 = new jindent.customizer.gui.settings.b.b();
      int var4 = var3.a((Component)SwingUtils.findWindow((Container)this.j));
      if(var4 == 0) {
         String var5 = var3.a();
         if(this.validateExtension(var5) && this.containsSetting()) {
            ExtensionManagerSetting var6 = (ExtensionManagerSetting)this.getSetting();
            var6.setAssignment(var3.a(), var3.b());
            this.updateJPanel();
            var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
         }
      }

   }

   private void editAssignment(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         ExtensionManagerSetting var4 = (ExtensionManagerSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 0);
         ExtensionAssignment var6 = var4.getAssignment(var5);
         String var7 = var6.getExtension();
         jindent.customizer.gui.settings.b.b var8 = new jindent.customizer.gui.settings.b.b(var6.getExtension(), var6.getFormatterName());
         int var9 = var8.a((Component)SwingUtils.findWindow((Container)this.j));
         if(var9 == 0) {
            String var10 = var8.a();
            if(this.validateExtension(var10)) {
               var4.removeAssignment(var7);
               var4.setAssignment(var8.a(), var8.b());
               this.updateJPanel();
               var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
            }
         }
      }

   }

   private void removeAssignment(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         ExtensionManagerSetting var4 = (ExtensionManagerSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 0);
         ExtensionAssignment var6 = var4.getAssignment(var5);
         jindent.customizer.gui.settings.b.a var7 = new jindent.customizer.gui.settings.b.a(var6.getExtension(), var6.getFormatterName());
         int var8 = var7.a((Component)SwingUtils.findWindow((Container)this.j));
         if(var8 == 0) {
            var4.removeAssignment(var6.getExtension());
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

   private boolean validateExtension(String var1) {
      Window var2 = SwingUtils.findWindow((Container)this.m);
      if(var1.indexOf(".") != -1) {
         DialogUtils.showErrorDialog(var2, b("\u0002\u001e\u0011_\u00127R\u0000G\u00117R\u0011F\u00157\u001c\u0007W\u000e<\u0001TI\b&\u001a\u001bK\u0015r\u0016\u001bJ\u0012sR2Q\u0013r\u001b\u001aM\u00153\u001c\u0017[[r\u0018\u0015H\u0000"));
         return false;
      } else if(var1.equals("")) {
         DialogUtils.showErrorDialog(var2, b("\u0017\n\u0000[\u000f!\u001b\u001bPA?\u0013\r\u001e\u000f=\u0006T\\\u0004r\u0017\u0019N\u0015+S"));
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

   static void access$000(ExtensionManagerGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.editAssignment(var1, var2);
   }

   static void access$100(ExtensionManagerGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.addAssignment(var1, var2);
   }

   static void access$200(ExtensionManagerGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.removeAssignment(var1, var2);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 82;
            break;
         case 1:
            var10003 = 114;
            break;
         case 2:
            var10003 = 116;
            break;
         case 3:
            var10003 = 62;
            break;
         default:
            var10003 = 97;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
