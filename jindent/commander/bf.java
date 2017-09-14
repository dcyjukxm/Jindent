package jindent.commander;

import java.io.File;
import java.util.Comparator;

public class bf implements Comparator {
   public int compare(Object var1, Object var2) {
      File var3 = (File)var1;
      File var4 = (File)var2;
      boolean var5 = var3.isDirectory();
      boolean var6 = var4.isDirectory();
      String var7 = var3.getName();
      String var8 = var4.getName();
      return var5 && !var6?-1:(!var5 && var6?1:var7.compareTo(var8));
   }
}
