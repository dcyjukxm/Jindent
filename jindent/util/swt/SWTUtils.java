package jindent.util.swt;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.InputStream;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTUtils {
   // $FF: synthetic field
   static Class a;

   public static Point alignPreviewWindow(Shell var0, Shell var1) {
      Dimension var2 = Toolkit.getDefaultToolkit().getScreenSize();
      Point var3 = var1.getLocation();
      Point var4 = var1.getSize();
      Point var5 = var0.getSize();
      int var6 = ((int)var2.getWidth() - (var4.x + var5.x)) / 2;
      if(var6 < 0) {
         var6 = 0;
      }

      int var7 = var3.y + (var4.y - var5.y) / 2;
      if(var7 < 0) {
         var7 = 0;
      }

      Point var8 = new Point(var6, var7);
      var0.setLocation(var8);
      return var8;
   }

   public static void alignWindows(Shell var0, Shell var1) {
      Dimension var2 = Toolkit.getDefaultToolkit().getScreenSize();
      Point var3 = var1.getLocation();
      Point var4 = var1.getSize();
      Point var5 = var0.getSize();
      Point var6 = alignPreviewWindow(var0, var1);
      int var7 = var6.x + var5.x;
      var3 = new Point(var7, var3.y);
      var1.setLocation(var3);
   }

   public static void centerWindow(Shell var0) {
      Dimension var1 = Toolkit.getDefaultToolkit().getScreenSize();
      Point var2 = var0.getSize();
      if(var2.y > var1.height) {
         var2.y = var1.height;
      }

      if(var2.x > var1.width) {
         var2.x = var1.width;
      }

      var0.setLocation((var1.width - var2.x) / 2, (var1.height - var2.y) / 2);
   }

   public static void centerWindow(Shell var0, Shell var1) {
      Point var2 = var0.getLocation();
      Point var3 = var0.getSize();
      Point var4 = var1.getSize();
      if(var4.y > var3.y) {
         var4.y = var3.y;
      }

      if(var4.x > var3.x) {
         var4.x = var3.x;
      }

      var1.setLocation(var2.x + (var3.x - var4.x) / 2, var2.y + (var3.y - var4.y) / 2);
   }

   public static Image readImage(Display var0, String var1) {
      InputStream var2 = (a == null?(a = class$(a("DQq(w@L19fGT1?eGVxbAYQq+GZQs?"))):a).getResourceAsStream(a("GU~+w]\u0017") + var1);
      if(var2 != null) {
         return new Image(var0, var2);
      } else {
         System.err.println(a("mYq\"}Z\u0018y%|J\u0018y%~K\u0002?") + var1);
         return null;
      }
   }

   public static boolean hasAWTSWTBridge() {
      String var0 = System.getProperty(a("AK1\"sC]"), "").toLowerCase();
      return var0.indexOf(a("CY|")) == -1;
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
            var10003 = 46;
            break;
         case 1:
            var10003 = 56;
            break;
         case 2:
            var10003 = 31;
            break;
         case 3:
            var10003 = 76;
            break;
         default:
            var10003 = 18;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
