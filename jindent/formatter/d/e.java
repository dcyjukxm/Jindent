package jindent.formatter.d;

import java.util.Vector;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.t;

public class e implements s {
   protected Vector a = new Vector();
   protected Vector b = new Vector();
   protected boolean c = false;

   public void a(q var1) {
      this.a.add(var1);
   }

   public void b(q var1) {
      this.b.add(var1);
   }

   public void a() {
      if(!this.c) {
         int var1 = this.a.size();

         int var2;
         q var4;
         for(var2 = 0; var2 < var1; ++var2) {
            q var3 = (q)this.a.elementAt(var2);
            var4 = q.a();
            var4.f = emptyString;
            var4.a = -16;
            var4.l = 2;
            var4.m = null;
            var4.b = 0;
            var4.c = 0;
            var4.d = 0;
            var4.e = 0;
            var4.h = null;
            t.b(var3, var4);
         }

         var2 = this.b.size();

         for(int var6 = 0; var6 < var2; ++var6) {
            var4 = (q)this.b.elementAt(var6);
            q var5 = q.a();
            var5.f = emptyString;
            var5.a = -1;
            var5.l = 0;
            var5.m = null;
            var5.b = 0;
            var5.c = 0;
            var5.d = 0;
            var5.e = 0;
            var5.h = null;
            t.b(var4, var5);
         }

         this.c = true;
      }

   }
}
