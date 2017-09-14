package jindent.debugger;

import java.awt.Rectangle;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import jindent.debugger.SourceTextArea;

class b implements CaretListener {
   private final SourceTextArea a;

   b(SourceTextArea var1) {
      this.a = var1;
   }

   public void caretUpdate(CaretEvent var1) {
      int var2 = var1.getDot();
      int var3 = var1.getMark();

      try {
         Rectangle var4 = this.a.a.modelToView(var2);
         if(var4 != null) {
            System.out.print(a("1\u0000\u0010\r(hA\u0011\r07\u0002\u0016\u00013<[B") + var2 + a("~A") + var3 + a("~A\u0014\u00019%A\u000e\u0007?3\u0015\u000b\u00072r\\B3") + var4.x + a("~A") + var4.y + "]" + "\n");
            if(var2 < var3) {
               this.a.b.a(var2, var3);
            } else {
               this.a.b.a(var3, var2);
            }
         }
      } catch (BadLocationException var7) {
         System.out.print(a("1\u0000\u0010\r(hA\u0016\r$&A\u0012\u0007/;\u0015\u000b\u00072hA") + var2 + "\n");
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
            var10003 = 82;
            break;
         case 1:
            var10003 = 97;
            break;
         case 2:
            var10003 = 98;
            break;
         case 3:
            var10003 = 104;
            break;
         default:
            var10003 = 92;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
