package jindent.cpp.b.c.b;

public class PreProcessorException extends RuntimeException {
   private int a;
   private static final long serialVersionUID = 1L;

   public PreProcessorException(String var1) {
      this(var1, -1);
   }

   public PreProcessorException(String var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public int a() {
      return this.a;
   }

   public boolean b() {
      return this.a != -1;
   }
}
