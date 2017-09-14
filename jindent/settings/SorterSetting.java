package jindent.settings;

import java.io.Serializable;
import jindent.settings.DefaultSetting;
import jindent.settings.sorter.SorterElement;

public class SorterSetting extends DefaultSetting {
   private static final long serialVersionUID = 3257001077361816880L;
   private SorterElement sorterRoot;

   public SorterSetting(String var1) {
      super(var1);
   }

   public SorterElement getSorterRoot() {
      return this.sorterRoot;
   }

   public void setSorterRoot(SorterElement var1) {
      this.sorterRoot = var1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }
}
