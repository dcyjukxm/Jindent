package jindent.cpp.b.d;

import java.util.Iterator;
import jindent.cpp.b.d.b;
import jindent.cpp.b.d.c;
import jindent.formatter.q;
import jindent.formatter.t;

public class d {
   private c a;
   private t b;

   public d(t var1, c var2) {
      this.b = var1;
      this.a = var2;
   }

   public q a(q var1) {
      q var2 = var1;
      Iterator var3 = this.a.b();

      while(true) {
         while(var3.hasNext()) {
            b var4 = (b)var3.next();
            q var5 = this.a(var2, var4.a(), var4.b());
            q var6 = this.b(var5, var4.e(), var4.f());
            if(var5 == null) {
               jindent.debugger.a.b(b("OC`hSyIldS\r\u001b\'oHAJ+!NXDtuTYSshRC\u001c\'") + var4);
            }

            if(var5 != null && var6 != null) {
               this.a(var5, var6, var4);
            } else {
               jindent.debugger.a.b(b("cI\'rHOUnuHYOho\u001dKIu;\u001d") + var4.toString());
            }
         }

         return var1;
      }
   }

   private void a(q var1, q var2, b var3) {
      String var4 = var3.i();
      q var5 = var2 != null?var2.g:null;
      var1.f = t.emptyString;
      var1.a = 4000;
      q var7 = this.b.b(var4);
      q var6 = this.a(var1, var7);
      var6.g = var5;
      int var8 = var4.length() - (var2.e + 1 - var1.c);
      var2.e += var8;

      for(q var9 = var5; var9 != null && !this.b(var9); var9 = var9.g) {
         var9.c += var8;
         var9.e += var8;
      }

   }

   private q a(q var1, q var2) {
      var1.g = var2;
      var2.k = var1;
      return var2;
   }

   private boolean b(q var1) {
      for(q var2 = var1.h; var2 != null; var2 = var2.h) {
         String var3 = var2.f;
         if(this.a(var3)) {
            return true;
         }
      }

      return false;
   }

   private boolean a(String var1) {
      return var1 != null && (var1.equals("\n") || var1.equals("\r") || var1.equals(b(" ,")));
   }

   private q a(q var1, int var2, int var3) {
      while(var1 != null && (var1.c != var2 || var1.b != var3)) {
         var1 = var1.g;
      }

      return var1;
   }

   private q b(q var1, int var2, int var3) {
      while(var1 != null && (var1.e != var2 || var1.d != var3)) {
         var1 = var1.g;
      }

      return var1;
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 45;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 7;
            break;
         case 3:
            var10003 = 1;
            break;
         default:
            var10003 = 61;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
