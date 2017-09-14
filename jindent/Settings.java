package jindent;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.HashMap;
import java.util.Iterator;
import jindent.InvalidSettingException;
import jindent.JindentException;
import jindent.JindentSystem;
import jindent.Settings$1;
import jindent.SettingsUtils;
import jindent.settings.AbsoluteRelativeINumberSetting;
import jindent.settings.BAWrappingSetting;
import jindent.settings.BooleanSetting;
import jindent.settings.BracesSetting;
import jindent.settings.DateFormatSetting;
import jindent.settings.EncodingSetting;
import jindent.settings.EndOfLineFormatSetting;
import jindent.settings.ExtensionManagerSetting;
import jindent.settings.FloatSetting;
import jindent.settings.FooterSetting;
import jindent.settings.HeaderSetting;
import jindent.settings.INumberSetting;
import jindent.settings.IndentationSetting;
import jindent.settings.LineWrappingPolicySetting;
import jindent.settings.LogFileSetting;
import jindent.settings.MessageReportSetting;
import jindent.settings.NumberSetting;
import jindent.settings.PackageListOfRegExSetting;
import jindent.settings.PositionSetting;
import jindent.settings.PreProcessorIndentationSetting;
import jindent.settings.RegExPackage;
import jindent.settings.Setting;
import jindent.settings.SorterSetting;
import jindent.settings.StringArraySetting;
import jindent.settings.StringSetting;
import jindent.settings.UserVariablesSetting;
import jindent.settings.WrappingSetting;
import jindent.settings.sorter.SorterElement;

public class Settings implements Serializable, Cloneable {
   private static final long serialVersionUID = 3256718498527982391L;
   protected HashMap settingsMap;
   static Class class$jindent$Settings;

   public Settings() {
      this(new HashMap());
   }

   public Settings(HashMap var1) {
      this.settingsMap = var1;
   }

   public void updateFrom(Settings var1) {
      this.settingsMap = var1.getSettingsMap();
   }

   public void putSetting(String var1, Setting var2) {
      this.settingsMap.put(var1, var2);
   }

   public boolean hasSetting(String var1) {
      return this.settingsMap.containsKey(var1);
   }

   public Setting getSetting(String var1) {
      return (Setting)this.settingsMap.get(var1);
   }

   public void removeSetting(String var1) {
      this.settingsMap.remove(var1);
   }

   public void removeAllSettings() {
      this.settingsMap.clear();
   }

   public int countSettings() {
      return this.settingsMap.keySet().size();
   }

   public Iterator keysIterator() {
      return this.settingsMap.keySet().iterator();
   }

   public Iterator settingsIterator() {
      return this.settingsMap.values().iterator();
   }

   public boolean getBoolean(String var1) {
      BooleanSetting var2 = (BooleanSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof BooleanSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getValue();
      }
   }

