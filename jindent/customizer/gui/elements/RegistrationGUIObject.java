package jindent.customizer.gui.elements;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.EventObject;
import java.util.logging.Level;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import jindent.JindentException;
import jindent.customizer.CustomizerData;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.RegistrationGUIObject$1;
import jindent.customizer.gui.elements.RegistrationGUIObject$2;
import jindent.customizer.gui.elements.RegistrationGUIObject$3;
import jindent.customizer.gui.elements.RegistrationGUIObject$4;
import jindent.customizer.gui.elements.RegistrationGUIObject$5;
import jindent.customizer.gui.elements.RegistrationGUIObject$6;
import jindent.customizer.gui.elements.RegistrationGUIObject$7;
import jindent.customizer.gui.elements.RegistrationGUIObject$8;
import jindent.customizer.gui.elements.RegistrationGUIObject$9;
import jindent.customizer.gui.elements.a.RegistrationTableModel;
import jindent.customizer.gui.elements.a.RegistrationTableRenderer;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;
import jindent.customizer.layout.PropertiesLayout;
import jindent.debugger.JindentLogging;
import jindent.formatter.k;
import jindent.util.Utils;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;
import jindent.util.swing.a.TableSorter;
import jindent.util.swing.a.b;

public class RegistrationGUIObject extends GUIObject {
   private RegistrationTableModel f;
   private TableSorter g;
   private RegistrationTableRenderer h;
   private JTable i;
   private static final int j = 350;
   private static final int k = 200;
   private JButton l;
   private JButton m;
   private JButton n;
   private JButton o;
   static Class p;

   public RegistrationGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      try {
         this.f = new RegistrationTableModel(new String[]{a("W+X\f\fh\'\u001b\u0000\u0006"), a("Y-N\u0007\u0006;.T\u000e\u000bujH@"), a("]-I\u0004\u0003o6^\u001b")});
      } catch (JindentException var11) {
         JindentLogging.getLogger().severe(var11.getMessage());
         DialogUtils.showErrorDialog(var1, a("W+X\f\fh\'\u001b\f\u0010i-ISB") + var11.getMessage());
      }

