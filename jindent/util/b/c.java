package jindent.util.b;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jindent.util.b.b;

public class c {
   public static final int NO_OPTIONS = 0;
   public static final int ENCODE = 1;
   public static final int DECODE = 0;
   public static final int GZIP = 2;
   public static final int DONT_BREAK_LINES = 8;
   private static final int a = 76;
   private static final byte b = 61;
   private static final byte c = 10;
   private static final String d = "1\u0016\u000fDb";
   private static final byte[] e;
   private static final byte[] f = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
   private static final byte[] g;
   private static final byte h = -5;
   private static final byte i = -1;

   private static byte[] a(byte[] var0, byte[] var1, int var2) {
      a(var1, 0, var2, var0, 0);
      return var0;
   }

   private static byte[] a(byte[] var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = (var2 > 0?var0[var1] << 24 >>> 8:0) | (var2 > 1?var0[var1 + 1] << 24 >>> 16:0) | (var2 > 2?var0[var1 + 2] << 24 >>> 24:0);
      switch(var2) {
      case 1:
         var3[var4] = e[var5 >>> 18];
         var3[var4 + 1] = e[var5 >>> 12 & 63];
         var3[var4 + 2] = 61;
         var3[var4 + 3] = 61;
         return var3;
      case 2:
         var3[var4] = e[var5 >>> 18];
         var3[var4 + 1] = e[var5 >>> 12 & 63];
         var3[var4 + 2] = e[var5 >>> 6 & 63];
         var3[var4 + 3] = 61;
         return var3;
      case 3:
         var3[var4] = e[var5 >>> 18];
         var3[var4 + 1] = e[var5 >>> 12 & 63];
         var3[var4 + 2] = e[var5 >>> 6 & 63];
         var3[var4 + 3] = e[var5 & 63];
         return var3;
      default:
         return var3;
      }
   }

   public static String a(Serializable var0) {
      return a((Serializable)var0, 0);
   }

   public static String a(Serializable var0, int var1) {
      ByteArrayOutputStream var2 = null;
      b var3 = null;
      ObjectOutputStream var4 = null;
      GZIPOutputStream var5 = null;
      int var6 = var1 & 2;
      int var7 = var1 & 8;

      label145: {
         Object var9;
         try {
            var2 = new ByteArrayOutputStream();
            var3 = new b(var2, 1 | var7);
            if(var6 == 2) {
               var5 = new GZIPOutputStream(var3);
               var4 = new ObjectOutputStream(var5);
            } else {
               var4 = new ObjectOutputStream(var3);
            }

            var4.writeObject(var0);
            break label145;
         } catch (IOException var33) {
            var33.printStackTrace();
            var9 = null;
         } finally {
            try {
               var4.close();
            } catch (Exception var31) {
               ;
            }

            try {
               var5.close();
            } catch (Exception var30) {
               ;
            }

            try {
               var3.close();
            } catch (Exception var29) {
               ;
            }

            try {
               var2.close();
            } catch (Exception var28) {
               ;
            }

         }

         return (String)var9;
      }

      try {
         return new String(var2.toByteArray(), e("1\u0016\u000fDb"));
      } catch (UnsupportedEncodingException var32) {
         return new String(var2.toByteArray());
      }
   }

   public static String a(byte[] var0) {
      return a(var0, 0, var0.length, 0);
   }

   public static String a(byte[] var0, int var1) {
      return a(var0, 0, var0.length, var1);
   }

   public static String a(byte[] var0, int var1, int var2) {
      return a(var0, var1, var2, 0);
   }

   public static String a(byte[] var0, int var1, int var2, int var3) {
      int var4 = var3 & 8;
      int var5 = var3 & 2;
      if(var5 == 2) {
         ByteArrayOutputStream var34 = null;
         GZIPOutputStream var35 = null;
         b var36 = null;

         label191: {
            Object var37;
            try {
               var34 = new ByteArrayOutputStream();
               var36 = new b(var34, 1 | var4);
               var35 = new GZIPOutputStream(var36);
               var35.write(var0, var1, var2);
               var35.close();
               break label191;
            } catch (IOException var32) {
               var32.printStackTrace();
               var37 = null;
            } finally {
               try {
                  var35.close();
               } catch (Exception var29) {
                  ;
               }

               try {
                  var36.close();
               } catch (Exception var28) {
                  ;
               }

               try {
                  var34.close();
               } catch (Exception var27) {
                  ;
               }

            }

            return (String)var37;
         }

         try {
            return new String(var34.toByteArray(), e("1\u0016\u000fDb"));
         } catch (UnsupportedEncodingException var30) {
            return new String(var34.toByteArray());
         }
      } else {
         boolean var6 = var4 == 0;
         int var7 = var2 * 4 / 3;
         byte[] var8 = new byte[var7 + (var2 % 3 > 0?4:0) + (var6?var7 / 76:0)];
         int var9 = 0;
         int var10 = 0;
         int var11 = var2 - 2;

         for(int var12 = 0; var9 < var11; var10 += 4) {
            a(var0, var9 + var1, 3, var8, var10);
            var12 += 4;
            if(var6 && var12 == 76) {
               var8[var10 + 4] = 10;
               ++var10;
               var12 = 0;
            }

            var9 += 3;
         }

         if(var9 < var2) {
            a(var0, var9 + var1, var2 - var9, var8, var10);
            var10 += 4;
         }

         try {
            return new String(var8, 0, var10, e("1\u0016\u000fDb"));
         } catch (UnsupportedEncodingException var31) {
            return new String(var8, 0, var10);
         }
      }
   }

