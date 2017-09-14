package jindent.message;

import jindent.formatter.q;
import jindent.message.Message;

public class ErrorMessage extends Message {
   public ErrorMessage(String var1, String var2) {
      super(var1, var2, 5);
   }

   public ErrorMessage(String var1, String var2, int var3, int var4, int var5) {
      super(var1, var2, 5, var3, var4, var5);
   }

   public ErrorMessage(String var1, String var2, q var3) {
      super(var1, var2, 5, var3);
   }

   public Message copyWithoutReferences() {
      return new ErrorMessage(this.c, this.d, this.getColumn(), this.getLine(), this.g);
   }
}
