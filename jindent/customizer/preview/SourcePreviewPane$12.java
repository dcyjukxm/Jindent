package jindent.customizer.preview;

import jindent.JindentException;
import jindent.MessageList;
import jindent.Settings;
import jindent.SettingsUtils;
import jindent.customizer.preview.SourcePreviewPane;
import jindent.customizer.preview.SourcePreviewPane$12$1;
import jindent.customizer.preview.SourceTextPaneHighlighting;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.formatter.f;
import jindent.message.ErrorMessage;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.util.Utils;

class SourcePreviewPane$12 implements Runnable {
   private final Context a;
   private final InternalFormatter b;
   private final SourcePreviewPane c;

   SourcePreviewPane$12(SourcePreviewPane var1, Context var2, InternalFormatter var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      boolean var1 = !SourcePreviewPane.access$1000(this.c).equals(a("ZQFA\u0016qH\u000fT\u00134_\u0010P\rx_\u0004]\u0001\u001e"));
      String var2 = null;
      if(SourcePreviewPane.access$1100(this.c) == 1) {
         var2 = this.c.getResourcePreviewFile(this.a, SourcePreviewPane.access$1000(this.c));
      } else if(SourcePreviewPane.access$1100(this.c) == 2) {
         var2 = this.c.getExternalPreviewFile(SourcePreviewPane.access$1200(this.c));
      }

      if(var2 != null && var1) {
         Settings var3 = SourcePreviewPane.access$1300(this.c).getConnectedSettings();
         String var4 = SettingsUtils.extractExtensionFromFilename(SourcePreviewPane.access$1000(this.c));
         String var5 = SourcePreviewPane.access$1100(this.c) == 2?SourcePreviewPane.access$1200(this.c):a(";N\u0014T\u0012}[\u0011BKDL\u0003G\rqIH") + var4;
         jindent.customizer.preview.c.a var6 = new jindent.customizer.preview.c.a(SourcePreviewPane.access$1400(this.c), 1, SourcePreviewPane.access$100(this.c));
         jindent.customizer.preview.b.a var7 = new jindent.customizer.preview.b.a(var6, SourcePreviewPane.access$1500(var5));
         jindent.customizer.preview.b.a var8 = null;
         if(SourcePreviewPane.access$200(this.c)) {
            jindent.customizer.preview.c.a var9 = new jindent.customizer.preview.c.a(SourcePreviewPane.access$1400(this.c), 0, SourcePreviewPane.access$300(this.c));
            var8 = new jindent.customizer.preview.b.a(var9, var5);
         }

         ErrorMessage var21 = null;

         try {
            this.a.d.setVariable(a("rK\n]\"}R\u0003\u007f\u0005y["), var7.getFullFilename());
            this.a.d.setVariable(a("rW\nT*uS\u0003"), var7.getShortFilename());
            if(SourcePreviewPane.access$1600(this.c) != null) {
               int var10 = SourcePreviewPane.access$1600(this.c).countFilters();

               for(int var11 = 0; var11 < var10; ++var11) {
                  SourcePreviewPane.access$1600(this.c).getFilterAt(var11).filter(this.a);
               }
            }

            if(SourcePreviewPane.access$200(this.c)) {
               SourcePreviewPane.access$300(this.c).setHighlighting(SourceTextPaneHighlighting.getInstance(this.a));
               SourcePreviewPane.access$300(this.c).setText(var2);
            }

            f.splashScreenCounter = -20;
            String var22 = this.b.format(var2);
            SourcePreviewPane.access$100(this.c).setHighlighting(SourceTextPaneHighlighting.getInstance(this.a));
            SourcePreviewPane.access$100(this.c).setText(var22);
            SourcePreviewPane.access$1700(this.c, 1);
         } catch (JindentException var19) {
            SourcePreviewPane.access$1800(this.c, this.a.g + a("4{\u0014C\u000bf\u0004l") + var19.getMessage());
            jindent.debugger.a.b(var19.toString());
            var21 = Utils.jindentExceptionToErrorMessage(this.a.getLanguage(), var19);
            SourcePreviewPane.access$1900(this.c);
         } finally {
            MessageList var14 = this.b.getMessageList();
            Object var15 = var8 == null?new Report(var7, new HistoryData(this.a)):new SourcePreviewPane$12$1(this, var8, var7, new HistoryData(this.a));
            if(var21 != null) {
               var14.addMessage(var21);
            }

            ((Report)var15).addMessageList(var14);
            ReportList var16 = new ReportList();
            var16.addReport((Report)var15);
            SourcePreviewPane.access$2000(this.c).update(var16);
            this.a.c = var3;
            this.a.d.removeVariable(a("rW\nT*uS\u0003"));
            this.a.d.removeVariable(a("rK\n]\"}R\u0003\u007f\u0005y["));
         }
      } else {
         SourcePreviewPane.access$1800(this.c, var2);
         SourcePreviewPane.access$2000(this.c).clear();
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
            var10003 = 20;
            break;
         case 1:
            var10003 = 62;
            break;
         case 2:
            var10003 = 102;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 100;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
