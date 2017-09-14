package jindent.cpp.a;

import java.io.FileInputStream;
import java.io.IOException;
import jindent.cpp.b.a.d;
import jindent.formatter.q;
import jindent.formatter.u;
import jindent.util.MyStringBuffer;

public class b {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 3;
   private static final int e = 4;
   private static final char f = '\f';

   public b() {
      this.a();
   }

   public void a() {
   }

   public String a(q var1) {
      String var2 = this.b(var1);
      return this.a(var2);
   }

   private String b(q var1) {
      MyStringBuffer var2 = new MyStringBuffer();
      q var3 = var1;
      String var4 = null;

      for(String var5 = null; var3 != null; var3 = var3.g) {
         if(!this.c(var3)) {
            q var6 = var3.h;
            if(var6 != null) {
               for(q var7 = u.H(var6); var7 != null; var7 = var7.g) {
                  String var8 = var7.f;
                  if(var8 != null && !"".equals(var8) && u.t(var7)) {
                     var2.a(var8);
                  }
               }
            }
         }

         var4 = var3.f;
         if(var4 != null && !"".equals(var4)) {
            if(var4.equals("*") && var5.equals("/")) {
               var2.a(" ");
            }

            var2.a(var4);
            var5 = var4;
         }
      }

      return var2.toString();
   }

   private boolean c(q var1) {
      return var1.a == -19;
   }

   public String a(String var1) {
      d var2 = new d(var1, d("PjL(aZ?c\u0005B"));
      MyStringBuffer var3 = new MyStringBuffer();
      byte var4 = 0;
      int var5 = 0;
      String var6 = "";

      while(var2.a()) {
         String var7 = var6;
         var6 = var2.b();
         String var8 = var2.a(0);
         byte var9 = var4;
         if(var6.equals("\\")) {
            ++var5;
         }

         if(var4 == 0) {
            if(var6.equals("\'") && var5 % 2 == 0) {
               var4 = 4;
            }

            if(var6.equals("\"") && var5 % 2 == 0) {
               var4 = 3;
            }

            if(var6.equals("/") && var8.equals("*")) {
               var4 = 2;
            }

            if(var6.equals("/") && var8.equals("/")) {
               var4 = 1;
            }
         }

         if(var4 != 2 && var4 != 1 && !this.b(var6) && !this.c(var6)) {
            var3.a(var6);
         }

         if(var4 == var9) {
            if(var4 == 2 && var7.equals("*") && var6.equals("/")) {
               var4 = 0;
            }

            if(var4 == 1 && this.b(var6)) {
               var4 = 0;
            }

            if(var4 == 3 && "\"".equals(var6) && var5 % 2 == 0) {
               var4 = 0;
            }

            if(var4 == 4 && "\'".equals(var6) && var5 % 2 == 0) {
               var4 = 0;
            }
         }

         if(!var6.equals("\\")) {
            var5 = 0;
         }
      }

      return var3.toString();
   }

   private boolean b(String var1) {
      return "\n".equals(var1) || "\r".equals(var1);
   }

   private boolean c(String var1) {
      return " ".equals(var1) || "\t".equals(var1) || var1.equals(String.valueOf('\f'));
   }

   public static void main(String[] var0) throws IOException {
      b var1 = new b();
      FileInputStream var2 = new FileInputStream(d("3\f2Z=\u0015D\u001dS\u001a\u001fT\u0007n=,r\u000b|%\u0004Y\u001eS\n\u001fU\u001bb+\u001eB\u001dS:\u0015E\u001a!-"));
      int var3 = var2.available();
      byte[] var4 = new byte[var3];
      var2.read(var4);
      String var5 = new String(var4);
      System.out.println(var1.a(var5));
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 112;
            break;
         case 1:
            var10003 = 54;
            break;
         case 2:
            var10003 = 110;
            break;
         case 3:
            var10003 = 15;
            break;
         default:
            var10003 = 78;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
