package jindent.util;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jindent.util.MyStringBuffer;
import jindent.util.e;

public class d {
   private static final char a = '\uffff';
   private int b;
   private boolean c;
   private String d;
   private int e;
   private List f;
   private boolean g;
   private int h;
   private int i;

   public d(String var1) {
      this(var1, false);
   }

   public d(String var1, boolean var2) {
      this.b = -2;
      this.c = false;
      this.d = var1;
      this.c = var2;
      this.g = false;
      this.i = 0;
   }

   public int a() {
      if(!this.g) {
         this.g();
      }

      return this.f.size();
   }

   public String b() {
      return this.d().a();
   }

   public String c() {
      MyStringBuffer var1 = new MyStringBuffer();

      while(this.f()) {
         var1.a(this.b());
      }

      return var1.toString();
   }

   public e d() {
      if(!this.g) {
         this.g();
      }

      return this.h();
   }

   public boolean e() {
      if(!this.g) {
         this.g();
      }

      return this.f();
   }

   private boolean f() {
      return this.h < this.f.size();
   }

   private void g() {
      this.e = 0;
      this.f = new ArrayList();
      this.h = 0;
      e var1 = null;

      while((var1 = this.j()) != null) {
         this.f.add(var1);
      }

      this.g = true;
   }

   private e h() throws NoSuchElementException {
      if(!this.f()) {
         throw new NoSuchElementException();
      } else {
         return (e)this.f.get(this.h++);
      }
   }

   public void a(int var1) {
      if(this.h > var1) {
         this.h -= var1;
      } else {
         throw new IllegalArgumentException(a("$G\u00101w\u0013\u0006\u000e*k\u000f\u0006\u001c>{\f\u0006") + var1 + a("GR\u00114}\tU_"));
      }
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   private char i() {
      return this.e >= this.d.length()?'\uffff':this.d.charAt(this.e++);
   }

   private e j() {
      char var1 = '\uffff';
      int var5;
      if(this.b != -2) {
         var5 = this.b;
         this.b = -2;
      } else {
         var5 = this.i();
      }

      if(var5 == '\uffff') {
         return null;
      } else {
         String var2 = "";
         StringBuffer var3 = new StringBuffer();

         boolean var4;
         for(var4 = false; var5 != '\uffff'; var5 = this.i()) {
            if(var4) {
               var4 = false;
               if(var5 == 10) {
                  var2 = a("j,");
               } else {
                  this.b = var5;
                  var2 = "\r";
               }
               break;
            }

            if(var5 == 13) {
               var4 = true;
            } else {
               if(var5 == 10) {
                  var2 = "\n";
                  break;
               }

               var3.append((char)var5);
            }
         }

         if(var5 == '\uffff' && var4) {
            var2 = "\r";
         }

         if(this.c) {
            var3.append(var2);
            var2 = "";
         }

         ++this.i;
         return new e(this, var3.toString(), var2, this.i);
      }
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append(this.a());
      var1.append("\n");

      while(this.e()) {
         var1.append("\"");
         var1.append(this.b());
         var1.append("\"");
         var1.append("\n");
      }

      return var1.toString();
   }

   public static void main(String[] var0) {
      String var1 = a("\u0006G\u001fR\u0012\u0005D\u001cU\u0012");
      d var2 = new d(var1, true);

      while(var2.e()) {
         e var3 = var2.d();
         System.out.println(a("\u0013I\u0015:v]\u0006\\") + var3.a() + "\"");
         System.out.println(a("\u0017I\r+\"G\u0004") + var3.b() + "\"");
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
            var10003 = 103;
            break;
         case 1:
            var10003 = 38;
            break;
         case 2:
            var10003 = 126;
            break;
         case 3:
            var10003 = 95;
            break;
         default:
            var10003 = 24;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
