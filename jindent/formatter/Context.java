package jindent.formatter;

import jindent.MessageList;
import jindent.Settings;
import jindent.SettingsUtils;
import jindent.formatter.CaretHistoryMapper;
import jindent.formatter.EnvironmentVariables;
import jindent.formatter.m;
import jindent.formatter.t;
import jindent.formatter.v;
import jindent.message.Message;
import jindent.message.WarningMessage;
import jindent.settings.BracesSetting;
import jindent.settings.PackageListOfRegExSetting;
import jindent.settings.sorter.SorterElement;

public abstract class Context {
   public static final int NONE_ENTRY_MODE = 0;
   public static final int FILE_ENTRY_MODE = 1;
   public static final int SOURCE_CODE_ENTRY_MODE = 2;
   public t a;
   public int b;
   public Settings c;
   public EnvironmentVariables d;
   public v e;
   public jindent.formatter.c.a f;
   public String g;
   public String h;
   public String i;
   public String j;
   public MessageList k;
   public int l;
   public CaretHistoryMapper m;
   int n;

   public Context(int var1, String var2, String var3, int var4) {
      this(var1, var2, var3, var3, var3, var4);
   }

   public Context(int var1, String var2, String var3, String var4, String var5, int var6) {
      this.l = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
      this.j = var5;
      this.n = var6;
      this.c = null;
      this.d = new EnvironmentVariables();
      this.k = new MessageList();
      this.b = 0;
      this.m = null;
   }

   public String pathOfResources() {
      return pathOfResources(this.j);
   }

   public static String pathOfResources(String var0) {
      return a("\u0010\u001cTh\u001aZ\u0018I)") + var0 + "/";
   }

   public void init() {
      if(this.e != null) {
         this.e.a(this);
      }

      this.k.clear();
   }

   public String getLanguage() {
      return this.g;
   }

   public void addMessage(Message var1) {
      int var2 = var1.getMessageId();
      int var3 = 1;
      switch(var2) {
      case 2:
         var3 = this.c.getMessageReportIndex(SettingsUtils.createGeneralKey(a("O\u0017Ou\u001bM;Xu\r^\u0011Xu")));
         break;
      case 3:
         var3 = this.c.getMessageReportIndex(SettingsUtils.createGeneralKey(a("Y\u0019Ok\u001fK\u0002Xt3Z\u0005Ng\u0019Z\u0005")));
         break;
      case 4:
         var3 = this.c.getMessageReportIndex(SettingsUtils.createGeneralKey(a("U\u0017Kg:P\u0015pc\rL\u0017Zc\r")));
      }

      if(var3 == 1 || var3 == 2 && var1 instanceof WarningMessage) {
         this.k.addMessage(var1);
      }

   }

   public abstract m newParser();

   public boolean getBoolean(String var1) {
      return this.c.getBoolean(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setBoolean(String var1, boolean var2) {
      this.c.setBoolean(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public boolean isInfiniteINumber(String var1) {
      return this.c.isInfiniteINumber(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setInfiniteINumber(String var1, boolean var2) {
      this.c.setInfiniteINumber(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getNumber(String var1) {
      return this.c.getNumber(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setNumber(String var1, int var2) {
      this.c.setNumber(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getWrappingIndex(String var1) {
      return this.c.getWrappingIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setWrappingIndex(String var1, int var2) {
      this.c.setWrappingIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getPreProcessorIndentationIndex(String var1) {
      return this.c.getPreProcessorIndentationIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setPreProcessorIndentationIndex(String var1, int var2) {
      this.c.setPreProcessorIndentationIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getBAWrappingIndex(String var1) {
      return this.c.getBAWrappingIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setBAWrappingIndex(String var1, int var2) {
      this.c.setBAWrappingIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getLineWrappingPolicyIndex(String var1) {
      return this.c.getLineWrappingPolicyIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setLineWrappingPolicyIndex(String var1, int var2) {
      this.c.setLineWrappingPolicyIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getFooterIndex(String var1) {
      return this.c.getFooterIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setFooterIndex(String var1, int var2) {
      this.c.setFooterIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getHeaderIndex(String var1) {
      return this.c.getHeaderIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setHeaderIndex(String var1, int var2) {
      this.c.setHeaderIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getIndentationIndex(String var1) {
      return this.c.getIndentationIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setIndentationIndex(String var1, int var2) {
      this.c.setIndentationIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getPositionIndex(String var1) {
      return this.c.getPositionIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setPositionIndex(String var1, int var2) {
      this.c.setPositionIndex(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getAbsoluteRelativeIndex(String var1) {
      return this.c.getAbsoluteRelativeIndex(SettingsUtils.createSettingKey(this.h, var1));
   }

   public String getDateFormat(String var1) {
      return this.c.getDateFormat(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setDateFormat(String var1, String var2) {
      this.c.setDateFormat(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public BracesSetting getBracesSetting(String var1) {
      return this.c.getBracesSetting(SettingsUtils.createSettingKey(this.h, var1));
   }

   public SorterElement getSorterElement(String var1) {
      return this.c.getSorterElement(SettingsUtils.createSettingKey(this.h, var1));
   }

   public String getString(String var1) {
      return this.c.getString(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setString(String var1, String var2) {
      this.c.setString(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public String[] getStringArray(String var1) {
      return this.c.getStringArray(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setStringArray(String var1, String var2) {
      this.c.setStringArray(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public String getEncoding(String var1) {
      return this.c.getEncoding(SettingsUtils.createSettingKey(this.h, var1));
   }

   public void setEncoding(String var1, String var2) {
      this.c.setEncoding(SettingsUtils.createSettingKey(this.h, var1), var2);
   }

   public int getEndOfLineFormat(String var1) {
      return this.c.getEndOfLineFormat(SettingsUtils.createSettingKey(this.h, var1));
   }

   public PackageListOfRegExSetting getPackageListOfRegEx(String var1) {
      return this.c.getPackageListOfRegEx(SettingsUtils.createSettingKey(this.h, var1));
   }

   public MessageList getMessageList() {
      this.k.sort();
      return this.k;
   }

   public CaretHistoryMapper getCaretHistoryMapper() {
      return this.m;
   }

   public t getTokenProducer() {
      return this.a;
   }

   public EnvironmentVariables getRuntimeEnvironment() {
      return this.d;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 63;
            break;
         case 1:
            var10003 = 118;
            break;
         case 2:
            var10003 = 61;
            break;
         case 3:
            var10003 = 6;
            break;
         default:
            var10003 = 126;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
