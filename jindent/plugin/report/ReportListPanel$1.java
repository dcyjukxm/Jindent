package jindent.plugin.report;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import jindent.message.ErrorMessage;
import jindent.message.Message;
import jindent.plugin.editor.PluginEditor;
import jindent.plugin.file.PluginDestinationFile;
import jindent.plugin.file.PluginSourceFile;
import jindent.plugin.report.Report;
import jindent.plugin.report.ReportListPanel;

class ReportListPanel$1 extends MouseAdapter {
   private final ReportListPanel a;

   ReportListPanel$1(ReportListPanel var1) {
      this.a = var1;
   }

   public void mousePressed(MouseEvent var1) {
      if(var1.getClickCount() == 2) {
         int var2 = var1.getX();
         int var3 = var1.getY();
         int var4 = this.a.c.getRowForLocation(var2, var3);
         TreePath var5 = this.a.c.getPathForRow(var4);
         if(var5 != null) {
            DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var5.getLastPathComponent();
            Object var7 = var6.getUserObject();
            if(var7 instanceof Report) {
               Report var8 = (Report)var7;
               PluginSourceFile var9 = var8.getSourceFile();
               PluginDestinationFile var10 = var8.getDestinationFile();
               boolean var11 = var8.getMessageList() != null?var8.getMessageList().containsErrorMessage():false;
               boolean var12 = !var9.getFullFilename().equals(var10.getFullFilename()) && !var11;
               PluginEditor var13 = var9.getEditor();
               if(var13 != null) {
                  var13.show(var8);
               }

               if(var12) {
                  PluginEditor var14 = var10.getEditor();
                  if(var14 != null) {
                     var14.show(var8);
                  }
               }
            }

            if(var7 instanceof Message) {
               Message var18 = (Message)var7;
               DefaultMutableTreeNode var19 = (DefaultMutableTreeNode)var6.getParent();
               Object var20 = var19.getUserObject();
               if(var20 instanceof Report) {
                  Report var21 = (Report)var20;
                  PluginSourceFile var22 = var21.getSourceFile();
                  PluginDestinationFile var23 = var21.getDestinationFile();
                  boolean var24 = var7 instanceof ErrorMessage;
                  boolean var15 = !var22.getFullFilename().equals(var23.getFullFilename()) && !var24;
                  PluginEditor var16 = var22.getEditor();
                  if(var16 != null) {
                     var16.show(var21);
                     if(var18.hasColumnAndLineNumber()) {
                        var16.setCaret(var18.getLine(), var18.getColumn());
                     }
                  }

                  if(var15) {
                     PluginEditor var17 = var23.getEditor();
                     if(var17 != null) {
                        var17.show(var21);
                        if(var18.hasColumnAndLineNumber()) {
                           var17.setCaret(var18.getLine(), var18.getColumn());
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
