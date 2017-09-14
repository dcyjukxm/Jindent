package jindent.customizer.gui.elements;

import jindent.customizer.gui.elements.ImportExportGUIObject;

class ImportExportGUIObject$3 implements Runnable {
   private final String a;
   private final ImportExportGUIObject b;

   ImportExportGUIObject$3(ImportExportGUIObject var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      ImportExportGUIObject.access$200(this.b, this.a);
   }
}
