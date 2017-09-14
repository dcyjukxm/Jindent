package jindent.customizer.gui.settings;

import javax.swing.text.JTextComponent;

public interface TextGUIObject {
   JTextComponent getJTextComponent();

   void setTextLocked(boolean var1);

   boolean isTextLocked();
}
