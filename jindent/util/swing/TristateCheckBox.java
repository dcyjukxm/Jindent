package jindent.util.swing;

import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ActionMapUIResource;
import jindent.util.swing.TristateCheckBox$2;
import jindent.util.swing.d;
import jindent.util.swing.k;
import jindent.util.swing.l;

public class TristateCheckBox extends JCheckBox {
   public static final k NOT_SELECTED = new k((d)null);
   public static final k SELECTED = new k((d)null);
   public static final k DONT_CARE = new k((d)null);
   private final l a;

   public TristateCheckBox(String var1, Icon var2, k var3) {
      super(var1, var2);
      super.addMouseListener(new d(this));
      ActionMapUIResource var4 = new ActionMapUIResource();
      var4.put(a("9&\u001b0n,0"), new TristateCheckBox$2(this));
      var4.put(a(";1\u0012&|:1\u001a"), (Action)null);
      SwingUtilities.replaceUIActionMap(this, var4);
      this.a = new l(this, this.getModel(), (d)null);
      this.setModel(this.a);
      this.a(var3);
   }

   public TristateCheckBox(String var1, k var2) {
      this(var1, (Icon)null, var2);
   }

   public TristateCheckBox(String var1) {
      this(var1, DONT_CARE);
   }

   public TristateCheckBox() {
      this((String)null);
   }

   public void addMouseListener(MouseListener var1) {
   }

   public void a(k var1) {
      l.a(this.a, var1);
   }

   public k a() {
      return l.b(this.a);
   }

   public void setSelected(boolean var1) {
      if(var1) {
         this.a(SELECTED);
      } else {
         this.a(NOT_SELECTED);
      }

   }

   static l a(TristateCheckBox var0) {
      return var0.a;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 73;
            break;
         case 1:
            var10003 = 84;
            break;
         case 2:
            var10003 = 126;
            break;
         case 3:
            var10003 = 67;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
