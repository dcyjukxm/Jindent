package jindent.plugin.command;

import jindent.formatter.Caret;
import jindent.plugin.command.FormatEditorFile;
import jindent.plugin.editor.PluginEditor;

class FormatEditorFile$1 implements Runnable {
   private final PluginEditor a;
   private final Caret b;
   private final FormatEditorFile c;

   FormatEditorFile$1(FormatEditorFile var1, PluginEditor var2, Caret var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      this.a.setCaret(this.b.getLine(), this.b.getColumn());
   }
}
