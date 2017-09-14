package jindent.customizer.gui.elements;

import java.util.Vector;
import javax.swing.JPanel;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.preview.PreviewFilterList;

public class GUITab extends GUIObject {
   private Vector f = new Vector();
   private String g;
   private PreviewFilterList h;
   private boolean i;
   private CustomizerTabbedPane j;

   public GUITab(String var1, String var2, PreviewFilterList var3, GUIObject var4) {
      super(a("LZw\'\u0003i"), var1);
      this.g = var2;
      this.h = var3;
      this.i = false;
      this.j = null;
   }

   public void addGUIObject(GUIObject var1) {
      this.f.add(var1);
      var1.setParent(this);
   }

   public GUIObject getGUIObject(int var1) {
      return (GUIObject)this.f.elementAt(var1);
   }

   public int countGUIObjects() {
      return this.f.size();
   }

   public String getPreview() {
      return this.g;
   }

   public PreviewFilterList getPreviewFilterList() {
      return this.h;
   }

   public boolean isHidden() {
      return this.i;
   }

   public void setHidden(boolean var1) {
      this.i = var1;
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      this.j = new CustomizerTabbedPane(var2);
      var1.add(this.j, a("MCq$=JAz,,NXa!-\\"));
      this.setAddedToJPanel(true);
   }

   public CustomizerTabbedPane getTabbedPane() {
      return this.j;
   }

   public void updateJPanel() {
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 11;
            break;
         case 1:
            var10003 = 15;
            break;
         case 2:
            var10003 = 62;
            break;
         case 3:
            var10003 = 115;
            break;
         default:
            var10003 = 98;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
