package jindent.util.swing;

import jindent.util.swing.h;
import jindent.util.swing.i;
import jindent.util.swing.j;

public abstract class SwingWorker {
   private Object a;
   private j b;

   protected synchronized Object getValue() {
      return this.a;
   }

   private synchronized void setValue(Object var1) {
      this.a = var1;
   }

   public abstract Object construct();

   public void finished() {
   }

   public void interrupt() {
      Thread var1 = this.b.a();
      if(var1 != null) {
         var1.interrupt();
      }

      this.b.b();
   }

   public Object get() {
      while(true) {
         Thread var1 = this.b.a();
         if(var1 == null) {
            return this.getValue();
         }

         try {
            var1.join();
         } catch (InterruptedException var3) {
            Thread.currentThread().interrupt();
            return null;
         }
      }
   }

   public SwingWorker() {
      h var1 = new h(this);
      i var2 = new i(this, var1);
      Thread var3 = new Thread(var2);
      this.b = new j(var3);
   }

   public void start() {
      Thread var1 = this.b.a();
      if(var1 != null) {
         var1.start();
      }

   }

   static void access$000(SwingWorker var0, Object var1) {
      var0.setValue(var1);
   }

   static j access$100(SwingWorker var0) {
      return var0.b;
   }
}
