package jindent.commander;

import com.l2fprod.common.swing.JButtonBar;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import jindent.AboutInfo;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.JindentSystem;
import jindent.SettingsUtils;
import jindent.SettingsVersionException;
import jindent.commander.AboutDialog;
import jindent.commander.FileEntry;
import jindent.commander.FileTree;
import jindent.commander.FileTreeModel;
import jindent.commander.FileTreeSelector;
import jindent.commander.InstrumentedSourceTargetTextPane;
import jindent.commander.InstrumentedSourceTextPane;
import jindent.commander.JindentProject;
import jindent.commander.b;
import jindent.commander.ba;
import jindent.commander.bb;
import jindent.commander.bc;
import jindent.commander.bd;
import jindent.commander.be;
import jindent.commander.bg;
import jindent.commander.bs;
import jindent.commander.bt;
import jindent.commander.bu;
import jindent.commander.bv;
import jindent.commander.e;
import jindent.commander.f;
import jindent.commander.h;
import jindent.commander.i;
import jindent.commander.j;
import jindent.commander.k;
import jindent.commander.l;
import jindent.commander.m;
import jindent.commander.n;
import jindent.commander.o;
import jindent.commander.p;
import jindent.commander.q;
import jindent.commander.r;
import jindent.commander.s;
import jindent.commander.t;
import jindent.commander.u;
import jindent.commander.v;
import jindent.commander.w;
import jindent.commander.x;
import jindent.commander.y;
import jindent.commander.z;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerPanel;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.xml.CustomizerDataFactory;
import jindent.imports.SettingsImportFactory;
import jindent.plugin.report.ReportListPanel;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class CommanderFrame extends JFrame implements ChangeListener, CustomizerEventListener {
   public static final String COMMANDER_NAME = "Jindent Commander";
   public static final String COMMANDER_VERSION = "2.04";
   public static final String COMMANDER_RELEASE_DATE = "2005-08-29";
   public static final String DEFAULT_EXPORT_SETTINGS_FILENAME = "ExportedSettings.xjs";
   public static final String DEFAULT_NEW_PROJECT_FILENAME = "untitled";
   public static boolean SHOW_WELCOME_SCREEN = false;
   private JMenuBar a = new JMenuBar();
   private JToolBar b = new JToolBar();
   private JPanel c = new JPanel();
   private JPanel d = new JPanel();
   private JButtonBar e = new JButtonBar();
   private CardLayout f = new CardLayout();
   private JToggleButton g = new JToggleButton();
   private JToggleButton h = new JToggleButton();
   private JToggleButton i = new JToggleButton();
   private JToggleButton j = new JToggleButton();
   private JButton k = new JButton();
   private JToggleButton l = new JToggleButton();
   private ReportListPanel m = new ReportListPanel();
   private JToolBar n = new JToolBar();
   private JToggleButton o = new JToggleButton();
   private JTextField p = new JTextField();
   private JScrollPane q = new JScrollPane();
   private JPanel r = new JPanel();
   private JPanel s = new JPanel();
   private JPanel t = new JPanel();
   private JPanel u = new JPanel();
   private JPanel v = new JPanel();
   private JPanel w = new JPanel();
   private JPanel x = new JPanel();
   private JMenuItem y = new JMenuItem();
   private JMenuItem z = new JMenuItem();
   private JMenuItem A = new JMenuItem();
   private JMenuItem B = new JMenuItem();
   private JMenuItem C = new JMenuItem();
   private JMenuItem D = new JMenuItem();
   private JMenuItem E = new JMenuItem();
   private JMenuItem F = new JMenuItem();
   private JMenuItem G = new JMenuItem();
   private JMenu H = new JMenu();
   private JMenu I = new JMenu();
   private JLabel J = new JLabel();
   private JLabel K = new JLabel();
   private JLabel L = new JLabel();
   private JLabel M = new JLabel();
   private JComboBox N = new JComboBox();
   private JMenuItem O = new JMenuItem();
   private JButton P = new JButton();
   private JButton Q = new JButton();
   private JButton R = new JButton();
   private JButton S = new JButton();
   private JButton T = new JButton();
   private JButton U = new JButton();
   private InstrumentedSourceTextPane V = new InstrumentedSourceTextPane();
   private InstrumentedSourceTargetTextPane W = new InstrumentedSourceTargetTextPane();
   private GridBagLayout X = new GridBagLayout();
   private JSplitPane Y = new JSplitPane();
   private JSplitPane Z = new JSplitPane();
   private JSplitPane ba = new JSplitPane();
   private FileTreeSelector bb = new FileTreeSelector();
   private bg bc = new bg();
   private jindent.plugin.b.a.a bd = new jindent.plugin.b.a.a();
   private CardLayout be = new CardLayout();
   private ButtonGroup bf = new ButtonGroup();
   private String bg = "Jindent Commander";
   private String bh = "untitled";
   private String bi = "ExportedSettings.xjs";
   private final int bj = 4;
   private boolean bk = false;
   private AboutDialog bl;
   private jindent.plugin.b.e bm;
   private CustomizerData bn;
   private CustomizerPanel bo;
   private JindentProject bp;
   private SourcePreviewPane bq;
   private String br;
   private boolean bs;
   private GridBagLayout bt = new GridBagLayout();
   private JPanel bu = new JPanel();
   private JMenu bv = new JMenu();
   private JMenuItem bw = new JMenuItem();

   public CommanderFrame() throws HeadlessException {
      this.setTitle(this.bg);
      this.setIconImage(SwingUtils.readImageIcon(g("8o=iq&3,6#l71\u0007$f4(9)m<7v7g>")).getImage());

      try {
         this.p();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      JList var1 = this.bb.c();
      var1.addMouseListener(new jindent.commander.a(this, (bs)null));
      FileTree var2 = this.bb.b();
      var2.addMouseListener(new b(this, (bs)null));
      this.addWindowListener(new f(this, (bs)null));
      FileTreeModel var3 = (FileTreeModel)var2.getModel();
      var3.a((ChangeListener)this);
      this.bn = CustomizerDataFactory.newCustomizerDataInstance(1);
      this.bo = new CustomizerPanel(this.bn);
      this.bq = new SourcePreviewPane(this.bn);
      this.bn.getEventHandler().addEventListener(this);
      this.Y.add(this.bo, g("}65"));
      this.Y.add(this.bq, g("k61,(d"));
      JindentProject var4 = new JindentProject();
      var4.setJindentSettings(JindentSystem.getDefaultJindentSettings());
      this.a(var4, true);
      this.d(this.bh);
      this.f.show(this.d, g("O\u0010\t\u001d\u0014"));
      this.bd.setOutputVisible(false);
      this.V.f();
      this.W.b().f();
      this.W.c().f();
      this.N.insertItemAt(g("#wo"), 0);
      this.N.insertItemAt(g("#w/91huov4x5/"), 0);
      this.bm = new jindent.plugin.b.e(this);
   }

   public void a() {
      this.K.setText(" ");
   }

   public void a(String var1) {
      bs var2 = new bs(this, var1);
      var2.start();
   }

   private void b(String var1) {
      try {
         XMLDecoder var2 = new XMLDecoder(new BufferedInputStream(new FileInputStream(var1)));
         JindentProject var3 = (JindentProject)var2.readObject();
         var2.close();
         this.a(var3, false);
         this.d(var1);
      } catch (FileNotFoundException var4) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), g("Y+*2\"j-e>.e<ez") + var1 + g("+y+73)?*-)mw"));
      } catch (Exception var5) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), g("Y+*2\"j-e>.e<ez") + var1 + g("+y-94)8+x.g/$4.my#75d81bM") + var5.getMessage());
      }

   }

   public void b() {
      this.o.setSelected(false);
      this.O.setEnabled(true);
      this.bk = false;
   }

   private void a(JindentProject var1) {
      FileTreeModel var2 = (FileTreeModel)this.bb.b().getModel();
      var1.setFileEntries(var2.h());
      var1.setJindentSettings(this.bn.getConnectedJindentSettings());
      var1.setFilterMask(var2.d());
      var1.setFilterEnabled(var2.g());
      var1.setCopyResources(this.l.isSelected());
      var1.setTargetDirEnabled(this.i.isSelected());
      var1.setTargetDirPath(this.p.getText());
      var1.setFrameBounds(this.getBounds());
   }

   private AboutDialog c() {
      return this.bl;
   }

   private String d() {
      return this.bi;
   }

   public CardLayout e() {
      return this.be;
   }

   public JPanel f() {
      return this.x;
   }

   public InstrumentedSourceTextPane g() {
      return this.V;
   }

   public jindent.plugin.b.a.a h() {
      return this.bd;
   }

   public String i() {
      return this.br;
   }

   public ReportListPanel j() {
      return this.m;
   }

   public InstrumentedSourceTargetTextPane k() {
      return this.W;
   }

   public boolean l() {
      return this.bs;
   }

   public void a(AboutDialog var1) {
      this.bl = var1;
   }

   private void c(String var1) {
      this.bi = var1;
   }

   public void a(JindentProject var1, boolean var2) {
      if(var1 != null) {
         this.bp = var1;
         FileTreeModel var3 = (FileTreeModel)this.bb.b().getModel();
         var3.a(var1.getFileEntries());
         var3.b(var1.getFilterMask());
         var3.a(var1.isFilterEnabled());
         this.bn.getEventHandler().setBlockEvents(true);
         this.bn.connectSettings(var1.getJindentSettings());
         this.bn.getEventHandler().setBlockEvents(false);
         this.l.setSelected(var1.isCopyResources());
         this.p.setText(var1.getTargetDirPath());
         this.p.setToolTipText(var1.getTargetDirPath());
         this.i.setSelected(var1.isTargetDirEnabled());
         this.J.setEnabled(var1.isTargetDirEnabled());
         this.p.setEnabled(var1.isTargetDirEnabled());
         this.U.setEnabled(var1.isTargetDirEnabled());
         this.l.setEnabled(var1.isTargetDirEnabled());
         this.j.setSelected(var1.isFilterEnabled());
         this.N.setSelectedItem(var1.getFilterMask());
         this.N.setEnabled(var1.isFilterEnabled());
         if(!var2) {
            this.a(var1.getFrameBounds());
         }

         this.a(false);
         File[] var4 = var3.a();
         if(var4 != null) {
            DialogUtils.removedFilesWarning(var4, this);
            this.repaint();
         }

      }
   }

   private void a(Rectangle var1) {
      Dimension var2 = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension var3 = var1.getSize();
      if(var3.height > var2.height) {
         var3.height = var2.height;
      }

      if(var3.width > var2.width) {
         var3.width = var2.width;
      }

      this.setLocation((var2.width - var3.width) / 2, (var2.height - var3.height) / 2);
   }

   private void a(boolean var1) {
      if(!var1) {
         FileTreeModel var2 = (FileTreeModel)this.bb.b().getModel();
         var2.b(false);
         this.bn.setChanged(false);
      }

      this.bs = var1;
      this.d(this.i());
   }

   public void d(String var1) {
      this.br = var1;
      this.setTitle(this.bg + g(")te\u0003") + var1 + (this.l()?"*":"") + "]");
   }

   private void a(ActionEvent var1) {
      if(SHOW_WELCOME_SCREEN) {
         this.bl.b().setVisible(true);
         this.bl.setUndecorated(false);
      } else {
         SwingUtils.centerWindow(this.bl);
      }

      this.bl.setVisible(true);
   }

   private void a(File var1, File var2, boolean var3) {
      File[] var4 = var1.listFiles(this.bc);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         File var6 = var4[var5];
         if(var6.isDirectory() && var3) {
            this.a(var6, var2, var3);
         }

         if(var6.isFile()) {
            this.a(var6, var2);
         }
      }

   }

   private void a(File var1, File var2) {
      JindentSettings var3 = this.bp.getJindentSettings();
      if(this.bp.isTargetDirEnabled()) {
         jindent.plugin.b.c.c var4 = new jindent.plugin.b.c.c(var1, new jindent.plugin.b.b.a(var1, this, 1));
         String var5 = this.bp.getTargetDirPath();
         String var6 = var2 != null?var5 + var1.getAbsolutePath().substring(var2.getAbsolutePath().length()):var5 + var1.getAbsolutePath();
         File var7 = new File(var6);
         jindent.plugin.b.c.a var8 = new jindent.plugin.b.c.a(var7, new jindent.plugin.b.b.a(var7, this, 2));
         jindent.plugin.b.d.b var9 = new jindent.plugin.b.d.b(var4, var8, this.bp.isCopyResources());
         this.bm.addCommand(var9);
      } else {
         jindent.plugin.b.c.b var10 = new jindent.plugin.b.c.b(var1, new jindent.plugin.b.b.a(var1, this, 0));
         jindent.plugin.b.d.a var11 = new jindent.plugin.b.d.a(var10);
         this.bm.addCommand(var11);
      }

   }

   private void m() {
      String var1 = this.p.getText();
      File var2 = new File(var1);
      JFileChooser var3 = SwingUtils.getDirChooser();
      if(var2.exists() && var2.isDirectory()) {
         var3.setSelectedFile(var2);
      }

      int var4 = var3.showDialog(this, g("J1*74l"));
      if(var4 == 0) {
         File var5 = var3.getSelectedFile();
         this.p.setText(var5.getAbsolutePath());
         this.p.setToolTipText(var5.getAbsolutePath());
         this.a(true);
      }

   }

   private void b(ActionEvent var1) {
      this.m();
   }

   private Border n() {
      return BorderFactory.createEmptyBorder(4, 4, 4, 4);
   }

   private void c(ActionEvent var1) {
      boolean var2 = this.l.isSelected();
      this.bp.setCopyResources(var2);
      this.a(true);
   }

   private void d(ActionEvent var1) {
      this.bb.b().c();
      FileTreeModel var2 = (FileTreeModel)this.bb.b().getModel();
      var2.e();
   }

   private void e(ActionEvent var1) {
      boolean var2 = this.j.isSelected();
      FileTreeModel var3 = (FileTreeModel)this.bb.b().getModel();
      var3.a(var2);
      this.N.setEnabled(var2);
      this.a(true);
   }

   private void f(ActionEvent var1) {
      boolean var2 = this.i.isSelected();
      this.p.setEnabled(var2);
      this.U.setEnabled(var2);
      this.l.setEnabled(var2);
      this.J.setEnabled(var2);
      if(var2 && this.p.getText().equals("")) {
         this.m();
      }

      this.a(true);
   }

   private void o() {
      if(this.l()) {
         int var1 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), g("X,,,gh7!x#`*&95my064h/ <gj1$6 l*z"));
         if(var1 == 2) {
            return;
         }
      }

      this.dispose();
      System.exit(-1);
   }

   private void g(ActionEvent var1) {
      JFileChooser var2 = SwingUtils.getSaveSettingsFileChooser();
      JindentSettings var3 = this.bn.getConnectedJindentSettings();
      File var4 = var2.getCurrentDirectory();
      File var5;
      if(this.bi.equals("ExportedSettings.xjs")) {
         var5 = new File(var4.getName(), SettingsUtils.createFilenameFromSettings(var3));
      } else {
         var5 = new File(var4.getName(), this.bi);
      }

      var2.setSelectedFile(var5);
      if(0 == var2.showSaveDialog(this)) {
         String var6 = var2.getSelectedFile().getPath();
         this.a(var6, var3);
      }

   }

   private void a(String var1, JindentSettings var2) {
      bt var3 = new bt(this, var1, var2);
      var3.start();
   }

   private void b(String var1, JindentSettings var2) {
      if((new File(var1)).exists()) {
         int var3 = DialogUtils.showQuestionDialog(this, g("[<54&j<e>.e<e") + var1 + g(")f"));
         if(var3 == 2) {
            return;
         }
      }

      try {
         var2.writeToFile(var1);
         this.c(var1);
      } catch (JindentException var4) {
         DialogUtils.showErrorDialog(this, var4.getMessage());
      }

   }

   private void h(ActionEvent var1) {
      this.f.show(this.d, g("O\u0010\t\u001d\u0014"));
   }

   private void a(ItemEvent var1) {
      FileTreeModel var2 = (FileTreeModel)this.bb.b().getModel();
      var2.b((String)this.N.getSelectedItem());
      this.a(true);
   }

   private void i(ActionEvent var1) {
      JFileChooser var2 = SwingUtils.getOpenSettingsFileChooser();
      if(this.bn.isChanged()) {
         int var3 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), g("F) 6ghy+=0)?,4\")8+<gm06;&{=e-)z83=#):-9)n<6g"));
         if(var3 == 2) {
            return;
         }
      }

      if(var2.showOpenDialog(SwingUtils.findWindow((Container)this)) == 0) {
         String var4 = var2.getSelectedFile().getPath();
         this.e(var4);
      }

   }

   private void e(String var1) {
      bv var2 = new bv(this, var1);
      var2.start();
   }

   private void f(String var1) {
      JindentSettings var2 = null;

      try {
         var2 = JindentSettings.createFromFileAndCheckVersion(var1);
      } catch (FileNotFoundException var7) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), var7.getMessage());
      } catch (JindentException var8) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), var8.getMessage());
      } catch (SettingsVersionException var9) {
         SettingsVersionException var3 = var9;
         int var4 = DialogUtils.showImportDialog(SwingUtils.findWindow((Container)this), var9);
         if(var4 == 0) {
            try {
               var2 = SettingsImportFactory.importFrom(var3);
            } catch (JindentException var6) {
               DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), var6.getMessage());
            }
         }
      }

      if(var2 != null) {
         this.bn.getEventHandler().setBlockEvents(true);
         this.bn.connectSettings(var2);
         this.bn.updateGUI();
         this.bn.getEventHandler().setBlockEvents(false);
         this.bn.getEventHandler().fireEvent(new CustomizerEvent(this, 2, (Object)null));
         this.bn.setChanged(true);
         this.c(var1);
         this.a(true);
      }

   }

   private void p() throws Exception {
      this.b.setBorder(this.n());
      this.b.setLayout(this.bt);
      this.b.add(this.T, new GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.S, new GridBagConstraints(1, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.Q, new GridBagConstraints(2, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.R, new GridBagConstraints(3, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.o, new GridBagConstraints(4, 0, 1, 1, 0.0D, 0.0D, 17, 3, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.P, new GridBagConstraints(5, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.b.add(this.bu, new GridBagConstraints(6, 0, 1, 1, 1.0D, 0.0D, 10, 2, new Insets(0, 0, 0, 0), 0, 0));
      this.R.setToolTipText(g("Z83=gY+*2\"j-e\u00194\'wk"));
      this.R.setFocusPainted(false);
      this.R.setIcon(SwingUtils.readImageIcon(g(";m=js&*$.\"V86v7g>")));
      this.R.setText("");
      this.R.addActionListener(new z(this));
      this.Q.setToolTipText(g("Z83=gY+*2\"j-"));
      this.Q.setFocusPainted(false);
      this.Q.setIcon(SwingUtils.readImageIcon(g(";m=js&=,+,V;)-\"\')+?")));
      this.Q.setText("");
      this.Q.addActionListener(new ba(this));
      this.S.setToolTipText(g("F) 6gY+*2\"j-kvi"));
      this.S.setFocusPainted(false);
      this.S.setIcon(SwingUtils.readImageIcon(g(";m=js&?*4#l+k()n")));
      this.S.setText("");
      this.S.addActionListener(new bb(this));
      this.o.setToolTipText(g("Z-$*3)\u001f***h-11)n"));
      this.o.setFocusPainted(false);
      this.o.setIcon(SwingUtils.readImageIcon(g(";m=js&4 <.h\u000654&p\u0006\"*\"l7k()n")));
      this.o.setText("");
      this.o.addActionListener(new bc(this));
      this.P.setToolTipText(g("Z-*(gO675&}-,6 "));
      this.P.setFocusPainted(false);
      this.P.setIcon(SwingUtils.readImageIcon(g(";m=js&4 <.h\u00066,(y\u00067=#\')+?")));
      this.P.setText("");
      this.P.addActionListener(new bd(this));
      this.T.setToolTipText(g("G<2x\u0017{6/=$}"));
      this.T.setFocusPainted(false);
      this.T.setIcon(SwingUtils.readImageIcon(g(";m=js&=*;2d<+,\u0018g<2v7g>")));
      this.T.setText("");
      this.T.addActionListener(new be(this));
      this.G.addActionListener(new h(this));
      this.y.addActionListener(new i(this));
      this.O.addActionListener(new j(this));
      this.B.addActionListener(new k(this));
      this.F.addActionListener(new l(this));
      this.E.addActionListener(new m(this));
      this.A.addActionListener(new n(this));
      this.z.addActionListener(new o(this));
      this.C.addActionListener(new p(this));
      this.D.addActionListener(new q(this));
      this.k.setToolTipText(g("[<#*\"z1e>.e<e+>z- 5"));
      this.k.setIcon(SwingUtils.readImageIcon(g("8o=iq&+ >5l*-v7g>")));
      this.k.setText("");
      this.k.setRequestFocusEnabled(true);
      this.k.setFocusPainted(false);
      this.k.setPreferredSize(new Dimension(24, 24));
      this.k.addActionListener(new r(this));
      this.j.setToolTipText(g("O0)=go0),\"{"));
      this.j.setIcon(SwingUtils.readImageIcon(g("8o=iq&?,4\"V?,43l+k()n")));
      this.j.setText("");
      this.j.setRequestFocusEnabled(true);
      this.j.setFocusPainted(false);
      this.j.setPreferredSize(new Dimension(24, 24));
      this.j.addActionListener(new s(this));
      this.N.setEditable(true);
      this.N.addItemListener(new t(this));
      this.i.setToolTipText(g("L7$:+ly195n<1x#`+ ;3f+<x*f= "));
      this.i.setIcon(SwingUtils.readImageIcon(g("8o=iq&?*4#l+\u001a1)}6k()n")));
      this.i.setFocusPainted(false);
      this.i.setText("");
      this.i.setPreferredSize(new Dimension(24, 24));
      this.i.addActionListener(new u(this));
      this.p.setColumns(15);
      this.p.setText("");
      this.U.setEnabled(false);
      this.U.setFocusPainted(false);
      this.U.setMargin(new Insets(2, 2, 2, 2));
      this.U.setText(g("\'wk"));
      this.U.setPreferredSize(new Dimension(24, 24));
      this.U.addActionListener(new v(this));
      this.l.setToolTipText(g("J65!g|7#75d819%e<e*\"z60*$l*e,()-$* l-e4(j811(g"));
      this.l.setIcon(SwingUtils.readImageIcon(g("8o=iq&:*(>\')+?")));
      this.l.setText("");
      this.l.setFocusPainted(false);
      this.l.setPreferredSize(new Dimension(24, 24));
      this.l.addActionListener(new w(this));
      this.n.setLayout(this.X);
      this.n.add(this.i, new GridBagConstraints(3, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.p, new GridBagConstraints(4, 0, 1, 1, 1.0D, 0.0D, 17, 2, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.U, new GridBagConstraints(5, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.l, new GridBagConstraints(6, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.k, new GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.j, new GridBagConstraints(1, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.n.add(this.N, new GridBagConstraints(2, 0, 1, 1, 0.0D, 0.0D, 17, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.w.setLayout(new BorderLayout());
      this.w.add(this.bb, g("J<+,\"{"));
      this.w.add(this.n, g("G67,/"));
      this.x.setLayout(this.be);
      this.x.add(this.V, g("Y\u0015\u0010\u001f\u000eG\u0006\u0003\u0011\u000bL"));
      this.x.add(this.W, g("Z\u0016\u0010\n\u0004L\u0006\u0011\u0019\u0015N\u001c\u0011\u0007\u0001@\u0015\u0000"));
      this.M.setText(g("Y+ ..l."));
      this.M.setBorder(this.n());
      this.u.setLayout(new BorderLayout());
      this.u.add(this.M, g("G67,/"));
      this.u.add(this.x, g("J<+,\"{"));
      this.q.setViewportView(this.m);
      this.L.setText(g("[<575}*"));
      this.L.setBorder(this.n());
      this.t.setLayout(new BorderLayout());
      this.t.add(this.L, g("G67,/"));
      this.t.add(this.q, g("J<+,\"{"));
      this.ba.setOrientation(0);
      this.ba.add(this.u, g("}65"));
      this.ba.add(this.t, g("k61,(d"));
      this.Z.setOrientation(0);
      this.Z.add(this.w, g("}65"));
      this.Z.add(this.ba, g("k61,(d"));
      this.v.setLayout(new BorderLayout());
      this.v.add(this.Z, g("J<+,\"{"));
      this.Y.setOrientation(0);
      this.Y.setResizeWeight(0.5D);
      this.s.setLayout(new BorderLayout());
      this.s.add(this.Y, g("J<+,\"{"));
      this.d.setLayout(this.f);
      this.d.add(this.s, g("Z\u001c\u0011\f\u000eG\u001e\u0016"));
      this.d.add(this.v, g("O\u0010\t\u001d\u0014"));
      this.g.setRequestFocusEnabled(false);
      this.g.setIcon(SwingUtils.readImageIcon(g(":k=ku&=*;2d<+,4\')+?")));
      this.g.setSelected(true);
      this.g.setText(g("O0)=4"));
      this.g.addActionListener(new x(this));
      this.h.setRequestFocusEnabled(false);
      this.h.setIcon(SwingUtils.readImageIcon(g(":k=ku&)7=!l+ 6$l*k()n")));
      this.h.setText(g("Z<1,.g>6"));
      this.h.addActionListener(new y(this));
      this.e.setBackground(this.a.getBackground());
      this.e.setBorder(BorderFactory.createLoweredBevelBorder());
      this.e.setOrientation(1);
      this.e.add(this.g, (Object)null);
      this.e.add(this.h, (Object)null);
      this.bf.add(this.h);
      this.bf.add(this.g);
      this.c.setLayout(new BorderLayout());
      this.c.add(this.e, g("^<6,"));
      this.c.add(this.d, g("J<+,\"{"));
      this.c.add(this.bd.a(), g("Z60,/"));
      this.K.setText(" ");
      this.K.setBorder(this.n());
      this.r.setLayout(new BorderLayout());
      this.r.setBorder(BorderFactory.createBevelBorder(1));
      this.r.add(this.K, g("J<+,\"{"));
      this.getContentPane().setLayout(new BorderLayout());
      this.getContentPane().add(this.b, g("G67,/"));
      this.getContentPane().add(this.c, g("J<+,\"{"));
      this.getContentPane().add(this.r, g("Z60,/"));
      this.I.setText(g("O0)="));
      this.D.setText(g("G<2"));
      this.D.setIcon(SwingUtils.readImageIcon(g("8o=iq&=*;2d<+,\u0018g<2v7g>")));
      this.C.setText(g("F) 6i\'w"));
      this.C.setIcon(SwingUtils.readImageIcon(g("8o=iq&?*4#l+k()n")));
      this.z.setText(g("Z83="));
      this.z.setIcon(SwingUtils.readImageIcon(g("8o=iq&=,+,V;)-\"\')+?")));
      this.A.setText(g("Z83=gH*kvi"));
      this.A.setIcon(SwingUtils.readImageIcon(g("8o=iq&=,+,V;)-\"V.,6#f.k()n")));
      this.E.setText(g("@4575}y\u0016=3}0+?4\'wk"));
      this.E.setIcon(SwingUtils.readImageIcon(g("8o=iq&0((({-wv7g>")));
      this.F.setText(g("L!575}y\u0016=3}0+?4\'wk"));
      this.F.setIcon(SwingUtils.readImageIcon(g("8o=iq&<=(({-wv7g>")));
      this.B.setText(g("X,,,"));
      this.B.setIcon(SwingUtils.readImageIcon(g("8o=iq&<=13\')+?")));
      this.H.setText(g("C0+<\"g-"));
      this.O.setText(g("Z-$*3)\u001f***h-11)n"));
      this.O.setIcon(SwingUtils.readImageIcon(g("8o=iq&4 <.h\u000654&p\u0006\"*\"l7k()n")));
      this.y.setText(g("Z-*(gO675&}-,6 "));
      this.y.setIcon(SwingUtils.readImageIcon(g("8o=iq&4 <.h\u00066,(y\u00067=#\')+?")));
      this.bv.setText(g("A<)("));
      this.bw.setText(g("A<)(g]651$z"));
      this.bw.setIcon(SwingUtils.readImageIcon(g("8o=iq&1 47\')+?")));
      this.G.setText(g("H;*-3\'wk"));
      this.G.setIcon(SwingUtils.readImageIcon(g("8o=iq&8\'72}w56 ")));
      this.I.add(this.D);
      this.I.add(this.C);
      this.I.add(this.z);
      this.I.add(this.A);
      this.I.addSeparator();
      this.I.add(this.E);
      this.I.add(this.F);
      this.I.addSeparator();
      this.I.add(this.B);
      this.H.add(this.O);
      this.H.add(this.y);
      this.bv.add(this.bw);
      this.bv.addSeparator();
      this.bv.add(this.G);
      HelpUtils.addHelp(this.bw, this);
      this.a.add(this.I);
      this.a.add(this.H);
      this.a.add(this.bv);
      this.setJMenuBar(this.a);
      this.setDefaultCloseOperation(0);
      this.addWindowListener(new e(this));
   }

   private void j(ActionEvent var1) {
      this.k(var1);
   }

   private void k(ActionEvent var1) {
      if(this.l()) {
         int var2 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), g("J+ 93ly$x)l.e(5f3 ;3)8+<gm06;&{=e-)z83=#):-9)n<6g"));
         if(var2 == 2) {
            return;
         }
      }

      this.bp = new JindentProject();
      this.bp.setJindentSettings(JindentSystem.getDefaultJindentSettings());
      this.a(this.bp, true);
      this.d("untitled");
   }

   private void l(ActionEvent var1) {
      this.m(var1);
   }

   private void m(ActionEvent var1) {
      if(this.l()) {
         int var2 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), g("F) 6ghy5*(c<&,gh7!x#`*&95my064h/ <gj1$6 l*z"));
         if(var2 == 2) {
            return;
         }
      }

      JFileChooser var4 = SwingUtils.getOpenProjectFileChooser();
      if(var4.showOpenDialog(SwingUtils.findWindow((Container)this)) == 0) {
         String var3 = var4.getSelectedFile().getPath();
         this.a(var3);
         this.d(var3);
      }

   }

   private void n(ActionEvent var1) {
      this.o();
   }

   private void o(ActionEvent var1) {
      this.q(var1);
   }

   private void p(ActionEvent var1) {
      this.r(var1);
   }

   public void a(String var1, JindentProject var2) {
      bu var3 = new bu(this, var1, var2);
      var3.start();
   }

   private void b(String var1, JindentProject var2) {
      this.a(var2);

      try {
         XMLEncoder var3 = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(var1)));
         SettingsUtils.initXMLEncoder(var3);
         var3.writeObject(var2);
         var3.close();
      } catch (FileNotFoundException var4) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), g("O0)=gg61x!f,+<i"));
      } catch (Exception var5) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this), var5.getMessage());
      }

      this.a(false);
   }

   private void q(ActionEvent var1) {
      JFileChooser var2 = SwingUtils.getSaveProjectFileChooser();
      if(!this.i().equals(this.bh)) {
         var2.setSelectedFile(new File(this.i()));
      }

      if(var2.showSaveDialog(SwingUtils.findWindow((Container)this)) == 0) {
         String var3 = var2.getSelectedFile().getPath();
         if(!var3.endsWith(g("\'!/("))) {
            var3 = var3 + g("\'!/(");
         }

         if((new File(var3)).exists()) {
            int var4 = DialogUtils.showQuestionDialog(this, g("[<54&j<e>.e<e") + var3 + g(")f"));
            if(var4 == 2) {
               return;
            }
         }

         this.a(var3, this.bp);
         this.d(var3);
      }

   }

   private void r(ActionEvent var1) {
      if(this.i().equals(this.bh)) {
         this.q((ActionEvent)null);
      } else {
         this.a(this.i(), this.bp);
      }

   }

   private void s(ActionEvent var1) {
      this.f.show(this.d, g("Z\u001c\u0011\f\u000eG\u001e\u0016"));
   }

   private void q() {
      if(!this.bk) {
         this.bk = true;
         this.o.setSelected(true);
         this.O.setEnabled(false);
         this.a(this.bp);
         this.bc.a(this.bp.getFilterMask());
         this.bc.a(this.bp.isFilterEnabled());
         this.bm.setJindentSettings(this.bn.getConnectedJindentSettings());
         this.K.setText(g("J6)4\"j-,6 )\u001f,4\"zwkv"));
         this.setCursor(Cursor.getPredefinedCursor(3));
         FileEntry[] var1 = this.bp.getFileEntries();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if(var1[var2] != null) {
               File var3 = var1[var2].getFile();
               if(this.bc.accept(var3)) {
                  File var4 = var3.getParentFile();
                  if(var3.isDirectory()) {
                     this.a(var3, var4, var1[var2].isRecursive());
                  } else {
                     this.a(var3, var4);
                  }
               }
            }
         }

         this.K.setText(g("O675&}-,6 )\u001f,4\"zwkv"));
         this.setCursor(Cursor.getDefaultCursor());
         if(this.bm.getCommandCount() == 0) {
            DialogUtils.showInfoDialog(this, g("G610.g>e<()-*yMY5 94ly6=+l:1x4f4 x!`5 +gf+e<.{<&,({0 +gk<#75ly6,&{-,6 )?***h-11)nw"));
         }

         this.bm.start();
         this.a();
      }
   }

   private void t(ActionEvent var1) {
      this.q();
   }

   private void u(ActionEvent var1) {
      this.q();
   }

   private void v(ActionEvent var1) {
      this.bm.stop();
   }

   private void w(ActionEvent var1) {
      this.v(var1);
   }

   public void stateChanged(ChangeEvent var1) {
      if(!this.l()) {
         FileTreeModel var2 = (FileTreeModel)var1.getSource();
         if(var2.j()) {
            this.a(true);
         }

      }
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(!this.l()) {
         if(var1.getID() == 0) {
            this.a(true);
         }

      }
   }

   static void a(CommanderFrame var0, String var1) {
      var0.b(var1);
   }

   static void a(CommanderFrame var0, String var1, JindentSettings var2) {
      var0.b(var1, var2);
   }

   static void b(CommanderFrame var0, String var1) {
      var0.f(var1);
   }

   static void a(CommanderFrame var0, ActionEvent var1) {
      var0.q(var1);
   }

   static void b(CommanderFrame var0, ActionEvent var1) {
      var0.r(var1);
   }

   static void c(CommanderFrame var0, ActionEvent var1) {
      var0.m(var1);
   }

   static void d(CommanderFrame var0, ActionEvent var1) {
      var0.t(var1);
   }

   static void e(CommanderFrame var0, ActionEvent var1) {
      var0.v(var1);
   }

   static void f(CommanderFrame var0, ActionEvent var1) {
      var0.k(var1);
   }

   static void g(CommanderFrame var0, ActionEvent var1) {
      var0.a(var1);
   }

   static void h(CommanderFrame var0, ActionEvent var1) {
      var0.w(var1);
   }

   static void i(CommanderFrame var0, ActionEvent var1) {
      var0.u(var1);
   }

   static void j(CommanderFrame var0, ActionEvent var1) {
      var0.n(var1);
   }

   static void k(CommanderFrame var0, ActionEvent var1) {
      var0.g(var1);
   }

   static void l(CommanderFrame var0, ActionEvent var1) {
      var0.i(var1);
   }

   static void m(CommanderFrame var0, ActionEvent var1) {
      var0.o(var1);
   }

   static void n(CommanderFrame var0, ActionEvent var1) {
      var0.p(var1);
   }

   static void o(CommanderFrame var0, ActionEvent var1) {
      var0.l(var1);
   }

   static void p(CommanderFrame var0, ActionEvent var1) {
      var0.j(var1);
   }

   static void q(CommanderFrame var0, ActionEvent var1) {
      var0.d(var1);
   }

   static void r(CommanderFrame var0, ActionEvent var1) {
      var0.e(var1);
   }

   static void a(CommanderFrame var0, ItemEvent var1) {
      var0.a(var1);
   }

   static void s(CommanderFrame var0, ActionEvent var1) {
      var0.f(var1);
   }

   static void t(CommanderFrame var0, ActionEvent var1) {
      var0.b(var1);
   }

   static void u(CommanderFrame var0, ActionEvent var1) {
      var0.c(var1);
   }

   static void v(CommanderFrame var0, ActionEvent var1) {
      var0.h(var1);
   }

   static void w(CommanderFrame var0, ActionEvent var1) {
      var0.s(var1);
   }

   static void a(CommanderFrame var0, String var1, JindentProject var2) {
      var0.b(var1, var2);
   }

   static void a(CommanderFrame var0) {
      var0.o();
   }

   static InstrumentedSourceTextPane b(CommanderFrame var0) {
      return var0.V;
   }

   static {
      JindentSystem.registerAboutInfo(new AboutInfo("Jindent Commander", "2.04", "2005-08-29"));
   }

   private static String g(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 9;
            break;
         case 1:
            var10003 = 89;
            break;
         case 2:
            var10003 = 69;
            break;
         case 3:
            var10003 = 88;
            break;
         default:
            var10003 = 71;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
