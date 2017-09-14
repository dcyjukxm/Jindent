package jindent.customizer;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import jindent.JindentSettings;
import jindent.Settings;
import jindent.customizer.CustomizerData$1;
import jindent.customizer.CustomizerTreeNode;
import jindent.customizer.constraint.ConstraintsHandler;
import jindent.customizer.event.CustomizerEventHandler;
import jindent.customizer.gui.GUIObject;
import jindent.customizer.gui.elements.GUITab;
import jindent.customizer.gui.settings.SettingGUIObject;
import jindent.settings.Setting;

public class CustomizerData {
   protected CustomizerEventHandler a = new CustomizerEventHandler();
   protected ConstraintsHandler b = new ConstraintsHandler();
   protected boolean c = false;
   protected Settings d;
   protected CustomizerTreeNode e;

   public CustomizerData() {
      this.a.addEventListener(new CustomizerData$1(this));
      this.d = null;
   }

   public Settings getConnectedSettings() {
      return (Settings)this.d.clone();
   }

   public JindentSettings getConnectedJindentSettings() {
      return (JindentSettings)((JindentSettings)this.d).clone();
   }

   public void connectSettings(Settings var1) {
      this.connectSettingsAndGUIObjects(var1);
      this.updateGUI();
   }

   public CustomizerEventHandler getEventHandler() {
      return this.a;
   }

   public ConstraintsHandler getConstraintsHandler() {
      return this.b;
   }

   public boolean isChanged() {
      return this.c;
   }

   public void setChanged(boolean var1) {
      this.c = var1;
   }

   public CustomizerTreeNode getRoot() {
      return this.e;
   }

   public void setRoot(CustomizerTreeNode var1) {
      this.e = var1;
   }

   public void updateGUI() {
      boolean var1 = false;
      HashMap var2 = this.getAllGUIObjects();
      Iterator var3 = var2.values().iterator();

      while(var3.hasNext()) {
         GUIObject var4 = (GUIObject)var3.next();

         try {
            if(var4.isAddedToJPanel()) {
               var4.updateJPanel();
               var1 = true;
            }
         } catch (Exception var6) {
            throw new IllegalStateException(a("ix+}s\f}1{mI*,beM~0|f\fy<fuEd>(!") + var4.getName(), var6);
         }
      }

      if(var1) {
         this.getConstraintsHandler().update();
      }

   }

   private void connectSettingsAndGUIObjects(Settings var1) {
      this.d = var1;
      HashMap var2 = this.getAllGUIObjects();
      Iterator var3 = var1.settingsIterator();

      while(var3.hasNext()) {
         Setting var4 = (Setting)var3.next();
         String var5 = var4.getName();
         GUIObject var6 = (GUIObject)var2.get(var5);
         if(var6 instanceof SettingGUIObject) {
            ((SettingGUIObject)var6).setSetting(var4);
         }
      }

   }

   public GUIObject getGUIObject(String var1) {
      HashMap var2 = this.getAllGUIObjects();
      GUIObject var3 = (GUIObject)var2.get(var1);
      return var3;
   }

   public CustomizerTreeNode getCustomizerTreeNode(String var1) {
      Enumeration var2 = this.e.postorderEnumeration();

      CustomizerTreeNode var3;
      do {
         if(!var2.hasMoreElements()) {
            return null;
         }

         var3 = (CustomizerTreeNode)var2.nextElement();
      } while(!var3.getName().equals(var1));

      return var3;
   }

   public GUITab getGUITab(CustomizerTreeNode var1, String var2) {
      int var3 = var1.countTabs();

      for(int var4 = 0; var4 < var3; ++var4) {
         GUITab var5 = var1.getTab(var4);
         if(var5.getDesc().equals(var2)) {
            return var5;
         }
      }

      return null;
   }

   public HashMap getAllGUIObjects() {
      HashMap var1 = new HashMap();
      Enumeration var2 = this.e.postorderEnumeration();

      while(var2.hasMoreElements()) {
         CustomizerTreeNode var3 = (CustomizerTreeNode)var2.nextElement();
         int var4 = var3.countTabs();

         for(int var5 = 0; var5 < var4; ++var5) {
            GUITab var6 = var3.getTab(var5);
            addGUITab(var1, var6);
         }
      }

      return var1;
   }

   private static void addGUITab(HashMap var0, GUITab var1) {
      int var2 = var1.countGUIObjects();

      for(int var3 = 0; var3 < var2; ++var3) {
         GUIObject var4 = var1.getGUIObject(var3);
         if(var4 instanceof GUITab) {
            addGUITab(var0, (GUITab)var4);
         } else {
            var0.put(var4.getName(), var4);
         }
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
            var10003 = 44;
            break;
         case 1:
            var10003 = 10;
            break;
         case 2:
            var10003 = 89;
            break;
         case 3:
            var10003 = 18;
            break;
         default:
            var10003 = 1;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
