package jindent.plugin;

import jindent.JindentSettings;
import jindent.customizer.CustomizerData;
import jindent.plugin.debugger.PluginDebugger;

public class PluginDataHolder {
   private static PluginDataHolder a = null;
   private CustomizerData b;
   private JindentSettings c;
   private PluginDebugger d;

   public static PluginDataHolder getInstance() {
      if(a == null) {
         a = new PluginDataHolder();
      }

      return a;
   }

   public CustomizerData getCustomizerData() {
      return this.b;
   }

   public void setCustomizerData(CustomizerData var1) {
      this.b = var1;
   }

   public JindentSettings getJindentSettings() {
      return this.c;
   }

   public void setJindentSettings(JindentSettings var1) {
      this.c = var1;
   }

   public PluginDebugger getPluginDebugger() {
      return this.d;
   }

   public void setPluginDebugger(PluginDebugger var1) {
      this.d = var1;
   }
}
