package jindent.util.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultiLineLabel extends JPanel {
   public static final int LEFT = 2;
   public static final int RIGHT = 4;
   public static final int CENTER = 0;
   private JLabel[] a;

   public MultiLineLabel(String var1) {
      this(var1, 2);
   }

   public MultiLineLabel(String var1, int var2) {
      jindent.util.d var3 = new jindent.util.d(var1);
      int var4 = var3.a();
      GridLayout var5 = new GridLayout(var4, 1);
      var5.setVgap(3);
      this.setLayout(var5);
      Font var6 = (new JLabel()).getFont();
      super.setFont(var6);
      this.a = new JLabel[var4];

      for(int var7 = 0; var7 < var4; ++var7) {
         String var8 = var3.b();
         this.a[var7] = new JLabel(var8, var2);
         this.a[var7].setFont(var6);
         this.add(this.a[var7]);
      }

   }

   public void setFont(Font var1) {
      super.setFont(var1);
      this.a(var1);
   }

   private void a(Font var1) {
      if(this.a != null) {
         int var2 = this.a.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.a[var3].setFont(var1);
         }
      }

   }

   public void setForeground(Color var1) {
      if(this.a != null) {
         int var2 = this.a.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.a[var3].setForeground(var1);
         }
      }

   }

   public void setEnabled(boolean var1) {
      if(this.a != null) {
         int var2 = this.a.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.a[var3].setEnabled(var1);
         }
      }

   }

   public boolean isEnabled() {
      return this.a == null?false:(this.a.length == 0?false:this.a[0].isEnabled());
   }
}
