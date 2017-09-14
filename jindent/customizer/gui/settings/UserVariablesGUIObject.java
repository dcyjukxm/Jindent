package jindent.customizer.gui.settings;

import java.awt.Component;
import java.awt.Dimension;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.UserVariablesGUIObject$1;
import jindent.customizer.gui.settings.UserVariablesGUIObject$2;
import jindent.customizer.gui.settings.UserVariablesGUIObject$3;
import jindent.customizer.gui.settings.UserVariablesGUIObject$4;
import jindent.customizer.gui.settings.d.UserVariablesTableModel;
import jindent.customizer.gui.settings.d.UserVariablesTableRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.UserVariablesSetting;
import jindent.settings.uservariables.UserVariable;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.a.TableSorter;
import jindent.util.swing.a.b;

public class UserVariablesGUIObject extends SettingGUIObject {
   private UserVariablesTableModel g;
   private TableSorter h;
   private UserVariablesTableRenderer i;
   private JTable j;
   private static final int k = 300;
   private static final int l = 200;
   private boolean m;
   private JButton n;
   private JButton o;
   private JButton p;
   static Class q;

   public UserVariablesGUIObject(String var1, String var2) {
      super(var1, var2);
      this.setEditable(true);
   }

   public void setEditable(boolean var1) {
      this.m = var1;
   }

   public boolean isEditable() {
      return this.m;
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.g = new UserVariablesTableModel(new String[]{b("m\u001c|O"), b("u\u001c}_(")}, this);
      this.h = new TableSorter(this.g);
      this.j = new JTable(this.h);
      this.j.setEnabled(this.m);
      this.i = new UserVariablesTableRenderer();
      this.j.setDefaultRenderer(q == null?(q = class$(b("I\u0014\u007fN(M\t?Y(W\txD*PSdY(Q\u000bpX$B\u001f}O>\r(bO?u\u001ccC,A\u0011t"))):q, this.i);
      this.h.a(this.j);
      this.j.setSelectionMode(0);
      JScrollPane var5 = new JScrollPane(this.j, 20, 30);
      var5.setPreferredSize(new Dimension(300, 200));
      var5.getViewport().setBackground(this.j.getBackground());
      JPanel var6 = new JPanel();
      var6.setLayout(new PropertiesLayout(0, 0, 0, 5, 0));
      Component[] var4;
      if(this.m) {
         this.j.addMouseListener(new UserVariablesGUIObject$1(this, var2));
         JPanel var7 = new JPanel();
         var7.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
         this.n = new JButton(b("b\u0019u"));
         this.n.setIcon(SwingUtils.readImageIcon(b("\u0012Ki\u001b{\f\u001cuN\u007f\r\r\u007fM")));
         this.n.addActionListener(new UserVariablesGUIObject$2(this, var2));
         this.o = new JButton(b("f\u0019x^"));
         this.o.setIcon(SwingUtils.readImageIcon(b("\u0012Ki\u001b{\f\u0019~I8N\u0018\u007f^\u0012F\u0019x^cS\u0013v")));
         this.o.addActionListener(new UserVariablesGUIObject$3(this, var2));
         this.o.setEnabled(this.j.getSelectedRow() != -1);
         this.p = new JButton(b("q\u0018|E;F"));
         this.p.setIcon(SwingUtils.readImageIcon(b("\u0012Ki\u001b{\f\u0019tF(W\u0018#\u0004=M\u001a")));
         this.p.addActionListener(new UserVariablesGUIObject$4(this, var2));
         this.p.setEnabled(this.j.getSelectedRow() != -1);
         b var8 = new b(this.j, new Component[]{this.o, this.p});
         this.j.getSelectionModel().addListSelectionListener(var8);
         this.j.getColumnModel().getSelectionModel().addListSelectionListener(var8);
         var7.add(this.n, b("`2]\u007f\u0000m\"Pf\u0004d3Tn\u0012b3Uu\u0003f*Nx\u0002t"));
         var7.add(this.o, b("`2]\u007f\u0000m\"Pf\u0004d3Tn\u0012b3Uu\u0003f*Nx\u0002t"));
         var7.add(this.p, b("`2]\u007f\u0000m\"Pf\u0004d3Tn\u0012b3Uu\u0003f*Nx\u0002t"));
         var6.add(var5, b("e1^}"));
         var6.add(var7, b("e1^}\u0012b3Uu\u0003f*Nx\u0002t"));
         var4 = new Component[]{this.j, var5, var7, this.n, this.p, this.o};
      } else {
         var6.add(var5, b("e1^}\u0012b3Uu\u0003f*Nx\u0002t"));
         var4 = new Component[]{this.j, var5};
      }

      var1.add(var6, b("e1^}\u0012b3Uu\u0003f*Nx\u0002t"));
      var1.add(new JavaHelpIcon(var3), b("e1^}\u0012b3Uu\u0003f*Nx\u0002t"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString(var4, var3);
         HelpUtils.setHelpIDString((Component)var6, var3);
      } else {
         System.err.println(b("k\u0018}Z&F\u00041") + this.getName() + b("\u0003\u0014b\n#V\u0011}"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), var4));
      this.setAddedToJPanel(true);
   }

   private void addVariable(CustomizerData var1, EventObject var2) {
      jindent.customizer.gui.settings.d.b var3 = new jindent.customizer.gui.settings.d.b();
      int var4 = var3.a((Component)this.j);
      if(var4 == 0) {
         String var5 = var3.a();
         if(this.validateVarName(var5) && this.containsSetting()) {
            UserVariablesSetting var6 = (UserVariablesSetting)this.getSetting();
            var6.setVariable(var3.a(), var3.b());
            this.updateJPanel();
            var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
         }
      }

   }

   private void editVariable(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         UserVariablesSetting var4 = (UserVariablesSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 0);
         UserVariable var6 = var4.getVariable(var5);
         String var7 = var6.getName();
         jindent.customizer.gui.settings.d.b var8 = new jindent.customizer.gui.settings.d.b(var6.getName(), var6.getValue());
         int var9 = var8.a((Component)this.j);
         if(var9 == 0) {
            String var10 = var8.a();
            if(this.validateVarName(var10)) {
               var4.removeVariable(var7);
               var4.setVariable(var8.a(), var8.b());
               this.updateJPanel();
               var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
            }
         }
      }

   }

