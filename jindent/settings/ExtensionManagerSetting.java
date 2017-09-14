package jindent.settings;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import jindent.ExtensionManager;
import jindent.Formatter;
import jindent.settings.DefaultSetting;
import jindent.settings.extensionmanager.ExtensionAssignment;
import jindent.util.IntHashtable;

public class ExtensionManagerSetting extends DefaultSetting implements ExtensionManager {
   private static final long serialVersionUID = 3257565088121763895L;
   public static final String DEFAULT = "default";
   private static HashMap formatterInstanceCache;
   private static ExtensionManager defaultExtensionManager;
   private static Vector formatterNameList;
   private static IntHashtable idToFormatterName;
   private static HashMap formatterNameToClass;
   private static boolean cacheFormatterInstances = false;
   private HashMap extensionsMap;
   // $FF: synthetic field
   static Class class$jindent$java$JavaFormatter;
   // $FF: synthetic field
   static Class class$jindent$javasqlj$JavaSQLJFormatter;
   // $FF: synthetic field
   static Class class$jindent$c$CFormatter;
   // $FF: synthetic field
   static Class class$jindent$cpp$CppFormatter;
   // $FF: synthetic field
   static Class class$jindent$h$HFormatter;

   private ExtensionManagerSetting() {
      this("");
   }

   public ExtensionManagerSetting(String var1) {
      super(var1);
      this.extensionsMap = new HashMap();
      formatterInstanceCache = new HashMap();
   }

   public void setAssignment(String var1, String var2) {
      this.setAssignment(var1, new ExtensionAssignment(var1, var2));
   }

   public void setAssignment(String var1, ExtensionAssignment var2) {
      this.extensionsMap.put(var1, var2);
   }

   public void removeAllAssignments() {
      this.extensionsMap.clear();
   }

   public void removeAssignment(String var1) {
      this.extensionsMap.remove(var1);
   }

   public ExtensionAssignment getAssignment(String var1) {
      return (ExtensionAssignment)this.extensionsMap.get(var1);
   }

   public String getFormatterNameByExtension(String var1) {
      ExtensionAssignment var2 = this.getAssignment(var1);
      return var2 != null?var2.getFormatterName():null;
   }

   public static boolean isValidFormatterName(String var0) {
      Vector var1 = getFormatterNames();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         String var3 = (String)var1.elementAt(var2);
         if(var0.equals(var3)) {
            return true;
         }
      }

      return false;
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.extensionsMap.entrySet().iterator();

      while(var2.hasNext()) {
         ExtensionAssignment var3 = (ExtensionAssignment)var2.next();
         var1.append(var3.getExtension());
         var1.append(a("\\*A"));
         var1.append(var3.getFormatterName());
         var1.append("\n");
      }

