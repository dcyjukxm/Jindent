package jindent.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class IndexProperties extends HashMap {
   protected IndexProperties a;
   private static final String b = "BD9\u000eQs";
   private static final String c = "BD";
   private static final String d = "=: \t\r\n\f#!";
   private static final String e = "_w=\tW";

   public IndexProperties() {
      this((IndexProperties)null);
   }

   public IndexProperties(IndexProperties var1) {
      this.a = var1;
   }

   public Object a(String var1, String var2) {
      return this.put(var1, var2);
   }

   public void a(InputStream var1) throws UnsupportedEncodingException, IOException {
      this.a(var1, System.getProperties().getProperty(c("\u0019\u0017\\fu\u001a\u0010Sl?\u0016\u0010W")));
   }

   public void a(InputStream var1, String var2) throws UnsupportedEncodingException, IOException {
      this.a((Reader)(new InputStreamReader(var1, var2)));
   }

   public void a(Reader var1) throws IOException {
      BufferedReader var2 = new BufferedReader(var1);

      while(true) {
         String var3;
         char var4;
         do {
            do {
               do {
                  var3 = var2.readLine();
                  if(var3 == null) {
                     return;
                  }
               } while(var3.length() <= 0);

               var4 = var3.charAt(0);
            } while(var4 == 35);
         } while(var4 == 33);

         int var13;
         while(this.a(var3)) {
            String var5 = var2.readLine();
            if(var5 == null) {
               var5 = new String("");
            }

            String var6 = var3.substring(0, var3.length() - 1);
            boolean var7 = false;

            for(var13 = 0; var13 < var5.length() && c("_w=\tW").indexOf(var5.charAt(var13)) != -1; ++var13) {
               ;
            }

            var5 = var5.substring(var13, var5.length());
            var3 = new String(var6 + var5);
         }

         int var11 = var3.length();

         int var12;
         for(var12 = 0; var12 < var11 && c("_w=\tW").indexOf(var3.charAt(var12)) != -1; ++var12) {
            ;
         }

         for(var13 = var12; var13 < var11; ++var13) {
            char var8 = var3.charAt(var13);
            if(var8 == 92) {
               ++var13;
            } else if(c("BD9\u000eQs").indexOf(var8) != -1) {
               break;
            }
         }

         int var14;
         for(var14 = var13 + 1; var14 < var11 && c("_w=\tW").indexOf(var3.charAt(var14)) != -1; ++var14) {
            ;
         }

         if(var14 < var11 && c("BD").indexOf(var3.charAt(var14)) != -1) {
            ++var14;
         }

         while(var14 < var11 && c("_w=\tW").indexOf(var3.charAt(var14)) != -1) {
            ++var14;
         }

         String var9 = var3.substring(var12, var13);
         String var10 = var13 < var11?var3.substring(var14, var11):"";
         this.put(var9, var10);
      }
   }

   private boolean a(String var1) {
      int var2 = 0;

      for(int var3 = var1.length() - 1; var3 >= 0 && var1.charAt(var3--) == 92; ++var2) {
         ;
      }

      return var2 % 2 == 1;
   }

   public String b(String var1) {
      Object var2 = super.get(var1);
      String var3 = var2 instanceof String?(String)var2:null;
      return var3 == null && this.a != null?this.a.b(var1):var3;
   }

   public String b(String var1, String var2) {
      String var3 = this.b(var1);
      return var3 == null?var2:var3;
   }

   public Enumeration a() {
      Hashtable var1 = new Hashtable();
      this.a(var1);
      return var1.keys();
   }

   public void a(PrintStream var1) {
      var1.println(c("RS\u0010o2\f\nYm<_\u000eBl+\u001a\fDj>\f^\u001d."));
      Hashtable var2 = new Hashtable();
      this.a(var2);

      String var4;
      String var5;
      for(Enumeration var3 = var2.keys(); var3.hasMoreElements(); var1.println(var4 + "=" + var5)) {
         var4 = (String)var3.nextElement();
         var5 = (String)var2.get(var4);
         if(var5.length() > 40) {
            var5 = var5.substring(0, 37) + c("QP\u001e");
         }
      }

   }

   public void a(PrintWriter var1) {
      var1.println(c("RS\u0010o2\f\nYm<_\u000eBl+\u001a\fDj>\f^\u001d."));
      Hashtable var2 = new Hashtable();
      this.a(var2);

      String var4;
      String var5;
      for(Enumeration var3 = var2.keys(); var3.hasMoreElements(); var1.println(var4 + "=" + var5)) {
         var4 = (String)var3.nextElement();
         var5 = (String)var2.get(var4);
         if(var5.length() > 40) {
            var5 = var5.substring(0, 37) + c("QP\u001e");
         }
      }

   }

   private void a(Hashtable var1) {
      if(this.a != null) {
         this.a.a(var1);
      }

      Iterator var2 = super.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.put(var3, this.get(var3));
      }

   }

   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Hashtable var2 = new Hashtable();
      this.a(var2);
      Enumeration var3 = var2.keys();

      while(var3.hasMoreElements()) {
         String var4 = (String)var3.nextElement();
         String var5 = (String)var2.get(var4);
         var1.append(var4 + "=" + var5 + "\n");
      }

      return var1.toString();
   }

   private static String c(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 127;
            break;
         case 1:
            var10003 = 126;
            break;
         case 2:
            var10003 = 48;
            break;
         case 3:
            var10003 = 3;
            break;
         default:
            var10003 = 91;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
