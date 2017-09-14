package jindent.formatter.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class a extends PushbackInputStream {
   public static final int[][] BOMS = new int[][]{{0, 0, 254, 255}, {255, 254, 0, 0}, {43, 47, 118, 56}, {43, 47, 118, 57}, {43, 47, 118, 43}, {43, 47, 118, 47}, {221, 115, 102, 115}, {239, 187, 191}, {14, 254, 255}, {251, 238, 40}, {254, 255}, {255, 254}};

   private static int a(int[] var0, int[] var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if(var0[var2] != var1[var2]) {
            return 0;
         }
      }

      return var0.length;
   }

   public a(InputStream var1) {
      super(var1, 4);

      try {
         int[] var2 = new int[]{this.read(), this.read(), this.read(), this.read()};
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < BOMS.length; ++var4) {
            var3 = a(BOMS[var4], var2);
            if(var3 != 0) {
               break;
            }
         }

         for(var4 = var2.length - 1; var4 >= var3; --var4) {
            if(var2[var4] != -1) {
               this.unread(var2[var4]);
            }
         }
      } catch (IOException var5) {
         ;
      }

   }
}
