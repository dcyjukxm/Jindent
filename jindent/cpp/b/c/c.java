package jindent.cpp.b.c;

import java.util.HashMap;
import java.util.Map;

public class c {
   private Map a = new HashMap();

   public void a(int var1, int var2) {
      this.a.put(Integer.valueOf(var1), Integer.valueOf(var2));
   }

   public int a(int var1) {
      Integer var2 = (Integer)this.a.get(Integer.valueOf(var1));
      return var2 == null?-1:var2.intValue();
   }

   public boolean b(int var1, int var2) {
      int var3 = this.a(var1);
      return var3 == var2;
   }

   public String toString() {
      return this.a.toString();
   }
}
