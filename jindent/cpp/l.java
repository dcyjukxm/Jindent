package jindent.cpp;

import jindent.cpp.j;
import jindent.cpp.k;

public class l {
   j a = null;
   private boolean b = false;
   j c = new j((j)null);

   public l() {
      this.a();
   }

   public void a() {
      this.c = new j((j)null);
      this.a = null;
   }

   public j a(String var1, boolean var2) {
      if(this.a == null) {
         this.a = this.c;
      }

      Object var3;
      if(var1 != null) {
         if(var2) {
            var3 = new k(var1, this.a);
         } else {
            var3 = new j(var1, var2, this.a);
         }
      } else {
         var3 = new j(this.a);
      }

      this.a = (j)var3;
      if(this.b) {
         System.out.println(h("^En\u0019\u001dsOi\\t0") + ((j)var3).a());
      }

      return (j)var3;
   }

   public void a(j var1) {
      this.a = var1;
   }

   public void a(String var1) {
      this.a.b(var1);
   }

   public boolean b(String var1) {
      if(var1 == null) {
         return false;
      } else if(var1.indexOf(h("*\u001a")) == -1) {
         return this.c(var1);
      } else {
         j var2 = this.f(var1);
         return var2 != null?var2.d(var1.substring(var1.lastIndexOf(h("*\u001a")) + 2, var1.length())):false;
      }
   }

   public boolean c(String var1) {
      return this.a.d(var1);
   }

   public void b() {
      if(this.a != this.c) {
         if(this.b) {
            System.out.println(h("SLvJ\'~G9j-\u007fP|\u0003n") + this.a.a());
         }

         this.a = this.a.g();
      }

   }

   public boolean d(String var1) {
      if(var1 == null) {
         return false;
      } else {
         if(this.b) {
            System.out.println(var1 + h("0Ij\u0019 \u007fT9W;|L8"));
         }

         int var2 = var1.indexOf(126);
         if(var2 != -1) {
            var1 = var1.substring(0, var2) + var1.substring(var2 + 1);
            if(this.b) {
               System.out.println(h("BEtV8uD9Gt") + var1);
            }
         }

         if(var1.indexOf(h("*\u001a")) == -1) {
            if(this.b) {
               System.out.println(h("TO|Jn~Om\u0019-\u007fNmX\'~\u0000#\u0003n") + (this.e(var1) != null));
               System.out.println(h("SUkK+~T9J-\u007fP|\u0003") + this.a.g);
            }

            return this.e(var1) != null;
         } else {
            j var3 = this.f(var1);
            if(var3 != null && var3.f != null) {
               return var3.f.e(var1.substring(var1.lastIndexOf(h("*\u001a")) + 2, var1.length())) == var3;
            } else {
               int var4 = var1.lastIndexOf(h("*\u001a"));
               String var5 = var1.substring(0, var4);
               String var6 = var1.substring(var4 + 2);
               if(var6.startsWith("~")) {
                  var6 = var6.substring(1);
               }

               return var5.equals(var6);
            }
         }
      }
   }

   public j c() {
      return this.a;
   }

   public j e(String var1) {
      return this.a.e(var1);
   }

   public j f(String var1) {
      int var3 = 0;
      byte var4 = 0;
      if(var1.indexOf(h("*\u001a")) == -1) {
         return this.e(var1);
      } else {
         j var2;
         if(var1.indexOf(h("*\u001a")) == 0) {
            var2 = (j)this.c.c().getFirst();
            var4 = 2;
         } else {
            var2 = this.c();
         }

         int var5 = var1.lastIndexOf(h("*\u001a"));
         if(var5 < var4) {
            return var2;
         } else {
            String var6 = var1.substring(var4, var5);

            do {
               int var7;
               if((var7 = var6.indexOf(h("*\u001a"), var3)) == -1) {
                  if(var2 == this.c()) {
                     return this.e(var6.substring(var3, var6.length()));
                  }

                  return var2.e(var6.substring(var3, var6.length()));
               }

               var2 = var2.e(var6.substring(var3, var7));
               var3 = var7 + 2;
            } while(var2 != null);

            return null;
         }
      }
   }

   public j g(String var1) {
      int var2 = var1.lastIndexOf(h("*\u001a"));
      if(var2 == -1) {
         return this.e(var1);
      } else {
         j var3 = this.f(var1);
         return var3 == null?null:var3.e(var1.substring(var2 + 2));
      }
   }

   private static String h(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 16;
            break;
         case 1:
            var10003 = 32;
            break;
         case 2:
            var10003 = 25;
            break;
         case 3:
            var10003 = 57;
            break;
         default:
            var10003 = 78;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
