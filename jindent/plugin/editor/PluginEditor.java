package jindent.plugin.editor;

import jindent.plugin.report.Report;

public interface PluginEditor {
   int NO_VALUE = -1;

   void show(Report var1);

   int getCaretLine();

   int getCaretColumn();

   int getCaretOffset();

   void setCaret(int var1, int var2);

   void setCaret(int var1);

   boolean hasSelection();

   void setSelection(int var1, int var2);

   int getSelectionStart();

   int getSelectionEnd();
}
