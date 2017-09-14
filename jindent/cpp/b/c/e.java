package jindent.cpp.b.c;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import jindent.JindentException;
import jindent.cpp.b.c.h;
import jindent.formatter.Context;
import jindent.formatter.m;

public class e implements m {
   private Object a;

   public String a(String var1) throws JindentException {
      return var1;
   }

   public byte[] a(byte[] var1) throws JindentException {
      return null;
   }

   public void a(Reader var1, Writer var2) throws JindentException {
   }

   public void a(InputStream var1, OutputStream var2) throws JindentException {
   }

   public Object a() {
      return this.a;
   }

   public boolean b() {
      return false;
   }

   public jindent.formatter.c.a c() {
      return null;
   }

   public void a(Object var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
   }

   public void a(jindent.formatter.c.a var1) {
   }

   public Context d() {
      return new h(this, 4, "C", b("w\u00160"), 14);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 20;
            break;
         case 1:
            var10003 = 102;
            break;
         case 2:
            var10003 = 64;
            break;
         case 3:
            var10003 = 82;
            break;
         default:
            var10003 = 20;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
