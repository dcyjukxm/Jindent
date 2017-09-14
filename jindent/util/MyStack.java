package jindent.util;

import java.util.EmptyStackException;
import jindent.util.MyVector;

public class MyStack extends MyVector {
   private static final long serialVersionUID = 1224463164541339165L;

   public Object f(Object var1) {
      this.d(var1);
      return var1;
   }

   public synchronized Object i() {
      int var2 = this.c();
      Object var1 = this.j();
      this.e(var2 - 1);
      return var1;
   }

   public synchronized Object j() {
      int var1 = this.c();
      if(var1 == 0) {
         throw new EmptyStackException();
      } else {
         return this.d(var1 - 1);
      }
   }

   public boolean k() {
      return this.c() == 0;
   }

   public synchronized int g(Object var1) {
      int var2 = this.c(var1);
      return var2 >= 0?this.c() - var2:-1;
   }
}
