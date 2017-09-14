package jindent.customizer.gui.settings;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.SorterGUIObject$1;
import jindent.customizer.gui.settings.SorterGUIObject$2;
import jindent.customizer.gui.settings.SorterGUIObject$3;
import jindent.customizer.gui.settings.SorterGUIObject$4;
import jindent.customizer.gui.settings.SorterGUIObject$5;
import jindent.customizer.gui.settings.SorterGUIObject$6;
import jindent.customizer.gui.settings.SorterGUIObject$7;
import jindent.customizer.gui.settings.SorterGUIObject$8;
import jindent.customizer.gui.settings.a.SorterTree;
import jindent.customizer.gui.settings.a.SorterTreeRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.Setting;
import jindent.settings.SorterSetting;
import jindent.settings.sorter.SorterElement;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.SwingUtils;

public class SorterGUIObject extends SettingGUIObject {
   private JButton g;
   private JButton h;
   private JButton i;
   private JButton j;
   private JButton k;
   private SorterTree l;

   public SorterGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void setSetting(Setting var1) {
      super.setSetting(var1);
      SorterSetting var2 = (SorterSetting)var1;
      SorterElement var3 = var2.getSorterRoot();
      if(this.isAddedToJPanel()) {
         DefaultTreeModel var4 = (DefaultTreeModel)this.l.getModel();
         var4.setRoot(var3);
      }

   }

