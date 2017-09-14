package jindent.customizer.constraint;

import javax.swing.JCheckBox;
import jindent.customizer.constraint.Actor;

public class INumberActor extends Actor {
   private JCheckBox b;

   public INumberActor(String var1, JCheckBox var2) {
      super(var1);
      this.b = var2;
   }

   public boolean isActive() {
      return this.b.isSelected();
   }
}
