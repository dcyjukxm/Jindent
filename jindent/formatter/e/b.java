package jindent.formatter.e;

public class b {
   protected String a;

   protected b() {
      this.a = null;
   }

   public b(String var1) {
      this();
      this.a = var1;
   }

   public String a() {
      return this.a;
   }

   protected static String a(String var0) {
      int var1 = var0.length();

      for(char[] var2 = var0.toCharArray(); 0 < var1 && var2[var1 - 1] == 32; --var1) {
         ;
      }

      return var1 > 0?var0.substring(0, var1):"";
   }
}