      this.g = new TableSorter(this.f);
      this.i = new JTable(this.g);
      this.h = new RegistrationTableRenderer();
      this.i.setDefaultRenderer(p == null?(p = class$(a("q+U\r\u0007u6\u0015\n\u0017h6T\u0004\u000ba\'IG\u0005n+\u0015\f\u000e~/^\u0007\u0016hlZG\u0003"))):p, this.h);
      this.g.a(this.i);
      this.i.setSelectionMode(0);
      JScrollPane var5 = new JScrollPane(this.i, 20, 30);
      var5.setPreferredSize(new Dimension(350, 200));
      var5.getViewport().setBackground(this.i.getBackground());
      JPanel var6 = new JPanel();
      var6.setLayout(new PropertiesLayout(0, 0, 0, 5, 0));
      this.i.addMouseListener(new RegistrationGUIObject$1(this, var2));
      JPanel var7 = new JPanel();
      var7.setLayout(new PropertiesLayout(0, 0, 0, 5, 5));
      this.l = new JButton(a("Z&_I\u0004i-VI\u0004r.^"));
      this.l.setIcon(SwingUtils.readImageIcon(a("*tCXT4&T\n\u0017v\'U\u001d=z&_G\u0012u%")));
      this.l.addActionListener(new RegistrationGUIObject$2(this, var2));
      this.m = new JButton(a("Z&_I\u0004i-VI\u0001w+K\u000b\rz0_"));
      this.m.setIcon(SwingUtils.readImageIcon(a("*tCXT42Z\u001a\u0016~lK\u0007\u0005")));
      this.m.addActionListener(new RegistrationGUIObject$3(this, var2));
      this.n = new JButton(a("H*T\u001eBw+X\f\fh\'"));
      this.n.setIcon(SwingUtils.readImageIcon(a("*tCXT4&T\n\u0017v\'U\u001d=m+^\u001eLk,\\")));
      this.n.addActionListener(new RegistrationGUIObject$4(this, var2));
      this.n.setEnabled(this.i.getSelectedRow() != -1);
      this.o = new JButton(a("I\'V\u0006\u0014~bW\u0000\u0001~,H\f"));
      this.o.setIcon(SwingUtils.readImageIcon(a("*tCXT4&^\u0005\u0007o\'\tG\u0012u%")));
      this.o.addActionListener(new RegistrationGUIObject$5(this, var2));
      this.o.setEnabled(false);
      b var8 = new b(this.i, new Component[]{this.n, this.o});
      this.i.getSelectionModel().addListSelectionListener(var8);
      this.i.getColumnModel().getSelectionModel().addListSelectionListener(var8);
      var7.add(this.l, a("X\rw</U\u001dz%+\\\f~-=Z\f\u007f6,^\u0015d;-L"));
      var7.add(this.m, a("X\rw</U\u001dz%+\\\f~-=Z\f\u007f6,^\u0015d;-L"));
      var7.add(this.n, a("X\rw</U\u001dz%+\\\f~-=Z\f\u007f6,^\u0015d;-L"));
      var7.add(this.o, a("X\rw</U\u001dz%+\\\f~-=Z\f\u007f6,^\u0015d;-L"));
      var6.add(var5, a("]\u000et>"));
      var6.add(var7, a("]\u000et>=Z\f\u007f6,^\u0015d;-L"));
      var6.add(new JLabel(" "), a("]\u000et>=Z\f\u007f6,^\u0015d;-L"));
      JLabel var9 = new JLabel(a("B-N\u001bBh;H\u001d\u0007vbW\u0006\u0005r,\u001b\u0007\u0003v\'\u001b\u0000\u0011!"));
      var6.add(var9, a("]\u000et>"));
      JTextField var10 = new JTextField(getUserName(), 20);
      var10.setEditable(false);
      var6.add(var10, a("]\u000et>=Z\f\u007f6,^\u0015d;-L"));
      var1.add(var6, a("]\u000et>=Z\f\u007f6,^\u0015d;-L"));
      var1.add(new JavaHelpIcon(var3), a("]\u000et>=Z\f\u007f6,^\u0015d;-L"));
      Component[] var4 = new Component[]{this.i, var5, var7, this.l, this.m, this.o, this.n, var9, var10};
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString(var4, var3);
         HelpUtils.setHelpIDString((Component)var6, var3);
      } else {
         System.err.println(a("S\'W\u0019\t~;\u001b") + this.getName() + a(";+HI\fn.W"));
      }

      var2.getConstraintsHandler().addObject(new ConstraintObject(this.getName(), var4));
      this.setAddedToJPanel(true);
   }

   private static String getUserName() {
      String[][] var0 = new String[][]{{a("x-VG\u0011n,\u0015\u001a\u0007x7I\u0000\u0016blZ\u001c\u0016slV\u0006\u0006n.^G,O\u0011B\u001a\u0016~/"), a("|\'O\'\u0003v\'")}, {a("x-VG\u0011n,\u0015\u001a\u0007x7I\u0000\u0016blZ\u001c\u0016slV\u0006\u0006n.^G7u+C:\u001bh6^\u0004"), a("|\'O<\u0011~0U\b\u000f~")}, {a("x-VG\u0011n,\u0015\u001a\u0007x7I\u0000\u0016blZ\u001c\u0016slV\u0006\u0006n.^G1t.Z\u001b\u000bh\u0011B\u001a\u0016~/"), a("|\'O<\u0011~0U\b\u000f~")}};
      String var1 = null;

      for(int var2 = 0; var2 < var0.length && var1 == null; ++var2) {
         String var3 = var0[var2][0];
         String var4 = var0[var2][1];

         try {
            Class var5 = Class.forName(var3);
            Object var6 = var5.newInstance();
            Method var7 = var5.getMethod(var4, new Class[0]);
            var1 = (String)var7.invoke(var6, new Object[0]);
         } catch (Exception var8) {
            ;
         }
      }

      if(var1 == null) {
         var1 = System.getProperty(a("n1^\u001bLu#V\f"));
      }

      return var1;
   }

   private void addLicenseFromFile(CustomizerData var1, EventObject var2) {
      try {
         JFileChooser var3 = SwingUtils.getLicenseFileChooser();
         if(var3.showOpenDialog(this.i) == 0) {
            String var4 = var3.getSelectedFile().getPath();
            File var5 = new File(var4);
            StringBuffer var6 = new StringBuffer();

            try {
               BufferedReader var7 = new BufferedReader(new FileReader(var5));
               String var8 = null;

               while(true) {
                  if((var8 = var7.readLine()) == null) {
                     var7.close();
                     break;
                  }

                  var6.append(var8);
               }
            } catch (FileNotFoundException var9) {
               throw new JindentException(a("X#U\u0007\rob]\u0000\f\u007fbW\u0000\u0001~,H\fB}+W\fB9") + var4 + a("9l"));
            } catch (IOException var10) {
               throw new JindentException(a("X#U\u0007\robI\f\u0003\u007fbW\u0000\u0001~,H\fB}+W\fB9") + var4 + a("9l"));
            }

            this.installLicenseKey(var6.toString());
         }
      } catch (Exception var11) {
         JindentLogging.getLogger().log(Level.SEVERE, a("^0I\u0006\u0010;5S\u0000\u000e~bI\f\u0003\u007f+U\u000eBw+X\f\fh\'\u001b\u000f\u000bw\'"), var11);
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.i), var11.getMessage());
      }

   }

   private void addLicenseFromClipboard(CustomizerData var1, EventObject var2) {
      try {
         JLabel var3 = new JLabel(a("^,O\f\u0010;.R\n\u0007u1^I\t~;\u0001"));
         JTextArea var4 = new JTextArea("", 10, 42);
         var4.setWrapStyleWord(true);
         var4.setFont(SwingUtils.MONO_FONT);
         JScrollPane var5 = new JScrollPane(var4);
         JButton var6 = new JButton(a("X-K\u0010B}0T\u0004Bx.R\u0019\u0000t#I\r"));
         var6.addActionListener(new RegistrationGUIObject$6(this, var4));
         Object[] var7 = new Object[]{var3, var5, new JLabel(" "), var6};
         Object[] var8 = new Object[]{a("R,H\u001d\u0003w."), a("X#U\n\u0007w")};
         Window var9 = SwingUtils.findWindow((Container)this.i);
         int var10 = JOptionPane.showOptionDialog(var9, var7, a("^,O\f\u0010;\u000eR\n\u0007u1^I)~;"), 2, -1, (Icon)null, var8, var8[0]);
         if(var10 == 0) {
            String var11 = var4.getText().trim();
            this.installLicenseKey(var11);
         }
      } catch (Exception var12) {
         JindentLogging.getLogger().log(Level.SEVERE, a("^0I\u0006\u0010;5S\u0000\u000e~bI\f\u0003\u007f+U\u000eBw+X\f\fh\'\u001b\u000f\u000bw\'"), var12);
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.i), var12.getMessage());
      }

   }

   private void installLicenseKey(String var1) {
      SwingUtilities.invokeLater(new RegistrationGUIObject$7(this, var1));
   }

   private void installLicenseKey0(String var1) throws JindentException {
      jindent.customizer.gui.elements.a.a var2 = jindent.customizer.gui.elements.a.a.a(var1);
      JLabel var3 = new JLabel(a("W+X\f\fh\'\u001b \f}-HS"));
      JTextArea var4 = new JTextArea(var2.c());
      var4.setFont(SwingUtils.MONO_FONT);
      JScrollPane var5 = new JScrollPane(var4);
      Object[] var6 = new Object[]{var3, var5, new JLabel(" ")};
      Object[] var7 = new Object[]{a("R,H\u001d\u0003w."), a("X#U\n\u0007w")};
      Window var8 = SwingUtils.findWindow((Container)this.i);
      int var9 = JOptionPane.showOptionDialog(var8, var6, a("W+X\f\fh\'\u001b\"\u0007bx\u001b") + var2.a(), 2, -1, (Icon)null, var7, var7[0]);
      if(var9 == 0) {
         URL var10 = k.a(var2.g());
         if(k.b(var10)) {
            File var11 = k.c(var10);
            if(var11.exists()) {
               int var12 = JOptionPane.showConfirmDialog(SwingUtils.findWindow((Container)this.i), a("T4^\u001b\u0015i+O\fBw+X\f\fh\'\u001b\u0002\u0007bbL\u0000\u0016sbU\f\u0015;-U\f]"), a("W+X\f\fh\'\u001b\u0002\u0007bbZ\u0005\u0010~#_\u0010B~:R\u001a\u0016hc"), 2, 3);
               if(var12 == 1) {
                  return;
               }
            }

            SwingUtilities.invokeLater(new RegistrationGUIObject$8(this, var11, var1));
         } else {
            Window var13 = SwingUtils.findWindow((Container)this.i);
            DialogUtils.showErrorDialog(var13, a("X#U\u0007\robL\u001b\u000bo\'\u001b\u0005\u000bx\'U\u001a\u0007;)^\u0010B}+W\fBo-\u001b\u001c\u0010wb\u0019") + var10.toExternalForm() + a("9l1") + a("W+X\f\fh\'\u001b\u0002\u0007b1\u001b\n\u0003ubT\u0007\u000ebbY\fBr,H\u001d\u0003w.^\rB}0T\u0004Bw-X\b\u000e;/Z\n\nr,^\u001aN;,T\u001dB}0T\u0004Bi\'V\u0006\u0016~bX\u0006\fu\'X\u001d\u000bt,HG"));
         }
      }

   }

   private void showLicense(CustomizerData var1, EventObject var2) {
      int var3 = this.i.getSelectedRow();
      if(var3 != -1) {
         jindent.customizer.gui.elements.a.a var4 = (jindent.customizer.gui.elements.a.a)this.g.getValueAt(var3, 0);
         JLabel var5 = new JLabel(a("W+X\f\fh\'\u001b\u0000\f}-HS"));
         JTextArea var6 = new JTextArea(var4.c());
         var6.setFont(SwingUtils.MONO_FONT);
         JScrollPane var7 = new JScrollPane(var6);
         Object[] var8 = new Object[]{var5, var7};
         Object[] var9 = new Object[]{a("T\t")};
         Window var10 = SwingUtils.findWindow((Container)this.i);
         JOptionPane.showOptionDialog(var10, var8, a("W+X\f\fh\'\u001b\u0002\u0007bx\u001b") + var4.a(), 2, -1, (Icon)null, var9, var9[0]);
      }

   }

   private void removeLicense(CustomizerData var1, EventObject var2) {
      SwingUtilities.invokeLater(new RegistrationGUIObject$9(this, var1, var2));
   }

   private void removeLicense0(CustomizerData var1, EventObject var2) {
      int var3 = this.i.getSelectedRow();
      if(var3 != -1) {
         int var4 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this.i), a("I\'V\u0006\u0014~bH\f\u000e~!O\f\u0006;.R\n\u0007u1^I\t~;\u0004"));
         if(var4 == 2) {
            return;
         }

         jindent.customizer.gui.elements.a.a var5 = (jindent.customizer.gui.elements.a.a)this.g.getValueAt(var3, 0);
         URL var6 = k.a(var5.g());
         if(k.b(var6)) {
            File var7 = k.c(var6);

            try {
               if(!var7.delete()) {
                  throw new Exception();
               }

               this.updateLicenseKeys();
            } catch (Exception var10) {
               Window var9 = SwingUtils.findWindow((Component)var2.getSource());
               DialogUtils.showErrorDialog(var9, a("X#U\u0007\robI\f\u000ft4^I\u000er!^\u0007\u0011~bP\f\u001b;$R\u0005\u0007;`") + var7.getAbsolutePath() + a("9l19\u000e~#H\fB~,H\u001c\u0010~bB\u0006\u0017;*Z\u001f\u0007;5I\u0000\u0016~bZ\n\u0001~1HI\u0016tbO\u0001\u000bhb]\u0000\u000e~l"));
            }
         } else {
            Window var11 = SwingUtils.findWindow((Container)this.i);
            DialogUtils.showErrorDialog(var11, a("X#U\u0007\robI\f\u000ft4^I\u000er!^\u0007\u0011~bP\f\u001b;$R\u0005\u0007;$I\u0006\u000f;7I\u0005B9") + var6.toExternalForm() + a("9l1") + a("W+X\f\fh\'\u001b\u0002\u0007b1\u001b\n\u0003ubT\u0007\u000ebbY\fBi\'V\u0006\u0014~&\u001b\u000f\u0010t/\u001b\u0005\rx#WI\u000fz!S\u0000\f~1\u0017I\ft6\u001b\u000f\u0010t/\u001b\u001b\u0007v-O\fBx-U\u0007\u0007x6R\u0006\fhl"));
         }
      }

   }

   public void updateJPanel() {
      this.f.a();
      this.n.setEnabled(this.i.getSelectedRow() != -1);
      this.o.setEnabled(this.i.getSelectedRow() != -1);
      this.f.fireTableDataChanged();
      this.i.repaint();
   }

   private void updateLicenseKeys() {
      k.c();
      URL var1 = k.g();
      if(k.b(var1)) {
         JDialog var2 = DialogUtils.createWaitDialog(this.i, a("K.^\b\u0011~bL\b\u000bobL\u0001\u000bw\'\u001b\u001c\u0012\u007f#O\u0000\f|bI\f\u0005r1O\u001b\u0003o+T\u0007B\u007f#O\bL5l"));
         var2.setVisible(true);
         File var3 = k.c(var1);
         File[] var4 = var3.listFiles();
         StringBuffer var5 = new StringBuffer();

         for(int var6 = 0; var4 != null && var6 < var4.length; ++var6) {
            try {
               BufferedReader var7 = new BufferedReader(new FileReader(var4[var6]));
               String var8 = Utils.getString(var7);
               if(var8 != null) {
                  jindent.customizer.gui.elements.a.a var9 = jindent.customizer.gui.elements.a.a.a(var8);
                  int var10 = var9.e();

                  for(int var11 = 32; var11 > 0; var11 >>= 1) {
                     if((var10 & var11) != 0) {
                        int var12 = var9.b();

                        for(int var13 = 0; var13 < var12; ++var13) {
                           String var14 = var9.a(var13);
                           var5.append(var11);
                           var5.append(",");
                           var5.append(var14);
                           var5.append("=");
                           var5.append(var9.g());
                           var5.append("\n");
                        }
                     }
                  }
               }
            } catch (FileNotFoundException var16) {
               ;
            } catch (IOException var17) {
               ;
            } catch (JindentException var18) {
               ;
            }
         }

         URL var19 = k.f();
         if(k.b(var19)) {
            File var20 = k.c(var19);

            try {
               BufferedWriter var21 = new BufferedWriter(new FileWriter(var20));
               var21.write(var5.toString());
               var21.close();
            } catch (IOException var15) {
               DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.i), a("X#U\u0007\robX\u001b\u0007z6^I\ribL\u001b\u000bo\'\u001b\u0000\f\u007f\'CI\u0004r.^I@") + var20.getAbsolutePath() + a("9l1") + a("K.^\b\u0011~b^\u0007\u0011n0^I\u001bt7\u001b\u0001\u0003m\'\u001b\u001e\u0010r6^I\u0003x!^\u001a\u0011;6TI\u0016s+HI\u0004r.^I\u0003u&\u001b\u001d\r;&R\u001b\u0007x6T\u001b\u001b;`") + var20.getParentFile().getAbsolutePath() + a("9l"));
            }
         }

         var2.dispose();
      }

      this.updateJPanel();
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static void access$000(RegistrationGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.showLicense(var1, var2);
   }

   static void access$100(RegistrationGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.addLicenseFromFile(var1, var2);
   }

   static void access$200(RegistrationGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.addLicenseFromClipboard(var1, var2);
   }

   static void access$300(RegistrationGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.removeLicense(var1, var2);
   }

   static JTable access$400(RegistrationGUIObject var0) {
      return var0.i;
   }

   static void access$500(RegistrationGUIObject var0, String var1) throws JindentException {
      var0.installLicenseKey0(var1);
   }

   static void access$600(RegistrationGUIObject var0) {
      var0.updateLicenseKeys();
   }

   static void access$700(RegistrationGUIObject var0, CustomizerData var1, EventObject var2) {
      var0.removeLicense0(var1, var2);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 27;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 59;
            break;
         case 3:
            var10003 = 105;
            break;
         default:
            var10003 = 98;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
