package jindent.cpp.a;

import jindent.JindentException;
import jindent.cpp.a.b;
import jindent.cpp.a.c;
import jindent.formatter.q;
import jindent.formatter.c.d;

public class a implements jindent.formatter.c.b, d, jindent.formatter.c.c {
   private static final boolean a = true;
   private String b;
   private String c;
   private b d = new b();
   private c e = new c();

   public String a() {
      return c("^\nOc\fa\u001bO`\ra\n\neN M\u001b");
   }

   public String a(String var1) throws JindentException {
      this.d.a();
      this.b = this.d.a(var1);
      return var1;
   }

   public void a(q var1) throws JindentException {
      this.c = this.d.a(var1);
      this.e.a(this.b, this.c);
   }

   public String b(String var1) {
      this.c = this.d.a(var1);
      this.e.a(this.b, this.c);
      return var1;
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 14;
            break;
         case 1:
            var10003 = 120;
            break;
         case 2:
            var10003 = 42;
            break;
         case 3:
            var10003 = 19;
            break;
         default:
            var10003 = 126;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
