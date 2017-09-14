package jindent.plugin.report;

import jindent.formatter.CaretHistoryMapper;
import jindent.formatter.Context;

public class HistoryData {
   private int a;
   private boolean b;
   private int c;
   private int d;
   private CaretHistoryMapper e;

   public HistoryData(Context var1) {
      this.c = var1.getNumber(a("I|}DetsoD}AfbCBIhh"));
      this.d = var1.getNumber(a("TsoD}AfbCBIhh"));
      this.b = var1.getBoolean(a("W`lA]I|hB"));
      this.a = var1.getNumber(a("Msu}xNwAT\u007fGfe"));
      this.e = var1.m;
   }

   public int getInputTabulatorSize() {
      return this.c;
   }

   public int getMaxLineLength() {
      return this.a;
   }

   public boolean isMaxLineLengthEnabled() {
      return this.b;
   }

   public int getOutputTabulatorSize() {
      return this.d;
   }

   public CaretHistoryMapper getCaretHistoryMapper() {
      return this.e;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 32;
            break;
         case 1:
            var10003 = 18;
            break;
         case 2:
            var10003 = 13;
            break;
         case 3:
            var10003 = 49;
            break;
         default:
            var10003 = 17;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
