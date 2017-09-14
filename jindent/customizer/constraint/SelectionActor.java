package jindent.customizer.constraint;

import javax.swing.JComboBox;
import jindent.customizer.constraint.Actor;

public class SelectionActor extends Actor {
   private JComboBox b;
   private int[] c;

   public SelectionActor(String var1, JComboBox var2, int[] var3) {
      super(var1);
      this.b = var2;
      this.c = var3;
   }

   public boolean isActive() {
      int var1 = this.b.getSelectedIndex();
      return var1 != -1 && this.isDisabledValue(var1);
   }

   protected boolean isDisabledValue(int var1) {
      for(int var2 = 0; var2 < this.c.length; ++var2) {
         if(var1 == this.c[var2]) {
            return true;
         }
      }

      return false;
   }
}
