package jindent.customizer.event;

import java.util.EventListener;
import jindent.customizer.event.CustomizerEvent;

public interface CustomizerEventListener extends EventListener {
   void eventOccurred(CustomizerEvent var1);
}
