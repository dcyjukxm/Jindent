package jindent.commander;

import java.io.File;

public class FileSystemRoot extends File {
   public FileSystemRoot(File var1) {
      super(var1, "");
   }

   public FileSystemRoot(String var1) {
      super(var1);
   }

   public boolean isDirectory() {
      return true;
   }
}
