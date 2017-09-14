package jindent.cpp.b.d;

import java.util.ArrayList;
import java.util.Iterator;
import jindent.cpp.b.d.b;

public class c {
   private ArrayList a = new ArrayList();

   public void a(b var1) {
      this.a.add(var1);
   }

   public int a() {
      return this.a.size();
   }

   public b a(int var1) {
      return (b)this.a.get(var1);
   }

   public Iterator b() {
      return this.a.iterator();
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.b();

      while(var2.hasNext()) {
         b var3 = (b)var2.next();
         var1.append(var3);
         var1.append("\n");
      }

      return var1.toString();
   }
}
