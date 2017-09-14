package jindent.customizer.gui.settings;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintRule;
import jindent.customizer.constraint.SelectionActor;
import jindent.customizer.gui.elements.GUILabel;
import jindent.customizer.gui.settings.BooleanGUIObject;
import jindent.customizer.gui.settings.BracesGUIObject$1;
import jindent.customizer.gui.settings.BracesGUIObject$2;
import jindent.customizer.gui.settings.INumberGUIObject;
import jindent.customizer.gui.settings.NumberGUIObject;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.customizer.gui.settings.f.b;
import jindent.customizer.gui.settings.f.c;
import jindent.customizer.gui.settings.f.d;
import jindent.customizer.gui.settings.f.e;
import jindent.customizer.gui.settings.f.f;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.layout.PropertiesLayout;
import jindent.settings.BracesSetting;
import jindent.settings.Setting;
import jindent.util.swing.MultiLineLabel;

public class BracesGUIObject extends SettingGUIObject {
   private static final String[] g = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
   private static final int h = 0;
   private BooleanGUIObject i;
   private BooleanGUIObject j;
   private NumberGUIObject k;
   private NumberGUIObject l;
   private NumberGUIObject m;
   private BooleanGUIObject n;
   private NumberGUIObject o;
   private BooleanGUIObject p;
   private INumberGUIObject q;
   private INumberGUIObject r;
   private BooleanGUIObject s;
   private JComboBox t;
   private JLabel u;
   private SettingGUIObject[] v;

