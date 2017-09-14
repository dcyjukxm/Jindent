package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSetting;

public class FloatSetting extends DefaultSetting {
   private static final long serialVersionUID = 3688508800776746808L;
   protected float value = 0.0F;

   public FloatSetting(String var1) {
      super(var1);
   }

   public void setValue(float var1) {
      this.value = var1;
   }

   public float getValue() {
      return this.value;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
