package jindent;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import jindent.JindentException;
import jindent.MessageList;
import jindent.Settings;
import jindent.formatter.Context;
import jindent.formatter.m;

public class Formatter {
   protected Context context;
   protected m parser;

   protected Formatter(Context var1) {
      this.context = var1;
   }

   protected m getParser() {
      if(this.parser == null) {
         this.parser = this.context.newParser();
      }

      return this.parser;
   }

   public void setSettings(Settings var1) {
      this.context.c = var1;
   }

   public Settings getSettings() {
      return this.context.c;
   }

   public String format(String var1) throws JindentException {
      if(this.context.c == null) {
         throw new JindentException(a("@\u0010\u001c(7d\r!)&~\u0010\u001c+!*\u0010\u0001l<\u007f\u0015\u001e"));
      } else {
         return this.getParser().a(var1);
      }
   }

   public byte[] format(byte[] var1) throws JindentException {
      if(this.context.c == null) {
         throw new JindentException(a("@\u0010\u001c(7d\r!)&~\u0010\u001c+!*\u0010\u0001l<\u007f\u0015\u001e"));
      } else {
         return this.getParser().a(var1);
      }
   }

   public void format(Reader var1, Writer var2) throws JindentException {
      if(this.context.c == null) {
         throw new JindentException(a("@\u0010\u001c(7d\r!)&~\u0010\u001c+!*\u0010\u0001l<\u007f\u0015\u001e"));
      } else {
         this.getParser().a(var1, var2);
      }
   }

   public void format(InputStream var1, OutputStream var2) throws JindentException {
      if(this.context.c == null) {
         throw new JindentException(a("@\u0010\u001c(7d\r!)&~\u0010\u001c+!*\u0010\u0001l<\u007f\u0015\u001e"));
      } else {
         this.getParser().a(var1, var2);
      }
   }

   public MessageList getMessageList() {
      return this.context.getMessageList().copyWithoutTokenReferences();
   }

   public void setActivationWindow(Object var1) {
      m var2 = this.getParser();
      if(var2 != null) {
         var2.a(var1);
      }

   }

   public Object getActivationWindow() {
      m var1 = this.getParser();
      return var1 == null?null:var1.a();
   }

   public void setCreateCaretHistory(boolean var1) {
      m var2 = this.getParser();
      if(var2 != null) {
         var2.a(var1);
      }

   }

   public boolean getCreateCaretHistory() {
      m var1 = this.getParser();
      return var1 == null?false:var1.b();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 10;
            break;
         case 1:
            var10003 = 121;
            break;
         case 2:
            var10003 = 114;
            break;
         case 3:
            var10003 = 76;
            break;
         default:
            var10003 = 82;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
