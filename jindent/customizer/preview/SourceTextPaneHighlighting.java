package jindent.customizer.preview;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;
import jindent.debugger.JindentLogging;
import jindent.formatter.Context;

public class SourceTextPaneHighlighting {
   private static HashMap a = new HashMap();
   private String b;
   private String c;
   private String d;
   private String e;
   private String f;
   private String g;
   private String h;
   private String i;
   private String j;
   private String k;
   private int l;
   private int m;
   private StyleContext n;
   private Style o;
   private Style p;
   private Style q;
   private Style r;
   private Style s;
   private Style t;
   private Style u;
   private Style v;
   private String w;
   private String x;
   private Hashtable y;
   // $FF: synthetic field
   static Class z;

   private SourceTextPaneHighlighting() {
      this.n = StyleContext.getDefaultStyleContext();
      this.v = this.n.getStyle(a("^\u007fg\u001a+Vn"));
      this.o = this.n.addStyle(a("Y+R\u000f\'V\u007f"), this.v);
      this.p = this.n.addStyle(a("Y(R\u000f\'V\u007f"), this.v);
      this.q = this.n.addStyle(a("Y)R\u000f\'V\u007f"), this.v);
      this.r = this.n.addStyle(a("Y.R\u000f\'V\u007f"), this.v);
      this.u = this.n.addStyle(a("Ins\u00120]Iu\u00022_"), this.v);
      this.s = this.n.addStyle(a("Yul\u0016;TnR\u000f\'V\u007f"), this.v);
      this.t = this.n.addStyle(a("Icl\u00191VIu\u00022_"), this.v);
      this.y = new Hashtable();
   }

   private SourceTextPaneHighlighting(String var1) throws FileNotFoundException {
      this();
      this.readHighlightInfo(var1);
   }

   public static SourceTextPaneHighlighting getInstance() {
      return getInstance((Context)null);
   }

   public static SourceTextPaneHighlighting getInstance(Context var0) {
      return readCachedHighlightFile(var0);
   }

   public Font createFont(Font var1, float var2) {
      Font var3 = var1.deriveFont(var2);
      TabStop[] var4 = new TabStop[100];
      int var5 = var3.getSize() / 2;

      for(int var6 = 0; var6 < 100; ++var6) {
         var4[var6] = new TabStop((float)((var6 + 1) * var5 * this.m));
      }

      TabSet var9 = new TabSet(var4);
      StyleConstants.setTabSet(this.v, var9);
      Color var7 = StyleConstants.getForeground(this.v);
      boolean var8 = this.isDarkScheme(var7);
      if(var8) {
         StyleConstants.setForeground(this.o, createColor(new Color(204, 120, 50)));
         StyleConstants.setForeground(this.p, createColor(new Color(104, 151, 187)));
         StyleConstants.setForeground(this.q, createColor(Color.GRAY));
         StyleConstants.setForeground(this.r, createColor(Color.white));
         StyleConstants.setForeground(this.u, createColor(new Color(106, 135, 89)));
         StyleConstants.setForeground(this.s, createColor(new Color(128, 128, 128)));
         StyleConstants.setForeground(this.t, createColor(new Color(185, 185, 200)));
      } else {
         StyleConstants.setForeground(this.o, createColor(Color.blue));
         StyleConstants.setForeground(this.p, createColor(Color.red));
         StyleConstants.setForeground(this.q, createColor(Color.GRAY));
         StyleConstants.setForeground(this.r, createColor(Color.black));
         StyleConstants.setForeground(this.u, createColor(Color.gray));
         StyleConstants.setForeground(this.s, createColor(new Color(0, 128, 128)));
         StyleConstants.setForeground(this.t, createColor(new Color(185, 185, 200)));
      }

      StyleConstants.setTabSet(this.o, var9);
      StyleConstants.setTabSet(this.p, var9);
      StyleConstants.setTabSet(this.q, var9);
      StyleConstants.setTabSet(this.r, var9);
      StyleConstants.setTabSet(this.u, var9);
      StyleConstants.setTabSet(this.s, var9);
      StyleConstants.setTabSet(this.t, var9);
      return var3;
   }

   private boolean isDarkScheme(Color var1) {
      int var2 = (var1.getRed() + var1.getGreen() + var1.getBlue()) / 3;
      return var2 > 128;
   }

   public void readHighlightInfo(String var1) {
      this.w = new String("");
      this.x = new String("");
      this.b = new String("");
      this.c = new String("");
      this.d = new String("");
      this.e = new String("");
      this.f = new String("");
      this.g = new String("");
      this.h = new String("");
      this.i = new String("");
      this.j = new String("");
      this.k = new String("");

      try {
         jindent.debugger.a.b(a("h\u007f`\u001f7T}!") + var1);
         BufferedReader var2 = new BufferedReader(new InputStreamReader((z == null?(z = class$(a("Pso\u001f;Tn/\u0018+Inn\u00167@\u007fsU.H\u007fw\u0012;M4R\u0014+Hyd/;BnQ\u001a0_"))):z).getResourceAsStream(var1)));
         String var4 = null;

         while(true) {
            String var3;
            while((var3 = var2.readLine()) != null) {
               if(var3.startsWith("/") && var3.indexOf("=") != -1) {
                  int var5 = var3.indexOf("=");
                  String var6 = var3.substring(0, var5 - 1);
                  String var7 = var3.length() > var5 + 1?var3.substring(var5 + 1):"";
                  this.addHighlightInfo(var6, var7.trim());
                  var4 = var6;
               } else if(var4 != null) {
                  this.addHighlightInfo(var4, " " + var3);
               } else {
                  jindent.debugger.a.b(a("wsr\b7T}!\r?Hs`\u00192_ !Y") + var3 + a("\u00184"));
               }
            }

            var2.close();
            break;
         }
      } catch (IOException var8) {
         jindent.debugger.a.b(var8.getMessage());
      }

      this.buildHighlightHashtable(this.h, this.o);
      this.buildHighlightHashtable(this.i, this.p);
      this.buildHighlightHashtable(this.j, this.q);
      this.buildHighlightHashtable(this.k, this.r);
   }

