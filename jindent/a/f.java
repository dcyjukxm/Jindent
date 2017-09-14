package jindent.a;

import java.util.Vector;
import jindent.a.e;

public class f extends e {
   Vector i;

   public void e(e var1) {
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
            if(((e)this.i.elementAt(var2)).d(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public f(String var1, e var2) {
      super(var1, true, var2);
   }
}
