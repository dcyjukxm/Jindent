package jindent.customizer.preview;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import jindent.ExtensionManager;
import jindent.JindentSettings;
import jindent.Settings;
import jindent.SettingsUtils;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.preview.PreviewFilterList;
import jindent.customizer.preview.SourcePreviewPane$1;
import jindent.customizer.preview.SourcePreviewPane$10;
import jindent.customizer.preview.SourcePreviewPane$11;
import jindent.customizer.preview.SourcePreviewPane$12;
import jindent.customizer.preview.SourcePreviewPane$13;
import jindent.customizer.preview.SourcePreviewPane$2;
import jindent.customizer.preview.SourcePreviewPane$3;
import jindent.customizer.preview.SourcePreviewPane$4;
import jindent.customizer.preview.SourcePreviewPane$5;
import jindent.customizer.preview.SourcePreviewPane$6;
import jindent.customizer.preview.SourcePreviewPane$7;
import jindent.customizer.preview.SourcePreviewPane$8;
import jindent.customizer.preview.SourcePreviewPane$9;
import jindent.customizer.preview.SourceTextPane;
import jindent.customizer.preview.SourceTextPaneHighlighting;
import jindent.customizer.preview.d.d;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.plugin.report.ReportListPanel;
import jindent.settings.ExtensionManagerSetting;
import jindent.util.IntHashtable;
import jindent.util.Utils;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class SourcePreviewPane extends JPanel {
   private static final int a = 20;
   private static final double b = 0.6666666666666666D;
   private static final int c = 0;
   private static final int d = 1;
   public static final String PREVIEW_ENCODING = "ISO-8859-1";
   public static final int RESOURCE_PREVIEW_MODE = 1;
   public static final int EXTERNAL_PREVIEW_MODE = 2;
   public static final int WIDTH = 400;
   public static final int HEIGHT = 600;
   private static final String e = "6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r";
   private static final int f = 5;
   private static final int g = 40;
   private static final int h = 12;
   private static final String i = "Preview";
   private static final String j = "/previews/Preview";
   private JToolBar k;
   private JButton l;
   private JButton m;
   private JButton n;
   private JToggleButton o;
   private JToggleButton p;
   private JToggleButton q;
   private JButton r;
   private JButton s;
   private IntHashtable t;
   private JScrollPane u;
   private JScrollPane v;
   private SourceTextPane w;
   private SourceTextPane x;
   private JScrollPane y;
   private JSplitPane z;
   private ReportListPanel A;
   private String B = a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r");
   private String C = a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r");
   private PreviewFilterList D = null;
   private float E;
   private JSlider F;
   private CustomizerData G;
   private CustomizerEventListener H;
   private HashMap I;
   private HashMap J;
   private HashMap K;
   private boolean L;
   private int M;
   private boolean N;
   private boolean O;
   private JTabbedPane P;
   protected static final boolean Q = false;
   static Class R;

   public SourcePreviewPane(CustomizerData var1) {
      super(new BorderLayout());
      this.setPreferredSize(new Dimension(400, 600));
      this.G = var1;
      this.K = new HashMap();
      this.M = 1;
      this.N = true;
      this.E = 12.0F;
      this.I = new HashMap();
      this.I.put(a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r"), a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r"));
      this.J = new HashMap();
      this.L = true;
      this.w = new SourceTextPane();
      this.x = new SourceTextPane();
      this.initWidthToSizeTable();
      this.H = new SourcePreviewPane$1(this);
      var1.getEventHandler().addEventListener(this.H);
      this.k = new JToolBar(a("(o\u001a3\"\u001dj_\u0011$\u0017q=$9"));
      this.l = new JButton(SwingUtils.readImageIcon(a("I+\u0007t}Wy\u0010&>\u0015x\u00111\u0014\u0019y\u001bk;\u0016z")));
      this.l.setToolTipText(a("9y\u001be\u0005\u001dj_\u0003\"\u0014x_\u0011$XM\r =\u0011x\be\u0007\u0011n\u000bkeV"));
      this.l.addActionListener(new SourcePreviewPane$2(this));
      this.k.add(this.l);
      this.o = new JToggleButton(SwingUtils.readImageIcon(a("I+\u0007t}Wq\u0016+.\'\u007f\r *\u00133\u0018,-")));
      this.o.setToolTipText(a(",r\u0010\"\'\u001d=),.\u000f=0#k4t\u0011 k:o\u001a$ XN\u0006()\u0017q\f"));
      this.o.addActionListener(new SourcePreviewPane$3(this));
      this.k.add(this.o);
      this.q = new JToggleButton(SwingUtils.readImageIcon(a("I+\u0007t}Wi\u001e\'\u0014\u000bi\u00105e\u001ft\u0019")));
      this.q.setToolTipText(a(",r\u0010\"\'\u001d=),.\u000f=0#k,|\u001de\u0018\fr\u000fe\u0018\u0001p\u001d*\'\u000b"));
      this.q.addActionListener(new SourcePreviewPane$4(this));
      this.q.setSelected(true);
      this.k.add(this.q);
      this.p = new JToggleButton(SwingUtils.readImageIcon(a("I+\u0007t}Wn\u000f$(\u001d3\u0018,-")));
      this.p.setToolTipText(a(",r\u0010\"\'\u001d=),.\u000f=0#k+m\u001e&.XN\u0006()\u0017q\f"));
      this.p.addActionListener(new SourcePreviewPane$5(this));
      this.k.add(this.p);
      this.n = new JButton(SwingUtils.readImageIcon(a("I+\u0007t}Wg\u0010*&\'r\n1e\bs\u0018")));
      this.n.setToolTipText(a("\"r\u0010(k7h\u000be\u001b\nx\t,.\u000f"));
      this.n.addActionListener(new SourcePreviewPane$6(this));
      this.k.add(this.n);
      this.F = new JSlider(0, 5, 40, 12);
      this.F.setToolTipText(a("-n\u001ae\u0018\u0014t\u001b 9XI\u0010e\u0018\u001b|\u0013 k(o\u001a3\"\u001dj"));
      this.F.addChangeListener(new SourcePreviewPane$7(this));
      this.k.add(this.F);
      this.m = new JButton(SwingUtils.readImageIcon(a("I+\u0007t}Wg\u0010*&\'t\u0011k;\u0016z")));
      this.m.setToolTipText(a("\"r\u0010(k1s_\u00159\u001dk\u0016 <"));
      this.m.addActionListener(new SourcePreviewPane$8(this));
      this.k.add(this.m);
      this.s = new JButton(SwingUtils.readImageIcon(a("I+\u0007t}Wk\u0016 <\', te\bs\u0018")));
      this.s.setToolTipText(a("<x\u0019$>\u0014i_\u00159\u001dk\u0016 <XG\u0010*&"));
      this.s.addActionListener(new SourcePreviewPane$9(this));
      this.k.add(this.s);
      this.r = new JButton(SwingUtils.readImageIcon(a("I+\u0007t}W{\u00161\u0014\fr 2\"\u001ci\u0017k,\u0011{")));
      this.r.setToolTipText(a(">t\u000be\u0018\u0017h\r&.X^\u0010!.XJ\u0016!?\u0010=+*k(o\u001a3\"\u001dj_\u0012\"\u0016y\u00102"));
      this.r.addActionListener(new SourcePreviewPane$10(this));
      this.k.add(this.r);
      this.v = new JScrollPane(this.x);
      this.u = new JScrollPane(this.w);
      this.P = new JTabbedPane();
      this.P.addTab(a("7o\u0016\"\"\u0016|\u0013"), SwingUtils.readImageIcon(a("I+\u0007t}Wy\u0010&>\u0015x\u00111\u0014\u0011s\u000b*e\bs\u0018")), this.u);
      this.P.addTab(a(">r\r(*\fi\u001a!"), SwingUtils.readImageIcon(a("I+\u0007t}Wy\u0010&>\u0015x\u00111\u0014\u0017h\u000bk;\u0016z")), this.v);
      this.P.setSelectedIndex(1);
      this.A = new ReportListPanel();
      this.A.setBorder(new TitledBorder(a("5x\f6*\u001fx\f\u007f")));
      this.y = new JScrollPane(this.A);
      this.z = new JSplitPane();
      this.z.setOrientation(0);
      if(this.N) {
         this.z.add(this.P, a("\fr\u000f"));
      } else {
         this.z.add(this.v, a("\fr\u000f"));
      }

      this.z.add(this.y, a("\u001ar\u000b1$\u0015"));
      this.O = false;
      this.add(this.z);
      this.add(this.k, a("6r\r1#"));
      this.x.addMouseListener(new d(this));
      if(this.N) {
         this.w.addMouseListener(new d(this));
      }

      this.k.addMouseListener(new d(this));
      this.updateNoPreview();
      this.addComponentListener(new SourcePreviewPane$11(this));
   }

   private void initWidthToSizeTable() {
      this.t = new IntHashtable();

      for(int var1 = 5; var1 < 40; ++var1) {
         int var2 = (int)SwingUtils.getMaxWidthOfFontSize(this.x.getFont(), (float)var1);
         this.t.a(var2, new Integer(var1));
      }

   }

   private int getSizeFromWidth(float var1) {
      int var2 = (int)Math.floor((double)var1);
      Integer var3 = (Integer)this.t.a(var2);
      if(var3 == null) {
         SourceTextPane var4 = this.getActiveTextPane();
         int var5 = (int)SwingUtils.getMaxWidthOfFontSize(var4.getFont(), 5.0F);
         int var6 = (int)SwingUtils.getMaxWidthOfFontSize(var4.getFont(), 40.0F);
         return var1 < (float)var5?5:(var1 > (float)var6?40:12);
      } else {
         return var3.intValue();
      }
   }

   private void setActiveTextPane(int var1) {
      this.P.setSelectedIndex(var1);
   }

   private SourceTextPane getActiveTextPane() {
      return this.P.getSelectedIndex() == 0?this.w:this.x;
   }

   private void updatePreviewFromTab(CustomizerTabbedPane var1) {
      int var2 = var1.getSelectedIndex();
      var1.getTitleAt(var2);
      String var4 = var1.getPreviewAt(var2);
      PreviewFilterList var5 = var1.getPreviewFilterListAt(var2);
      if(!this.L) {
         if(this.M == 1) {
            if(this.B != null && this.B.equals(var4) && this.D == var5) {
               return;
            }

            this.x.setShowLine(-1);
            if(this.N) {
               this.w.setShowLine(-1);
            }
         }

         if(this.M == 2 && this.D == var5) {
            return;
         }
      }

      this.B = var4;
      this.D = var5;
      this.L = false;
      this.updatePreview();
   }

   public int getPreviewMode() {
      return this.M;
   }

   public String getCurrentExternalFilenamePreview() {
      return this.C;
   }

   public void updateExternalPreview(String var1) {
      this.C = var1;
      this.M = 2;
      if(this.L) {
         DialogUtils.showInfoDialog(this, a("1s_1#\u0011n_&>\u000bi\u0010(\"\u0002x\re8\u001d~\u000b,$\u0016=\u000b-.\nx_,8Xs\u0010e;\nx\t,.\u000f=\u001e3*\u0011q\u001e\'\'\u001d3u\u0015\'\u001d|\f k\u001fr_1$Xi\u0017 k_[\u00107&\u0019i\u000b 9_=\f (\ft\u0010+k\fr_$(\ft\t$?\u001d=\u000f7.\u000et\u001a28V"));
      } else {
         this.L = false;
         this.updatePreview();
      }

   }

   public void updateResourcePreview() {
      this.M = 1;
      if(this.L) {
         DialogUtils.showInfoDialog(this, a("1s_1#\u0011n_&>\u000bi\u0010(\"\u0002x\re8\u001d~\u000b,$\u0016=\u000b-.\nx_,8Xs\u0010e;\nx\t,.\u000f=\u001e3*\u0011q\u001e\'\'\u001d3u\u0015\'\u001d|\f k\u001fr_1$Xi\u0017 k_[\u00107&\u0019i\u000b 9_=\f (\ft\u0010+k\fr_$(\ft\t$?\u001d=\u000f7.\u000et\u001a28V"));
      } else {
         this.L = false;
         this.updatePreview();
      }

   }

   public void updateResourcePreview(String var1, PreviewFilterList var2) {
      this.B = var1;
      this.D = var2;
      this.M = 1;
      this.L = false;
      this.updatePreview();
   }

   public void updateNoPreview() {
      if(this.N) {
         this.w.setShowRightMargin(false);
         this.w.setTabulatorSize(8);
         this.w.setText(a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r"));
         this.w.setShowLine(-1);
      }

      this.x.setShowRightMargin(false);
      this.x.setTabulatorSize(8);
      this.x.setText(a("6r_59\u001dk\u0016 <X|\t$\"\u0014|\u001d).r"));
      this.x.setShowLine(-1);
      if(this.A != null) {
         this.A.clear();
      }

      this.L = true;
   }

   public void updatePreview() {
      if(!this.L) {
         String var1 = this.M == 2?this.C:this.B;
         if(var1 != null) {
            this.L = false;
            JindentSettings var2 = (JindentSettings)this.G.getConnectedSettings();
            String var3 = SettingsUtils.extractExtensionFromFilename(var1);
            ExtensionManager var4 = var2.getExtensionManager();
            InternalFormatter var5 = (InternalFormatter)var4.getFormatterByExtension(var3);
            if(var5 != null) {
               var5.setSettings(var2);
               var5.setActivationWindow(SwingUtils.findWindow((Container)this));
               Context var6 = var5.getContext();
               int var7 = var6.getNumber(a("\u0015|\u0007\t\"\u0016x3 %\u001fi\u0017"));
               this.x.setRightMargin(var7);
               boolean var8 = var6.getBoolean(a("\u000fo\u001e5\u0007\u0011s\u001a6"));
               this.x.setShowRightMargin(var8);
               int var9 = var6.getNumber(a("\f|\u001d0\'\u0019i\u00107\u0018\u0011g\u001a"));
               this.x.setTabulatorSize(var9);
               if(this.N) {
                  int var10 = var6.getNumber(a("\u0011s\u000f0?,|\u001d0\'\u0019i\u00107\u0018\u0011g\u001a"));
                  this.w.setTabulatorSize(var10);
               }

               SwingUtilities.invokeLater(new SourcePreviewPane$12(this, var6, var5));
            } else {
               jindent.debugger.a.b(a("6r_#$\np\u001e1?\u001do_#$\n=\u0019,\'\u001d=X") + var1 + a("_=\u0019*>\u0016y"));
               this.updateNoPreview();
            }

         }
      }
   }

   private void setErrorText(String var1) {
      this.x.setHighlighting(SourceTextPaneHighlighting.getInstance());
      this.x.setText(var1);
      this.x.setShowRightMargin(false);
      if(this.N) {
         this.setActiveTextPane(0);
      }

   }

   public String getResourcePreviewFile(Context var1, String var2) {
      if(var2 == null) {
         return null;
      } else {
         String var3 = (String)this.I.get(var2);
         if(var3 == null) {
            var3 = this.readResourcePreviewFile("ISO-8859-1", var1.pathOfResources() + a("\bo\u001a3\"\u001dj\fj") + var2);
            this.I.put(var2, var3);
         }

         return var3;
      }
   }

   private String readResourcePreviewFile(String var1, String var2) {
      try {
         BufferedReader var3 = new BufferedReader(new InputStreamReader((R == null?(R = class$(a("\u0012t\u0011!.\u0016iQ&>\u000bi\u0010(\"\u0002x\rk;\nx\t,.\u000f3,*>\n~\u001a\u00159\u001dk\u0016 <(|\u0011 "))):R).getResourceAsStream(var2), var1));
         return Utils.getString(var3);
      } catch (Exception var4) {
         DialogUtils.showErrorDialog(this, a("=o\r*9Xj\u0017,\'\u001d=\r *\u001ct\u0011\"k\bo\u001a3\"\u001dj_#\"\u0014xEO") + var4.getMessage());
         return var4.toString();
      }
   }

   public String getExternalPreviewFile(String var1) {
      if(var1 == null) {
         return null;
      } else {
         String var2 = (String)this.K.get(var1);
         return var2;
      }
   }

   public void addExternPreviewFile() {
      Settings var1 = this.G.getConnectedSettings();
      ExtensionManagerSetting var2 = var1.getExtensionManager(a("\u001fx\u0011 9\u0019qQ 3\fx\u00116\"\u0017s2$%\u0019z\u001a7"));
      JFileChooser var3 = SwingUtils.getSourceFileChooser(var2);
      if(var3.showOpenDialog(this) == 0) {
         String var4 = var3.getSelectedFile().getPath();
         String var5 = SettingsUtils.extractExtensionFromFilename(var4);
         InternalFormatter var6 = (InternalFormatter)var2.getFormatterByExtension(var5);
         String var7;
         if(var6 != null) {
            Context var8 = var6.getContext();
            var8.c = this.G.getConnectedSettings();
            var7 = var8.getEncoding(a("\u0011s\u000f0?=s\u001c*/\u0011s\u0018"));
         } else {
            var7 = "ISO-8859-1";
         }

         SourcePreviewPane$13 var9 = new SourcePreviewPane$13(this, var7, var4);
         var9.start();
      }

   }

   private String readExternPreviewFile(String var1, String var2) {
      try {
         BufferedReader var3 = new BufferedReader(new InputStreamReader(new FileInputStream(var2), var1));
         return Utils.getString(var3);
      } catch (Exception var4) {
         DialogUtils.showErrorDialog(this, a("=o\r*9Xj\u0017,\'\u001d=\r *\u001ct\u0011\"k\bo\u001a3\"\u001dj_#\"\u0014xEO") + var4.getMessage());
         return var4.toString();
      }
   }

   public Iterator getExternalPreviewFiles() {
      return this.K.keySet().iterator();
   }

   private void showMessages() {
      this.z.setDividerLocation(0.6666666666666666D);
   }

   public void dispose() {
      this.G.getEventHandler().removeEventListener(this.H);
   }

   public JSplitPane getSplitPane() {
      return this.z;
   }

   private static String createPreviewFilename(String var0) {
      int var1 = var0.lastIndexOf(".");
      return var1 == -1?var0 + a("U{\u00107&\u0019i\u000b /"):var0.substring(0, var1) + a("U{\u00107&\u0019i\u000b /") + var0.substring(var1);
   }

   static void access$000(SourcePreviewPane var0, CustomizerTabbedPane var1) {
      var0.updatePreviewFromTab(var1);
   }

   static SourceTextPane access$100(SourcePreviewPane var0) {
      return var0.x;
   }

   static boolean access$200(SourcePreviewPane var0) {
      return var0.N;
   }

   static SourceTextPane access$300(SourcePreviewPane var0) {
      return var0.w;
   }

   static JSlider access$400(SourcePreviewPane var0) {
      return var0.F;
   }

   static JScrollPane access$500(SourcePreviewPane var0) {
      return var0.v;
   }

   static SourceTextPane access$600(SourcePreviewPane var0) {
      return var0.getActiveTextPane();
   }

   static int access$700(SourcePreviewPane var0, float var1) {
      return var0.getSizeFromWidth(var1);
   }

   static boolean access$800(SourcePreviewPane var0) {
      return var0.O;
   }

   static JSplitPane access$900(SourcePreviewPane var0) {
      return var0.z;
   }

   static boolean access$802(SourcePreviewPane var0, boolean var1) {
      return var0.O = var1;
   }

   static String access$1000(SourcePreviewPane var0) {
      return var0.B;
   }

   static int access$1100(SourcePreviewPane var0) {
      return var0.M;
   }

   static String access$1200(SourcePreviewPane var0) {
      return var0.C;
   }

   static CustomizerData access$1300(SourcePreviewPane var0) {
      return var0.G;
   }

   static JTabbedPane access$1400(SourcePreviewPane var0) {
      return var0.P;
   }

   static String access$1500(String var0) {
      return createPreviewFilename(var0);
   }

   static PreviewFilterList access$1600(SourcePreviewPane var0) {
      return var0.D;
   }

   static void access$1700(SourcePreviewPane var0, int var1) {
      var0.setActiveTextPane(var1);
   }

   static void access$1800(SourcePreviewPane var0, String var1) {
      var0.setErrorText(var1);
   }

   static void access$1900(SourcePreviewPane var0) {
      var0.showMessages();
   }

   static ReportListPanel access$2000(SourcePreviewPane var0) {
      return var0.A;
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static String access$2100(SourcePreviewPane var0, String var1, String var2) {
      return var0.readExternPreviewFile(var1, var2);
   }

   static HashMap access$2200(SourcePreviewPane var0) {
      return var0.K;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 120;
            break;
         case 1:
            var10003 = 29;
            break;
         case 2:
            var10003 = 127;
            break;
         case 3:
            var10003 = 69;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