   private void buildHighlightHashtable(String var1, Style var2) {
      StringTokenizer var3 = new StringTokenizer(var1, a("\u001a\u0017\u000b"));
      int var4 = var3.countTokens();

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3.nextToken();
         this.y.put(var6, var2);
      }

   }

   public Style getHighlightStyle(String var1) {
      Style var2 = (Style)this.y.get(var1.trim());
      return var2 == null?this.v:var2;
   }

   public boolean hasHighlightStyle(String var1) {
      return this.y.get(var1.toLowerCase().trim()) != null;
   }

   public boolean isDelimiter(String var1) {
      return this.w == null?false:this.w.indexOf(var1) != -1;
   }

   public void addHighlightInfo(String var1, String var2) {
      if(var1.startsWith(a("\u0015Vh\u0015;\u001aYn\u00163_tu"))) {
         this.x = this.x + var2;
      } else if(var1.startsWith(a("\u0015Xm\u0014=Q:B\u00143W\u007fo\u000f~ut"))) {
         this.b = this.b + var2;
      } else if(var1.startsWith(a("\u0015Xm\u0014=Q:B\u00143W\u007fo\u000f~u|g"))) {
         this.c = this.c + var2;
      } else if(var1.startsWith(a("\u0015_r\u0018?J\u007f!86[h"))) {
         this.d = this.d + var2;
      } else if(var1.startsWith(a("\u0015^d\u00177Wsu\u001e,I"))) {
         this.w = this.w + var2;
      } else if(var1.startsWith(a("\u0015\\t\u0015=Nsn\u0015~ins\u00120]"))) {
         this.e = this.e + var2;
      } else if(var1.startsWith(a("\u0015So\u001f;Tn!(*Hso\u001c-"))) {
         this.f = this.f + var2;
      } else if(var1.startsWith(a("\u0015Oo\u00120^\u007fo\u000f~ins\u00120]i"))) {
         this.g = this.g + var2;
      } else if(var1.startsWith(a("\u0015Y0"))) {
         this.h = this.h + var2;
      } else if(var1.startsWith(a("\u0015Y3"))) {
         this.i = this.i + var2;
      } else if(var1.startsWith(a("\u0015Y2"))) {
         this.j = this.j + var2;
      } else if(var1.startsWith(a("\u0015Y5"))) {
         this.k = this.k + var2;
      } else {
         System.out.println(a("mhn\u00159\u001al`\t7[xm\u001ed\u001a8") + var1 + a("\u00184"));
      }

   }

   private static Color createColor(Color var0) {
      return createColor(var0, false);
   }

   private static Color createColor(Color var0, boolean var1) {
      int var2 = var0.getRed();
      int var3 = var0.getBlue();
      int var4 = var0.getGreen();
      if(var1) {
         var2 += (255 - var2) * 50 / 100;
         var4 += (255 - var4) * 50 / 100;
         var3 += (255 - var3) * 50 / 100;
      }

      return new Color(var2, var4, var3);
   }

   public StyleContext getStyleContext() {
      return this.n;
   }

   public Style getDefaultStyle() {
      return this.v;
   }

   public Style getSymbolStyle() {
      return this.t;
   }

   public Style getStringStyle() {
      return this.u;
   }

   public Style getCommentStyle() {
      return this.s;
   }

   public Style getC2Style() {
      return this.p;
   }

   public String getDelimiters() {
      return this.w;
   }

   private static SourceTextPaneHighlighting readCachedHighlightFile(Context var0) {
      String var1 = var0 == null?a("Tom\u0017"):var0.pathOfResources();
      SourceTextPaneHighlighting var2 = (SourceTextPaneHighlighting)a.get(var1);
      if(var2 == null) {
         try {
            if(var0 == null) {
               var2 = new SourceTextPaneHighlighting();
            } else {
               var2 = new SourceTextPaneHighlighting(var0.pathOfResources() + a("Rsf\u00132S}i\u000f7T}.\u00137]rm\u00129Rnh\u00159\u0014so\u001d"));
            }
         } catch (FileNotFoundException var4) {
            jindent.debugger.a.a((Exception)var4);
            JindentLogging.getLogger().log(Level.SEVERE, a("\u007fbb\u001e.Nsn\u0015~Uyb\u000e,_~"), var4);
         }

         a.put(var1, var2);
      }

      return var2;
   }

   // $FF: synthetic method
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
            var10003 = 58;
            break;
         case 1:
            var10003 = 26;
            break;
         case 2:
            var10003 = 1;
            break;
         case 3:
            var10003 = 123;
            break;
         default:
            var10003 = 94;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
