package jindent.cpp.b.c;

import jindent.cpp.b.c.e;
import jindent.formatter.Context;
import jindent.formatter.m;

class h extends Context {
   private final e o;

   h(e var1, int var2, String var3, String var4, int var5) {
      super(var2, var3, var4, var5);
      this.o = var1;
   }

   public m newParser() {
      return this.o;
   }
}
