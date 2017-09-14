package jindent.formatter;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import jindent.JindentException;
import jindent.SettingsUtils;
import jindent.debugger.JindentLogging;
import jindent.debugger.Monitor;
import jindent.formatter.AbstractParser$1;
import jindent.formatter.AbstractParser$2;
import jindent.formatter.AbstractParser$3;
import jindent.formatter.AbstractParser$4;
import jindent.formatter.CaretHistoryMapper;
import jindent.formatter.Context;
import jindent.formatter.ParseException;
import jindent.formatter.i;
import jindent.formatter.j;
import jindent.formatter.k;
import jindent.formatter.m;
import jindent.formatter.n;
import jindent.formatter.o;
import jindent.formatter.p;
import jindent.formatter.q;
import jindent.formatter.r;
import jindent.formatter.t;
import jindent.formatter.u;
import jindent.formatter.d.a.c;
import jindent.formatter.d.a.e;
import jindent.formatter.e.a.a.b;
import jindent.message.Message;
import jindent.message.WarningMessage;
import jindent.settings.EndOfLineFormatSetting;
import jindent.util.IndexProperties;
import jindent.util.MyStack;
import jindent.util.MyStringBuffer;
import jindent.util.MyVector;
import jindent.util.Utils;
import jindent.util.d;

public abstract class f implements m, n {
   protected static final int a = 0;
   public static final String SET_CONTROL_COMMENT_PREFIX_INDENTATION_WIDTH = "[siw:";
   public static final String SET_CONTROL_COMMENT_POSTFIX_INDENTATION_WIDTH = "]";
   public static final String GET_CONTROL_COMMENT_PREFIX_INDENTATION_WIDTH = "[giw:";
   public static final String GET_CONTROL_COMMENT_POSTFIX_INDENTATION_WIDTH = "]";
   public static int splashScreenCounter = 0;
   protected Context b = null;
   protected int c = 102400;
   protected int d = 0;
   protected int e = 0;
   protected r[] f;
   protected String g;
   protected int h;
   protected boolean i = false;
   protected boolean j = false;
   protected boolean k = false;
   protected jindent.formatter.c.a l = null;
   protected b m;
   protected b n;
   protected MyStack o;
   protected Hashtable p;
   protected MyVector q;
   protected e r;
   protected int s;
   protected Object t = null;
   private boolean u = false;
   protected boolean v = true;
   protected int w = -1;
   protected int x = 0;
   protected q y;
   protected q z;
   protected boolean A = false;
   protected boolean B = false;
   protected boolean C = false;
   protected int D = 0;
   protected int E = 0;
   protected j F;
   protected j G;
   protected int H = 0;
   protected int I = 0;
   protected int J = 0;
   protected int K = 0;
   protected int L = 0;
   protected int M = 0;
   protected int N = 0;
   protected int O = 0;
   protected int P = 0;
   protected int Q = 0;
   protected boolean R = true;
   protected boolean S = false;
   protected int T = 1;
   protected int U = 0;
   protected int V = 0;
   protected int W = 0;
   private boolean X;

   public f(Context var1) {
      this.a(var1);
   }

   public void a(Context var1) {
      this.b = var1;
      this.a(this.b.f);
      this.e();
   }

   public void a(jindent.formatter.c.a var1) {
      this.l = var1;
   }

   public jindent.formatter.c.a c() {
      return this.l;
   }

   public String a(String var1) throws JindentException {
      StringReader var2 = new StringReader(var1);
      StringWriter var3 = new StringWriter();
      this.a((Reader)var2, (Writer)var3);
      return var3.getBuffer().toString();
   }

   public byte[] a(byte[] var1) throws JindentException {
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      this.a((InputStream)var2, (OutputStream)var3);
      return var3.toByteArray();
   }

   private void a(int var1) {
      if(var1 == 0) {
         i var2 = this.b.a.d().k();
         var1 = EndOfLineFormatSetting.statsToEndOfLineFormat(var2);
      }

      this.g = EndOfLineFormatSetting.formatToEndOfLine(var1);
      this.h = var1;
   }

   protected void e() {
      this.b.init();
      this.F = null;
      this.G = null;
      this.H = 0;
      this.I = 0;
      this.L = this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn"));
      this.J = 0;
      this.K = 0;
      this.M = 0;
      this.N = 0;
      this.O = 0;
      this.Q = 0;
      this.E = 0;
      this.C = false;
      this.D = 0;
      this.R = true;
      this.X = true;
      this.S = false;
      this.T = 0;
      this.U = 0;
      this.V = this.b.getNumber(s("xs_\u001b3R\u007f[\r+WtI\r)j"));
      this.V = 0;
      this.y = null;
      this.z = null;
      this.d = 0;
      this.e = 0;
      this.m = null;
      this.n = null;
      this.A = false;
      this.B = false;
      this.o = new MyStack();
      this.p = new Hashtable();
      this.q = new MyVector();
      this.r = new e();
      this.s = 0;
   }

   void a(q var1, boolean var2) {
      boolean var3 = false;
      q var4 = var1;

      while(var4 != null) {
         if(this.b.a.h(var4)) {
            if(var3) {
               break;
            }

            var4.a = -11;
         } else if(this.b.a.b(var4)) {
            var4.a = -11;
            var3 = true;
         } else if(var3) {
            break;
         }

         if(var2) {
            var4 = var4.g;
         } else {
            var4 = var4.h;
         }
      }

   }

   public void a(Object var1) {
      this.t = var1;
   }

   public Object a() {
      return this.t;
   }

   void b(q var1, boolean var2) {
      q var3 = var1;

      while(var3 != null) {
         if(this.b.a.h(var3)) {
            var3.a = -11;
         } else if(this.b.a.c(var3)) {
            var3.a = -11;
            break;
         }

         if(var2) {
            var3 = var3.g;
         } else {
            var3 = var3.h;
         }
      }

   }

   void c(q var1, boolean var2) {
      q var3 = var1;

      while(var3 != null) {
         if(this.b.a.h(var3)) {
            var3.a = -11;
         } else if(this.b.a.d(var3)) {
            var3.a = -11;
            break;
         }

         if(var2) {
            var3 = var3.g;
         } else {
            var3 = var3.h;
         }
      }

   }

   private String a(String var1, int var2, String var3, String var4, boolean var5) {
      int var6 = var1.length();
      int var7 = var3.length() + 2;
      int var8 = var4.length();
      StringBuffer var9 = new StringBuffer(var1);
      if(var4 != null) {
         if(var8 == 0) {
            return var1;
         } else {
            StringBuffer var10 = new StringBuffer(var1.substring(0, var2));
            var10.append(var4);
            int var11;
            if(var5) {
               for(var11 = 1; var11 <= var7 - var8; ++var11) {
                  var10.append(' ');
               }
            }

            var11 = var2 + var7;
            if(var5) {
               while(var11 < var2 + var8 && var6 > var11) {
                  if(var9.charAt(var11) != 32) {
                     if(var5) {
                        var10.append(' ');
                     }
                     break;
                  }

                  ++var11;
               }
            }

            if(var11 <= var6) {
               var10.append(var1.substring(var11, var6));
            }

            return var10.toString();
         }
      } else {
         return var1;
      }
   }

   private String a(String var1, char var2, boolean var3) {
      int var4 = 0;

      while(var4 < var1.length()) {
         int var5 = var1.indexOf(var2, var4);
         var4 = var5 + 1;
         if(var5 < 0 || var4 >= var1.length()) {
            break;
         }

         int var6 = var1.indexOf(var2, var4);
         if(var6 < 0) {
            break;
         }

         String var7 = var1.substring(var5 + 1, var6);
         String var8 = this.b.d.getVariable(var7);
         if(var8 == null) {
            var8 = t.emptyString;
            if(this.v) {
               this.b.addMessage(new WarningMessage(this.b.getLanguage(), s("]{C\u0006(j:_\r4qv[\rg{t[\u00015qt@\r)j:[\t5w{O\u0004\">=") + var7 + "\'", 3));
            }
         }

         var1 = this.a(var1, var5, var7, var8, var3);
         if(var3) {
            var4 = var6 + 1;
         } else {
            var4 = var5 + var8.length() + 1;
         }
      }

      return var1;
   }

   private String b(String var1) {
      var1 = this.a(var1, '$', false);
      var1 = this.a(var1, '%', true);
      return var1;
   }

   private String c(String var1) {
      String var2 = this.b(var1);
      return var2;
   }

