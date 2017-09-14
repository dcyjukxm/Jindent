package jindent.settings;

import java.io.Serializable;
import jindent.settings.BooleanSetting;
import jindent.settings.DefaultSettingSet;
import jindent.settings.INumberSetting;
import jindent.settings.NumberSetting;
import jindent.settings.Setting;

public class BracesSetting extends DefaultSettingSet {
   private static final long serialVersionUID = 3257845493601022769L;
   protected BooleanSetting leftBraceNewLine;
   protected BooleanSetting rightBraceNewLine;
   protected NumberSetting indentLeftBrace;
   protected NumberSetting indentRightBrace;
   protected NumberSetting indentAfterRightBrace;
   protected BooleanSetting cuddleEmptyBraces;
   protected NumberSetting indentCuddledBraces;
   protected BooleanSetting noBlankLinesAfterLeftBrace;
   protected INumberSetting minLinesToInsertBlankLineAfterLeftBrace;
   protected INumberSetting minLinesToInsertBlankLineBeforeRightBrace;
   protected BooleanSetting doNotInsertBeforeSingleRightBrace;
   private Setting[] subSettings;

   public BracesSetting(String var1) {
      super(var1);
      this.leftBraceNewLine = new BooleanSetting(b("\u001f\u0007_q!\u0001\u0003Z`-\u0016\u0015ul\r\u0016"));
      this.rightBraceNewLine = new BooleanSetting(b("\u0001\u000b^m\u00171\u0010Xf\u0006=\u0007NI\n\u001d\u0007"));
      this.indentLeftBrace = new NumberSetting(b("\u001a\f]`\r\u0007.\\c\u00171\u0010Xf\u0006"));
      this.indentRightBrace = new NumberSetting(b("\u001a\f]`\r\u00070Pb\u000b\u0007 Kd\u0000\u0016"));
      this.indentAfterRightBrace = new NumberSetting(b("\u001a\f]`\r\u0007#_q\u0006\u00010Pb\u000b\u0007 Kd\u0000\u0016"));
      this.cuddleEmptyBraces = new BooleanSetting(b("\u0010\u0017]a\u000f\u0016\'Tu\u0017\n Kd\u0000\u0016\u0011"));
      this.indentCuddledBraces = new NumberSetting(b("\u001a\f]`\r\u0007!La\u0007\u001f\u0007]G\u0011\u0012\u0001\\v"));
      this.noBlankLinesAfterLeftBrace = new BooleanSetting(b("\u001d\r{i\u0002\u001d\tul\r\u0016\u0011xc\u0017\u0016\u0010u`\u0005\u0007 Kd\u0000\u0016"));
      this.minLinesToInsertBlankLineAfterLeftBrace = new INumberSetting(b("\u001e\u000bWI\n\u001d\u0007JQ\f:\fJ`\u0011\u0007 Ud\r\u0018.Pk\u00062\u0004M`\u0011?\u0007_q!\u0001\u0003Z`"));
      this.minLinesToInsertBlankLineBeforeRightBrace = new INumberSetting(b("\u001e\u000bWI\n\u001d\u0007JQ\f:\fJ`\u0011\u0007 Ud\r\u0018.Pk\u00061\u0007_j\u0011\u00160Pb\u000b\u0007 Kd\u0000\u0016"));
      this.doNotInsertBeforeSingleRightBrace = new BooleanSetting(b("\u0017\rwj\u0017:\fJ`\u0011\u0007 \\c\f\u0001\u0007jl\r\u0014\u000e\\W\n\u0014\nMG\u0011\u0012\u0001\\"));
      this.subSettings = new Setting[]{this.leftBraceNewLine, this.rightBraceNewLine, this.indentLeftBrace, this.indentRightBrace, this.indentAfterRightBrace, this.cuddleEmptyBraces, this.indentCuddledBraces, this.noBlankLinesAfterLeftBrace, this.minLinesToInsertBlankLineAfterLeftBrace, this.minLinesToInsertBlankLineBeforeRightBrace, this.doNotInsertBeforeSingleRightBrace};
      int var2 = this.subSettings.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Setting var4 = this.subSettings[var3];
         String var5 = var4.getName();
         if(!var1.equals("")) {
            String var6 = var1 + "." + var5;
            var4.setName(var6);
         }

         this.putSetting(var5, var4);
      }

   }

   public BracesSetting() {
      this("");
   }

   public Setting[] getSubSettings() {
      return this.subSettings;
   }

   public int countSubSettings() {
      return this.subSettings.length;
   }

   public Setting getSubSetting(int var1) {
      return this.subSettings[var1];
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public boolean equals(BracesSetting var1) {
      boolean var2 = this.leftBraceNewLine.getValue() == var1.leftBraceNewLine.getValue() && this.rightBraceNewLine.getValue() == var1.rightBraceNewLine.getValue() && this.indentLeftBrace.getValue() == var1.indentLeftBrace.getValue() && this.indentRightBrace.getValue() == var1.indentRightBrace.getValue() && this.indentAfterRightBrace.getValue() == var1.indentAfterRightBrace.getValue() && this.cuddleEmptyBraces.getValue() == var1.cuddleEmptyBraces.getValue() && this.indentCuddledBraces.getValue() == var1.indentCuddledBraces.getValue() && this.noBlankLinesAfterLeftBrace.getValue() == var1.noBlankLinesAfterLeftBrace.getValue();
      if(!this.noBlankLinesAfterLeftBrace.getValue()) {
         if(this.minLinesToInsertBlankLineAfterLeftBrace.isInfinite() != var1.minLinesToInsertBlankLineAfterLeftBrace.isInfinite()) {
            return false;
         }

         if(!this.minLinesToInsertBlankLineAfterLeftBrace.isInfinite() && this.minLinesToInsertBlankLineAfterLeftBrace.getValue() != var1.minLinesToInsertBlankLineAfterLeftBrace.getValue()) {
            return false;
         }
      }

      if(this.minLinesToInsertBlankLineBeforeRightBrace.isInfinite() == var1.minLinesToInsertBlankLineBeforeRightBrace.isInfinite()) {
         if(!this.minLinesToInsertBlankLineBeforeRightBrace.isInfinite() && this.minLinesToInsertBlankLineBeforeRightBrace.getValue() != var1.minLinesToInsertBlankLineBeforeRightBrace.getValue()) {
            return false;
         } else {
            var2 = var2 && this.doNotInsertBeforeSingleRightBrace.getValue() == var1.doNotInsertBeforeSingleRightBrace.getValue();
            return var2;
         }
      } else {
         return false;
      }
   }

   private static String b(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 115;
            break;
         case 1:
            var10003 = 98;
            break;
         case 2:
            var10003 = 57;
            break;
         case 3:
            var10003 = 5;
            break;
         default:
            var10003 = 99;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
