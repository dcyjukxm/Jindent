package jindent.plugin.command;

import java.io.UnsupportedEncodingException;
import jindent.JindentException;
import jindent.JindentSettings;
import jindent.MessageList;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.message.ErrorMessage;
import jindent.plugin.FormatCommand;
import jindent.plugin.PresentationContext;
import jindent.plugin.file.ByteArrayDestinationFile;
import jindent.plugin.file.ByteArraySourceFile;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginFileException;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.file.StringDestinationFile;
import jindent.plugin.file.StringSourceFile;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.util.Utils;

public class FormatFileCopy extends FormatCommand {
   public FormatFileCopy(PluginSourceFile var1, PluginDestinationFile var2) {
      super(var1, var2);
   }

   protected void format(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
      Context var5 = var1.getContext();
      PluginSourceFile var6 = this.getSourceFile();
      PluginDestinationFile var7 = this.getDestinationFile();
      var1.setSettings(var2);
      String var8 = var5.getEncoding(b("e,\u007fxhI,lbxe,h"));
      String var9 = var5.getEncoding(b("c7{}ix\u0007ansh+aj"));
      var5.d.setVariable(b("j+chRm/j"), var7.getShortFilename());
      var5.d.setVariable(b("j7caZe.jC}a\'"), var7.getFullFilename());
      var1.setActivationWindow(var4.getActivationWindow());
      ErrorMessage var10 = null;
      if(!var7.isWritable()) {
         var10 = new ErrorMessage(var5.getLanguage(), b("H\'|yub#{dsbbidpibf~<b-{-k~+{l~`\'."));
      } else {
         try {
            String var11 = var5.getLanguage();
            String var12 = b("^\'niub%/") + var11 + b(",$fay6b") + var6.getFullFilename();
            String var13 = b("[0fyub%/") + var11 + b(",$fay6b") + var7.getFullFilename();
            var4.setMessage(0, var12);
            String var14 = null;
            if(var6 instanceof ByteArraySourceFile) {
               byte[] var15 = ((ByteArraySourceFile)var6).getContent();
               byte[] var16 = var1.format(var15);
               var14 = new String(var16, var9);
            } else {
               if(!(var6 instanceof StringSourceFile)) {
                  throw new PluginFileException(b("J+ch<o.n~o,`") + var6.getClass() + b(".bkby\u007fbabh,-iky~bn-l~-\u007fhn,%jy_c,{hrxj&-qi6gbx-"));
               }

               String var22 = ((StringSourceFile)var6).getContent();
               var14 = var1.format(var22);
            }

            var4.setMessage(1, var13);
            if(var7 instanceof ByteArrayDestinationFile) {
               ((ByteArrayDestinationFile)var7).setContent(var14.getBytes(var9));
            } else {
               if(!(var7 instanceof StringDestinationFile)) {
                  throw new PluginFileException(b("J+ch<o.n~o,`") + var7.getClass() + b(".bkby\u007fbabh,-iky~bn-l~-\u007fhn,1jy_c,{hrxj&-qi6gbx-"));
               }

               ((StringDestinationFile)var7).setContent(var14);
            }
         } catch (PluginFileException var17) {
            var10 = new ErrorMessage(var5.getLanguage(), var17.getMessage());
         } catch (JindentException var18) {
            var10 = Utils.jindentExceptionToErrorMessage(var5.getLanguage(), var18);
         } catch (UnsupportedEncodingException var19) {
            var10 = new ErrorMessage(var5.getLanguage(), var19.getMessage());
         }
      }

      var5.d.removeVariable(b("j+chRm/j"));
      var5.d.removeVariable(b("j7caZe.jC}a\'"));
      Report var20 = new Report(this.getSourceFile(), this.getDestinationFile(), new HistoryData(var5));
      MessageList var21 = var1.getMessageList();
      if(var10 != null) {
         var21.addMessage(var10);
      }

      if(var21.countMessages() > 0) {
         var20.addMessageList(var21);
         var4.showReport(var20);
         if(var3 != null) {
            var3.addReport(var20);
         }

         if(var21.containsWarningMessage()) {
            var4.setExitCode(2);
         }

         if(var21.containsErrorMessage()) {
            var4.setExitCode(1);
         }
      } else if(var2.getBoolean(b("k\'ahnm.!\u007fy|-}yYz\'}tZe.jL\u007fo\'|~"))) {
         var20.addMessageList(var21);
         var4.showReport(var20);
         if(var3 != null) {
            var3.addReport(var20);
         }
      }

   }

   protected void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3) {
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 12;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 15;
            break;
         case 3:
            var10003 = 13;
            break;
         default:
            var10003 = 28;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
