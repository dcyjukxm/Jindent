package jindent.customizer;

import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.JindentSystem;
import jindent.SettingsUtils;
import jindent.SettingsVersionException;
import jindent.customizer.CompactCustomizerPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerFrame$1;
import jindent.customizer.CustomizerFrame$2;
import jindent.customizer.CustomizerFrame$3;
import jindent.customizer.CustomizerFrame$4;
import jindent.customizer.CustomizerFrame$5;
import jindent.customizer.CustomizerFrame$6;
import jindent.customizer.CustomizerFrame$7;
import jindent.customizer.CustomizerFrame$8;
import jindent.customizer.CustomizerFrame$9;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.SettingsFileEventListener;
import jindent.customizer.javahelp.HelpUtils;
import jindent.formatter.k;
import jindent.imports.SettingsImportFactory;
import jindent.util.c.b;
import jindent.util.c.e;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class CustomizerFrame extends JFrame {
   public static final int MODE_CALL_SYSTEM_EXIT = 1;
   public static final int MODE_CALL_DISPOSE = 2;
   public static final int MODE_CALL_DISPOSE_NO_SPLASH = 3;
   private static final String a = "&\"/v]?)?";
   private static final int b = 1024;
   private static final int c = 600;
   private CustomizerData d;
   private String e;
   private JindentSettings f;
   private JMenuBar g;
   private JMenu h;
   private JMenuItem i;
   private JMenuItem j;
   private JMenuItem k;
   private JMenuItem l;
   private JMenu m;
   private JMenuItem n;
   private JMenuItem o;
   private int p;
   private CompactCustomizerPanel q;
   private ArrayList r;

   public CustomizerFrame(CustomizerData var1, int var2) {
      this(var1, (String)null, var2);
   }

   public CustomizerFrame(CustomizerData var1, String var2, int var3) {
      this.d = var1;
      this.p = var3;
      this.r = new ArrayList();
      this.setSize(new Dimension(1024, 600));
      this.setIconImage(SwingUtils.readImageIcon(a("bz#.\u001f|&2qM6\"/@J&?/pD:6>m\u0007#\"<")).getImage());
      this.g = new JMenuBar();
      this.h = new JMenu(a("\u0015%7z"));
      this.h.add(this.i = new JMenuItem(a("\u001c<>q\u0007}b")));
      this.i.addActionListener(new CustomizerFrame$1(this));
      this.i.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|*4sM6>uoG4")));
      this.h.add(this.j = new JMenuItem(a("\u0000--z")));
      this.j.addActionListener(new CustomizerFrame$2(this));
      this.j.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|(2lB\f.7jL}<5x")));
      this.h.add(this.k = new JMenuItem(a("\u0000--z\t\u0012?u1\u0007")));
      this.k.addActionListener(new CustomizerFrame$3(this));
      this.k.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|(2lB\f.7jL\f;2qM<;uoG4")));
      this.h.add(new JSeparator());
      this.h.add(this.l = new JMenuItem(a("\u001642k")));
      this.l.addActionListener(new CustomizerFrame$4(this));
      this.l.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|)#v]}<5x")));
      this.g.add(this.h);
      this.setDefaultCloseOperation(0);
      this.addWindowListener(new CustomizerFrame$5(this));
      var1.getEventHandler().addEventListener(new CustomizerFrame$6(this, var1));
      this.m = new JMenu(a("\u001b)7o"));
      this.n = new JMenuItem(a("\u001b)7o\t\u0007#+vJ "));
      this.n.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|$>sY}<5x")));
      this.m.add(this.n);
      HelpUtils.addHelp(this.n, this);
      this.o = new JMenuItem(a("\u0012.4j]}bu"));
      this.o.setIcon(SwingUtils.readImageIcon(a("bz#.\u001f|-9p\\\'b+qN")));
      this.o.addActionListener(new CustomizerFrame$7(this));
      this.m.add(this.o);
      this.g.add(this.m);
      this.setJMenuBar(this.g);
      this.q = new CompactCustomizerPanel(var1);
      this.getContentPane().add(this.q);
      this.q.initDividerLocations();
      SwingUtils.centerWindow(this);
      this.setVisible(true);
      this.setSettingsFilename(a("&\"/v]?)?"));
      this.setSettings(JindentSystem.getDefaultJindentSettings());
      if(var2 != null) {
         this.readSettings(var2);
      }

      if(!k.a() && var3 != 3) {
         b.a(this, new e());
      }

   }

   private void fileExit() {
      if(this.d.isChanged()) {
         int var1 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), a("\u000292k\t2\"??M:?8~[7l.qZ2:>{\t0$:qN6?d"));
         if(var1 == 2) {
            return;
         }
      }

      switch(this.p) {
      case 1:
         this.dispose();
         System.exit(0);
         break;
      case 2:
      case 3:
         this.dispose();
      }

   }

   private void fileOpen() {
      JFileChooser var1 = SwingUtils.getOpenSettingsFileChooser();
      if(this.d.isChanged()) {
         int var2 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), a("\u001c<>q\t2l5z^s*2sLs-5{\t7%(|H!({jG --zMs/3~G4)("));
         if(var2 == 2) {
            return;
         }
      }

      if(var1.showOpenDialog(this) == 0) {
         String var3 = var1.getSelectedFile().getPath();
         this.readSettings(var3);
      }

   }

   private void readSettings(String var1) {
      CustomizerFrame$8 var2 = new CustomizerFrame$8(this, var1);
      var2.start();
   }

   private void readSettings0(String var1) {
      JindentSettings var2 = null;

      try {
         var2 = JindentSettings.createFromFileAndCheckVersion(var1);
      } catch (FileNotFoundException var7) {
         DialogUtils.showErrorDialog(this, var7.getMessage());
      } catch (JindentException var8) {
         DialogUtils.showErrorDialog(this, var8.getMessage());
      } catch (SettingsVersionException var9) {
         SettingsVersionException var3 = var9;
         int var4 = DialogUtils.showImportDialog(this, var9);
         if(var4 == 0) {
            try {
               var2 = SettingsImportFactory.importFrom(var3);
            } catch (JindentException var6) {
               DialogUtils.showErrorDialog(this, var6.getMessage());
            }
         }
      }

      if(var2 != null) {
         this.setSettingsFilename(var1);
         this.setSettings(var2);
         this.initScrollPane();
      }

   }

   private void fileSave() {
      if(!this.e.equals(a("&\"/v]?)?")) && SettingsUtils.isValidSettingsFilename(this.e)) {
         this.writeSettings(this.e);
      } else {
         this.fileSaveAs();
      }

   }

   private void fileSaveAs() {
      JFileChooser var1 = SwingUtils.getSaveSettingsFileChooser();
      File var2 = var1.getCurrentDirectory();
      File var3;
      if(this.e.equals(a("&\"/v]?)?"))) {
         var3 = new File(var2.getName(), SettingsUtils.createFilenameFromSettings(this.f));
      } else {
         var3 = new File(var2.getName(), this.e);
      }

      var1.setSelectedFile(var3);
      if(0 == var1.showSaveDialog(this)) {
         String var4 = var1.getSelectedFile().getPath();
         this.writeSettings(var4);
      }

   }

   private void writeSettings(String var1) {
      CustomizerFrame$9 var2 = new CustomizerFrame$9(this, var1);
      var2.start();
   }

   private void writeSettings0(String var1) {
      if((new File(var1)).exists()) {
         int var2 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this), a("\u0001)+sH0){y@?){") + var1 + a("ss"));
         if(var2 == 2) {
            return;
         }
      }

      try {
         this.f.writeToFile(var1);
         this.d.setChanged(false);
         this.setSettingsFilename(var1);
      } catch (JindentException var3) {
         DialogUtils.showErrorDialog(this, var3.getMessage());
      }

   }

   protected void initScrollPane() {
   }

   protected void setSettingsFilename(String var1) {
      this.e = var1;
      this.setTitle(a("\u0019%5{L=8{\\\\ 84r@)))?\u0004s\u0017") + var1 + "]");
   }

   protected void setSettings(JindentSettings var1) {
      this.f = var1;
      this.d.getEventHandler().setBlockEvents(true);
      this.d.connectSettings(var1);
      this.d.updateGUI();
      this.d.getEventHandler().setBlockEvents(false);
      this.d.getEventHandler().fireEvent(new CustomizerEvent(this, 2, (Object)null));
      this.d.setChanged(false);
   }

   public void addSettingsFileEventListener(SettingsFileEventListener var1) {
      this.r.add(var1);
   }

   public void removeSettingsFileEventListener(SettingsFileEventListener var1) {
      this.r.remove(var1);
   }

   private void fireReadSettingsFileEvent(String var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((SettingsFileEventListener)this.r.get(var2)).readSettingsFile(var1);
      }

   }

   private void fireWriteSettingsFileEvent(String var1) {
      for(int var2 = 0; var2 < this.r.size(); ++var2) {
         ((SettingsFileEventListener)this.r.get(var2)).writeSettingsFile(var1);
      }

   }

   public void dispose() {
      super.dispose();
      if(this.q != null) {
         this.q.dispose();
      }

   }

   static void access$000(CustomizerFrame var0) {
      var0.fileOpen();
   }

   static void access$100(CustomizerFrame var0) {
      var0.fileSave();
   }

   static void access$200(CustomizerFrame var0) {
      var0.fileSaveAs();
   }

   static void access$300(CustomizerFrame var0) {
      var0.fileExit();
   }

   static void access$400(CustomizerFrame var0, String var1) {
      var0.readSettings0(var1);
   }

   static void access$500(CustomizerFrame var0, String var1) {
      var0.fireReadSettingsFileEvent(var1);
   }

   static void access$600(CustomizerFrame var0, String var1) {
      var0.writeSettings0(var1);
   }

   static void access$700(CustomizerFrame var0, String var1) {
      var0.fireWriteSettingsFileEvent(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 83;
            break;
         case 1:
            var10003 = 76;
            break;
         case 2:
            var10003 = 91;
            break;
         case 3:
            var10003 = 31;
            break;
         default:
            var10003 = 41;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