   public void updateJPanel() {
      if(this.containsSetting()) {
         SorterSetting var1 = (SorterSetting)this.getSetting();
         SorterElement var2 = var1.getSorterRoot();
         DefaultTreeModel var3 = (DefaultTreeModel)this.l.getModel();
         var3.setRoot(var2);
         var3.reload();
         this.l.d().a();
         this.l.repaint();
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.l = new SorterTree();
      this.l.setModel(new DefaultTreeModel(new DefaultMutableTreeNode()));
      this.l.addTreeSelectionListener(new SorterGUIObject$1(this));
      this.l.addMouseListener(new SorterGUIObject$2(this, var2, this));
      this.l.addTreeWillExpandListener(new SorterGUIObject$3(this));
      JScrollPane var5 = new JScrollPane(this.l);
      var5.setPreferredSize(new Dimension(282, 180));
      var5.setHorizontalScrollBarPolicy(31);
      var5.setVerticalScrollBarPolicy(20);
      this.g = new JButton(b("S\u00070\u001eNk\u0018"));
      this.g.setIcon(SwingUtils.readImageIcon(b("/^>JX1\t4\t\u0001iZ\u0019\u000e\u001eA\u000f4\u001e\u000bpF6\u0015\t")));
      this.g.addActionListener(new SorterGUIObject$4(this, var2, this));
      this.i = new JButton(b("_\f\""));
      this.i.setIcon(SwingUtils.readImageIcon(b("/^>JX1\t\"\u001f\\0\u0018(\u001c")));
      this.i.addActionListener(new SorterGUIObject$5(this, var2, this));
      this.j = new JButton(b("[\f/\u000f"));
      this.j.setIcon(SwingUtils.readImageIcon(b("/^>JX1\f)\u0018\u001bs\r(\u000f1{\f/\u000f@n\u0006!")));
      this.j.addActionListener(new SorterGUIObject$6(this, var2, this));
      this.k = new JButton(b("L\r+\u0014\u0018{"));
      this.k.setIcon(SwingUtils.readImageIcon(b("/^>JX1\f#\u0017\u000bj\rtU\u001ep\u000f")));
      this.k.addActionListener(new SorterGUIObject$7(this, var2, this));
      this.h = new JButton(b("S\u00070\u001eNz\u00071\u0015"));
      this.h.setIcon(SwingUtils.readImageIcon(b("/^>JX1\t4\t\u0001iZ\u0019\u001f\u0001i\u0006\u0019\u001c\u001c{\r(U\u001ep\u000f")));
      this.h.addActionListener(new SorterGUIObject$8(this, var2, this));
      JPanel var6 = new JPanel();
      var6.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
      var6.add(this.g, b("]\'\n.#P7\u00077\'Y&\u0003?1_&\u0002$ [?\u0019)!I"));
      var6.add(this.i, b("]\'\n.#P7\u00077\'Y&\u0003?1_&\u0002$ [?\u0019)!I"));
      var6.add(this.j, b("]\'\n.#P7\u00077\'Y&\u0003?1_&\u0002$ [?\u0019)!I"));
      var6.add(this.k, b("]\'\n.#P7\u00077\'Y&\u0003?1_&\u0002$ [?\u0019)!I"));
      var6.add(this.h, b("]\'\n.#P7\u00077\'Y&\u0003?1_&\u0002$ [?\u0019)!I"));
      this.updateTreeAndButtons();
      JPanel var7 = new JPanel();
      var7.setLayout(new PropertiesLayout(0, 0, 0, 5, 0));
      JPanel var8 = new JPanel();
      MultiLineLabel var9 = new MultiLineLabel("");
      MultiLineLabel var10 = new MultiLineLabel(b("Z\r%\u0017\u000fl\t2\u0012\u0001p\u001b"), 2);
      MultiLineLabel var11 = new MultiLineLabel(b("M\u00074\u000f"), 2);
      var9.setPreferredSize(new Dimension(12, 15));
      var10.setPreferredSize(new Dimension(204, 15));
      var11.setPreferredSize(new Dimension(40, 15));
      var8.add(var9);
      var8.add(var10);
      var8.add(var11);
      var7.add(var8, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      var7.add(var5, b("X$\t,"));
      var7.add(var6, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      JPanel var12 = new JPanel();
      var12.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
      JLabel var13 = new JLabel(b("M\u00074\u000f\u0007p\u000ff\u001d\u0007r\u001c#\t"), SorterTreeRenderer.FILTER_ELEMENT_ICON, 2);
      var12.add(var13, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      JLabel var14 = new JLabel(b("_\u001c2\t\u0007|\u001d2\u001eNj\u0007f\u0018\u0001p\u001c4\u0014\u0002>\u001b)\t\u001aw\u0006![\bw\u00042\u001e\u001c"), SorterTreeRenderer.FILTER_ATTRIBUTE_ICON, 2);
      var12.add(var14, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      var12.add(new JavaHelpIcon(var3), b("X$\t,1_&\u0002$ [?\u0019)!I"));
      var1.add(var7, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      var1.add(var12, b("X$\t,1_&\u0002$ [?\u0019)!I"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.l, var3);
         HelpUtils.setHelpIDString((Component)var7, var3);
         HelpUtils.setHelpIDString((Component)this.g, var3);
         HelpUtils.setHelpIDString((Component)this.i, var3);
         HelpUtils.setHelpIDString((Component)this.j, var3);
         HelpUtils.setHelpIDString((Component)this.k, var3);
         HelpUtils.setHelpIDString((Component)this.h, var3);
         HelpUtils.setHelpIDString((Component)var12, var3);
      } else {
         System.err.println(b("V\r*\u000b\u0005{\u0011f") + this.getName() + b(">\u00015[\u0000k\u0004*"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), new Component[]{var10, var11, this.l, this.g, this.i, this.j, this.k, this.h, var13, var14}));
      this.setAddedToJPanel(true);
   }

   private final void updateTreeAndButtons() {
      SorterElement var1 = (SorterElement)this.l.a();
      if(var1 != null && !var1.isRoot() && var1.isParentSortChecked()) {
         DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1.getParent();
         int var3 = var2.getIndex(var1);
         int var4 = var2.getChildCount() - 1;
         if(var4 == 0) {
            this.g.setEnabled(false);
            this.h.setEnabled(false);
         } else if(var3 == 0) {
            this.g.setEnabled(false);
            this.h.setEnabled(true);
         } else if(var3 < var4) {
            this.g.setEnabled(true);
            this.h.setEnabled(true);
         } else {
            this.g.setEnabled(true);
            this.h.setEnabled(false);
         }

         int var5 = var1.getId();
         boolean var6 = this.isAddEnabled(var5);
         boolean var7 = this.isRemoveEditEnabled(var5);
         this.i.setEnabled(var6);
         this.j.setEnabled(var7);
         this.k.setEnabled(var7);
      } else {
         this.g.setEnabled(false);
         this.i.setEnabled(false);
         this.j.setEnabled(false);
         this.k.setEnabled(false);
         this.h.setEnabled(false);
      }

   }

   private boolean isAddEnabled(int var1) {
      return var1 == 69 || var1 == 70;
   }

   private boolean isRemoveEditEnabled(int var1) {
      return var1 == 70;
   }

   private boolean validateName(String var1, SorterElement var2) {
      Window var3 = SwingUtils.findWindow((Container)this.i);
      if(var2.getId() == 70) {
         var2 = (SorterElement)var2.getParent();
      }

      if(var2.getFirstIndexOfName(var1) != -1) {
         DialogUtils.showErrorDialog(var3, b("W\u00056\u0014\u001cjH!\t\u0001k\u0018f\u001a\u0002l\r\'\u001f\u0017>\r>\u0012\u001dj\u001bg"));
         return false;
      } else if(var1.equals("")) {
         DialogUtils.showErrorDialog(var3, b("W\u00056\u0014\u001cjH!\t\u0001k\u0018f\u0015\u000fs\rf\u0016\u000fgH(\u0014\u001a>\n#[\u000bs\u00182\u0002O"));
         return false;
      } else {
         return true;
      }
   }

   static SorterTree access$000(SorterGUIObject var0) {
      return var0.l;
   }

   static void access$100(SorterGUIObject var0) {
      var0.updateTreeAndButtons();
   }

   static boolean access$200(SorterGUIObject var0, String var1, SorterElement var2) {
      return var0.validateName(var1, var2);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 30;
            break;
         case 1:
            var10003 = 104;
            break;
         case 2:
            var10003 = 70;
            break;
         case 3:
            var10003 = 123;
            break;
         default:
            var10003 = 110;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
