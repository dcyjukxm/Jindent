package jindent.customizer.gui;

import javax.swing.JPanel;
import jindent.customizer.CustomizerData;

public abstract class GUIObject {
   public static final int FORMATTING_AUTOMATIC = 0;
   public static final int FORMATTING_NO_NEW_ROW = 1;
   private String a;
   private String b;
   private int c;
   private boolean d;
   private GUIObject e;

   public GUIObject(String var1, String var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
      this.d = false;
      this.e = null;
   }

   public abstract void addToJPanel(JPanel var1, CustomizerData var2, String var3);

   public abstract void updateJPanel();

   protected void setAddedToJPanel(boolean var1) {
      this.d = var1;
   }

   public String getName() {
      return this.a;
   }

   public void setDesc(String var1) {
      this.b = var1;
   }

   public String getDesc() {
      return this.b;
   }

   public boolean isAddedToJPanel() {
      return this.d;
   }

   public void setFormattingType(int var1) {
      this.c = var1;
   }

   public int getFormattingType() {
      return this.c;
   }

   public void setName(String var1) {
      this.a = var1;
   }

   public GUIObject getParent() {
      return this.e;
   }

   public void setParent(GUIObject var1) {
      this.e = var1;
   }
}
