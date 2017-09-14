package jindent.customizer.preview.listener;

import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;
import jindent.customizer.CustomizerData;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;
import jindent.customizer.preview.SourcePreviewDialog;
import jindent.customizer.preview.listener.SourcePreviewDialogListener$1;
import jindent.util.swing.SwingUtils;

public class SourcePreviewDialogListener implements CustomizerEventListener {
   private static final int a = 900;
   private boolean b;
   private SourcePreviewDialog c = null;
   private CustomizerData d;
   private Timer e = null;
   private boolean f;
   private boolean g;

   public SourcePreviewDialogListener(CustomizerData var1) {
      this.d = var1;
      this.g = false;
      this.f = false;
      this.e = new Timer(900, new SourcePreviewDialogListener$1(this));
      this.b = true;
   }

   private void setTimerCloseDialog(boolean var1) {
      this.g = var1;
   }

   private boolean getTimerCloseDialog() {
      return this.g;
   }

   public void eventOccurred(CustomizerEvent var1) {
      if(!this.f) {
         label46: {
            this.f = true;
            Object var2 = var1.getSource();
            Container var3 = null;
            if(var2 instanceof Component) {
               var3 = ((Component)var2).getParent();
            }

            if(var2 instanceof Container) {
               var3 = (Container)var2;
            }

            if(var3 != null) {
               Window var4 = SwingUtils.findWindow(var3);
               if(var4 == null || !var4.isVisible()) {
                  break label46;
               }
            }

            if(var1.getID() == 4) {
               if(!this.e.isRunning()) {
                  this.e.start();
                  this.setTimerCloseDialog(true);
               }
            } else {
               this.c = this.getOrCreatePreviewDialog(var3, var1);
               if(this.c != null) {
                  if((var1.getID() == 0 || var1.getID() == 2) && this.e.isRunning()) {
                     this.setTimerCloseDialog(false);
                  }

                  if(var1.getID() == 3) {
                     ;
                  }
               }
            }
         }
      }

      this.f = false;
   }

   private SourcePreviewDialog getOrCreatePreviewDialog(Container var1, CustomizerEvent var2) {
      if((this.c == null || this.c.isDisposed()) && var1 != null) {
         Window var3 = SwingUtils.findWindow(var1);
         if(SwingUtils.hasValidPosition(var3)) {
            if(var3 instanceof JDialog) {
               this.c = new SourcePreviewDialog((JDialog)var3, this.d);
            } else if(var3 instanceof JFrame) {
               this.c = new SourcePreviewDialog((JFrame)var3, this.d);
            }
         }

         boolean var4 = this.c == null?false:this.c.isVisible();
         if(this.c != null) {
            this.c.setSize(400, 600);
            this.c.setVisible(true);
            this.d.getEventHandler().fireEvent(var2);
            if(!var4) {
               SwingUtils.alignWindows(this.c, var3);
            }
         }
      }

      return this.c;
   }

   public void disposeDialog() {
      System.out.println(a("\u001d\u007f\u0016\u0003P\ns!\u001a^\u0015y\u0002"));
      if(this.c != null) {
         this.c.setVisible(false);
         this.c.dispose();
      }

   }

   static SourcePreviewDialog access$000(SourcePreviewDialogListener var0) {
      return var0.c;
   }

   static boolean access$100(SourcePreviewDialogListener var0) {
      return var0.getTimerCloseDialog();
   }

   static Timer access$200(SourcePreviewDialogListener var0) {
      return var0.e;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 121;
            break;
         case 1:
            var10003 = 22;
            break;
         case 2:
            var10003 = 101;
            break;
         case 3:
            var10003 = 115;
            break;
         default:
            var10003 = 63;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
