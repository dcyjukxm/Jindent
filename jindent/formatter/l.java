package jindent.formatter;

public class l {
   public static final int PUBLIC = 1;
   public static final int PRIVATE = 2;
   public static final int PROTECTED = 4;
   public static final int STATIC = 8;
   public static final int FINAL = 16;
   public static final int SYNCHRONIZED = 32;
   public static final int VOLATILE = 64;
   public static final int TRANSIENT = 128;
   public static final int NATIVE = 256;
   public static final int INTERFACE = 512;
   public static final int ABSTRACT = 1024;
   public static final int STRICT = 2048;
   public static final int ANNOTATION = 4096;
   public static final int DEFAULT = 8192;
   private int a = 0;

   public void a(int var1) {
      this.a |= var1;
   }

   public boolean a() {
      return (this.a & 1) != 0;
   }

   public boolean b() {
      return (this.a & 2) != 0;
   }

   public boolean c() {
      return (this.a & 4) != 0;
   }

   public boolean d() {
      return (this.a & 8) != 0;
   }

   public boolean e() {
      return (this.a & 16) != 0;
   }

   public boolean f() {
      return (this.a & 32) != 0;
   }

   public boolean g() {
      return (this.a & 64) != 0;
   }

   public boolean h() {
      return (this.a & 128) != 0;
   }

   public boolean i() {
      return (this.a & 256) != 0;
   }

   public boolean j() {
      return (this.a & 512) != 0;
   }

   public boolean k() {
      return (this.a & 1024) != 0;
   }

   public boolean l() {
      return (this.a & 2048) != 0;
   }

   public boolean m() {
      return (this.a & 4096) != 0;
   }

   public boolean n() {
      return (this.a & 8192) != 0;
   }
}
