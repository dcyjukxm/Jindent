package jindent.plugin.report;

import jindent.MessageList;
import jindent.message.Message;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.ReportList;

public class Report {
   protected MessageList a;
   protected PluginSourceFile b;
   protected PluginDestinationFile c;
   protected String d;
   protected HistoryData e;
   protected ReportList f;

   public Report(PluginFile var1, HistoryData var2) {
      this(var1, var1, var2);
   }

   public Report(PluginSourceFile var1, PluginDestinationFile var2, HistoryData var3) {
      this.b = var1;
      this.c = var2;
      this.e = var3;
   }

   public HistoryData getHistoryData() {
      return this.e;
   }

   public String getTitle() {
      return !this.b.getFullFilename().equals(this.c.getFullFilename())?this.b.getFullFilename() + a("\u001a\u0017U_&") + this.c.getFullFilename():this.b.getFullFilename();
   }

   public PluginSourceFile getSourceFile() {
      return this.b;
   }

   public PluginDestinationFile getDestinationFile() {
      return this.c;
   }

   public void addMessageList(MessageList var1) {
      this.a = var1;
      this.a.setParentReport(this);
   }

   public MessageList getMessageList() {
      return this.a;
   }

   public String toString() {
      String var1 = System.getProperty(a("|^\u0016\u0004(cR\b\u0000tqC\u0017\u0013"));
      MessageList var2 = this.getMessageList();
      StringBuffer var3 = new StringBuffer();
      int var4 = var2.countMessages();

      for(int var5 = 0; var5 < var4; ++var5) {
         Message var6 = var2.getMessageAt(var5);
         var3.append(a("0\u0017"));
         var3.append(var6.getLanguage());
         var3.append(" ");
         var3.append(Message.idToString(var6.getMessageId()));
         var3.append(a("*\u0017"));
         if(var6.hasColumnAndLineNumber()) {
            var3.append(a("K\u0017\u0014\bhu\r"));
            var3.append(var6.getLine());
            var3.append(a("<\u0017\u001b\u000ej*"));
            var3.append(var6.getColumn());
            var3.append(a("0jX"));
         }

         var3.append(var6.getMessage());
         if(var5 < var4 - 1) {
            var3.append(var1);
         }
      }

      return var3.toString();
   }

   public ReportList getParentReportList() {
      return this.f;
   }

   public void setParentReportList(ReportList var1) {
      this.f = var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 16;
            break;
         case 1:
            var10003 = 55;
            break;
         case 2:
            var10003 = 120;
            break;
         case 3:
            var10003 = 97;
            break;
         default:
            var10003 = 6;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
