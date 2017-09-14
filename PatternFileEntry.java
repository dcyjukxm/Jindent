import java.util.regex.Pattern;
import jindent.commander.FileEntry;

class PatternFileEntry extends FileEntry {
   private Pattern a;

   PatternFileEntry(String var1, boolean var2, Pattern var3) {
      this.setFilename(var1);
      this.setRecursive(var2);
      this.a = var3;
   }

   Pattern a() {
      return this.a;
   }
}
