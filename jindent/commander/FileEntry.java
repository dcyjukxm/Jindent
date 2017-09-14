package jindent.commander;

import java.io.File;
import java.io.Serializable;

public class FileEntry implements Serializable {
   private static final long serialVersionUID = 3256719602351486301L;
   public static final int FILE_COUNT_LIMIT = 500;
   private boolean recursive;
   private String filename;
   private int fileCount = 0;

   public FileEntry() {
   }

   public FileEntry(File var1, boolean var2) {
      this.filename = var1.getAbsolutePath();
      this.recursive = var2;
   }

   public File getFile() {
      return new File(this.filename);
   }

   public void setFilename(String var1) {
      this.filename = var1;
   }

   public boolean isRecursive() {
      return this.recursive;
   }

   public void setRecursive(boolean var1) {
      this.recursive = var1;
   }

   public String toString() {
      return this.filename + (this.isRecursive()?a("/\u001ct\u000e`u\u001dx\u001bp\'\u0003~\tp."):"");
   }

   public String getFilename() {
      return this.filename;
   }

   public int getFileCount() {
      return this.fileCount;
   }

   public void setFileCount(int var1) {
      this.fileCount = var1;
   }

   public String getFileCountString() {
      return this.fileCount <= 500?this.fileCount + a("\'(x\u0001pt"):a("J\u0001c\b5S\u0006p\u00035") + this.fileCount + a("\'(x\u0001pt");
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 7;
            break;
         case 1:
            var10003 = 110;
            break;
         case 2:
            var10003 = 17;
            break;
         case 3:
            var10003 = 109;
            break;
         default:
            var10003 = 21;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
