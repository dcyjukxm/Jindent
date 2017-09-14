package jindent.customizer.gui.settings.e;

import java.util.Iterator;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import jindent.Settings;
import jindent.SettingsUtils;
import jindent.customizer.CustomizerData;
import jindent.customizer.gui.settings.TextGUIObject;
import jindent.customizer.gui.settings.e.b;
import jindent.formatter.EnvironmentVariables;
import jindent.settings.UserVariablesSetting;
import jindent.util.g;
import jindent.util.swing.SwingUtils;

public class EnvironmentPopupMenu extends JPopupMenu {
   private TextGUIObject a;
   private CustomizerData b;
   private int c;
   private int d;
   private int e;
   private g f;

   public EnvironmentPopupMenu(CustomizerData var1, TextGUIObject var2, int var3, int var4, int var5) {
      this.f = new g(EnvironmentVariables.LIST_OF_ENVIRONMENT_VARIABLES);
      this.b = var1;
      this.a = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      Settings var6 = var1.getConnectedSettings();
      UserVariablesSetting var7 = var6.getUserVariablesSetting(SettingsUtils.createEnvironmentKey(a("R\u0002gGYF\u0003kTmK\u0014q")));
      UserVariablesSetting var8 = var6.getUserVariablesSetting(SettingsUtils.createEnvironmentKey(a("T\bqAjJ\'cGfF\u0013nP|")));
      this.a((Iterator)this.f, a("m\u0018lQjI\u0005\"cnU\u0018cWcB"));
      this.addSeparator();
      this.a(var7.keyIterator(), a("r\u0002gG/q\u0010p\\nE\u001dg"));
      this.addSeparator();
      this.a(var8.keyIterator(), a("t\bqAjJQTT}N\u0010`Yj"));
   }

   private void a(Iterator var1, String var2) {
      JMenu var3 = new JMenu(a("N\u001fqP}SQ&") + var2 + a("\u0003Q,\u001b!"));
      var3.setIcon(SwingUtils.readImageIcon(a("\u0016Gz\u00049\b\u0015mVzJ\u0014lAPB\u0015kA!W\u001fe")));
      JMenu var4 = new JMenu(a("N\u001fqP}SQ\'") + var2 + a("\u0002Q,\u001b!"));
      var4.setIcon(SwingUtils.readImageIcon(a("\u0016Gz\u00049\b\u0015mVzJ\u0014lAPB\u0015kA!W\u001fe")));
      this.a(var3, var4, var1);
      this.add(var3);
      this.add(var4);
   }

   private void a(JMenu var1, JMenu var2, Iterator var3) {
      if(var3.hasNext()) {
         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            this.a(var1, "$" + var4 + "$");
            this.a(var2, "%" + var4 + "%");
         }
      } else {
         this.a(var1);
         this.a(var2);
      }

   }

   private void a(JMenu var1) {
      JMenuItem var2 = new JMenuItem(a("\r\u001fm\u0015yF\u0003kTmK\u0014q\u0015nQ\u0010kYnE\u001dg\u001f"));
      var2.addActionListener(new jindent.customizer.gui.settings.e.a(this));
      var1.add(var2);
   }

   private void a(JMenu var1, String var2) {
      JMenuItem var3 = new JMenuItem(var2);
      var3.addActionListener(new b(this, var2));
      var1.add(var3);
   }

   static TextGUIObject a(EnvironmentPopupMenu var0) {
      return var0.a;
   }

   static int b(EnvironmentPopupMenu var0) {
      return var0.c;
   }

   static int c(EnvironmentPopupMenu var0) {
      return var0.d;
   }

   static int d(EnvironmentPopupMenu var0) {
      return var0.e;
   }

   static CustomizerData e(EnvironmentPopupMenu var0) {
      return var0.b;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 39;
            break;
         case 1:
            var10003 = 113;
            break;
         case 2:
            var10003 = 2;
            break;
         case 3:
            var10003 = 53;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
