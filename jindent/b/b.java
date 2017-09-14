package jindent.b;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import jindent.JindentException;
import jindent.a.k;
import jindent.cpp.o;
import jindent.formatter.Context;
import jindent.formatter.f;
import jindent.formatter.m;
import jindent.formatter.q;
import jindent.formatter.t;
import jindent.message.ErrorMessage;
import jindent.util.MyStringBuffer;
import jindent.util.Utils;

public class b extends f {
   public b(Context var1) {
      super(var1);
   }

   protected void h() {
   }

   protected void i() {
   }

   public void a(t var1) {
   }

   protected boolean a(int var1, q var2) {
      return false;
   }

   protected void l() {
   }

   public void a(Reader var1, Writer var2) throws JindentException {
      MyStringBuffer var3 = this.a(var1);
      o var4 = new o();
      var4.c = this.b.c;
      var4.d = this.b.d;
      m var5 = var4.newParser();
      ErrorMessage var6 = null;

      try {
         var5.a((Reader)(new StringReader(var3.toString())), (Writer)var2);
         this.b.k.addMessageList(var4.getMessageList());
         this.b.m = var4.m;
      } catch (JindentException var12) {
         var6 = Utils.jindentExceptionToErrorMessage(var4.getLanguage(), var12);
         k var7 = new k();
         var7.c = this.b.c;
         var7.d = this.b.d;
         m var8 = var7.newParser();

         try {
            var8.a((Reader)(new StringReader(var3.toString())), (Writer)var2);
            this.b.k.addMessageList(var7.getMessageList());
            this.b.m = var7.m;
         } catch (JindentException var11) {
            ErrorMessage var10 = Utils.jindentExceptionToErrorMessage(var7.getLanguage(), var11);
            this.b.k.addMessage(var6);
            this.b.k.addMessage(var10);
            throw new JindentException(t("\u0005F|J\u0017=S/\u000b\u001b>B/\u001e\u0016rWn\u0018\n7\u0007j\u0003\r:B}J\r:B/\u0002\u001c3Cj\u0018Y4Nc\u000fY%N{\u0002Y\u0011\f$J\u0017=U/)Y\u0014H}\u0007\u0018&Sj\u0018W"));
         }
      }
   }

   private MyStringBuffer a(Reader var1) throws JindentException {
      char[] var3 = new char[30720];
      MyStringBuffer var4 = new MyStringBuffer();

      try {
         int var2;
         while((var2 = var1.read(var3)) != -1) {
            var4.a(new String(var3, 0, var2));
         }

         return var4;
      } catch (IOException var6) {
         throw new JindentException(var6);
      }
   }

   protected String[] j() {
      return new String[0];
   }

   private static String t(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 82;
            break;
         case 1:
            var10003 = 39;
            break;
         case 2:
            var10003 = 15;
            break;
         case 3:
            var10003 = 106;
            break;
         default:
            var10003 = 121;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
