package jindent.commander;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class bg implements FileFilter {
   private String a = c("\bL:");
   private boolean b = false;
   private ArrayList c = new ArrayList();

   public boolean accept(File var1) {
      if(!this.b()) {
         return true;
      } else if(var1.isDirectory()) {
         return true;
      } else {
         for(int var2 = 0; var2 < this.c.size(); ++var2) {
            Pattern var3 = (Pattern)this.c.get(var2);
            if(var3.matcher(var1.getName()).matches()) {
               return true;
            }
         }

         return false;
      }
   }

   public String a() {
      return this.a;
   }

   public void a(String var1) {
      this.a = var1;
      this.c.clear();
      String[] var2 = var1.split(",");

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         Pattern var5 = this.b(var4);
         if(var5 != null) {
            this.c.add(var5);
         }
      }

   }

   private Pattern b(String var1) {
      String var2 = new String();

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         switch(var4) {
         case '*':
            var2 = var2 + c("\nL:L");
            break;
         case '?':
            var2 = var2 + c("\nL/L");
            break;
         default:
            var2 = var2 + var4;
         }
      }

      return Pattern.compile(var2);
   }

   public boolean b() {
      return this.b;
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 34;
            break;
         case 1:
            var10003 = 98;
            break;
         case 2:
            var10003 = 16;
            break;
         case 3:
            var10003 = 101;
            break;
         default:
            var10003 = 47;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
