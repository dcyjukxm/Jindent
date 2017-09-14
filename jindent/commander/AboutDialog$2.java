package jindent.commander;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import jindent.commander.AboutDialog;

class AboutDialog$2 extends JPanel {
   private final AboutDialog a;

   AboutDialog$2(AboutDialog var1) {
      this.a = var1;
   }

   public void paintComponent(Graphics var1) {
      var1.drawImage(AboutDialog.c(), 0, 0, (ImageObserver)null);
      super.paintComponent(var1);
   }
}
