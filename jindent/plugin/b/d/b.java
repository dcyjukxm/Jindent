package jindent.plugin.b.d;

import java.io.File;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.MessageList;
import jindent.message.ErrorMessage;
import jindent.plugin.PluginThread;
import jindent.plugin.b.c.c;
import jindent.plugin.command.FormatFileCopy;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.util.Utils;

public class b extends FormatFileCopy {
   private boolean c = true;

   public b(PluginSourceFile var1, PluginDestinationFile var2, boolean var3) {
      super(var1, var2);
      this.c = var3;
   }

   protected void a(JindentSettings var1, ReportList var2, PluginThread var3) {
      if(this.c) {
         var3.setMessage(0, c("<\u0004eC_\u0011\f5\\_\u0013\u000e/\u001a") + this.getSourceFile().getFullFilename());
         var3.setMessage(1, c("+\u0004/\u001a") + this.getDestinationFile().getFullFilename());
         Report var4 = new Report(this.getSourceFile(), this.getDestinationFile(), (HistoryData)null);
         MessageList var5 = new MessageList();
         File var6 = ((c)this.getSourceFile()).a();
         File var7 = ((jindent.plugin.b.c.a)this.getDestinationFile()).a();

         try {
            Utils.copyFile(var6, var7);
         } catch (JindentException var10) {
            ErrorMessage var9 = Utils.jindentExceptionToErrorMessage(c("<\u0004eC"), var10);
            var5.addMessage(var9);
         }

         if(var5.countMessages() > 0) {
            var4.addMessageList(var5);
            var3.showReport(var4);
            if(var2 != null) {
               var2.addReport(var4);
            }
         } else if(var1.getBoolean(c("\u0018\u000e{_D\u001e\u0007;HS\u000f\u0004gNs\t\u000egCp\u0016\u0007p{U\u001c\u000efI"))) {
            var4.addMessageList(var5);
            var3.showReport(var4);
            if(var2 != null) {
               var2.addReport(var4);
            }
         }
      } else {
         var3.setMessage(0, c(",\u0000|JF\u0016\u0005r\u001aP\u0016\u0007p\u0000\u0016") + this.getSourceFile().getFullFilename());
         var3.setMessage(1, "");
      }

   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 127;
            break;
         case 1:
            var10003 = 107;
            break;
         case 2:
            var10003 = 21;
            break;
         case 3:
            var10003 = 58;
            break;
         default:
            var10003 = 54;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
