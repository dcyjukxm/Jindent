package jindent.customizer.gui.elements;

import java.awt.Container;
import java.awt.Window;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import jindent.customizer.gui.elements.RegistrationGUIObject;
import jindent.util.swing.SwingUtils;

class RegistrationGUIObject$6 implements ActionListener {
   private final JTextArea a;
   private final RegistrationGUIObject b;

   RegistrationGUIObject$6(RegistrationGUIObject var1, JTextArea var2) {
      this.b = var1;
      this.a = var2;
   }

   public void actionPerformed(ActionEvent var1) {
      Window var2 = SwingUtils.findWindow((Container)RegistrationGUIObject.access$400(this.b));
      Transferable var3 = var2.getToolkit().getSystemClipboard().getContents(var2);
      if(var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var4 = (String)var3.getTransferData(DataFlavor.stringFlavor);
            this.a.setText(var4);
         } catch (Exception var5) {
            ;
         }
      }

   }
}
