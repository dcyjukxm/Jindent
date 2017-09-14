package jindent;

public class JindentException extends Exception {
   private int column;
   private int line;
   private boolean hasColumnLineNumber;

   public JindentException() {
      this.column = -1;
      this.line = -1;
      this.hasColumnLineNumber = false;
   }

   public JindentException(String var1) {
      super(var1);
      this.column = -1;
      this.line = -1;
      this.hasColumnLineNumber = false;
   }

   public JindentException(Throwable var1) {
      super(var1);
      this.column = -1;
      this.line = -1;
      this.hasColumnLineNumber = false;
   }

   public JindentException(String var1, Exception var2) {
      super(var1, var2);
      this.column = -1;
      this.line = -1;
      this.hasColumnLineNumber = false;
   }

   public JindentException(String var1, int var2) {
      this(var1, 0, var2);
   }

   public JindentException(String var1, int var2, int var3) {
      super(var1);
      this.column = -1;
      this.line = -1;
      this.column = var2;
      this.line = var3;
      this.hasColumnLineNumber = true;
   }

   public int getColumn() {
      return this.column;
   }

   public int getLine() {
      return this.line;
   }

   public boolean hasColumnAndLineNumber() {
      return this.hasColumnLineNumber;
   }
}
