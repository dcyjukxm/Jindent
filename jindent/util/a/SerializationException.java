package jindent.util.a;

public class SerializationException extends RuntimeException {
   public SerializationException(Exception var1) {
      super(var1.getMessage());
   }

   public SerializationException(String var1) {
      super(var1);
   }

   public SerializationException() {
   }
}
