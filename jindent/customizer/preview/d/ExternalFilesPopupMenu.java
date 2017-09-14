package jindent.customizer.preview.d;

import java.util.Iterator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.preview.d.b;
import jindent.customizer.preview.d.c;
import jindent.util.swing.SwingUtils;

public class ExternalFilesPopupMenu extends JPopupMenu {
   public ExternalFilesPopupMenu(SourcePreviewPane var1) {
      JMenuItem var2 = new JMenuItem(a("\u0013\'J\u001dq74\u000e{V>&\u000eiPr\u0013\\XI;&Y\u001ds;0Z\u0013\u0011|"));
      var2.setIcon(SwingUtils.readImageIcon(a("cuV\f\t}\'A^J?&@I`3\'J\u0013O<$")));
      var2.addActionListener(new b(this, var1));
      this.add(var2);
      this.addSeparator();
      Iterator var3 = var1.getExternalPreviewFiles();

      boolean var4;
      for(var4 = false; var3.hasNext(); var4 = true) {
         String var5 = (String)var3.next();
         JCheckBoxMenuItem var6 = new JCheckBoxMenuItem(var5);
         if(var1.getPreviewMode() == 2 && var5.equals(var1.getCurrentExternalFilenamePreview())) {
            var6.setSelected(true);
         }

         var6.setIcon(SwingUtils.readImageIcon(a("cuV\f\t}\'A^J?&@I\u0011\"-I")));
         var6.addActionListener(new jindent.customizer.preview.d.a(var5, var1));
         this.add(var6);
      }

      if(var4) {
         this.addSeparator();
         JCheckBoxMenuItem var7 = new JCheckBoxMenuItem(a("\u00070K\u001du;-JXQ&d]\u001do &XTZ%chTS70"));
         var7.setIcon(SwingUtils.readImageIcon(a("cuV\f\t}\'A^J?&@IL|3@Z")));
         if(var1.getPreviewMode() == 1) {
            var7.setSelected(true);
         }

         var7.addActionListener(new c(this, var1));
         this.add(var7);
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
            var10003 = 67;
            break;
         case 2:
            var10003 = 46;
            break;
         case 3:
            var10003 = 61;
            break;
         default:
            var10003 = 63;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
