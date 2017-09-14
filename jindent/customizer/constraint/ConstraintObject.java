package jindent.customizer.constraint;

import java.awt.Component;
import java.util.Vector;
import jindent.customizer.constraint.ActorSet;

public class ConstraintObject {
   private String a;
   private Vector b;
   private Vector c;
   private Component[] d;
   private boolean[] e;
   private boolean f;

   public ConstraintObject(String var1, Component[] var2) {
      this.a = var1;
      this.d = var2;
      this.f = true;
      int var3 = var2.length;
      this.e = new boolean[var3];
      this.b = new Vector();
      this.c = new Vector();
   }

   public String getName() {
      return this.a;
   }

   public void addActorSet(ActorSet var1, int var2) {
      this.b.add(var1);
      this.c.add(new Integer(var2));
   }

   public int countActorSets() {
      return this.b.size();
   }

   public ActorSet getActorSet(int var1) {
      return (ActorSet)this.b.elementAt(var1);
   }

   public int getRule(int var1) {
      return ((Integer)this.c.elementAt(var1)).intValue();
   }

   public void update() {
      boolean var1 = true;
      int var2 = this.countActorSets();

      for(int var3 = 0; var3 < var2; ++var3) {
         ActorSet var4 = this.getActorSet(var3);
         int var5 = this.getRule(var3);
         if(var5 == 2) {
            if(var4.isActive()) {
               var1 = false;
               break;
            }
         } else if(!var4.isActive()) {
            var1 = false;
            break;
         }
      }

      this.setJComponentsEnabled(var1);
   }

   private void setJComponentsEnabled(boolean var1) {
      if(!var1 && this.f) {
         this.backupOldValues();
         int var2 = this.d.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            this.d[var3].setEnabled(false);
         }
      }

      if(var1 && !this.f) {
         this.restoreOldValues();
      }

      this.f = var1;
   }

   private void backupOldValues() {
      int var1 = this.d.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         this.e[var2] = this.d[var2].isEnabled();
      }

   }

   private void restoreOldValues() {
      int var1 = this.d.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         this.d[var2].setEnabled(this.e[var2]);
      }

   }
}
