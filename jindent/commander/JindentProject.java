package jindent.commander;

import java.awt.Rectangle;
import java.io.Serializable;
import jindent.JindentSettings;
import jindent.commander.FileEntry;

public class JindentProject implements Serializable {
   private static final long serialVersionUID = 3256719602351486300L;
   private FileEntry[] fileEntries = new FileEntry[0];
   private String filterMask = a("OY\u001d");
   private boolean filterEnabled = false;
   private boolean targetDirEnabled = false;
   private String targetDirPath = "";
   private boolean copyResources = false;
   private JindentSettings jindentSettings = null;
   private Rectangle frameBounds = new Rectangle(0, 0, 800, 600);

   public JindentSettings getJindentSettings() {
      return this.jindentSettings;
   }

   public void setJindentSettings(JindentSettings var1) {
      this.jindentSettings = var1;
   }

   public FileEntry[] getFileEntries() {
      return this.fileEntries;
   }

   public void setFileEntries(FileEntry[] var1) {
      this.fileEntries = var1;
   }

   public String getFilterMask() {
      return this.filterMask;
   }

   public void setFilterMask(String var1) {
      this.filterMask = var1;
   }

   public boolean isFilterEnabled() {
      return this.filterEnabled;
   }

   public void setFilterEnabled(boolean var1) {
      this.filterEnabled = var1;
   }

   public boolean isTargetDirEnabled() {
      return this.targetDirEnabled;
   }

   public void setTargetDirEnabled(boolean var1) {
      this.targetDirEnabled = var1;
   }

   public String getTargetDirPath() {
      return this.targetDirPath;
   }

   public void setTargetDirPath(String var1) {
      this.targetDirPath = var1;
   }

   public boolean isCopyResources() {
      return this.copyResources;
   }

   public void setCopyResources(boolean var1) {
      this.copyResources = var1;
   }

   public Rectangle getFrameBounds() {
      return this.frameBounds;
   }

   public void setFrameBounds(Rectangle var1) {
      this.frameBounds = var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 101;
            break;
         case 1:
            var10003 = 119;
            break;
         case 2:
            var10003 = 55;
            break;
         case 3:
            var10003 = 35;
            break;
         default:
            var10003 = 6;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
