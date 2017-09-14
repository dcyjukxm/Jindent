package jindent.a;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;
import jindent.a.f;

public class e {
   Vector a = null;
   Vector b = null;
   e c = null;
   Hashtable d = new Hashtable();
   LinkedList e = new LinkedList();
   e f;
   String g;
   boolean h;

   public e(e var1) {
      this.h = false;
      this.f = var1;
      if(this.f != null) {
         this.f.d(this);
      }

   }

   public e(String var1, boolean var2, e var3) {
      this.g = var1;
      this.h = var2;
      this.f = var3;
      if(this.f != null) {
         this.f.d(this);
      }

   }

   public void a(e var1) {
      this.c = var1;
   }

   public void b(e var1) {
      if(var1 != null) {
         if(this.b == null) {
            this.b = new Vector();
         }

         this.b.addElement(var1);
      }
   }

   public void a(String var1) {
      if(var1 != null) {
         if(this.b == null) {
            this.b = new Vector();
         }

         this.b.addElement(var1);
      }
   }

   public void c(e var1) {
      if(var1 != null) {
         if(this.a == null) {
            this.a = new Vector();
         }

         this.a.addElement(var1);
      }
   }

   public String a() {
      return this.g;
   }

   public boolean b() {
      return this.h;
   }

   void d(e var1) {
      if(var1 != null) {
         this.e.add(var1);
         if(var1.a() != null) {
            this.a(var1.a(), var1);
         }
      }

   }

   LinkedList c() {
      return this.e;
   }

   public void b(String var1) {
      this.d.put(var1, var1);
   }

   public void a(String var1, e var2) {
      this.d.put(var1, var2);
   }

   public boolean d() {
      return this instanceof e && this.a() != null && !this.b();
   }

   public boolean e() {
      return this.c != null && this.d();
   }

   public boolean f() {
      return (this instanceof e || this instanceof f) && this.a() != null && this.b();
   }

   public boolean c(String var1) {
      Object var2 = this.d.get(var1);
      return var2 != null?(var2 instanceof e?!((e)var2).d():true):false;
   }

   public boolean d(String var1) {
      return this.a(var1, true);
   }

   boolean a(String var1, boolean var2) {
      if(this.c != null) {
         return this.c.a(var1, var2);
      } else if(this.c(var1)) {
         return true;
      } else {
         int var3;
         if(this.b != null) {
            for(var3 = 0; var3 < this.b.size(); ++var3) {
               Object var4 = this.b.elementAt(var3);
               String var5 = null;
               if(!(var4 instanceof e) && !(var4 instanceof f)) {
                  var5 = (String)var4;
               } else {
                  var5 = ((e)var4).a();
               }

               if(var5.equals(var1)) {
                  return true;
               }
            }
         }

         if(this.a != null) {
            for(var3 = 0; var3 < this.a.size(); ++var3) {
               e var6 = (e)this.a.elementAt(var3);
               if(var6.a(var1, false)) {
                  return true;
               }
            }
         }

         return this.f != null && var2?this.f.d(var1):false;
      }
   }

   public e g() {
      return this.f;
   }

   public e e(String var1) {
      return this.b(var1, true);
   }

   e b(String var1, boolean var2) {
      if(this.c != null) {
         return this.c.b(var1, var2);
      } else {
         Object var3 = this.d.get(var1);
         if(var3 != null && (var3 instanceof e || var3 instanceof f)) {
            return (e)var3;
         } else {
            if(this.a != null) {
               for(int var4 = 0; var4 < this.a.size(); ++var4) {
                  e var5 = ((e)this.a.elementAt(var4)).b(var1, false);
                  if(var5 != null) {
                     return var5;
                  }
               }
            }

            return this.f != null && var2?this.f.e(var1):null;
         }
      }
   }
}
