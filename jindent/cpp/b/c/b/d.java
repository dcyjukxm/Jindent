package jindent.cpp.b.c.b;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jindent.JindentException;
import jindent.MessageList;
import jindent.cpp.b.c.b.c;
import jindent.cpp.b.c.b.e;
import jindent.formatter.m;

public class d {
   private Map a;
   private jindent.cpp.b.c.a.e b;
   private List c;
   private m d;
   private String e;
   private int f;
   private int g;

   public d(String var1, jindent.cpp.b.c.a.e var2, Map var3, int var4) {
      this.e = var1;
      this.c = new ArrayList();
      this.b = var2;
      this.a = var3;
      this.f = 0;
      this.g = var4;
   }

   private int a() {
      return this.c.size();
   }

   private c a(int var1, int var2) {
      if(this.d()) {
         jindent.debugger.a.b(a("\u000f\\!}{%@#<`9Z4i{lH+n/%J~<") + var1 + a("`\u000e-rk)V~<") + var2);
         this.b();
         jindent.cpp.b.c.a.d var3 = (jindent.cpp.b.c.a.d)this.a.get(Integer.valueOf(var1));
         var3.a(var2);

         jindent.cpp.b.c.a.d var4;
         for(; var3 != null; var3 = var4) {
            var4 = var3.c();
            if(var4 != null) {
               int var5 = var4.d(var3);
               var4.a(var5);
            }
         }

         e var6 = new e();
         this.b.a((jindent.cpp.b.c.a.a.a)var6);
         return var6.d();
      } else {
         return new c(this.e, new MessageList(), new jindent.cpp.b.c.c());
      }
   }

   public c b(int var1, int var2) throws JindentException {
      jindent.debugger.a.b(a("\r]/ua+\u000e+i{<[0<i#\\dukv\u000e") + var1 + a("`\u000e-rk)V~<") + var2);
      c var3 = null;
      String var4 = null;
      var3 = this.c(var1, var2);
      if(var3 == null) {
         var3 = this.a(var1, var2);
         this.c.add(var3);
      }

      var4 = var3.a();
      if(jindent.debugger.a.b()) {
         try {
            FileWriter var5 = new FileWriter(a("(K&ih\u0013") + var1 + "_" + var2 + a("bM4l"));
            var5.write(var4);
            var5.close();
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      ++this.f;
      String var9 = this.d.a(var4);
      if(jindent.debugger.a.b()) {
         try {
            FileWriter var6 = new FileWriter(a("(K&ih\u0013") + var1 + "_" + var2 + a("\u0013H+nb-Z0ykbM4l"));
            var6.write(var9);
            var6.close();
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

      MessageList var10 = (MessageList)this.d.d().getMessageList().clone();
      var3 = new c(var9, var10, var3.b());
      return var3;
   }

   private c c(int var1, int var2) {
      int var3 = this.a();

      for(int var4 = 0; var4 < var3; ++var4) {
         c var5 = (c)this.c.get(var4);
         jindent.cpp.b.c.c var6 = var5.b();
         if(var6.b(var1, var2)) {
            return var5;
         }
      }

      return null;
   }

   private void b() {
      for(int var1 = 0; var1 <= this.g; ++var1) {
         jindent.cpp.b.c.a.d var2 = (jindent.cpp.b.c.a.d)this.a.get(Integer.valueOf(var1));
         if(var2 != null) {
            int var3 = var2.e();
            if(var3 > 1) {
               boolean[] var4 = this.a(var3, false);
               int var5 = this.a();

               int var6;
               for(var6 = 0; var6 < var5; ++var6) {
                  c var7 = (c)this.c.get(var6);
                  jindent.cpp.b.c.c var8 = var7.b();
                  int var9 = var8.a(var1);
                  if(var9 != -1) {
                     var4[var9] = true;
                  }
               }

               var6 = this.a(var4, false);
               if(var6 != -1) {
                  var2.a(var6);
               }
            }
         }
      }

   }

   private boolean[] a(int var1, boolean var2) {
      boolean[] var3 = new boolean[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var2;
      }

      return var3;
   }

   private int a(boolean[] var1, boolean var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         if(var1[var3] == var2) {
            return var3;
         }
      }

      return -1;
   }

   public void a(m var1) {
      this.d = var1;
   }

   public String c() {
      return this.e;
   }

   public boolean d() {
      return this.a.size() > 0;
   }

   public int e() {
      return this.f;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 76;
            break;
         case 1:
            var10003 = 46;
            break;
         case 2:
            var10003 = 68;
            break;
         case 3:
            var10003 = 28;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
