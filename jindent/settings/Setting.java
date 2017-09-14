package jindent.settings;

import java.io.Serializable;

public interface Setting extends Serializable, Cloneable {
   void setName(String var1);

   String getName();

   Object clone();
}
