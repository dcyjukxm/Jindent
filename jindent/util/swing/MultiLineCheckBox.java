package jindent.util.swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import jindent.util.swing.MultiLineLabel;
import jindent.util.swing.e;

public class MultiLineCheckBox extends JPanel {
   public static final int ALIGN_CHECK_BOX_TOP = 1;
   public static final int ALIGN_CHECK_BOX_MIDDLE = 2;
   private int a = 1;
   private JCheckBox b;
   private MultiLineLabel c;

   public MultiLineCheckBox(String var1, boolean var2) {
      super(new FlowLayout(3, 0, 0));
      this.setBorder(new EmptyBorder(0, 0, 0, 0));
      this.c = new MultiLineLabel(var1);
      this.b = new JCheckBox("", var2);
      this.add(this.b);
      this.add(this.c);
      this.c.addMouseListener(new e(this));
   }

   public void a(ItemListener var1) {
      this.b.addItemListener(var1);
   }

   public void setFont(Font var1) {
      if(this.c != null) {
         this.c.setFont(var1);
      }

   }

   public void setEnabled(boolean var1) {
      this.c.setEnabled(var1);
      this.b.setEnabled(var1);
   }

   public boolean isEnabled() {
      return this.c.isEnabled();
   }

   public boolean a() {
      return this.b.isSelected();
   }

   public void a(boolean var1) {
      this.b.setSelected(var1);
   }

   static JCheckBox a(MultiLineCheckBox var0) {
      return var0.b;
   }
}
