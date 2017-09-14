package jindent.plugin.a.c;

import jindent.JindentSettings;
import jindent.formatter.InternalFormatter;
import jindent.plugin.PresentationContext;
import jindent.plugin.command.AbstractFormatFile;
import jindent.plugin.file.PluginFile;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;

public class a extends AbstractFormatFile {
   public a(PluginFile var1) {
      super(var1);
   }

   public void a(Report var1) {
      if(var1 != null) {
         System.out.println(var1);
      }

   }

   protected void doNotFormat(JindentSettings var1, ReportList var2, PresentationContext var3) {
      var3.setMessage(0, c("\u0004{+`(>~%0>>|\'*x") + this.getSourceFile().getFullFilename());
   }

   public void startCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void endCommand(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void beforeFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   public void afterFormat(InternalFormatter var1, JindentSettings var2, ReportList var3, PresentationContext var4) {
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 87;
            break;
         case 1:
            var10003 = 16;
            break;
         case 2:
            var10003 = 66;
            break;
         case 3:
            var10003 = 16;
            break;
         default:
            var10003 = 88;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
