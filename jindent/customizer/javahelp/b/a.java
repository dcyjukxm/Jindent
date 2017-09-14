package jindent.customizer.javahelp.b;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import jindent.customizer.javahelp.HelpUtils;
import jindent.customizer.javahelp.b.JavaHelpIcon;

class a implements MouseListener {
   private final String a;
   private final JavaHelpIcon b;

   a(JavaHelpIcon var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public void mouseClicked(MouseEvent var1) {
      if(HelpUtils.isUseJavaHelpOnClick()) {
         HelpUtils.showHelpID(this.b.getParent(), this.a);
      }

   }

   public void mouseEntered(MouseEvent var1) {
      if(HelpUtils.isUseJavaHelpOnClick()) {
         this.b.setIcon(JavaHelpIcon.a());
      }

   }

   public void mouseExited(MouseEvent var1) {
      if(HelpUtils.isUseJavaHelpOnClick()) {
         this.b.setIcon(JavaHelpIcon.b());
      }

   }

   public void mousePressed(MouseEvent var1) {
      if(HelpUtils.isUseJavaHelpOnClick()) {
         this.b.setIcon(JavaHelpIcon.c());
      }

   }

   public void mouseReleased(MouseEvent var1) {
      if(HelpUtils.isUseJavaHelpOnClick()) {
         this.b.setIcon(JavaHelpIcon.a());
      }

   }
}
