package jindent.formatter;

import jindent.formatter.q;

public class ParseException extends Exception {
   protected boolean a;
   public q b;
   public int[][] c;
   public String[] d;
   protected String e = System.getProperty(b("u[\\\u000e\u001cjWB\n@xF]\u0019"), "\n");

   public ParseException(q var1, int[][] var2, String[] var3) {
      super("");
      this.a = true;
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public ParseException() {
      this.a = false;
   }

   public ParseException(String var1) {
      super(var1);
      this.a = false;
   }

   public String getMessage() {
      if(!this.a) {
         return super.getMessage();
      } else {
         String var1 = "";
         int var2 = 0;

         for(int var3 = 0; var3 < this.c.length; ++var3) {
            if(var2 < this.c[var3].length) {
               var2 = this.c[var3].length;
            }

            for(int var4 = 0; var4 < this.c[var3].length; ++var4) {
               var1 = var1 + this.d[this.c[var3][var4]] + " ";
            }

            if(this.c[var3][this.c[var3].length - 1] != 0) {
               var1 = var1 + b("7\u001c\u001c");
            }

            var1 = var1 + this.e + b("9\u0012\u0012K");
         }

         String var7 = "";
         String var8 = b("\\\\Q\u0004GwFW\u0019W}\u0012\u0010");
         q var5 = this.b.g;

         for(int var6 = 0; var6 < var2; ++var6) {
            if(var6 != 0) {
               var8 = var8 + " ";
            }

            if(var5.a == 0) {
               var8 = var8 + this.d[0];
               break;
            }

            var8 = var8 + this.a(var5.f);
            if(var6 < var2 - 1) {
               var7 = var7 + var5.a + b("5\u0012");
            } else {
               var7 = var7 + var5.a;
            }

            var5 = var5.g;
         }

         if(this.b.g != null) {
            var8 = var8 + b(";\u0012\u001a") + var7 + b("0\u0012S\u001f\u0012u[\\\u000e\u0012") + this.b.g.b + b("5\u0012Q\u0004^l_\\K") + this.b.g.c + "." + this.e;
         }

         if(this.c.length == 1) {
            var8 = var8 + b("NSAKWaBW\bFp\\UQ") + this.e + b("9\u0012\u0012K");
         } else {
            var8 = var8 + b("NSAKWaBW\bFp\\UK]wW\u0012\u0004T#") + this.e + b("9\u0012\u0012K");
         }

         var8 = var8 + var1;
         return var8;
      }
   }

   protected String a(String var1) {
      StringBuffer var2 = new StringBuffer();

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         switch(var1.charAt(var4)) {
         case '\u0000':
            break;
         case '\b':
            var2.append(b("EP"));
            break;
         case '\t':
            var2.append(b("EF"));
            break;
         case '\n':
            var2.append(b("E\\"));
            break;
         case '\f':
            var2.append(b("ET"));
            break;
         case '\r':
            var2.append(b("E@"));
            break;
         case '\"':
            var2.append(b("E\u0010"));
            break;
         case '\'':
            var2.append(b("E\u0015"));
            break;
         case '\\':
            var2.append(b("En"));
            break;
         default:
            char var3;
            if((var3 = var1.charAt(var4)) >= 32 && var3 <= 126) {
               var2.append(var3);
            } else {
               String var5 = b(")\u0002\u0002[") + Integer.toString(var3, 16);
               var2.append(b("EG") + var5.substring(var5.length() - 4, var5.length()));
            }
         }
      }

      return var2.toString();
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 25;
            break;
         case 1:
            var10003 = 50;
            break;
         case 2:
            var10003 = 50;
            break;
         case 3:
            var10003 = 107;
            break;
         default:
            var10003 = 50;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
