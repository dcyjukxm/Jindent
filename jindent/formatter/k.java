package jindent.formatter;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.prefs.Preferences;
import jindent.JindentException;
import jindent.JindentSystem;
import jindent.installation.InstallationContext;
import jindent.util.IndexProperties;
import jindent.util.Utils;

public class k {
   public static final String JINDENT_LICENSE_DIR = "jindent.license.dir";
   public static final String JINDENT_LICENSE_KEY_DIR = ".jindent-data/";
   public static final String JINDENT_LICENSE_MAP_FILE = ".index";
   public static final String JINDENT_TRIAL_KEYS = "com/newforms/jindent5/version";
   public static final String JINDENT_TRIAL_DATE_KEY = "version";
   private static HashMap a = new HashMap();
   // $FF: synthetic field
   static Class b;

   public static boolean a() {
      try {
         IndexProperties var0 = b();
         return !var0.isEmpty();
      } catch (Exception var1) {
         jindent.debugger.a.a(var1);
         return false;
      }
   }

   public static IndexProperties b() throws JindentException {
      URL var0 = f();

      try {
         URLConnection var1 = var0.openConnection();
         IndexProperties var2 = new IndexProperties();
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var1.getInputStream(), d("\u0012\u0018=\u0017Xc~K\u0017Q")));
         var2.a((Reader)var3);
         return var2;
      } catch (Exception var4) {
         jindent.debugger.a.a(var4);
         throw new JindentException(d("\u0018*\u001cT\u000f/k\u0000_\u0001?k\u001f[\u0010{-\u001bV\u0005{-\u0000U\r{>\u0000VZ{") + var0.toExternalForm());
      }
   }

   public static void c() {
      a.clear();
   }

   public static String a(URL var0) throws JindentException {
      try {
         String var1 = var0.toExternalForm();
         String var2 = (String)a.get(var1);
         if(var2 == null) {
            URLConnection var3 = var0.openConnection();
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream(), d("\u0012\u0018=\u0017Xc~K\u0017Q")));
            var2 = Utils.getString(var4);
            a.put(var1, var2);
         }

         return var2;
      } catch (Exception var5) {
         jindent.debugger.a.a(var5);
         throw new JindentException(d("\u0018*\u001cT\u000f/k\u0000_\u0001?k\u001eS\u0003>%\u0001_@0.\u000b\u001a\u0006)$\u001f\u001a\u0015)\'H\u001a") + var0.toExternalForm());
      }
   }

   public static int d() {
      int var0 = -1;

      try {
         Preferences var1 = Preferences.userRoot();
         Preferences var2 = var1.node("com/newforms/jindent5/version");
         int var3 = var2.getInt("version", -1);
         var0 = var3 == -1?-1:var3 ^ 1954844606;
      } catch (Exception var4) {
         ;
      }

      return var0;
   }

   public static void e() {
      try {
         GregorianCalendar var0 = new GregorianCalendar();
         var0.add(2, 1);
         SimpleDateFormat var1 = new SimpleDateFormat(d("\"2\u000bC-\u0016/\u0016"));
         String var2 = var1.format(var0.getTime());
         int var3 = Integer.valueOf(var2).intValue();
         int var4 = var3 ^ 1954844606;
         Preferences var5 = Preferences.userRoot();
         Preferences var6 = var5.node("com/newforms/jindent5/version");
         var6.putInt("version", var4);
         var6.flush();
      } catch (Exception var7) {
         ;
      }

   }

   public static boolean b(URL var0) {
      String var1 = var0.getHost();
      return var1.equals("");
   }

   public static File c(URL var0) {
      try {
         String var1 = URLDecoder.decode(var0.getPath(), d("\u000e\u001f4\u0017X"));
         return new File(var1);
      } catch (UnsupportedEncodingException var2) {
         return null;
      }
   }

   public static URL a(String var0) {
      jindent.debugger.a.b(d("\u0017\"\u0011_\u000e(.R\\\t7.H\u001a") + g() + "/" + var0);

      try {
         return new URL(g().toExternalForm() + "/" + var0);
      } catch (MalformedURLException var2) {
         return null;
      }
   }

   public static URL f() {
      jindent.debugger.a.b(d("\u0017\"\u0011_\u000e(.RW\u0001+k\u0014S\f>qR") + g() + "/" + ".index");

      try {
         return new URL(g().toExternalForm() + "/" + ".index");
      } catch (MalformedURLException var1) {
         return null;
      }
   }

   public static URL g() {
      InstallationContext var0 = JindentSystem.getInstallationContext();
      URL var1 = var0.getLicenseKeyDirectory(b == null?(b = c(d("1\"\u001c^\u00055?\\p\t5/\u0017T\u0014\b2\u0001N\u00056"))):b);
      String var2 = System.getProperty("jindent.license.dir");
      if(var2 != null) {
         try {
            jindent.debugger.a.b(d("\u0017\"\u0011_\u000e(.RJ\u00124;\u0017H\u0014\"k\u0018S\u000e?.\u001cNN7\"\u0011_\u000e(.\\^\t)k\u001bI@(.\u0006\u001a\u00144qR") + var2);
            var1 = new URL(var2);
         } catch (MalformedURLException var8) {
            try {
               String var4 = b(var2);
               jindent.debugger.a.b(d("\u0017\"\u0011_\u000e(.RJ\u00124;\u0017H\u0014\"k\u0018S\u000e?.\u001cNN7\"\u0011_\u000e(.\\^\t)k\u001bI@(.\u0006\u001a\u00144qR") + var4);
               var1 = new URL(var4);
            } catch (MalformedURLException var7) {
               ;
            }
         }
      }

      if(var1 == null) {
         try {
            var1 = Utils.convertFilenameToURL(JindentSystem.getJindentSettingsHome());
         } catch (MalformedURLException var6) {
            ;
         }
      }

      jindent.debugger.a.b(d("\u0017\"\u0011_\u000e(.R^\t).\u0011N\u000f)2H\u001a") + var1 + "/" + ".jindent-data/");

      try {
         return new URL(var1.toExternalForm() + "/" + ".jindent-data/");
      } catch (MalformedURLException var5) {
         return null;
      }
   }

   private static String b(String var0) {
      return var0 == null?null:(!var0.startsWith("\\") && !var0.startsWith("/")?d("=\"\u001e_Ztd]") + var0:d("=\"\u001e_Ztd") + var0);
   }

   // $FF: synthetic method
   static Class c(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   private static String d(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 91;
            break;
         case 1:
            var10003 = 75;
            break;
         case 2:
            var10003 = 114;
            break;
         case 3:
            var10003 = 58;
            break;
         default:
            var10003 = 96;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