   private static int a(byte[] var0, int var1, byte[] var2, int var3) {
      int var4;
      if(var0[var1 + 2] == 61) {
         var4 = (g[var0[var1]] & 255) << 18 | (g[var0[var1 + 1]] & 255) << 12;
         var2[var3] = (byte)(var4 >>> 16);
         return 1;
      } else if(var0[var1 + 3] == 61) {
         var4 = (g[var0[var1]] & 255) << 18 | (g[var0[var1 + 1]] & 255) << 12 | (g[var0[var1 + 2]] & 255) << 6;
         var2[var3] = (byte)(var4 >>> 16);
         var2[var3 + 1] = (byte)(var4 >>> 8);
         return 2;
      } else {
         try {
            var4 = (g[var0[var1]] & 255) << 18 | (g[var0[var1 + 1]] & 255) << 12 | (g[var0[var1 + 2]] & 255) << 6 | g[var0[var1 + 3]] & 255;
            var2[var3] = (byte)(var4 >> 16);
            var2[var3 + 1] = (byte)(var4 >> 8);
            var2[var3 + 2] = (byte)var4;
            return 3;
         } catch (Exception var5) {
            jindent.debugger.a.b("" + var0[var1] + e("^b") + g[var0[var1]]);
            jindent.debugger.a.b("" + var0[var1 + 1] + e("^b") + g[var0[var1 + 1]]);
            jindent.debugger.a.b("" + var0[var1 + 2] + e("^b") + g[var0[var1 + 2]]);
            jindent.debugger.a.b("" + var0[var1 + 3] + e("^b") + g[var0[var1 + 3]]);
            return -1;
         }
      }
   }

   public static byte[] b(byte[] var0, int var1, int var2) {
      int var3 = var2 * 3 / 4;
      byte[] var4 = new byte[var3];
      int var5 = 0;
      byte[] var6 = new byte[4];
      int var7 = 0;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;

      for(int var12 = var1; var12 < var1 + var2; ++var12) {
         byte var13 = (byte)(var0[var12] & 127);
         byte var14 = g[var13];
         if(var14 < -5) {
            jindent.debugger.a.b(e("&#-I\u0018\u00051,_nD+\'\u0019/\u0010b*\u0001;\u0016#*\u001d?\u0016b(\u001dz") + var12 + e("^b") + var0[var12] + e("L&,\n3\t#%@"));
            return null;
         }

         if(var14 >= -1) {
            var6[var7++] = var13;
            if(var7 > 3) {
               var5 += a(var6, 0, var4, var5);
               var7 = 0;
               if(var13 == 61) {
                  break;
               }
            }
         }
      }

      byte[] var11 = new byte[var5];
      System.arraycopy(var4, 0, var11, 0, var5);
      return var11;
   }

   public static byte[] a(String var0) {
      byte[] var1;
      try {
         var1 = var0.getBytes(e("1\u0016\u000fDb"));
      } catch (UnsupportedEncodingException var26) {
         var1 = var0.getBytes();
      }

      var1 = b(var1, 0, var1.length);
      if(var1 != null && var1.length >= 4) {
         int var2 = var1[0] & 255 | var1[1] << 8 & '\uff00';
         if('謟' == var2) {
            ByteArrayInputStream var3 = null;
            GZIPInputStream var4 = null;
            ByteArrayOutputStream var5 = null;
            byte[] var6 = new byte[2048];
            boolean var7 = false;

            try {
               var5 = new ByteArrayOutputStream();
               var3 = new ByteArrayInputStream(var1);
               var4 = new GZIPInputStream(var3);

               int var29;
               while((var29 = var4.read(var6)) >= 0) {
                  var5.write(var6, 0, var29);
               }

               var1 = var5.toByteArray();
            } catch (IOException var27) {
               ;
            } finally {
               try {
                  var5.close();
               } catch (Exception var25) {
                  ;
               }

               try {
                  var4.close();
               } catch (Exception var24) {
                  ;
               }

               try {
                  var3.close();
               } catch (Exception var23) {
                  ;
               }

            }
         }
      }

      return var1;
   }

