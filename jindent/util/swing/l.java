package jindent.util.swing;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.event.ChangeListener;
import jindent.util.swing.TristateCheckBox;
import jindent.util.swing.d;
import jindent.util.swing.k;

class l implements ButtonModel {
   private final ButtonModel a;
   private final TristateCheckBox b;

   private l(TristateCheckBox var1, ButtonModel var2) {
      this.b = var1;
      this.a = var2;
   }

   private void a(k var1) {
      if(var1 == TristateCheckBox.NOT_SELECTED) {
         this.a.setArmed(false);
         this.setPressed(false);
         this.setSelected(false);
      } else if(var1 == TristateCheckBox.SELECTED) {
         this.a.setArmed(false);
         this.setPressed(false);
         this.setSelected(true);
      } else {
         this.a.setArmed(true);
         this.setPressed(true);
         this.setSelected(true);
      }

   }

   private k a() {
      return this.isSelected() && !this.isArmed()?TristateCheckBox.SELECTED:(this.isSelected() && this.isArmed()?TristateCheckBox.DONT_CARE:TristateCheckBox.NOT_SELECTED);
   }

   private void b() {
      k var1 = this.a();
      if(var1 == TristateCheckBox.NOT_SELECTED) {
         this.a(TristateCheckBox.SELECTED);
      } else if(var1 == TristateCheckBox.SELECTED) {
         this.a(TristateCheckBox.DONT_CARE);
      } else if(var1 == TristateCheckBox.DONT_CARE) {
         this.a(TristateCheckBox.NOT_SELECTED);
      }

   }

   public void setArmed(boolean var1) {
   }

   public void setEnabled(boolean var1) {
      this.b.setFocusable(var1);
      this.a.setEnabled(var1);
   }

   public boolean isArmed() {
      return this.a.isArmed();
   }

   public boolean isSelected() {
      return this.a.isSelected();
   }

   public boolean isEnabled() {
      return this.a.isEnabled();
   }

   public boolean isPressed() {
      return this.a.isPressed();
   }

   public boolean isRollover() {
      return this.a.isRollover();
   }

   public void setSelected(boolean var1) {
      this.a.setSelected(var1);
   }

   public void setPressed(boolean var1) {
      this.a.setPressed(var1);
   }

   public void setRollover(boolean var1) {
      this.a.setRollover(var1);
   }

   public void setMnemonic(int var1) {
      this.a.setMnemonic(var1);
   }

   public int getMnemonic() {
      return this.a.getMnemonic();
   }

   public void setActionCommand(String var1) {
      this.a.setActionCommand(var1);
   }

   public String getActionCommand() {
      return this.a.getActionCommand();
   }

   public void setGroup(ButtonGroup var1) {
      this.a.setGroup(var1);
   }

   public void addActionListener(ActionListener var1) {
      this.a.addActionListener(var1);
   }

   public void removeActionListener(ActionListener var1) {
      this.a.removeActionListener(var1);
   }

   public void addItemListener(ItemListener var1) {
      this.a.addItemListener(var1);
   }

   public void removeItemListener(ItemListener var1) {
      this.a.removeItemListener(var1);
   }

   public void addChangeListener(ChangeListener var1) {
      this.a.addChangeListener(var1);
   }

   public void removeChangeListener(ChangeListener var1) {
      this.a.removeChangeListener(var1);
   }

   public Object[] getSelectedObjects() {
      return this.a.getSelectedObjects();
   }

   static void a(l var0) {
      var0.b();
   }

   l(TristateCheckBox var1, ButtonModel var2, d var3) {
      this(var1, var2);
   }

   static void a(l var0, k var1) {
      var0.a(var1);
   }

   static k b(l var0) {
      return var0.a();
   }
}
