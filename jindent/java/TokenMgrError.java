package jindent.java;

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
            var1.append(b("\u0006\u001b"));
            break;
         case '\t':
            var1.append(b("\u0006\r"));
            break;
         case '\n':
            var1.append(b("\u0006\u0017"));
            break;
         case '\f':
            var1.append(b("\u0006\u001f"));
            break;
         case '\r':
            var1.append(b("\u0006\u000b"));
            break;
         case '\"':
            var1.append(b("\u0006["));
            break;
         case '\'':
            var1.append(b("\u0006^"));
            break;
         case '\\':
            var1.append(b("\u0006%"));
            break;
         default:
            char var2;
            if((var2 = var0.charAt(var3)) >= 32 && var2 <= 126) {
               var1.append(var2);
            } else {
               String var4 = b("jI^\u001b") + Integer.toString(var2, 16);
               var1.append(b("\u0006\f") + var4.substring(var4.length() - 4, var4.length()));
            }
         }
      }

      return var1.toString();
   }

   private static final String a(boolean var0, int var1, int var2, int var3, String var4, char var5) {
      return b("\u0016\u001c\u0016B\u001d;\u0015NN\f(\u0016\u001c\u000b\u001f.Y\u0002B\u0010?Y") + var2 + b("vY\rD\u0012/\u0014\u0000\u000b") + var3 + b("tYNn\u00109\u0016\u001bE\n?\u000b\u000bODz") + (var0?b("f<!m@z"):"\"" + a(String.valueOf(var5)) + "\"" + b("zQ") + var5 + b("sUN")) + b(";\u001f\u001aN\fzCN\t") + a(var4) + "\"";
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
            var10003 = 90;
            break;
         case 1:
            var10003 = 121;
            break;
         case 2:
            var10003 = 110;
            break;
         case 3:
            var10003 = 43;
            break;
         default:
            var10003 = 126;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
