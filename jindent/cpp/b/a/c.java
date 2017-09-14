package jindent.cpp.b.a;

import java.util.ArrayList;
import jindent.cpp.b.a.b;

/** @deprecated */
public class c {
   private ArrayList a = new ArrayList();

   public void a(b var1) {
      this.a.add(var1);
   }

   public int a() {
      return this.a.size();
   }

   public b a(int var1) {
      return (b)this.a.get(var1);
   }

   public b b() {
      return this.a() > 0?this.a(this.a() - 1):null;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("(");
      int var2 = this.a();

      for(int var3 = 0; var3 < var2; ++var3) {
         b var4 = this.a(var3);
         var1.append(var4.toString());
         if(var3 < var2 - 1) {
            var1.append(a("W\u0002"));
         }
      }

      var1.append(")");
      return var1.toString();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 123;
            break;
         case 1:
            var10003 = 34;
            break;
         case 2:
            var10003 = 68;
            break;
         case 3:
            var10003 = 115;
            break;
         default:
            var10003 = 33;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