   public static Object b(String var0) {
      byte[] var1 = a(var0);
      ByteArrayInputStream var2 = null;
      ObjectInputStream var3 = null;
      Object var4 = null;

      try {
         var2 = new ByteArrayInputStream(var1);
         var3 = new ObjectInputStream(var2);
         var4 = var3.readObject();
      } catch (IOException var21) {
         var21.printStackTrace();
         var4 = null;
      } catch (ClassNotFoundException var22) {
         var22.printStackTrace();
         var4 = null;
      } finally {
         try {
            var2.close();
         } catch (Exception var20) {
            ;
         }

         try {
            var3.close();
         } catch (Exception var19) {
            ;
         }

      }

      return var4;
   }

   public static boolean a(byte[] var0, String var1) {
      boolean var2 = false;
      b var3 = null;

      try {
         var3 = new b(new FileOutputStream(var1), 1);
         var3.write(var0);
         var2 = true;
      } catch (IOException var13) {
         var2 = false;
      } finally {
         try {
            var3.close();
         } catch (Exception var12) {
            ;
         }

      }

      return var2;
   }

   public static boolean a(String var0, String var1) {
      boolean var2 = false;
      b var3 = null;

      try {
         var3 = new b(new FileOutputStream(var1), 0);
         var3.write(var0.getBytes(e("1\u0016\u000fDb")));
         var2 = true;
      } catch (IOException var13) {
         var2 = false;
      } finally {
         try {
            var3.close();
         } catch (Exception var12) {
            ;
         }

      }

      return var2;
   }

   public static byte[] c(String var0) {
      byte[] var1 = null;
      jindent.util.b.a var2 = null;

      Object var7;
      try {
         File var3 = new File(var0);
         Object var4 = null;
         int var5 = 0;
         boolean var6 = false;
         if(var3.length() <= 2147483647L) {
            byte[] var20 = new byte[(int)var3.length()];

            int var21;
            for(var2 = new jindent.util.b.a(new BufferedInputStream(new FileInputStream(var3)), 0); (var21 = var2.read(var20, var5, 4096)) >= 0; var5 += var21) {
               ;
            }

            var1 = new byte[var5];
            System.arraycopy(var20, 0, var1, 0, var5);
            return var1;
         }

         jindent.debugger.a.b(e("\"+%\fz\r1i\u001d5\u000bb+\u0000=D$&\u001bz\u0010* \u001az\u0007-\'\u001f?\n+,\u00079\u0001b$\f.\f--Ir") + var3.length() + e("D 0\u001d?\u0017kg"));
         var7 = null;
      } catch (IOException var18) {
         jindent.debugger.a.b(e("!0;\u0006(D&,\n5\u0000+\'\u000ez\u00020&\u0004z\u0002+%\fz") + var0);
         return var1;
      } finally {
         try {
            var2.close();
         } catch (Exception var17) {
            ;
         }

      }

      return (byte[])var7;
   }

   public static String d(String var0) {
      String var1 = null;
      jindent.util.b.a var2 = null;

      try {
         File var3 = new File(var0);
         byte[] var4 = new byte[(int)((double)var3.length() * 1.4D)];
         int var5 = 0;
         boolean var6 = false;

         int var17;
         for(var2 = new jindent.util.b.a(new BufferedInputStream(new FileInputStream(var3)), 1); (var17 = var2.read(var4, var5, 4096)) >= 0; var5 += var17) {
            ;
         }

         var1 = new String(var4, 0, var5, e("1\u0016\u000fDb"));
      } catch (IOException var15) {
         jindent.debugger.a.b(e("!0;\u0006(D\'\'\n5\u0000+\'\u000ez\u00020&\u0004z\u0002+%\fz") + var0);
      } finally {
         try {
            var2.close();
         } catch (Exception var14) {
            ;
         }

      }

      return var1;
   }

   static byte[] b(byte[] var0, int var1, int var2, byte[] var3, int var4) {
      return a(var0, var1, var2, var3, var4);
   }

   static byte[] a() {
      return g;
   }

   static int b(byte[] var0, int var1, byte[] var2, int var3) {
      return a(var0, var1, var2, var3);
   }

   static byte[] b(byte[] var0, byte[] var1, int var2) {
      return a(var0, var1, var2);
   }

   static {
      byte[] var0;
      try {
         var0 = e("%\u0000\n-\u001f\"\u0005\u0001 \u0010/\u000e\u0004\'\u00154\u0013\u001b:\u000e1\u0014\u001e1\u0003>#+\n>\u0001$.\u00013\u000e)%\u00044\u000b28\u001b)\u00107?\u001e\"\u001d8yXhWv|_m\\{bF").getBytes(e("1\u0016\u000fDb"));
      } catch (UnsupportedEncodingException var2) {
         var0 = f;
      }

      e = var0;
      g = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9};
   }

   private static String e(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 100;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 73;
            break;
         case 3:
            var10003 = 105;
            break;
         default:
            var10003 = 90;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
