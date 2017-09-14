package jindent.customizer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import jindent.customizer.CustomizerData;
import jindent.customizer.CustomizerTabbedPane$1;
import jindent.customizer.CustomizerTabbedPane$2;
import jindent.customizer.CustomizerTreeNode;
import jindent.customizer.SettingsPanel;
import jindent.customizer.gui.elements.GUITab;
import jindent.customizer.preview.PreviewFilterList;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.SwingUtils;

public class CustomizerTabbedPane extends JTabbedPane {
   private ArrayList a;
   private ArrayList b;

   public CustomizerTabbedPane(CustomizerData var1, CustomizerTreeNode var2) {
      this(var1);
      int var3 = var2.countTabs();
      if(var3 == 0) {
         String var4 = var2.getName();
         JPanel var5 = new JPanel();
         var5.setLayout(new BorderLayout());
         var5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         JPanel var6 = new JPanel();
         var6.setLayout(new BorderLayout());
         var6.setLayout(new FlowLayout());
         JLabel var7 = new JLabel(SwingUtils.readImageIcon(a("\u0013lf; \u000f-wo|P1m|<P0y")));
         var7.setBorder(BorderFactory.createEmptyBorder(7, 7, 7, 7));
         var6.add(var7, a("w;m|"));
         var6.add(new MultiLineLabel(a("t1>n{N:>|zE~Ta|D;p|2S;j|{N9m(}F~j`{S~}ifE9qzk*.rmsS;>gbE0>|`E;>afE3>/") + var4 + a("\u0007~\u007ffv\u0000=raqKT") + a("O0>i2C1lzwS.qfvI0y(aU<>f}D;>g`\u00002{it\u0001")), a("c;p|wR"));
         var5.add(var6, a("w;m|"));
         this.addTab(a("i0xg"), var5);
      } else {
         for(int var8 = 0; var8 < var3; ++var8) {
            GUITab var9 = var2.getTab(var8);
            if(!var9.isHidden()) {
               this.addTab(var9.getDesc(), var9.getPreview(), var9.getPreviewFilterList(), new SettingsPanel(var1, var9));
            }
         }
      }

   }

   public CustomizerTabbedPane(CustomizerData var1) {
      this.a = new ArrayList();
      this.b = new ArrayList();
      this.addChangeListener(new CustomizerTabbedPane$1(this, var1));
      this.addAncestorListener(new CustomizerTabbedPane$2(this, var1));
   }

   public void addTab(String var1, String var2, PreviewFilterList var3, Component var4) {
      this.addTab(var1, var4);
      this.a.add(var2);
      this.b.add(var3);
   }

   public String getPreviewAt(int var1) {
      return var1 < this.a.size() && var1 >= 0?(String)this.a.get(var1):null;
   }

   public PreviewFilterList getPreviewFilterListAt(int var1) {
      return var1 < this.b.size() && var1 >= 0?(PreviewFilterList)this.b.get(var1):null;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 32;
            break;
         case 1:
            var10003 = 94;
            break;
         case 2:
            var10003 = 30;
            break;
         case 3:
            var10003 = 8;
            break;
         default:
            var10003 = 18;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
