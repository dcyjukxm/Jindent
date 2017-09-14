package jindent.a;

public class TokenMgrError extends Error {
   static final int a = 0;
   static final int b = 1;
   static final int c = 2;
   static final int d = 3;
   int e;

   protected static final String a(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         switch(var0.charAt(var3)) {
         case '\u0000':
            break;
         case '\b':
            var1.append(b("3I"));
            break;
         case '\t':
            var1.append(b("3_"));
            break;
         case '\n':
            var1.append(b("3E"));
            break;
         case '\f':
            var1.append(b("3M"));
            break;
         case '\r':
            var1.append(b("3Y"));
            break;
         case '\"':
            var1.append(b("3\t"));
            break;
         case '\'':
            var1.append(b("3\f"));
            break;
         case '\\':
            var1.append(b("3w"));
            break;
         default:
            char var2;
            if((var2 = var0.charAt(var3)) >= 32 && var2 <= 126) {
               var1.append(var2);
            } else {
               String var4 = b("_\u001bs5") + Integer.toString(var2, 16);
               var1.append(b("3^") + var4.substring(var4.length() - 4, var4.length()));
            }
         }
      }

      return var1.toString();
   }

   protected static String a(boolean var0, int var1, int var2, int var3, String var4, char var5) {
      return b("#N;l$\u000eGc`5\u001dD1%&\u001b\u000b/l)\n\u000b") + var2 + b("C\u000b j+\u001aF-%") + var3 + b("A\u000bc@)\fD6k3\nY&a}O") + (var0?b("Sn\fCyO"):"\"" + a(String.valueOf(var5)) + "\"" + b("O\u0003") + var5 + b("F\u0007c")) + b("\u000eM7`5O\u0011c\'") + a(var4) + "\"";
   }

   public String getMessage() {
      return super.getMessage();
   }

   public TokenMgrError() {
   }

   public TokenMgrError(String var1, int var2) {
      super(var1);
      this.e = var2;
   }

   public TokenMgrError(boolean var1, int var2, int var3, int var4, String var5, char var6, int var7) {
      this(a(var1, var2, var3, var4, var5, var6), var7);
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 111;
            break;
         case 1:
            var10003 = 43;
            break;
         case 2:
            var10003 = 67;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 71;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
