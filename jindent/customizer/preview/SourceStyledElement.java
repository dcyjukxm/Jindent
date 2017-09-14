package jindent.customizer.preview;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.Element;

public class SourceStyledElement implements Element {
   String a;
   AttributeSet b;
   Document c;
   List d;
   Element e;
   int f;
   int g;

   public SourceStyledElement(Document var1, Element var2, String var3, int var4, int var5, AttributeSet var6) {
      this.c = var1;
      this.e = var2;
      this.a = var3;
      this.f = var4;
      this.g = var5;
      this.b = var6;
      this.d = null;
   }

   public AttributeSet getAttributes() {
      return this.b;
   }

   public Document getDocument() {
      return this.c;
   }

   public Element getElement(int var1) {
      return this.d != null?(Element)this.d.get(var1):null;
   }

   public int getElementCount() {
      return this.d != null?this.d.size():0;
   }

   public int getElementIndex(int var1) {
      if(this.isLeaf()) {
         return -1;
      } else {
         int var2 = var1;

         for(int var3 = 0; var3 < this.d.size(); ++var3) {
            Element var4 = (Element)this.d.get(var3);
            if(var1 < var4.getStartOffset()) {
               if(var4.getStartOffset() - var1 < var2) {
                  return var3;
               }

               return var3 - 1;
            }

            if(var1 < var4.getEndOffset()) {
               return var3;
            }

            var2 = var1 - var4.getEndOffset();
         }

         return -1;
      }
   }

   public int getEndOffset() {
      return this.f + this.g;
   }

   public String getName() {
      return this.a;
   }

   public Element getParentElement() {
      return this.e;
   }

   public int getStartOffset() {
      return this.f;
   }

   public boolean isLeaf() {
      return this.d == null;
   }

   public void append(Document var1, int var2, AttributeSet var3, boolean var4) {
      SourceStyledElement var5;
      if(this.d == null) {
         this.d = new ArrayList(1000);
         var5 = new SourceStyledElement(var1, this, a("Kg`KdIgbB"), 0, 0, this.b);
         var5.d = new ArrayList(10);
         this.d.add(var5);
      }

      var5 = (SourceStyledElement)this.d.get(this.d.size() - 1);
      SourceStyledElement var6 = new SourceStyledElement(var1, var5, a("Xi|^fUr"), this.g, var2, var3);
      var5.d.add(var6);
      var5.g += var2;
      this.g += var2;
      if(var4) {
         SourceStyledElement var7 = new SourceStyledElement(var1, this, a("Kg`KdIgbB"), this.g, 0, this.b);
         var7.d = new ArrayList(10);
         this.d.add(var7);
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
            var10003 = 59;
            break;
         case 1:
            var10003 = 6;
            break;
         case 2:
            var10003 = 18;
            break;
         case 3:
            var10003 = 42;
            break;
         default:
            var10003 = 3;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
