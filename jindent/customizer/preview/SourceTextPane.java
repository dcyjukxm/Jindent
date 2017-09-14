package jindent.customizer.preview;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Vector;
import javax.swing.JTextPane;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import jindent.customizer.preview.ExtendedStringTokenizer;
import jindent.customizer.preview.SourceDocument;
import jindent.customizer.preview.SourceTextPane$1;
import jindent.customizer.preview.SourceTextPaneHighlighting;
import jindent.customizer.preview.a.NoWrapEditorKit;
import jindent.formatter.i;
import jindent.util.swing.SwingUtils;

public class SourceTextPane extends JTextPane {
   public static final float DEFAULT_FONT_SIZE = 12.0F;
   public static final Font DEFAULT_FONT = new Font(a("k\bf+bV\u0006k!u"), 0, 12);
   private static final String a = "¶";
   private static final String b = ">";
   private static final String c = "·";
   private static final Color d = new Color(185, 185, 200);
   private SourceDocument e;
   private int f;
   private String g;
   private String h;
   private String i;
   private int j;
   private boolean k;
   private boolean l;
   private boolean m;
   private boolean n;
   private int o;
   private Vector p;
   private SourceTextPaneHighlighting q;
   private int r;
   private int s;
   private int t;
   private boolean u;
   private GradientPaint v;

   public SourceTextPane() {
      this(SourceTextPaneHighlighting.getInstance());
   }

   public SourceTextPane(SourceTextPaneHighlighting var1) {
      this.f = 8;
      this.g = a("\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000bJ%i<\u000b");
      this.h = a("\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006G(d1\u0006");
      this.i = "";
      this.u = false;
      this.q = var1;
      this.setEditorKit(new NoWrapEditorKit());
      this.l = false;
      this.m = true;
      this.n = false;
      this.t = -1;
      this.addMouseListener(new SourceTextPane$1(this));
      this.init();
   }

   private void init() {
      this.initFont(12.0F);
      this.p = new Vector();
      this.t = -1;
      this.setRightMargin(80);
      this.setEditable(false);
      this.setText(" ");
   }

   public void initFont(float var1) {
      Font var2 = this.q.createFont(DEFAULT_FONT, var1);
      this.r = (int)SwingUtils.getMaxWidthOfFontSize(var2, var1);
      this.s = (int)var1;
      this.setFont(var2);
   }

   public void setTabulatorSize(int var1) {
      this.f = var1;
      this.refreshText();
   }

   public void setRightMargin(int var1) {
      this.j = var1;
   }

   public int getRightMargin() {
      return this.j;
   }

   public boolean getShowRightMargin() {
      return this.k;
   }

   public void setShowRightMargin(boolean var1) {
      this.k = var1;
   }

   public int getTabSize() {
      return this.f;
   }

   public int getMaxColumn() {
      return this.o;
   }

   public void setShowSpaces(boolean var1) {
      this.l = var1;
      this.refreshText();
   }

   public boolean getShowSpaces() {
      return this.l;
   }

   public void setShowTabStops(boolean var1) {
      this.m = var1;
      this.refreshText();
   }

   public boolean getShowTabStops() {
      return this.m;
   }

   public void setShowLineBreaks(boolean var1) {
      this.n = var1;
      this.refreshText();
   }

   public boolean getShowLineBreaks() {
      return this.n;
   }

   public void setText(String var1) {
      this.i = var1;
      this.refreshText();
   }

   public String getText() {
      return this.i;
   }

   private void addLineAndOffset(int var1, int var2) {
      --var1;
      this.p.add(new Integer(var2));
   }

