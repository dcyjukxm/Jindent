package jindent.plugin;

import java.util.logging.Level;
import javax.swing.SwingUtilities;
import jindent.ExtensionManager;
import jindent.JindentSettings;
import jindent.SettingsUtils;
import jindent.debugger.JindentLogging;
import jindent.formatter.InternalFormatter;
import jindent.plugin.FormatCommand$1;
import jindent.plugin.PresentationContext;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.report.ReportList;

public abstract class FormatCommand {
   private PluginSourceFile a;
   private PluginDestinationFile b;

   public FormatCommand(PluginSourceFile var1, PluginDestinationFile var2) {
      this.a = var1;
      this.b = var2;
   }

   public PluginDestinationFile getDestinationFile() {
      return this.b;
   }

   public PluginSourceFile getSourceFile() {
      return this.a;
   }

   public void format(JindentSettings var1, ReportList var2, boolean var3, PresentationContext var4) {
      PluginSourceFile var5 = this.getSourceFile();

      try {
         ExtensionManager var6 = var1.getExtensionManager();
         String var7 = var5.getFullFilename();
         String var8 = SettingsUtils.extractExtensionFromFilename(var7);
         InternalFormatter var9 = (InternalFormatter)var6.getFormatterByExtension(var8);
         if(var9 != null) {
            if(var3) {
               SwingUtilities.invokeAndWait(new FormatCommand$1(this, var9, var1, var2, var4));
            } else {
               this.format(var9, var1, var2, var4);
            }
         } else {
            this.doNotFormat(var1, var2, var4);
         }
      } catch (Exception var10) {
         jindent.debugger.a.a(var10);
         JindentLogging.getLogger().log(Level.SEVERE, a("\u0003\u0010:=\u00122\u000166B)\u000b:-\u0010#\f"), var10);
      }

   }

   protected abstract void format(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4);

   protected abstract void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3);

   public int hashCode() {
      byte var2 = 1;
      int var3 = 31 * var2 + (this.b == null?0:this.b.getFullFilename().hashCode());
      var3 = 31 * var3 + (this.a == null?0:this.a.getFullFilename().hashCode());
      return var3;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         FormatCommand var2 = (FormatCommand)var1;
         if(this.b == null) {
            if(var2.b != null) {
               return false;
            }
         } else if(!this.b.getFullFilename().equals(var2.b.getFullFilename())) {
            return false;
         }

         if(this.a == null) {
            if(var2.a != null) {
               return false;
            }
         } else if(!this.a.getFullFilename().equals(var2.a.getFullFilename())) {
            return false;
         }

         return true;
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 70;
            break;
         case 1:
            var10003 = 104;
            break;
         case 2:
            var10003 = 89;
            break;
         case 3:
            var10003 = 88;
            break;
         default:
            var10003 = 98;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
