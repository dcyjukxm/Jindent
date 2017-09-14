package jindent.customizer.gui.settings;

import jindent.customizer.gui.settings.UserVariablesGUIObject;

public class SystemVariablesGUIObject extends UserVariablesGUIObject {
   public SystemVariablesGUIObject(String var1, String var2) {
      super(var1, var2);
      this.setEditable(false);
   }
}
