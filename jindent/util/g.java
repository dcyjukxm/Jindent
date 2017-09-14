package jindent.util;

import java.util.Iterator;

public class g implements Iterator {
   private Object[] a;
   private int b = 0;

   public g(Object[] var1) {
      this.a = var1;
   }

   public boolean hasNext() {
      return this.b < this.a.length;
   }

   public Object next() {
      return this.a[this.b++];
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
