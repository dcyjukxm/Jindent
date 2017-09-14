package jindent.customizer.javahelp;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

class JindentCSH$1 extends WeakHashMap {
   JindentCSH$1(int var1) {
      super(var1);
   }

   public Object put(Object var1, Object var2) {
      return super.put(var1, new WeakReference(var2));
   }

   public Object get(Object var1) {
      WeakReference var2 = (WeakReference)super.get(var1);
      return var2 != null?var2.get():null;
   }
}
