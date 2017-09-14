package jindent.formatter.d;

import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.s;
import jindent.formatter.d.m;
import jindent.util.MyVector;

public class i implements s {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   private i d = null;
   private MyVector e = new MyVector();
   private String f = null;
   private int g = 0;

   public void a(m var1) {
      this.e.d(var1);
   }

   public void a(i var1) {
      this.e.d(var1);
   }

   public void a(Context var1) {
      if(this.b()) {
         this.d.a(var1);
      } else {
         this.b(var1);
      }

   }

   void b(Context var1) {
      int var2 = this.c(var1);
      int var3;
      int var4;
      Object var5;
      m var6;
      i var7;
      if(var2 == 2) {
         var3 = this.e.c();

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = this.e.d(var4);
            if(var5 instanceof m) {
               var6 = (m)this.e.d(var4);
               var6.m();
            }
         }

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = this.e.d(var4);
            if(var5 instanceof i) {
               var7 = (i)this.e.d(var4);
               var7.b(var1);
            }
         }
      }

      if(var2 == 1) {
         var3 = this.e.c();

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = this.e.d(var4);
            if(var5 instanceof m) {
               var6 = (m)this.e.d(var4);
               if(var6.k()) {
                  var6.m();
               }
            }
         }

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = this.e.d(var4);
            if(var5 instanceof i) {
               var7 = (i)this.e.d(var4);
               var7.b(var1);
            }
         }
      }

   }

   public void b(i var1) {
      this.d = var1;
   }

   public i a() {
      return this.d;
   }

   public boolean b() {
      return this.d != null;
   }

   public int c(Context var1) {
      this.g = 0;
      int var2 = this.e.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         Object var4 = this.e.d(var3);
         if(var4 instanceof m) {
            m var7 = (m)var4;
            if(!var7.p() && !var7.o()) {
               if(var7.n()) {
                  this.g = Math.max(this.g, 1);
               }
            } else {
               this.g = Math.max(this.g, 2);
            }
         } else if(var4 instanceof i) {
            i var5 = (i)var4;
            int var6 = var5.c(var1);
            this.g = Math.max(this.g, var6);
         }
      }

      return this.g;
   }

   public void a(q var1) {
      int var2 = this.e.c();

      for(int var3 = 0; var3 < var2; ++var3) {
         Object var4 = this.e.d(var3);
         if(var4 instanceof m) {
            m var5 = (m)var4;
            if(var5.g() == 1 && var5.d() == null) {
               var5.b(var1);
            }
         }
      }

   }

   public void a(String var1) {
      this.f = var1;
   }

   public String toString() {
      return this.b("");
   }

   public String b(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var1);
      var2.append(c("XD\u0003R`p`#Ieskz\u001d."));
      var2.append(this.f);
      var2.append(c(">?J"));
      int var3 = this.e.c();

      for(int var4 = 0; var4 < var3; ++var4) {
         Object var5 = this.e.d(var4);
         if(var5 instanceof m) {
            m var6 = (m)var5;
            var2.append(var6.c(var1 + c("<%`")));
         } else if(var5 instanceof i) {
            i var7 = (i)var5;
            var2.append(var7.b(var1 + c("<%`")));
         }
      }

      var2.append("\n");
      return var2.toString();
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 28;
            break;
         case 1:
            var10003 = 5;
            break;
         case 2:
            var10003 = 64;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 12;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
