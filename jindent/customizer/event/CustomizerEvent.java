package jindent.customizer.event;

import java.util.EventObject;

public class CustomizerEvent extends EventObject {
   public static final int ID_SETTING_CHANGED = 0;
   public static final int ID_TREE_CHANGED_PANEL = 1;
   public static final int ID_SHOW_PREVIEW = 2;
   public static final int ID_COMPONENTS_CHANGED = 3;
   public static final int ID_CLOSE_PREVIEW = 4;
   private int a;
   private Object b;

   public CustomizerEvent(Object var1, int var2) {
      super(var1);
      this.a = var2;
      this.b = null;
   }

   public CustomizerEvent(Object var1, int var2, Object var3) {
      super(var1);
      this.a = var2;
      this.b = var3;
   }

   public int getID() {
      return this.a;
   }

   public Object getParam() {
      return this.b;
   }
}
