package jindent.cpp;

import java.util.Vector;
import jindent.cpp.j;

public class k extends j {
   Vector i;

   public void e(j var1) {
      if(var1 != null) {
         if(this.i == null) {
            this.i = new Vector();
         }

         this.i.addElement(var1);
      }
   }

   public boolean d(String var1) {
      if(super.d(var1)) {
         return true;
      } else if(this.i == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.i.size(); ++var2) {
            if(((j)this.i.elementAt(var2)).d(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public k(String var1, j var2) {
      super(var1, true, var2);
   }
}
