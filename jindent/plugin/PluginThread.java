package jindent.plugin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.SwingUtilities;
import jindent.JindentSettings;
import jindent.SettingsUtils;
import jindent.debugger.JindentLogging;
import jindent.plugin.FormatCommand;
import jindent.plugin.PluginThread$1;
import jindent.plugin.PresentationContext;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.output.PluginThreadOutput;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportList;
import jindent.settings.LogFileSetting;

public class PluginThread implements PresentationContext, Runnable {
   protected boolean a = false;
   protected Object b = null;
   protected boolean c = true;
   protected LogFileSetting d = null;
   protected PrintWriter e = null;
   protected boolean f;
   protected ReportList g;
   protected static String h = System.getProperty(a(".U?S?1Y!Wc#H>D"), "\n");
   protected PluginThreadOutput i;
   protected JindentSettings j = null;
   protected boolean k;
   protected boolean l = true;
   protected long m = 10L;
   private Vector n;
   private boolean o = false;
   private Thread p;
   private int q;
   private boolean r;
   private int s;

   public PluginThread(boolean var1, boolean var2, PluginThreadOutput var3) {
      this.k = var1;
      this.f = var2;
      this.i = var3;
      this.reset();
   }

   public PluginThreadOutput getThreadOutput() {
      return this.i;
   }

   public void setJindentSettings(JindentSettings var1) {
      this.j = (JindentSettings)var1.clone();
      if(var1 != null) {
         this.d = var1.getLogFileSetting(SettingsUtils.createGeneralKey(a(".S6px.Y")));
      }

      this.reset();
   }

   protected void reset() {
      this.n = new Vector();
      this.q = 0;
      this.g = this.k?new ReportList():null;
      this.s = 0;
   }

   public void start() {
      this.i.init();
      if(this.j == null) {
         throw new RuntimeException(a("\u0012P$Qx,h9Dt#X\u007f\\x,X4Xe\u0011Y%Bx,[\"\u0016,\u007f\u001c?C}.\u001cp"));
      } else {
         if(this.d.getUseLogFile()) {
            try {
               this.e = new PrintWriter(new BufferedWriter(new FileWriter(this.d.getFilename())));
               this.e.println("[" + createDate() + a("\u001f\u001c\u001b_\u007f&Y?B11H0De+R6\u0018?l"));
            } catch (IOException var2) {
               JindentLogging.getLogger().log(Level.SEVERE, a("\u0007N#YcbK9_}\'\u001c&Dx6U?Q1.S6\u0016w+P4\u00163") + this.d.getFilename() + "\"", var2);
            }
         }

         if(this.p == null) {
            this.p = new Thread(this);
            if(this.o) {
               JindentLogging.getLogger().info(a("\fY&\u0016E*N4Wub_#Sp6Y5"));
            }

            this.p.start();
         }

      }
   }

   private static String createDate() {
      try {
         SimpleDateFormat var0 = new SimpleDateFormat(a(";E(O<\u000fq|Rubt\u0019\f|/\u0006\"E"));
         Date var1 = new Date();
         return var0.format(var1);
      } catch (Exception var2) {
         return a("hK#Y\u007f%\u001c5We\'\u001c7Yc/]%\u001c");
      }
   }

   protected void killThread() {
      if(this.p != null) {
         if(this.o) {
            JindentLogging.getLogger().info(a("\u0016T#Sp&\u001c\"B~2L4R"));
         }

         Thread var1 = this.p;
         this.p = null;
         var1.interrupt();
      }

   }

   public void run() {
      while(Thread.currentThread() == this.p) {
         if(!this.i.isFormattingStopped() && this.n.size() != 0) {
            if(this.n.size() > 0) {
               FormatCommand var1 = (FormatCommand)this.n.remove(0);
               this.setProgressInfo(var1, this.q - this.n.size(), this.q);
               this.i.setOutputVisible(true);
               var1.format(this.j, this.g, this.f, this);
            }
         } else {
            this.stop();
         }

         synchronized(this) {
            while(this.r) {
               try {
                  if(this.o) {
                     JindentLogging.getLogger().info(a("\u0016T#Sp&\u001c&Wx6U?Q"));
                  }

                  this.wait();
               } catch (InterruptedException var5) {
                  ;
               }
            }
         }

         try {
            Thread.sleep(this.m);
            if(this.o) {
               JindentLogging.getLogger().info(a("\u0016T#Sp&\u001c\"Zt\'L8Xv"));
            }
         } catch (InterruptedException var4) {
            ;
         }
      }

   }

   public void setMessage(int var1, String var2) {
      this.i.setMessage(var1, var2);
      if(this.d.getUseLogFile() && this.e != null && !var2.equals("")) {
         if(var1 == 0) {
            this.e.println();
         }

         this.e.println(var2);
      }

   }

   private void setProgressInfo(FormatCommand var1, int var2, int var3) {
      PluginSourceFile var4 = var1.getSourceFile();
      PluginDestinationFile var5 = var1.getDestinationFile();
      this.i.setCurrent(var2);
      this.i.setMaximum(var3);
   }

   public void stop() {
      if(this.o) {
         JindentLogging.getLogger().info(a("\u0016T#Sp&\u001c\"B~2L4R"));
      }

      if(this.d.getUseLogFile() && this.e != null) {
         this.e.println();
         this.e.println("[" + createDate() + a("\u001f\u001c\u001b_\u007f&Y?B16Y#[x,]%_\u007f%\u0012\u007f\u0018"));
         this.e.close();
      }

      this.i.setOutputVisible(false);
      ReportList var1 = this.getReportList();
      if(var1 != null) {
         SwingUtilities.invokeLater(new PluginThread$1(this, var1));
      }

      if(this.l) {
         this.killThread();
         if(this.getCreateExitCode()) {
            System.exit(this.s);
         }
      } else {
         this.reset();
      }

   }

   public void addCommand(FormatCommand var1) {
      if(this.o) {
         JindentLogging.getLogger().info(a("\u0003X5_\u007f%\u001c") + var1);
      }

      this.n.insertElementAt(var1, 0);
      this.q = Math.max(this.q, this.n.size());
   }

   public ReportList getReportList() {
      return this.g;
   }

   public void showReportList(ReportList var1) {
   }

   public void showReport(Report var1) {
      if(this.e != null) {
         this.e.println(var1.toString());
      }

   }

   public int getCommandCount() {
      return this.n.size();
   }

   public Object getActivationWindow() {
      return this.b;
   }

   public void setActivationWindow(Object var1) {
      this.b = var1;
   }

   public boolean isWindowsMode() {
      return this.c;
   }

   public void setWindowsMode(boolean var1) {
      this.c = var1;
   }

   public void setCreateExitCode(boolean var1) {
      this.a = var1;
   }

   public boolean getCreateExitCode() {
      return this.a;
   }

   public void setExitCode(int var1) {
      if(this.s < var1) {
         this.s = var1;
      }

   }

   public int getExitCode() {
      return this.s;
   }

   public boolean isDebug() {
      return this.o;
   }

   public void setDebug(boolean var1) {
      this.o = var1;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 66;
            break;
         case 1:
            var10003 = 60;
            break;
         case 2:
            var10003 = 81;
            break;
         case 3:
            var10003 = 54;
            break;
         default:
            var10003 = 17;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
