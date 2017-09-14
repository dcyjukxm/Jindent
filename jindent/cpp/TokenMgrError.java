package jindent.cpp;

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
            var1.append(b("\"]"));
            break;
         case '\t':
            var1.append(b("\"K"));
            break;
         case '\n':
            var1.append(b("\"Q"));
            break;
         case '\f':
            var1.append(b("\"Y"));
            break;
         case '\r':
            var1.append(b("\"M"));
            break;
         case '\"':
            var1.append(b("\"\u001d"));
            break;
         case '\'':
            var1.append(b("\"\u0018"));
            break;
         case '\\':
            var1.append(b("\"c"));
            break;
         default:
            char var2;
            if((var2 = var0.charAt(var3)) >= 32 && var2 <= 126) {
               var1.append(var2);
            } else {
               String var4 = b("N\u000fwc") + Integer.toString(var2, 16);
               var1.append(b("\"J") + var4.substring(var4.length() - 4, var4.length()));
            }
         }
      }

      return var1.toString();
   }

   protected static String a(boolean var0, int var1, int var2, int var3, String var4, char var5) {
      return b("2Z?:a\u001fSg6p\fP5sc\n\u001f+:l\u001b\u001f") + var2 + b("R\u001f$<n\u000bR)s") + var3 + b("P\u001fg\u0016l\u001dP2=v\u001bM\"78^") + (var0?b("Bz\b\u0015<^"):"\"" + a(String.valueOf(var5)) + "\"" + b("^\u0017") + var5 + b("W\u0013g")) + b("\u001fY36p^\u0005gq") + a(var4) + "\"";
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
            var10003 = 126;
            break;
         case 1:
            var10003 = 63;
            break;
         case 2:
            var10003 = 71;
            break;
         case 3:
            var10003 = 83;
            break;
         default:
            var10003 = 2;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
