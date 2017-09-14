package jindent.commander;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import jindent.ExtensionManager;
import jindent.JindentSystem;
import jindent.SettingsUtils;
import jindent.commander.bj;
import jindent.commander.bk;
import jindent.commander.bl;
import jindent.commander.bm;
import jindent.commander.bn;
import jindent.commander.bo;
import jindent.commander.bp;
import jindent.commander.bq;
import jindent.commander.br;
import jindent.customizer.gui.settings.EncodingGUIObject;
import jindent.customizer.preview.SourceTextPane;
import jindent.customizer.preview.SourceTextPaneHighlighting;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.util.IntHashtable;
import jindent.util.Utils;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class InstrumentedSourceTextPane extends JPanel {
   private static final long serialVersionUID = -1275266398312054463L;
   private static final int a = 5;
   private static final int b = 40;
   private static final int c = 12;
   private static HashMap d = new HashMap();
   private SourceTextPane e = new SourceTextPane();
   private JScrollPane f = new JScrollPane();
   private JToolBar g = new JToolBar();
   private JButton h;
   private JButton i;
   private JToggleButton j;
   private JToggleButton k;
   private JToggleButton l;
   private JButton m;
   private JButton n;
   private JSlider o;
   private IntHashtable p;
   private BorderLayout q = new BorderLayout();
   private JLabel r = new JLabel();
   private JLabel s;
   private JTextField t = new JTextField();
   private GridBagLayout u = new GridBagLayout();
   private JComboBox v;
   private File w;

   public InstrumentedSourceTextPane() {
      try {
         this.a();
         this.w = null;
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a() throws Exception {
      this.e.setText("");
      this.l = new JToggleButton(SwingUtils.readImageIcon(a("N\nq?+PHhlB\fHf~3\u0018Uo")));
      this.l.setFocusable(false);
      this.l.setToolTipText(a("+Sfiq\u001a\u001c_gx\b\u001cFh=+]k.N\u000bSy.N\u0006Qkaq\f"));
      this.l.addActionListener(new bj(this));
      this.l.setSelected(true);
      this.setLayout(this.q);
      this.k = new JToggleButton(SwingUtils.readImageIcon(a("N\nq?+POyo~\u001a\u0012ng{")));
      this.k.setFocusable(false);
      this.k.setToolTipText(a("+Sfiq\u001a\u001c_gx\b\u001cFh=,Lhmx_opc\u007f\u0010Pz"));
      this.k.addActionListener(new bk(this));
      this.s = new JLabel(a(":Rjay\u0016Rn"));
      this.s.setToolTipText(a(",Yek~\u000bYm.X\u0011_fjt\u0011[)[n\u001aX)Hr\r\u001cY|x\tUly"));
      Vector var1 = EncodingGUIObject.getAvailableEncodings();
      this.v = new JComboBox(var1);
      this.v.setSelectedIndex(0);
      this.v.addActionListener(new bl(this));
      this.r.setText(a("9Uek"));
      this.r.setToolTipText(a(",Yek~\u000bYm.[\u0016Pl`|\u0012Y)Hr\r\u001cY|x\tUly"));
      this.t.setEditable(false);
      this.t.setColumns(15);
      this.j = new JToggleButton(SwingUtils.readImageIcon(a("N\nq?+PP``x ^{k|\u0014\u0012ng{")));
      this.j.setFocusable(false);
      this.j.setToolTipText(a("+Sfiq\u001a\u001c_gx\b\u001cFh=3Ugk==Nlov_opc\u007f\u0010Pz"));
      this.j.addActionListener(new bm(this));
      this.i = new JButton(SwingUtils.readImageIcon(a("N\nq?+PFfap S|z3\u000fRn")));
      this.i.setFocusable(false);
      this.i.setToolTipText(a("%Sfc=0I}.M\rY\u007fgx\b"));
      this.i.addActionListener(new bn(this));
      this.o = new JSlider(0, 5, 40, 12);
      this.o.setFocusable(false);
      this.o.setToolTipText(a("*Ol.N\u0013Umko_hf.N\u001c]ek=/Nlxt\u001aK"));
      this.o.addChangeListener(new bo(this));
      this.o.setMajorTickSpacing(10);
      this.o.setMinorTickSpacing(1);
      this.o.setPaintTicks(false);
      this.h = new JButton(SwingUtils.readImageIcon(a("N\nq?+PFfap Ug m\u0011[")));
      this.h.setFocusable(false);
      this.h.setToolTipText(a("%Sfc=6R)^o\u001aJ`kj"));
      this.h.addActionListener(new bp(this));
      this.n = new JButton(SwingUtils.readImageIcon(a("N\nq?+PJ`kj \rV?3\u000fRn")));
      this.n.setFocusable(false);
      this.n.setToolTipText(a(";Yooh\u0013H)^o\u001aJ`kj_ffap"));
      this.n.addActionListener(new bq(this));
      this.m = new JButton(SwingUtils.readImageIcon(a("N\nq?+PZ`zB\u000bSVyt\u001bHa z\u0016Z")));
      this.m.setFocusable(false);
      this.m.setToolTipText(a("9U}.N\u0010I{mx_\u007ffjx_k`ji\u0017\u001c]a=/Nlxt\u001aK)Yt\u0011Xfy"));
      this.m.addActionListener(new br(this));
      this.g.setLayout(this.u);
      this.g.add(this.s, new GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D, 13, 0, new Insets(0, 5, 0, 0), 0, 0));
      this.g.add(this.v, new GridBagConstraints(1, 0, 1, 1, 0.0D, 0.0D, 13, 0, new Insets(0, 5, 0, 10), 0, 0));
      this.g.add(this.r, new GridBagConstraints(2, 0, 1, 1, 0.0D, 0.0D, 13, 0, new Insets(0, 5, 0, 0), 0, 0));
      this.g.add(this.t, new GridBagConstraints(3, 0, 1, 1, 1.0D, 0.0D, 13, 2, new Insets(0, 5, 0, 10), 0, 0));
      this.g.add(this.l, new GridBagConstraints(4, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.k, new GridBagConstraints(5, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.j, new GridBagConstraints(6, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.i, new GridBagConstraints(7, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.o, new GridBagConstraints(8, 0, 1, 1, 0.3D, 0.0D, 10, 2, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.h, new GridBagConstraints(9, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.n, new GridBagConstraints(10, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.g.add(this.m, new GridBagConstraints(11, 0, 1, 1, 0.0D, 0.0D, 10, 0, new Insets(0, 0, 0, 0), 0, 0));
      this.f.getViewport().add(this.e, (Object)null);
      this.add(this.f, a("<Ygzx\r"));
      this.add(this.g, a("1S{zu"));
   }

   private void b() {
      this.p = new IntHashtable();

      for(int var1 = 5; var1 < 40; ++var1) {
         int var2 = (int)SwingUtils.getMaxWidthOfFontSize(this.e.getFont(), (float)var1);
         this.p.a(var2, new Integer(var1));
      }

   }

   private int a(float var1) {
      if(this.p == null) {
         this.b();
      }

      int var2 = (int)Math.floor((double)var1);
      Integer var3 = (Integer)this.p.a(var2);
      if(var3 == null) {
         int var4 = (int)SwingUtils.getMaxWidthOfFontSize(this.e.getFont(), 5.0F);
         int var5 = (int)SwingUtils.getMaxWidthOfFontSize(this.e.getFont(), 40.0F);
         return var1 < (float)var4?5:(var1 > (float)var5?40:12);
      } else {
         return var3.intValue();
      }
   }

   public SourceTextPane c() {
      return this.e;
   }

   public JTextField d() {
      return this.t;
   }

   public JLabel e() {
      return this.r;
   }

   public void f() {
      this.c().setText("");
      this.d().setText("");
      this.d().setToolTipText("");
      this.setEnabled(false);
      this.e.setEnabled(false);
      this.f.setEnabled(false);
      this.h.setEnabled(false);
      this.i.setEnabled(false);
      this.j.setEnabled(false);
      this.k.setEnabled(false);
      this.l.setEnabled(false);
      this.m.setEnabled(false);
      this.n.setEnabled(false);
      this.o.setEnabled(false);
      this.r.setEnabled(false);
      this.t.setEnabled(false);
      this.s.setEnabled(false);
      this.v.setEnabled(false);
   }

   public void g() {
      this.setEnabled(true);
      this.e.setEnabled(true);
      this.f.setEnabled(true);
      this.h.setEnabled(true);
      this.i.setEnabled(true);
      this.j.setEnabled(true);
      this.k.setEnabled(true);
      this.l.setEnabled(true);
      this.m.setEnabled(true);
      this.n.setEnabled(true);
      this.o.setEnabled(true);
      this.r.setEnabled(true);
      this.t.setEnabled(true);
      this.s.setEnabled(true);
      this.v.setEnabled(true);
   }

   public void a(File var1) {
      this.w = var1;
      this.h();
   }

   protected void h() {
      if(this.w != null && !this.w.isDirectory()) {
         if(!this.w.exists()) {
            DialogUtils.showErrorDialog(this, a("9Uek=\u0011S}.{\u0010Igj3"));
            this.f();
         } else if(!this.w.canRead()) {
            DialogUtils.showErrorDialog(this, a("9Uek=\u0016O)`r\u000b\u001c{k|\u001b]kbxQ"));
            this.f();
         } else {
            try {
               String var1 = (String)this.v.getSelectedItem();
               String var2 = Utils.getStringFromFile(this.w, var1);
               this.setEnabled(true);
               String var3 = SettingsUtils.extractExtensionFromFilename(this.w.getName());
               ExtensionManager var4 = JindentSystem.getDefaultExtensionManager();
               InternalFormatter var5 = (InternalFormatter)var4.getFormatterByExtension(var3);
               if(var5 != null) {
                  Context var6 = var5.getContext();
                  this.g();
                  this.c().setHighlighting(SourceTextPaneHighlighting.getInstance(var6));
                  this.c().setText(var2);
                  this.d().setText(this.w.getName());
                  this.d().setToolTipText(this.w.getAbsolutePath());
                  this.c().setShowLine(0);
                  this.c().setShowRightMargin(false);
               } else {
                  DialogUtils.showErrorDialog(this, a("*Rhlq\u001a\u001c}a=\fTfy=\u0019Uek3_hagn_Qhw=\u001dY)o=\rYzah\r_l.{\u0016Pl "));
                  this.f();
               }
            } catch (Exception var7) {
               var7.printStackTrace();
            }

         }
      } else {
         this.f();
      }
   }

   static SourceTextPane a(InstrumentedSourceTextPane var0) {
      return var0.e;
   }

   static JSlider b(InstrumentedSourceTextPane var0) {
      return var0.o;
   }

   static JScrollPane c(InstrumentedSourceTextPane var0) {
      return var0.f;
   }

   static int a(InstrumentedSourceTextPane var0, float var1) {
      return var0.a(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 127;
            break;
         case 1:
            var10003 = 60;
            break;
         case 2:
            var10003 = 9;
            break;
         case 3:
            var10003 = 14;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
