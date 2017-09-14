package jindent.cpp.b.c.b;

import jindent.JindentException;
import jindent.MessageList;
import jindent.cpp.b.c.b.PreProcessorException;
import jindent.cpp.b.c.b.c;
import jindent.cpp.b.c.b.d;
import jindent.formatter.p;
import jindent.message.Message;
import jindent.util.MyStringBuffer;

public class b {
   private static final String a = "";
   private d b;

   public b(d var1) {
      this.b = var1;
   }

   public c a() throws JindentException, PreProcessorException {
      c var1 = this.b.b(0, 0);
      c var2 = this.a(var1);
      return this.b(var2);
   }

   protected c a(c var1) throws JindentException, PreProcessorException {
      if(var1 != null && !p.b(var1.a())) {
         byte var2 = 0;
         int var3 = 0;
         MessageList var4 = new MessageList();
         MyStringBuffer var5 = new MyStringBuffer();
         MyStringBuffer var6 = new MyStringBuffer();
         jindent.util.d var7 = new jindent.util.d(var1.a(), true);
         jindent.cpp.b.c.b.a var8 = null;
         int var9 = 0;

         while(var7.e() && var8 == null) {
            jindent.util.e var10 = var7.d();
            String var11 = var10.a();
            jindent.cpp.b.c.b.a var12 = jindent.cpp.b.c.b.a.b(var11);
            if(var12 != null && var12.c() == 1) {
               var8 = var12;
               var6.a(var11);
               ++var9;
            } else {
               var5.a(var11);
               int var13 = var10.c();
               MessageList var14 = var1.c();
               MessageList var15 = var14.getMessagesByLineNumber(var13);
               this.a(var15, var4, var2);
               ++var3;
            }
         }

         jindent.cpp.b.c.b.a var19 = null;

         while(var7.e() && var19 == null) {
            jindent.util.e var20 = var7.d();
            String var22 = var20.a();
            var6.a(var22);
            ++var9;
            jindent.cpp.b.c.b.a var24 = jindent.cpp.b.c.b.a.b(var22);
            if(var8.c(var24)) {
               var19 = var24;
               if(var24.c() == 1) {
                  var7.a(1);
               }
            }
         }

         if(var8 != null && var19 == null) {
            throw new PreProcessorException(a("a\u0007J\u0002~\u0007\nM\rtD\u0000\u001f\u0001{U\u0003Z\u001e:E\rX\u0005t\u000bH]\u0019n\u0007\u0006PLxU\tQ\u000fr\u0007\u0005^\u001eqB\u001a\u001f\ttCHY\u0003h\u0007\u0001[V:") + var8.a() + a("\u000bHV\u0002~B\u0010\u0005L") + var8.b());
         } else {
            int var21 = var3 + var9;
            MessageList var23 = new MessageList();
            this.a(var1.c(), var23, -var21);
            String var25 = var7.c();
            c var26 = new c(var25, var23);
            if(var8 != null && var19 != null) {
               int var27 = var8.a();
               int var16 = var8.b();
               c var17 = this.b.b(var27, var16);
               if(var17 == null) {
                  throw new PreProcessorException(a("i\u0007\u001f\u0003oS\u0018J\u0018:A\u0007J\u0002~\u0007\u000eP\u001e:N\f\u0005L") + var27 + a("\u0007\tQ\b:N\u0006[\tb\u001dH") + var16 + a("\u0007I"));
               }

               c var18 = this.a(var27, var16, var17);
               var18 = this.a(var18);
               var3 = this.a(var5, var18, var4, var3);
            }

            this.a(var5, this.a(var26), var4, var3);
            return new c(var5.toString(), var4);
         }
      } else {
         return new c("", new MessageList());
      }
   }

   private int a(MyStringBuffer var1, c var2, MessageList var3, int var4) {
      for(jindent.util.d var5 = new jindent.util.d(var2.a(), true); var5.e(); ++var4) {
         jindent.util.e var6 = var5.d();
         String var7 = var6.a();
         var1.a(var7);
         int var8 = var6.c();
         MessageList var9 = var2.c();
         MessageList var10 = var9.getMessagesByLineNumber(var8);
         this.a(var10, var3, var4 - var8 + 1);
      }

      return var4;
   }

   private MessageList a(MessageList var1, MessageList var2, int var3) {
      for(int var4 = 0; var4 < var1.countMessages(); ++var4) {
         Message var5 = var1.getMessageAt(var4).copyWithoutReferences();
         var5.setLineOffset(var5.getLineOffset() + var3);
         var2.addMessage(var5);
      }

      return var2;
   }

   private c a(int var1, int var2, c var3) {
      int var4 = 0;
      MessageList var5 = new MessageList();
      jindent.util.d var6 = new jindent.util.d(var3.a(), true);
      jindent.cpp.b.c.b.a var7 = null;
      MyStringBuffer var8 = new MyStringBuffer();

      MessageList var14;
      while(var6.e() && var7 == null) {
         jindent.util.e var9 = var6.d();
         String var10 = var9.a();
         jindent.cpp.b.c.b.a var11 = jindent.cpp.b.c.b.a.b(var10);
         if(var11 != null && var11.c() == 10 && var11.a(var1, var2)) {
            var7 = var11;
            var4 = -var9.c() + 1;
            var8.a(var10);
            int var12 = var9.c();
            MessageList var13 = var3.c();
            var14 = var13.getMessagesByLineNumber(var12);
            this.a(var14, var5, var4);
         }
      }

      if(var7 == null) {
         throw new PreProcessorException(a("i\u0007\u001f\u000ehF\u0006\\\u0004:J\tT\th\u0007\u000eP\u0019tCHV\u0002:A\u0007M\u0001{S\u001cZ\b:H\u001dK\u001coSHY\u0003h\u0007\u0001[V:") + var1 + a("\u0007\tQ\b:N\u0006[\tb\u001dH") + var2 + a("\u0007I"));
      } else {
         jindent.cpp.b.c.b.a var16 = null;

         while(var6.e() && var16 == null) {
            jindent.util.e var17 = var6.d();
            String var18 = var17.a();
            jindent.cpp.b.c.b.a var19 = jindent.cpp.b.c.b.a.b(var18);
            if(var19 != null) {
               if(var7.c(var19) && var19.c() == 12) {
                  var16 = var19;
               } else {
                  if(var7.b(var19) && (var19.c() == 1 || var19.c() == 10)) {
                     break;
                  }

                  if(var7.c(var19) && var19.c() == 11 && var2 > 0) {
                     continue;
                  }
               }
            }

            var8.a(var18);
            int var20 = var17.c();
            var14 = var3.c();
            MessageList var15 = var14.getMessagesByLineNumber(var20);
            this.a(var15, var5, var4);
         }

         return new c(var8.toString(), var5);
      }
   }

   private c b(c var1) {
      MyStringBuffer var2 = new MyStringBuffer();

      String var4;
      for(jindent.util.d var3 = new jindent.util.d(var1.a(), true); var3.e(); var2.a(var4)) {
         var4 = var3.b();
         if(jindent.cpp.b.c.b.a.d(var4)) {
            var4 = jindent.cpp.b.c.b.a.e(var4);
         }
      }

      return new c(var2.toString(), var1.c());
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 39;
            break;
         case 1:
            var10003 = 104;
            break;
         case 2:
            var10003 = 63;
            break;
         case 3:
            var10003 = 108;
            break;
         default:
            var10003 = 26;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
