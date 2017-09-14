package jindent.plugin.b.b;

import java.io.File;
import jindent.ExtensionManager;
import jindent.SettingsUtils;
import jindent.commander.CommanderFrame;
import jindent.commander.InstrumentedSourceTextPane;
import jindent.customizer.preview.SourceTextPane;
import jindent.customizer.preview.SourceTextPaneHighlighting;
import jindent.formatter.Context;
import jindent.formatter.InternalFormatter;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.report.HistoryData;
import jindent.plugin.report.Report;
import jindent.settings.ExtensionManagerSetting;

public class a implements PluginEditor {
   public static final int PLUGIN_FILE = 0;
   public static final int SOURCE_FILE = 1;
   public static final int TARGET_FILE = 2;
   private CommanderFrame a;
   private File b;
   private int c;
   private InstrumentedSourceTextPane d;

   public a(File var1, CommanderFrame var2, int var3) {
      this.a = var2;
      this.b = var1;
      this.c = var3;
      if(var3 == 0) {
         this.d = var2.g();
      }

      if(var3 == 1) {
         this.d = var2.k().b();
      }

      if(var3 == 2) {
         this.d = var2.k().c();
      }

   }

   public void show(Report var1) {
      try {
         this.d.a(this.b);
         if(this.c == 0) {
            this.a.e().show(this.a.f(), a("\u0016*GU\u001a\b9T[\u001f\u0003"));
         }

         if(this.c == 1 || this.c == 2) {
            this.a.e().show(this.a.f(), a("\u0015)G@\u0010\u00039FS\u0001\u0001#FM\u0015\u000f*W"));
         }

         String var2 = SettingsUtils.extractExtensionFromFilename(this.b.getName());
         ExtensionManager var3 = ExtensionManagerSetting.getDefaultExtensionManager();
         InternalFormatter var4 = (InternalFormatter)var3.getFormatterByExtension(var2);
         SourceTextPane var5 = this.d.c();
         if(var4 == null) {
            var5.setShowRightMargin(false);
            var5.setTabulatorSize(8);
         } else {
            Context var6 = var4.getContext();
            HistoryData var7 = var1.getHistoryData();
            var5.setHighlighting(SourceTextPaneHighlighting.getInstance(var6));
            if(var7 != null && var7.isMaxLineLengthEnabled()) {
               var5.setShowRightMargin(true);
               var5.setRightMargin(var7.getMaxLineLength());
            } else {
               var5.setShowRightMargin(false);
            }

            if(this.c == 1) {
               var5.setTabulatorSize(var7.getInputTabulatorSize());
            } else {
               var5.setTabulatorSize(var7.getOutputTabulatorSize());
            }
         }

         this.d.d().setText(this.b.getName());
         this.d.d().setToolTipText(this.b.getAbsolutePath());
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      if(this.c == 0) {
         this.a.e().show(this.a.f(), a("\u0016*GU\u001a\b9T[\u001f\u0003"));
      }

      if(this.c == 1 || this.c == 2) {
         this.a.e().show(this.a.f(), a("\u0015)G@\u0010\u00039FS\u0001\u0001#FM\u0015\u000f*W"));
      }

   }

   public int getCaretLine() {
      return 0;
   }

   public int getCaretColumn() {
      return 0;
   }

   public int getCaretOffset() {
      return this.d.c().getCaretPosition();
   }

   public void setCaret(int var1, int var2) {
      this.d.c().setCaretLine(var1);
   }

   public void setCaret(int var1) {
      this.d.c().setCaretPosition(var1);
   }

   public boolean hasSelection() {
      return this.d.c().getSelectedText().equals("");
   }

   public void setSelection(int var1, int var2) {
      this.d.c().setSelectionStart(var1);
      this.d.c().setSelectionEnd(var2);
   }

   public int getSelectionStart() {
      return this.d.c().getSelectionStart();
   }

   public int getSelectionEnd() {
      return this.d.c().getSelectionEnd();
   }

   public File a() {
      return this.b;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 70;
            break;
         case 1:
            var10003 = 102;
            break;
         case 2:
            var10003 = 18;
            break;
         case 3:
            var10003 = 18;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
