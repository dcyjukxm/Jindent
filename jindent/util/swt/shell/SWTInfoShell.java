package jindent.util.swt.shell;

import jindent.util.swt.SWTUtils;
import jindent.util.swt.shell.b;
import jindent.util.swt.shell.c;
import jindent.util.swt.shell.d;
import jindent.util.swt.shell.e;
import jindent.util.swt.shell.f;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SWTInfoShell {
   private static final String a = "http://www.jindent.com";
   public static final int WIDTH = 450;
   public static final int HEIGHT = 300;
   private Shell b;

   protected SWTInfoShell(Shell var1, String var2, String var3, String var4, String var5, String var6) {
      Display var7 = var1.getDisplay();
      this.b = new Shell(var1, 67680);
      this.b.setLayout(new GridLayout(1, true));
      this.b.setImage(SWTUtils.readImage(var7, a("c\u001dU\bi}ADW;7EY\u00178;M")));
      this.b.setSize(450, 300);
      this.b.setText(var2);
      this.b.addListener(21, new jindent.util.swt.shell.a(this));
      this.b.addListener(31, new b(this));
      Composite var8 = new Composite(this.b, 0);
      GridLayout var9 = new GridLayout();
      var9.numColumns = 2;
      var8.setLayout(var9);
      Composite var10 = new Composite(var8, 0);
      GridLayout var11 = new GridLayout();
      var11.numColumns = 3;
      var10.setLayout(var11);
      var10.setLayoutData(new GridData(17152, 128, false, false, 1, 1));
      Label var12 = new Label(var10, 0);
      Image var13 = SWTUtils.readImage(var7, var3);
      var12.setImage(var13);
      Label var14 = new Label(var10, 0);
      var14.setText(var4 + ":");
      Label var15 = new Label(var10, 0);
      var15.setText(var5);
      Font var16 = var14.getFont();
      FontData[] var17 = var16.getFontData();

      for(int var18 = 0; var18 < var17.length; ++var18) {
         FontData var19 = var17[var18];
         var19.setHeight(var19.getHeight() + 3);
         var19.setStyle(1);
      }

      Font var25 = new Font(var7, var17);
      var14.setFont(var25);
      var15.setFont(var25);
      Label var26 = new Label(var8, 131072);
      var26.setLayoutData(new GridData(4));
      var26.setText(a("r\u000b\r\u0019\u007fr\u000b\r\u0019\u007f:_YIe}\u0004ZN(|ADW;7EY\u0017<=F"));
      new Cursor(var7, 21);
      new Cursor(var7, 0);
      var26.addMouseListener(new c(this));
      var26.addMouseTrackListener(new d(this));
      Text var22 = new Text(this.b, 2882);
      var22.setEditable(false);
      var22.setEnabled(true);
      var22.setLayoutData(new GridData(1808));
      Font var23 = new Font(var7, a("\u0011DXK67Y\rw:%"), 10, 0);
      var22.setFont(var23);
      var22.setText(var6);
      Button var24 = new Button(this.b, 8);
      var24.setText(a("\u0011GBJ:"));
      var24.setLayoutData(new GridData(16777216, 1024, false, false, 1, 1));
      var24.addListener(13, new e(this));
      SWTUtils.centerWindow(this.b);
      this.b.open();

      while(!this.b.isDisposed()) {
         if(!var7.readAndDispatch()) {
            var7.sleep();
         }
      }

   }

   public boolean isDisposed() {
      return this.b.isDisposed();
   }

   public static void main(String[] var0) {
   }

   public static void invoke(Shell var0, String var1, String var2, String var3, String var4, String var5) {
      Display var6 = var0.getDisplay();
      var6.syncExec(new f(var0, var1, var2, var3, var4, var5));
   }

   static Shell access$000(SWTInfoShell var0) {
      return var0.b;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 82;
            break;
         case 1:
            var10003 = 43;
            break;
         case 2:
            var10003 = 45;
            break;
         case 3:
            var10003 = 57;
            break;
         default:
            var10003 = 95;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
