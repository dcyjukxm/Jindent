package jindent.cpp.b.a;

public class e {
   public static final int STATE_IN_STRING = 3;
   public static final int STATE_TRAILING_COMMENT = 1;
   public static final int STATE_DEFAULT = 0;
   public static final int STATE_BLOCK_COMMENT = 2;
   private int a;
   private String b;
   private String c;
   private int d;
   private int e;
   private int f;
   private int g;

   public e(int var1, String var2, String var3, int var4, int var5, int var6, int var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var6;
      this.f = var5;
      this.g = var7;
   }

   public int a() {
      return this.d;
   }

   public void a(int var1) {
      this.d = var1;
   }

   public int b() {
      return this.f;
   }

   public void b(int var1) {
      this.f = var1;
   }

   public int c() {
      return this.e;
   }

   public void c(int var1) {
      this.e = var1;
   }

   public int d() {
      return this.g;
   }

   public void d(int var1) {
      this.g = var1;
   }

   public String e() {
      return this.c;
   }

   public void a(String var1) {
      this.c = var1;
   }

   public String f() {
      return this.b;
   }

   public void b(String var1) {
      this.b = var1;
   }

   public String toString() {
      return this.b;
   }

   public int g() {
      return this.a;
   }

   public void e(int var1) {
      this.a = var1;
   }
}
