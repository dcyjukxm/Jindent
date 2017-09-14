package jindent.settings;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jindent.settings.DefaultSetting;
import jindent.settings.RegExPackage;

public class PackageListOfRegExSetting extends DefaultSetting {
   private static final long serialVersionUID = 5514918136572505799L;
   private Map packageMap = new HashMap();

   public PackageListOfRegExSetting(String var1) {
      super(var1);
   }

   public void addQualifiersPackage(Boolean var1, String var2, String var3) {
      this.packageMap.put(var2, new RegExPackage(var1, var2, var3));
   }

   public void addQualifiersPackage(String var1, RegExPackage var2) {
      this.packageMap.put(var1, var2);
   }

   public RegExPackage getQualifiersPackageByName(String var1) {
      return (RegExPackage)this.packageMap.get(var1);
   }

   public void removeQualifiersPackage(String var1) {
      this.packageMap.remove(var1);
   }

   public Iterator packageIterator() {
      return this.packageMap.values().iterator();
   }

   public void clear() {
      this.packageMap.clear();
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public Map getPackageMap() {
      return this.packageMap;
   }

   public void setPackageMap(Map var1) {
      this.packageMap = var1;
   }
}