   private void refreshText() {
      i var1 = new i();
      this.p.removeAllElements();
      this.e = new SourceDocument(this.q.getStyleContext());
      this.o = 0;
      if(this.i != null && !this.i.equals("")) {
         ExtendedStringTokenizer var2 = new ExtendedStringTokenizer(this.i, this.q.getDelimiters() + a(",j\u0001"), true, 5);
         Style var3 = this.q.getDefaultStyle();
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         boolean var7 = false;
         boolean var8 = false;
         String var9 = "";
         String var10 = "";
         StringBuffer var11 = new StringBuffer("");
         int var13 = 0;
         int var14 = 1;
         int var15 = 0;
         boolean var16 = true;
         int var18 = 0;
         boolean var19 = false;
         Style var20 = this.q.getDefaultStyle();
         this.addLineAndOffset(var14, var18);
         this.e.appendString("\n", var20, false);

         for(; var2.hasMoreElements(); var18 += var10.length()) {
            boolean var12 = false;
            var8 = false;
            var9 = var10;
            var10 = var2.nextToken();
            boolean var21 = false;
            if(var10.equals("*") && var9.equals("/")) {
               var5 = true;
               --var18;
               --var13;
               var11.setLength(var11.length() - 1);
               var10 = var9 + var10;
               var20 = this.q.getDefaultStyle();
            } else if(var10.equals("/") && var9.equals("*")) {
               var5 = false;
               var12 = true;
            } else if(var10.equals("/") && var9.equals("/") && !var5 && !var4) {
               if(!var6) {
                  var6 = true;
                  --var13;
                  --var18;
                  var11.setLength(var11.length() - 1);
                  var10 = var9 + var10;
                  var20 = this.q.getDefaultStyle();
               }
            } else if(var10.equals("\t")) {
               var12 = true;
               int var22 = this.f - var13 % this.f;
               if(this.m) {
                  var3 = this.q.getSymbolStyle();
                  var10 = this.g.substring(0, var22 - 1) + ">";
               } else {
                  var10 = this.h.substring(0, var22);
               }
            } else if(var10.equals(" ")) {
               if(this.l) {
                  var3 = this.q.getSymbolStyle();
                  var10 = "·";
               }

               var12 = true;
            } else if(var10.equals("\r")) {
               var6 = false;
               var12 = true;
               this.o = Math.max(var13, this.o);
               var13 = 0;
               ++var14;
               var21 = true;
               var1.b();
               this.addLineAndOffset(var14, var18);
            } else if(var10.equals("\n")) {
               var1.d();
               if(!var9.equals("\r")) {
                  var6 = false;
                  var12 = true;
                  this.o = Math.max(var13, this.o);
                  var13 = 0;
                  ++var14;
                  var21 = true;
                  this.addLineAndOffset(var14, var18);
               }
            } else if(var10.equals("\"") && var15 % 2 == 0 && !var5 && !var6) {
               var4 = !var4;
               var12 = !var4;
            } else if(var10.charAt(0) >= 48 && var10.charAt(0) <= 57 && !var5 && !var6 && !var4) {
               var8 = true;
            }

            if(var10.equals("\\")) {
               ++var15;
            } else {
               var15 = 0;
            }

            if(!var12) {
               if(var4) {
                  var3 = this.q.getStringStyle();
               } else if(!var5 && !var6) {
                  if(var7) {
                     var3 = var20;
                  } else if(var8) {
                     var3 = this.q.getC2Style();
                  } else {
                     if(var10.startsWith("<") || var10.startsWith("%")) {
                        StringBuffer var25 = new StringBuffer(var10);

                        for(int var23 = 1; var23 < 4; ++var23) {
                           String var24 = var2.peekNextToken(var23);
                           if(!var24.equals("\n") && !var24.equals("\r")) {
                              var25.append(var24);
                           } else {
                              var24 = null;
                           }

                           if((var24 == null || this.q.isDelimiter(var24)) && this.q.hasHighlightStyle(var25.toString())) {
                              var10 = var25.toString();
                              var12 = true;
                              var2.consumeTokens(var23);
                              break;
                           }
                        }
                     }

                     var3 = this.q.getHighlightStyle(var10);
                  }
               } else {
                  var3 = this.q.getCommentStyle();
               }
            }

            if(var21 || var3 != var20 && var11.length() > 0) {
               if(this.n && var21) {
                  this.e.appendString(var11.toString(), var20, false);
                  this.e.appendString("¶", this.q.getSymbolStyle(), true);
                  ++var18;
               } else {
                  this.e.appendString(var11.toString(), var20, var21);
               }

               var11.setLength(0);
            }

            var11.append(var10);
            var20 = var3;
            if(!var10.equals("\n") && !var10.equals("\r")) {
               var13 += var10.length();
            }
         }

         this.e.appendString(var11.toString(), var20, true);
         this.setDocument(this.e);
      } else {
         this.e.appendString(" ", this.q.getDefaultStyle(), false);
         this.setDocument(this.e);
      }
   }

   public void setWordWrap(boolean var1) {
      this.u = var1;
   }

   public boolean getWordWrap() {
      return this.u;
   }

   public boolean getScrollableTracksViewportWidth() {
      if(!this.u) {
         Container var6 = this.getParent();
         TextUI var2 = this.getUI();
         int var3 = var2.getPreferredSize(this).width;
         int var4 = var6.getSize().width;
         boolean var5 = var6 != null?var2.getPreferredSize(this).width < var6.getSize().width:true;
         return var5;
      } else {
         boolean var1 = super.getScrollableTracksViewportWidth();
         return var1;
      }
   }

   public void setBounds(int var1, int var2, int var3, int var4) {
      if(this.u) {
         super.setBounds(var1, var2, var3, var4);
      } else {
         Dimension var5 = this.getPreferredSize();
         super.setBounds(var1, var2, Math.max(var5.width, var3), Math.max(var5.height, var4));
      }

   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var2;
      if(this.t != -1) {
         try {
            var2 = this.lineToOffset(this.t);
            Rectangle var3 = this.modelToView(var2);
            if(var3 != null) {
               var3.x = 0;
               var3.width = this.getWidth();
               Graphics2D var4 = (Graphics2D)var1;
               var4.setColor(new Color(255, 255, 0, 80));
               var4.fillRect(var3.x, var3.y, var3.width, var3.height);
            }
         } catch (BadLocationException var5) {
            ;
         }
      }

      if(this.k) {
         var2 = this.r * this.j + 2;
         Dimension var6 = this.getSize();
         int var7 = (int)var6.getHeight();
         var1.setColor(d);
         var1.drawLine(var2, 0, var2, var7);
      }

   }

   public void setHighlighting(SourceTextPaneHighlighting var1) {
      this.q = var1;
      this.initFont((float)this.getFont().getSize());
   }

   public void setShowLine(int var1) {
      this.t = var1;
      this.repaint();
   }

   private int lineToOffset(int var1) {
      return var1 < 0?-1:(var1 >= this.p.size()?-1:((Integer)this.p.elementAt(var1)).intValue());
   }

   private int offsetToLine(int var1) {
      int var2 = this.p.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.lineToOffset(var3);
         if(var4 >= var1) {
            return var3;
         }
      }

      return -1;
   }

   public void setCaretLine(int var1) {
      int var2 = this.lineToOffset(var1);
      if(var2 != -1) {
         this.setShowLine(var1);
         this.setCaretPosition(var2);
      } else {
         this.setShowLine(-1);
      }

   }

   static int access$000(SourceTextPane var0, int var1) {
      return var0.offsetToLine(var1);
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 38;
            break;
         case 1:
            var10003 = 103;
            break;
         case 2:
            var10003 = 8;
            break;
         case 3:
            var10003 = 68;
            break;
         default:
            var10003 = 17;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
