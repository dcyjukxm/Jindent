package jindent.plugin.a.c;

import java.io.File;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.MessageList;
import jindent.message.ErrorMessage;
import jindent.plugin.PluginThread;
import jindent.plugin.a.b.c;
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
         var3.setMessage(0, c("\u001d7\u001dkR0?MtR2=W2") + this.getSourceFile().getFullFilename());
         var3.setMessage(1, c("\n7W2") + this.getDestinationFile().getFullFilename());
         Report var4 = new Report(this.getSourceFile(), this.getDestinationFile(), (HistoryData)null);
         MessageList var5 = new MessageList();
         File var6 = ((c)this.getSourceFile()).a();
         File var7 = ((jindent.plugin.a.b.a)this.getDestinationFile()).a();

         try {
            Utils.copyFile(var6, var7);
         } catch (JindentException var10) {
            ErrorMessage var9 = Utils.jindentExceptionToErrorMessage(c("\u001d7\u001dk"), var10);
            var5.addMessage(var9);
         }

         if(var5.countMessages() > 0) {
            var4.addMessageList(var5);
            var3.showReport(var4);
            if(var2 != null) {
               var2.addReport(var4);
            }
         } else if(var1.getBoolean(c("9=\u0003wI?4C`^.7\u001ff~(=\u001fk}74\bSX==\u001ea"))) {
            var4.addMessageList(var5);
            var3.showReport(var4);
            if(var2 != null) {
               var2.addReport(var4);
            }
         }
      } else {
         var3.setMessage(0, c("\r3\u0004bK76\n2]74\b(\u001b") + this.getSourceFile().getFullFilename());
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
            var10003 = 94;
            break;
         case 1:
            var10003 = 88;
            break;
         case 2:
            var10003 = 109;
            break;
         case 3:
            var10003 = 18;
            break;
         default:
            var10003 = 59;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