   public void setBoolean(String var1, boolean var2) {
      BooleanSetting var3 = (BooleanSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public void setINumber(String var1, int var2) {
      INumberSetting var3 = (INumberSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
         var3.setInfinite(false);
      }
   }

   public boolean isInfiniteINumber(String var1) {
      INumberSetting var2 = (INumberSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof INumberSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.isInfinite();
      }
   }

   public int getAbsoluteRelativeIndex(String var1) {
      AbsoluteRelativeINumberSetting var2 = (AbsoluteRelativeINumberSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof INumberSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setAbsoluteRelativeIndex(String var1, int var2) {
      AbsoluteRelativeINumberSetting var3 = (AbsoluteRelativeINumberSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public void setInfiniteINumber(String var1, boolean var2) {
      INumberSetting var3 = (INumberSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setInfinite(var2);
      }
   }

   public int getNumber(String var1) {
      NumberSetting var2 = (NumberSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof NumberSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2 instanceof INumberSetting && ((INumberSetting)var2).isInfinite()?Integer.MAX_VALUE:var2.getValue();
      }
   }

   public void setNumber(String var1, int var2) {
      NumberSetting var3 = (NumberSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public void setFloat(String var1, float var2) {
      FloatSetting var3 = (FloatSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public float getFloat(String var1) {
      FloatSetting var2 = (FloatSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         if(!(var2 instanceof FloatSetting)) {
            jindent.debugger.a.b(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
         }

         return var2.getValue();
      }
   }

   public int getMessageReportIndex(String var1) {
      MessageReportSetting var2 = (MessageReportSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof MessageReportSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public int getWrappingIndex(String var1) {
      WrappingSetting var2 = (WrappingSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof WrappingSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setWrappingIndex(String var1, int var2) {
      WrappingSetting var3 = (WrappingSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getBAWrappingIndex(String var1) {
      BAWrappingSetting var2 = (BAWrappingSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof BAWrappingSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setBAWrappingIndex(String var1, int var2) {
      BAWrappingSetting var3 = (BAWrappingSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getLineWrappingPolicyIndex(String var1) {
      LineWrappingPolicySetting var2 = (LineWrappingPolicySetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof LineWrappingPolicySetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setLineWrappingPolicyIndex(String var1, int var2) {
      LineWrappingPolicySetting var3 = (LineWrappingPolicySetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getFooterIndex(String var1) {
      FooterSetting var2 = (FooterSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof FooterSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setFooterIndex(String var1, int var2) {
      FooterSetting var3 = (FooterSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getHeaderIndex(String var1) {
      HeaderSetting var2 = (HeaderSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof HeaderSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setHeaderIndex(String var1, int var2) {
      HeaderSetting var3 = (HeaderSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getIndentationIndex(String var1) {
      IndentationSetting var2 = (IndentationSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof IndentationSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setIndentationIndex(String var1, int var2) {
      IndentationSetting var3 = (IndentationSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getPreProcessorIndentationIndex(String var1) {
      PreProcessorIndentationSetting var2 = (PreProcessorIndentationSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof PreProcessorIndentationSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setPreProcessorIndentationIndex(String var1, int var2) {
      PreProcessorIndentationSetting var3 = (PreProcessorIndentationSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public int getPositionIndex(String var1) {
      PositionSetting var2 = (PositionSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof PositionSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public void setPositionIndex(String var1, int var2) {
      PositionSetting var3 = (PositionSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setIndex(var2);
      }
   }

   public String getDateFormat(String var1) {
      DateFormatSetting var2 = (DateFormatSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof DateFormatSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getValue();
      }
   }

   public void setDateFormat(String var1, String var2) {
      DateFormatSetting var3 = (DateFormatSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public BracesSetting getBracesSetting(String var1) {
      BracesSetting var2 = (BracesSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof BracesSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2;
      }
   }

   public void setBracesSetting(String var1, BracesSetting var2) {
      BracesSetting var3 = (BracesSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var3 instanceof BracesSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var3.getClass().getName());
      } else {
         var3.setBoolean(a("SU\u0005jzMQ\u0000{vZG/wVZ"), var2.getBoolean(a("SU\u0005jzMQ\u0000{vZG/wVZ")));
         var3.setBoolean(a("MY\u0004vL}B\u0002}]qU\u0014RQQU"), var2.getBoolean(a("MY\u0004vL}B\u0002}]qU\u0014RQQU")));
         var3.setNumber(a("V^\u0007{VK|\u0006xL}B\u0002}]"), var2.getNumber(a("V^\u0007{VK|\u0006xL}B\u0002}]")));
         var3.setNumber(a("V^\u0007{VKb\nyPKr\u0011\u007f[Z"), var2.getNumber(a("V^\u0007{VKb\nyPKr\u0011\u007f[Z")));
         var3.setNumber(a("V^\u0007{VKq\u0005j]Mb\nyPKr\u0011\u007f[Z"), var2.getNumber(a("V^\u0007{VKq\u0005j]Mb\nyPKr\u0011\u007f[Z")));
         var3.setBoolean(a("\\E\u0007zTZu\u000enLFr\u0011\u007f[ZC"), var2.getBoolean(a("\\E\u0007zTZu\u000enLFr\u0011\u007f[ZC")));
         var3.setNumber(a("V^\u0007{VKs\u0016z\\SU\u0007\\J^S\u0006m"), var2.getNumber(a("V^\u0007{VKs\u0016z\\SU\u0007\\J^S\u0006m")));
         var3.setBoolean(a("Q_!rYQ[/wVZC\"xLZB/{^Kr\u0011\u007f[Z"), var2.getBoolean(a("Q_!rYQ[/wVZC\"xLZB/{^Kr\u0011\u007f[Z")));
         var3.setINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]~V\u0017{JsU\u0005jzMQ\u0000{"), var2.getNumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]~V\u0017{JsU\u0005jzMQ\u0000{")));
         var3.setInfiniteINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]~V\u0017{JsU\u0005jzMQ\u0000{"), var2.isInfiniteINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]~V\u0017{JsU\u0005jzMQ\u0000{")));
         var3.setINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]}U\u0005qJZb\nyPKr\u0011\u007f[Z"), var2.getNumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]}U\u0005qJZb\nyPKr\u0011\u007f[Z")));
         var3.setInfiniteINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]}U\u0005qJZb\nyPKr\u0011\u007f[Z"), var2.isInfiniteINumber(a("RY\rRQQU\u0010JWv^\u0010{JKr\u000f\u007fVT|\np]}U\u0005qJZb\nyPKr\u0011\u007f[Z")));
         var3.setBoolean(a("[_-qLv^\u0010{JKr\u0006xWMU0wVX\\\u0006LQXX\u0017\\J^S\u0006"), var2.getBoolean(a("[_-qLv^\u0010{JKr\u0006xWMU0wVX\\\u0006LQXX\u0017\\J^S\u0006")));
      }
   }

   public SorterElement getSorterElement(String var1) {
      SorterSetting var2 = (SorterSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof SorterSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getSorterRoot();
      }
   }

   public String getString(String var1) {
      StringSetting var2 = (StringSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof StringSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getValue();
      }
   }

   public void setString(String var1, String var2) {
      StringSetting var3 = (StringSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public String[] getStringArray(String var1) {
      StringArraySetting var2 = (StringArraySetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof StringArraySetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.toStringArray();
      }
   }

   public void setStringArray(String var1, String var2) {
      StringArraySetting var3 = (StringArraySetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public void setStringArray(String var1, String[] var2) {
      StringBuffer var3 = new StringBuffer();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var3.append(var2[var4]);
         if(var4 < var2.length - 1) {
            var3.append("\n");
         }
      }

      this.setStringArray(var1, var3.toString());
   }

   public UserVariablesSetting getUserVariablesSetting(String var1) {
      UserVariablesSetting var2 = (UserVariablesSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof UserVariablesSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2;
      }
   }

   public String getEncoding(String var1) {
      EncodingSetting var2 = (EncodingSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof EncodingSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getEncoding();
      }
   }

   public boolean isDefaultEncoding(String var1) {
      EncodingSetting var2 = (EncodingSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof EncodingSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.isUseDefaultEncoding();
      }
   }

   public void setEncoding(String var1, String var2) {
      EncodingSetting var3 = (EncodingSetting)this.getSetting(var1);
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         var3.setValue(var2);
      }
   }

   public int getEndOfLineFormat(String var1) {
      EndOfLineFormatSetting var2 = (EndOfLineFormatSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof EndOfLineFormatSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2.getIndex();
      }
   }

   public LogFileSetting getLogFileSetting(String var1) {
      return (LogFileSetting)this.getSetting(var1);
   }

   public ExtensionManagerSetting getExtensionManager(String var1) {
      ExtensionManagerSetting var2 = (ExtensionManagerSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else if(!(var2 instanceof ExtensionManagerSetting)) {
         throw new InvalidSettingException(a("lU\u0017jQQWC") + var1 + a("\u001fY\u0010>MLU\u0007>YL\u0010") + var2.getClass().getName());
      } else {
         return var2;
      }
   }

   public PackageListOfRegExSetting getPackageListOfRegEx(String var1) {
      PackageListOfRegExSetting var2 = (PackageListOfRegExSetting)this.getSetting(var1);
      if(var2 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         return var2;
      }
   }

   public void setPackageListOfRegEx(String var1, PackageListOfRegExSetting var2) {
      PackageListOfRegExSetting var3 = (PackageListOfRegExSetting)this.getSetting(var1);
      var3.clear();
      if(var3 == null) {
         throw new InvalidSettingException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0010{LKY\ry\u0002\u001f") + var1);
      } else {
         Iterator var4 = var2.packageIterator();

         while(var4.hasNext()) {
            RegExPackage var5 = (RegExPackage)var4.next();
            var3.addQualifiersPackage(var5.getName(), var5);
         }

      }
   }

   public void writeToFile(String var1) throws JindentException {
      var1 = var1.replace('\\', '/');
      int var2 = var1.lastIndexOf(47);
      if(var2 != -1) {
         String var3 = var1.substring(0, var2);
         File var4 = new File(var3);
         if(!var4.exists()) {
            var4.mkdirs();
         }
      }

      try {
         FileOutputStream var6 = new FileOutputStream(var1);
         this.writeToXML(var6);
         var6.close();
      } catch (Exception var5) {
         throw new JindentException(var5.toString());
      }
   }

   public static Settings createFromFile(String var0) throws JindentException, FileNotFoundException {
      try {
         FileInputStream var1 = new FileInputStream(var0);
         Settings var2 = readFromXML(var1);
         var1.close();
         return var2;
      } catch (FileNotFoundException var3) {
         throw var3;
      } catch (IOException var4) {
         throw new JindentException(var4.getMessage());
      }
   }

   public static Settings createFromResource(String var0) throws JindentException, FileNotFoundException {
      try {
         InputStream var1 = (class$jindent$Settings == null?(class$jindent$Settings = class$(a("UY\rz]QDMM]KD\np_L"))):class$jindent$Settings).getResourceAsStream(var0);
         if(var1 == null) {
            throw new JindentException(a("|Q\rpWK\u0010\u0005wV[\u0010\u0011{KPE\u0011}]\u0005\u0010") + var0);
         } else {
            Settings var2 = readFromXML(var1);
            return var2;
         }
      } catch (FileNotFoundException var3) {
         throw var3;
      } catch (StreamCorruptedException var4) {
         throw new JindentException(var4.getMessage());
      } catch (IOException var5) {
         throw new JindentException(var5.getMessage());
      }
   }

   private void writeObject(ObjectOutputStream var1) throws IOException {
      var1.writeObject(this.settingsMap);
   }

   private void readObject(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      this.settingsMap = (HashMap)var1.readObject();
   }

   protected void writeToXML(OutputStream var1) throws IOException, JindentException {
      XMLEncoder var2 = null;
      Thread var3 = Thread.currentThread();
      ClassLoader var4 = var3.getContextClassLoader();
      ClassLoader var5 = (class$jindent$Settings == null?(class$jindent$Settings = class$(a("UY\rz]QDMM]KD\np_L"))):class$jindent$Settings).getClassLoader();

      try {
         if(JindentSystem.getTakeCareOfClassLoader()) {
            var3.setContextClassLoader(var5);
         }

         var2 = new XMLEncoder(new BufferedOutputStream(var1));
         SettingsUtils.initXMLEncoder(var2);
         var2.writeObject(this);
      } catch (Exception var10) {
         throw new JindentException(a("zB\u0011qJ\u001fG\u000bwTZ\u0010\u0014lQKY\ry\u0018LU\u0017jQQW\u0010>^V\\\u0006$2") + var10.getMessage());
      } finally {
         if(var2 != null) {
            var2.close();
         }

         var3.setContextClassLoader(var4);
      }

   }

   protected static Settings readFromXML(InputStream var0) throws IOException, FileNotFoundException, JindentException {
      Settings var1 = null;
      XMLDecoder var2 = null;
      Thread var3 = Thread.currentThread();
      ClassLoader var4 = var3.getContextClassLoader();
      ClassLoader var5 = (class$jindent$Settings == null?(class$jindent$Settings = class$(a("UY\rz]QDMM]KD\np_L"))):class$jindent$Settings).getClassLoader();

      try {
         if(JindentSystem.getTakeCareOfClassLoader()) {
            var3.setContextClassLoader(var5);
         }

         if(var0 == null) {
            throw new InvalidSettingException(a("lU\u0017jQQW\u00100JZQ\u0007XJP];St\u0005\u0010\npHJD\u0010jJZQ\u000e>QL\u0010\rkTS"));
         }

         var2 = new XMLDecoder(new BufferedInputStream(var0));
         var2.setExceptionListener(new Settings$1());
         var1 = (Settings)var2.readObject();
      } catch (Exception var10) {
         throw new JindentException(a("zB\u0011qJ\u001fG\u000bwTZ\u0010\u0011{Y[Y\ry\u0018LU\u0017jQQW\u0010>^V\\\u000602rQ\u001a|]\u001fD\u000bwK\u001fV\nr]\u001fY\u0010>VPDC\u007f\u0018uY\rz]QDCm]KD\np_L\u0010\u0005wTZ\u000f"));
      } finally {
         if(var2 != null) {
            var2.close();
         }

         var3.setContextClassLoader(var4);
      }

      return var1;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.settingsIterator();

      while(var2.hasNext()) {
         Setting var3 = (Setting)var2.next();
         var1.append(var3.getName());
         var1.append(a("\u001f\rC0\u0016\u0011"));
         var1.append("\n");
      }

      return var1.toString();
   }

   public HashMap getSettingsMap() {
      return this.settingsMap;
   }

   public void setSettingsMap(HashMap var1) {
      this.settingsMap = var1;
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
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
            var10003 = 63;
            break;
         case 1:
            var10003 = 48;
            break;
         case 2:
            var10003 = 99;
            break;
         case 3:
            var10003 = 30;
            break;
         default:
            var10003 = 56;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