   public BracesGUIObject(String var1, String var2) {
      super(var1, var2);
      this.i = new BooleanGUIObject(b("9A%\u0015{\'E \u0004w0S\u000f\bW0"), b("\u0019A%\u0015\u00197V\"\u0002\\u_c\u000f\\\"\u0004/\bW0"));
      this.j = new BooleanGUIObject(b("\'M$\tM\u0017V\"\u0002\\\u001bA4-P;A"), b("\u0007M$\tMuF1\u0000Z0\u0004>AW0Sc\rP;A"));
      this.k = new NumberGUIObject(b("<J\'\u0004W!h&\u0007M\u0017V\"\u0002\\"), b("\u001cJ\'\u0004W!\u0004/\u0004_!\u0004!\u0013X6Ac\u001a"), 1, g);
      this.l = new NumberGUIObject(b("<J\'\u0004W!v*\u0006Q!f1\u0000Z0"), b("\u001cJ\'\u0004W!\u00041\b^=Pc\u0003K4G&AD"), 1, g);
      this.m = new NumberGUIObject(b("<J\'\u0004W!e%\u0015\\\'v*\u0006Q!f1\u0000Z0"), b("\u001cJ\'\u0004W!\u0004\"\u0007M0Vc\u0013P2L7A[\'E \u0004\u0019("), 1, g);
      this.n = new BooleanGUIObject(b("6Q\'\u0005U0a.\u0011M,f1\u0000Z0W"), b("\u0016Q\'\u0005U0\u0004!\u0013X6A0AV3\u0004&\fI!]c\u0003U:G(\u0012\u0019.Y"));
      this.o = new NumberGUIObject(b("<J\'\u0004W!g6\u0005]9A\'#K4G&\u0012"), b("\u001cJ\'\u0004W!\u0004 \u0014]1H&\u0005\u00197V\"\u0002\\&\u00048\u001c"), 1, g);
      this.p = new BooleanGUIObject(b(";K\u0001\rX;O\u000f\bW0W\u0002\u0007M0V\u000f\u0004_!f1\u0000Z0"), b("\u0005V,\tP7M7A[9E-\n\u00199M-\u0004JuE%\u0015\\\'\u0004/\u0004_!\u0004!\u0013X6Ac\u001a"));
      this.q = new INumberGUIObject(b("8M--P;A05V\u001cJ0\u0004K!f/\u0000W>h*\u000f\\\u0014B7\u0004K\u0019A%\u0015{\'E \u0004"), b("\u001cBc\u000fL8F&\u0013\u0019:Bc\rP;A0AP;\u0004!\u000e],\u0004*\u0012\u00194Pc\r\\4W7kM=A-AP;W&\u0013MuF/\u0000W>\u0004/\bW0\u0004\"\u0007M0Vc\u001a"), 1, g);
      this.r = new INumberGUIObject(b("8M--P;A05V\u001cJ0\u0004K!f/\u0000W>h*\u000f\\\u0017A%\u000eK0v*\u0006Q!f1\u0000Z0"), b("\u001cBc\u000fL8F&\u0013\u0019:Bc\rP;A0AP;\u0004!\u000e],\u0004*\u0012\u00194Pc\r\\4W7kM=A-AP;W&\u0013MuF/\u0000W>\u0004/\bW0\u0004!\u0004_:V&AD"), 1, g);
      this.s = new BooleanGUIObject(b("1K\r\u000eM\u001cJ0\u0004K!f&\u0007V\'A\u0010\bW2H&3P2L7#K4G&"), b("\u0011Kc\u000fV!\u0004*\u000fJ0V7A[9E-\n\u00199M-\u0004\u00197A%\u000eK0\u00040\bW2H&AK<C+\u0015\u00197V\"\u0002\\"));
      this.v = new SettingGUIObject[]{this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s};
      int var3 = this.v.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         SettingGUIObject var5 = this.v[var4];
         String var6 = var5.getName();
         if(!var1.equals("")) {
            String var7 = var1 + "." + var6;
            var5.setName(var7);
         }
      }

   }

   public BracesGUIObject() {
      this("", "");
   }

   public static Object[] getPresets() {
      return new Object[]{b("\u0016H*\u0002RuP,AZ=K,\u0012\\uT1\u0004J0PmO\u0017"), "", new d(), new e(), new b(), new f(), new c()};
   }

   public void setSetting(Setting var1) {
      super.setSetting(var1);
      BracesSetting var2 = (BracesSetting)this.getSetting();
      Setting[] var3 = var2.getSubSettings();
      int var4 = var2.countSubSettings();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.v[var5].setSetting(var3[var5]);
      }

   }

   public void updateJPanel() {
      this.updateComboBox();
      if(this.containsSetting()) {
         int var1 = this.v.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            this.v[var2].updateJPanel();
         }
      }

   }

   private void updateComboBox() {
      if(this.containsSetting()) {
         int var1 = this.t.getItemCount();
         this.t.setSelectedIndex(0);

         for(int var2 = 0; var2 < var1; ++var2) {
            Object var3 = this.t.getItemAt(var2);
            if(var3 instanceof jindent.customizer.gui.settings.f.a) {
               jindent.customizer.gui.settings.f.a var4 = (jindent.customizer.gui.settings.f.a)var3;
               if(var4.b((BracesSetting)this.getSetting())) {
                  this.t.setSelectedIndex(var2);
                  break;
               }
            }
         }
      }

   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = this.getDesc();
      int var5 = this.v.length;
      PropertiesLayout var6 = new PropertiesLayout(0, 0, 0, 5, 5);
      JPanel var7 = new JPanel(var6);
      this.u = new JLabel(b("\u0017V\"\u0002\\uW7\u0018U0\u00043\u0013\\&A7"), 2);
      this.t = new JComboBox(getPresets());
      this.t.addActionListener(new BracesGUIObject$1(this, this, var2));
      String var9 = this.getName() + this.t.toString();
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)this.t, var3);
         HelpUtils.setHelpIDString((Component)var7, var3);
      } else {
         System.err.println(b("\u001dA/\u0011R0]c") + this.getName() + b("uM0AW H/"));
      }

      var1.add(this.u, b("\u0013h\f6"));
      var1.add(this.t, b("\u0013h\f6f\u0014j\u0007>w\u0010s\u001c3v\u0002"));
      var1.add(new JLabel(" "), b("\u0013h\f6f\u0014j\u0007>w\u0010s\u001c3v\u0002"));
      var2.getConstraintsHandler().addActor(new SelectionActor(var9, this.t, this.getDisabledIndex()));

      for(int var10 = 0; var10 < var5; ++var10) {
         SettingGUIObject var11 = this.v[var10];
         new JLabel(var11.getDesc());
         var11.addToJPanel(var7, var2, var3);
      }

      var2.getConstraintsHandler().addRule(new ConstraintRule(this.n.getName(), this.o.getName(), 1));
      var2.getConstraintsHandler().addRule(new ConstraintRule(this.j.getName(), this.m.getName(), 2));
      var2.getConstraintsHandler().addRule(new ConstraintRule(this.p.getName(), this.q.getName(), 2));
      var2.getConstraintsHandler().addRule(new ConstraintRule(this.r.getName(), this.s.getName(), 2));
      MultiLineLabel var13 = GUILabel.createSubtitleLabel(this.getDesc());
      var1.add(var13, b("\u0001m\u0017-|"));
      var1.add(var7, b("\u0013h\f6f\u0014j\u0007>w\u0010s\u001c3v\u0002"));
      var2.getEventHandler().addEventListener(new BracesGUIObject$2(this, var2));
      this.setAddedToJPanel(true);
   }

   public void initFromPreset(jindent.customizer.gui.settings.f.a var1) {
      if(this.containsSetting()) {
         BracesSetting var2 = (BracesSetting)this.getSetting();
         var1.a(var2);
         this.updateJPanel();
      }

   }

   public int[] getDisabledIndex() {
      return new int[]{0};
   }

   static JComboBox access$000(BracesGUIObject var0) {
      return var0.t;
   }

   static void access$100(BracesGUIObject var0) {
      var0.updateComboBox();
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 85;
            break;
         case 1:
            var10003 = 36;
            break;
         case 2:
            var10003 = 67;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 57;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
