package jindent.formatter;

import java.util.ArrayList;
import jindent.formatter.Caret;
import jindent.formatter.g;
import jindent.formatter.q;

public class CaretHistoryMapper {
   private ArrayList a = new ArrayList();

   public void addToken(q var1) {
      if(var1.c != 0 && var1.e != 0 && var1.b != 0 && var1.d != 0) {
         this.a.add(new g(var1, var1.b, var1.c, var1.d, var1.e));
         if(var1.c == 0 && var1.b == 0) {
            ;
         }
      }

   }

   public Caret getNewPositionCaret(Caret var1) {
      if(this.a.size() == 0) {
         return null;
      } else {
         Caret var2 = this.findCaret(var1);
         return var2 == null?null:new Caret(var2.getLine(), var2.getColumn() + 1);
      }
   }

   private Caret findCaret(Caret var1) {
      int var2 = this.a.size();
      int var3 = 0;
      int var4 = var2 - 1;

      while(var4 >= var3) {
         int var5 = (var3 + var4) / 2;
         g var6 = (g)this.a.get(var5);
         g var7 = var5 + 1 < var2?(g)this.a.get(var5 + 1):null;
         q var8 = var6.e();
         if(var6.a(var1)) {
            return new Caret(var8.b, var8.c);
         }

         if(this.isBetween(var1, var6, var7)) {
            return this.findClosestBounds(var1, var6, var7);
         }

         if(this.compareCarets(var1, var6) == -1) {
            var4 = var5 - 1;
         } else if(this.compareCarets(var1, var6) == 1) {
            var3 = var5 + 1;
         }
      }

      return null;
   }

   private Caret findClosestBounds(Caret var1, g var2, g var3) {
      double var4 = var2 == null?Double.MAX_VALUE:var1.distanceTo(new Caret(var2.d(), var2.c()));
      double var6 = var3 == null?Double.MAX_VALUE:var1.distanceTo(new Caret(var3.b(), var3.a()));
      q var8;
      if(var4 <= var6) {
         var8 = var2.e();
         return new Caret(var8.d, var8.e);
      } else {
         var8 = var3.e();
         return new Caret(var8.b, var8.c);
      }
   }

   private boolean isBetween(Caret var1, g var2, g var3) {
      return var3 == null?var1.getLine() == var2.d() && var2.c() < var1.getColumn() || var2.d() < var1.getLine():var1.getLine() == var2.d() && var3.b() == var1.getLine() && var2.c() < var1.getColumn() && var1.getColumn() < var3.a() || var2.d() == var1.getLine() && var2.c() < var1.getColumn() && var1.getLine() < var3.b() || var2.d() < var1.getLine() && var1.getColumn() < var3.c() && var1.getLine() == var3.b() || var2.d() < var1.getLine() && var1.getLine() < var3.d();
   }

   private int compareCarets(Caret var1, g var2) {
      return var1.getLine() < var2.b()?-1:(var2.d() < var1.getLine()?1:(var1.getColumn() < var2.a()?-1:(var2.c() < var1.getColumn()?1:0)));
   }
}
