package jindent.formatter;

import jindent.Formatter;
import jindent.formatter.Context;

public abstract class InternalFormatter extends Formatter {
   protected InternalFormatter(Context var1) {
      super(var1);
   }

   public Context getContext() {
      return this.context;
   }
}
