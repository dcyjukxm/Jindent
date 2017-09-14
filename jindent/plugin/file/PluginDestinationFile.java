package jindent.plugin.file;

import jindent.plugin.editor.PluginEditor;

public interface PluginDestinationFile {
   String getFullFilename();

   String getShortFilename();

   boolean isWritable();

   PluginEditor getEditor();
}
