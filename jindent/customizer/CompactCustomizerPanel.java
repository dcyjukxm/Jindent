package jindent.customizer;

import javax.swing.JSplitPane;
import jindent.JindentSettings;
import jindent.JindentSystem;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerPanel;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.xml.CustomizerDataFactory;

public class CompactCustomizerPanel extends JSplitPane {
   private SourcePreviewPane a;
   private CustomizerPanel b;
   protected CustomizerData c;

   public CompactCustomizerPanel(CustomizerData var1) {
      this.setOpaque(true);
      this.setOneTouchExpandable(true);
      this.c = var1;
      this.a = new SourcePreviewPane(var1);
      this.b = new CustomizerPanel(var1);
      this.setLeftComponent(this.b);
      this.setRightComponent(this.a);
      this.initDividerLocations();
   }

   public void initDividerLocations() {
      this.b.initDividerLocations();
      this.setDividerLocation(0.8D);
      this.setResizeWeight(0.8D);
   }

   public void initScrollBars() {
      this.b.initScrollBars();
   }

   public void dispose() {
      if(this.a != null) {
         this.a.dispose();
      }

      if(this.b != null) {
         this.b.dispose();
      }

   }

   public static void main(String[] var0) {
      CustomizerData var1 = CustomizerDataFactory.newCustomizerDataInstance();
      JindentSettings var2 = JindentSystem.getDefaultJindentSettings();
      var1.connectSettings(var2);
      new CompactCustomizerPanel(var1);
   }
}