   private void removeVariable(CustomizerData var1, EventObject var2) {
      int var3 = this.j.getSelectedRow();
      if(var3 != -1 && this.containsSetting()) {
         UserVariablesSetting var4 = (UserVariablesSetting)this.getSetting();
         String var5 = (String)this.h.getValueAt(var3, 0);
         UserVariable var6 = var4.getVariable(var5);
         jindent.customizer.gui.settings.d.a var7 = new jindent.customizer.gui.settings.d.a(var6.getName(), var6.getValue());
         int var8 = var7.a((Component)this.j);
         if(var8 == 0) {
            var4.removeVariable(var6.getName());
            this.updateJPanel();
            var1.getEventHandler().fireEvent(new CustomizerEvent(var2.getSource(), 0, this));
         }
      }

   }

   private boolean validateVarName(String var1) {
      JButton var2 = this.n;
      if(var1.equals("")) {
         DialogUtils.showErrorDialog(var2, b("u\u001ccC,A\u0011t\n#B\u0010t\n B\u00041D\"W]sOmF\u0010a^4\u0002"));
         return false;
      } else if(var1.indexOf("$") != -1) {
         DialogUtils.showErrorDialog(var2, b("u\u001ccC,A\u0011t\n B\u00041D\"W]rE#W\u001cxDmS\u001ce^(Q\u00131\u000emJ\u00131C9P]\u007fK F\\"));
         return false;
      } else if(var1.indexOf("%") != -1) {
         DialogUtils.showErrorDialog(var2, b("u\u001ccC,A\u0011t\n B\u00041D\"W]rE#W\u001cxDmS\u001ce^(Q\u00131\u000fmJ\u00131C9P]\u007fK F\\"));
         return false;
      } else {
         return true;
      }
   }

   public void updateJPanel() {
      this.g.a(this);
      this.g.fireTableDataChanged();
      this.j.repaint();
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static void access$000(UserVariablesGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.editVariable(var1, var2);
   }

   static void access$100(UserVariablesGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.addVariable(var1, var2);
   }

   static void access$200(UserVariablesGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.removeVariable(var1, var2);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 35;
            break;
         case 1:
            var10003 = 125;
            break;
         case 2:
            var10003 = 17;
            break;
         case 3:
            var10003 = 42;
            break;
         default:
            var10003 = 77;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
