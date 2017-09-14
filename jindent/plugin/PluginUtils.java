package jindent.plugin;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.SettingsVersionException;
import jindent.customizer.CustomizerData;
import jindent.customizer.xml.CustomizerDataFactory;
import jindent.debugger.JindentLogging;
import jindent.imports.SettingsImportFactory;
import jindent.plugin.DefaultSettingsPersistence;
import jindent.plugin.PluginDataHolder;
import jindent.plugin.PluginSettingsPersistence;
import jindent.plugin.debugger.PluginDebugger;
import jindent.util.swing.SwingUtils;

public class PluginUtils {
   private static final String a = System.getProperties().getProperty(a("\"KOLc?WG[")) + a("xrCP)2V^n!\"_CPc;WM");
   private static PluginSettingsPersistence b = null;

   public static String createFormatNodeString(String var0) {
      return a("\u0011WXS,#\u0018KR!w^CR($\u0018CPmu") + var0 + "\"";
   }

   public static String createFormatFileString(String var0) {
      return a("\u0011WXS,#\u0018LW!2\u0018\b") + var0 + "\"";
   }

   public static String createFormatSelectedFilesString() {
      return a("\u0011WXS,#\u0018Y[!2[^[)w^CR($");
   }

   public static ImageIcon getIcon16() {
      return SwingUtils.readImageIcon(a("f\u000eR\u000f{xRCP)2V^\u0010*>^"));
   }

   public static ImageIcon getIcon32() {
      return SwingUtils.readImageIcon(a("d\nR\r\u007fxRCP)2V^\u0010=9_"));
   }

   public static void logToFile(String var0, Exception var1) {
      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(a, true));
         var1.printStackTrace(var2);
         var2.close();
      } catch (Exception var3) {
         ;
      }

   }

   public static void logToFile(String var0, String var1) {
      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(a, true));
         var2.println(var1);
         var2.close();
      } catch (Exception var3) {
         ;
      }

   }

   public static PluginDataHolder initPluginDataHolder(PluginDebugger var0, int var1) {
      return initPluginDataHolder(new DefaultSettingsPersistence(), var0, var1);
   }

   public static PluginDataHolder initPluginDataHolder(PluginSettingsPersistence var0, PluginDebugger var1, int var2) {
      b = var0;
      PluginDataHolder var3 = PluginDataHolder.getInstance();
      var1.init();
      var3.setPluginDebugger(var1);
      CustomizerData var4 = CustomizerDataFactory.newCustomizerDataInstance(var2);
      var3.setCustomizerData(var4);
      var4.getEventHandler().setBlockEvents(true);
      JindentSettings var5 = null;
      Logger var6 = JindentLogging.getLogger();

      try {
         var5 = b.loadSettings();
      } catch (SettingsVersionException var10) {
         SettingsVersionException var7 = var10;
         var6.warning(a("\u001dQDZ(9L\nn!\"_CPm1W_P)wKOJ9>VMMm1QF[m Q^Vm6\u0018ZL(!QEK>wNOL>>WD\u001e#\"UH[?y\u0018cS=8J^[)wKOJ9>VMMm>V^Qm9]]\u001e\u0007>VN[##\u0018\\[?$QEPc"));

         try {
            var5 = SettingsImportFactory.importFrom(var7);
         } catch (JindentException var9) {
            var6.warning(a("\u0000YY\u001e#8L\n_/;]\nJ\"wQGN\"%L\nX\"\"VN\u001e\u0007>VN[##\u0018Y[9#QDY>y\u0018n[+6MFJm\u001dQDZ(9L\nM(#LCP*$\u0018]W!;\u0018H[m\"KOZc"));
            var5 = createDefaultSettings();
         }
      } catch (FileNotFoundException var11) {
         var6.warning(a("\u001dQDZ(9L\nn!\"_CPm YY\u001e#8L\n_/;]\nJ\"w^CP)wKOJ9>VMMm1QF[cwuKG/2\u0018LW?$L\n],;T\nQ+wHFK*>V\u0015"));
         var5 = createDefaultSettings();
      } catch (JindentException var12) {
         var6.log(Level.SEVERE, a("\u001dQDZ(9LoF.2H^W\"9"), var12);
         var5 = createDefaultSettings();
      } catch (IOException var13) {
         var6.log(Level.SEVERE, a("\u001ewoF.2H^W\"9"), var13);
         var5 = createDefaultSettings();
      }

      var4.connectSettings(var5);
      var3.setJindentSettings(var5);
      var4.updateGUI();
      var4.getEventHandler().setBlockEvents(false);
      return var3;
   }

   public static void saveSettings(JindentSettings var0) throws JindentException, IOException {
      b.saveSettings(var0);
   }

   public static JindentSettings createDefaultSettings() {
      JindentSettings var0 = null;

      try {
         var0 = b.createDefaultSettings();
         saveSettings(var0);
      } catch (Exception var2) {
         JindentLogging.getLogger().log(Level.SEVERE, a("\u001dQDZ(9LoF.2H^W\"9"), var2);
      }

      return var0;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 87;
            break;
         case 1:
            var10003 = 56;
            break;
         case 2:
            var10003 = 42;
            break;
         case 3:
            var10003 = 62;
            break;
         default:
            var10003 = 77;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
