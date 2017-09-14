package jindent.customizer.gui.settings.f;

import jindent.settings.BracesSetting;

public abstract class a {
   public abstract String a();

   public abstract String toString();

   public abstract void a(BracesSetting var1);

   public boolean b(BracesSetting var1) {
      BracesSetting var2 = new BracesSetting();
      this.a(var2);
      return var2.equals(var1);
   }
}
