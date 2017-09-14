package jindent.plugin.a.a;

import java.io.PrintStream;
import jindent.plugin.output.PluginThreadOutput;

public class a implements PluginThreadOutput {
   protected boolean a;
   protected int b;
   protected int c;
   protected PrintStream d;
   private boolean e = false;

   public a(PrintStream var1) {
      this.d = var1;
   }

   public void a(PrintStream var1) {
      this.d = var1;
   }

   public void setMaximum(int var1) {
      this.b = var1;
   }

   public void setCurrent(int var1) {
      this.c = var1;
   }

   public void setMessage(int var1, String var2) {
      if(!this.a()) {
         if(var1 == 0) {
            this.d.println();
         }

         this.d.println(var2);
      }

   }

   public boolean isFormattingStopped() {
      return this.a;
   }

   public void init() {
      this.a = false;
      this.setCurrent(0);
      this.setMaximum(0);
   }

   public void stopFormatting() {
      this.a = true;
      this.setMessage(0, b("(i\t\u0007g\'d\u000e\nee&I"));
   }

   public void a(String var1) {
      if(!this.a()) {
         this.d.println(var1);
      }

   }

   public void a(boolean var1) {
      this.e = var1;
   }

   public boolean a() {
      return this.e;
   }

   public void setOutputVisible(boolean var1) {
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 75;
            break;
         case 1:
            var10003 = 8;
            break;
         case 2:
            var10003 = 103;
            break;
         case 3:
            var10003 = 100;
            break;
         default:
            var10003 = 2;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
