package jindent.plugin.file;

import jindent.plugin.file.PluginFileException;

public interface ByteArraySourceFile {
   byte[] getContent() throws PluginFileException;
}
