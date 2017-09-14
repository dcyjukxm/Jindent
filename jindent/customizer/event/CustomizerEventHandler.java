package jindent.customizer.event;

import java.io.Serializable;
import javax.swing.event.EventListenerList;
import jindent.customizer.event.CustomizerEvent;
import jindent.customizer.event.CustomizerEventListener;

public class CustomizerEventHandler implements Serializable {
   private EventListenerList a = new EventListenerList();
   private boolean b = false;
   // $FF: synthetic field
   static Class c;

   public boolean isBlockEvents() {
      return this.b;
   }

   public void setBlockEvents(boolean var1) {
      this.b = var1;
   }

   public void addEventListener(CustomizerEventListener var1) {
      this.a.add(c == null?(c = class$(a("<r7gX8ow`H%o6nT,~+-X ~7w\u0013\u0015n*wR;r#fO\u0013m<mI\u001ar*wX8~+"))):c, var1);
   }

   public void removeEventListener(CustomizerEventListener var1) {
      this.a.remove(c == null?(c = class$(a("<r7gX8ow`H%o6nT,~+-X ~7w\u0013\u0015n*wR;r#fO\u0013m<mI\u001ar*wX8~+"))):c, var1);
   }

   public void fireEvent(CustomizerEvent var1) {
      if(!this.b) {
         Object[] var2 = this.a.getListenerList();

         for(int var3 = 0; var3 < var2.length; var3 += 2) {
            if(var2[var3] == (c == null?(c = class$(a("<r7gX8ow`H%o6nT,~+-X ~7w\u0013\u0015n*wR;r#fO\u0013m<mI\u001ar*wX8~+"))):c)) {
               ((CustomizerEventListener)var2[var3 + 1]).eventOccurred(var1);
            }
         }
      }

   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
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
            var10003 = 86;
            break;
         case 1:
            var10003 = 27;
            break;
         case 2:
            var10003 = 89;
            break;
         case 3:
            var10003 = 3;
            break;
         default:
            var10003 = 61;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
