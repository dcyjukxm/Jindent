package jindent.customizer.gui.settings;

import jindent.customizer.gui.GUIObject;
import jindent.settings.Setting;

public abstract class SettingGUIObject extends GUIObject {
   protected Setting f;

   public SettingGUIObject(String var1, String var2) {
      super(var1, var2);
   }

   public void setSetting(Setting var1) {
      String var2 = var1.getName();
      if(!var2.equals(this.getName())) {
         throw new RuntimeException(a("s]c\n\u0002SW58\u000bNG|\u0005\tI\u0013t\u0005\n\u001a`p\u001f\u001aS]r,;s|w\u0001\u000bYG5\u001e\u001e^Ra\u000eO0@p\u001f\u001aS]rE\u0000[^pKS\u001a") + var2 + a("0@p\u001f\u001aS]r,;s|w\u0001\u000bYG;\u0005\u000fWV5VN") + this.getName());
      } else {
         this.f = var1;
      }
   }

   public Setting getSetting() {
      return this.f;
   }

   public boolean containsSetting() {
      return this.f != null;
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 58;
            break;
         case 1:
            var10003 = 51;
            break;
         case 2:
            var10003 = 21;
            break;
         case 3:
            var10003 = 107;
            break;
         default:
            var10003 = 110;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
