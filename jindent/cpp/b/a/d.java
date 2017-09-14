package jindent.cpp.b.a;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class d {
   private StringTokenizer a;
   private ArrayList b;
   private int c;

   public d(String var1, String var2) {
      this.a = new StringTokenizer(var1, var2, true);
      this.b = new ArrayList();
      this.c = 0;
   }

   public boolean a() {
      return this.b.size() == 0?this.a.hasMoreElements():true;
   }

   public String b() {
      String var1 = this.b.size() == 0?this.a.nextToken():(String)this.b.remove(0);
      this.c += var1.length();
      return var1;
   }

   public String a(int var1) {
      if(this.b.size() <= var1) {
         int var2 = this.b.size();
         int var3 = var1;

         for(int var4 = var2; var4 <= var3; ++var4) {
            if(!this.a.hasMoreTokens()) {
               return null;
            }

            String var5 = this.a.nextToken();
            this.b.add(var5);
         }
      }

      return (String)this.b.get(var1);
   }

   public static void main(String[] var0) {
      String var1 = a("\u0005\u0007qbkOH>b%\u0001");
      d var2 = new d(var1, a("H\u0007>"));

      while(var2.a()) {
         for(int var3 = 0; var3 < 5; ++var3) {
            System.out.println(var3 + a("J\fC,m\u000f\u0016") + var2.a(var3));
         }

         System.out.println(var2.b());
      }

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 100;
            break;
         case 1:
            var10003 = 44;
            break;
         case 2:
            var10003 = 19;
            break;
         case 3:
            var10003 = 73;
            break;
         default:
            var10003 = 8;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
