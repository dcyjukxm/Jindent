package jindent.formatter.b;

import jindent.formatter.q;
import jindent.formatter.b.h;
import jindent.formatter.b.k;

public class j extends h {
   protected k i = new k();
   protected q j = null;
   protected q k = null;
   protected q l = null;
   protected q m = null;
   protected boolean n = false;

   public j(int var1) {
      super(var1);
   }

   private void a(q var1) {
      this.j = var1;
   }

   public q b() {
      if(!this.n) {
         throw new RuntimeException(a("\u0016G#)I\u0006I:7\n0h !\f{U?)\u0000!r .\f;UglI7C)*\u001b0\u0006,$\u00059O!\"I2C;\u0011\u0006%u;$\u001b!r .\f;\u000efe\u00040R\'*\r"));
      } else {
         return this.j;
      }
   }

   private void b(q var1) {
      this.k = var1;
   }

   public q c() {
      if(!this.n) {
         throw new RuntimeException(a("\u0016G#)I\u0006I:7\n0h !\f{U?)\u0000!r .\f;UglI7C)*\u001b0\u0006,$\u00059O!\"I2C;\u0011\u0006%c!!=:M*+A|\u0006\" \u001d=I+"));
      } else {
         return this.k;
      }
   }

   private void c(q var1) {
      this.l = var1;
   }

   public q f() {
      if(!this.n) {
         throw new RuntimeException(a("\u0016G#)I\u0006I:7\n0h !\f{U?)\u0000!r .\f;UglI7C)*\u001b0\u0006,$\u00059O!\"I2C;\u0007\u0006!R (:!G=1=:M*+A|\u0006\" \u001d=I+"));
      } else {
         return this.l;
      }
   }

   private void d(q var1) {
      this.m = var1;
   }

   public q o() {
      if(!this.n) {
         throw new RuntimeException(a("\u0016G#)I\u0006I:7\n0h !\f{U?)\u0000!r .\f;UglI7C)*\u001b0\u0006,$\u00059O!\"I2C;\u0007\u0006!R (,;B\u001b*\u00020HglI8C;-\u00061"));
      } else {
         return this.m;
      }
   }

   public void p() {
      int var1 = this.i.a();
      if(var1 == 0) {
         this.a(this.k());
         this.b(this.l());
         this.c((q)null);
         this.d((q)null);
      } else {
         this.a(this.k());
         h var2 = this.i.a(0);
         q var3 = var2.k();

         q var4;
         for(var4 = this.k(); var4.g != var3; var4 = var4.g) {
            ;
         }

         this.b(var4);
         h var5 = this.i.a(var1 - 1);
         q var6 = var5.l();
         this.c(var6.g);
         this.d(this.l());
      }

      this.n = true;
   }

   public void a(h var1) {
      if(var1 == null) {
         throw new RuntimeException(a("\u0006I:7\n0c# \u00040H;e\f9C\"eTh\u0006!0\u00059\u0006&+I\u0006I:7\n0h !\f{G+!::S=&\f\u0010J*(\f;Rgl"));
      } else {
         this.i.a(var1);
         this.n = false;
      }
   }

   public k q() {
      return this.i;
   }

   public boolean r() {
      return this.i.a() > 0;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 85;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 79;
            break;
         case 3:
            var10003 = 69;
            break;
         default:
            var10003 = 105;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
