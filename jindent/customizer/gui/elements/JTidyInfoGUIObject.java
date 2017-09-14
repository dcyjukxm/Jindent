package jindent.customizer.gui.elements;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.GUIObject;

public class JTidyInfoGUIObject extends GUIObject {
   private static final int f = 300;
   private static final int g = 400;

   public JTidyInfoGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void addToJPanel(JPanel var1, CustomizerData var2, String var3) {
      String var4 = a("M|u_\u0003MY\\_-vf}\u001e?mqb_\u0001M}t\u0006kpg0\u0011$m4g\r\"m`u\u0011kvf0\u0012*pzd\u001e\"wqt_)`4^\u001a<\u007f{b\u00128990,$\u007f`g\u001e9|4T\u001a=|x\u007f\u000f&|zdQw{f.C)k*Z+\"}m0\u001689u0\u00199|q0\u000f9v~u\u001c?9ud_\u0018vab\u001c.\u007f{b\u0018.7(r\ru_{b_-|ud\n9|4b\u001a:lqc\u000b89{b_)ls0\r.i{b\u000b89d|\u001a*jq0\u001c$w`q\u001c?9`x\u001akS@y\u001b29pu\t.u{`\u001a9j4q\u000bq%vbAw{f.C(|zd\u001a9\'(rA#m``Ed6~d\u0016/`:c\u0010>kwu\u0019$ksuQ%|`,P)\'(?\u001c.w`u\ru%vbA\u0001M}t\u0006kpg0\u001ekSuf\u001eki{b\u000bkvr07\u001fTX0+\"}m<_*9\\D2\u00079gi\u0011?xl0\u001c#|w{\u001a99u~\u001bkifu\u000b?`4`\r\"w`u\re9Xy\u0014.9}d\fkw{~R\u0001xbq_(vac\u0016%54Z+\"}m0\u001c*w4r\u001aklgu\u001bkxg0\u001ekm{\u007f\u0013k\u007f{b_(uqq\u0011\"ws0\n;9yq\u0013-vf}\u001a/9u~\u001bk\u007fue\u0013?`4X+\u0006U:,\u001d9\'(r\ruM|u_$k}w\u0016%xx07\u001fTX0+\"}m0\u000f9v~u\u001c?9wq\u0011k{q0\u0019$lzt_*m.,\u001d9\'(r\ru%wu\u0011?|f.C)\'|d\u000b;#;?\u000b\"}m>\f$lfs\u001a-vfw\u001aewqdCd{*,P(|zd\u001a9\'(r\ru%vbA");
      JEditorPane var5 = new JEditorPane();
      var5.setEditable(false);
      var5.setContentType(a("mqh\u000bdq`}\u0013"));
      var5.setText(var4);
      JScrollPane var6 = new JScrollPane(var5);
      var6.setPreferredSize(new Dimension(300, 400));
      Component[] var10000 = new Component[]{var5, var6};
      var1.add(var6, a("_X_(\u0014XZT \u0005\\CO-\u0004N"));
      this.updateJPanel();
      this.setAddedToJPanel(true);
   }

   public void updateJPanel() {
   }

   private static String a(String var0) {
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
            var10003 = 20;
            break;
         case 2:
            var10003 = 16;
            break;
         case 3:
            var10003 = 127;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
