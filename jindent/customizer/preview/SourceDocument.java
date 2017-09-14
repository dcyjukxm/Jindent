package jindent.customizer.preview;

import java.awt.Color;
import java.awt.Font;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import javax.swing.text.StringContent;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import jindent.customizer.preview.SourceStyledElement;

public class SourceDocument implements StyledDocument {
   private StringContent a;
   private DefaultStyledDocument b;
   private SourceStyledElement c;

   public SourceDocument(StyleContext var1) {
      this.b = new DefaultStyledDocument(var1);
      this.a = new StringContent();
      this.c = new SourceStyledElement(this, (Element)null, a("F\tSdGZ\u0002"), 0, 0, var1.getStyle(a("Q\tVq[Y\u0018")));
   }

   public Style addStyle(String var1, Style var2) {
      return this.b.addStyle(var1, var2);
   }

   public void removeStyle(String var1) {
      this.b.removeStyle(var1);
   }

   public Style getStyle(String var1) {
      return this.b.getStyle(var1);
   }

   public void setCharacterAttributes(int var1, int var2, AttributeSet var3, boolean var4) {
      throw new UnsupportedOperationException(a("x\tDxAQLCuZv\u0004QbOV\u0018UboA\u0018ByL@\u0018Uc\u0006\u001cL^\u007fZ\u0015\u0015Ud\u000e\\\u0001@|KX\t^dKQB"));
   }

   public void setParagraphAttributes(int var1, int var2, AttributeSet var3, boolean var4) {
      throw new UnsupportedOperationException(a("x\tDxAQLCuZe\rBqIG\r@xoA\u0018ByL@\u0018Uc\u0006\u001cL^\u007fZ\u0015\u0015Ud\u000e\\\u0001@|KX\t^dKQB"));
   }

   public void setLogicalStyle(int var1, Style var2) {
      throw new UnsupportedOperationException(a("x\tDxAQLCuZy\u0003WyMT\u0000cdWY\t\u00189\u000e[\u0003D0WP\u0018\u0010yCE\u0000U}K[\u0018Ut\u0000"));
   }

   public Style getLogicalStyle(int var1) {
      throw new UnsupportedOperationException(a("x\tDxAQLCuZy\u0003WyMT\u0000cdWY\t\u00189\u000e[\u0003D0WP\u0018\u0010yCE\u0000U}K[\u0018Ut\u0000"));
   }

   public Element getParagraphElement(int var1) {
      Element var2 = this.c.getElement(this.c.getElementIndex(var1));
      return var2;
   }

   public Element getCharacterElement(int var1) {
      Element var2 = this.c.getElement(this.c.getElementIndex(var1));
      return var2;
   }

   public Color getForeground(AttributeSet var1) {
      return this.b.getForeground(var1);
   }

   public Color getBackground(AttributeSet var1) {
      return this.b.getBackground(var1);
   }

   public Font getFont(AttributeSet var1) {
      return this.b.getFont(var1);
   }

   public int getLength() {
      return this.a.length();
   }

   public void addDocumentListener(DocumentListener var1) {
      this.b.addDocumentListener(var1);
   }

   public void removeDocumentListener(DocumentListener var1) {
      this.b.removeDocumentListener(var1);
   }

   public void addUndoableEditListener(UndoableEditListener var1) {
      this.b.addUndoableEditListener(var1);
   }

   public void removeUndoableEditListener(UndoableEditListener var1) {
      this.b.removeUndoableEditListener(var1);
   }

   public Object getProperty(Object var1) {
      return this.b.getProperty(var1);
   }

   public void putProperty(Object var1, Object var2) {
      this.b.putProperty(var1, var2);
   }

   public void remove(int var1, int var2) throws BadLocationException {
      throw new UnsupportedOperationException(a("x\tDxAQLY~]P\u001eDCZG\u0005^w\u0006\u001cL^\u007fZ\u0015\u0015Ud\u000e\\\u0001@|KX\t^dKQB"));
   }

   public void insertString(int var1, String var2, AttributeSet var3) throws BadLocationException {
      throw new UnsupportedOperationException(a("x\tDxAQLY~]P\u001eDCZG\u0005^w\u0006\u001cL^\u007fZ\u0015\u0015Ud\u000e\\\u0001@|KX\t^dKQB"));
   }

   public String getText(int var1, int var2) throws BadLocationException {
      return this.a.getString(var1, var2);
   }

   public void getText(int var1, int var2, Segment var3) throws BadLocationException {
      if(var2 < 0) {
         throw new BadLocationException(a("y\t^wZ]L]e]ALRu\u000eE\u0003CyZ\\\u001aU"), var2);
      } else {
         this.a.getChars(var1, var2, var3);
      }
   }

   public Position getStartPosition() {
      Position var1;
      try {
         var1 = this.createPosition(0);
      } catch (BadLocationException var3) {
         var1 = null;
      }

      return var1;
   }

   public Position getEndPosition() {
      Position var1;
      try {
         var1 = this.createPosition(this.a.length());
      } catch (BadLocationException var3) {
         var1 = null;
      }

      return var1;
   }

   public Position createPosition(int var1) throws BadLocationException {
      return this.a.createPosition(var1);
   }

   public Element[] getRootElements() {
      Element[] var1 = new Element[]{this.c};
      return var1;
   }

   public Element getDefaultRootElement() {
      return this.c;
   }

   public void render(Runnable var1) {
      try {
         var1.run();
      } finally {
         ;
      }
   }

   public void appendString(String var1, AttributeSet var2, boolean var3) {
      try {
         if(this.a.length() == 0) {
            this.a.insertString(0, var1);
         } else {
            this.a.insertString(this.a.length() - 1, var1);
         }
      } catch (Exception var5) {
         ;
      }

      this.c.append(this, var1.length(), var2, var3);
   }

   public void dump() {
      int var1 = this.c.getElementCount();

      for(int var2 = 0; var2 < var1; ++var2) {
         Element var3 = this.c.getElement(var2);
         int var4 = var3.getStartOffset();
         int var5 = var3.getEndOffset();
         System.out.print("(" + var4 + "-" + var5 + a("\u001cL\n0"));
         int var6 = var3.getElementCount();

         for(int var7 = 0; var7 < var6; ++var7) {
            Element var8 = var3.getElement(var7);
            int var9 = var8.getStartOffset();
            int var10 = var8.getEndOffset();
            System.out.print("(" + var9 + "-" + var10 + ")");
         }

         System.out.println();
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
            var10003 = 53;
            break;
         case 1:
            var10003 = 108;
            break;
         case 2:
            var10003 = 48;
            break;
         case 3:
            var10003 = 16;
            break;
         default:
            var10003 = 46;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
