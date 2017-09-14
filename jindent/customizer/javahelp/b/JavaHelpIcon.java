package jindent.customizer.javahelp.b;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import jindent.util.swing.SwingUtils;

public class JavaHelpIcon extends JLabel {
   private static final long serialVersionUID = 234306206360718810L;
   private static final ImageIcon a = SwingUtils.readImageIcon(a("+l>\u001c-52#Ak4*(J"));
   private static final ImageIcon b = SwingUtils.readImageIcon(a("+l>\u001c-52#AkE9*Dxq?\"\u0003kt="));
   private static final ImageIcon c = SwingUtils.readImageIcon(a("+l>\u001c-52#AkE>/^zx6#I5j4!"));

   public JavaHelpIcon(String var1) {
      if(var1 == null) {
         System.err.println(a("R?*]P\u007f#fDh:43Aw;"));
      }

      this.setIcon(c);
      this.addMouseListener(new jindent.customizer.javahelp.b.a(this, var1));
   }

   static ImageIcon a() {
      return a;
   }

   static ImageIcon b() {
      return c;
   }

   static ImageIcon c() {
      return b;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 26;
            break;
         case 1:
            var10003 = 90;
            break;
         case 2:
            var10003 = 70;
            break;
         case 3:
            var10003 = 45;
            break;
         default:
            var10003 = 27;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
