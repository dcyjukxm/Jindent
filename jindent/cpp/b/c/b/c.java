package jindent.cpp.b.c.b;

import jindent.MessageList;

public class c {
   private String a;
   private jindent.cpp.b.c.c b;
   private MessageList c;

   public c(String var1, MessageList var2) {
      this(var1, var2, (jindent.cpp.b.c.c)null);
   }

   public c(String var1, MessageList var2, jindent.cpp.b.c.c var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public String a() {
      return this.a;
   }

   public jindent.cpp.b.c.c b() {
      return this.b;
   }

   public MessageList c() {
      return this.c;
   }

   public String toString() {
      return a("I}.LnrZ?Onj|zg\u007fck3Orif\u0017]k;") + this.b + a("*(5Iov}.\u0001") + this.a + "]";
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 6;
            break;
         case 1:
            var10003 = 8;
            break;
         case 2:
            var10003 = 90;
            break;
         case 3:
            var10003 = 60;
            break;
         default:
            var10003 = 27;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
