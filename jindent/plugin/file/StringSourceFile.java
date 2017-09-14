package jindent.plugin.file;

import jindent.plugin.file.PluginFileException;

public interface StringSourceFile {
   String getContent() throws PluginFileException;
}
