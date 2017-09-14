package jindent.a;

import jindent.a.e;
import jindent.a.f;

public class g {
   e a = null;
   private boolean b = false;
   e c = new e((e)null);

   public g() {
      this.a();
   }

   public void a() {
      this.c = new e((e)null);
      this.a = null;
   }

   public e a(String var1, boolean var2) {
      if(this.a == null) {
         this.a = this.c;
      }

      Object var3;
      if(var1 != null) {
         if(var2) {
            var3 = new f(var1, this.a);
         } else {
            var3 = new e(var1, var2, this.a);
         }
      } else {
         var3 = new e(this.a);
      }

      this.a = (e)var3;
      if(this.b) {
         System.out.println(h("[\u001aAA*v\u0010F\u0004C5") + ((e)var3).a());
      }

      return (e)var3;
   }

   public void a(e var1) {
      this.a = var1;
   }

   public void a(String var1) {
      this.a.b(var1);
   }

   public boolean b(String var1) {
      if(var1 == null) {
         return false;
      } else if(var1.indexOf(h("/E")) == -1) {
         return this.c(var1);
      } else {
         e var2 = this.f(var1);
         return var2 != null?var2.d(var1.substring(var1.lastIndexOf(h("/E")) + 2, var1.length())):false;
      }
   }

   public boolean c(String var1) {
      return this.a.d(var1);
   }

   public void b() {
      if(this.a != this.c) {
         if(this.b) {
            System.out.println(h("V\u0013Y\u0012\u0010{\u0018\u00162\u001az\u000fS[Y") + this.a.a());
         }

         this.a = this.a.g();
      }

   }

   public boolean d(String var1) {
      if(var1 == null) {
         return false;
      } else {
         if(this.b) {
            System.out.println(var1 + h("5\u0016EA\u0017z\u000b\u0016\u000f\fy\u0013\u0017"));
         }

         int var2 = var1.indexOf(126);
         if(var2 != -1) {
            var1 = var1.substring(0, var2) + var1.substring(var2 + 1);
            if(this.b) {
               System.out.println(h("G\u001a[\u000e\u000fp\u001b\u0016\u001fC") + var1);
            }
         }

         if(var1.indexOf(h("/E")) == -1) {
            if(this.b) {
               System.out.println(h("Q\u0010S\u0012Y{\u0010BA\u001az\u0011B\u0000\u0010{_\f[Y") + (this.e(var1) != null));
               System.out.println(h("V\nD\u0013\u001c{\u000b\u0016\u0012\u001az\u000fS[") + this.a.g);
            }

            return this.e(var1) != null;
         } else {
            e var3 = this.f(var1);
            if(var3 != null && var3.f != null) {
               return var3.f.e(var1.substring(var1.lastIndexOf(h("/E")) + 2, var1.length())) == var3;
            } else {
               int var4 = var1.lastIndexOf(h("/E"));
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

   public e c() {
      return this.a;
   }

   public e e(String var1) {
      return this.a.e(var1);
   }

   public e f(String var1) {
      int var3 = 0;
      byte var4 = 0;
      if(var1.indexOf(h("/E")) == -1) {
         return this.e(var1);
      } else {
         e var2;
         if(var1.indexOf(h("/E")) == 0) {
            var2 = (e)this.c.c().getFirst();
            var4 = 2;
         } else {
            var2 = this.c();
         }

         int var5 = var1.lastIndexOf(h("/E"));
         if(var5 < var4) {
            return var2;
         } else {
            String var6 = var1.substring(var4, var5);

            do {
               int var7;
               if((var7 = var6.indexOf(h("/E"), var3)) == -1) {
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

   public e g(String var1) {
      int var2 = var1.lastIndexOf(h("/E"));
      if(var2 == -1) {
         return this.e(var1);
      } else {
         e var3 = this.f(var1);
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
            var10003 = 21;
            break;
         case 1:
            var10003 = 127;
            break;
         case 2:
            var10003 = 54;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 121;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
