package jindent.util.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import jindent.util.a.SerializationException;

public class a {
   public static Object a(Serializable var0) {
      return a(b(var0));
   }

   public static void a(Serializable var0, OutputStream var1) {
      if(var1 == null) {
         throw new IllegalArgumentException(a("$t\u0014/t\u0005h\u0001zO#h\u0003jZ\u001d<\u001czH\u0004<\u001f`OP~\u0014/U\u0005p\u001d"));
      } else {
         ObjectOutputStream var2 = null;

         try {
            var2 = new ObjectOutputStream(var1);
            var2.writeObject(var0);
         } catch (IOException var11) {
            throw new SerializationException(var11);
         } finally {
            try {
               if(var2 != null) {
                  var2.close();
               }
            } catch (IOException var10) {
               ;
            }

         }

      }
   }

   public static byte[] b(Serializable var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream(512);
      a(var0, var1);
      return var1.toByteArray();
   }

   public static Object a(InputStream var0) {
      if(var0 == null) {
         throw new IllegalArgumentException(a("$t\u0014/r\u001el\u0004{h\u0004n\u0014nVPq\u0004|OPr\u001e{\u001b\u0012yQaN\u001cp"));
      } else {
         ObjectInputStream var1 = null;

         Object var2;
         try {
            var1 = new ObjectInputStream(var0);
            var2 = var1.readObject();
         } catch (ClassNotFoundException var12) {
            throw new SerializationException(var12);
         } catch (IOException var13) {
            throw new SerializationException(var13);
         } finally {
            try {
               if(var1 != null) {
                  var1.close();
               }
            } catch (IOException var11) {
               ;
            }

         }

         return var2;
      }
   }

   public static Object a(byte[] var0) {
      if(var0 == null) {
         throw new IllegalArgumentException(a("$t\u0014/Y\th\u0014TfPq\u0004|OPr\u001e{\u001b\u0012yQaN\u001cp"));
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         return a((InputStream)var1);
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
            var10003 = 112;
            break;
         case 1:
            var10003 = 28;
            break;
         case 2:
            var10003 = 113;
            break;
         case 3:
            var10003 = 15;
            break;
         default:
            var10003 = 59;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
