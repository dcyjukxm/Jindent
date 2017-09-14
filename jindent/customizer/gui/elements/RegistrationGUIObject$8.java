package jindent.customizer.gui.elements;

import java.awt.Container;
import java.awt.Window;
import java.io.File;
import java.io.FileWriter;
import jindent.customizer.gui.elements.RegistrationGUIObject;
import jindent.util.swing.DialogUtils;
import jindent.util.swing.SwingUtils;

class RegistrationGUIObject$8 implements Runnable {
   private final File a;
   private final String b;
   private final RegistrationGUIObject c;

   RegistrationGUIObject$8(RegistrationGUIObject var1, File var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      try {
         File var1 = this.a.getParentFile();
         var1.mkdirs();
         FileWriter var4 = new FileWriter(this.a);
         var4.write(this.b);
         var4.close();
         RegistrationGUIObject.access$600(this.c);
      } catch (Exception var3) {
         Window var2 = SwingUtils.findWindow((Container)RegistrationGUIObject.access$400(this.c));
         DialogUtils.showErrorDialog(var2, a("=\r)\\$\nL0@\"\n\tg^\"\u001d\t)A.^\u0007\"Kk\u0018\u0005+Wk\n\u0003g\u0010") + this.a.getAbsolutePath() + a("\\BM") + a(".\u0000\"S8\u001bL\"\\8\u000b\u001e\"\u00122\u0011\u0019gZ*\b\tgE9\u0017\u0018\"\u0012*\u001d\u000f\"A8^\u0018(\u0012/\u0017\u001e\"Q?\u0011\u001e>\u0012i") + this.a.getParentFile().getAbsolutePath() + a("\\B"));
      }

   }

   private static String a(String var0) {
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
            var10003 = 108;
            break;
         case 2:
            var10003 = 71;
            break;
         case 3:
            var10003 = 50;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
