package jindent.cpp;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import jindent.JindentException;
import jindent.cpp.m;
import jindent.cpp.b.c.b.PreProcessorException;
import jindent.cpp.b.c.b.c;
import jindent.formatter.Context;
import jindent.formatter.q;
import jindent.formatter.t;
import jindent.formatter.c.b;
import jindent.message.WarningMessage;
import jindent.util.MyStringBuffer;

public class n extends jindent.formatter.f {
   public n(Context var1) {
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
      try {
         MyStringBuffer var3 = new MyStringBuffer();
         char[] var4 = new char[30720];

         int var5;
         try {
            while((var5 = var1.read(var4)) != -1) {
               var3.a(new String(var4, 0, var5));
            }
         } catch (IOException var16) {
            throw new JindentException(t("-w\u0000%K\u0011uA\'P\u0010\u007fA(L\u000fg\u0015aD\u001e{\r$FQ"));
         }

         jindent.formatter.c.a var6 = this.c();
         String var7 = var3.toString();
         if(var6 instanceof b) {
            var7 = ((b)var6).a(var7);
         }

         jindent.cpp.b.c.g var8 = new jindent.cpp.b.c.g();
         jindent.cpp.b.c.b.d var9 = var8.b(var3.toString());
         m var10 = new m(this.b);
         var10.a((jindent.formatter.c.a)(new jindent.cpp.a.a()));
         var9.a((jindent.formatter.m)var10);
         jindent.cpp.b.c.b.b var11 = new jindent.cpp.b.c.b.b(var9);
         c var12 = var11.a();
         this.d().getMessageList().clear();
         this.d().getMessageList().addMessages(var12.c());
         if(var9.e() >= 5) {
            this.b.addMessage(new WarningMessage(this.b.getLanguage(), t("+z\b2\u0002\u0019{\r$\u0002\u001c}\u000f5C\u0016|\u0012aM\u0011wA.P_\u007f\u000e3G_p\u0013 L\u001cz\b/E_b\u0013$R\r}\u0002$Q\f}\u0013aF\u0016`\u0004\"V\u0016d\u00042\u0002\u0013{\n$\u0002X1\b\'\u0005_s\u000f%\u0002X1\u0004-Q\u001a5OKv\u00102\t L\u001b~\u0004aV\u0017w\u0012$\u0002\u0014{\u000f%\u0002\u0010tA%K\rw\u00025K\tw\u0012ah\u0016|\u0005$L\u000b2\t Q_f\u000eaD\u0010`\f V_f\t(Q_t\b-G_a\u00047G\rs\raV\u0016\u007f\u00042\u0002\bz\b\"J_\u007f\u00008\u0002\u001cs\u00142G_a\r.U_t\u000e3O\u001ef\u0015(L\u00182\u0011$P\u0019}\u0013,C\u0011q\u0004o"), 3));
         }

         String var13 = var12.a();
         if(var6 instanceof jindent.formatter.c.c) {
            var13 = ((jindent.formatter.c.c)var6).b(var13);
         }

         try {
            var2.write(var13);
         } catch (IOException var15) {
            throw new JindentException(t("(`\b5K\u0011uA5M_}\u00145R\nfA\'C\u0016~\u0004%\f"));
         }
      } catch (JindentException var17) {
         jindent.debugger.a.a((Exception)var17);
         throw var17;
      } catch (PreProcessorException var18) {
         jindent.debugger.a.a((Exception)var18);
         if(var18.b()) {
            throw new JindentException(var18.getLocalizedMessage(), var18.a());
         } else {
            throw new JindentException(var18.getLocalizedMessage());
         }
      } catch (Exception var19) {
         jindent.debugger.a.a(var19);
         throw new JindentException(var19.getLocalizedMessage());
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
            var10003 = 127;
            break;
         case 1:
            var10003 = 18;
            break;
         case 2:
            var10003 = 97;
            break;
         case 3:
            var10003 = 65;
            break;
         default:
            var10003 = 34;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
