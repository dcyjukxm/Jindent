package jindent.customizer.javahelp;

import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Method;
import java.net.URL;
import javax.help.DefaultHelpBroker;
import javax.help.HelpSet;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import jindent.customizer.javahelp.HelpUtils$1;
import jindent.customizer.javahelp.HelpUtils$2;
import jindent.customizer.javahelp.JindentCSH;
import jindent.customizer.javahelp.invoker.DefaultHelpIdInvoker;
import jindent.customizer.javahelp.invoker.HelpIdInvoker;

public class HelpUtils {
   private static final String a = "\f+].z\b6\u001c\u0000v\b&V$k.\'_:1\u000e1";
   public static boolean javaHelpAvailable = false;
   public static boolean hasCustomCursor = false;
   public static HelpSet mainHS = null;
   public static DefaultHelpBroker mainHB = null;
   public static HelpIdInvoker helpIdInvoker = null;
   private static boolean b = true;
   public static String DEFAULT_JAVAHELP_START_ID = a("\f+].z\b6lz");
   static Class c;
   static Class d;
   static Class e;
   static Class f;
   static Class g;

   public static HelpIdInvoker getHelpIdInvoker() {
      return helpIdInvoker;
   }

   public static void setHelpIdInvoker(HelpIdInvoker var0) {
      helpIdInvoker = var0;
   }

   public static void setHelpIDString(Component var0, String var1) {
      if(javaHelpAvailable && isUseJavaHelpOnClick()) {
         JindentCSH.setHelpIDString(var0, var1);
      }

   }

   public static void setHelpIDString(Component[] var0, String var1) {
      if(javaHelpAvailable && isUseJavaHelpOnClick()) {
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            setHelpIDString(var0[var3], var1);
         }
      }

   }

   public static void addHelp(JMenuItem var0, Component var1) {
      if(javaHelpAvailable && hasCustomCursor && isUseJavaHelpOnClick() && mainHB != null && mainHS != null) {
         var0.addActionListener(new HelpUtils$1(var1));
      } else {
         var0.setEnabled(false);
      }

   }

   public static void addHelpOnClick(JMenuItem var0, Component var1) {
      if(javaHelpAvailable && hasCustomCursor && isUseJavaHelpOnClick() && mainHB != null && mainHS != null) {
         JindentCSH.setHelpIDString((Component)var0, DEFAULT_JAVAHELP_START_ID);
         var0.addActionListener(new HelpUtils$2(mainHB, var1));
      } else {
         var0.setEnabled(false);
      }

   }

   /** @deprecated */
   public static void addHelpOnClickMenu(Container var0) {
      if(javaHelpAvailable && hasCustomCursor && mainHB != null && isUseJavaHelpOnClick() && mainHS != null) {
         var0.addMouseListener(new jindent.customizer.javahelp.a.a(var0));
      }

   }

   public static void enableHelpKey(Container var0) {
      if(javaHelpAvailable && isUseJavaHelpOnClick()) {
         mainHB.enableHelpKey(var0, DEFAULT_JAVAHELP_START_ID, mainHS);
      }

   }

   public static void showHelpID(Container var0, String var1) {
      helpIdInvoker.showHelpID(var0, var1);
   }

   public static boolean isUseJavaHelpOnClick() {
      return b;
   }

   public static void setUseJavaHelpOnClick(boolean var0) {
      b = var0;
   }

   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   static {
      try {
         Class.forName(a("\f#E+gH*V&oH\nV&o5\'G"));
         javaHelpAvailable = true;
      } catch (Exception var7) {
         if(isUseJavaHelpOnClick()) {
            JOptionPane.showMessageDialog((Component)null, a(",#E+W\u0003.Cjq\t6\u0013#q\u00156R&s\u0003&\u001djW\u0003.Cjy\u0003#G?m\u00031\u0013+m\u0003bW#l\u0007 _/{H"), a("1#A$v\b%"), 2);
         }
      }

      Method var0 = null;

      try {
         Class[] var1 = new Class[]{c == null?(c = class$(a("\f#E+1\u00075GdV\u000b#T/"))):c, d == null?(d = class$(a("\f#E+1\u00075GdO\t+]>"))):d, e == null?(e = class$(a("\f#E+1\n#]-156A#q\u0001"))):e};
         var0 = (f == null?(f = class$(a("\f#E+1\u00075GdK\t-_!v\u0012"))):f).getMethod(a("\u00050V+k\u0003\u0001F9k\t/p?m\u0015-A"), var1);
         if(var0 != null) {
            hasCustomCursor = true;
         }
      } catch (NoSuchMethodError var5) {
         if(isUseJavaHelpOnClick()) {
            JOptionPane.showMessageDialog((Component)null, a("%7@>p\u000bbP?m\u0015-A9?\b-Gjl\u00132C%m\u0012\'Wj}\u001fbJ%j\u0014b@3l\u0012\'^d?.\'_:?\t,\u0013#k\u0003/\u0013#lF&Z9~\u0004.V.1"), a("1#A$v\b%"), 2);
         }
      } catch (NoSuchMethodException var6) {
         if(isUseJavaHelpOnClick()) {
            JOptionPane.showMessageDialog((Component)null, a("%7@>p\u000bbP?m\u0015-A9?\b-Gjl\u00132C%m\u0012\'Wj}\u001fbJ%j\u0014b@3l\u0012\'^d?.\'_:?\t,\u0013#k\u0003/\u0013#lF&Z9~\u0004.V.1"), a("1#A$v\b%"), 2);
         }
      }

      if(javaHelpAvailable) {
         try {
            ClassLoader var8 = (g == null?(g = class$(a("\f+].z\b6\u001d)j\u00156\\\'v\u001c\'Adu\u00074R\"z\n2\u001d\u0002z\n2f>v\n1"))):g).getClassLoader();
            URL var2 = HelpSet.findHelpSet(var8, a("\f+].z\b6\u001c\u0000v\b&V$k.\'_:1\u000e1"));
            if(var2 == null) {
               JOptionPane.showMessageDialog((Component)null, a(".\'_:l\u00036\u0013$p\u0012bU%j\b&\u001dj?.\'_:?\u0000\'R>j\u0014\'@j~\u0014\'\u0013.v\u0015#Q&z\u0002l"), a("#0A%m"), 0);
            } else {
               mainHS = new HelpSet(var8, var2);
               mainHS.setHomeID(DEFAULT_JAVAHELP_START_ID);
               mainHB = new DefaultHelpBroker();
               mainHB.setHelpSet(mainHS);
               mainHB.setHelpSetPresentation(mainHS.getDefaultPresentation());
            }
         } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, a("#:P/o\u0012+\\$?\u0011*Z&zF!A/~\u0012+]-?.\'_:L\u00036\tj") + var3.getMessage() + a("HH\u0013jW\u0003.Cjy\u0003#G?m\u00031\u0013+m\u0003bW#l\u0007 _/{H"), a("#0A%m"), 0);
         } catch (ExceptionInInitializerError var4) {
            JOptionPane.showMessageDialog((Component)null, a("%#]$p\u0012bZ$v\u0012b[/s\u0016l\u0013jW\u0003.Cjy\u0003#G?m\u00031\u0013+m\u0003bW#l\u0007 _/{H"), a("#0A%m"), 0);
         }
      }

      helpIdInvoker = new DefaultHelpIdInvoker();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 102;
            break;
         case 1:
            var10003 = 66;
            break;
         case 2:
            var10003 = 51;
            break;
         case 3:
            var10003 = 74;
            break;
         default:
            var10003 = 31;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
