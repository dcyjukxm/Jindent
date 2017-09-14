package jindent.plugin.output.dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import jindent.plugin.output.PluginThreadOutput;
import jindent.plugin.output.dialog.ProgressDialog;
import jindent.plugin.output.dialog.ThreadOutputDialog$1;
import jindent.plugin.output.dialog.ThreadOutputDialog$2;
import jindent.plugin.output.dialog.ThreadOutputDialog$3;
import jindent.plugin.output.dialog.ThreadOutputDialog$4;
import jindent.plugin.output.dialog.ThreadOutputDialog$5;
import jindent.plugin.output.dialog.ThreadOutputDialog$6;

public class ThreadOutputDialog implements PluginThreadOutput {
   private ProgressDialog a;
   private boolean b;

   public ThreadOutputDialog(JFrame var1) {
      this.a = new ProgressDialog(var1);
      this.init();
   }

   public ThreadOutputDialog(JDialog var1) {
      this.a = new ProgressDialog(var1);
      this.init();
   }

   public void init() {
      this.b = false;
      SwingUtilities.invokeLater(new ThreadOutputDialog$1(this));
   }

   public void setMaximum(int var1) {
      SwingUtilities.invokeLater(new ThreadOutputDialog$2(this, var1));
   }

   public void setCurrent(int var1) {
      SwingUtilities.invokeLater(new ThreadOutputDialog$3(this, var1));
   }

   public void setMessage(int var1, String var2) {
      SwingUtilities.invokeLater(new ThreadOutputDialog$4(this, var1, var2));
   }

   public void setOutputVisible(boolean var1) {
      SwingUtilities.invokeLater(new ThreadOutputDialog$5(this, var1));
   }

   public void stopFormatting() {
      this.b = true;
      SwingUtilities.invokeLater(new ThreadOutputDialog$6(this));
   }

   public boolean isFormattingStopped() {
      return this.b;
   }

   static ProgressDialog access$000(ThreadOutputDialog var0) {
      return var0.a;
   }
}
