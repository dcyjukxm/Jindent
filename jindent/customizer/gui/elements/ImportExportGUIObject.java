package jindent.customizer.gui.elements;

import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.SettingsUtils;
import jindent.SettingsVersionException;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.ImportExportGUIObject$1;
import jindent.customizer.gui.elements.ImportExportGUIObject$2;
import jindent.customizer.gui.elements.ImportExportGUIObject$3;
import jindent.customizer.gui.elements.ImportExportGUIObject$4;
import jindent.customizer.javahelp.HelpUtils;
import jindent.imports.SettingsImportFactory;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

public class ImportExportGUIObject extends GUIObject {
   private JButton f;
   private JButton g;
   private JPanel h;
   private CustomizerData i;

   public ImportExportGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.h = var1;
      this.i = var2;
      JLabel var5 = new JLabel(a("XGKj\u000ee\nh`\beCUb\u000f1lIj\u00111lRi\u0019"), SwingUtils.readImageIcon(a("#\u001eC7H>CVu\u0013c^\t+\f\u007fM")), 2);
      this.f = new JButton(a("XGKj\u000ee"));
      this.f.addActionListener(new ImportExportGUIObject$1(this));
      var1.add(var5, a("RewP1_uzI5Vd~A"));
      var1.add(this.f, a("WftR#Pd\u007fZ2T}dW3F"));
      JLabel var6 = new JLabel(a("TRKj\u000ee\nh`\beCUb\u000f1~T%:xF^"), SwingUtils.readImageIcon(a("#\u001eC7H>OCu\u0013c^\t+\f\u007fM")), 2);
      this.g = new JButton(a("TRKj\u000ee"));
      this.g.addActionListener(new ImportExportGUIObject$2(this));
      var1.add(var6, a("RewP1_uzI5Vd~A"));
      var1.add(this.g, a("WftR#Pd\u007fZ2T}dW3F"));
      this.updateJPanel();
      if(var3 != null) {
         HelpUtils.setHelpIDString((Component)var5, var3);
         HelpUtils.setHelpIDString((Component)this.f, var3);
         HelpUtils.setHelpIDString((Component)var6, var3);
         HelpUtils.setHelpIDString((Component)this.g, var3);
      } else {
         System.err.println(a("YOWu\u0017tS\u001b") + this.getName() + a("1CH%\u0012dFW"));
      }

      this.setAddedToJPanel(true);
   }

   public void updateJPanel() {
   }

   private void fileOpen() {
      JFileChooser var1 = SwingUtils.getOpenSettingsFileChooser();
      if(this.i.isChanged()) {
         int var2 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this.h), a("^Z^k\\p\nU`\u000b1LRi\u00191KUa\\uCHf\u001dcN\u001bp\u0012bKM`\u00181ISd\u0012vOH:"));
         if(var2 == 2) {
            return;
         }
      }

      if(var1.showOpenDialog(SwingUtils.findWindow((Container)this.h)) == 0) {
         String var3 = var1.getSelectedFile().getPath();
         this.readSettings(var3);
      }

   }

   private void readSettings(String var1) {
      SwingUtilities.invokeLater(new ImportExportGUIObject$3(this, var1));
   }

   private void readSettings0(String var1) {
      JindentSettings var2 = null;

      try {
         var2 = JindentSettings.createFromFileAndCheckVersion(var1);
      } catch (FileNotFoundException var7) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.h), var7.getMessage());
      } catch (JindentException var8) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.h), var8.getMessage());
      } catch (SettingsVersionException var9) {
         SettingsVersionException var3 = var9;
         int var4 = DialogUtils.showImportDialog(SwingUtils.findWindow((Container)this.h), var9);
         if(var4 == 0) {
            try {
               var2 = SettingsImportFactory.importFrom(var3);
               DialogUtils.showInfoDialog(SwingUtils.findWindow((Container)this.h), a("XGKj\u000ee\nLd\u000f1YNf\u001ftYHc\t}\u000b"));
            } catch (JindentException var6) {
               DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.h), var6.getMessage());
            }
         }
      }

      if(var2 != null) {
         this.setSettings(var2);
      }

   }

   protected void setSettings(JindentSettings var1) {
      this.i.getEventHandler().setBlockEvents(true);
      this.i.connectSettings(var1);
      this.i.updateGUI();
      this.i.getEventHandler().setBlockEvents(false);
      this.i.getEventHandler().fireEvent(new CustomizerEvent(this, 2, (Object)null));
      this.i.setChanged(true);
   }

   private void fileSaveAs() {
      JFileChooser var1 = SwingUtils.getSaveSettingsFileChooser();
      File var2 = var1.getCurrentDirectory();
      JindentSettings var3 = this.i.getConnectedJindentSettings();
      File var4 = new File(var2.getName(), SettingsUtils.createFilenameFromSettings(var3));
      var1.setSelectedFile(var4);
      if(0 == var1.showSaveDialog(SwingUtils.findWindow((Container)this.h))) {
         String var5 = var1.getSelectedFile().getPath();
         this.writeSettings(var5, var3);
      }

   }

   private void writeSettings(String var1, JindentSettings var2) {
      SwingUtilities.invokeLater(new ImportExportGUIObject$4(this, var1, var2));
   }

   private void writeSettings0(String var1, JindentSettings var2) {
      if((new File(var1)).exists()) {
         int var3 = DialogUtils.showQuestionDialog(SwingUtils.findWindow((Container)this.h), a("WCW`\\pFI`\u001duS\u001b`\u0004xYOv]\u001bx^u\u0010pI^%\u001axF^%") + var1 + a("1\u0015"));
         if(var3 == 2) {
            return;
         }
      }

      try {
         var2.writeToFile(var1);
         this.i.setChanged(false);
         DialogUtils.showInfoDialog(SwingUtils.findWindow((Container)this.h), a("TRKj\u000ee\nLd\u000f1YNf\u001ftYHc\t}\u000b"));
      } catch (JindentException var4) {
         DialogUtils.showErrorDialog(SwingUtils.findWindow((Container)this.h), var4.getMessage());
      }

   }

   static void access$000(ImportExportGUIObject var0) {
      var0.fileOpen();
   }

   static void access$100(ImportExportGUIObject var0) {
      var0.fileSaveAs();
   }

   static void access$200(ImportExportGUIObject var0, String var1) {
      var0.readSettings0(var1);
   }

   static void access$300(ImportExportGUIObject var0, String var1, JindentSettings var2) {
      var0.writeSettings0(var1, var2);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 17;
            break;
         case 1:
            var10003 = 42;
            break;
         case 2:
            var10003 = 59;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 124;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
