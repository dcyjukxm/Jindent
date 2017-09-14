package jindent.imports.a;

public class a implements Cloneable {
   private boolean a = false;
   private boolean b = false;
   private int c = -1;
   private int d = -1;
   private int e = -1;
   private boolean f = false;
   private int g = -1;
   private boolean h;

   public a() {
      this.a = false;
      this.b = false;
      this.c = -1;
      this.d = -1;
      this.e = -1;
      this.f = false;
      this.g = -1;
      this.h = false;
   }

   public a(jindent.imports.a.a var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = var1.g;
      this.h = var1.h;
   }

   public void a(boolean var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean var1) {
      this.b = var1;
   }

   public boolean b() {
      return this.b;
   }

   public void a(int var1) {
      this.c = var1;
   }

   public int c() {
      return this.c;
   }

   public void b(int var1) {
      this.d = var1;
   }

   public int d() {
      return this.d;
   }

   public void c(int var1) {
      this.e = var1;
   }

   public int e() {
      return this.e;
   }

   public void c(boolean var1) {
      this.f = var1;
   }

   public boolean f() {
      return this.f;
   }

   public void d(int var1) {
      this.g = var1;
   }

   public int g() {
      return this.g;
   }

   public void d(boolean var1) {
      this.h = var1;
   }

   public boolean h() {
      return this.h;
   }

   public Object clone() {
      return new jindent.imports.a.a(this);
   }
}
