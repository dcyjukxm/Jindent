package jindent.java;

import java.util.HashSet;
import java.util.Set;

public class f {
   private boolean a = false;
   private Set b = new HashSet();

   public void a(String var1) {
      this.b.add(var1);
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.b.contains(b("R$ ){t6 "));
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 29;
            break;
         case 1:
            var10003 = 82;
            break;
         case 2:
            var10003 = 69;
            break;
         case 3:
            var10003 = 91;
            break;
         default:
            var10003 = 9;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
