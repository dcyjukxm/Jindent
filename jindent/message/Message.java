package jindent.message;

import jindent.MessageList;
import jindent.formatter.q;

public class Message {
   public static final int ID_PARSER = 2;
   public static final int ID_FORMATTER = 3;
   public static final int ID_JAVA_DOC = 4;
   public static final int ID_ERROR = 5;
   protected int a;
   protected int b;
   protected String c;
   protected String d;
   protected int e;
   protected q f;
   protected int g;
   protected MessageList h;

   public Message(String var1, String var2, int var3) {
      this(var1, var2, var3, (q)null);
   }

   public Message(String var1, String var2, int var3, q var4) {
      this(var1, var2, var3, var4, 0);
   }

   public Message(String var1, String var2, int var3, q var4, int var5) {
      this.a = -1;
      this.b = -1;
      this.f = null;
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.g = var5;
   }

   public Message(String var1, String var2, int var3, int var4, int var5, int var6) {
      this.a = -1;
      this.b = -1;
      this.f = null;
      this.c = var1;
      this.d = var2;
      this.e = var3;
      this.a = var5;
      this.b = var4;
      this.f = null;
      this.g = var6;
   }

   public String getLanguage() {
      return this.c;
   }

   public String getMessage() {
      return this.d;
   }

   public int getMessageId() {
      return this.e;
   }

   public boolean isMessageId(int var1) {
      return this.e == var1;
   }

   public boolean hasColumnAndLineNumber() {
      return this.f != null || this.a != -1 || this.b != -1;
   }

   public int getColumn() {
      return this.f != null?this.f.c + 1:this.b;
   }

   public int getLine() {
      return this.f != null?this.f.b + this.g:this.a + this.g;
   }

   public void setLineOffset(int var1) {
      this.g = var1;
   }

   public int getLineOffset() {
      return this.g;
   }

   public static String idToString(int var0) {
      switch(var0) {
      case 2:
         return a("7\u0017Tuu\u0015");
      case 3:
         return a("!\u0019Tkq\u0013\u0002Ct");
      case 4:
         return a("#\u0019Es}\u0002\u0018Rgd\u000e\u0019H");
      case 5:
         return a("\"\u0004Tib");
      default:
         return a("\u0012\u0018Mh\u007f\u0010\u0018");
      }
   }

   public MessageList getParentMessageList() {
      return this.h;
   }

   public void setParentMessageList(MessageList var1) {
      this.h = var1;
   }

   public Message copyWithoutReferences() {
      return new Message(this.c, this.d, this.e, this.getColumn(), this.getLine(), this.g);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 103;
            break;
         case 1:
            var10003 = 118;
            break;
         case 2:
            var10003 = 38;
            break;
         case 3:
            var10003 = 6;
            break;
         default:
            var10003 = 16;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