   public void d(String var1) {
      if(var1.endsWith(s("\u0013\u0010"))) {
         var1 = var1.substring(0, var1.length() - 2);
      } else if(var1.endsWith("\r") || var1.endsWith("\n")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      this.a((String)var1, -28);
   }

   public void e(String var1) {
      if(!var1.equals("") && !var1.equals("\n")) {
         this.d(var1);
         this.r();
      } else {
         this.u();
      }

   }

   protected void d(q var1, boolean var2) {
      jindent.formatter.d.j var3 = new jindent.formatter.d.j(this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji")));
      q var4 = null;
      d var5 = new d(var1.f);
      int var7 = this.V;
      int var8 = this.d;
      int var9 = var5.a();
      int var10 = var1.c;

      for(int var13 = 1; var13 <= var9; ++var13) {
         String var6 = var5.b();
         int var11;
         if(var13 > 1) {
            var11 = this.r(var6) - var10 + 1;
         } else {
            var11 = 0;
         }

         int var12 = var2?var8 + var11:var7 + var11;
         if(var12 < 0) {
            var12 = 0;
         }

         this.d = var12;
         this.S = true;
         var6 = var6.trim();
         if(var2) {
            if(var13 == 1) {
               var3.a(this.z);
               this.a(this.z, 0, this.Q, var3);
               var4 = this.z;
               this.e(var6);
            } else {
               var3.a(this.z);
               q var14 = this.z;
               this.e(var6);
               q var15 = this.z;
               this.b.a.a(2, var14.g, var15, var4.g, var11, 2);
            }
         } else {
            this.e(var6);
         }
      }

      this.V = var7;
   }

   protected void a(q var1) {
      this.d(var1.f);
   }

   protected String f(String var1) {
      String var3 = t.emptyString;
      boolean var5 = true;
      boolean var6 = true;

      int var2;
      for(var2 = var1.length() - 1; var2 >= 0; --var2) {
         if(var1.charAt(var2) != 32) {
            var5 = false;
         }

         if(var1.charAt(var2) != 42 && !var5) {
            var6 = false;
         }

         if((var1.charAt(var2) != 32 || !var5) && (var1.charAt(var2) != 42 || !var6)) {
            var3 = var1.charAt(var2) + var3;
         }
      }

      String var4 = t.emptyString;
      var5 = true;
      var6 = true;

      for(var2 = 0; var2 < var3.length(); ++var2) {
         if(var3.charAt(var2) != 32) {
            var5 = false;
         }

         if(var3.charAt(var2) != 42 && !var5) {
            var6 = false;
         }

         if(var3.charAt(var2) != 42 || !var6) {
            var4 = var4 + var3.charAt(var2);
         }
      }

      return var4;
   }

   private String b(q var1) {
      String[] var2 = this.j();
      String var3 = var1.f;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         if(var3.startsWith(var5)) {
            return var5;
         }
      }

      throw new IllegalStateException(s("Pu\r\u000b(swH\u00063>j_\r!wb\r\u000e(ktIH!qh\u0017H") + var3);
   }

   protected void e(q var1, boolean var2) {
      String var3 = this.b(var1);
      jindent.formatter.d.j var4 = new jindent.formatter.d.j(this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji")));
      q var5 = null;
      StringBuffer var6 = new StringBuffer();
      d var7 = new d(var1.f);
      int var9 = var1.c;
      int var10 = this.V;
      this.V = var2?this.d:this.V;
      int var13 = var7.a();
      if(var13 == 1) {
         jindent.debugger.a.b(s("MSc/\u000b[E`=\u000bJSr$\u000eP_r+\bSWh&\u0013>hH\u000b(ytD\u0012\"z:L\u001bgSOa<\u000eAVd&\u0002AYb%\n[TyHf"));
         jindent.debugger.a.b("\"" + var1.f + "\"");
      } else {
         for(int var14 = 1; var14 <= var13; ++var14) {
            String var8 = var7.b();
            int var11 = this.r(var8);
            var8 = this.f(var8);
            int var12 = var14 == 1?0:var9;
            if(var11 < var12) {
               var12 = var11;
            }

            if(var8.startsWith(var3)) {
               var8 = " " + var8.substring(var3.length());
            } else if(var8.startsWith("/")) {
               var8 = var8.substring(1);
            }

            if(var8.endsWith(s("45"))) {
               var8 = var8.substring(0, var8.length() - 2);
            } else if(var8.endsWith("/")) {
               var8 = var8.substring(0, var8.length() - 1);
            }

            if(var12 <= var8.length()) {
               var8 = var8.substring(var12, var8.length());
            } else {
               var8 = t.emptyString;
            }

            var6.setLength(0);
            var6.append(s(">0"));
            if(var8.length() > 0 && var8.charAt(0) != 32) {
               var6.append(" ");
            }

            var8 = g(var8);
            var6.append(var8);
            var8 = var8.trim();
            q var15;
            q var16;
            if(var14 == 1) {
               if(var2) {
                  var4.a(this.z);
                  this.a(this.z, 0, this.Q, var4);
                  var5 = this.z;
               }

               this.e(var3);
               if(var8.length() > 0) {
                  if(var2) {
                     var4.a(this.z);
                     var15 = this.z;
                     this.e(var6.toString());
                     var16 = this.z;
                     this.b.a.a(2, var15.g, var16, var5.g, 0, 2);
                  } else {
                     this.e(var6.toString());
                  }

                  var8 = t.emptyString;
               }
            }

            if(var14 > 1 && var14 < var13) {
               if(var2) {
                  var4.a(this.z);
                  var15 = this.z;
                  this.e(var6.toString());
                  var16 = this.z;
                  this.b.a.a(2, var15.g, var16, var5.g, 0, 2);
               } else {
                  this.e(var6.toString());
               }

               var8 = t.emptyString;
            }

            if(var14 == var13) {
               if(var8.length() == 0) {
                  if(var2) {
                     var4.a(this.z);
                     var15 = this.z;
                     this.e(s(">0\u0002"));
                     var16 = this.z;
                     this.b.a.a(2, var15.g, var16, var5.g, 0, 2);
                  } else {
                     this.e(s(">0\u0002"));
                  }
               } else {
                  if(var2) {
                     var4.a(this.z);
                     var15 = this.z;
                     this.e(var6.toString());
                     var16 = this.z;
                     this.b.a.a(2, var15.g, var16, var5.g, 0, 2);
                  } else {
                     this.e(var6.toString());
                  }

                  if(var2) {
                     var4.a(this.z);
                     var15 = this.z;
                     this.e(s(">0\u0002"));
                     var16 = this.z;
                     this.b.a.a(2, var15.g, var16, var5.g, 0, 2);
                  } else {
                     this.e(s(">0\u0002"));
                  }
               }
            }
         }

         this.V = var10;
      }
   }

   private static String g(String var0) {
      int var1 = var0.length();

      for(char[] var2 = var0.toCharArray(); 0 < var1 && var2[var1 - 1] == 32; --var1) {
         ;
      }

      return var1 > 0?var0.substring(0, var1):"";
   }

   protected void a(jindent.formatter.e.d var1) {
      this.r();
      int var2 = var1.a();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.a(var3);
         this.e(var4);
      }

      this.r();
   }

   protected void a(jindent.formatter.e.b var1) {
      this.r();
      this.e(var1.a());
   }

   protected void f(q var1, boolean var2) {
      this.r();
      if(var2) {
         this.e(var1, false);
      } else {
         this.d(var1, false);
      }

      this.r();
   }

   protected void g(q var1, boolean var2) {
      if(var2) {
         this.e(var1, true);
      } else {
         this.d(var1, true);
      }

      this.r();
   }

   protected void c(q var1) {
      String var2 = this.b(var1);
      d var3 = new d(var1.f);
      String var4 = var1.f;
      int var5 = var3.a();
      if(var5 > 1) {
         jindent.debugger.a.b(s("SOa<\u000eAVd&\u0002AYb%\n[TyH5{yB\u000f)w`H\fg\u007fi\r;\u000eP]a-\u0018SOa<\u000eAVd&\u0002AYb%\n[TyHf"));
         jindent.debugger.a.b("\"" + var1.f + "\"");
      } else {
         if(var4.startsWith(var2)) {
            var4 = var4.substring(var2.length());
         }

         if(var4.endsWith(s("45"))) {
            var4 = var4.substring(0, var4.length() - 2);
         }

         var4 = var4.trim();
         var4 = var2 + " " + var4 + s(">0\u0002");
         this.d(var4);
      }
   }

   protected void h(q var1, boolean var2) {
      if(var2) {
         this.r();
         this.c(var1);
         this.r();
      } else {
         this.r();
         this.a(var1);
         this.r();
      }

   }

   protected void i(q var1, boolean var2) {
      if(var2) {
         this.c(var1);
      } else {
         this.a(var1);
      }

   }

   protected void j(q var1, boolean var2) {
      if(var2) {
         this.c(var1);
         this.s();
      } else {
         this.a(var1);
         this.s();
      }

   }

   protected void d(q var1) {
      String var2 = this.b(var1);
      String var4 = var1.f;
      if(var4.startsWith(var2)) {
         var4 = var4.substring(var2.length());
      }

      var4 = var4.trim();
      MyStringBuffer var3 = new MyStringBuffer(var2);
      if(!var4.equals("")) {
         if(!var4.startsWith(s("15"))) {
            var3.a(" ");
         }

         var3.a(var4);
      }

      this.d(var3.toString());
   }

   protected void k(q var1, boolean var2) {
      if(var2) {
         this.d(var1);
         this.s();
      } else {
         this.a(var1);
         this.s();
      }

   }

   protected void l(q var1, boolean var2) {
      if(var2) {
         this.r();
         this.d(var1);
         this.r();
      } else {
         this.r();
         this.a(var1);
         this.r();
      }

   }

   protected void e(q var1) {
      String var2 = u.e(s(">\\B\u001a*\u007fnY\r#>xTH\rwtI\r)j:\u0000Ej>rY\u001c7$5\u0002\u001f0i4G\u0001)z\u007fC\u001ci}u@"));
      if(this.b.getPositionIndex(s("tsC\f\"pnc\u00073{JB\u001b.jsB\u0006")) == 1) {
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4Ju~\r7\u007fhL\u001c\"TsC\f\"pnc\u00073{")));
      }

      this.e(var2);
      if(this.v) {
         this.b.addMessage(new Message(this.b.getLanguage(), s("]hH\t3{~\r\".p~H\u00063>yB\u0005*{hN\u0001&r:C\u00073{"), 3, var1));
      }

      if(this.b.getPositionIndex(s("tsC\f\"pnc\u00073{JB\u001b.jsB\u0006")) == 0) {
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4Ju~\r7\u007fhL\u001c\"TsC\f\"pnc\u00073{")));
      }

   }

   private static String h(String var0) {
      try {
         SimpleDateFormat var1 = new SimpleDateFormat(var0);
         Date var2 = new Date();
         return var1.format(var2);
      } catch (Exception var3) {
         return s("4m_\u0007)y:I\t3{:K\u00075s{YB");
      }
   }

   protected void f(q var1) {
      String var2 = u.e(this.c(this.b.getString(s("}uC\u001e\"pnD\u0007)PuY\r"))));
      if(this.b.getPositionIndex(s("}uC\u001e\"pnD\u0007)PuY\r\u0017qiD\u001c.qt")) == 1) {
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4Ju~\r7\u007fhL\u001c\"]uC\u001e\"pnD\u0007)PuY\r")));
      }

      if(this.v) {
         this.b.addMessage(new Message(this.b.getLanguage(), s("]hH\t3{~\r\u000b(plH\u00063wuCH)qnH"), 3, var1));
      }

      this.e(var2);
      if(this.b.getPositionIndex(s("}uC\u001e\"pnD\u0007)PuY\r\u0017qiD\u001c.qt")) == 0) {
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4Ju~\r7\u007fhL\u001c\"]uC\u001e\"pnD\u0007)PuY\r")));
      }

   }

   protected void f() {
      String[] var2 = this.b.getStringArray(s("v\u007fL\f\"lNH\u00057r{Y\r"));
      int var3 = var2.length;
      if(var3 != 0) {
         for(int var4 = 0; var4 < var3; ++var4) {
            String var1 = var2[var4];
            var1 = this.c(var1);
            this.e(var1);
         }

         if(this.v) {
            this.b.addMessage(new Message(this.b.getLanguage(), s("]hH\t3{~\r\u0000\"\u007f~H\u001a"), 3));
         }

      }
   }

   protected void g() {
      String[] var1 = this.b.getStringArray(s("xuB\u001c\"lNH\u00057r{Y\r"));
      int var3 = var1.length;
      if(var3 != 0) {
         for(int var4 = 0; var4 < var3; ++var4) {
            String var2 = var1[var4];
            var2 = this.c(var2);
            this.e(var2);
         }

         if(this.v) {
            this.b.addMessage(new Message(this.b.getLanguage(), s("]hH\t3{~\r\u000e(qnH\u001a"), 3));
         }

      }
   }

   protected void g(q var1) {
      q var2 = var1;
      if(var1 != null) {
         while(var2.h != null) {
            var2 = var2.h;
         }

         while(var2 != null) {
            boolean var3 = true;
            boolean var4 = p.b(var2.f, this.b.getString(s("zuc\u00073Xu_\u0005&jYB\u0005*{tY\u001b\u0004qtY\t.psC\u000f\f{c^")));
            int var6 = this.b.a.k(var2);
            if(u.p(var2)) {
               this.q();
               int var7 = jindent.formatter.a.d.a(var2.f);
               this.a("", -96, var7);
               this.v = false;
            }

            if(u.r(var2)) {
               this.A = false;
               var4 = false;
               this.m = null;
            }

            boolean var5 = u.n(var2);
            if(var5) {
               var4 = false;
               var3 = false;
               this.h(var2);
            }

            if(var6 == -1) {
               jindent.debugger.a.b(s("AXa\'\u0004UEn\'\nS_c<g\u007fj]\r&l\u007fIH.p:Z\u001a(p}\r\t5{{\u0003"));
            } else if(var6 == -12) {
               jindent.debugger.a.b(s("A^b0\u001eY_c7\u0005RUn#\u0018]U`%\u0002PN\r\t7n\u007fL\u001a\"z:D\u0006gihB\u0006 >{_\r&0"));
            } else if(var6 == -5) {
               if(this.b.getBoolean(s("z\u007fA\r3{N_\t.rsC\u000f\u0004qw@\r)ji")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\n+qyFH(x:Y\u001a&wvD\u0006 >yB\u0005*{tY\u001b"), 3, this.z));
                  }
               } else {
                  this.g(var2, var4 && this.b.getBoolean(s("xu_\u0005&jN_\t.rsC\u000f\u0004qw@\r)ji")));
               }
            } else if(var6 == -16) {
               if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY\u001b"), 4, this.z));
                  }
               } else {
                  this.g(var2, var4 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
               }
            } else if(var6 == -2 && !this.b.getBoolean(s("z\u007fA\r3{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b"))) {
               jindent.debugger.a.b(s("AId&\u0000R_r$\u000eP_r+\bSWh&\u0013>{]\u0018\"\u007fhH\fgwt\r\u001f5qtJH&l\u007fLF"));
            } else if(var6 == -13 && !this.b.getBoolean(s("z\u007fA\r3{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b"))) {
               jindent.debugger.a.b(s("A^b0\u001eY_c7\u0014WTj$\u0002AVd&\u0002AYb%\n[TyH&njH\t5{~\r\u0001)>m_\u0007)y:L\u001a\"\u007f4"));
            } else if(var6 == -3) {
               if(this.b.getBoolean(s("z\u007fA\r3{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\u001b.p}A\rgrsC\rg}u@\u0005\"pn"), 3, this.z));
                  }
               } else {
                  this.q();
                  this.i(var2, var4 && this.b.getBoolean(s("xu_\u0005&jID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")));
               }
            } else if(var6 == -14) {
               if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                  }
               } else {
                  this.q();
                  this.i(var2, var4 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
               }
            } else if(var6 == -4) {
               if(this.b.getBoolean(s("z\u007fA\r3{N_\t.rsC\u000f\u0004qw@\r)ji")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\u001c5\u007fsA\u0001)y:N\u0007*s\u007fC\u001c"), 3, this.z));
                  }
               } else {
                  if(!var5) {
                     this.a(this.z, 0, this.Q, new jindent.formatter.d.j(this.z, this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji"))));
                  }

                  this.j(var2, var4 && this.b.getBoolean(s("xu_\u0005&jN_\t.rsC\u000f\u0004qw@\r)ji")));
               }
            } else if(var6 == -15) {
               if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                  }
               } else {
                  if(!var5) {
                     this.a(this.z, 0, this.Q, new jindent.formatter.d.j(this.z, this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji"))));
                  }

                  this.j(var2, var4 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
               }
            } else if(var6 == -7) {
               if(this.b.getBoolean(s("z\u007fA\r3{N_\t.rsC\u000f\u0004qw@\r)ji")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\r)z:B\u000egrsC\rg}u@\u0005\"pn"), 3, this.z));
                  }
               } else {
                  this.a(this.z, 0, this.Q, new jindent.formatter.d.j(this.z, this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji"))));
                  this.k(var2, var4 && this.b.getBoolean(s("xu_\u0005&jN_\t.rsC\u000f\u0004qw@\r)ji")));
               }
            } else if(var6 == -18) {
               if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                  }
               } else {
                  this.a(this.z, 0, this.Q, new jindent.formatter.d.j(this.z, this.b.getBoolean(s("\u007fvD\u000f)]u@\u0005\"pn^")) && this.b.getBoolean(s("\u007fvD\u000f)[bN\r\"zsC\u000f\u0004qw@\r)ji"))));
                  this.k(var2, var4 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
               }
            } else if(var6 == -6 && !this.b.getBoolean(s("z\u007fA\r3{_C\f\bxVD\u0006\"]u@\u0005\"pn^"))) {
               jindent.debugger.a.b(s("AId&\u0000R_r-\tZEb.\u0018RSc-\u0018]U`%\u0002PN\r\t7n\u007fL\u001a\"z:D\u0006gihB\u0006 >{_\r&0"));
            } else if(var6 == -17 && !this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m"))) {
               jindent.debugger.a.b(s("AId&\u0000R_r-\tZEb.\u0018RSc-\u0018]U`%\u0002PN\r\t7n\u007fL\u001a\"z:D\u0006gihB\u0006 >{_\r&0"));
            } else if(var6 == -8) {
               if(this.b.getBoolean(s("z\u007fA\r3{PL\u001e&ZuN+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\"&h{i\u0007$>yB\u0005*{tY"), 4, this.z));
                  }
               } else {
                  this.i(this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{PL\u001e&ZuN+(swH\u00063m")));
                  this.o(var2, var4 && this.b.getBoolean(s("xu_\u0005&jPL\u001e&ZuN+(swH\u00063m")));
                  this.i(this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5T{[\t\u0003qyn\u0007*s\u007fC\u001c4")));
               }
            } else if(var6 == -19) {
               if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var3) {
                  if(this.v) {
                     this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                  }
               } else {
                  this.i(this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^B\u0010>y\u007fC+(swH\u00063m")));
                  this.o(var2, var4 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
                  this.i(this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5ZuU\u0011 {tn\u0007*s\u007fC\u001c4")));
               }
            } else if(var6 == -10) {
               ;
            }

            if(u.q(var2)) {
               this.a((String)"", -95);
               this.v = true;
            }

            if(this.b.a.g(var2)) {
               break;
            }

            var2 = var2.g;
         }

      }
   }

   protected void m(q var1, boolean var2) {
      q var3 = var1.h;
      this.n(var1, var2);
      if(this.A && (!this.b.a.l(var3) || this.b.getBoolean(s("z\u007fA\r3{PL\u001e&ZuN+(swH\u00063m")))) {
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{PL\u001e&ZuN+(swH\u00063m")));
         q var4 = this.z;
         this.f(this.m);
         this.i(this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5T{[\t\u0003qyn\u0007*s\u007fC\u001c4")));
         String var5 = this.m.a();
         if(this.v) {
            this.b.addMessage(new Message(this.b.getLanguage(), s("]hH\t3{~\r\"&h{i\u0007$>yB\u0005*{tYH!qh\r") + var5, 4, var4.g));
         }

         if(this.b.getBoolean(s("m\u007f]\t5\u007fnH+/ktF\u001b\u0005gYB\u0005*{tY\u001b"))) {
            this.p();
         }
      }

      this.m = null;
      this.A = false;
   }

   protected void n(q var1, boolean var2) {
      q var3 = var1.h;
      boolean var4 = !this.R;
      int var5 = 0;
      int var6 = 0;
      int var7 = -1;
      boolean var9 = var1.a == 4001;
      boolean var10 = this.b.a.j(var1);
      if(var3 != null) {
         q var8 = u.H(var3);
         var8 = u.d(var8, this.b);
         boolean var19 = false;
         boolean var20 = false;
         boolean var21 = false;
         int var23 = 0;

         boolean var18;
         for(boolean var24 = false; var8 != null; var19 = var18) {
            q var25 = u.h(var8);
            int var22 = this.b.a.k(var8);
            boolean var12 = true;
            boolean var13 = true;
            var18 = u.n(var8);
            int var28;
            q var30;
            q var31;
            int var38;
            boolean var39;
            int var40;
            q var41;
            if(var22 == -20) {
               var41 = this.z;
               var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{SK,.l\u007fN\u001c.h\u007f^"));
               var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5W|i\u00015{yY\u00011{i"));
               this.i(var13?var6:0);
               this.i(var12?var38:0);
               var23 = var22;
               var39 = false;
               var30 = var8;
               var24 = false;

               do {
                  var8 = var30;
                  this.a(var30, var4, var24);
                  var30 = u.h(var30);
                  var40 = this.b.a.k(var30);
               } while(var40 == -23);

               var25 = u.h(var8);
               this.i(var13?var28:0);
               var6 = 0;
               var31 = this.z;
               ++this.s;
               this.r.a((jindent.formatter.d.a.a)(new jindent.formatter.d.a.d(this.s, var41, var31)));
            } else if(var22 == -21) {
               var41 = this.z;
               if(!var24 && this.b.getPreProcessorIndentationIndex(s("wtI\r)jJ_\r7luN\r4mu_,.l\u007fN\u001c.h\u007f^")) == 1) {
                  this.W -= this.b.getNumber(s("wtI\r)jID\u0012\""));
               }

               var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{_A\u001b\"Zs_\r$js[\r4"));
               var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5[v^\r\u0003whH\u000b3wlH\u001b"));
               this.i(var13?var6:0);
               this.i(var12?var38:0);
               var23 = var22;
               var39 = false;
               var30 = var8;

               do {
                  this.a(var30, var4, var24);
                  var30 = u.h(var30);
                  var40 = this.b.a.k(var30);
               } while(var40 == -24);

               this.i(var13?var28:0);
               var6 = 0;
               if(!var24 && this.b.getPreProcessorIndentationIndex(s("wtI\r)jJ_\r7luN\r4mu_,.l\u007fN\u001c.h\u007f^")) == 1) {
                  this.W += this.b.getNumber(s("wtI\r)jID\u0012\""));
               }

               var31 = this.z;
               this.r.a((jindent.formatter.d.a.a)(new jindent.formatter.d.a.b(this.s, this.V, var41, var31)));
            } else if(var22 == -22) {
               var41 = this.z;
               var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{_C\f.x^D\u001a\"}nD\u001e\"m"));
               var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5[tI\u0001!Zs_\r$js[\r4"));
               this.i(var13?var6:0);
               this.i(var12?var38:0);
               var23 = var22;
               var39 = false;
               var30 = var8;
               var24 = false;

               do {
                  this.a(var30, var4, var24);
                  var30 = u.h(var30);
                  var40 = this.b.a.k(var30);
               } while(var40 == -25);

               var6 = var13?var28:0;
               var31 = this.z;
               this.r.a((jindent.formatter.d.a.a)(new c(this.s, var41, var31)));
               --this.s;
            } else {
               q var29;
               if(var22 == -26) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{SC\u000b+k~H,.l\u007fN\u001c.h\u007f^"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5WtN\u00042z\u007fi\u00015{yY\u00011{i"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else if(var22 == -27) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{J_\t s{i\u00015{yY\u00011{i"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5NhL\u000f*\u007f^D\u001a\"}nD\u001e\"m"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else if(var22 == -28) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{ML\u001a)wtJ-5lu_,.l\u007fN\u001c.h\u007f^"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5I{_\u0006.p}h\u001a5qhi\u00015{yY\u00011{i"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else if(var22 == -29) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^H\u000e.p\u007fi\u00015{yY\u00011{i"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5Z\u007fK\u0001){^D\u001a\"}nD\u001e\"m"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else if(var22 == -30) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{VD\u0006\"Zs_\r$js[\r4"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5RsC\r\u0003whH\u000b3wlH\u001b"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else if(var22 == -31) {
                  var41 = this.z;
                  var38 = this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{UY\u0000\"l^D\u001a\"}nD\u001e\"m"));
                  var28 = this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5QnE\r5Zs_\r$js[\r4"));
                  if(this.a(var22, var23)) {
                     this.i(var13?var6:0);
                     this.i(var12?var38:0);
                     var23 = var22;
                  }

                  this.a(var8, var4, var24);
                  var6 = var13?var28:0;
                  var29 = this.z;
                  this.r.a(new jindent.formatter.d.a.a(this.s, var41, var29));
               } else {
                  q var37;
                  if(var22 == -32) {
                     var41 = this.z;
                     this.a(var8, var4, var24);
                     var37 = this.z;
                     this.r.a(new jindent.formatter.d.a.a(this.s, var41, var37));
                  } else {
                     boolean var14 = p.b(var8.f, this.b.getString(s("zuc\u00073Xu_\u0005&jYB\u0005*{tY\u001b\u0004qtY\t.psC\u000f\f{c^")));
                     boolean var15 = true;
                     boolean var16 = false;
                     boolean var17 = false;
                     int var26;
                     if(u.p(var8)) {
                        this.r();
                        var26 = jindent.formatter.a.d.a(var8.f);
                        this.a("", -96, var26);
                        this.v = false;
                     }

                     boolean var11 = var8.c == 1 && var22 != -10 && var22 != -8 && this.b.getBoolean(s("p\u007f[\r5WtI\r)j[C\f\u0001qh@\t3Xs_\u001b3]uA\u001d*pYB\u0005*{tY\u001b")) && !var9 && !var10;
                     if(u.r(var8)) {
                        this.A = false;
                        this.B = false;
                        var14 = false;
                        this.m = null;
                        this.n = null;
                     } else if(var18) {
                        var14 = false;
                        var12 = false;
                        var13 = false;
                        var15 = false;
                        var16 = true;
                        var17 = false;
                        if(!var19) {
                           this.i(var6);
                           this.i(this.b.c.getNumber(SettingsUtils.createSettingKey(this.b.i, s("|vL\u0006,RsC\r4\\\u007fK\u00075{\\D\u00043{hH\f\u0004q~H"))));
                        }

                        var11 = false;
                        var9 = false;
                        this.h(var8);
                     } else if(var9) {
                        var14 = this.b.getBoolean(s("xu_\u0005&jRH\t#{h"));
                        var12 = false;
                        var13 = false;
                        var15 = false;
                        var16 = var21 && !this.b.getBoolean(s("xu_\u0005&jRH\t#{h"));
                        var17 = this.b.getBoolean(s("xu_\u0005&jRH\t#{h"));
                     } else if(var10) {
                        var14 = this.b.getBoolean(s("xu_\u0005&j\\B\u00073{h"));
                        var12 = false;
                        var13 = false;
                        var15 = false;
                        var16 = var21 && !this.b.getBoolean(s("xu_\u0005&j\\B\u00073{h"));
                        var17 = this.b.getBoolean(s("xu_\u0005&j\\B\u00073{h"));
                     } else if(var11) {
                        var5 = this.V;
                        this.V = 0;
                        this.d = 0;
                        this.S = true;
                        var14 = false;
                        var15 = !this.b.getBoolean(s("p\u007f[\r5Z\u007fA\r3{\\D\u001a4jYB\u00042stn\u0007*s\u007fC\u001c4"));
                        var17 = false;
                     }

                     boolean var33;
                     if(var22 != -1 && var22 != -5) {
                        if(var22 != -12 && var22 != -16) {
                           byte var32;
                           if(var22 != -4 && var22 != -2) {
                              if(var22 != -15 && var22 != -13) {
                                 boolean var35;
                                 if(var22 != -7 && var22 != -6) {
                                    if(var22 != -18 && var22 != -17) {
                                       boolean var10000;
                                       if(var22 == -3) {
                                          if(!var12 || this.X && (!this.X || this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")))) {
                                             var10000 = false;
                                          } else {
                                             var10000 = true;
                                          }

                                          if(this.b.getBoolean(s("z\u007fA\r3{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")) && var15) {
                                             if(this.v) {
                                                this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\u001b.p}A\rgrsC\rg}u@\u0005\"pn"), 3, this.z));
                                             }
                                          } else {
                                             this.q();
                                             this.i(var8, var14 && this.b.getBoolean(s("xu_\u0005&jID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")));
                                          }
                                       } else if(var22 == -14) {
                                          if(!var12 || this.X && (!this.X || this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")))) {
                                             var10000 = false;
                                          } else {
                                             var10000 = true;
                                          }

                                          if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var15) {
                                             if(this.v) {
                                                this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                                             }
                                          } else {
                                             this.q();
                                             this.i(var8, var14 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")));
                                          }
                                       } else if(var22 == -8) {
                                          if(this.b.getBoolean(s("z\u007fA\r3{PL\u001e&ZuN+(swH\u00063m")) && var15) {
                                             if(this.v) {
                                                this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\"&h{i\u0007$>yB\u0005*{tY"), 4, this.z));
                                             }
                                          } else {
                                             var21 = true;
                                             this.i(var13?var6:0);
                                             this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{PL\u001e&ZuN+(swH\u00063m")):0);
                                             var33 = var14 && this.b.getBoolean(s("xu_\u0005&jPL\u001e&ZuN+(swH\u00063m")) || var17;
                                             this.o(var8, var33);
                                             this.i(var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5T{[\t\u0003qyn\u0007*s\u007fC\u001c4")):0);
                                             var6 = 0;
                                          }
                                       } else if(var22 == -19) {
                                          if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var15) {
                                             if(this.v) {
                                                this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                                             }
                                          } else {
                                             var21 = true;
                                             this.i(var13?var6:0);
                                             this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^B\u0010>y\u007fC+(swH\u00063m")):0);
                                             var33 = var14 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")) || var17;
                                             this.o(var8, var33);
                                             this.i(var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5ZuU\u0011 {tn\u0007*s\u007fC\u001c4")):0);
                                             var6 = 0;
                                          }
                                       } else if(var22 == -10) {
                                          var26 = 0;
                                          var37 = u.i(var8);
                                          if(var8.h != null && this.b.a.g(var37)) {
                                             ++var26;
                                          }

                                          while((var25 = u.h(var8)) != null && this.b.a.h(var25)) {
                                             ++var26;
                                             var8 = var25;
                                          }

                                          if(this.R) {
                                             if(var26 > 0) {
                                                var20 = true;
                                             }

                                             if(var26 > this.b.getNumber(s("u\u007fH\u0018\u0005r{C\u0003\u000bwtH\u001b")) && !var16) {
                                                var26 = this.b.getNumber(s("u\u007fH\u0018\u0005r{C\u0003\u000bwtH\u001b"));
                                             }

                                             if(!var21 && !var16 && var2) {
                                                if(var26 > 1) {
                                                   var26 = 1;
                                                }

                                                if(var25 == null) {
                                                   var26 = 0;
                                                } else if(this.b.a.k(var25) == -8 || this.b.a.k(var25) == -19) {
                                                   var26 = 0;
                                                }
                                             }

                                             this.i(var26);
                                          }
                                       }
                                    } else {
                                       var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                                       if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var15) {
                                          if(this.v) {
                                             this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                                          }
                                       } else {
                                          var21 = true;
                                          var33 = this.a(var22, var23);
                                          if(var33) {
                                             this.i(var13?var6:0);
                                             this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^B\u0010>y\u007fC+(swH\u00063m")):0);
                                             var23 = var22;
                                          }

                                          var35 = var14 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")) || var17;
                                          this.l(var8, var35);
                                          var6 = var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5ZuU\u0011 {tn\u0007*s\u007fC\u001c4")):0;
                                       }
                                    }
                                 } else {
                                    var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                                    if(this.b.getBoolean(s("z\u007fA\r3{_C\f\bxVD\u0006\"]u@\u0005\"pn^")) && var15) {
                                       if(this.v) {
                                          this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\u001b.p}A\rg{tIH(x:A\u0001){:N\u0007*s\u007fC\u001c"), 3, this.z));
                                       }
                                    } else {
                                       var21 = true;
                                       var33 = this.a(var22, var23);
                                       if(var33) {
                                          this.i(var13?var6:0);
                                          this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{_C\f\bxVD\u0006\"]u@\u0005\"pn^")):0);
                                          var23 = var22;
                                       }

                                       if(var11 && this.b.getBoolean(s("wtI\r)jYB\u00063{tY\'!Xs_\u001b3]uA\u001d*pYB\u0005*{tY\u001b"))) {
                                          if(var33 || var7 == -1) {
                                             var7 = jindent.formatter.e.c.c(var8.f);
                                          }

                                          jindent.formatter.e.c var36;
                                          if(var7 != -1) {
                                             var36 = jindent.formatter.e.c.a(var8.f, var5, var7);
                                             this.a((jindent.formatter.e.b)var36);
                                          } else {
                                             var36 = new jindent.formatter.e.c(var8.f);
                                             this.a((jindent.formatter.e.b)var36);
                                          }
                                       } else {
                                          var35 = var14 && this.b.getBoolean(s("xu_\u0005&j_C\f\bxVD\u0006\"]u@\u0005\"pn^")) || var17;
                                          this.l(var8, var35);
                                       }

                                       var6 = var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5[tI\'!RsC\r\u0004qw@\r)ji")):0;
                                    }
                                 }
                              } else {
                                 var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                                 var32 = -13;
                                 if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var15) {
                                    if(this.v) {
                                       this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                                    }
                                 } else {
                                    var21 = true;
                                    if(this.a(var32, var23)) {
                                       this.i(var13?var6:0);
                                       this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^B\u0010>y\u007fC+(swH\u00063m")):0);
                                       var23 = var32;
                                    }

                                    var33 = var14 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")) || var17;
                                    this.h(var8, var33);
                                    var6 = var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5ZuU\u0011 {tn\u0007*s\u007fC\u001c4")):0;
                                 }
                              }
                           } else {
                              var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                              var32 = -2;
                              if(this.b.getBoolean(s("z\u007fA\r3{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")) && var15) {
                                 if(this.v) {
                                    this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\u001b.p}A\rgrsC\rg}u@\u0005\"pn"), 3, this.z));
                                 }
                              } else {
                                 var21 = true;
                                 if(this.a(var32, var23)) {
                                    this.i(var13?var6:0);
                                    this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{ID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")):0);
                                    var23 = var32;
                                 }

                                 var33 = var14 && this.b.getBoolean(s("xu_\u0005&jID\u0006 r\u007fa\u0001){YB\u0005*{tY\u001b")) || var17;
                                 this.h(var8, var33);
                                 var6 = var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5MsC\u000f+{VD\u0006\"]u@\u0005\"pn^")):0;
                              }
                           }
                        } else {
                           var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                           if(this.b.getBoolean(s("z\u007fA\r3{^B\u0010>y\u007fC+(swH\u00063m")) && var15) {
                              if(this.v) {
                                 this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r,(fcJ\r)>yB\u0005*{tY"), 4, this.z));
                              }
                           } else {
                              var21 = true;
                              if(var22 != var23) {
                                 var23 = var22;
                              }

                              this.i(var13?var6:0);
                              this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{^B\u0010>y\u007fC+(swH\u00063m")):0);
                              var33 = var14 && this.b.getBoolean(s("xu_\u0005&j^B\u0010>y\u007fC+(swH\u00063m")) || var17;
                              this.f(var8, var33);
                              this.i(var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5ZuU\u0011 {tn\u0007*s\u007fC\u001c4")):0);
                              var6 = 0;
                           }
                        }
                     } else {
                        var12 = var12 && (!this.X || this.X && !this.b.getBoolean(s("zuc\u00073Wt^\r5jXA\t)uVD\u0006\"mXH\u000e(l\u007fk\u00015mna\u0001){YB\u0005*{tY\u001b")));
                        if(this.b.getBoolean(s("z\u007fA\r3{XA\u0007$uYB\u0005*{tY\u001b")) && var15) {
                           if(this.v) {
                              this.b.addMessage(new Message(this.b.getLanguage(), s("Z\u007fA\r3{~\r\n+qyFH$qw@\r)j"), 3, this.z));
                           }
                        } else {
                           var21 = true;
                           if(var22 != var23) {
                              var23 = var22;
                           }

                           this.i(var13?var6:0);
                           this.i(var12?this.b.getNumber(s("|vL\u0006,RsC\r4\\\u007fK\u00075{XA\u0007$uYB\u0005*{tY\u001b")):0);
                           if(var11 && this.b.getBoolean(s("wtI\r)jYB\u00063{tY\'!Xs_\u001b3]uA\u001d*pYB\u0005*{tY\u001b"))) {
                              jindent.formatter.e.e var34 = new jindent.formatter.e.e(var8.f);
                              jindent.formatter.e.e var27 = var34.b(var5);
                              this.a((jindent.formatter.e.d)var27);
                           } else {
                              var33 = var14 && this.b.getBoolean(s("xu_\u0005&jXA\u0007$uYB\u0005*{tY\u001b")) || var17;
                              this.f(var8, var33);
                           }

                           this.i(var13?this.b.getNumber(s("|vL\u0006,RsC\r4_|Y\r5\\vB\u000b,]u@\u0005\"pn^")):0);
                           var6 = 0;
                        }
                     }

                     if(!var18 && var11) {
                        this.V = var5;
                        this.d = 0;
                        this.S = false;
                     }

                     if(u.q(var8)) {
                        this.r();
                        this.a((String)"", -95);
                        this.v = true;
                     }

                     if(var18) {
                        var6 = this.b.c.getNumber(SettingsUtils.createSettingKey(this.b.i, s("|vL\u0006,RsC\r4_|Y\r5XsA\u001c\"l\u007fI+(z\u007f")));
                     }
                  }
               }
            }

            var8 = var25;
         }

         this.i(var6);
      }
   }

   private boolean a(int var1, int var2) {
      return this.b(var1) && this.b(var2)?false:var1 != var2;
   }

   private boolean b(int var1) {
      return var1 == -12 || var1 == -16 || var1 == -18 || var1 == -19 || var1 == -17 || var1 == -13 || var1 == -15 || var1 == -14;
   }

   protected void a(q var1, boolean var2, boolean var3) {
      this.r();
      int var4 = var1.c;
      boolean var5 = this.b.getPreProcessorIndentationIndex(s("wtI\r)jJ_\r7luN\r4mu_,.l\u007fN\u001c.h\u007f^")) == 0;
      d var6 = new d(var1.f);
      int var7 = this.V;
      int var8 = var6.a();

      for(int var9 = 1; var9 <= var8; ++var9) {
         String var10 = var6.b();
         if(var5) {
            this.V = 0;
            this.d = 0;
            this.S = true;
         } else {
            int var11 = this.W;
            this.V = var11;
            this.d = var11;
            this.S = true;
         }

         if(var9 == 1) {
            var10 = var10.trim();
         }

         this.i(var10);
      }

      this.V = var7;
      if(var2) {
         this.d += this.L;
      }

   }

   public void i(String var1) {
      if(!var1.equals("") && !var1.equals("\n")) {
         this.d(var1);
         this.r();
      } else {
         this.u();
      }

   }

   protected void h(q var1) {
      String var2 = var1.f;
      int var3 = var2.indexOf("[siw:");
      int var4;
      String var5;
      if(var3 != -1) {
         var4 = var2.indexOf("]", var3);
         var5 = var2.substring(var3 + "[siw:".length(), var4);
         this.V = Integer.parseInt(var5);
      }

      var3 = var2.indexOf("[giw:");
      if(var3 != -1) {
         var4 = var2.indexOf("]", var3);
         var5 = var2.substring(0, var3 + "[giw:".length()) + this.V + var2.substring(var4, var2.length());
         var1.f = var5;
      }

   }

   protected void a(q var1, int var2, int var3, jindent.formatter.d.j var4) {
      String var5 = jindent.formatter.d.l.a(var2, var3);
      jindent.formatter.d.l var6 = (jindent.formatter.d.l)this.p.get(var5);
      if(var6 == null) {
         var6 = new jindent.formatter.d.l(var2, var3);
         this.p.put(var5, var6);
         this.q.d(var6);
      }

      var6.a(var1, var4);
   }

   protected void a(int var1, boolean var2, boolean var3) {
      int var4 = this.q.c();

      for(int var6 = 0; var6 < var4; ++var6) {
         jindent.formatter.d.l var5 = (jindent.formatter.d.l)this.q.d(var6);
         if(var5.a() == var1) {
            var5.b(this.b, var2, var3);
         }
      }

   }

   protected int i(q var1) {
      if(var1 == null) {
         return 0;
      } else {
         for(q var2 = var1.g; var2 != null; var2 = var2.g) {
            if(var2.a == -10 && var2.l != 26) {
               return var2.l;
            }
         }

         return 0;
      }
   }

   protected abstract void h();

   protected abstract void i();

   protected abstract boolean a(int var1, q var2);

   public abstract void a(t var1);

   protected abstract String[] j();

   protected void k() {
      q var1 = this.y;
      q var2 = this.y;

      for(this.v = true; var2 != null; var2 = var2.g) {
         switch(var2.a) {
         case -94:
            jindent.formatter.d.m var11 = (jindent.formatter.d.m)var2;
            var11.l();
            break;
         case -60:
            q var3 = u.j(var2);
            if(var3 != null && u.c(var2, var3, -25)) {
               var2.a = -100;
            } else {
               q var4 = u.b(var2, var3, -94);
               if(var4 != null) {
                  ((jindent.formatter.d.m)var4).G = 3;
               } else {
                  q var5 = null;
                  int var6 = Integer.MAX_VALUE;
                  int var7 = this.j(var1);
                  if(var3 != null) {
                     for(q var8 = var2.g; var8 != var3; var8 = var8.g) {
                        if((var8.a == -18 || var8.a == -19) && var8.p <= var6) {
                           var5 = var8;
                           var6 = var8.p;
                        }
                     }

                     int var9;
                     int var10;
                     if(var5 == null) {
                        var10 = var1.r;
                        var9 = var10 + this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn"));
                        var5 = var2.g;
                     } else {
                        var9 = this.a(var1, (q)null, var5);
                     }

                     if(var9 < 0) {
                        var9 = var7;
                     } else {
                        var9 = this.a(var1, var1, (q)null, var5, var9, true, this.b.getAbsoluteRelativeIndex(s("z\u007fH\u0018\u000ep~H\u00063")), this.b.getNumber(s("z\u007fH\u0018\u000ep~H\u00063")));
                        if(var3.f.equals("{") || var3.f.equals("}")) {
                           var9 = var7;
                        }
                     }

                     var10 = var9 - var5.c;
                     u.d(var2.g, var10);
                     this.b.a.a(this.b);
                  }

                  var2.a = -25;
                  var1 = var2.g;
               }
            }
            break;
         case -25:
            var1 = var2.g;
         }
      }

   }

   protected abstract void l();

   protected int c(int var1) {
      int var2 = this.b.getNumber(s("s{U$.p\u007fa\r)ynE")) - var1;
      if(var2 >= 0) {
         var2 = -1;
      } else {
         var2 = -var2;
      }

      return var2;
   }

   protected int j(q var1) {
      q var2;
      for(var2 = var1; var2 != null && var2.a < 0; var2 = var2.g) {
         if(var2.a == -102) {
            return ((q)var2.m).c;
         }
      }

      if(var2 == null) {
         var2 = var1;
      }

      return var2.c;
   }

   protected int a(q var1, q var2) {
      q var3 = var2;
      if(this.b.getBoolean(s("ihL\u0018\u0005{yL\u001d4{UK+(swH\u00063m"))) {
         while(var3 != var1 && var3.a < 0 && var3.a != -28) {
            var3 = var3.k;
         }
      } else {
         while(var3 != var1 && var3.a < 0) {
            var3 = var3.k;
         }
      }

      return var3.e;
   }

   protected int a(q var1, q var2, q var3) {
      byte var5 = -1;
      if(var3.a == -19) {
         return var1.a == -19 && var1.l == var3.l && var1.p == var3.p?(var2 == null?this.j(var1):this.j(var2)):(var2 == null?(var3.h == null?this.j(var1) + ((Integer)var3.m).intValue():var3.h.c + ((Integer)var3.m).intValue()):this.j(var2) + ((Integer)var3.m).intValue());
      } else {
         q var4;
         int var7;
         for(var4 = var1; var4 != var3; var4 = var4.g) {
            if(var5 < 0 && var4.a == -17 && var4.l == var3.l && var4.p == var3.p) {
               var7 = this.j(var4);
               return var7;
            }
         }

         for(var4 = var1; var4 != var3; var4 = var4.g) {
            if(var5 < 0 && (var4.a == -18 || var4.a == -19) && var4.l == var3.l && var4.p == var3.p) {
               var7 = this.j(var4);
               return var7;
            }
         }

         return var5;
      }
   }

   protected int a(q var1, q var2, q var3, q var4, int var5, boolean var6, int var7, int var8) {
      int var9 = this.j(var2);
      int var10 = var2.r;
      int var11 = var5;
      if(var6 && var2 == var1 && u.a(this.b, var5 - var10, var4.n)) {
         var11 = var10 + this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn"));
      }

      boolean var12 = var7 == 0?var11 - var10 > var8:var11 > var8;
      if(var12) {
         if(var4.n != 13 && var4.n != 36) {
            if(var2 == var1) {
               var11 = var10 + this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn"));
            } else {
               var11 = var9 + this.b.getNumber(s("wtI\r)jID\u0012\""));
            }
         } else {
            int var13;
            if(var3 != null) {
               var13 = this.j(var3) + this.b.getNumber(s("wtI\r)jID\u0012\""));
            } else {
               var13 = this.j(var2) + this.b.getNumber(s("wtI\r)jID\u0012\""));
            }

            if(var13 < var5) {
               var11 = var13;
            }
         }
      }

      if(var4.k != null && var4.k.e <= var11 && var10 < var9) {
         var11 = var9;
      }

      if((var4.a != -19 || var4.h == null) && var11 < var9) {
         var11 = var9;
      }

      return var11;
   }

   protected boolean a(q var1, q var2, q var3, q var4, int var5, int var6) {
      int var7 = this.a(var2, var3, var4);
      var7 = this.a(var1, var2, var3, var4, var7, true, var5, var6);
      int var8 = var4.c - var7;
      return var8 > 3;
   }

   protected int a(int var1, q var2, q var3, q var4, int var5, int var6, int var7) {
      int var8 = this.a(var3, var4);
      if(var8 > var1 && u.b(var3, var4) > 1) {
         q var9 = null;
         q var10 = null;
         q var11 = null;
         q var12 = null;
         q var13 = var3.g;

         while(var13 != var4 && var13.c <= var1 + 128) {
            if((var13.a == -18 || var13.a == -19) && (var13.l & var5) > 0 && (var12 == null || var13.p < var12.p || var13.p == var12.p && var13.l >= var12.l) && this.a(var2, var3, var10, var13, var6, var7)) {
               if(var13.l == 0 && var12 != null) {
                  break;
               }

               if(this.a(var3, var10, var13) != -1) {
                  var12 = var13;
                  var9 = var10;
               }
            }

            if(var10 == null && var13.a == -97) {
               var10 = var13;
            }

            var13 = var13.g;
            if(var13.c > var1 && var12 != null) {
               break;
            }
         }

         if(var12 == null) {
            var12 = var4;
         }

         int var14 = this.a(var2, var9, var12);
         var9 = null;
         var10 = null;
         var13 = var3.g;
         int var15 = Integer.MAX_VALUE;

         for(int var16 = Integer.MAX_VALUE; var13 != var4; var13 = var13.g) {
            if((var13.a == -18 || var13.a == -19) && (var13.l & var5) > 0 && (var13.p < var16 || var13.p == var16 && var13.l >= var11.l) && this.c(var13.c) <= var15 && this.a(var2, var10, var13) == var14 && this.a(var2, var3, var10, var13, var6, var7)) {
               var11 = var13;
               var15 = this.c(var13.c);
               var16 = var13.p;
               var9 = var10;
               if(var15 >= 0) {
                  break;
               }
            }

            if(var10 == null && var13.a == -97) {
               var10 = var13;
            }
         }

         if(var11 == null) {
            var11 = var4;
         }

         var14 = this.a(var3, var9, var11);
         if(var14 < 0) {
            return var8;
         } else {
            var14 = this.a(var2, var3, var9, var11, var14, true, var6, var7);
            q var17 = u.j(var11);
            if(!u.c(var11, var17, -25)) {
               u.c(var11);
            }

            int var18 = var11.k.e;
            int var19 = var14 - var11.c;
            u.d(var11, var4, var19);
            this.b.a.a(this.b);
            if(var11 != null && var11 != var4) {
               int var20 = this.a(var1, var2, var11, var4, var5, var6, var7);
               if(var20 > var18) {
                  var18 = var20;
               }
            }

            return var18;
         }
      } else {
         return var8;
      }
   }

   protected int b(int var1, q var2, q var3, q var4, int var5, int var6, int var7) {
      int var8 = this.a(var3, var4);
      if(var8 > var1 && u.b(var3, var4) > 1) {
         int var9 = var2 == var3?this.j(var2) + this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn")):this.j(var3);
         q var10 = null;
         q var11 = null;
         q var12 = var3.g;

         while(var12 != var4 && var12.c <= var1 + 128) {
            if((var12.a == -18 || var12.a == -19) && (var12.l & var5) > 0) {
               if(var12.l == 0 && var11 != null) {
                  break;
               }

               if(var9 < var12.k.e) {
                  var11 = var12;
               }
            }

            if(var10 == null && var12.a == -97) {
               var10 = var12;
            }

            var12 = var12.g;
            if(var12.c > var1 && var11 != null) {
               break;
            }
         }

         if(var11 == null) {
            var11 = var4;
         }

         q var13 = u.j(var11);
         if(!u.c(var11, var13, -25)) {
            u.c(var11);
         }

         int var14 = var11.k.e;
         int var15 = var9 - var11.c;
         u.d(var11, var4, var15);
         this.b.a.a(this.b);
         if(var11 != null && var11 != var4) {
            int var16 = this.b(var1, var2, var11, var4, var5, var6, var7);
            if(var16 > var14) {
               var14 = var16;
            }
         }

         return var14;
      } else {
         return var8;
      }
   }

   protected void m() {
      int var1 = this.b.getLineWrappingPolicyIndex(s("rsC\r\u0010l{]\u0018.p}}\u0007+wyT"));
      int var2 = this.b.getNumber(s("s{U$.p\u007fa\r)ynE"));
      this.v = true;
      this.b.e.a(this.b);
      q var3 = this.y;
      q var4 = this.y;
      q var5 = null;
      int[] var6 = this.b.e.a();
      int var7 = this.b.e.b();
      int[] var8 = new int[100];
      int var9 = 0;
      int var10 = var6.length;
      int var11;
      int var12;
      int var14;
      int var15;
      if(var1 == 0) {
         for(var11 = 0; var11 < var10; ++var11) {
            var12 = var6[var11] & var7;
            boolean var13 = false;

            for(var14 = 0; var14 < var9 && !var13; ++var14) {
               var15 = var8[var14] & var7;
               var13 = var12 == var15;
            }

            if(!var13) {
               var8[var9] = var12;
               ++var9;
            }
         }
      } else if(var1 == 1) {
         var9 = 1;
         var8[0] = 0;

         for(var11 = 0; var11 < var10; ++var11) {
            var8[0] |= var6[var11] & var7;
         }
      }

      var11 = 0;

      for(var12 = 0; var3 != null; var3 = var3.g) {
         if(var3.a == -95) {
            this.v = true;
         } else if(var3.a == -96) {
            this.v = false;
         }

         ++var12;
         if(var3.a >= 0) {
            ++var11;
         }

         var3.q = var11;
         if(var3.a == -25) {
            var5 = var3;
            if(this.v) {
               int var19 = var8[0];
               var14 = Integer.MAX_VALUE;
               var15 = this.b.getNumber(s("z\u007fH\u0018\u000ep~H\u00063"));
               int var16 = this.b.getAbsoluteRelativeIndex(s("z\u007fH\u0018\u000ep~H\u00063"));
               int var17 = 0;
               this.f = u.a(var4, var3, this.f, var12);

               int var18;
               for(var18 = 0; var18 < var9; ++var18) {
                  if(var1 == 0) {
                     var17 = this.a(var2, var4, var4, var5, var8[var18], this.b.getAbsoluteRelativeIndex(s("z\u007fH\u0018\u000ep~H\u00063")), this.b.getNumber(s("z\u007fH\u0018\u000ep~H\u00063")));
                  } else if(var1 == 1) {
                     var17 = this.b(var2, var4, var4, var5, var8[var18], this.b.getAbsoluteRelativeIndex(s("z\u007fH\u0018\u000ep~H\u00063")), this.b.getNumber(s("z\u007fH\u0018\u000ep~H\u00063")));
                  }

                  if(var17 < var14) {
                     var14 = var17;
                     var19 = var8[var18];
                     var16 = this.b.getAbsoluteRelativeIndex(s("z\u007fH\u0018\u000ep~H\u00063"));
                     var15 = this.b.getNumber(s("z\u007fH\u0018\u000ep~H\u00063"));
                  }

                  if(var17 <= var2) {
                     break;
                  }

                  u.a(this.f, var12);
               }

               if(var17 > var2) {
                  for(var18 = 0; var18 < var9; ++var18) {
                     if(var1 == 0) {
                        var17 = this.a(var2, var4, var4, var5, var8[var18], 0, this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn")));
                     } else if(var1 == 1) {
                        var17 = this.b(var2, var4, var4, var5, var8[var18], 0, this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn")));
                     }

                     if(var17 < var14) {
                        var14 = var17;
                        var19 = var8[var18];
                        var16 = 0;
                        var15 = this.b.getNumber(s("\u007fvY\r5p{Y\u00011{SC\f\"pn"));
                     }

                     if(var17 <= var2) {
                        break;
                     }

                     u.a(this.f, var12);
                  }
               }

               if(var17 > var2) {
                  if(var1 == 0) {
                     this.a(var2, var4, var4, var5, var19, var16, var15);
                  } else if(var1 == 1) {
                     this.b(var2, var4, var4, var5, var19, var16, var15);
                  }
               }
            }

            var12 = 0;
            var4 = var3.g;
         }
      }

   }

   protected void n() {
      this.k();
      if(this.b.getBoolean(s("ihL\u0018\u000bwtH\u001b"))) {
         this.m();
      }

      this.l();
   }

   protected void a(Writer var1, String var2) throws IOException {
      var1.write(var2 + this.g);
   }

   protected void b(Writer var1, String var2) throws IOException {
      var1.write(var2);
   }

   protected void a(Writer var1, jindent.formatter.a.d var2) throws JindentException {
      int var3 = this.b.getNumber(s("s{U$.p\u007fa\r)ynE"));
      StringBuffer var4 = new StringBuffer();
      Object var5;
      if(this.l != null && this.l instanceof jindent.formatter.c.c) {
         var5 = new StringWriter();
      } else {
         var5 = new BufferedWriter(var1, this.c);
      }

      q var6 = this.y;

      try {
         int var7 = 1;

         for(MyStringBuffer var8 = new MyStringBuffer(); var6 != null; ++var7) {
            int var9 = 0;
            boolean var10 = true;
            var8.c(0);
            boolean var11 = true;
            q var12 = null;

            q var13;
            for(var13 = null; var6 != null && var6.a != -25; var6 = var6.g) {
               if(u.k(var6)) {
                  if(var13 == null) {
                     var13 = var6;
                  }

                  var12 = var6;
               }

               if(var6.f != null && var6.f.length() > 0 || var6.a == -96) {
                  if((!var10 || !this.b.getBoolean(s("wtI\r)jVH\t#wtJ\u001b\u0005gNL\n4"))) && !this.a(var9, var6)) {
                     var8.a(p.a(var9, var6.c));
                  } else {
                     var8.a(p.a(this.b, var9, var6.c));
                  }

                  var8.a(var6.f);
                  if(var6.a != 5004) {
                     var10 = false;
                  }

                  var9 = var6.e;
               }

               if(var6.a == -96) {
                  this.b((Writer)var5, (String)var8.toString());
                  int var14 = var6.l;
                  var7 += this.a((Writer)var5, (jindent.formatter.a.d)var2, var14);
                  var6 = this.k(var6);
                  var9 = 0;
                  var8.c(0);
                  if(var6 == null) {
                     var11 = false;
                     break;
                  }
               }

               var6.b = var7;
               var6.d = var7;
            }

            if(var11) {
               this.a((Writer)var5, (String)var8.toString());
               if(var6 != null && var12 != null && var12.e > var3 && this.b.getBoolean(s("ihL\u0018\u000bwtH\u001b")) && !u.n(var12) && !u.v(var12) && this.v) {
                  this.b.addMessage(new WarningMessage(this.b.getLanguage(), s("I{^H)qn\r\t%r\u007f\r\u001c(>m_\t7>vD\u0006\">{YH$qvX\u0005)>") + this.b.getNumber(s("s{U$.p\u007fa\r)ynE")), 3, var13));
               }

               if(this.k) {
                  var4.append(var8);
                  var4.append("\n");
               }
            }

            if(var6 != null) {
               var6.b = var7;
               var6.d = var7;
               var6 = var6.g;
            }
         }

         if(this.l != null && this.l instanceof jindent.formatter.c.c) {
            String var24 = ((jindent.formatter.c.c)this.l).b(var5.toString());
            if(var24 == null) {
               throw new JindentException(s("XsA\u001c\"l:B\u001d3noYH!lu@H*{nE\u0007#>jB\u001b3nhB\u000b\"mi\r\u00014>tX\u0004+>;"));
            }

            this.b(var1, var24);
         }
      } catch (IOException var22) {
         throw new JindentException(s("[tN\u00072pnH\u001a\"z:H\u001a5qh\r\u0001)>UX\u001c7kn~\u001c5{{@F"));
      } finally {
         try {
            var1.flush();
            ((Writer)var5).flush();
         } catch (IOException var21) {
            ;
         }

      }

      if(this.k) {
         new Monitor(var4.toString(), this.y);
      }

   }

   private q k(q var1) {
      q var2;
      for(var2 = var1; var2 != null && var2.a != -95; var2 = var2.g) {
         ;
      }

      return var2 != null?var2:var2;
   }

   private int a(Writer var1, jindent.formatter.a.d var2, int var3) throws IOException {
      int var4 = 0;
      if(var2.b(var3)) {
         String var5 = var2.c(var3);
         d var6 = new d(var5);
         int var7 = var6.a();

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6.b();
            this.a(var1, var9);
         }

         var4 = var7;
      }

      return var4;
   }

   protected void j(String var1) {
      System.err.print(var1);
   }

   protected void k(String var1) {
      this.j(var1 + "\n");
   }

   protected void o() {
      this.j("\n");
   }

   protected void l(String var1) {
      d var2 = new d(var1);
      int var3 = var2.a();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.k(var2.b());
      }

   }

   protected void m(String var1) {
      this.k(s("\u0014__\u001a(l \r") + var1);
   }

   protected void n(String var1) {
      this.k(s("\u0014JA\r&m\u007f\r\u0006(j\u007f\u0017H") + var1);
   }

   public void o(String var1) {
      this.k(s("\u0014VD\u000b\"piHH\"lhB\u001a}>") + var1);
   }

   public void p(String var1) {
      this.k(var1);
   }

   protected int d(int var1) {
      int var2;
      for(var2 = 1; var1 > 0; ++var2) {
         var1 /= 10;
      }

      return var2;
   }

   protected String b(int var1, int var2) {
      int var3 = this.d(var1);
      int var4 = this.d(var2);
      String var5 = t.emptyString;

      for(int var6 = var3; var6 < var4; ++var6) {
         var5 = var5 + " ";
      }

      return var5;
   }

   private void e(int var1) throws JindentException {
      try {
         SimpleDateFormat var2 = new SimpleDateFormat(s("gcT\u0011\nS~I"));
         Date var3 = new Date();
         String var4 = var2.format(var3);
         int var5 = Integer.valueOf(var4).intValue();
         if(var5 >= var1) {
            throw new Exception();
         }
      } catch (Exception var6) {
         throw new JindentException(s("GuX\u001agjhD\t+>vD\u000b\"piHH,{c\r\r?ns_\r#0"));
      }
   }

   public void a(Reader var1, Writer var2) throws JindentException {
      if(this.b.c == null) {
         throw new JindentException(s("Pu\r\u0002.p~H\u00063>iH\u001c3wtJ\u001bgi\u007f_\rgm\u007fYH%{|B\u001a\"0"));
      } else {
         int var4;
         String var8;
         try {
            if(this.l != null && this.l instanceof jindent.formatter.c.b) {
               char[] var5 = new char[30720];
               MyStringBuffer var6 = new MyStringBuffer();

               while((var4 = ((Reader)var1).read(var5)) != -1) {
                  var6.a(new String(var5, 0, var4));
               }

               jindent.formatter.c.b var7 = (jindent.formatter.c.b)this.l;
               var8 = var7.a(var6.toString());
               if(var8 == null) {
                  throw new JindentException(s("XsA\u001c\"l:B\u001d3noYH!lu@H*{nE\u0007#>j_\r7luN\r4m:D\u001bgpoA\u0004g?"));
               }

               ((Reader)var1).close();
               var1 = new StringReader(var8);
            }
         } catch (IOException var83) {
            this.o();
            throw new JindentException(s("L\u007fL\f.p}\r\u000e5qw\r\u0001)noYH!\u007fsA\r#0"));
         }

         this.e();
         var4 = this.b.getNumber(s("wt]\u001d3J{O\u001d+\u007fnB\u001a\u0014w`H"));

         try {
            this.b.a.a((Reader)var1, this.c, var4, (m)this);
         } catch (Exception var72) {
            throw new JindentException(s("_:@\r*qhTH\"lhB\u001agqyN\u001d5{~\u0003b\u0017r\u007fL\u001b\">hH\t#>uX\u001agX[|H!qh\r\u0000\"rj\r\u00075>o^\rg3xX\u000egqjY\u0001(p:Y\u0007gz\u007fN\u001a\"\u007fiHH.pjX\u001cg|oK\u000e\"l:^\u0001={4"));
         }

         try {
            this.b.a.b();
         } catch (IOException var73) {
            throw new JindentException(s("NhB\n+{w\r\u001f/wvHH!ro^\u0000.p}\r\u0001)noY\u001b3l\u007fL\u0005i\u0014") + (var73.getMessage() != null?var73.getMessage():s("S{T\n\">cB\u001dgp\u007fH\fgju\r\u001d4{:LH#w|K\r5{tYH.pjX\u001cg{tN\u0007#wtJW")));
         }

         int var84;
         try {
            if(k.a()) {
               String[][] var85 = new String[][]{{s("}u@F4kt\u0003\u001b\"}o_\u00013g4L\u001d3v4@\u0007#kvHF\tJIT\u001b3{w"), s("y\u007fY&&s\u007f")}, {s("}u@F4kt\u0003\u001b\"}o_\u00013g4L\u001d3v4@\u0007#kvHF\u0012psU;>mnH\u0005"), s("y\u007fY=4{hC\t*{")}, {s("}u@F4kt\u0003\u001b\"}o_\u00013g4L\u001d3v4@\u0007#kvHF\u0014qvL\u001a.mIT\u001b3{w"), s("y\u007fY=4{hC\t*{")}};
               String var88 = null;

               String var95;
               Class var96;
               for(int var90 = 0; var90 < var85.length && var88 == null; ++var90) {
                  var8 = var85[var90][0];
                  var95 = var85[var90][1];

                  try {
                     var96 = Class.forName(var8);
                     Object var11 = var96.newInstance();
                     Method var12 = var96.getMethod(var95, new Class[0]);
                     var88 = ((String)var12.invoke(var11, new Object[0])).toLowerCase();
                  } catch (Exception var71) {
                     ;
                  }
               }

               if(var88 == null) {
                  var88 = System.getProperty(s("kiH\u001aip{@\r")).toLowerCase();
               }

               new IndexProperties();

               IndexProperties var91;
               try {
                  var91 = k.b();
               } catch (Exception var70) {
                  throw new JindentException(var70.getMessage() + s("\u0014CB\u001d5>vD\u000b\"piHH4}rH\u0005\">s^H$qh_\u001d7j\u007fIFgNvH\t4{:D\u00064j{A\u0004g\u007fvAH+wyH\u00064{:F\r>m:L\u000f&wt\u0003b\u0002lhB\u001ag}uI\rg/)\u0003"));
               }

               int var93 = this.b.l;
               var95 = var91.b(var93 + "," + var88);
               if(var95 == null) {
                  var95 = var91.b(var93 + s("20X\u0006%qoC\fm"));
               }

               if(var95 == null) {
                  throw new JindentException(s("]{C\u0006(j:K\u0001)z:^\u00013{:A\u0001${t^\rgu\u007fTH(l:N\u00075l\u007f^\u0018(p~D\u0006 >vD\u000b\"piHH,{c\r\u000e(l:A\u0007 wt\rJ") + var88 + s("<4\'") + s("NvH\t4{:J\r){hL\u001c\">{\r\u0006\"i:\u000f") + this.b.g + s("<:A\u0001${t^\rgu\u007fTH!qh\r\u0011(kh\r\u000b2lhH\u00063>vB\u000f.p:L\u0006#>sC\u001b3\u007fvAH>qo_H+wyH\u00064{:F\r>>{J\t.p4"));
               }

               var96 = null;

               String var97;
               try {
                  URL var98 = k.a(var95);
                  var97 = k.a(var98);
                  if(var97 == null) {
                     throw new Exception();
                  }
               } catch (Exception var79) {
                  throw new JindentException(s("RsN\r)m\u007f\r\u001b$v\u007f@\rgm\u007fH\u00054>nBH%{:N\u00075lo]\u001ci>YL\u0006)qn\r\u001a\"\u007f~\r\u0004.}\u007fC\u001b\">qH\u0011gxsA\rg<") + var95 + s("<4\r8+{{^\rgl\u007fD\u00064j{A\u0004gguX\u001agrsN\r)m\u007f\r\u0003\"g:L\u000f&wt\u0003b\u0002lhB\u001ag}uI\rg/(\u0003"));
               }

               byte[] var99 = jindent.util.b.c.a(var97);
               int var100 = -1;
               int var13 = var99.length;

               for(int var14 = 0; var14 < var13; ++var14) {
                  if(var99[var14] == 0) {
                     var100 = var14;
                     break;
                  }
               }

               if(var100 == -1) {
                  throw new JindentException();
               }

               StringTokenizer var101 = new StringTokenizer(new String(var99, 0, var100, s("WIbE\u007f&/\u0014Ev")), "|");
               var101.nextToken();
               var101.nextToken();
               String var15 = var101.nextToken();
               String var16 = var101.nextToken();
               byte[] var17 = new byte[var13 - (var100 + 1)];
               System.arraycopy(var99, var100 + 1, var17, 0, var13 - (var100 + 1));
               o var18 = new o(var17, 30, 31, rsaE, rsaN, rsaStartVector);
               byte[] var19 = var18.d();
               if(var19 == null) {
                  throw new JindentException(s("RsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:E\t4>{CH.plL\u0004.z:K\u00075s{YFg[h_\u00075>yB\f\">*\u001cF"));
               }

               String var20 = new String(var19, s("WIbE\u007f&/\u0014Ev"));
               StringTokenizer var21 = new StringTokenizer(var20, "|");
               String var22 = var21.nextToken();
               String var23 = var21.nextToken();
               String var24 = var21.nextToken();
               String var25 = var21.nextToken();
               String var26 = var21.nextToken();
               String var27 = var21.nextToken();
               String var28 = var21.nextToken();
               String var29 = var21.nextToken();
               String var30 = var21.nextToken();
               String var31 = var21.nextToken();
               StringTokenizer var32 = new StringTokenizer(var31, ",");
               int var33 = var32.countTokens();
               String[] var34 = new String[var33];

               for(int var35 = 0; var35 < var33; ++var35) {
                  var34[var35] = var32.nextToken().trim().toLowerCase();
               }

               String var102 = var21.nextToken();
               jindent.debugger.a.b(s("H{A\u0001#\u007fnD\u0006 >vD\u000b\"piHH&}yB\u001d)j:Z\u00013v:A\u0001#$:\u000f") + var102 + s("<;"));
               String[] var36 = new String[]{s("/+")};

               int var37;
               for(var37 = 0; var37 < var36.length; ++var37) {
                  if(var102.equals(var36[var37])) {
                     jindent.debugger.a.b(s("XuX\u0006#>xA\t$uvD\u001b3{~\r\u0004.z;"));
                     throw new JindentException(s("RsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:D\u001bg|vL\u000b,rs^\u001c\"z;\r-5lu_H$q~HHv*4"));
                  }
               }

               var37 = Integer.parseInt(var21.nextToken());
               int var38 = Integer.parseInt(var21.nextToken());
               int var39 = Integer.parseInt(var21.nextToken());
               int var40 = Integer.parseInt(var21.nextToken());
               String var41 = var21.nextToken();
               if(!var41.equals("") && var41.length() != 8) {
                  jindent.debugger.a.b(s("XuX\u0006#>\u007fU\u0018.l{Y\u0001(p:I\t3{ \r") + var41);
                  throw new JindentException(s("RsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:E\t4>{CH.plL\u0004.z:K\u00075s{YFg[h_\u00075>yB\f\">*\u001fF"));
               }

               int var42 = Integer.parseInt(var41);
               int var43 = var20.lastIndexOf("|");
               String var44 = var20.substring(var43 + 1);
               if(!var44.equals(s("x*\u007f[4)"))) {
                  throw new JindentException(s("RsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:E\t4>{CH.plL\u0004.z:K\u00075s{YFg[h_\u00075>yB\f\">*\u001eF"));
               }

               this.b.a.d();
               jindent.formatter.a.c.e(42949672);
               if(var37 == 1 || var37 == 2) {
                  int var45 = 0;

                  while(true) {
                     if(var45 >= var33) {
                        throw new JindentException(s("GuX\u001agrsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:D\u001bgrsN\r)m\u007fIH3q:A\u0007 wt\r\u0006&s\u007f\u0005\u001bn$:\u000f") + var31 + s("<6\r\n2j:T\u00072l:@\t$vsC\rgruJ\u0001)>s^He") + var88 + s("<4\'") + s("[h_\u00075>yB\f\">*\u0019"));
                     }

                     if(var34[var45].equals(var88)) {
                        break;
                     }

                     ++var45;
                  }
               }

               if(var37 == 0) {
                  throw new JindentException(s("GuX\u001agrsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:D\u001bg\u007ft\r\u0007%muA\r3{:Y\u001a.\u007fv\r\u0004.}\u007fC\u001b\">qH\u0011i>JA\r&m\u007f\r\u001a\"su[\rg\u007fvAH+wyH\u00064{:F\r>m:Y\u0007g{tL\n+{:g\u0001)z\u007fC\u001c`m:H\u001e&roL\u001c.qt\r\u001e\"liD\u0007)0\u0010") + s("[h_\u00075>yB\f\">*\u0018"));
               }

               short var103 = 500;
               String var46 = f(var38);
               String var47 = f(var103);
               if(var38 < var103) {
                  throw new JindentException(s("GuX\u001agrsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:D\u001bgh{A\u0001#>|B\u001agTsC\f\"pn\n\u001bg") + this.b.getLanguage() + s(">|B\u001a*\u007fnY\r5>mD\u001c/>lH\u001a4wuCH`") + var46 + s("96\r\n2j:Y\u0000\">yX\u001a5{tYH!qh@\t3j\u007f_H1{h^\u0001(p:D\u001bg9") + var47 + s("94\'1(k:C\r\"z:Y\u0007gkjJ\u001a&z\u007f\r\u0011(kh\r\u0004.}\u007fC\u001b\"0:}\u0004\"\u007fiHH1wiD\u001c}>rY\u001c7$5\u0002\u001f0i4G\u0001)z\u007fC\u001ci}u@H!qh\r\u001b2njB\u001a30\u0010h\u001a5qh\r\u000b(z\u007f\rXq0"));
               }

               if((var39 & this.b.l) == 0) {
                  throw new JindentException(s("GuX\u001agrsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:I\u0007\"m:C\u00073>\u007fC\t%r\u007f\r\".p~H\u000639i\r") + this.b.getLanguage() + s(">|B\u001a*\u007fnY\r5?\u0010}\u0004\"\u007fiHH2n}_\t#{:T\u00072l:A\u0001${t^\rf\u0014__\u001a(l:N\u0007#{:\u001d_i"));
               }

               if(var40 == 1) {
                  try {
                     SimpleDateFormat var49 = new SimpleDateFormat(s("gcT\u0011\nS~I"));
                     Date var50 = new Date();
                     String var51 = var49.format(var50);
                     int var52 = Integer.valueOf(var51).intValue();
                     if(var52 >= var42) {
                        throw new Exception();
                     }
                  } catch (Exception var69) {
                     throw new JindentException(s("GuX\u001agrsN\r)m\u007f\r\u0003\"g:\u000f") + var95 + s("<:D\u001bg{b]\u00015{~\u0003b\u0002lhB\u001ag}uI\rg.\"\u0003"));
                  }
               }
            } else {
               var84 = k.d();
               if(var84 == -1) {
                  k.e();
               } else {
                  SimpleDateFormat var86 = new SimpleDateFormat(s("gcT\u0011\nS~I"));
                  Date var89 = new Date();
                  var8 = var86.format(var89);
                  int var9 = Integer.valueOf(var8).intValue();
                  int var10 = var84 / 1000000;
                  if(var9 >= var84 || var10 != 20) {
                     jindent.util.c.b.a(this.t, new jindent.util.c.d());
                     throw new JindentException(s("GuX\u001ag{lL\u00042\u007fnD\u0007)>jH\u001a.q~\r\u0000&m:H\u00107whH\fi\u0014__\u001a(l:N\u0007#{:\u001dQi"));
                  }
               }

               ++splashScreenCounter;
               int var87 = 5 * (new String[]{"x", "y", "z", "a"}).length;
               if(splashScreenCounter % var87 == 1) {
                  jindent.util.c.b.a(this.t, new jindent.util.c.e());
               }

               if(this.b.getPositionIndex(s("tsC\f\"pnc\u00073{JB\u001b.jsB\u0006")) == 2) {
                  this.b.setPositionIndex(s("tsC\f\"pnc\u00073{JB\u001b.jsB\u0006"), 1);
               }

               this.b.a.d();
               jindent.formatter.a.c.e(this.b.n);
            }
         } catch (JindentException var80) {
            jindent.debugger.a.a((Exception)var80);
            throw new AbstractParser$1(this, var80.getMessage());
         } catch (Exception var81) {
            jindent.debugger.a.a(var81);
            throw new AbstractParser$2(this, s("Wt[\t+w~\r\u0004.}\u007fC\u001b\">qH\u0011gxu_\u0005&j4\'-5lu_H$q~HHv.4"));
         } catch (Error var82) {
            jindent.debugger.a.a(var82);
            throw new AbstractParser$3(this, s("Wt[\t+w~\r\u0004.}\u007fC\u001b\">qH\u0011gxu_\u0005&j4\'-5lu_H$q~HHv/4"));
         }

         this.b.a.c();

         try {
            this.y = this.b.a.f();
            boolean var3;
            if(this.b.b == 1) {
               var3 = this.b.a.g();
            } else {
               if(this.b.b != 2) {
                  throw new JindentException(s("IhB\u0006 >nB\u0003\"pJ_\u0007#kyH\u001a\u0002pn_\u0011\nq~HH.p:}\t5m\u007f_I"));
               }

               var3 = this.b.a.h();
            }

            var84 = this.b.getEndOfLineFormat(s("qoY\u00182j_C\f\bxVD\u0006\"Xu_\u0005&j"));
            this.a(var84);
            this.b.d.setVariables(this.b.c.getUserVariablesSetting(SettingsUtils.createEnvironmentKey(s("mc^\u001c\"sLL\u001a.\u007fxA\r4"))));
            this.b.d.setVariables(this.b.c.getUserVariablesSetting(SettingsUtils.createEnvironmentKey(s("kiH\u001a\u0011\u007fhD\t%r\u007f^"))));
            if(this.b.d.getVariable(s("xsA\r\t\u007fwH")) == null) {
               this.b.d.setVariable(s("xsA\r\t\u007fwH"), s("4tB\u001cg\u007flL\u0001+\u007fxA\rm"));
            }

            if(this.b.d.getVariable(s("xoA\u0004\u0001wvH&&s\u007f")) == null) {
               this.b.d.setVariable(s("xoA\u0004\u0001wvH&&s\u007f"), s("4tB\u001cg\u007flL\u0001+\u007fxA\rm"));
            }

            this.b.d.setVariable(s("xsA\r\u0001qh@\t3"), EndOfLineFormatSetting.formatToString(var84));
            this.b.d.setVariable(s("j{O;.d\u007f"), this.b.getNumber(s("j{O\u001d+\u007fnB\u001a\u0014w`H")));
            this.b.d.setVariable(s("j\u007fU\u001c\u0001qh@\t3"), EndOfLineFormatSetting.formatToString(var84));
            this.b.d.setVariable(s("z{Y\r"), h(this.b.c.getDateFormat(SettingsUtils.createEnvironmentKey(s("z{Y\r\u0001qh@\t3")))));
            this.b.d.setVariable(s("}uC\u001e\"pnD\u0007)P{@\r"), this.b.c.getString(SettingsUtils.createEnvironmentKey(s("}uC\u001e\"pnD\u0007)P{@\r"))));
            this.b.m = this.u?new CaretHistoryMapper():null;
            if(this.b.m != null) {
               for(q var92 = this.y; var92.g != null; var92 = var92.g) {
                  if(u.k(var92)) {
                     this.b.m.addToken(var92);
                  }
               }
            }

            if(this.l != null && this.l instanceof jindent.formatter.c.d) {
               ((jindent.formatter.c.d)this.l).a(this.y);
            }

            this.a(this.b.a);
            this.h();
            this.n();
            this.i();
            this.b.a.a(this.b);
            jindent.formatter.a.d var94 = this.b.a.d().l();
            this.a(var2, var94);
         } catch (JindentException var74) {
            jindent.debugger.a.a((Exception)var74);
            throw var74;
         } catch (ParseException var75) {
            jindent.debugger.a.a((Exception)var75);
            if(var75.b != null) {
               throw new JindentException(s("[tN\u00072pnH\u001a\"z:H\u001a5qh^H#khD\u0006 >jL\u001a4{4\rb") + var75.getMessage() + s(">\u0010") + s("N{_\u001b.p}\r\u001c\"lwD\u0006&j\u007fIF"), var75.b.g.c, var75.b.g.b);
            }

            throw Utils.convertParseExceptionToJindentException(var75);
         } catch (Exception var76) {
            jindent.debugger.a.a(var76);
            throw new AbstractParser$4(this, var76.getMessage());
         } catch (Error var77) {
            jindent.debugger.a.a(var77);
            JindentLogging.getLogger().log(Level.SEVERE, s("[h_\u00075>uN\u000b2l\u007fI"), var77);
            throw Utils.convertParseErrorToJindentException(var77);
         } finally {
            this.b.a.e();
         }

      }
   }

   private static String f(int var0) {
      String var1 = "" + var0 / 100;
      String var2 = "" + var0 % 100 / 10;
      return "" + var1 + "." + var2;
   }

   public void a(InputStream var1, OutputStream var2) throws JindentException {
      try {
         String var3 = this.b.getEncoding(s("wt]\u001d3[tN\u0007#wtJ"));
         String var4 = this.b.getEncoding(s("qoY\u00182j_C\u000b(zsC\u000f"));
         jindent.formatter.a.a var5 = new jindent.formatter.a.a(var1);
         InputStreamReader var6 = new InputStreamReader(var5, var3);
         OutputStreamWriter var7 = new OutputStreamWriter(var2, var4);
         this.a((Reader)var6, (Writer)var7);

         try {
            var6.close();
         } catch (Exception var10) {
            throw new JindentException(s("]vB\u001b.p}\r\u0001)noYH!\u007fsA\r#0"));
         }

         try {
            var7.close();
         } catch (Exception var9) {
            throw new JindentException(s("]vB\u001b.p}\r\u00072jjX\u001cgx{D\u0004\"z4"));
         }
      } catch (UnsupportedEncodingException var11) {
         throw new JindentException(s("Kt^\u001d7nu_\u001c\"z:D\u00067kn\u0002\u00072jjX\u001cg{tN\u0007#wtJF"));
      }
   }

   protected void q(String var1) {
      if(!this.S && var1.length() > 0) {
         this.t();
      }

      q var2 = q.a();
      var2.f = var1;
      var2.a = 4000;
      var2.b = this.e;
      var2.c = this.d;
      this.d += var1.length();
      var2.d = this.e;
      var2.e = this.d;
      var2.h = null;
      var2.g = null;
      var2.k = this.z;
      var2.l = 0;
      var2.m = null;
      this.z.g = var2;
      this.z = var2;
      if(var2.f.length() > 0) {
         this.R = false;
         this.X = false;
         this.T = 0;
         this.U = 0;
      }

   }

   protected void a(String var1, int var2) {
      if(!this.S && var1.length() > 0) {
         this.t();
      }

      q var3 = q.a();
      var3.f = var1;
      var3.a = var2;
      var3.b = this.e;
      var3.c = this.d;
      this.d += var1.length();
      var3.d = this.e;
      var3.e = this.d;
      var3.h = null;
      var3.g = null;
      var3.k = this.z;
      var3.l = 0;
      var3.m = null;
      var3.o = this.H;
      var3.n = this.F == null?0:this.F.a();
      var3.p = this.E;
      var3.r = this.V;
      this.z.g = var3;
      this.z = var3;
      if(var3.f.length() > 0) {
         this.R = false;
         this.X = false;
         this.T = 0;
         this.U = 0;
      }

   }

   protected void b(String var1, int var2) {
      this.a(var1, var2, 0);
   }

   protected void a(String var1, int var2, int var3) {
      if(!this.S) {
         this.t();
      }

      q var4 = q.a();
      var4.f = var1;
      var4.a = var2;
      var4.b = this.e;
      var4.c = this.d;
      this.d += var1.length();
      var4.d = this.e;
      var4.e = this.d;
      var4.h = null;
      var4.g = null;
      var4.k = this.z;
      var4.l = var3;
      var4.m = null;
      var4.o = this.H;
      var4.n = this.F == null?0:this.F.a();
      var4.p = this.E;
      var4.r = this.V;
      this.z.g = var4;
      this.z = var4;
      this.R = false;
      this.X = false;
      this.T = 0;
      this.U = 0;
   }

   protected void l(q var1) {
      if(!this.S && var1.f.length() > 0) {
         this.t();
      }

      var1.f = var1.f;
      var1.a = var1.a;
      var1.b = this.e;
      var1.c = this.d;
      this.d += var1.f.length();
      var1.d = this.e;
      var1.e = this.d;
      var1.h = null;
      var1.g = var1.g;
      var1.k = this.z;
      var1.l = 0;
      var1.m = null;
      var1.o = this.H;
      var1.n = this.F == null?0:this.F.a();
      var1.p = this.E;
      var1.r = this.V;
      this.z.g = var1;
      this.z = var1;
      if(var1.f.length() > 0) {
         this.R = false;
         this.X = false;
         this.T = 0;
         this.U = 0;
      }

   }

   protected void b(q var1, q var2) {
      var2.g = var1.g;
      var1.g = var2;
      var2.k = var1;
      var2.g.k = var2;
   }

   protected void m(q var1) {
      if(!this.S) {
         this.t();
      }

      var1.b = this.e;
      var1.c = this.d;
      var1.d = this.e;
      var1.e = this.d;
      var1.g = var1.g;
      var1.k = this.z;
      var1.p = this.E;
      var1.o = this.H;
      var1.n = this.F == null?0:this.F.a();
      var1.p = this.E;
      var1.r = this.V;
      this.z.g = var1;
      this.z = var1;
   }

   protected void g(int var1) {
      if(!this.R && this.U < var1) {
         this.d += var1 - this.U;
         this.U = var1;
      }

   }

   protected void h(int var1) {
      if(this.U < var1) {
         this.d += var1 - this.U;
         this.U = var1;
      }

   }

   protected void a(int var1, boolean var2) {
      if(!this.R || this.R && var2) {
         this.h(var1);
      }

   }

   protected void p() {
      ++this.Q;
      ++this.M;
      ++this.N;
      ++this.P;
      ++this.O;
   }

   protected void q() {
      this.g(1);
   }

   protected void r() {
      if(this.b.getBoolean(s("m\u007f]\t5\u007fnH+/ktF\u001b\u0005g_U\u000b\"{~D\u0006 RsC\r4")) && this.d > this.b.getNumber(s("s{U$.p\u007fa\r)ynE"))) {
         this.p();
      }

      if(!this.R) {
         q var1 = q.a();
         var1.f = t.emptyString;
         var1.a = -25;
         var1.b = this.e;
         var1.c = this.d;
         var1.d = this.e;
         var1.e = this.d;
         var1.h = null;
         var1.g = null;
         var1.k = this.z;
         var1.l = 0;
         var1.m = null;
         var1.o = this.H;
         var1.n = this.F == null?0:this.F.a();
         var1.p = this.E;
         var1.r = this.V;
         this.d = 0;
         this.z.g = var1;
         this.z = var1;
         this.S = false;
         this.R = true;
         this.X = false;
         this.U = 0;
      }

   }

   protected void s() {
      if(this.b.getBoolean(s("m\u007f]\t5\u007fnH+/ktF\u001b\u0005g_U\u000b\"{~D\u0006 RsC\r4")) && this.d > this.b.getNumber(s("s{U$.p\u007fa\r)ynE"))) {
         this.p();
      }

      q var1 = q.a();
      var1.f = t.emptyString;
      var1.a = -60;
      var1.b = this.e;
      var1.c = this.d;
      var1.d = this.e;
      var1.e = this.d;
      var1.h = null;
      var1.g = null;
      var1.k = this.z;
      var1.l = 0;
      var1.m = null;
      var1.o = this.H;
      var1.n = this.F == null?0:this.F.a();
      var1.p = this.E;
      var1.r = this.V;
      this.d = 0;
      this.z.g = var1;
      this.z = var1;
      this.S = false;
      this.U = 0;
   }

   protected void t() {
      this.d += this.V;
      this.S = true;
   }

   protected void u() {
      this.r();
      q var1 = q.a();
      var1.f = t.emptyString;
      var1.a = -25;
      var1.b = this.e;
      var1.c = this.d;
      var1.d = this.e;
      var1.e = this.d;
      var1.h = null;
      var1.g = null;
      this.d = 0;
      ++this.e;
      var1.k = this.z;
      var1.l = 0;
      var1.m = null;
      var1.o = this.H;
      var1.n = this.F == null?0:this.F.a();
      var1.p = this.E;
      var1.r = this.V;
      this.z.g = var1;
      this.z = var1;
      this.R = true;
      ++this.T;
      this.U = 0;
      this.S = false;
   }

   protected void v() {
      u.e(this.z, this.b);
      this.R = true;
      this.T = 0;
   }

   protected void i(int var1) {
      if(var1 > 0) {
         this.r();
         int var2 = var1 - this.T;

         for(int var3 = 1; var3 <= var2; ++var3) {
            this.u();
         }

         this.U = 0;
      }

   }

   public void a(boolean var1) {
      this.u = var1;
   }

   public boolean b() {
      return this.u;
   }

   public Context d() {
      return this.b;
   }

   protected void w() {
      if(this.b.getPreProcessorIndentationIndex(s("wtI\r)jJ_\r7luN\r4mu_,.l\u007fN\u001c.h\u007f^")) == 1) {
         this.r.c();
         this.r.a(this.b);
         this.r.b(this.b);
         this.r.d();
      }

   }

   protected void o(q var1, boolean var2) {
      if(this.m != null) {
         this.b.d.setVariable(s("qxG\r$jTL\u0005\""), this.m.b());
         this.b.d.setVariable(s("qxG\r$jNT\u0018\""), this.m.a());
      }

      if(var2) {
         this.r();
         this.a(var1, this.m);
         this.r();
      } else {
         this.r();
         this.b(var1, this.m);
         this.r();
      }

      if(this.m != null) {
         this.b.d.removeVariable(s("qxG\r$jTL\u0005\""));
         this.b.d.removeVariable(s("qxG\r$jNT\u0018\""));
      }

      this.A = false;
      this.m = null;
   }

   protected void a(q var1, b var2) {
      MyStringBuffer var3 = new MyStringBuffer();
      d var4 = new d(var1.f);
      int var9 = var4.a();
      int var10 = 0;
      int var11 = var1.c - 1;
      boolean var13 = false;
      b var14 = new b();
      var14.g(var1.f);
      int var15 = var2 == null?0:var14.b(var2);
      boolean var16 = this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b")) && (var15 & 2) != 0 || this.b.getBoolean(s("z\u007fA\r3{UO\u001b(r\u007fY\r\r\u007flL,(}NL\u000f4")) && (var15 & 1) != 0;
      String var5;
      String var6;
      if(var9 == 1 && !var16) {
         var6 = var4.b();
         var5 = var6;
         if(var6.startsWith(s("10\u0007"))) {
            var5 = var6.substring(3);
         }

         if(var5.endsWith(s("40\u0002"))) {
            var5 = var5.substring(0, var5.length() - 3);
         } else if(var5.endsWith(s("45"))) {
            var5 = var5.substring(0, var5.length() - 2);
         }

         var5 = var5.trim();
         var10 = b.i(var6);
         this.a(var14, var2, var6, var10);
         var5 = s("10\u0007H") + var5 + s(">0\u0002");
         this.e(var5);
      } else {
         this.e(s("10\u0007"));

         for(int var17 = 1; var17 <= var9; ++var17) {
            var6 = var4.b();
            int var12;
            if((var12 = b.i(var6)) != 0) {
               var6 = this.a(var14, var2, var6, var10);
               var10 = var12;
               var13 = var6 == null;
            }

            if(!var13) {
               int var7 = this.r(var6);
               var5 = this.f(var6);
               int var8;
               if(var17 == 1) {
                  var8 = 0;
               } else {
                  var8 = var11 + 1;
               }

               if(var7 < var8) {
                  var8 = var7;
               }

               if(var5.startsWith(s("10\u0007"))) {
                  var5 = var5.substring(3);
               } else if(var5.startsWith(s("10"))) {
                  var5 = var5.substring(2);
               } else if(var5.startsWith("/")) {
                  var5 = var5.substring(1);
               }

               if(var5.endsWith(s("45"))) {
                  var5 = var5.substring(0, var5.length() - 2);
               } else if(var5.endsWith("/")) {
                  var5 = var5.substring(0, var5.length() - 1);
               }

               if(var8 <= var5.length()) {
                  var5 = var5.substring(var8, var5.length());
               } else {
                  var5 = t.emptyString;
               }

               var3.c(0);
               var3.a(s(">0"));
               if(var5.length() > 0 && var5.charAt(0) != 32) {
                  var3.a(" ");
               }

               var3.a(var5);
               var5 = var5.trim();
               if(var17 == 1 && var5.length() > 0) {
                  this.e(var3.toString());
                  var5 = t.emptyString;
               }

               if(var17 > 1 && var17 < var9) {
                  this.e(var3.toString());
                  var5 = t.emptyString;
               }

               if(var17 == var9 && var5.length() > 0) {
                  this.e(var3.toString());
               }
            }
         }

         var5 = new String(s(">0\u0002"));
         var5 = this.a(var14, var2, var5, var10);
         this.e(var5);
      }

   }

   protected void a(b var1) {
      int var3 = var1.i();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var2 = var1.c(var4);
         var2 = this.c(var2);
         this.e(var2);
      }

   }

   protected void a(b var1, int var2) {
      jindent.formatter.e.a.a.c var3 = var1.a(var2);
      if(var3 != null) {
         this.b.d.setVariable(s("n{_\t*P{@\r"), var3.a());
         if(var3 instanceof jindent.formatter.e.a.a.e) {
            this.b.d.setVariable(s("n{_\t*Jc]\r"), ((jindent.formatter.e.a.a.e)var3).b());
         }
      }

      int var4 = var1.m();

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var1.g(var5);
         var6 = this.c(var6);
         this.e(var6);
      }

      this.b.d.removeVariable(s("n{_\t*P{@\r"));
      if(var3 instanceof jindent.formatter.e.a.a.e) {
         this.b.d.removeVariable(s("n{_\t*Jc]\r"));
      }

   }

   protected void b(b var1) {
      int var2 = var1.n();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.h(var3);
         var4 = this.c(var4);
         this.e(var4);
      }

   }

   protected void c(b var1) {
      if(var1.d()) {
         int var2 = var1.l();
         this.b.d.setVariable(s("l\u007fY\u001d5pNT\u0018\""), var1.c());

         for(int var3 = 0; var3 < var2; ++var3) {
            String var4 = var1.f(var3);
            var4 = this.c(var4);
            this.e(var4);
         }

         this.b.d.removeVariable(s("l\u007fY\u001d5pNT\u0018\""));
      }

   }

   protected void d(b var1) {
      int var2 = var1.k();

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1.e(var3);
         var4 = this.c(var4);
         this.e(var4);
      }

   }

   protected void b(b var1, int var2) {
      this.b.d.setVariable(s("{bN\r7jsB\u0006\t\u007fwH"), var1.b(var2));
      int var3 = var1.j();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var1.d(var4);
         var5 = this.c(var5);
         this.e(var5);
      }

      this.b.d.removeVariable(s("{bN\r7jsB\u0006\t\u007fwH"));
   }

   protected void e(b var1) {
      int var3 = var1.o();

      for(int var4 = 0; var4 < var3; ++var4) {
         String var2 = var1.i(var4);
         var2 = this.c(var2);
         this.e(var2);
      }

   }

   protected void f(b var1) {
      this.b.d.setVariable(s("z\u007fN\u0004&l{Y\u0001(pTL\u0005\""), var1.b());
      this.b.d.setVariable(s("z\u007fN\u0004&l{Y\u0001(pNT\u0018\""), var1.a());
      this.b.d.setVariable(s("qxG\r$jTL\u0005\""), var1.b());
      this.b.d.setVariable(s("qxG\r$jNT\u0018\""), var1.a());
      this.a(var1);
      int var2 = var1.e();
      int var3;
      if(var2 > 0) {
         this.b(var1);

         for(var3 = 0; var3 < var2; ++var3) {
            this.a(var1, var3);
         }
      }

      this.c(var1);
      var2 = var1.f();
      if(var2 > 0) {
         this.d(var1);

         for(var3 = 0; var3 < var2; ++var3) {
            this.b(var1, var3);
         }
      }

      this.e(var1);
      this.b.d.removeVariable(s("z\u007fN\u0004&l{Y\u0001(pTL\u0005\""));
      this.b.d.removeVariable(s("z\u007fN\u0004&l{Y\u0001(pNT\u0018\""));
      this.b.d.removeVariable(s("qxG\r$jTL\u0005\""));
      this.b.d.removeVariable(s("qxG\r$jNT\u0018\""));
   }

   protected void a(b var1, b var2, int var3) {
      jindent.formatter.e.a.a.c var4 = var2.a(var3);
      String var5 = var4.a();
      if(var1.d(var5) == -1) {
         String var6;
         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            var6 = s("Wt^\r5j\u007fIH*wi^\u0001)y:m\u0018&l{@H") + var5 + s(">nL\u000f");
            if(this.v) {
               this.b.addMessage(new Message(this.b.getLanguage(), var6, 4, this.z, 1));
            }
         } else {
            var6 = s("Ss^\u001b.p}\r(7\u007fhL\u0005g") + var5 + s(">nL\u000f");
            if(this.v) {
               this.b.addMessage(new WarningMessage(this.b.getLanguage(), var6, 4, this.z));
            }
         }

         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            if(var3 == 0) {
               this.b(var2);
            }

            this.a(var2, var3);
         }

         var1.a(var4);
      }

   }

   protected void a(b var1, b var2) {
      String var3 = var2.c();
      if(!var1.d()) {
         String var4;
         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            var4 = s("Wt^\r5j\u007fIH*wi^\u0001)y:m\u001a\"jo_\u0006gj{J");
            if(this.v) {
               this.b.addMessage(new Message(this.b.getLanguage(), var4, 4, this.z, 1));
            }
         } else {
            var4 = s("Ss^\u001b.p}\r(5{nX\u001a)>nL\u000f");
            if(this.v) {
               this.b.addMessage(new WarningMessage(this.b.getLanguage(), var4, 4, this.z));
            }
         }

         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            this.c(var2);
         }

         var1.c(var3);
      }

   }

   protected void b(b var1, b var2, int var3) {
      String var4 = var2.b(var3);
      if(var1.f(var4) == -1) {
         String var5;
         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            var5 = s("Wt^\r5j\u007fIH*wi^\u0001)y:m\u001c/luZ\u001bg") + var4 + s(">nL\u000f");
            if(this.v) {
               this.b.addMessage(new Message(this.b.getLanguage(), var5, 4, this.z, 1));
            }
         } else {
            var5 = s("Ss^\u001b.p}\r(3vhB\u001f4>") + var4 + s(">nL\u000f");
            if(this.v) {
               this.b.addMessage(new WarningMessage(this.b.getLanguage(), var5, 4, this.z));
            }
         }

         if(this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b"))) {
            if(var3 == 0) {
               this.d(var2);
            }

            this.b(var2, var3);
         }

         var1.e(var4);
      }

   }

   protected String a(b var1, b var2, String var3, int var4) {
      jindent.formatter.e.a.a.d var5 = new jindent.formatter.e.a.a.d(var3);
      String var6 = null;
      String var7 = null;
      String var8 = var3;
      boolean var9 = this.b.getBoolean(s("z\u007fA\r3{UO\u001b(r\u007fY\r\r\u007flL,(}NL\u000f4"));
      if(var2 == null) {
         return var3;
      } else {
         String var10 = var2.a();
         boolean var11 = var10.equals(s("}uC\u001b3loN\u001c(l")) || var10.equals(s("s\u007fY\u0000(z")) || var10.equals(s("wtY\r5x{N\r")) || var10.equals(s("}vL\u001b4"));
         boolean var12 = var11;
         boolean var13 = var10.equals(s("s\u007fY\u0000(z"));
         int var16;
         if(b.h(var3)) {
            if(var4 == 2) {
               for(var16 = 0; var16 < var2.e() && var11; ++var16) {
                  this.a(var1, var2, var16);
               }
            }

            if(var4 == 4) {
               for(var16 = 0; var16 < var2.f() && var12; ++var16) {
                  this.b(var1, var2, var16);
               }
            }

            return var3;
         } else {
            while(true) {
               do {
                  if(!var5.b() && var7 == null) {
                     return var8;
                  }

                  if(var7 == null) {
                     var6 = var5.c();
                  } else {
                     var6 = var7;
                  }

                  if(var5.b()) {
                     var7 = var5.c();
                  } else {
                     var7 = null;
                  }

                  String var14;
                  int var15;
                  String var17;
                  if(var6.equals(s("^jL\u001a&s")) && var11) {
                     if(var7 != null) {
                        var16 = var2.d(var7);
                        if(var16 == -1) {
                           if(var9) {
                              var17 = s("Z\u007fA\r3{~\r\u0007%muA\r3{:g\t1\u007f^B\u000bgj{JH") + var6 + " " + var7;
                              if(this.v) {
                                 this.b.addMessage(new Message(this.b.getLanguage(), var17, 4, this.z));
                              }

                              var8 = null;
                           } else {
                              var17 = var6 + " " + var7 + s(">s^H(|iB\u0004\"j\u007f");
                              if(this.v) {
                                 this.b.addMessage(new WarningMessage(this.b.getLanguage(), var17, 4, this.z));
                              }
                           }
                        } else {
                           for(var15 = 0; var15 < var16; ++var15) {
                              this.a(var1, var2, var15);
                           }
                        }
                     } else if(var9) {
                        var14 = s("Z\u007fA\r3{~\r\u0007%muA\r3{:H\u00057jc\r\"&h{i\u0007$>nL\u000fg") + var6;
                        if(this.v) {
                           this.b.addMessage(new Message(this.b.getLanguage(), var14, 4, this.z));
                        }

                        var8 = null;
                     } else {
                        var14 = s("[w]\u001c>>") + var6 + s(">:D\u001bgqx^\u0007+{nH");
                        if(this.v) {
                           this.b.addMessage(new WarningMessage(this.b.getLanguage(), var14, 4, this.z));
                        }
                     }
                  }

                  if(var6.equals(s("^hH\u001c2lt")) && var13) {
                     for(var16 = 0; var16 < var2.e() && var11; ++var16) {
                        this.a(var1, var2, var16);
                     }

                     if(!var2.d()) {
                        if(var9) {
                           var14 = s("Z\u007fA\r3{~\r\u0007%muA\r3{:g\t1\u007f^B\u000bgj{JH") + var6;
                           if(this.v) {
                              this.b.addMessage(new Message(this.b.getLanguage(), var14, 4, this.z));
                           }

                           var8 = null;
                        } else {
                           var14 = var6 + s(">s^H(|iB\u0004\"j\u007f");
                           if(this.v) {
                              this.b.addMessage(new WarningMessage(this.b.getLanguage(), var14, 4, this.z));
                           }
                        }
                     } else {
                        this.a(var1, var2);
                     }
                  }

                  if((var6.equals(s("^\u007fU\u000b\"nnD\u0007)")) || var6.equals(s("^nE\u001a(ii"))) && var12) {
                     if(var7 == null) {
                        if(var9) {
                           var14 = s("Z\u007fA\r3{~\r\u0007%muA\r3{:H\u00057jc\r\"&h{i\u0007$>nL\u000fg") + var6 + s(">{YH");
                           if(this.v) {
                              this.b.addMessage(new Message(this.b.getLanguage(), var14, 4, this.z));
                           }

                           var8 = null;
                        } else {
                           var14 = s("[w]\u001c>>") + var6 + s(">s^H(|iB\u0004\"j\u007f\r\t3>");
                           if(this.v) {
                              this.b.addMessage(new WarningMessage(this.b.getLanguage(), var14, 4, this.z));
                           }
                        }
                     } else {
                        for(var16 = 0; var16 < var2.e() && var11; ++var16) {
                           this.a(var1, var2, var16);
                        }

                        if(var2.d() && var13) {
                           this.a(var1, var2);
                        }

                        var16 = var2.f(var7);
                        if(var16 == -1) {
                           if(var9) {
                              var17 = s("Z\u007fA\r3{~\r\u0007%muA\r3{:g\t1\u007f^B\u000bgj{JH") + var6 + " " + var7;
                              if(this.v) {
                                 this.b.addMessage(new Message(this.b.getLanguage(), var17, 4, this.z));
                              }

                              var8 = null;
                           } else {
                              var17 = var6 + " " + var7 + s(">s^H(|iB\u0004\"j\u007f");
                              if(this.v) {
                                 this.b.addMessage(new WarningMessage(this.b.getLanguage(), var17, 4, this.z));
                              }
                           }
                        } else {
                           for(var15 = 0; var15 < var16; ++var15) {
                              this.b(var1, var2, var15);
                           }
                        }
                     }
                  }
               } while(!var6.endsWith("/"));

               for(var16 = 0; var16 < var2.e() && var11; ++var16) {
                  this.a(var1, var2, var16);
               }

               if(var2.d() && var13) {
                  this.a(var1, var2);
               }

               for(var16 = 0; var16 < var2.f() && var12; ++var16) {
                  this.b(var1, var2, var16);
               }
            }
         }
      }
   }

   protected int r(String var1) {
      int var2 = 0;

      for(int var3 = var1.length(); var2 < var3 && var1.charAt(var2) == 32; ++var2) {
         ;
      }

      return var2;
   }

   protected void b(q var1, b var2) {
      d var3 = new d(var1.f);
      int var5 = 0;
      int var6 = this.V;
      int var7 = var3.a();
      int var9 = var1.c - 1;
      String var10 = p.a(0, var9);
      boolean var11 = false;
      b var12 = new b();
      var12.g(var1.f);
      boolean var13 = false;
      boolean var14 = false;
      int var15 = var2 == null?0:var12.b(var2);
      boolean var16 = this.b.getBoolean(s("wt^\r5jWD\u001b4wtJ\"&h{i\u0007$J{J\u001b")) && (var15 & 2) != 0 || this.b.getBoolean(s("z\u007fA\r3{UO\u001b(r\u007fY\r\r\u007flL,(}NL\u000f4")) && (var15 & 1) != 0;
      boolean var17 = var7 == 1 && var16;

      String var4;
      for(int var18 = 1; var18 <= var7; ++var18) {
         var4 = var3.b();
         int var8;
         if((var8 = b.i(var4)) == 0 && !var17) {
            if(var18 == var7) {
               var4 = this.a(var12, var2, var4, var5);
               var5 = var8;
            }
         } else {
            if(var8 != 8 || var17) {
               if(var16 && var18 == 1) {
                  this.e(s("10\u0007"));
                  var14 = true;
                  var4 = var10 + s(">0") + var4.substring(3, var4.length());
               }

               if(var16 && var18 == var7) {
                  var4 = var4.substring(0, var4.length() - 2);
                  var13 = true;
               }
            }

            var4 = this.a(var12, var2, var4, var5);
            var5 = var8;
            var11 = var4 == null;
         }

         if(var11) {
            if(var18 == var7) {
               var13 = true;
            }
         } else {
            int var19;
            if(var14) {
               var19 = this.r(var4) - var9;
            } else {
               var19 = 0;
            }

            int var20 = var6 + var19;
            if(var20 < 0) {
               var20 = 0;
            }

            this.d = var20;
            this.S = true;
            var4 = var4.trim();
            this.e(var4);
            var14 = true;
         }
      }

      if(var13) {
         var4 = s(">0\u0002");
         var4 = this.a(var12, var2, var4, var5);
         this.e(var4);
      }

      this.V = var6;
   }

   private static String s(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 30;
            break;
         case 1:
            var10003 = 26;
            break;
         case 2:
            var10003 = 45;
            break;
         case 3:
            var10003 = 104;
            break;
         default:
            var10003 = 71;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
