package jindent.customizer.preview;

import java.util.Vector;
import jindent.customizer.preview.PreviewFilter;

public class PreviewFilterList {
   private Vector a = new Vector();

   public void addFilter(PreviewFilter var1) {
      this.a.add(var1);
   }

   public int countFilters() {
      return this.a.size();
   }

   public PreviewFilter getFilterAt(int var1) {
      return (PreviewFilter)this.a.elementAt(var1);
   }
}
