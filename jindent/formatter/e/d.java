package jindent.formatter.e;

import java.util.Vector;

public class d {
   protected Vector a;

   protected d() {
      this.a = new Vector();
   }

   public d(String var1) {
      this();
      jindent.util.d var2 = new jindent.util.d(var1);
      int var3 = var2.a();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2.b();
         this.a(b(var5));
      }

   }

   public void a(String var1) {
      this.a.add(var1);
   }

   public void a(String var1, int var2) {
      this.a.setElementAt(var1, var2);
   }

   public int a() {
      return this.a.size();
   }

   public String a(int var1) {
      return (String)this.a.elementAt(var1);
   }

   protected static String b(String var0) {
      int var1 = var0.length();

      for(char[] var2 = var0.toCharArray(); 0 < var1 && var2[var1 - 1] == 32; --var1) {
         ;
      }

      return var1 > 0?var0.substring(0, var1):"";
   }
}
