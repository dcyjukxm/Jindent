package jindent.customizer.constraint;

import jindent.customizer.constraint.Actor;
import jindent.util.swing.MultiLineCheckBox;

public class BooleanActor extends Actor {
   private MultiLineCheckBox b;

   public BooleanActor(String var1, MultiLineCheckBox var2) {
      super(var1);
      this.b = var2;
   }

   public boolean isActive() {
      return this.b.a();
   }
}
