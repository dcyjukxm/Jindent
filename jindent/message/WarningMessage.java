package jindent.message;

import jindent.formatter.q;
import jindent.message.Message;

public class WarningMessage extends Message {
   public WarningMessage(String var1, String var2, int var3) {
      super(var1, var2, var3);
   }

   public WarningMessage(String var1, String var2, int var3, q var4) {
      super(var1, var2, var3, var4);
   }

   public WarningMessage(String var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public Message copyWithoutReferences() {
      return new WarningMessage(this.c, this.d, this.e, this.getColumn(), this.getLine(), this.g);
   }
}
