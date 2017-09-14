package jindent.commander;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import jindent.commander.InstrumentedSourceTextPane;

public class InstrumentedSourceTargetTextPane extends JPanel {
   private static final int a = 0;
   private static final int b = 1;
   private InstrumentedSourceTextPane[] c = new InstrumentedSourceTextPane[]{new InstrumentedSourceTextPane(), new InstrumentedSourceTextPane()};
   private JSplitPane d = new JSplitPane();

   public InstrumentedSourceTargetTextPane() {
      try {
         this.a();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a() throws Exception {
      this.c[0].e().setText(a("IN2\r4\u007f\u0001\u0001\u0016;\u007f"));
      this.c[1].e().setText(a("^D4\u000b>t@3\u00168t\u0001\u0001\u0016;\u007f"));
      this.d.setOrientation(1);
      this.d.add(this.c[0], a("vD!\u000b"));
      this.d.add(this.c[1], a("hH \u0017#"));
      this.setLayout(new BorderLayout());
      this.add(this.d, a("YD)\u000b2h"));
   }

   public InstrumentedSourceTextPane b() {
      return this.c[0];
   }

   public InstrumentedSourceTextPane c() {
      return this.c[1];
   }

   public JSplitPane d() {
      return this.d;
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
            var10003 = 33;
            break;
         case 2:
            var10003 = 71;
            break;
         case 3:
            var10003 = 127;
            break;
         default:
            var10003 = 87;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
