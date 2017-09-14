package jindent.customizer.gui.elements.a;

import java.util.StringTokenizer;
import java.util.zip.CRC32;
import jindent.JindentException;
import jindent.util.MyVector;
import jindent.util.b.c;

public class a {
   private String a;
   private MyVector b;
   private String c;
   private String d;
   private int e;
   private String f;

   public a(String var1, String var2, int var3, String var4, String var5) throws JindentException {
      try {
         this.a = var1;
         this.b = new MyVector();
         this.d = var2;
         StringTokenizer var6 = new StringTokenizer(var2, ",");

         while(var6.hasMoreTokens()) {
            this.b.d(var6.nextToken().trim());
         }

         this.e = var3;
         this.f = var4;
         this.c = var5;
      } catch (Exception var7) {
         throw new JindentException(b("Z\u0002G\u000b\u001d?\u0007]\r\u0003zPG\u0001\u000e{\u0019[\u0003Os\u0019V\u0001\u0001l\u0015\u0015\u000f\nfPQ\u0005\u001b~"));
      }
   }

   public String a() {
      return this.a;
   }

   public String a(int var1) {
      return (String)this.b.d(var1);
   }

   public int b() {
      return this.b.c();
   }

   public String c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public static jindent.customizer.gui.elements.a.a a(String var0) throws JindentException {
      try {
         byte[] var1 = c.a(var0);
         int var2 = -1;
         int var3 = -1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            if(var3 == -1 && var1[var5] == 124) {
               var3 = var5;
            }

            if(var1[var5] == 0) {
               var2 = var5;
               break;
            }
         }

         if(var2 != -1 && var3 != -1) {
            StringTokenizer var18 = new StringTokenizer(new String(var1, 0, var2, b("V#zIW\'E\fI^")), "|");
            String var6 = var18.nextToken();
            long var7 = Long.parseLong(var6);
            String var9 = var18.nextToken();
            String var10 = var18.nextToken();
            int var11 = Integer.parseInt(var18.nextToken());
            String var12 = var18.nextToken();
            String var13 = var18.nextToken();
            CRC32 var14 = new CRC32();
            var14.update(var1, var3 + 1, var1.length - (var3 + 1));
            long var15 = var14.getValue();
            if(var7 != var15) {
               throw new JindentException();
            } else {
               return new jindent.customizer.gui.elements.a.a(var9, var10, var11, var12, var13);
            }
         } else {
            throw new JindentException();
         }
      } catch (Exception var17) {
         throw new JindentException(b("V\u0004\u0015\u0017\nz\u001dFD\u001bw\u0011AD\u0016p\u0005GD\u0003v\u0013P\n\u001czP^\u0001\u0016?\u0019FD\fp\u0002G\u0011\u001fk^?4\u0003z\u0011F\u0001O}\u0005\\\b\u000b?\u0011\u0015\n\nhPY\r\fz\u001eF\u0001Oy\u0019Y\u0001Oy\u001fGD\u001fm\u001fE\u0001\u001d?\u0019[\u0017\u001b~\u001cY\u0005\u001bv\u001f[J"));
      }
   }

   public int e() {
      return this.e;
   }

   public String f() {
      return this.f;
   }

   public String g() {
      return this.a() + b("1\u001aY\u000f");
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 31;
            break;
         case 1:
            var10003 = 112;
            break;
         case 2:
            var10003 = 53;
            break;
         case 3:
            var10003 = 100;
            break;
         default:
            var10003 = 111;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
