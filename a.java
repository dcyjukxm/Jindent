import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class a implements FilenameFilter {
   boolean a;
   Pattern b;

   a(Pattern var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public boolean accept(File var1, String var2) {
      File var3 = new File(var1, var2);
      if(var3.isDirectory()) {
         return this.a;
      } else {
         Matcher var4 = this.b.matcher(var2);
         return var4.matches();
      }
   }
}
