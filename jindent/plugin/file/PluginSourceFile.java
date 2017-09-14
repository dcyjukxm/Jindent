package jindent.plugin.file;

import jindent.plugin.editor.PluginEditor;

public interface PluginSourceFile {
   String getFullFilename();

   String getShortFilename();

   PluginEditor getEditor();
}