      return var1.toString();
   }

   public Iterator assignmentIterator() {
      return this.extensionsMap.values().iterator();
   }

   public Iterator keyIterator() {
      return this.extensionsMap.keySet().iterator();
   }

   private Formatter getFormatterByClass(Class var1) {
      Formatter var2 = null;
      if(cacheFormatterInstances) {
         var2 = (Formatter)formatterInstanceCache.get(var1);
         if(var2 == null) {
            var2 = this.createNewInstance(var1);
            formatterInstanceCache.put(var1, var2);
         }
      } else {
         var2 = this.createNewInstance(var1);
      }

      return var2;
   }

   private Formatter createNewInstance(Class var1) {
      Formatter var2 = null;

      try {
         Constructor var3 = var1.getConstructor(new Class[0]);
         var2 = (Formatter)var3.newInstance(new Object[0]);
      } catch (Exception var4) {
         jindent.debugger.a.b(a("\u001ax\u00135#\bc\u0004*\u0001\u0010v\u0012+\u007f") + var1.getName());
         jindent.debugger.a.a(var4);
      }

      return var2;
   }

   public Formatter getFormatterByExtension(String var1) {
      var1 = var1.toLowerCase();
      ExtensionAssignment var2 = this.getAssignment(var1);
      if(var2 == null) {
         return null;
      } else {
         String var3 = var2.getFormatterName();
         Class var4 = (Class)formatterNameToClass.get(var3);
         return this.getFormatterByClass(var4);
      }
   }

   public Formatter getFormatterById(int var1) {
      String var2 = (String)idToFormatterName.a(var1);
      if(var2 == null) {
         throw new IllegalArgumentException(a("+e\u000e6%\\q\u000e*/\u001dc\u0015=0\\~\u0005y"));
      } else {
         Class var3 = (Class)formatterNameToClass.get(var2);
         return this.getFormatterByClass(var3);
      }
   }

   public static Vector getFormatterNames() {
      return formatterNameList;
   }

   private static void initStatic() {
      idToFormatterName = new IntHashtable();
      formatterNameList = new Vector();
      formatterInstanceCache = new HashMap();
      formatterNameToClass = new HashMap();
      defaultExtensionManager = new ExtensionManagerSetting();
   }

   private static void addFormatter(Class var0, int var1) {
      try {
         String var2 = (String)var0.getField(a("2V,\u001d")).get((Object)null);
         jindent.debugger.a.b(a("=s\u00051,\u001b7\u000770\u0011v\u0015,\'\u000e-A;.\u001dd\u0012b") + var0.getName() + a("P7\u00071\'\u0010sA6#\u0011r[") + var2);
         formatterNameList.add(var2);
         List var3 = (List)var0.getField(a("8R\'\u0019\u00170C>\u001d\u001a(R/\u000b\u000b3Y2")).get((Object)null);

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            String var5 = (String)var3.get(var4);
            defaultExtensionManager.setAssignment(var5, var2);
         }

         formatterNameToClass.put(var2, var0);
         idToFormatterName.a(var1, var2);
      } catch (Exception var6) {
         jindent.debugger.a.b(var0.getName() + ":");
         jindent.debugger.a.a(var6);
      }

   }

   public static ExtensionManager getDefaultExtensionManager() {
      return defaultExtensionManager;
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public HashMap getExtensionsMap() {
      return this.extensionsMap;
   }

   public void setExtensionsMap(HashMap var1) {
      this.extensionsMap = var1;
   }

   public boolean containsExtension(String var1) {
      return this.extensionsMap.containsKey(var1);
   }

   public Set getAssignedExtensions() {
      return this.extensionsMap.keySet();
   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static {
      initStatic();
      addFormatter(class$jindent$java$JavaFormatter == null?(class$jindent$java$JavaFormatter = class$(a("\u0016~\u000f<\'\u0012cO2#\nvO\u0012#\nv\'70\u0011v\u0015,\'\u000e"))):class$jindent$java$JavaFormatter, 1);
      addFormatter(class$jindent$javasqlj$JavaSQLJFormatter == null?(class$jindent$javasqlj$JavaSQLJFormatter = class$(a("\u0016~\u000f<\'\u0012cO2#\nv\u0012).\u00169+94\u001dD0\u0014\b:x\u00135#\bc\u0004*"))):class$jindent$javasqlj$JavaSQLJFormatter, 2);
      addFormatter(class$jindent$c$CFormatter == null?(class$jindent$c$CFormatter = class$(a("\u0016~\u000f<\'\u0012cO9l\u0015"))):class$jindent$c$CFormatter, 4);
      addFormatter(class$jindent$cpp$CppFormatter == null?(class$jindent$cpp$CppFormatter = class$(a("\u0016~\u000f<\'\u0012cO;2\f9\"(2:x\u00135#\bc\u0004*"))):class$jindent$cpp$CppFormatter, 4);
      addFormatter(class$jindent$h$HFormatter == null?(class$jindent$h$HFormatter = class$(a("\u0016~\u000f<\'\u0012cO:l\u001d"))):class$jindent$h$HFormatter, 4);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 124;
            break;
         case 1:
            var10003 = 23;
            break;
         case 2:
            var10003 = 97;
            break;
         case 3:
            var10003 = 88;
            break;
         default:
            var10003 = 66;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
