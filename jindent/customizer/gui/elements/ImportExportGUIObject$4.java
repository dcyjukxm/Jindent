package jindent.customizer.gui.elements;

import jindent.JindentSettings;
import jindent.customizer.gui.elements.ImportExportGUIObject;

class ImportExportGUIObject$4 implements Runnable {
   private final String a;
   private final JindentSettings b;
   private final ImportExportGUIObject c;

   ImportExportGUIObject$4(ImportExportGUIObject var1, String var2, JindentSettings var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      ImportExportGUIObject.access$300(this.c, this.a, this.b);
   }
}
