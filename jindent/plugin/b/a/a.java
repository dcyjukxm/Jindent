package jindent.plugin.b.a;

import java.awt.Component;
import javax.swing.SwingUtilities;
import jindent.plugin.b.a.CommanderProgressDialog;
import jindent.plugin.b.a.b;
import jindent.plugin.b.a.c;
import jindent.plugin.b.a.d;
import jindent.plugin.b.a.e;
import jindent.plugin.b.a.f;
import jindent.plugin.output.PluginThreadOutput;

public class a implements PluginThreadOutput {
   private CommanderProgressDialog a = new CommanderProgressDialog();
   private boolean b;

   public a() {
      this.a.a(false);
   }

   public void setMaximum(int var1) {
      SwingUtilities.invokeLater(new b(this, var1));
   }

   public void setCurrent(int var1) {
      SwingUtilities.invokeLater(new c(this, var1));
   }

   public void setMessage(int var1, String var2) {
      SwingUtilities.invokeLater(new d(this, var1, var2));
   }

   public void init() {
      this.b = false;
      SwingUtilities.invokeLater(new e(this));
   }

   public void stopFormatting() {
      this.b = true;
      this.setOutputVisible(false);
   }

   public boolean isFormattingStopped() {
      return this.b;
   }

   public void setOutputVisible(boolean var1) {
      SwingUtilities.invokeLater(new f(this, var1));
   }

   public Component a() {
      return this.a;
   }

   static CommanderProgressDialog a(jindent.plugin.b.a.a var0) {
      return var0.a;
   }
}
