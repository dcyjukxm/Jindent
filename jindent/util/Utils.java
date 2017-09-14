package jindent.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import jindent.JindentException;
import jindent.formatter.ParseException;
import jindent.message.ErrorMessage;
import jindent.util.Utils$1;
import jindent.util.Utils$2;
import jindent.util.Utils$3;

public class Utils {
   static final String[] a = new String[]{a("$dL"), a("$dM"), a("$dN"), a("$dO"), a("$dH"), a("$dI"), a("$dJ"), a("$dK"), a("$dD"), a("$dE"), a("$d\u001d"), a("$d\u001e"), a("$d\u001f"), a("$d\u0018"), a("$d\u0019"), a("$d\u001a"), a("$eL"), a("$eM"), a("$eN"), a("$eO"), a("$eH"), a("$eI"), a("$eJ"), a("$eK"), a("$eD"), a("$eE"), a("$e\u001d"), a("$e\u001e"), a("$e\u001f"), a("$e\u0018"), a("$e\u0019"), a("$e\u001a"), a("$fL"), a("$fM"), a("$fN"), a("$fO"), a("$fH"), a("$fI"), a("$fJ"), a("$fK"), a("$fD"), a("$fE"), a("$f\u001d"), a("$f\u001e"), a("$f\u001f"), a("$f\u0018"), a("$f\u0019"), a("$f\u001a"), a("$gL"), a("$gM"), a("$gN"), a("$gO"), a("$gH"), a("$gI"), a("$gJ"), a("$gK"), a("$gD"), a("$gE"), a("$g\u001d"), a("$g\u001e"), a("$g\u001f"), a("$g\u0018"), a("$g\u0019"), a("$g\u001a"), a("$`L"), a("$`M"), a("$`N"), a("$`O"), a("$`H"), a("$`I"), a("$`J"), a("$`K"), a("$`D"), a("$`E"), a("$`\u001d"), a("$`\u001e"), a("$`\u001f"), a("$`\u0018"), a("$`\u0019"), a("$`\u001a"), a("$aL"), a("$aM"), a("$aN"), a("$aO"), a("$aH"), a("$aI"), a("$aJ"), a("$aK"), a("$aD"), a("$aE"), a("$a\u001d"), a("$a\u001e"), a("$a\u001f"), a("$a\u0018"), a("$a\u0019"), a("$a\u001a"), a("$bL"), a("$bM"), a("$bN"), a("$bO"), a("$bH"), a("$bI"), a("$bJ"), a("$bK"), a("$bD"), a("$bE"), a("$b\u001d"), a("$b\u001e"), a("$b\u001f"), a("$b\u0018"), a("$b\u0019"), a("$b\u001a"), a("$cL"), a("$cM"), a("$cN"), a("$cO"), a("$cH"), a("$cI"), a("$cJ"), a("$cK"), a("$cD"), a("$cE"), a("$c\u001d"), a("$c\u001e"), a("$c\u001f"), a("$c\u0018"), a("$c\u0019"), a("$c\u001a"), a("$lL"), a("$lM"), a("$lN"), a("$lO"), a("$lH"), a("$lI"), a("$lJ"), a("$lK"), a("$lD"), a("$lE"), a("$l\u001d"), a("$l\u001e"), a("$l\u001f"), a("$l\u0018"), a("$l\u0019"), a("$l\u001a"), a("$mL"), a("$mM"), a("$mN"), a("$mO"), a("$mH"), a("$mI"), a("$mJ"), a("$mK"), a("$mD"), a("$mE"), a("$m\u001d"), a("$m\u001e"), a("$m\u001f"), a("$m\u0018"), a("$m\u0019"), a("$m\u001a"), a("$5L"), a("$5M"), a("$5N"), a("$5O"), a("$5H"), a("$5I"), a("$5J"), a("$5K"), a("$5D"), a("$5E"), a("$5\u001d"), a("$5\u001e"), a("$5\u001f"), a("$5\u0018"), a("$5\u0019"), a("$5\u001a"), a("$6L"), a("$6M"), a("$6N"), a("$6O"), a("$6H"), a("$6I"), a("$6J"), a("$6K"), a("$6D"), a("$6E"), a("$6\u001d"), a("$6\u001e"), a("$6\u001f"), a("$6\u0018"), a("$6\u0019"), a("$6\u001a"), a("$7L"), a("$7M"), a("$7N"), a("$7O"), a("$7H"), a("$7I"), a("$7J"), a("$7K"), a("$7D"), a("$7E"), a("$7\u001d"), a("$7\u001e"), a("$7\u001f"), a("$7\u0018"), a("$7\u0019"), a("$7\u001a"), a("$0L"), a("$0M"), a("$0N"), a("$0O"), a("$0H"), a("$0I"), a("$0J"), a("$0K"), a("$0D"), a("$0E"), a("$0\u001d"), a("$0\u001e"), a("$0\u001f"), a("$0\u0018"), a("$0\u0019"), a("$0\u001a"), a("$1L"), a("$1M"), a("$1N"), a("$1O"), a("$1H"), a("$1I"), a("$1J"), a("$1K"), a("$1D"), a("$1E"), a("$1\u001d"), a("$1\u001e"), a("$1\u001f"), a("$1\u0018"), a("$1\u0019"), a("$1\u001a"), a("$2L"), a("$2M"), a("$2N"), a("$2O"), a("$2H"), a("$2I"), a("$2J"), a("$2K"), a("$2D"), a("$2E"), a("$2\u001d"), a("$2\u001e"), a("$2\u001f"), a("$2\u0018"), a("$2\u0019"), a("$2\u001a")};

