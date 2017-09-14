package jindent.settings.sorter;

import java.io.Serializable;
import jindent.settings.sorter.SorterElement;

public class OptionalSorterElement extends SorterElement implements Cloneable {
   private static final long serialVersionUID = 3256718498527982391L;
   private boolean sort;

   public OptionalSorterElement(String var1, int var2, boolean var3) {
      super(var1, var2);
      this.sort = var3;
   }

   public boolean isSort() {
      return this.sort;
   }

   public boolean getSort() {
      return this.isSort();
   }

   public void setSort(boolean var1) {
      this.sort = var1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
