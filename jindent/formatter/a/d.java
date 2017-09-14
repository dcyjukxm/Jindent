package jindent.formatter.a;

import java.util.HashMap;
import jindent.util.e;

public class d {
   private static final String a = ":";
   protected HashMap b;
   protected int c;

   public d() {
      this.a();
   }

   public void a() {
      this.b = new HashMap();
      this.c = 0;
   }

   public void a(int var1, String var2) {
      this.b.put(String.valueOf(var1), var2);
   }

   public int b() {
      return this.c;
   }

   public void a(int var1) {
      this.b.remove(String.valueOf(var1));
   }

   public void c() {
      this.a(this.b());
   }

   public boolean b(int var1) {
      return this.b.containsKey(String.valueOf(var1));
   }

   public String c(int var1) {
      return (String)this.b.get(String.valueOf(var1));
   }

   public static String a(String var0, int var1) {
      jindent.util.d var2 = new jindent.util.d(var0);
      e var3 = var2.d();
      return var3.a() + ":" + var1 + var3.b();
   }

   public static int a(String var0) {
      jindent.util.d var1 = new jindent.util.d(var0);
      String var2 = var1.b();
      int var3 = var2.lastIndexOf(":") + ":".length();
      if(var3 != -1) {
         String var4 = var2.substring(var3);
         return Integer.parseInt(var4);
      } else {
         return -1;
      }
   }

   public int d() {
      return ++this.c;
   }
}
