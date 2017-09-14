package jindent.customizer.preview;

import java.awt.Component;
import java.awt.Container;
import jindent.customizer.CustomizerTabbedPane;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.preview.SourcePreviewPane;

class SourcePreviewPane$1 implements CustomizerEventListener {
   private final SourcePreviewPane a;

   SourcePreviewPane$1(SourcePreviewPane var1) {
      this.a = var1;
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(var1.getID() == 2 || var1.getID() == 0) {
         if(var1.getParam() instanceof CustomizerTabbedPane) {
            CustomizerTabbedPane var2 = (CustomizerTabbedPane)var1.getParam();
            if(this.a(var2)) {
               SourcePreviewPane.access$000(this.a, var2);
            } else {
               CustomizerTabbedPane var3 = this.a((Container)var2.getSelectedComponent());
               if(var3 != null) {
                  SourcePreviewPane.access$000(this.a, var3);
               } else {
                  this.a.updateNoPreview();
               }
            }
         } else {
            this.a.updatePreview();
         }
      }

   }

   private boolean a(CustomizerTabbedPane var1) {
      int var2 = var1.getSelectedIndex();
      String var3 = var1.getPreviewAt(var2);
      return var3 != null;
   }

   private CustomizerTabbedPane a(Container var1) {
      if(var1 == null) {
         return null;
      } else {
         Component[] var2 = var1.getComponents();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Component var5 = var2[var4];
            if(var5 instanceof CustomizerTabbedPane) {
               if(this.a((CustomizerTabbedPane)var5)) {
                  return (CustomizerTabbedPane)var5;
               }

               var5 = ((CustomizerTabbedPane)var5).getSelectedComponent();
            }

            if(var5 instanceof Container) {
               CustomizerTabbedPane var6 = this.a((Container)var5);
               if(var6 != null) {
                  return var6;
               }
            }
         }

         return null;
      }
   }
}