   public static URL convertFilenameToURL(String var0) throws MalformedURLException {
      StringBuffer var1 = new StringBuffer();
      int var2 = var0.length();

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 != 37 && var4 != 63 && var4 != 38 && var4 != 35) {
            var1.append((char)var4);
         } else {
            var1.append(a[var4]);
         }
      }

      return (new File(var1.toString())).toURL();
   }

   public static String errorToString(Exception var0) {
      StringWriter var1 = new StringWriter();
      var0.printStackTrace(new PrintWriter(var1));
      String var2 = var1.toString();
      return var2;
   }

   public void copyFile(String var1, String var2) throws JindentException {
      copyFile(new File(var1), new File(var2));
   }

   public static void copyFile(File var0, File var1) throws JindentException {
      File var2 = var1.getParentFile();
      var2.mkdirs();
      if(var2.exists() && var2.isDirectory()) {
         try {
            FileInputStream var3 = new FileInputStream(var0);
            FileOutputStream var4 = new FileOutputStream(var1);
            byte[] var5 = new byte[4096];

            int var6;
            while((var6 = var3.read(var5)) != -1) {
               var4.write(var5, 0, var6);
            }

            var3.close();
            var4.close();
         } catch (Exception var7) {
            throw new JindentException(a("G5\u0015K\u0018et\bH]b;\f^]g=\u0010BG!") + var7.getMessage());
         }
      } else {
         throw new JindentException(a("G5\u0015K\u0018et\bH]b&\u0019F\tdt\fF\tin\\") + var2.getAbsolutePath());
      }
   }

   public static ErrorMessage jindentExceptionToErrorMessage(String var0, JindentException var1) {
      return var1.hasColumnAndLineNumber()?new ErrorMessage(var0, var1.getMessage(), var1.getColumn(), var1.getLine(), 0):new ErrorMessage(var0, var1.getMessage());
   }

   public static JindentException convertParseErrorToJindentException(Error var0) {
      return convertThrowableToJindentException(var0);
   }

   public static JindentException convertParseExceptionToJindentException(ParseException var0) {
      return convertThrowableToJindentException(var0);
   }

   private static JindentException convertThrowableToJindentException(Throwable var0) {
      String var1 = var0.getMessage();
      if(var1 == null) {
         return new Utils$1(var0);
      } else {
         try {
            int var2 = var1.indexOf(a("m=\u0012B")) + 4;
            int var3 = var1.indexOf(",", var2);
            String var4 = var1.substring(var2, var3).trim();
            int var5 = Integer.parseInt(var4);
            int var6 = var1.indexOf(a("b;\u0010R\u0010o")) + 6;
            int var7 = var1.indexOf(".", var6);
            String var8 = var1.substring(var6, var7).trim();
            int var9 = Integer.parseInt(var8);
            String var10 = a("Q5\u000eT\u0018!\u0011\u000eU\u0012sz\\") + var1.substring(var7 + 1);
            return new Utils$2(var10, var9, var5);
         } catch (Exception var11) {
            return new Utils$3(var1);
         }
      }
   }

   public static String getString(Reader var0) throws IOException {
      if(var0 == null) {
         return null;
      } else {
         short var1 = 1024;
         BufferedReader var2 = new BufferedReader(var0, var1);
         char[] var4 = new char[var1];
         StringBuffer var5 = new StringBuffer();

         int var3;
         while((var3 = var2.read(var4, 0, var1)) != -1) {
            var5.append(var4, 0, var3);
         }

         var2.close();
         return var5.toString();
      }
   }

   public static String getStringFromFile(File var0, String var1) throws IOException {
      try {
         byte[] var2 = getBytesFromFile(var0);
         return new String(var2, var1);
      } catch (UnsupportedEncodingException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public static byte[] getBytesFromFile(File var0) throws IOException {
      FileInputStream var1 = new FileInputStream(var0);
      long var2 = var0.length();
      if(var2 > 2147483647L) {
         ;
      }

      byte[] var4 = new byte[(int)var2];
      int var5 = 0;

      int var7;
      for(boolean var6 = false; var5 < var4.length && (var7 = var1.read(var4, var5, var4.length - var5)) >= 0; var5 += var7) {
         ;
      }

      if(var5 < var4.length) {
         throw new IOException(a("B;\tK\u0019!:\u0013S]b;\u0011W\u0011d \u0019K\u0004!&\u0019F\u0019!2\u0015K\u0018!") + var0.getName());
      } else {
         var1.close();
         return var4;
      }
   }

   public static byte[] getBytesFromInputStream(InputStream var0) throws IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[4096];

      int var3;
      while((var3 = var0.read(var2)) != -1) {
         var1.write(var2, 0, var3);
      }

      var0.close();
      var1.close();
      return var1.toByteArray();
   }

   public static boolean isWindows() {
      return System.getProperty(a("n\'RI\u001cl1"), "").indexOf(a("h:\u0018H\nr")) != -1;
   }

   public static String getPathForObject(Object var0) {
      URL var1 = getURLForObject(var0);
      if(var1.getProtocol().equals(a("k5\u000e"))) {
         try {
            JarURLConnection var2 = (JarURLConnection)var1.openConnection();
            var1 = var2.getJarFileURL();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      try {
         File var5 = new File(URLDecoder.decode(var1.getPath(), a("T\u0000:\nE")));
         return var5.isFile()?var5.getParent():var5.getPath();
      } catch (UnsupportedEncodingException var3) {
         System.out.println(a("T&\u0010C\u0018b;\u0018N\u0013ft\u0019U\u000fn&F\u0007") + var3.getMessage());
         var3.printStackTrace();
         return "";
      }
   }

   private static URL getURLForObject(Object var0) {
      String var1 = var0.getClass().getName();
      int var2 = var1.lastIndexOf(46);
      var1 = new String(var1.substring(var2 + 1) + a("/7\u0010F\u000er"));
      return var0.getClass().getResource(var1);
   }

   public static void main(String[] var0) throws IOException {
      URL var1 = convertFilenameToURL(a("En S\u0018r  E\u0011`w\u001eK\bc\b\bB\u000euz\b_\t"));
      System.out.println(35);
      System.out.println(var1);
      URLConnection var2 = var1.openConnection();
      InputStream var3 = var2.getInputStream();
      InputStreamReader var4 = new InputStreamReader(var3);
      BufferedReader var5 = new BufferedReader(var4);
      String var6 = null;

      while((var6 = var5.readLine()) != null) {
         System.out.println(var6);
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
            var10003 = 1;
            break;
         case 1:
            var10003 = 84;
            break;
         case 2:
            var10003 = 124;
            break;
         case 3:
            var10003 = 39;
            break;
         default:
            var10003 = 125;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
