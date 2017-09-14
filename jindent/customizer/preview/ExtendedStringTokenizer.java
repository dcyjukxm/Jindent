package jindent.customizer.preview;

import java.util.StringTokenizer;
import jindent.util.MyVector;

public class ExtendedStringTokenizer extends StringTokenizer {
   private MyVector a = null;
   private int b;
   private boolean c;

   public ExtendedStringTokenizer(String var1, int var2) {
      super(var1);
      this.initCache(var2);
   }

   public ExtendedStringTokenizer(String var1, String var2, int var3) {
      super(var1, var2);
      this.initCache(var3);
   }

   public ExtendedStringTokenizer(String var1, String var2, boolean var3, int var4) {
      super(var1, var2, var3);
      this.initCache(var4);
   }

   public void consumeTokens(int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         this.nextToken();
      }

   }

   private void initCache(int var1) {
      this.a = new MyVector();
      int var2 = this.a.c();

      for(int var3 = 0; var3 < var1 && super.hasMoreTokens(); ++var3) {
         this.a.d(super.nextToken());
      }

      this.c = true;
   }

   private String popTokenFromCache() {
      if(!this.c) {
         this.a.e(0);
      } else {
         this.c = false;
      }

      if(this.a.c() > 0) {
         String var1 = (String)this.a.d(0);
         if(super.hasMoreTokens()) {
            this.a.d(super.nextToken());
         }

         return var1;
      } else {
         return null;
      }
   }

   public String nextToken() {
      return this.popTokenFromCache();
   }

   public Object nextElement() {
      return this.nextToken();
   }

   public String peekNextToken(int var1) {
      if(var1 >= this.a.c()) {
         return null;
      } else {
         String var2 = (String)this.a.d(var1);
         return var2;
      }
   }

   public boolean hasMoreElements() {
      return this.hasMoreTokens();
   }

   public boolean hasMoreTokens() {
      return this.a.c() > 1;
   }

   public static void main(String[] var0) {
      ExtendedStringTokenizer var1 = new ExtendedStringTokenizer(a("\u001e9<9p\u001d:}z2\u001bx89t\u0019x:9z\u00170}p{\u0016x79y\u0014x1u"), " ", 4);

      while(var1.hasMoreTokens()) {
         String var2 = var1.nextToken();
         System.out.print("(" + var2 + ")");

         for(int var3 = 0; var3 < 3; ++var3) {
            System.out.print(var1.peekNextToken(var3) + a("Sx"));
         }

         System.out.println();
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
            var10003 = 127;
            break;
         case 1:
            var10003 = 88;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 25;
            break;
         default:
            var10003 = 18;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
