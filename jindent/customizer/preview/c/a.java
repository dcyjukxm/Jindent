package jindent.customizer.preview.c;

import javax.swing.JTabbedPane;
import jindent.customizer.preview.SourceTextPane;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.report.Report;

public class a implements PluginEditor {
   private SourceTextPane a;
   private JTabbedPane b;
   private int c;

   public a(JTabbedPane var1, int var2, SourceTextPane var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public void show(Report var1) {
      this.b.setSelectedIndex(this.c);
   }

   public int getCaretLine() {
      return 0;
   }

   public int getCaretColumn() {
      return 0;
   }

   public int getCaretOffset() {
      return 0;
   }

   public void setCaret(int var1, int var2) {
      this.a.setCaretLine(var1);
   }

   public void setCaret(int var1) {
   }

   public boolean hasSelection() {
      return false;
   }

   public void setSelection(int var1, int var2) {
   }

   public int getSelectionStart() {
      return 0;
   }

   public int getSelectionEnd() {
      return 0;
   }

   public SourceTextPane a() {
      return this.a;
   }
}
