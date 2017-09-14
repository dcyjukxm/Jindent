package jindent.java;

import jindent.formatter.Context;
import jindent.formatter.b.k;
import jindent.java.a.m;
import jindent.java.a.n;
import jindent.java.a.p;
import jindent.message.WarningMessage;
import jindent.settings.sorter.SorterElement;

public class g {
   protected static SorterElement a;
   protected static SorterElement b;
   protected Context c;

   public g(Context var1) {
      this.c = var1;
      SorterElement var2 = (SorterElement)var1.getSorterElement(a("3\u001d|Xe.4iT{;\u0002mC~5\u001e\u007fdx(\u0004iE")).clone();
      a = (SorterElement)var1.getSorterElement(a(".\t|RS?\u0013`Ve;\u0004eXy)#cEc?\u0002")).clone();
      b = var1.getSorterElement(a("9\u001cmDd\u0013\u001exRe<\u0011oRR4\u0005asr9\u001cmEv.\u0019cYd\t\u001f~Cr("));
      if(!var1.getBoolean(a(")\u001f~CC#\u0000isr9\u001cmEv.\u0019cYd"))) {
         a.removeAllChildren();
      }

      if(!var1.getBoolean(a(")\u001f~C^7\u0000cEc\u001e\u0015o[v(\u0011x^x4\u0003"))) {
         ((SorterElement)var2.getFirstChild()).removeAllChildren();
      }

      if(!var1.getBoolean(a(")\u001f~CT6\u0011\u007fD^4\u0004iEq;\u0013iry/\u001dHRt6\u0011~Vc3\u001fbD"))) {
         b.removeAllChildren();
      }

      a.insert((SorterElement)var2.getFirstChild(), 0);
   }

   public void a(jindent.formatter.b.h var1, k var2) {
      if(this.c.getBoolean(a(")\u001f~CC#\u0000isr9\u001cmEv.\u0019cYd")) || this.c.getBoolean(a(")\u001f~C^7\u0000cEc\u001e\u0015o[v(\u0011x^x4\u0003")) || this.c.getBoolean(a(")\u001f~CT6\u0011\u007fD^4\u0004iEq;\u0013iry/\u001dHRt6\u0011~Vc3\u001fbD"))) {
         if(var1 == null) {
            this.a(var2, a, this.c.getBoolean(a(")\u001f~CC#\u0000isr9\u001cmEv.\u0019cYd")));
         } else if(var1 instanceof m || var1 instanceof p || var1 instanceof n) {
            this.a(var2, b, this.c.getBoolean(a(")\u001f~CT6\u0011\u007fD^4\u0004iEq;\u0013iry/\u001dHRt6\u0011~Vc3\u001fbD")));
         }

      }
   }

   private void a(k var1, SorterElement var2, boolean var3) {
      boolean var4 = this.c.getBoolean(a("/\u0003itv)\u0015_Ry)\u0019x^a?>mZr\t\u001f~C~4\u0017"));
      boolean var5 = false;
      int var6 = var2.getSortId();
      int var7 = var1.a();

      int var8;
      jindent.formatter.b.h var9;
      int var13;
      for(var8 = 1; var8 < var7; ++var8) {
         var9 = var1.a(var8);
         if(var9.h() && var9.j()) {
            var9.b(var3);
            int var10 = var8;

            for(int var11 = var8 - 1; var11 >= 0; --var11) {
               jindent.formatter.b.h var12 = var1.a(var11);
               if(var12.h() && var12.j()) {
                  var12.b(var3);
                  var13 = SorterElement.compareElements(var2, var9, var12, var4);
                  if(var13 != -1) {
                     break;
                  }

                  var1.b(var10);
                  var1.b(var9, var11);
                  var10 = var11;
               }
            }
         } else if(!var9.j()) {
            var5 = true;
         }
      }

      for(var8 = 0; var8 < var7; ++var8) {
         var9 = var1.a(var8);
         if(var9 instanceof jindent.formatter.b.a) {
            jindent.formatter.b.a var15 = (jindent.formatter.b.a)var9;
            if(var15.b()) {
               jindent.formatter.b.h var16 = (jindent.formatter.b.h)var15.a();
               int var17 = var1.b(var9);
               var13 = var1.b(var16);
               if(var17 < var13) {
                  var1.b(var17);
                  var1.b(var9, var13);
                  --var8;
               }
            }
         }
      }

      if(var5) {
         String var14 = a("\u0003\u001fy\u0017`;\u001ex\u0017]3\u001ehRy.PxX7)\u001f~C7)\u001fyEt?PoXs?P{_~9\u0018,Tx4\u0004m^y)PmC76\u0015mDcz\u001fbR7u_F\u001a79\u001faZr4\u0004\"\u0017C2\u0019\u007f\u0017z;\t,Tv/\u0003i\u0017~7\u0000~Xg?\u0002,Dx(\u0004eYpz\u0002iDb6\u0004\u007f\u0016");
         this.c.addMessage(new WarningMessage(this.c.getLanguage(), var14, 3));
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
            var10003 = 90;
            break;
         case 1:
            var10003 = 112;
            break;
         case 2:
            var10003 = 12;
            break;
         case 3:
            var10003 = 55;
            break;
         default:
            var10003 = 23;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
