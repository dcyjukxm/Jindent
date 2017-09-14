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
import jindent.plugin.file.PluginFile;
import jindent.plugin.file.PluginFileException;
import jindent.plugin.file.StringDestinationFile;
import jindent.plugin.file.StringSourceFile;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.util.Utils;

public abstract class AbstractFormatFile extends FormatCommand {
   public AbstractFormatFile(PluginFile var1) {
      super(var1, var1);
   }

   protected void format(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
      this.startCommand(var1, var2, var3, var4);
      Context var5 = var1.getContext();
      PluginFile var6 = (PluginFile)this.getSourceFile();
      var5.d.setVariable(b("!@\u001e\"h&D\u0017"), var6.getShortFilename());
      var5.d.setVariable(b("!\\\u001e+`.E\u0017\tG*L"), var6.getFullFilename());
      var1.setSettings(var2);
      var1.setActivationWindow(var4.getActivationWindow());
      String var7 = var5.getEncoding(b(".G\u00022R\u0002G\u0011(B.G\u0015"));
      String var8 = var5.getEncoding(b("(\\\u00067S3l\u001c$I#@\u001c "));
      ErrorMessage var9 = null;
      MessageList var10 = var1.getMessageList();
      if(!var6.isWritable()) {
         var9 = new ErrorMessage(var5.getLanguage(), b("\u0001@\u001e\"\u0006.ZR5C&M_(H+P\\ge&G\u001c(RgK\u0017g@([\u001f&R3L\u0016f"));
      } else {
         try {
            String var11 = var5.getLanguage();
            var4.setMessage(0, b("\u0001F\u0000*G3]\u001b)Ag") + var11 + b("gO\u001b+C}\t") + var6.getFullFilename());
            this.beforeFormat(var1, var2, var3, var4);
            String var12 = null;
            if(var6 instanceof ByteArraySourceFile) {
               byte[] var13 = ((ByteArraySourceFile)var6).getContent();
               byte[] var14 = var1.format(var13);
               var12 = new String(var14, var8);
            } else {
               if(!(var6 instanceof StringSourceFile)) {
                  throw new PluginFileException(b("\u0001@\u001e\"\u0006$E\u00134Ug\u000b") + var6.getClass() + b("e\t\u0016(C4\t\u001c(RgF\u0014!C5\t\u0013gV5F\u0002\"TgN\u00173e(G\u0006\"H3\u0001[gK\"]\u001a(Bf"));
               }

               String var25 = ((StringSourceFile)var6).getContent();
               var12 = var1.format(var25);
            }

            if(var6 instanceof ByteArrayDestinationFile) {
               ((ByteArrayDestinationFile)var6).setContent(var12.getBytes(var8));
            } else {
               if(!(var6 instanceof StringDestinationFile)) {
                  throw new PluginFileException(b("\u0001@\u001e\"\u0006$E\u00134Ug\u000b") + var6.getClass() + b("e\t\u0016(C4\t\u001c(RgF\u0014!C5\t\u0013gV5F\u0002\"TgZ\u00173e(G\u0006\"H3\u0001[gK\"]\u001a(Bf"));
               }

               ((StringDestinationFile)var6).setContent(var12);
            }
         } catch (PluginFileException var20) {
            var9 = new ErrorMessage(var5.getLanguage(), var20.getMessage());
         } catch (JindentException var21) {
            var9 = Utils.jindentExceptionToErrorMessage(var5.getLanguage(), var21);
         } catch (UnsupportedEncodingException var22) {
            var9 = new ErrorMessage(var5.getLanguage(), var22.getMessage());
         } finally {
            this.afterFormat(var1, var2, var3, var4);
         }
      }

      var5.d.removeVariable(b("!@\u001e\"h&D\u0017"));
      var5.d.removeVariable(b("!\\\u001e+`.E\u0017\tG*L"));
      Report var24 = new Report(this.getSourceFile(), this.getDestinationFile(), new HistoryData(var5));
      if(var9 != null) {
         var10.addMessage(var9);
      }

      if(var10.countMessages() > 0) {
         var24.addMessageList(var10);
         var4.showReport(var24);
         if(var3 != null) {
            var3.addReport(var24);
         }

         if(var10.containsWarningMessage()) {
            var4.setExitCode(2);
         }

         if(var10.containsErrorMessage()) {
            var4.setExitCode(1);
         }
      } else if(var2.getBoolean(b(" L\u001c\"T&E\\5C7F\u00003c1L\u0000>`.E\u0017\u0006E$L\u00014"))) {
         var24.addMessageList(var10);
         var4.showReport(var24);
         if(var3 != null) {
            var3.addReport(var24);
         }
      }

      this.endCommand(var1, var2, var3, var4);
   }

   protected abstract void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3);

   public abstract void startCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4);

   public abstract void endCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4);

   public abstract void beforeFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4);

   public abstract void afterFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4);

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 71;
            break;
         case 1:
            var10003 = 41;
            break;
         case 2:
            var10003 = 114;
            break;
         case 3:
            var10003 = 71;
            break;
         default:
            var10003 = 38;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
